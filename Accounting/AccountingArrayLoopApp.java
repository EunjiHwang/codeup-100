
public class AccountingArrayLoopApp {
	public static void main(String[] args) {
		double valueOfSupply = Double.parseDouble(args[0]); // ���ް�
		double vatRate = 0.1; // �ΰ���ġ��
		double expenseRate = 0.3; // ����
		double vat = valueOfSupply*vatRate; // �ΰ��� = ���ް� * �ΰ���ġ��
		double total = valueOfSupply + vat; // �հ� = ���ް� + �ΰ���
		double expense = valueOfSupply*expenseRate; // ��� = ���ް� * ����
		double income = valueOfSupply - expense; // ���� = ���ް� - ���
		
		
		
		System.out.println("Value of supply : "+ valueOfSupply); // ���ް�
		System.out.println("VAT : "+ vat); // �ΰ���ġ��
		System.out.println("Total : "+ total); // �հ�
		System.out.println("Expense : "+ expense); // ���
		System.out.println("Income : "+ income); // ����
		
		double[] dividendRates = new double[3];
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;
		
		int i = 0;
		while(i < dividendRates.length) {
		System.out.println("Dividend : "+ (income*dividendRates[i])); // ���
		i = i + 1;
		}
	}

}