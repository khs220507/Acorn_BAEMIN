package com.acorn.baemin.seller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acorn.baemin.domain.AnswerDTO;
import com.acorn.baemin.domain.ReviewDTO;
<<<<<<< HEAD
import com.acorn.baemin.domain.StoreDTO;
import com.acorn.baemin.seller.repository.SellerRepository;
=======
import com.acorn.baemin.domain.SellerDTO;
import com.acorn.baemin.domain.StoreDTO;
import com.acorn.baemin.seller.repository.SellerRepository;


>>>>>>> f880ac08703c011308f9419419520cca3f432121

@Service
public class SellerService implements ServiceI{

	
	// 태민
	// 매장정보탭
<<<<<<< HEAD
	// 매장정보 1개 조회
	@Override
	public StoreDTO selectStoreOne(String storeCode) {
		return dao.selectStoreSubInfo(storeCode);
	}
	// 매장정보 수정
	@Override
	public int modifingStoreSubInfo(StoreDTO store) {
		return dao.updateStoreSubInfo(store);
	}
	// 리뷰탭
	// 리뷰 전체목록 조회
	@Override
	public List<ReviewDTO> getAllReview() {
		return dao.selectAllReview();
	}
	// 리뷰 1건에 대한 답변 등록
	@Override
	public AnswerDTO regiAnswer(String answerContent) {
		return dao.insertAnswer(answerContent);
	}
	// 답변 수정
	@Override
	public AnswerDTO modifingAnswer(String answerContent) {
		return dao.updateAnswer(answerContent);
	}
	// 답변 삭제
	@Override
	public AnswerDTO deleteAnswer(String answerCode) {
		return dao.deleteAnswer(answerCode);
	}

=======
	// 매장정보 일부조회1(매장이름, 평점, 리뷰수, 최소주문금액)
	@Override
	public StoreDTO selectStoreNmRtRcMp(int storeCode) {
		// TODO Auto-generated method stub
		return null;
	}
	// 매장정보 일부조회2(가게소개, 운영시간, 매장주소)
	@Override
	public StoreDTO selectStoreDTA(int storeCode) {
		// TODO Auto-generated method stub
		return null;
	}
	// 사장님정보 일부조회(이름, 사업자등록번호)
	@Override
	public SellerDTO selectSellerNmRn(int sellerCode) {
		// TODO Auto-generated method stub
		return null;
	}
	// 매장정보 일부수정(가게소개, 운영시간, 매장주소)
	@Override
	public int modifingStoreDTA(StoreDTO store) {
		// TODO Auto-generated method stub
		return 0;
	}
	// 사장님정보 일부수정(이름, 사업자등록번호)
	@Override
	public int modifingSellerNmRn(SellerDTO seller) {
		// TODO Auto-generated method stub
		return 0;
	}
	// 리뷰탭
	// 리뷰 전체 조회
	@Override
	public List<ReviewDTO> selectAllReview() {
		// TODO Auto-generated method stub
		return null;
	}
	// 답변 등록
	@Override
	public int insertAnswer(String AnswerContent) {
		// TODO Auto-generated method stub
		return 0;
	}
	// 답변 수정
	@Override
	public int updateAnswer(String AnswerContent) {
		// TODO Auto-generated method stub
		return 0;
	}
	// 답변 삭제
	@Override
	public int deleteAnswer(int AnswerCode) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	
	
>>>>>>> f880ac08703c011308f9419419520cca3f432121
	
}
