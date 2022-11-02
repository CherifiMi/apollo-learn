//
// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL version '3.6.2'.
//
package com.example.apollo

import com.apollographql.apollo3.annotations.ApolloAdaptableWith
import com.apollographql.apollo3.api.Adapter
import com.apollographql.apollo3.api.CompiledField
import com.apollographql.apollo3.api.CustomScalarAdapters
import com.apollographql.apollo3.api.Query
import com.apollographql.apollo3.api.json.JsonWriter
import com.apollographql.apollo3.api.obj
import com.example.apollo.adapter.LaunchListQuery_ResponseAdapter
import com.example.apollo.selections.LaunchListQuerySelections
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public class LaunchListQuery() : Query<LaunchListQuery.Data> {
  public override fun equals(other: Any?): Boolean = other != null && other::class == this::class

  public override fun hashCode(): Int = this::class.hashCode()

  public override fun id(): String = OPERATION_ID

  public override fun document(): String = OPERATION_DOCUMENT

  public override fun name(): String = OPERATION_NAME

  public override fun serializeVariables(writer: JsonWriter,
      customScalarAdapters: CustomScalarAdapters): Unit {
    // This operation doesn't have any variable
  }

  public override fun adapter(): Adapter<Data> = LaunchListQuery_ResponseAdapter.Data.obj()

  public override fun rootField(): CompiledField = CompiledField.Builder(
    name = "data",
    type = com.example.apollo.type.Query.type
  )
  .selections(selections = LaunchListQuerySelections.__root)
  .build()

  @ApolloAdaptableWith(LaunchListQuery_ResponseAdapter.Data::class)
  public data class Data(
    public val launches: Launches,
  ) : Query.Data

  public data class Launches(
    public val cursor: String,
    public val hasMore: Boolean,
    public val launches: List<Launch?>,
  )

  public data class Launch(
    public val id: String,
    public val site: String?,
  )

  public companion object {
    public const val OPERATION_ID: String =
        "5ba8d0c7288c32cedf8b78449eabaa7021536f0dc4cd807e28a15d121be3c014"

    /**
     * The minimized GraphQL document being sent to the server to save a few bytes.
     * The un-minimized version is:
     *
     * query LaunchList {
     *   launches {
     *     cursor
     *     hasMore
     *     launches {
     *       id
     *       site
     *     }
     *   }
     * }
     */
    public val OPERATION_DOCUMENT: String
      get() = "query LaunchList { launches { cursor hasMore launches { id site } } }"

    public const val OPERATION_NAME: String = "LaunchList"
  }
}
