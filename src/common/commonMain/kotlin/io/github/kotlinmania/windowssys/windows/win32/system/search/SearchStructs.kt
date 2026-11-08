@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.system.search

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.BSTR
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.FILETIME
import io.github.kotlinmania.windowssys.windows.win32.foundation.VARIANT_BOOL
import io.github.kotlinmania.windowssys.windows.win32.storage.indexserver.DBID
import io.github.kotlinmania.windowssys.windows.win32.storage.indexserver.FULLPROPSPEC
import io.github.kotlinmania.windowssys.windows.win32.system.com.CY
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.PROPVARIANT
import io.github.kotlinmania.windowssys.windows.win32.system.variant.VARENUM
import io.github.kotlinmania.windowssys.windows.win32.system.variant.VARIANT

public data class AUTHENTICATION_INFO(
    public var dwSize: UInt = 0u,
    public var atAuthenticationType: AUTH_TYPE = 0,
    public var pcwszUser: PCWSTR = 0L,
    public var pcwszPassword: PCWSTR = 0L,
)

public data class BUCKETCATEGORIZE(public var cBuckets: UInt = 0u, public var Distribution: UInt = 0u)

public data class CATEGORIZATION(
    public var ulCatType: UInt = 0u,
    public var Anonymous: CATEGORIZATION_0 = CATEGORIZATION_0(),
    public var csColumns: COLUMNSET = COLUMNSET(),
)

public data class CATEGORIZATION_0(
    public var cClusters: UInt = 0u,
    public var bucket: BUCKETCATEGORIZE = BUCKETCATEGORIZE(),
    public var range: RANGECATEGORIZE = RANGECATEGORIZE(),
)

public data class CATEGORIZATIONSET(public var cCat: UInt = 0u, public var aCat: Long = 0L)

public data class COLUMNSET(public var cCol: UInt = 0u, public var aCol: Long = 0L)

public data class CONTENTRESTRICTION(
    public var prop: FULLPROPSPEC = FULLPROPSPEC(),
    public var pwcsPhrase: PWSTR = 0L,
    public var lcid: UInt = 0u,
    public var ulGenerateMethod: UInt = 0u,
)

public data class DATE_STRUCT(
    public var year: Short = 0,
    public var month: UShort = 0u,
    public var day: UShort = 0u,
)

public data class DBBINDEXT(public var pExtension: Long = 0L, public var ulExtension: ULong = 0uL)

public data class DBBINDING(
    public var iOrdinal: ULong = 0uL,
    public var obValue: ULong = 0uL,
    public var obLength: ULong = 0uL,
    public var obStatus: ULong = 0uL,
    public var pTypeInfo: Long = 0L,
    public var pObject: Long = 0L,
    public var pBindExt: Long = 0L,
    public var dwPart: UInt = 0u,
    public var dwMemOwner: UInt = 0u,
    public var eParamIO: UInt = 0u,
    public var cbMaxLen: ULong = 0uL,
    public var dwFlags: UInt = 0u,
    public var wType: UShort = 0u,
    public var bPrecision: UByte = 0u,
    public var bScale: UByte = 0u,
)

public data class DBCOLUMNACCESS(
    public var pData: Long = 0L,
    public var columnid: DBID = DBID(),
    public var cbDataLen: ULong = 0uL,
    public var dwStatus: UInt = 0u,
    public var cbMaxLen: ULong = 0uL,
    public var dwReserved: ULong = 0uL,
    public var wType: UShort = 0u,
    public var bPrecision: UByte = 0u,
    public var bScale: UByte = 0u,
)

public data class DBCOLUMNDESC(
    public var pwszTypeName: PWSTR = 0L,
    public var pTypeInfo: Long = 0L,
    public var rgPropertySets: Long = 0L,
    public var pclsid: Long = 0L,
    public var cPropertySets: UInt = 0u,
    public var ulColumnSize: ULong = 0uL,
    public var dbcid: DBID = DBID(),
    public var wType: UShort = 0u,
    public var bPrecision: UByte = 0u,
    public var bScale: UByte = 0u,
)

public data class DBCOLUMNINFO(
    public var pwszName: PWSTR = 0L,
    public var pTypeInfo: Long = 0L,
    public var iOrdinal: ULong = 0uL,
    public var dwFlags: UInt = 0u,
    public var ulColumnSize: ULong = 0uL,
    public var wType: UShort = 0u,
    public var bPrecision: UByte = 0u,
    public var bScale: UByte = 0u,
    public var columnid: DBID = DBID(),
)

