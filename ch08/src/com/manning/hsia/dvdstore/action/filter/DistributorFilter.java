package com.manning.hsia.dvdstore.action.filter;

import org.apache.lucene.index.IndexReader;
import org.apache.lucene.search.Filter;

import java.io.IOException;
import java.util.BitSet;

public class DistributorFilter extends Filter {

  @Override
  public BitSet bits(IndexReader reader) throws IOException {
    return new BitSet(reader.maxDoc());
  }

}
