package org.apache.spark.sql.catalyst.expressions;
public  class ApproxCountDistinctMergeFunction extends org.apache.spark.sql.catalyst.expressions.AggregateFunction implements scala.Product, scala.Serializable {
  public  org.apache.spark.sql.catalyst.expressions.Expression expr () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.AggregateExpression base () { throw new RuntimeException(); }
  public  double relativeSD () { throw new RuntimeException(); }
  // not preceding
  public   ApproxCountDistinctMergeFunction (org.apache.spark.sql.catalyst.expressions.Expression expr, org.apache.spark.sql.catalyst.expressions.AggregateExpression base, double relativeSD) { throw new RuntimeException(); }
  public   ApproxCountDistinctMergeFunction () { throw new RuntimeException(); }
  private  com.clearspring.analytics.stream.cardinality.HyperLogLog hyperLogLog () { throw new RuntimeException(); }
  public  void update (org.apache.spark.sql.catalyst.expressions.Row input) { throw new RuntimeException(); }
  public  Object eval (org.apache.spark.sql.catalyst.expressions.Row input) { throw new RuntimeException(); }
}
