package com.gmail.project_211029;

public class DescriptiveStatistic {

	public static void main(String[] args) {
		//샘플 데이터 생성
		int [] data = {95,80,92,87,93};
		
		//데이터의 합계 구하기
		//합계를 저장할 변수를 생성하고 합계를 구하기 이전의 값으로 초기화
		//데이터를 순회하면서 데이터의 합계를 저장할 변수에 저장.
		
		int data_sum = 0;
		int len = data.length;
		
		/*for(int i=0; i<len; i++) {
			data_sum = data_sum + data[i];
		}*/
		
		for(int ims1 : data) {
			data_sum = data_sum + ims1;
		}
		
		System.out.println(data_sum);
		
		/*
		 * 평균, 중앙값 = 데이터를 대표하는 값
		 * 평균을 계산할 때 주의할점 - 나누는 수가 0인지 확인, 정수를 0으로 나누면 에러. 
		 *                      실수를 0으로 나누면 infinity 같은 값이 나옴
		 * 정수 / 정수 = 정수 */
		
		System.out.println(10.0/0);
		
		//평균을 소수 첫째자리까지 구하기
		if(data.length == 0) {
			System.out.println("데이터가 없음");
		}else {
			//데이터 중 1개를 실수로 변환해야만 실수로 결과를 만들 수 있음
			double mean = data_sum / (double)data.length;
			System.out.println("평균 : "+ mean);
		}
		
		//이후에 최대값과 최소값 구하는 것을 하고 나면 최대값과 최소값을 제외한 데이터의 평균을 구하시오.
		/*
		 * 최대값을 구할때는 최대값을 저장할 변수를 만들어서 데이터가 가질 수 있는 범위 중 
		 * 가장 작은 값이나 첫번째 데이터의 값으로 초기화 한다. 
		 * 0으로 초기화 하면 나머지 값이 음수면 문제가 발생할 수 있음.
		 * 모든 데이터를 순회하면서 최대값보다 큰 데이터가 있으면 최대값을 그 값으로 변경한다
		 */
		
		//데이터는 0 ~ 100의 범위를 갖는다고 가정.
		int max_data = 0;
		for(int imsi : data) {
			if(max_data < imsi) {
			   max_data = imsi;	
			}
		}
		
		System.out.println("가장 큰 값은: " + max_data);
		
		/*
		 * 최소값을 구할때는 최소값을 저장할 변수를 만들어서 데이터가 가질 수 있는 범위 중 
		 * 가장 작은 값이나 첫번째 데이터의 값으로 초기화 한다. 
		 * 0으로 초기화 하면 나머지 값이 음수면 문제가 발생할 수 있음.
		 * 모든 데이터를 순회하면서 최소값보다 작은 데이터가 있으면 최소값을 그 값으로 변경한다
		 */
		
		//데이터는 0 ~ 100의 범위를 갖는다고 가정.
		int min_data = 100;
		for(int imsi : data) {
			if(min_data > imsi) {
				min_data = imsi;	
			}
		}
		
		System.out.println("가장 작은 값은: " + min_data);
		
		//가장 작은 값이 몇 번째에 있는지
		min_data = 100;
		int min_idx = -1;
		
		for(int i=0; i<len; i++) {
			if(min_data > data[i]) {
				min_data = data[i];
				min_idx = i;
			}
		}
		
		System.out.println("가장 작은 위치는: " + min_idx);
		
		
		//조건에 맞는 데이터의 개수 찾기
		//데이터 개수를 저장할 변수를 만들어서 개수를 세기 이전의 값으로 초기화 - 대부분 0
		//모든 데이터를 순회하면서 데이터가 조건에 맞는지 확인해서 조건에 맞으면 개수 1증가.
		
		int cnt = 0;
		
		for(int temp : data) {
			if(temp > 90) {
				cnt = cnt + 1;
			}
		}
		
		System.out.println("90이 넘는 데이터 개수: "+ cnt);
		
	}

}
