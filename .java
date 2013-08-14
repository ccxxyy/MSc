import javax.swing.*;
import java.awt.*;
import java.util.Vector;

class Board extends JPanel {
	
	// two vector to store the information of two players
	private	Vector<Integer> redStateStore = new Vector<Integer>();
	private	Vector<Integer> blueStateStore = new Vector<Integer>();
	
	// get two vector from GUI class by set method
	public void set(Vector<Integer> a,Vector<Integer> b){
		redStateStore=a;
		blueStateStore=b;
	}
	
	// to repaint the board
	public void passBoard(){
		repaint();
	}
	
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		// print the outer square
		g.setColor(Color.black);
		g.drawLine(20, 10, 130, 10);
		g.drawLine(150, 10, 260, 10);
		
		g.drawLine(270, 20, 270, 130);
		g.drawLine(270, 150, 270, 260);
		
		g.drawLine(260, 270, 150, 270);
		g.drawLine(130, 270, 20, 270);
		
		g.drawLine(10, 260, 10, 150);
		g.drawLine(10, 130, 10, 20);
		
		// print middle square
		g.drawLine(70, 60, 130, 60);
		g.drawLine(150, 60, 210, 60);
		
		g.drawLine(220, 70, 220, 130);
		g.drawLine(220, 150, 220, 210);
		
		g.drawLine(210, 220, 150, 220);
		g.drawLine(130, 220, 70, 220);
		
		g.drawLine(60, 210, 60, 150);
		g.drawLine(60, 130, 60, 70);
		
		//print inner square
		g.drawLine(120, 110, 130, 110);
		g.drawLine(150, 110, 160, 110);
		
		g.drawLine(170, 120, 170, 130);
		g.drawLine(170, 150, 170, 160);
		
		g.drawLine(160, 170, 150, 170);
		g.drawLine(130, 170, 120, 170);
		
		g.drawLine(110, 160, 110, 150);
		g.drawLine(110, 130, 110, 120);
		
		// positions on outer square
		
		g.drawRect(0, 0, 20, 20);
		g.drawRect(130, 0, 20, 20);
		g.drawRect(260, 0, 20, 20);
		g.drawRect(260, 130, 20, 20);
		g.drawRect(260, 260, 20, 20);
		g.drawRect(130, 260, 20, 20);
		g.drawRect(0, 260, 20, 20);
		g.drawRect(0, 130, 20, 20);
		
		//position on middle square
		g.drawRect(50, 50, 20, 20);
		g.drawRect(130, 50, 20, 20);
		g.drawRect(210, 50, 20, 20);
		g.drawRect(210, 130, 20, 20);
		g.drawRect(210, 210, 20, 20);
		g.drawRect(130, 210, 20, 20);
		g.drawRect(50, 210, 20, 20);
		g.drawRect(50, 130, 20, 20);
		
		//position on inner square
		g.drawRect(100, 100, 20, 20);
		g.drawRect(130, 100, 20, 20);
		g.drawRect(160, 100, 20, 20);
		g.drawRect(160, 130, 20, 20);
		g.drawRect(160, 160, 20, 20);
		g.drawRect(130, 160, 20, 20);
		g.drawRect(100, 160, 20, 20);
		g.drawRect(100, 130, 20, 20);
		
		//lines connecting outer square to middle square
		g.drawLine(140, 20, 140, 50);
		g.drawLine(230, 140, 260, 140);
		g.drawLine(140, 230, 140, 260);
		g.drawLine(20, 140, 50, 140);
		
		//lines connecting middle square and inner square
		g.drawLine(140, 70, 140, 100);
		g.drawLine(180, 140, 210, 140);
		g.drawLine(140, 180, 140, 210);
		g.drawLine(70, 140, 100, 140);
		
