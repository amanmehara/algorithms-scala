package com.amanmehara.algorithms

/**
  * Created by @amanmehara on 04-06-2017.
  */
object Progressions {

  def arithmeticProgression (terms: Int): (Double, Double) => List[BigDecimal] = {
    (firstTerm, commonDifference) => {
      (1 to terms).map(term => firstTerm + (term - 1) * BigDecimal(commonDifference)).toList
    }
  }

  def arithmeticProgressionSum (terms: Int): (Double, Double) => BigDecimal = {
    (firstTerm, commonDifference) => {
      arithmeticProgression(terms)(firstTerm,commonDifference).sum
    }
  }

  def arithmeticProgressionSumFormula (terms: Int): (Double, Double) => BigDecimal = {
    (firstTerm, commonDifference) => {
      terms / BigDecimal(2) * (2 * BigDecimal(firstTerm) + (terms - 1) * BigDecimal(commonDifference))
    }
  }

  def geometricProgression (terms: Int): (Double, Double) => Option[List[BigDecimal]] = {
    (firstTerm, commonRatio) => {
      commonRatio match {
        case 0 => None
        case _ => Option((1 to terms).map(term => firstTerm * BigDecimal(commonRatio).pow(term - 1)).toList)
      }
    }
  }

  def geometricProgressionSum (terms: Int): (Double, Double) => Option[BigDecimal] = {
    (firstTerm, commonRatio) => {
      geometricProgression(terms)(firstTerm,commonRatio) match {
        case Some(s) => Option(s.sum)
        case None => None
      }
    }
  }

  def geometricProgressionSumFormula (terms: Int): (Double, Double) => Option[BigDecimal] = {
    (firstTerm, commonRatio) => {
      commonRatio match {
        case 0 => None
        case 1 => Option(terms * firstTerm)
        case _ => Option(firstTerm * (1 - BigDecimal(commonRatio).pow(terms))./(1 - BigDecimal(commonRatio)))
      }
    }
  }

  def geometricProgressionInfiniteSumFormula (firstTerm: Double, commonRatio: Double) : Option[BigDecimal] = {
    commonRatio match {
      case x if x > -1 && x < 1 && x != 0 => Option(BigDecimal(firstTerm)./(1 - BigDecimal(commonRatio)))
      case _ => None
    }
  }

}
