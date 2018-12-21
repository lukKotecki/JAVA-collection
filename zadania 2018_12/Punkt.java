class Punkt{
	static int ile = 0;
	int x;
	int y;
	
	Punkt(){ile++;};
	Punkt(int _x, int _y){
		x=_x;
		y=_y;
		ile++;
	};
	
	void ustawPunkt(int _x,int _y){
		this.x=_x;
		this.y=_y;
	}
}