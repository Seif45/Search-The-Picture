package eg.edu.alexu.csd.datastructure.iceHockey.cs34;

import java.awt.Point;

public class PlayersFinder implements IPlayersFinder{
 	
	public void search (String[] photo ,int team ,Element current ,int x , int y) {
				
		if (current.up) {
			current.up = current.down = current.left = current.right = false;
			if (y > 0 && photo[y-1].charAt(x) == team+'0') {
				current.up = true;
				current.x = x;
				current.y = y-1;
				if (current.y < current.y1) {
					current.y1 = current.y;
				}
				current.counter ++;
				photo[current.y] = photo[current.y].substring(0,current.x) + '*' + photo[current.y].substring(current.x+1);
				search (photo , team , current, current.x , current.y);
			}
			if (x < photo[y].length()-1 && photo[y].charAt(x+1) == team+'0') {
				current.right = true;
				current.x = x + 1;
				current.y = y;
				if (current.x > current.x2) {
					current.x2 = current.x;
				}
				current.counter ++;
				photo[current.y] = photo[current.y].substring(0,current.x) + '*' + photo[current.y].substring(current.x+1);
				search (photo , team , current,current.x,current.y);
			}
			if (x > 0 && photo[y].charAt(x-1) == team+'0') {
				current.left = true;
				current.y = y;
				current.x = x-1;
				if (current.x < current.x1) {
					current.x1 = current.x;
				}
				current.counter ++;
				photo[current.y] = photo[current.y].substring(0,current.x) + '*' + photo[current.y].substring(current.x+1);
				search (photo , team , current,current.x,current.y);
			}
		}
		if (current.down) {
			current.up = current.down = current.left = current.right = false;
			if (y < photo.length-1 && photo[y+1].charAt(x) == team+'0') {
				current.down = true;
				current.x = x;
				current.y = y+1;
				if (current.y > current.y2) {
					current.y2 = current.y;
				}
				current.counter ++;
				photo[current.y] = photo[current.y].substring(0,current.x) + '*' + photo[current.y].substring(current.x+1);
				search (photo , team , current,current.x,current.y);			
			}
			if (x < photo[y].length()-1 && photo[y].charAt(x+1) == team+'0') {
				current.right = true;
				current.y = y;
				current.x = x+1;
				if (current.x > current.x2) {
					current.x2 = current.x;
				}
				current.counter ++;
				photo[current.y] = photo[current.y].substring(0,current.x) + '*' + photo[current.y].substring(current.x+1);
				search (photo , team , current,current.x,current.y);		
			}
			if (x > 0 && photo[y].charAt(x-1) == team+'0') {
				current.left = true;
				current.y = y;
				current.x =x - 1;
				if (current.x < current.x1) {
					current.x1 = current.x;
				}
				current.counter ++;
				photo[current.y] = photo[current.y].substring(0,current.x) + '*' + photo[current.y].substring(current.x+1);
				search (photo , team , current,current.x,current.y);			
			}
		}
		if (current.left) {
			current.up = current.down = current.left = current.right = false;
			if (y > 0 && photo[y-1].charAt(x) == team+'0') {
				current.up = true;
				current.x = x;
				current.y = y-1;
				if (current.y < current.y1) {
					current.y1 = current.y;
				}
				current.counter ++;
				photo[current.y] = photo[current.y].substring(0,current.x) + '*' + photo[current.y].substring(current.x+1);
				search (photo , team , current,current.x,current.y);	
			}
			if (y < photo.length-1 && photo[y+1].charAt(x) == team+'0') {
				current.down = true;
				current.x = x;
				current.y = y + 1;
				if (current.y > current.y2) {
					current.y2 = current.y;
				}
				current.counter ++;
				photo[current.y] = photo[current.y].substring(0,current.x) + '*' + photo[current.y].substring(current.x+1);
				search (photo , team , current,current.x,current.y);		
			}
			if (x > 0 && photo[y].charAt(x-1) == team+'0') {
				current.left = true;
				current.y = y;
				current.x = x - 1;
				if (current.x < current.x1) {
					current.x1 = current.x;
				}
				current.counter ++;
				photo[current.y] = photo[current.y].substring(0,current.x) + '*' + photo[current.y].substring(current.x+1);
				search (photo , team , current,current.x,current.y);	
			}
		}
		if (current.right) {
			current.up = current.down = current.left = current.right = false;
			if (y > 0 && photo[y-1].charAt(x) == team+'0') {
				current.up = true;
				current.x = x;
				current.y = y - 1;
				if (current.y < current.y1) {
					current.y1 = current.y;
				}
				current.counter ++;
				photo[current.y] = photo[current.y].substring(0,current.x) + '*' + photo[current.y].substring(current.x+1);
				search (photo , team , current, current.x , current.y);	
			}
			if (y < photo.length-1 && photo[y+1].charAt(x) == team+'0') {
				current.down = true;
				current.x = x;
				current.y = y + 1;
				if (current.y > current.y2) {
					current.y2 = current.y;
				}
				current.counter ++;
				photo[current.y] = photo[current.y].substring(0,current.x) + '*' + photo[current.y].substring(current.x+1);
				search (photo , team , current, current.x, current.y);		
			}
			if (x < photo[y].length()-1 && photo[y].charAt(x+1) == team+'0') {
				current.right = true;
				current.y = y;
				current.x = x + 1;
				if (current.x > current.x2) {
					current.x2 = current.x;
				}
				current.counter ++;
				photo[current.y] = photo[current.y].substring(0,current.x) + '*' + photo[current.y].substring(current.x+1);
				search (photo , team , current, current.x, current.y);		
			}
		}
	}
	