		//check the state store to print the chess pieces on right position
		for(int i=0;i<redStateStore.size();i++){
			if(redStateStore.elementAt(i)==0){
				g.setColor(Color.red);
				g.fillOval(100, 100, 20, 20);
			}
			if(redStateStore.elementAt(i)==1){
				g.setColor(Color.red);
				g.fillOval(130, 100, 20, 20);	
			}
			if(redStateStore.elementAt(i)==2){
				g.setColor(Color.red);
				g.fillOval(160, 100, 20, 20);	
			}
			if(redStateStore.elementAt(i)==3){
				g.setColor(Color.red);
				g.fillOval(160, 130, 20, 20);	
			}
			if(redStateStore.elementAt(i)==4){
				g.setColor(Color.red);
				g.fillOval(160, 160, 20, 20);	
			}
			if(redStateStore.elementAt(i)==5){
				g.setColor(Color.red);
				g.fillOval(130, 160, 20, 20);	
			}
			if(redStateStore.elementAt(i)==6){
				g.setColor(Color.red);
				g.fillOval(100, 160, 20, 20);	
			}
			if(redStateStore.elementAt(i)==7){
				g.setColor(Color.red);
				g.fillOval(100, 130, 20, 20);	
			}
			if(redStateStore.elementAt(i)==8){
				g.setColor(Color.red);
				g.fillOval(50, 50, 20, 20);
			}
			if(redStateStore.elementAt(i)==9){
				g.setColor(Color.red);
				g.fillOval(130, 50, 20, 20);
			}
			if(redStateStore.elementAt(i)==10){
				g.setColor(Color.red);
				g.fillOval(210, 50, 20, 20);
			}
			if(redStateStore.elementAt(i)==11){
				g.setColor(Color.red);
				g.fillOval(210, 130, 20, 20);
			}
			if(redStateStore.elementAt(i)==12){
				g.setColor(Color.red);
				g.fillOval(210, 210, 20, 20);
			}
			if(redStateStore.elementAt(i)==13){
				g.setColor(Color.red);
				g.fillOval(130, 210, 20, 20);
			}
			if(redStateStore.elementAt(i)==14){
				g.setColor(Color.red);
				g.fillOval(50, 210, 20, 20);
			}
			if(redStateStore.elementAt(i)==15){
				g.setColor(Color.red);
				g.fillOval(50, 130, 20, 20);
			}
			if(redStateStore.elementAt(i)==16){
				g.setColor(Color.red);
				g.fillOval(0, 0, 20, 20);
			}
			if(redStateStore.elementAt(i)==17){
				g.setColor(Color.red);
				g.fillOval(130, 0, 20, 20);
			}
			if(redStateStore.elementAt(i)==18){
				g.setColor(Color.red);
				g.fillOval(260, 0, 20, 20);
			}
			if(redStateStore.elementAt(i)==19){
				g.setColor(Color.red);
				g.fillOval(260, 130, 20, 20);
			}
			if(redStateStore.elementAt(i)==20){
				g.setColor(Color.red);
				g.fillOval(260, 260, 20, 20);
			}
			if(redStateStore.elementAt(i)==21){
				g.setColor(Color.red);
				g.fillOval(130, 260, 20, 20);
			}
			if(redStateStore.elementAt(i)==22){
				g.setColor(Color.red);
				g.fillOval(0, 260, 20, 20);
			}
			if(redStateStore.elementAt(i)==23){
				g.setColor(Color.red);
				g.fillOval(0, 130, 20, 20);
			}
		}
		// check the blue state store
		for(int i=0;i<blueStateStore.size();i++){
			if(blueStateStore.elementAt(i)==0){
				g.setColor(Color.blue);
				g.fillOval(100, 100, 20, 20);
			}
			if(blueStateStore.elementAt(i)==1){
				g.setColor(Color.blue);
				g.fillOval(130, 100, 20, 20);	
			}
			if(blueStateStore.elementAt(i)==2){
				g.setColor(Color.blue);
				g.fillOval(160, 100, 20, 20);	
			}
			if(blueStateStore.elementAt(i)==3){
				g.setColor(Color.blue);
				g.fillOval(160, 130, 20, 20);	
			}
			if(blueStateStore.elementAt(i)==4){
				g.setColor(Color.blue);
				g.fillOval(160, 160, 20, 20);	
			}
			if(blueStateStore.elementAt(i)==5){
				g.setColor(Color.blue);
				g.fillOval(130, 160, 20, 20);	
			}
			if(blueStateStore.elementAt(i)==6){
				g.setColor(Color.blue);
				g.fillOval(100, 160, 20, 20);	
			}
			if(blueStateStore.elementAt(i)==7){
				g.setColor(Color.blue);
				g.fillOval(100, 130, 20, 20);	
			}
			if(blueStateStore.elementAt(i)==8){
				g.setColor(Color.blue);
				g.fillOval(50, 50, 20, 20);
			}
			if(blueStateStore.elementAt(i)==9){
				g.setColor(Color.blue);
				g.fillOval(130, 50, 20, 20);
			}
			if(blueStateStore.elementAt(i)==10){
				g.setColor(Color.blue);
				g.fillOval(210, 50, 20, 20);
			}
			if(blueStateStore.elementAt(i)==11){
				g.setColor(Color.blue);
				g.fillOval(210, 130, 20, 20);
			}
			if(blueStateStore.elementAt(i)==12){
				g.setColor(Color.blue);
				g.fillOval(210, 210, 20, 20);
			}
			if(blueStateStore.elementAt(i)==13){
				g.setColor(Color.blue);
				g.fillOval(130, 210, 20, 20);
			}
			if(blueStateStore.elementAt(i)==14){
				g.setColor(Color.blue);
				g.fillOval(50, 210, 20, 20);
			}
			if(blueStateStore.elementAt(i)==15){
				g.setColor(Color.blue);
				g.fillOval(50, 130, 20, 20);
			}
			if(blueStateStore.elementAt(i)==16){
				g.setColor(Color.blue);
				g.fillOval(0, 0, 20, 20);
			}
			if(blueStateStore.elementAt(i)==17){
				g.setColor(Color.blue);
				g.fillOval(130, 0, 20, 20);
			}
			if(blueStateStore.elementAt(i)==18){
				g.setColor(Color.blue);
				g.fillOval(260, 0, 20, 20);
			}
			if(blueStateStore.elementAt(i)==19){
				g.setColor(Color.blue);
				g.fillOval(260, 130, 20, 20);
			}
			if(blueStateStore.elementAt(i)==20){
				g.setColor(Color.blue);
				g.fillOval(260, 260, 20, 20);
			}
			if(blueStateStore.elementAt(i)==21){
				g.setColor(Color.blue);
				g.fillOval(130, 260, 20, 20);
			}
			if(blueStateStore.elementAt(i)==22){
				g.setColor(Color.blue);
				g.fillOval(0, 260, 20, 20);
			}
			if(blueStateStore.elementAt(i)==23){
				g.setColor(Color.blue);
				g.fillOval(0, 130, 20, 20);
			}
		}
	}
	
}


