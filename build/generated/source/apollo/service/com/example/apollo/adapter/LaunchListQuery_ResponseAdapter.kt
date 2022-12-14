//
// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL version '3.6.2'.
//
package com.example.apollo.adapter

import com.apollographql.apollo3.api.Adapter
import com.apollographql.apollo3.api.BooleanAdapter
import com.apollographql.apollo3.api.CustomScalarAdapters
import com.apollographql.apollo3.api.NullableStringAdapter
import com.apollographql.apollo3.api.StringAdapter
import com.apollographql.apollo3.api.json.JsonReader
import com.apollographql.apollo3.api.json.JsonWriter
import com.apollographql.apollo3.api.list
import com.apollographql.apollo3.api.nullable
import com.apollographql.apollo3.api.obj
import com.example.apollo.LaunchListQuery
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public object LaunchListQuery_ResponseAdapter {
  public object Data : Adapter<LaunchListQuery.Data> {
    public val RESPONSE_NAMES: List<String> = listOf("launches")

    public override fun fromJson(reader: JsonReader, customScalarAdapters: CustomScalarAdapters):
        LaunchListQuery.Data {
      var _launches: LaunchListQuery.Launches? = null

      while(true) {
        when (reader.selectName(RESPONSE_NAMES)) {
          0 -> _launches = Launches.obj().fromJson(reader, customScalarAdapters)
          else -> break
        }
      }

      return LaunchListQuery.Data(
        launches = _launches!!
      )
    }

    public override fun toJson(
      writer: JsonWriter,
      customScalarAdapters: CustomScalarAdapters,
      `value`: LaunchListQuery.Data,
    ): Unit {
      writer.name("launches")
      Launches.obj().toJson(writer, customScalarAdapters, value.launches)
    }
  }

  public object Launches : Adapter<LaunchListQuery.Launches> {
    public val RESPONSE_NAMES: List<String> = listOf("cursor", "hasMore", "launches")

    public override fun fromJson(reader: JsonReader, customScalarAdapters: CustomScalarAdapters):
        LaunchListQuery.Launches {
      var _cursor: String? = null
      var _hasMore: Boolean? = null
      var _launches: List<LaunchListQuery.Launch?>? = null

      while(true) {
        when (reader.selectName(RESPONSE_NAMES)) {
          0 -> _cursor = StringAdapter.fromJson(reader, customScalarAdapters)
          1 -> _hasMore = BooleanAdapter.fromJson(reader, customScalarAdapters)
          2 -> _launches = Launch.obj().nullable().list().fromJson(reader, customScalarAdapters)
          else -> break
        }
      }

      return LaunchListQuery.Launches(
        cursor = _cursor!!,
        hasMore = _hasMore!!,
        launches = _launches!!
      )
    }

    public override fun toJson(
      writer: JsonWriter,
      customScalarAdapters: CustomScalarAdapters,
      `value`: LaunchListQuery.Launches,
    ): Unit {
      writer.name("cursor")
      StringAdapter.toJson(writer, customScalarAdapters, value.cursor)

      writer.name("hasMore")
      BooleanAdapter.toJson(writer, customScalarAdapters, value.hasMore)

      writer.name("launches")
      Launch.obj().nullable().list().toJson(writer, customScalarAdapters, value.launches)
    }
  }

  public object Launch : Adapter<LaunchListQuery.Launch> {
    public val RESPONSE_NAMES: List<String> = listOf("id", "site")

    public override fun fromJson(reader: JsonReader, customScalarAdapters: CustomScalarAdapters):
        LaunchListQuery.Launch {
      var _id: String? = null
      var _site: String? = null

      while(true) {
        when (reader.selectName(RESPONSE_NAMES)) {
          0 -> _id = StringAdapter.fromJson(reader, customScalarAdapters)
          1 -> _site = NullableStringAdapter.fromJson(reader, customScalarAdapters)
          else -> break
        }
      }

      return LaunchListQuery.Launch(
        id = _id!!,
        site = _site
      )
    }

    public override fun toJson(
      writer: JsonWriter,
      customScalarAdapters: CustomScalarAdapters,
      `value`: LaunchListQuery.Launch,
    ): Unit {
      writer.name("id")
      StringAdapter.toJson(writer, customScalarAdapters, value.id)

      writer.name("site")
      NullableStringAdapter.toJson(writer, customScalarAdapters, value.site)
    }
  }
}
