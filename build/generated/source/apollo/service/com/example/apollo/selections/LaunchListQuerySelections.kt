//
// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL version '3.6.2'.
//
package com.example.apollo.selections

import com.apollographql.apollo3.api.CompiledField
import com.apollographql.apollo3.api.CompiledSelection
import com.apollographql.apollo3.api.list
import com.apollographql.apollo3.api.notNull
import com.example.apollo.type.GraphQLBoolean
import com.example.apollo.type.GraphQLID
import com.example.apollo.type.GraphQLString
import com.example.apollo.type.Launch
import com.example.apollo.type.LaunchConnection
import kotlin.collections.List

public object LaunchListQuerySelections {
  private val __launches1: List<CompiledSelection> = listOf(
        CompiledField.Builder(
          name = "id",
          type = GraphQLID.type.notNull()
        ).build(),
        CompiledField.Builder(
          name = "site",
          type = GraphQLString.type
        ).build()
      )

  private val __launches: List<CompiledSelection> = listOf(
        CompiledField.Builder(
          name = "cursor",
          type = GraphQLString.type.notNull()
        ).build(),
        CompiledField.Builder(
          name = "hasMore",
          type = GraphQLBoolean.type.notNull()
        ).build(),
        CompiledField.Builder(
          name = "launches",
          type = Launch.type.list().notNull()
        ).selections(__launches1)
        .build()
      )

  public val __root: List<CompiledSelection> = listOf(
        CompiledField.Builder(
          name = "launches",
          type = LaunchConnection.type.notNull()
        ).selections(__launches)
        .build()
      )
}