class BoardOperation {

	private	Vector<Integer> redStateStore = new Vector<Integer>();
	private	Vector<Integer> blueStateStore = new Vector<Integer>();
	int countRed=0;
	int countBlue=0;
	int red=0;
	int blue=0;
	int selectedCounter;
	int count1,count2,count3,count4,count5,count6,count7,count8,count9,count10,count11,count12,
	count13,count14,count15,count16=0;
	// method used in step3. to set the selected counter
	public void chooseCounter(int p){
		selectedCounter=p;
	}
	// used in step3, return the selected counter
	public int getChooseCounter(){
		return selectedCounter;
	}
	// return the red vector
	public Vector<Integer> getRedVector(){
		return redStateStore;
	}
	// return the blue vector
	public Vector<Integer> getBlueVector(){
		return blueStateStore;
	}
	// add the new position to vector
	public void addStateRed(int p){
		redStateStore.addElement(p);
	}
	
	public void addStateBlue(int p){
		blueStateStore.addElement(p);
	}
	
	public boolean detectSelectedRedCounter(int p){
		for(int i=0;i<redStateStore.size();i++){
			if(p==redStateStore.elementAt(i)){
				red++;
			}
		}
		if(red!=1){
			red=0;
			return false;
		}
		else{
			red=0;
			return true;
		}
	}
	// to check the selected counter, if it is availible to select
	public boolean detectSelectedBlueCounter(int p){
		for(int i=0;i<blueStateStore.size();i++){
			if(p==blueStateStore.elementAt(i)){
				blue++;
			}
		}
		if(blue!=1){
			blue=0;
			return false;
		}
		else{
			blue=0;
			return true;
		}
	}
	
	
	// to check if the movement is legal. counter only allowed to move to the position which is next to it's original position
	public boolean detectIllegalMove(int p, int q){
		
		for(int i=0;i<redStateStore.size();i++){
			if(q==redStateStore.elementAt(i)){
				return false;
			}
		}
		for(int j=0;j<blueStateStore.size();j++){
			if(q==blueStateStore.elementAt(j)){
				return false;
			}
		}
		
		if(q==p+1||q==p-1){
			return true;
		}
		if(p==0&&q==7){
			return true;
		}
		if(p==7&&q==0){
			return true;
		}
		if(p==8&&q==15){
			return true;
		}
		if(p==15&&q==8){
			return true;
		}
		if(p==16&&q==23){
			return true;
		}
		if(p==23&&q==16){
			return true;
		}
		if(p==1&&q==9){
			return true;
		}
		if(p==3&&q==11){
			return true;
		}
		if(p==5&&q==13){
			return true;
		}
		if(p==7&&q==15){
			return true;
		}
		if(p==17&&q==9){
			return true;
		}
		if(p==19&&q==11){
			return true;
		}
		if(p==21&&q==13){
			return true;
		}
		if(p==23&&q==15){
			return true;
		}
		if(p==9){
			if(q==1||q==17){
				return true;
			}
		}
		if(p==11){
			if(q==3||q==19){
				return true;
			}
		}
		if(p==13){
			if(q==5||q==21){
				return true;
			}
		}
		if(p==15){
			if(q==7||q==23){
				return true;
			}
		}
		return false;
	}
	
