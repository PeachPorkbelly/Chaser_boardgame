import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class dice {
	
	/*
	 * �ֻ����� 5���� ���� �� �ִ�, �� 3�� ���� �� ������ �ι�°�� ����° ���� ������ ���ش� �ֻ����� ��� ���� �� �ִ�.
	 * 5���� ���� �̸��� �־�� �ٽ� ������ ������ ������ ������ �� �ִ�. -> �ټ����� �ֻ����� �����
	 * �ֻ��� ���� ����� �迭�� ����Ǹ� �ٽ� ������ �������� ������ ���� �ֻ����� ��ȣ�� �迭�� �ε����� �༭ �� ������
	 * �ؽøʿ��ٰ� �ֻ��� ��ȣ�� ���ڸ� ������ �׳� ����Ʈ�� ����ϴ°� �������� �ڵ��ϸ鼭 ����غ��߰���, �ؽø��� ���� ����Ҷ� for�� �Ƚᵵ �Ǿ ���� �� ����
	 * ���� �ֻ��� ����� ������� �������� �ʿ���(chase off, strait, even strait, four dice, ... ) �̰� �迭���� �ؽø��� ��� ����(Ű���� ��Ʈ������ �� �� �־)
	 * ���� �÷��̾ chase off�� �ִ´ٰ� �ϸ� => 50���� �հ迡 ����
	 * ���� �÷��̾ four dice�� �ִ´ٰ� �ϸ� => ��ü ���� ����
	 * ���� �÷��̾ six beans�� �ִ´ٰ� �ϸ� => 6�� ���� ��Ƽ� ���� ���� ��ɵ� �����ؾ���
	 */
	
	List<Integer> diceList = new ArrayList<Integer>();
	
	void rollAllDice() {
		for(int i=0; i<5; i++) {
			Supplier<Integer> dice = () -> (int)(Math.random()*6)+1;
			this.diceList.add(dice.get());
		}
		
		System.out.println(this.diceList);
		
		for(int i=0; i<5; i++) {
			System.out.println((i+1)+" �ֻ���: "+this.diceList.get(i));
		}
	}

	
}