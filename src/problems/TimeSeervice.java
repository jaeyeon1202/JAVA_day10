package problems;

import java.text.SimpleDateFormat;

public class TimeSeervice {

	TimeDTO t = new TimeDTO();
	String sTime, eTime;
	long time;
	SimpleDateFormat d = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
	
	public void startTime() {//시작시간
		time = System.currentTimeMillis();
		sTime=d.format(time);
		System.out.println(sTime);
		t.setStart(time);
	}
	
	public void endTime() {//종료시간
		time=System.currentTimeMillis();
		eTime = d.format(time);
		System.out.println(eTime);
		t.setEnd(time);
	}
	
	public void totalTime() {//이용시간
		time = t.getEnd()-t.getStart();
		System.out.println(time/1000+"초 사용");
		if((time/1000)>=60) 
			System.out.println((time/1000)/60+"분"+(time/1000)%60+"초");
		else if((time/1000)>=360)
			System.out.println((time/1000)/60/60+"시간"+((time/1000)/60/60)%60+"분"
		+(((time/1000)/60/60)/60)%60+"초");
		
	}
	
	
}//class