	// to check if the remove is legal
	public boolean checkRedRemove(int p){
		for(int i=0;i<redStateStore.size();i++){
			if(p==redStateStore.elementAt(i)){
				return false;
			}
		}
		return true;
	}
	
	public boolean checkBlueRemove(int p){
		for(int i=0;i<blueStateStore.size();i++){
			if(p==blueStateStore.elementAt(i)){
				return false;
			}
		}
		return true;
	}

	// remove the counter, and reset the count variable
	public void removeStateRed(int p){
		redStateStore.removeElement(p);
		if(count1!=0){
			if(p==1||p==0||p==2){
				count1=0;
			}
		}
		if(count2!=0){
			if(p==2||p==3||p==4){
				count2=0;
			}
		}
		if(count3!=0){
			if(p==4||p==5||p==6){
				count3=0;
			}
		}
		if(count4!=0){
			if(p==0||p==7||p==6){
				count4=0;
			}
		}
		if(count5!=0){
			if(p==8||p==9||p==10){
				count5=0;
			}
		}
		if(count6!=0){
			if(p==1||p==9||p==7){
				count6=0;
			}
		}
		if(count7!=0){
			if(p==10||p==11||p==12){
				count7=0;
			}
		}
		if(count8!=0){
			if(p==3||p==11||p==19){
				count8=0;
			}
		}
		if(count9!=0){
			if(p==12||p==13||p==14){
				count9=0;
			}
		}
		if(count10!=0){
			if(p==5||p==13||p==21){
				count10=0;
			}
		}
		if(count11!=0){
			if(p==14||p==15||p==8){
				count11=0;
			}
		}
		if(count12!=0){
			if(p==7||p==5||p==13){
				count12=0;
			}
		}
		if(count13!=0){
			if(p==16||p==17||p==18){
				count13=0;
			}
		}
		if(count14!=0){
			if(p==18||p==19||p==20){
				count14=0;
			}
		}
		if(count15!=0){
			if(p==20||p==21||p==23){
				count15=0;
			}
		}
		if(count16!=0){
			if(p==16||p==22||p==23){
				count16=0;
			}
		}
		System.out.println(count1);
	}
	