public data class DBCONSTRAINTDESC(
    public var pConstraintID: Long = 0L,
    public var ConstraintType: UInt = 0u,
    public var cColumns: ULong = 0uL,
    public var rgColumnList: Long = 0L,
    public var pReferencedTableID: Long = 0L,
    public var cForeignKeyColumns: ULong = 0uL,
    public var rgForeignKeyColumnList: Long = 0L,
    public var pwszConstraintText: PWSTR = 0L,
    public var UpdateRule: UInt = 0u,
    public var DeleteRule: UInt = 0u,
    public var MatchType: UInt = 0u,
    public var Deferrability: UInt = 0u,
    public var cReserved: ULong = 0uL,
    public var rgReserved: Long = 0L,
)

public data class DBCOST(
    public var eKind: UInt = 0u,
    public var dwUnits: UInt = 0u,
    public var lValue: Int = 0,
)

public data class DBDATE(
    public var year: Short = 0,
    public var month: UShort = 0u,
    public var day: UShort = 0u,
)

public data class DBDATETIM4(public var numdays: UShort = 0u, public var nummins: UShort = 0u)

public data class DBDATETIME(public var dtdays: Int = 0, public var dttime: UInt = 0u)

public data class DBFAILUREINFO(
    public var hRow: ULong = 0uL,
    public var iColumn: ULong = 0uL,
    public var failure: HRESULT = 0,
)

public data class DBIMPLICITSESSION(
    public var pUnkOuter: Long = 0L,
    public var piid: Long = 0L,
    public var pSession: Long = 0L,
)

public data class DBINDEXCOLUMNDESC(public var pColumnID: Long = 0L, public var eIndexColOrder: UInt = 0u)

public data class DBLITERALINFO(
    public var pwszLiteralValue: PWSTR = 0L,
    public var pwszInvalidChars: PWSTR = 0L,
    public var pwszInvalidStartingChars: PWSTR = 0L,
    public var lt: UInt = 0u,
    public var fSupported: BOOL = 0,
    public var cchMaxLen: UInt = 0u,
)

public data class DBMONEY(public var mnyhigh: Int = 0, public var mnylow: UInt = 0u)

public data class DBOBJECT(public var dwFlags: UInt = 0u, public var iid: GUID = GUID())

public data class DBPARAMBINDINFO(
    public var pwszDataSourceType: PWSTR = 0L,
    public var pwszName: PWSTR = 0L,
    public var ulParamSize: ULong = 0uL,
    public var dwFlags: UInt = 0u,
    public var bPrecision: UByte = 0u,
    public var bScale: UByte = 0u,
)

public data class DBPARAMINFO(
    public var dwFlags: UInt = 0u,
    public var iOrdinal: ULong = 0uL,
    public var pwszName: PWSTR = 0L,
    public var pTypeInfo: Long = 0L,
    public var ulParamSize: ULong = 0uL,
    public var wType: UShort = 0u,
    public var bPrecision: UByte = 0u,
    public var bScale: UByte = 0u,
)

public data class DBPARAMS(
    public var pData: Long = 0L,
    public var cParamSets: ULong = 0uL,
    public var hAccessor: HACCESSOR = 0uL,
)

public data class DBPROP(
    public var dwPropertyID: UInt = 0u,
    public var dwOptions: UInt = 0u,
    public var dwStatus: UInt = 0u,
    public var colid: DBID = DBID(),
    public var vValue: VARIANT = VARIANT(),
)

public data class DBPROPIDSET(
    public var rgPropertyIDs: Long = 0L,
    public var cPropertyIDs: UInt = 0u,
    public var guidPropertySet: GUID = GUID(),
)

public data class DBPROPINFO(
    public var pwszDescription: PWSTR = 0L,
    public var dwPropertyID: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var vtType: VARENUM = 0u,
    public var vValues: VARIANT = VARIANT(),
)

public data class DBPROPINFOSET(
    public var rgPropertyInfos: Long = 0L,
    public var cPropertyInfos: UInt = 0u,
    public var guidPropertySet: GUID = GUID(),
)

public data class DBPROPSET(
    public var rgProperties: Long = 0L,
    public var cProperties: UInt = 0u,
    public var guidPropertySet: GUID = GUID(),
)

