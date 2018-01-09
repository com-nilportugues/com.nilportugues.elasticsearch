package com.nilportugues.elasticsearch.repository;

import com.nilportugues.oauth.shared.domain.*;

import java.io.Serializable;
import java.util.List;

public interface ElasticSearchRepository<T extends Serializable> {

    void deleteById(String id);

    T save(T data);

    T findById(String id);

    List<T> find(final FilterOptions filterOptions, final SortOptions sortOptions);

    Paginated<T> findAll(final FilterOptions filterOptions,
                         final PageOptions pageOptions,
                         final SortOptions sortOptions);

    Faceted<T> search(final FacetOptions facetOptions,
                      final FilterOptions filterOptions,
                      final PageOptions pageOptions,
                      final SortOptions sortOptions);
}