	@Override
	public Point[] findPlayers(String[] photo, int team, int threshold) {
		
		int MAX;
		if (photo.length == 0) {
			MAX = 0;
		}
		else {
			MAX = (photo.length*photo[0].length()*4/threshold)+1;
		}
		Point[] result = new Point[MAX];
		Point temp = new Point();
		int i,j, l = 0 , k ;
		
		Element current = new Element (0 , 0 , 0 , 0 , 0 , 0 , 0 , false , false , false , false);
		
		for (i = 0 ; i < photo.length ; i++) {
			for ( j = 0 ; j < photo[0].length() ; j ++) {
				if (photo[i].charAt(j) == team+'0') {
					photo[i] = photo[i].substring(0,j) + '*' + photo[i].substring(j+1);
					current.counter ++;
					current.x1 = current.x2 = j;
					current.y1 = current.y2 = i;
					if (i < photo.length-1 && photo[i+1].charAt(j) == team+'0') {
						current.down = true;
						current.x = j;
						current.y = i+1;
						current.y2 = i+1;
						current.counter ++;
						photo[current.y] = photo[current.y].substring(0,current.x) + '*' + photo[current.y].substring(current.x+1);
						search(photo , team , current,current.x,current.y);
					}
					if (j < photo[i].length()-1 && photo[i].charAt(j+1) == team+'0') {
						current.right = true;
						current.x = j+1;
						current.y = i;
						current.x2 = j+1;
						current.counter ++;
						photo[current.y] = photo[current.y].substring(0,current.x) + '*' + photo[current.y].substring(current.x+1);
						search(photo , team , current,current.x,current.y);
					}
				}
				if (current.counter * 4 >= threshold) {
					result[l] = new Point();
					result[l].x = current.x1+current.x2+1;
					result[l].y = current.y1+current.y2+1;
					for (k = 0 ; k < l ; k++) {
						if (result[l].x < result[k].x) {
							temp.x = result[k].x; temp.y = result[k].y;
							result[k].x = result[l].x; result[k].y = result[l].y;
							result[l].x = temp.x; result[l].y = temp.y;
						}
						else if (result[l].x == result[k].x) {
							if (result[l].y < result[k].y) {
								temp.x = result[k].x; temp.y = result[k].y;
								result[k].x = result[l].x; result[k].y = result[l].y;
								result[l].x = temp.x; result[l].y = temp.y;
							}
						}
					}	
					l++;
				}
				current.counter = 0;
			}
		}
		Point[] finalResult = new Point[l];
		for (j = 0 ; j < l ; j++) {
			finalResult[j] = new Point(result[j].x,result[j].y);
		}
		return finalResult;
	}
}