public data class DBROWWATCHCHANGE(
    public var hRegion: ULong = 0uL,
    public var eChangeKind: UInt = 0u,
    public var hRow: ULong = 0uL,
    public var iRow: ULong = 0uL,
)

public data class DBTIME(
    public var hour: UShort = 0u,
    public var minute: UShort = 0u,
    public var second: UShort = 0u,
)

public data class DBTIMESTAMP(
    public var year: Short = 0,
    public var month: UShort = 0u,
    public var day: UShort = 0u,
    public var hour: UShort = 0u,
    public var minute: UShort = 0u,
    public var second: UShort = 0u,
    public var fraction: UInt = 0u,
)

public data class DBVARYBIN(public var len: Short = 0, public var array: UByteArray = UByteArray(8001)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DBVARYBIN) return false
        if (this.len != other.len) return false
        if (!this.array.contentEquals(other.array)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.len.hashCode()
        result = 31 * result + this.array.contentHashCode()
        return result
    }
}

public data class DBVARYCHAR(public var len: Short = 0, public var str: ByteArray = ByteArray(8001)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DBVARYCHAR) return false
        if (this.len != other.len) return false
        if (!this.str.contentEquals(other.str)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.len.hashCode()
        result = 31 * result + this.str.contentHashCode()
        return result
    }
}

public data class DBVECTOR(public var size: ULong = 0uL, public var ptr: Long = 0L)

public data class DB_NUMERIC(
    public var precision: UByte = 0u,
    public var scale: UByte = 0u,
    public var sign: UByte = 0u,
    public var value: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DB_NUMERIC) return false
        if (this.precision != other.precision) return false
        if (this.scale != other.scale) return false
        if (this.sign != other.sign) return false
        if (!this.value.contentEquals(other.value)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.precision.hashCode()
        result = 31 * result + this.scale.hashCode()
        result = 31 * result + this.sign.hashCode()
        result = 31 * result + this.value.contentHashCode()
        return result
    }
}

public data class DB_VARNUMERIC(
    public var precision: UByte = 0u,
    public var scale: Byte = 0,
    public var sign: UByte = 0u,
    public var value: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DB_VARNUMERIC) return false
        if (this.precision != other.precision) return false
        if (this.scale != other.scale) return false
        if (this.sign != other.sign) return false
        if (!this.value.contentEquals(other.value)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.precision.hashCode()
        result = 31 * result + this.scale.hashCode()
        result = 31 * result + this.sign.hashCode()
        result = 31 * result + this.value.contentHashCode()
        return result
    }
}

public data class DCINFO(public var eInfoType: UInt = 0u, public var vData: VARIANT = VARIANT())

public data class ERRORINFO(
    public var hrError: HRESULT = 0,
    public var dwMinor: UInt = 0u,
    public var clsid: GUID = GUID(),
    public var iid: GUID = GUID(),
    public var dispid: Int = 0,
)

public data class FILTERED_DATA_SOURCES(
    public var pwcsExtension: PCWSTR = 0L,
    public var pwcsMime: PCWSTR = 0L,
    public var pClsid: Long = 0L,
    public var pwcsOverride: PCWSTR = 0L,
)

public data class HITRANGE(public var iPosition: UInt = 0u, public var cLength: UInt = 0u)

public data class INCREMENTAL_ACCESS_INFO(public var dwSize: UInt = 0u, public var ftLastModifiedTime: FILETIME = FILETIME())

public data class ITEMPROP(public var variantValue: VARIANT = VARIANT(), public var pwszName: PWSTR = 0L)

public data class ITEM_INFO(
    public var dwSize: UInt = 0u,
    public var pcwszFromEMail: PCWSTR = 0L,
    public var pcwszApplicationName: PCWSTR = 0L,
    public var pcwszCatalogName: PCWSTR = 0L,
    public var pcwszContentClass: PCWSTR = 0L,
)

public data class KAGGETDIAG(
    public var ulSize: UInt = 0u,
    public var vDiagInfo: VARIANT = VARIANT(),
    public var sDiagField: Short = 0,
)

public data class KAGREQDIAG(
    public var ulDiagFlags: UInt = 0u,
    public var vt: VARENUM = 0u,
    public var sDiagField: Short = 0,
)

public data class MDAXISINFO(
    public var cbSize: ULong = 0uL,
    public var iAxis: ULong = 0uL,
    public var cDimensions: ULong = 0uL,
    public var cCoordinates: ULong = 0uL,
    public var rgcColumns: Long = 0L,
    public var rgpwszDimensionNames: Long = 0L,
)

