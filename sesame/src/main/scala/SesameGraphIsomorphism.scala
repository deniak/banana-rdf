package org.w3.rdf.sesame

import org.w3.rdf

import org.openrdf.model.Statement
import org.openrdf.model.impl.GraphImpl
import org.openrdf.model.util.ModelUtil
import org.openrdf.repository.util.RepositoryUtil

object SesameGraphIsomorphism extends rdf.GraphIsomorphism[SesameModule.type](SesameModule) {
  
  def isIsomorphicWith(g1: m.Graph, g2: m.Graph): Boolean =
    ModelUtil.equals(
      new java.lang.Iterable[Statement] { def iterator = g1.sesameGraph.iterator },
      new java.lang.Iterable[Statement] { def iterator = g2.sesameGraph.iterator }
    )
  
}