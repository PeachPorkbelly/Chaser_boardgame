import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class dice {
	
	/*
	 * 주사위는 5개를 던질 수 있다, 총 3번 던질 수 있으며 두번째와 세번째 던질 때에는 원해는 주사위만 골라서 던질 수 있다.
	 * 5개에 각각 이름을 주어야 다시 던질때 무엇을 던질지 선택할 수 있다. -> 다섯개의 주사위를 만든다
	 * 주사위 던진 결과는 배열에 저장되며 다시 던지고 싶을때는 던지고 싶은 주사위의 번호를 배열의 인덱스로 줘서 값 재정의
	 * 해시맵에다가 주사위 번호와 숫자를 넣을지 그냥 리스트를 사용하는게 좋은지는 코딩하면서 고민해봐야겠음, 해시맵을 쓰면 출력할때 for문 안써도 되어서 편할 것 같음
	 * 나온 주사위 결과를 집어넣을 게임판이 필요함(chase off, strait, even strait, four dice, ... ) 이건 배열보다 해시맵을 써야 편리함(키값을 스트링으로 줄 수 있어서)
	 * 만약 플레이어가 chase off에 넣는다고 하면 => 50점을 합계에 더함
	 * 만약 플레이어가 four dice에 넣는다고 하면 => 전체 합을 더함
	 * 만약 플레이어가 six beans에 넣는다고 하면 => 6인 값만 모아서 더함 등의 기능도 수행해야함
	 */
	
	List<Integer> diceList = new ArrayList<Integer>();
	
	void rollAllDice() {
		for(int i=0; i<5; i++) {
			Supplier<Integer> dice = () -> (int)(Math.random()*6)+1;
			this.diceList.add(dice.get());
		}
		
		System.out.println(this.diceList);
		
		for(int i=0; i<5; i++) {
			System.out.println((i+1)+" 주사위: "+this.diceList.get(i));
		}
	}

	
}