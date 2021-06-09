package com.day;

import java.lang.reflect.Array;
import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import javax.xml.crypto.Data;

public class day_04_19 {
	static Set<String> test_set;

	public static void main(String[] args) {

		// static 메모리 할당을 최우선적으로 받는다.

		HashMap<String, PhoneData> name_list = new HashMap<String, PhoneData>();
		ArrayList<PhoneData> list = new ArrayList<PhoneData>();
		ArrayList<String> list2 = new ArrayList<String>();

		// DTO
		// DAO => DTO는 DAO안에서 만든다. DTO는 DAO에 의존적이다.

		// 주제 인물
		// 제품 핸드폰(판매자) => 이름, 주소, 주민번호, 핸드폰번호, 이메일, 통신사, 요금제, 단말기시리얼
		// 의존 객체
		// key값을 가나다 순으로 정렬합시다.

		for (int i = 0; i < 5; i++) {
			PhoneData data = new PhoneData(i);
			name_list.put(data.s.name, data);
			list.add(data);
//			System.out.println(data.s.name);
		}
//		Object[] coll = name_list.keySet().toArray();
//		for (int i = 0; i < coll.length; i++) {
//			System.out.println(coll[i]);
//		}

//		System.out.println(name_list.size());
//		System.out.println(name_list.get("김수현").addr);
		System.out.println("=========");
		test_set = name_list.keySet();

//		ArrayList<String> list_string = (ArrayList<String>) name_list.keySet();
//		ArrayList<String> list_string = new ArrayList<String>(name_list.keySet());
//		list2.addAll(name_list.keySet());
//		System.out.println(array[0]);
		for (String string : test_set) {
//			System.out.println(string);
//			System.out.println(string);
			list2.add(string);

		}

		Collections.sort(list2);
		Collections.sort(list);
		String temp = "아이유";
		System.out.println("test2:" + list.size());
		for (int i = 0; i < list.size(); i++) {
				if(list.get(i).is_true(temp)) {
					System.out.println("id 중복");
					return;
				}
				name_list.put(temp, new PhoneData(temp, "서울 성동구", "000000-123456", "010-3333-2222", "email@test", "SK", "31000", "vh-1923041"));
			}
		
			
			
			System.out.println(name_list.size());
			System.out.println(name_list.get(temp).s.phoneNum);
		}
//		System.out.println(list.get(1).s.name);
//		for (int i = 0; i < list2.size(); i++) {
//		 System.out.println(name_list.get(list2.get(i)).s.addr);  //s 는 의존객체이다.	
//		 
//		};

//		for (String string : list2) {
//			System.out.println(string);
//			System.out.println(name_list.get(string).s.addr);
//		}

//		HashSet<String> set = new HashSet<String>();
//		Collectors.sort(set);

//		PhoneS s = new PhoneS(data.name[0], data.addr[0], data.number[0], data.phoneNum[0], 
//				data.email[0], data.service[0], data.plan[0], data.serial[0]);

	}