	public void removeStateBlue(int p){
		blueStateStore.removeElement(p);
		if(count1!=0){
			if(p==1||p==0||p==2){
				count1=0;
			}
		}
		if(count2!=0){
			if(p==2||p==3||p==4){
				count2=0;
			}
		}
		if(count3!=0){
			if(p==4||p==5||p==6){
				count3=0;
			}
		}
		if(count4!=0){
			if(p==0||p==7||p==6){
				count4=0;
			}
		}
		if(count5!=0){
			if(p==8||p==9||p==10){
				count5=0;
			}
		}
		if(count6!=0){
			if(p==1||p==9||p==7){
				count6=0;
			}
		}
		if(count7!=0){
			if(p==10||p==11||p==12){
				count7=0;
			}
		}
		if(count8!=0){
			if(p==3||p==11||p==19){
				count8=0;
			}
		}
		if(count9!=0){
			if(p==12||p==13||p==14){
				count9=0;
			}
		}
		if(count10!=0){
			if(p==5||p==13||p==21){
				count10=0;
			}
		}
		if(count11!=0){
			if(p==14||p==15||p==8){
				count11=0;
			}
		}
		if(count12!=0){
			if(p==7||p==5||p==13){
				count12=0;
			}
		}
		if(count13!=0){
			if(p==16||p==17||p==18){
				count13=0;
			}
		}
		if(count14!=0){
			if(p==18||p==19||p==20){
				count14=0;
			}
		}
		if(count15!=0){
			if(p==20||p==21||p==23){
				count15=0;
			}
		}
		if(count16!=0){
			if(p==16||p==22||p==23){
				count16=0;
			}
		}
	}
	
	// to check if the placement is legal
	public boolean checkLegal(int p){
		for(int i=0; i<redStateStore.size();i++){
			if(p==redStateStore.elementAt(i)){
				return false;
			}
		}
		for(int j=0; j<blueStateStore.size(); j++){
			if(p==blueStateStore.elementAt(j)){
				return false;
			}
		}
		if(p==1000){
			return false;
		}
		return true;
	}
	
