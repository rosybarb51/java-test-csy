package PortFolioQuestion5;

public abstract class GameObject {
	protected int distance; // 한번 이동 거리
	protected int x; // Bear와 Fish의 현재 위치
	protected int y; // (화면 맵 상의 거리)
	
//	초기 위치와 이동거리 설정
	public GameObject(int startX, int startY, int distance) {
		this.x = startX;
		this.y = startY;
		this.distance = distance;
	}
	
//	현재 맵 상의 가로 위치
	public int getX() {
		return x;
	}
	
//	현재 맵 상의 세로 위치
	public int getY() {
		return y;
	}
	
//	Bear와 Fish가 충돌하는지 확인하는 메서드
//	충돌 시 true, 아니면 false
//	Bear를 기준으로 매개변수를 Fish로 받음
	public boolean collide(GameObject p) {
//		this는 Bear를 의미, p는 Fish를 의미
		if (this.x == p.getX() && this.y == p.getY()) {
			return true;
		}
		else {
			return false;
		}
	}
	
//	이동한 후의 새로운 위치로 x, y 변경
	protected abstract void move();
//	객체의 모양을 나타내는 문자 리턴
	protected abstract char getShape();
}
