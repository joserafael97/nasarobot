package br.com.jrafael.infrastructure.controller;

import br.com.jrafael.infrastructure.dto.BaseDto;
import br.com.jrafael.infrastructure.exception.BusinessException;
import br.com.jrafael.infrastructure.repository.AbstractRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.util.logging.Logger;

public abstract class SaveController <T, K extends BaseDto<T>, F extends BaseDto<T>, ID> {

    protected AbstractRepository<T, ID> repository;

    protected final Logger LOGGER = Logger.getLogger(CrudController.class.getName());

    public SaveController(AbstractRepository<T, ID> repository) {
        this.repository = repository;
    }

    protected abstract K convert(T entity);

    @PostMapping
    @Transactional
    public ResponseEntity<K> post(@RequestBody @Valid F form) throws BusinessException {
        T entity = this.repository.save(form.convert());
        return ResponseEntity.ok(this.convert(entity));
    }
}