public data class NATLANGUAGERESTRICTION(
    public var prop: FULLPROPSPEC = FULLPROPSPEC(),
    public var pwcsPhrase: PWSTR = 0L,
    public var lcid: UInt = 0u,
)

public data class NODERESTRICTION(
    public var cRes: UInt = 0u,
    public var paRes: Long = 0L,
    public var reserved: UInt = 0u,
)

public data class NOTRESTRICTION(public var pRes: Long = 0L)

public data class ODBC_VS_ARGS(
    public var pguidEvent: Long = 0L,
    public var dwFlags: UInt = 0u,
    public var Anonymous1: ODBC_VS_ARGS_0 = ODBC_VS_ARGS_0(),
    public var Anonymous2: ODBC_VS_ARGS_1 = ODBC_VS_ARGS_1(),
    public var RetCode: Short = 0,
)

public data class ODBC_VS_ARGS_0(public var wszArg: PWSTR = 0L, public var szArg: PSTR = 0L)

public data class ODBC_VS_ARGS_1(public var wszCorrelation: PWSTR = 0L, public var szCorrelation: PSTR = 0L)

public data class PROPERTYRESTRICTION(
    public var rel: UInt = 0u,
    public var prop: FULLPROPSPEC = FULLPROPSPEC(),
    public var prval: PROPVARIANT = PROPVARIANT(),
)

public data class PROXY_INFO(
    public var dwSize: UInt = 0u,
    public var pcwszUserAgent: PCWSTR = 0L,
    public var paUseProxy: PROXY_ACCESS = 0,
    public var fLocalBypass: BOOL = 0,
    public var dwPortNumber: UInt = 0u,
    public var pcwszProxyName: PCWSTR = 0L,
    public var pcwszBypassList: PCWSTR = 0L,
)

public data class RANGECATEGORIZE(public var cRange: UInt = 0u, public var aRangeBegin: Long = 0L)

public data class RESTRICTION(
    public var rt: UInt = 0u,
    public var weight: UInt = 0u,
    public var res: RESTRICTION_0 = RESTRICTION_0(),
)

public data class RESTRICTION_0(
    public var ar: NODERESTRICTION = NODERESTRICTION(),
    public var orRestriction: NODERESTRICTION = NODERESTRICTION(),
    public var pxr: NODERESTRICTION = NODERESTRICTION(),
    public var vr: VECTORRESTRICTION = VECTORRESTRICTION(),
    public var nr: NOTRESTRICTION = NOTRESTRICTION(),
    public var cr: CONTENTRESTRICTION = CONTENTRESTRICTION(),
    public var nlr: NATLANGUAGERESTRICTION = NATLANGUAGERESTRICTION(),
    public var pr: PROPERTYRESTRICTION = PROPERTYRESTRICTION(),
)

public data class RMTPACK(
    public var pISeqStream: Long = 0L,
    public var cbData: UInt = 0u,
    public var cBSTR: UInt = 0u,
    public var rgBSTR: Long = 0L,
    public var cVARIANT: UInt = 0u,
    public var rgVARIANT: Long = 0L,
    public var cIDISPATCH: UInt = 0u,
    public var rgIDISPATCH: Long = 0L,
    public var cIUNKNOWN: UInt = 0u,
    public var rgIUNKNOWN: Long = 0L,
    public var cPROPVARIANT: UInt = 0u,
    public var rgPROPVARIANT: Long = 0L,
    public var cArray: UInt = 0u,
    public var rgArray: Long = 0L,
)

public data class SEARCH_COLUMN_PROPERTIES(public var Value: PROPVARIANT = PROPVARIANT(), public var lcid: UInt = 0u)

public data class SEARCH_ITEM_CHANGE(
    public var Change: SEARCH_KIND_OF_CHANGE = 0,
    public var Priority: SEARCH_NOTIFICATION_PRIORITY = 0,
    public var pUserData: Long = 0L,
    public var lpwszURL: PWSTR = 0L,
    public var lpwszOldURL: PWSTR = 0L,
)

public data class SEARCH_ITEM_INDEXING_STATUS(public var dwDocID: UInt = 0u, public var hrIndexingStatus: HRESULT = 0)