	//method to check the mill 
	public boolean checkMill(Vector<Integer> a){
//		System.out.println("red is " +redStateStore);
//		System.out.println("blue is "+blueStateStore);
//		System.out.println("a is "+ a);
		for(int i=0; i<a.size();i++){
			if(a.elementAt(i)==1){
				//System.out.println("click 1");
				for(int j=0; j<a.size();j++){
					if(a.elementAt(j)==0){
						count1++;
						//System.out.println("element1 "+count1);
					}
					if(a.elementAt(j)==2){
						count1++;
						//System.out.println("element2 " +count1);
					}
				}
				if(count1==2){
					return true;
				}
//				if(count1!=0 && count1!=2 && count1%2==0){
//					return false;
//				}
				if(count1%2!=0){
					count1=0;
//					return false;
				}
			}
			if(a.elementAt(i)==3){
				for(int j=0; j<a.size();j++){
					if(a.elementAt(j)==2||a.elementAt(j)==4){
						count2++;
					}
				}
				if(count2==2){
					return true;
				}
//				if(count2!=0 && count2!=2 && count2%2==0){
//					return false;
//				}
				if(count2%2!=0){
					count2=0;
//					return false;
				}
			}
			if(a.elementAt(i)==5){
				for(int j=0; j<a.size();j++){
					if(a.elementAt(j)==4||a.elementAt(j)==6){
						count3++;
					}
				}
				if(count3==2){
					return true;
				}
//				if(count3!=0 && count3!=2 && count3%2==0){
//					return false;
//				}
				if(count3%2!=0){
					count3=0;
//					return false;
				}
			}
			if(a.elementAt(i)==7){
				for(int j=0; j<a.size();j++){
					if(a.elementAt(j)==0||a.elementAt(j)==6){
						count4++;
					}
				}
				if(count4==2){
					return true;
				}
//				if(count4!=0 && count4!=2 && count4%2==0){
//					return false;
//				}
				if(count4%2!=0){
					count4=0;
//					return false;
				}
			}
			if(a.elementAt(i)==9){
				for(int j=0; j<a.size();j++){
					if(a.elementAt(j)==8||a.elementAt(j)==10){
						count5++;
					}
					if(a.elementAt(j)==1||a.elementAt(j)==17){
						count6++;
					}
				}
				if(count5==2||count6==2){
					return true;
				}
//				if(count5!=0 && count5!=2 && count5%2==0){
//					return false;
//				}
//				if(count6!=0 && count6!=2 && count6%2==0){
//					return false;
//				}
				if(count5%2!=0){
					count5=0;
			
//					return false;
				}
				if(count6%2!=0){
					count6=0;
				}
			}
			if(a.elementAt(i)==11){
				for(int j=0; j<a.size();j++){
					if(a.elementAt(j)==10||a.elementAt(j)==12){
						count7++;
					}
					if(a.elementAt(j)==3||a.elementAt(j)==19){
						count8++;
					}
				}
				if(count7==2||count8==2){
					return true;
				}
//				if(count7!=0 && count7!=2 && count7%2==0){
//					return false;
//				}
//				if(count8!=0 && count8!=2 && count8%2==0){
//					return false;
//				}
				if(count7%2!=0){
					count7=0;
			
//					return false;
				}
				if(count8%2!=0){
					count8=0;
				}
			}
			if(a.elementAt(i)==13){
				for(int j=0; j<a.size();j++){
					if(a.elementAt(j)==14||a.elementAt(j)==12){
						count9++;
					}
					if(a.elementAt(j)==5||a.elementAt(j)==21){
						count10++;
					}
				}
				if(count9==2||count10==2){
					return true;
				}
//				if(count9!=0 && count9!=2 && count9%2==0){
//					return false;
//				}
//				if(count10!=0 && count10!=2 && count10%2==0){
//					return false;
//				}
				if(count9%2!=0){
					count9=0;
			
//					return false;
				}
				if(count10%2!=0){
					count10=0;
				}
			}
			if(a.elementAt(i)==15){
				for(int j=0; j<a.size();j++){
					if(a.elementAt(j)==14||a.elementAt(j)==8){
						count11++;
					}
					if(a.elementAt(j)==7||a.elementAt(j)==23){
						count12++;
					}
				}
				if(count11==2||count12==2){
					return true;
				}
//				if(count11!=0 && count11!=2 && count11%2==0){
//					return false;
//				}
//				if(count12!=0 && count12!=2 && count12%2==0){
//					return false;
//				}
				if(count11%2!=0){
					count11=0;
			
//					return false;
				}
				if(count12%2!=0){
					count12=0;
				}
			}
			if(a.elementAt(i)==17){
				for(int j=0; j<a.size();j++){
					if(a.elementAt(j)==16||a.elementAt(j)==18){
						count13++;
					}
				}
				if(count13==2){
					return true;
				}
//				if(count13!=0 && count13!=2 && count13%2==0){
//					return false;
//				}
				if(count13%2!=0){
					count13=0;
//					return false;
				}
			}
			if(a.elementAt(i)==19){
				for(int j=0; j<a.size();j++){
					if(a.elementAt(j)==18||a.elementAt(j)==20){
						count14++;
					}
				}
				if(count14==2){
					return true;
				}
//				if(count14!=0 && count14!=2 && count14%2==0){
//					return false;
//				}
				if(count14%2!=0){
					count14=0;
//					return false;
				}
			}
			if(a.elementAt(i)==21){
				for(int j=0; j<a.size();j++){
					if(a.elementAt(j)==20||a.elementAt(j)==22){
						count15++;
					}
				}
				if(count15==2){
					return true;
				}
//				if(count15!=0 && count15!=2 && count15%2==0){
//					return false;
//				}
				if(count15%2!=0){
					count15=0;
//					return false;
				}
			}
			if(a.elementAt(i)==23){
				for(int j=0; j<a.size();j++){
					if(a.elementAt(j)==16||a.elementAt(j)==22){
						count16++;
					}
				}
				if(count16==2){
					return true;
				}
//				if(count16!=0 && count16!=2 && count16%2==0){
//					return false;
//				}
				if(count16%2!=0){
					count16=0;
//					return false;
				}
			}
		}
		return false;
	}
	
}
