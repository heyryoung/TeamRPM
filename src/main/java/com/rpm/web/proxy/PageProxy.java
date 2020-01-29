package com.rpm.web.proxy;


import com.rpm.web.contents.Cars;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.rpm.web.util.Printer;

import lombok.Data;

import java.util.List;

@Data
@Lazy
@Component("pager")
public class PageProxy{
	private int totalCount, startRow, endRow, 
				pageCount,pageNum, pageSize, startPage, endPage,
				blockCount, blockNum, nextBlock, prevBlock;
	private boolean existPrev, existNext;
	private final int BLOCK_SIZE = 10;

	
	public void paging(List<Cars> cars) {
		totalCount = cars.size();
		pageCount = (totalCount % pageSize != 0) ? (totalCount / pageSize)+1 : totalCount / pageSize;
		startRow = (pageNum-1)*pageSize;
		endRow = (pageNum==pageCount) ? totalCount -1 : startRow + pageSize -1;
		blockCount = (pageCount % BLOCK_SIZE != 0) ? (pageCount / BLOCK_SIZE)+1 : pageCount / BLOCK_SIZE;
		blockNum = (pageNum - 1) / BLOCK_SIZE;
		startPage = blockNum * BLOCK_SIZE + 1;
		endPage = ((blockNum + 1) != blockCount) ? startPage + (BLOCK_SIZE -1) : pageCount;
		existPrev = blockNum != 0;
		existNext = (blockNum + 1) != blockCount;
		nextBlock = startPage + BLOCK_SIZE;
		prevBlock = startPage - BLOCK_SIZE;
		
	}
	
	
}