public data class SEARCH_ITEM_PERSISTENT_CHANGE(
    public var Change: SEARCH_KIND_OF_CHANGE = 0,
    public var URL: PWSTR = 0L,
    public var OldURL: PWSTR = 0L,
    public var Priority: SEARCH_NOTIFICATION_PRIORITY = 0,
)

public data class SEC_OBJECT(public var cObjects: UInt = 0u, public var prgObjects: Long = 0L)

public data class SEC_OBJECT_ELEMENT(public var guidObjectType: GUID = GUID(), public var ObjectID: DBID = DBID())

public data class SORTKEY(
    public var propColumn: FULLPROPSPEC = FULLPROPSPEC(),
    public var dwOrder: UInt = 0u,
    public var locale: UInt = 0u,
)

public data class SORTSET(public var cCol: UInt = 0u, public var aCol: Long = 0L)

public class SQLPERF(
    public var TimerResolution: UInt = 0u,
    public var SQLidu: UInt = 0u,
    public var SQLiduRows: UInt = 0u,
    public var SQLSelects: UInt = 0u,
    public var SQLSelectRows: UInt = 0u,
    public var Transactions: UInt = 0u,
    public var SQLPrepares: UInt = 0u,
    public var ExecDirects: UInt = 0u,
    public var SQLExecutes: UInt = 0u,
    public var CursorOpens: UInt = 0u,
    public var CursorSize: UInt = 0u,
    public var CursorUsed: UInt = 0u,
    public var PercentCursorUsed: Double = 0.0,
    public var AvgFetchTime: Double = 0.0,
    public var AvgCursorSize: Double = 0.0,
    public var AvgCursorUsed: Double = 0.0,
    public var SQLFetchTime: UInt = 0u,
    public var SQLFetchCount: UInt = 0u,
    public var CurrentStmtCount: UInt = 0u,
    public var MaxOpenStmt: UInt = 0u,
    public var SumOpenStmt: UInt = 0u,
    public var CurrentConnectionCount: UInt = 0u,
    public var MaxConnectionsOpened: UInt = 0u,
    public var SumConnectionsOpened: UInt = 0u,
    public var SumConnectiontime: UInt = 0u,
    public var AvgTimeOpened: Double = 0.0,
    public var ServerRndTrips: UInt = 0u,
    public var BuffersSent: UInt = 0u,
    public var BuffersRec: UInt = 0u,
    public var BytesSent: UInt = 0u,
    public var BytesRec: UInt = 0u,
    public var msExecutionTime: UInt = 0u,
    public var msNetWorkServerTime: UInt = 0u,
)

public data class SQL_DAY_SECOND_STRUCT(
    public var day: UInt = 0u,
    public var hour: UInt = 0u,
    public var minute: UInt = 0u,
    public var second: UInt = 0u,
    public var fraction: UInt = 0u,
)

public data class SQL_INTERVAL_STRUCT(
    public var interval_type: SQLINTERVAL = 0,
    public var interval_sign: Short = 0,
    public var intval: SQL_INTERVAL_STRUCT_0 = SQL_INTERVAL_STRUCT_0(),
)

public data class SQL_INTERVAL_STRUCT_0(public var year_month: SQL_YEAR_MONTH_STRUCT = SQL_YEAR_MONTH_STRUCT(), public var day_second: SQL_DAY_SECOND_STRUCT = SQL_DAY_SECOND_STRUCT())

public data class SQL_NUMERIC_STRUCT(
    public var precision: UByte = 0u,
    public var scale: Byte = 0,
    public var sign: UByte = 0u,
    public var value: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SQL_NUMERIC_STRUCT) return false
        if (this.precision != other.precision) return false
        if (this.scale != other.scale) return false
        if (this.sign != other.sign) return false
        if (!this.value.contentEquals(other.value)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.precision.hashCode()
        result = 31 * result + this.scale.hashCode()
        result = 31 * result + this.sign.hashCode()
        result = 31 * result + this.value.contentHashCode()
        return result
    }
}

public data class SQL_YEAR_MONTH_STRUCT(public var year: UInt = 0u, public var month: UInt = 0u)

public data class SSERRORINFO(
    public var pwszMessage: PWSTR = 0L,
    public var pwszServer: PWSTR = 0L,
    public var pwszProcedure: PWSTR = 0L,
    public var lNative: Int = 0,
    public var bState: UByte = 0u,
    public var bClass: UByte = 0u,
    public var wLineNumber: UShort = 0u,
)

