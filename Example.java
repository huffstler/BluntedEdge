
/**
  * I'm trying to be more mindful of code that I write / see in my everday life.
  * One way to do that is to keep "Good taste" in mind when writing code.
  * Explanation here: https://www.ted.com/talks/linus_torvalds_the_mind_behind_linux
  * (~14 minutes in)
  */
  
// If possible, how can we remove the edge case from the below loop
// so that the "if" statement isn't necessary?
public void SQLBuilder( Foo criteria ) {
  for (int i = 0; i < criteria.size(); i++) {
    if (i > 0) {
      queryBuilder.append(" AND ");
    }
    queryBuilder.append(criteria.get(i));
  }
  return queryBuilder.toString();
}
