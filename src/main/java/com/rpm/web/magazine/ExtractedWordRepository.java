package com.rpm.web.magazine;

import org.springframework.context.annotation.Lazy;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Lazy
public interface ExtractedWordRepository  extends CrudRepository<ExtractedWord, Long> {
}