public data class SSVARIANT(
    public var vt: UShort = 0u,
    public var dwReserved1: UInt = 0u,
    public var dwReserved2: UInt = 0u,
    public var Anonymous: SSVARIANT_0 = SSVARIANT_0(),
)

public data class SSVARIANT_0(
    public var bTinyIntVal: UByte = 0u,
    public var sShortIntVal: Short = 0,
    public var lIntVal: Int = 0,
    public var llBigIntVal: Long = 0L,
    public var fltRealVal: Float = 0.0f,
    public var dblFloatVal: Double = 0.0,
    public var cyMoneyVal: CY = CY(),
    public var NCharVal: SSVARIANT_0_0 = SSVARIANT_0_0(),
    public var CharVal: SSVARIANT_0_1 = SSVARIANT_0_1(),
    public var fBitVal: VARIANT_BOOL = 0,
    public var rgbGuidVal: UByteArray = UByteArray(16),
    public var numNumericVal: DB_NUMERIC = DB_NUMERIC(),
    public var BinaryVal: SSVARIANT_0_2 = SSVARIANT_0_2(),
    public var tsDateTimeVal: DBTIMESTAMP = DBTIMESTAMP(),
    public var UnknownType: SSVARIANT_0_3 = SSVARIANT_0_3(),
    public var BLOBType: SSVARIANT_0_4 = SSVARIANT_0_4(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SSVARIANT_0) return false
        if (this.bTinyIntVal != other.bTinyIntVal) return false
        if (this.sShortIntVal != other.sShortIntVal) return false
        if (this.lIntVal != other.lIntVal) return false
        if (this.llBigIntVal != other.llBigIntVal) return false
        if (this.fltRealVal != other.fltRealVal) return false
        if (this.dblFloatVal != other.dblFloatVal) return false
        if (this.cyMoneyVal != other.cyMoneyVal) return false
        if (this.NCharVal != other.NCharVal) return false
        if (this.CharVal != other.CharVal) return false
        if (this.fBitVal != other.fBitVal) return false
        if (!this.rgbGuidVal.contentEquals(other.rgbGuidVal)) return false
        if (this.numNumericVal != other.numNumericVal) return false
        if (this.BinaryVal != other.BinaryVal) return false
        if (this.tsDateTimeVal != other.tsDateTimeVal) return false
        if (this.UnknownType != other.UnknownType) return false
        if (this.BLOBType != other.BLOBType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bTinyIntVal.hashCode()
        result = 31 * result + this.sShortIntVal.hashCode()
        result = 31 * result + this.lIntVal.hashCode()
        result = 31 * result + this.llBigIntVal.hashCode()
        result = 31 * result + this.fltRealVal.hashCode()
        result = 31 * result + this.dblFloatVal.hashCode()
        result = 31 * result + this.cyMoneyVal.hashCode()
        result = 31 * result + this.NCharVal.hashCode()
        result = 31 * result + this.CharVal.hashCode()
        result = 31 * result + this.fBitVal.hashCode()
        result = 31 * result + this.rgbGuidVal.contentHashCode()
        result = 31 * result + this.numNumericVal.hashCode()
        result = 31 * result + this.BinaryVal.hashCode()
        result = 31 * result + this.tsDateTimeVal.hashCode()
        result = 31 * result + this.UnknownType.hashCode()
        result = 31 * result + this.BLOBType.hashCode()
        return result
    }
}

public data class SSVARIANT_0_4(public var dbobj: DBOBJECT = DBOBJECT(), public var pUnk: Long = 0L)

public data class SSVARIANT_0_2(
    public var sActualLength: Short = 0,
    public var sMaxLength: Short = 0,
    public var prgbBinaryVal: Long = 0L,
    public var dwReserved: UInt = 0u,
)

public data class SSVARIANT_0_1(
    public var sActualLength: Short = 0,
    public var sMaxLength: Short = 0,
    public var pchCharVal: PSTR = 0L,
    public var rgbReserved: UByteArray = UByteArray(5),
    public var dwReserved: UInt = 0u,
    public var pwchReserved: PWSTR = 0L,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SSVARIANT_0_1) return false
        if (this.sActualLength != other.sActualLength) return false
        if (this.sMaxLength != other.sMaxLength) return false
        if (this.pchCharVal != other.pchCharVal) return false
        if (!this.rgbReserved.contentEquals(other.rgbReserved)) return false
        if (this.dwReserved != other.dwReserved) return false
        if (this.pwchReserved != other.pwchReserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sActualLength.hashCode()
        result = 31 * result + this.sMaxLength.hashCode()
        result = 31 * result + this.pchCharVal.hashCode()
        result = 31 * result + this.rgbReserved.contentHashCode()
        result = 31 * result + this.dwReserved.hashCode()
        result = 31 * result + this.pwchReserved.hashCode()
        return result
    }
}

public data class SSVARIANT_0_0(
    public var sActualLength: Short = 0,
    public var sMaxLength: Short = 0,
    public var pwchNCharVal: PWSTR = 0L,
    public var rgbReserved: UByteArray = UByteArray(5),
    public var dwReserved: UInt = 0u,
    public var pwchReserved: PWSTR = 0L,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SSVARIANT_0_0) return false
        if (this.sActualLength != other.sActualLength) return false
        if (this.sMaxLength != other.sMaxLength) return false
        if (this.pwchNCharVal != other.pwchNCharVal) return false
        if (!this.rgbReserved.contentEquals(other.rgbReserved)) return false
        if (this.dwReserved != other.dwReserved) return false
        if (this.pwchReserved != other.pwchReserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sActualLength.hashCode()
        result = 31 * result + this.sMaxLength.hashCode()
        result = 31 * result + this.pwchNCharVal.hashCode()
        result = 31 * result + this.rgbReserved.contentHashCode()
        result = 31 * result + this.dwReserved.hashCode()
        result = 31 * result + this.pwchReserved.hashCode()
        return result
    }
}

public data class SSVARIANT_0_3(
    public var dwActualLength: UInt = 0u,
    public var rgMetadata: UByteArray = UByteArray(16),
    public var pUnknownData: Long = 0L,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SSVARIANT_0_3) return false
        if (this.dwActualLength != other.dwActualLength) return false
        if (!this.rgMetadata.contentEquals(other.rgMetadata)) return false
        if (this.pUnknownData != other.pUnknownData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwActualLength.hashCode()
        result = 31 * result + this.rgMetadata.contentHashCode()
        result = 31 * result + this.pUnknownData.hashCode()
        return result
    }
}

public class SUBSCRIPTIONINFO(
    public var cbSize: UInt = 0u,
    public var fUpdateFlags: UInt = 0u,
    public var schedule: SUBSCRIPTIONSCHEDULE = 0,
    public var customGroupCookie: GUID = GUID(),
    public var pTrigger: Long = 0L,
    public var dwRecurseLevels: UInt = 0u,
    public var fWebcrawlerFlags: UInt = 0u,
    public var bMailNotification: BOOL = 0,
    public var bGleam: BOOL = 0,
    public var bChangesOnly: BOOL = 0,
    public var bNeedPassword: BOOL = 0,
    public var fChannelFlags: UInt = 0u,
    public var bstrUserName: BSTR = 0L,
    public var bstrPassword: BSTR = 0L,
    public var bstrFriendlyName: BSTR = 0L,
    public var dwMaxSizeKB: UInt = 0u,
    public var subType: SUBSCRIPTIONTYPE = 0,
    public var fTaskFlags: UInt = 0u,
    public var dwReserved: UInt = 0u,
)

public data class SUBSCRIPTIONITEMINFO(
    public var cbSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwPriority: UInt = 0u,
    public var ScheduleGroup: GUID = GUID(),
    public var clsidAgent: GUID = GUID(),
)

public data class TEXT_SOURCE(
    public var pfnFillTextBuffer: PFNFILLTEXTBUFFER = null,
    public var awcBuffer: PCWSTR = 0L,
    public var iEnd: UInt = 0u,
    public var iCur: UInt = 0u,
)

public data class TIMEOUT_INFO(
    public var dwSize: UInt = 0u,
    public var dwConnectTimeout: UInt = 0u,
    public var dwDataTimeout: UInt = 0u,
)

public data class TIMESTAMP_STRUCT(
    public var year: Short = 0,
    public var month: UShort = 0u,
    public var day: UShort = 0u,
    public var hour: UShort = 0u,
    public var minute: UShort = 0u,
    public var second: UShort = 0u,
    public var fraction: UInt = 0u,
)

public data class TIME_STRUCT(
    public var hour: UShort = 0u,
    public var minute: UShort = 0u,
    public var second: UShort = 0u,
)

public data class VECTORRESTRICTION(public var Node: NODERESTRICTION = NODERESTRICTION(), public var RankMethod: UInt = 0u)
