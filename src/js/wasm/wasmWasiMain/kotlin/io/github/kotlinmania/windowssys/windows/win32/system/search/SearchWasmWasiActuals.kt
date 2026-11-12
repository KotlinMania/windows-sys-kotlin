@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.search

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

// The host must provide the C companion wrapper exports in import module windowssys.
@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemSearchODBCGetTryWaitValue")
private external fun wasiWindowssysWindowsWin32SystemSearchODBCGetTryWaitValue(): Int

public actual fun oDBCGetTryWaitValue(): UInt =
    wasiWindowssysWindowsWin32SystemSearchODBCGetTryWaitValue().toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemSearchODBCSetTryWaitValue")
private external fun wasiWindowssysWindowsWin32SystemSearchODBCSetTryWaitValue(dwvalue: Int): Int

public actual fun oDBCSetTryWaitValue(dwvalue: UInt): Bool =
    wasiWindowssysWindowsWin32SystemSearchODBCSetTryWaitValue(dwvalue.toInt())

public actual fun sQLAllocConnect(environmenthandle: MutPtr<CVoid>, connectionhandle: MutPtr<MutPtr<CVoid>>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLAllocConnect")

public actual fun sQLAllocEnv(environmenthandle: MutPtr<MutPtr<CVoid>>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLAllocEnv")

public actual fun sQLAllocHandle(handletype: Short, inputhandle: MutPtr<CVoid>, outputhandle: MutPtr<MutPtr<CVoid>>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLAllocHandle")

public actual fun sQLAllocHandleStd(fhandletype: Short, hinput: MutPtr<CVoid>, phoutput: MutPtr<MutPtr<CVoid>>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLAllocHandleStd")

public actual fun sQLAllocStmt(connectionhandle: MutPtr<CVoid>, statementhandle: MutPtr<MutPtr<CVoid>>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLAllocStmt")

public actual fun sQLBindCol(statementhandle: MutPtr<CVoid>, columnnumber: UShort, targettype: Short, targetvalue: MutPtr<CVoid>, bufferlength: Long, strlenOrInd: MutPtr<Long>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLBindCol")

public actual fun sQLBindParam(statementhandle: MutPtr<CVoid>, parameternumber: UShort, valuetype: Short, parametertype: Short, lengthprecision: ULong, parameterscale: Short, parametervalue: MutPtr<CVoid>, strlenOrInd: MutPtr<Long>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLBindParam")

public actual fun sQLBindParameter(hstmt: MutPtr<CVoid>, ipar: UShort, fparamtype: Short, fctype: Short, fsqltype: Short, cbcoldef: ULong, ibscale: Short, rgbvalue: MutPtr<CVoid>, cbvaluemax: Long, pcbvalue: MutPtr<Long>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLBindParameter")

public actual fun sQLBrowseConnect(hdbc: MutPtr<CVoid>, szconnstrin: ConstPtr<UByte>, cchconnstrin: Short, szconnstrout: MutPtr<UByte>, cchconnstroutmax: Short, pcchconnstrout: MutPtr<Short>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLBrowseConnect")

public actual fun sQLBrowseConnectA(hdbc: MutPtr<CVoid>, szconnstrin: ConstPtr<UByte>, cbconnstrin: Short, szconnstrout: MutPtr<UByte>, cbconnstroutmax: Short, pcbconnstrout: MutPtr<Short>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLBrowseConnectA")

public actual fun sQLBrowseConnectW(hdbc: MutPtr<CVoid>, szconnstrin: ConstPtr<UShort>, cchconnstrin: Short, szconnstrout: MutPtr<UShort>, cchconnstroutmax: Short, pcchconnstrout: MutPtr<Short>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLBrowseConnectW")

public actual fun sQLBulkOperations(statementhandle: MutPtr<CVoid>, operation: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLBulkOperations")

public actual fun sQLCancel(statementhandle: MutPtr<CVoid>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLCancel")

public actual fun sQLCancelHandle(handletype: Short, inputhandle: MutPtr<CVoid>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLCancelHandle")

public actual fun sQLCloseCursor(statementhandle: MutPtr<CVoid>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLCloseCursor")

public actual fun sQLCloseEnumServers(henumhandle: Handle): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLCloseEnumServers")

public actual fun sQLColAttribute(statementhandle: MutPtr<CVoid>, columnnumber: UShort, fieldidentifier: UShort, characterattribute: MutPtr<CVoid>, bufferlength: Short, stringlength: MutPtr<Short>, numericattribute: MutPtr<Long>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLColAttribute")

public actual fun sQLColAttributeA(hstmt: MutPtr<CVoid>, icol: Short, ifield: Short, pcharattr: MutPtr<CVoid>, cbcharattrmax: Short, pcbcharattr: MutPtr<Short>, pnumattr: MutPtr<Long>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLColAttributeA")

public actual fun sQLColAttributeW(hstmt: MutPtr<CVoid>, icol: UShort, ifield: UShort, pcharattr: MutPtr<CVoid>, cbdescmax: Short, pcbcharattr: MutPtr<Short>, pnumattr: MutPtr<Long>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLColAttributeW")

public actual fun sQLColAttributes(hstmt: MutPtr<CVoid>, icol: UShort, fdesctype: UShort, rgbdesc: MutPtr<CVoid>, cbdescmax: Short, pcbdesc: MutPtr<Short>, pfdesc: MutPtr<Long>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLColAttributes")

public actual fun sQLColAttributesA(hstmt: MutPtr<CVoid>, icol: UShort, fdesctype: UShort, rgbdesc: MutPtr<CVoid>, cbdescmax: Short, pcbdesc: MutPtr<Short>, pfdesc: MutPtr<Long>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLColAttributesA")

public actual fun sQLColAttributesW(hstmt: MutPtr<CVoid>, icol: UShort, fdesctype: UShort, rgbdesc: MutPtr<CVoid>, cbdescmax: Short, pcbdesc: MutPtr<Short>, pfdesc: MutPtr<Long>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLColAttributesW")

public actual fun sQLColumnPrivileges(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UByte>, cchcatalogname: Short, szschemaname: ConstPtr<UByte>, cchschemaname: Short, sztablename: ConstPtr<UByte>, cchtablename: Short, szcolumnname: ConstPtr<UByte>, cchcolumnname: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLColumnPrivileges")

public actual fun sQLColumnPrivilegesA(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UByte>, cbcatalogname: Short, szschemaname: ConstPtr<UByte>, cbschemaname: Short, sztablename: ConstPtr<UByte>, cbtablename: Short, szcolumnname: ConstPtr<UByte>, cbcolumnname: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLColumnPrivilegesA")

public actual fun sQLColumnPrivilegesW(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UShort>, cchcatalogname: Short, szschemaname: ConstPtr<UShort>, cchschemaname: Short, sztablename: ConstPtr<UShort>, cchtablename: Short, szcolumnname: ConstPtr<UShort>, cchcolumnname: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLColumnPrivilegesW")

public actual fun sQLColumns(statementhandle: MutPtr<CVoid>, catalogname: ConstPtr<UByte>, namelength1: Short, schemaname: ConstPtr<UByte>, namelength2: Short, tablename: ConstPtr<UByte>, namelength3: Short, columnname: ConstPtr<UByte>, namelength4: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLColumns")

public actual fun sQLColumnsA(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UByte>, cbcatalogname: Short, szschemaname: ConstPtr<UByte>, cbschemaname: Short, sztablename: ConstPtr<UByte>, cbtablename: Short, szcolumnname: ConstPtr<UByte>, cbcolumnname: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLColumnsA")

public actual fun sQLColumnsW(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UShort>, cchcatalogname: Short, szschemaname: ConstPtr<UShort>, cchschemaname: Short, sztablename: ConstPtr<UShort>, cchtablename: Short, szcolumnname: ConstPtr<UShort>, cchcolumnname: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLColumnsW")

public actual fun sQLCompleteAsync(handletype: Short, handle: MutPtr<CVoid>, asyncretcodeptr: MutPtr<Short>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLCompleteAsync")

public actual fun sQLConnect(connectionhandle: MutPtr<CVoid>, servername: ConstPtr<UByte>, namelength1: Short, username: ConstPtr<UByte>, namelength2: Short, authentication: ConstPtr<UByte>, namelength3: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLConnect")

public actual fun sQLConnectA(hdbc: MutPtr<CVoid>, szdsn: ConstPtr<UByte>, cbdsn: Short, szuid: ConstPtr<UByte>, cbuid: Short, szauthstr: ConstPtr<UByte>, cbauthstr: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLConnectA")

public actual fun sQLConnectW(hdbc: MutPtr<CVoid>, szdsn: ConstPtr<UShort>, cchdsn: Short, szuid: ConstPtr<UShort>, cchuid: Short, szauthstr: ConstPtr<UShort>, cchauthstr: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLConnectW")

public actual fun sQLCopyDesc(sourcedeschandle: MutPtr<CVoid>, targetdeschandle: MutPtr<CVoid>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLCopyDesc")

public actual fun sQLDataSources(environmenthandle: MutPtr<CVoid>, direction: UShort, servername: MutPtr<UByte>, bufferlength1: Short, namelength1ptr: MutPtr<Short>, description: MutPtr<UByte>, bufferlength2: Short, namelength2ptr: MutPtr<Short>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLDataSources")

public actual fun sQLDataSourcesA(henv: MutPtr<CVoid>, fdirection: UShort, szdsn: MutPtr<UByte>, cbdsnmax: Short, pcbdsn: MutPtr<Short>, szdescription: MutPtr<UByte>, cbdescriptionmax: Short, pcbdescription: MutPtr<Short>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLDataSourcesA")

public actual fun sQLDataSourcesW(henv: MutPtr<CVoid>, fdirection: UShort, szdsn: MutPtr<UShort>, cchdsnmax: Short, pcchdsn: MutPtr<Short>, wszdescription: MutPtr<UShort>, cchdescriptionmax: Short, pcchdescription: MutPtr<Short>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLDataSourcesW")

public actual fun sQLDescribeCol(statementhandle: MutPtr<CVoid>, columnnumber: UShort, columnname: MutPtr<UByte>, bufferlength: Short, namelength: MutPtr<Short>, datatype: MutPtr<Short>, columnsize: MutPtr<ULong>, decimaldigits: MutPtr<Short>, nullable: MutPtr<Short>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLDescribeCol")

public actual fun sQLDescribeColA(hstmt: MutPtr<CVoid>, icol: UShort, szcolname: MutPtr<UByte>, cbcolnamemax: Short, pcbcolname: MutPtr<Short>, pfsqltype: MutPtr<Short>, pcbcoldef: MutPtr<ULong>, pibscale: MutPtr<Short>, pfnullable: MutPtr<Short>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLDescribeColA")

public actual fun sQLDescribeColW(hstmt: MutPtr<CVoid>, icol: UShort, szcolname: MutPtr<UShort>, cchcolnamemax: Short, pcchcolname: MutPtr<Short>, pfsqltype: MutPtr<Short>, pcbcoldef: MutPtr<ULong>, pibscale: MutPtr<Short>, pfnullable: MutPtr<Short>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLDescribeColW")

public actual fun sQLDescribeParam(hstmt: MutPtr<CVoid>, ipar: UShort, pfsqltype: MutPtr<Short>, pcbparamdef: MutPtr<ULong>, pibscale: MutPtr<Short>, pfnullable: MutPtr<Short>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLDescribeParam")

public actual fun sQLDisconnect(connectionhandle: MutPtr<CVoid>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLDisconnect")

public actual fun sQLDriverConnect(hdbc: MutPtr<CVoid>, hwnd: Long, szconnstrin: ConstPtr<UByte>, cchconnstrin: Short, szconnstrout: MutPtr<UByte>, cchconnstroutmax: Short, pcchconnstrout: MutPtr<Short>, fdrivercompletion: UShort): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLDriverConnect")

public actual fun sQLDriverConnectA(hdbc: MutPtr<CVoid>, hwnd: Long, szconnstrin: ConstPtr<UByte>, cbconnstrin: Short, szconnstrout: MutPtr<UByte>, cbconnstroutmax: Short, pcbconnstrout: MutPtr<Short>, fdrivercompletion: UShort): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLDriverConnectA")

public actual fun sQLDriverConnectW(hdbc: MutPtr<CVoid>, hwnd: Long, szconnstrin: ConstPtr<UShort>, cchconnstrin: Short, szconnstrout: MutPtr<UShort>, cchconnstroutmax: Short, pcchconnstrout: MutPtr<Short>, fdrivercompletion: UShort): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLDriverConnectW")

public actual fun sQLDrivers(henv: MutPtr<CVoid>, fdirection: UShort, szdriverdesc: MutPtr<UByte>, cchdriverdescmax: Short, pcchdriverdesc: MutPtr<Short>, szdriverattributes: MutPtr<UByte>, cchdrvrattrmax: Short, pcchdrvrattr: MutPtr<Short>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLDrivers")

public actual fun sQLDriversA(henv: MutPtr<CVoid>, fdirection: UShort, szdriverdesc: MutPtr<UByte>, cbdriverdescmax: Short, pcbdriverdesc: MutPtr<Short>, szdriverattributes: MutPtr<UByte>, cbdrvrattrmax: Short, pcbdrvrattr: MutPtr<Short>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLDriversA")

public actual fun sQLDriversW(henv: MutPtr<CVoid>, fdirection: UShort, szdriverdesc: MutPtr<UShort>, cchdriverdescmax: Short, pcchdriverdesc: MutPtr<Short>, szdriverattributes: MutPtr<UShort>, cchdrvrattrmax: Short, pcchdrvrattr: MutPtr<Short>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLDriversW")

public actual fun sQLEndTran(handletype: Short, handle: MutPtr<CVoid>, completiontype: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLEndTran")

public actual fun sQLError(environmenthandle: MutPtr<CVoid>, connectionhandle: MutPtr<CVoid>, statementhandle: MutPtr<CVoid>, sqlstate: MutPtr<UByte>, nativeerror: MutPtr<Int>, messagetext: MutPtr<UByte>, bufferlength: Short, textlength: MutPtr<Short>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLError")

public actual fun sQLErrorA(henv: MutPtr<CVoid>, hdbc: MutPtr<CVoid>, hstmt: MutPtr<CVoid>, szsqlstate: MutPtr<UByte>, pfnativeerror: MutPtr<Int>, szerrormsg: MutPtr<UByte>, cberrormsgmax: Short, pcberrormsg: MutPtr<Short>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLErrorA")

public actual fun sQLErrorW(henv: MutPtr<CVoid>, hdbc: MutPtr<CVoid>, hstmt: MutPtr<CVoid>, wszsqlstate: MutPtr<UShort>, pfnativeerror: MutPtr<Int>, wszerrormsg: MutPtr<UShort>, ccherrormsgmax: Short, pccherrormsg: MutPtr<Short>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLErrorW")

public actual fun sQLExecDirect(statementhandle: MutPtr<CVoid>, statementtext: ConstPtr<UByte>, textlength: Int): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLExecDirect")

public actual fun sQLExecDirectA(hstmt: MutPtr<CVoid>, szsqlstr: ConstPtr<UByte>, cbsqlstr: Int): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLExecDirectA")

public actual fun sQLExecDirectW(hstmt: MutPtr<CVoid>, szsqlstr: ConstPtr<UShort>, textlength: Int): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLExecDirectW")

public actual fun sQLExecute(statementhandle: MutPtr<CVoid>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLExecute")

public actual fun sQLExtendedFetch(hstmt: MutPtr<CVoid>, ffetchtype: UShort, irow: Long, pcrow: MutPtr<ULong>, rgfrowstatus: MutPtr<UShort>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLExtendedFetch")

public actual fun sQLFetch(statementhandle: MutPtr<CVoid>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLFetch")

public actual fun sQLFetchScroll(statementhandle: MutPtr<CVoid>, fetchorientation: Short, fetchoffset: Long): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLFetchScroll")

public actual fun sQLForeignKeys(hstmt: MutPtr<CVoid>, szpkcatalogname: ConstPtr<UByte>, cchpkcatalogname: Short, szpkschemaname: ConstPtr<UByte>, cchpkschemaname: Short, szpktablename: ConstPtr<UByte>, cchpktablename: Short, szfkcatalogname: ConstPtr<UByte>, cchfkcatalogname: Short, szfkschemaname: ConstPtr<UByte>, cchfkschemaname: Short, szfktablename: ConstPtr<UByte>, cchfktablename: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLForeignKeys")

public actual fun sQLForeignKeysA(hstmt: MutPtr<CVoid>, szpkcatalogname: ConstPtr<UByte>, cbpkcatalogname: Short, szpkschemaname: ConstPtr<UByte>, cbpkschemaname: Short, szpktablename: ConstPtr<UByte>, cbpktablename: Short, szfkcatalogname: ConstPtr<UByte>, cbfkcatalogname: Short, szfkschemaname: ConstPtr<UByte>, cbfkschemaname: Short, szfktablename: ConstPtr<UByte>, cbfktablename: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLForeignKeysA")

public actual fun sQLForeignKeysW(hstmt: MutPtr<CVoid>, szpkcatalogname: ConstPtr<UShort>, cchpkcatalogname: Short, szpkschemaname: ConstPtr<UShort>, cchpkschemaname: Short, szpktablename: ConstPtr<UShort>, cchpktablename: Short, szfkcatalogname: ConstPtr<UShort>, cchfkcatalogname: Short, szfkschemaname: ConstPtr<UShort>, cchfkschemaname: Short, szfktablename: ConstPtr<UShort>, cchfktablename: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLForeignKeysW")

public actual fun sQLFreeConnect(connectionhandle: MutPtr<CVoid>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLFreeConnect")

public actual fun sQLFreeEnv(environmenthandle: MutPtr<CVoid>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLFreeEnv")

public actual fun sQLFreeHandle(handletype: Short, handle: MutPtr<CVoid>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLFreeHandle")

public actual fun sQLFreeStmt(statementhandle: MutPtr<CVoid>, option: UShort): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLFreeStmt")

public actual fun sQLGetConnectAttr(connectionhandle: MutPtr<CVoid>, attribute: Int, value: MutPtr<CVoid>, bufferlength: Int, stringlengthptr: MutPtr<Int>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLGetConnectAttr")

public actual fun sQLGetConnectAttrA(hdbc: MutPtr<CVoid>, fattribute: Int, rgbvalue: MutPtr<CVoid>, cbvaluemax: Int, pcbvalue: MutPtr<Int>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLGetConnectAttrA")

public actual fun sQLGetConnectAttrW(hdbc: MutPtr<CVoid>, fattribute: Int, rgbvalue: MutPtr<CVoid>, cbvaluemax: Int, pcbvalue: MutPtr<Int>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLGetConnectAttrW")

public actual fun sQLGetConnectOption(connectionhandle: MutPtr<CVoid>, option: UShort, value: MutPtr<CVoid>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLGetConnectOption")

public actual fun sQLGetConnectOptionA(hdbc: MutPtr<CVoid>, foption: UShort, pvparam: MutPtr<CVoid>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLGetConnectOptionA")

public actual fun sQLGetConnectOptionW(hdbc: MutPtr<CVoid>, foption: UShort, pvparam: MutPtr<CVoid>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLGetConnectOptionW")

public actual fun sQLGetCursorName(statementhandle: MutPtr<CVoid>, cursorname: MutPtr<UByte>, bufferlength: Short, namelengthptr: MutPtr<Short>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLGetCursorName")

public actual fun sQLGetCursorNameA(hstmt: MutPtr<CVoid>, szcursor: MutPtr<UByte>, cbcursormax: Short, pcbcursor: MutPtr<Short>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLGetCursorNameA")

public actual fun sQLGetCursorNameW(hstmt: MutPtr<CVoid>, szcursor: MutPtr<UShort>, cchcursormax: Short, pcchcursor: MutPtr<Short>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLGetCursorNameW")

public actual fun sQLGetData(statementhandle: MutPtr<CVoid>, columnnumber: UShort, targettype: Short, targetvalue: MutPtr<CVoid>, bufferlength: Long, strlenOrIndptr: MutPtr<Long>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLGetData")

public actual fun sQLGetDescField(descriptorhandle: MutPtr<CVoid>, recnumber: Short, fieldidentifier: Short, value: MutPtr<CVoid>, bufferlength: Int, stringlength: MutPtr<Int>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLGetDescField")

public actual fun sQLGetDescFieldA(hdesc: MutPtr<CVoid>, irecord: Short, ifield: Short, rgbvalue: MutPtr<CVoid>, cbbufferlength: Int, stringlength: MutPtr<Int>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLGetDescFieldA")

public actual fun sQLGetDescFieldW(hdesc: MutPtr<CVoid>, irecord: Short, ifield: Short, rgbvalue: MutPtr<CVoid>, cbbufferlength: Int, stringlength: MutPtr<Int>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLGetDescFieldW")

public actual fun sQLGetDescRec(descriptorhandle: MutPtr<CVoid>, recnumber: Short, name: MutPtr<UByte>, bufferlength: Short, stringlengthptr: MutPtr<Short>, typeptr: MutPtr<Short>, subtypeptr: MutPtr<Short>, lengthptr: MutPtr<Long>, precisionptr: MutPtr<Short>, scaleptr: MutPtr<Short>, nullableptr: MutPtr<Short>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLGetDescRec")

public actual fun sQLGetDescRecA(hdesc: MutPtr<CVoid>, irecord: Short, szname: MutPtr<UByte>, cbnamemax: Short, pcbname: MutPtr<Short>, pftype: MutPtr<Short>, pfsubtype: MutPtr<Short>, plength: MutPtr<Long>, pprecision: MutPtr<Short>, pscale: MutPtr<Short>, pnullable: MutPtr<Short>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLGetDescRecA")

public actual fun sQLGetDescRecW(hdesc: MutPtr<CVoid>, irecord: Short, szname: MutPtr<UShort>, cchnamemax: Short, pcchname: MutPtr<Short>, pftype: MutPtr<Short>, pfsubtype: MutPtr<Short>, plength: MutPtr<Long>, pprecision: MutPtr<Short>, pscale: MutPtr<Short>, pnullable: MutPtr<Short>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLGetDescRecW")

public actual fun sQLGetDiagField(handletype: Short, handle: MutPtr<CVoid>, recnumber: Short, diagidentifier: Short, diaginfo: MutPtr<CVoid>, bufferlength: Short, stringlength: MutPtr<Short>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLGetDiagField")

public actual fun sQLGetDiagFieldA(fhandletype: Short, handle: MutPtr<CVoid>, irecord: Short, fdiagfield: Short, rgbdiaginfo: MutPtr<CVoid>, cbdiaginfomax: Short, pcbdiaginfo: MutPtr<Short>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLGetDiagFieldA")

public actual fun sQLGetDiagFieldW(fhandletype: Short, handle: MutPtr<CVoid>, irecord: Short, fdiagfield: Short, rgbdiaginfo: MutPtr<CVoid>, cbbufferlength: Short, pcbstringlength: MutPtr<Short>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLGetDiagFieldW")

public actual fun sQLGetDiagRec(handletype: Short, handle: MutPtr<CVoid>, recnumber: Short, sqlstate: MutPtr<UByte>, nativeerror: MutPtr<Int>, messagetext: MutPtr<UByte>, bufferlength: Short, textlength: MutPtr<Short>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLGetDiagRec")

public actual fun sQLGetDiagRecA(fhandletype: Short, handle: MutPtr<CVoid>, irecord: Short, szsqlstate: MutPtr<UByte>, pfnativeerror: MutPtr<Int>, szerrormsg: MutPtr<UByte>, cberrormsgmax: Short, pcberrormsg: MutPtr<Short>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLGetDiagRecA")

public actual fun sQLGetDiagRecW(fhandletype: Short, handle: MutPtr<CVoid>, irecord: Short, szsqlstate: MutPtr<UShort>, pfnativeerror: MutPtr<Int>, szerrormsg: MutPtr<UShort>, ccherrormsgmax: Short, pccherrormsg: MutPtr<Short>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLGetDiagRecW")

public actual fun sQLGetEnvAttr(environmenthandle: MutPtr<CVoid>, attribute: Int, value: MutPtr<CVoid>, bufferlength: Int, stringlength: MutPtr<Int>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLGetEnvAttr")

public actual fun sQLGetFunctions(connectionhandle: MutPtr<CVoid>, functionid: UShort, supported: MutPtr<UShort>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLGetFunctions")

public actual fun sQLGetInfo(connectionhandle: MutPtr<CVoid>, infotype: UShort, infovalue: MutPtr<CVoid>, bufferlength: Short, stringlengthptr: MutPtr<Short>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLGetInfo")

public actual fun sQLGetInfoA(hdbc: MutPtr<CVoid>, finfotype: UShort, rgbinfovalue: MutPtr<CVoid>, cbinfovaluemax: Short, pcbinfovalue: MutPtr<Short>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLGetInfoA")

public actual fun sQLGetInfoW(hdbc: MutPtr<CVoid>, finfotype: UShort, rgbinfovalue: MutPtr<CVoid>, cbinfovaluemax: Short, pcbinfovalue: MutPtr<Short>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLGetInfoW")

public actual fun sQLGetNextEnumeration(henumhandle: Handle, prgenumdata: MutPtr<UByte>, pienumlength: MutPtr<Int>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLGetNextEnumeration")

public actual fun sQLGetStmtAttr(statementhandle: MutPtr<CVoid>, attribute: Int, value: MutPtr<CVoid>, bufferlength: Int, stringlength: MutPtr<Int>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLGetStmtAttr")

public actual fun sQLGetStmtAttrA(hstmt: MutPtr<CVoid>, fattribute: Int, rgbvalue: MutPtr<CVoid>, cbvaluemax: Int, pcbvalue: MutPtr<Int>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLGetStmtAttrA")

public actual fun sQLGetStmtAttrW(hstmt: MutPtr<CVoid>, fattribute: Int, rgbvalue: MutPtr<CVoid>, cbvaluemax: Int, pcbvalue: MutPtr<Int>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLGetStmtAttrW")

public actual fun sQLGetStmtOption(statementhandle: MutPtr<CVoid>, option: UShort, value: MutPtr<CVoid>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLGetStmtOption")

public actual fun sQLGetTypeInfo(statementhandle: MutPtr<CVoid>, datatype: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLGetTypeInfo")

public actual fun sQLGetTypeInfoA(statementhandle: MutPtr<CVoid>, datatype: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLGetTypeInfoA")

public actual fun sQLGetTypeInfoW(statementhandle: MutPtr<CVoid>, datatype: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLGetTypeInfoW")

public actual fun sQLInitEnumServers(pwchservername: Pcwstr, pwchinstancename: Pcwstr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLInitEnumServers")

public actual fun sQLLinkedCatalogsA(param0: MutPtr<CVoid>, param1: Pcstr, param2: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLLinkedCatalogsA")

public actual fun sQLLinkedCatalogsW(param0: MutPtr<CVoid>, param1: Pcwstr, param2: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLLinkedCatalogsW")

public actual fun sQLLinkedServers(param0: MutPtr<CVoid>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLLinkedServers")

public actual fun sQLMoreResults(hstmt: MutPtr<CVoid>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLMoreResults")

public actual fun sQLNativeSql(hdbc: MutPtr<CVoid>, szsqlstrin: ConstPtr<UByte>, cchsqlstrin: Int, szsqlstr: MutPtr<UByte>, cchsqlstrmax: Int, pcbsqlstr: MutPtr<Int>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLNativeSql")

public actual fun sQLNativeSqlA(hdbc: MutPtr<CVoid>, szsqlstrin: ConstPtr<UByte>, cbsqlstrin: Int, szsqlstr: MutPtr<UByte>, cbsqlstrmax: Int, pcbsqlstr: MutPtr<Int>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLNativeSqlA")

public actual fun sQLNativeSqlW(hdbc: MutPtr<CVoid>, szsqlstrin: ConstPtr<UShort>, cchsqlstrin: Int, szsqlstr: MutPtr<UShort>, cchsqlstrmax: Int, pcchsqlstr: MutPtr<Int>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLNativeSqlW")

public actual fun sQLNumParams(hstmt: MutPtr<CVoid>, pcpar: MutPtr<Short>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLNumParams")

public actual fun sQLNumResultCols(statementhandle: MutPtr<CVoid>, columncount: MutPtr<Short>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLNumResultCols")

public actual fun sQLParamData(statementhandle: MutPtr<CVoid>, value: MutPtr<MutPtr<CVoid>>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLParamData")

public actual fun sQLParamOptions(hstmt: MutPtr<CVoid>, crow: ULong, pirow: MutPtr<ULong>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLParamOptions")

public actual fun sQLPrepare(statementhandle: MutPtr<CVoid>, statementtext: ConstPtr<UByte>, textlength: Int): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLPrepare")

public actual fun sQLPrepareA(hstmt: MutPtr<CVoid>, szsqlstr: ConstPtr<UByte>, cbsqlstr: Int): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLPrepareA")

public actual fun sQLPrepareW(hstmt: MutPtr<CVoid>, szsqlstr: ConstPtr<UShort>, cchsqlstr: Int): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLPrepareW")

public actual fun sQLPrimaryKeys(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UByte>, cchcatalogname: Short, szschemaname: ConstPtr<UByte>, cchschemaname: Short, sztablename: ConstPtr<UByte>, cchtablename: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLPrimaryKeys")

public actual fun sQLPrimaryKeysA(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UByte>, cbcatalogname: Short, szschemaname: ConstPtr<UByte>, cbschemaname: Short, sztablename: ConstPtr<UByte>, cbtablename: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLPrimaryKeysA")

public actual fun sQLPrimaryKeysW(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UShort>, cchcatalogname: Short, szschemaname: ConstPtr<UShort>, cchschemaname: Short, sztablename: ConstPtr<UShort>, cchtablename: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLPrimaryKeysW")

public actual fun sQLProcedureColumns(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UByte>, cchcatalogname: Short, szschemaname: ConstPtr<UByte>, cchschemaname: Short, szprocname: ConstPtr<UByte>, cchprocname: Short, szcolumnname: ConstPtr<UByte>, cchcolumnname: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLProcedureColumns")

public actual fun sQLProcedureColumnsA(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UByte>, cbcatalogname: Short, szschemaname: ConstPtr<UByte>, cbschemaname: Short, szprocname: ConstPtr<UByte>, cbprocname: Short, szcolumnname: ConstPtr<UByte>, cbcolumnname: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLProcedureColumnsA")

public actual fun sQLProcedureColumnsW(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UShort>, cchcatalogname: Short, szschemaname: ConstPtr<UShort>, cchschemaname: Short, szprocname: ConstPtr<UShort>, cchprocname: Short, szcolumnname: ConstPtr<UShort>, cchcolumnname: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLProcedureColumnsW")

public actual fun sQLProcedures(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UByte>, cchcatalogname: Short, szschemaname: ConstPtr<UByte>, cchschemaname: Short, szprocname: ConstPtr<UByte>, cchprocname: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLProcedures")

public actual fun sQLProceduresA(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UByte>, cbcatalogname: Short, szschemaname: ConstPtr<UByte>, cbschemaname: Short, szprocname: ConstPtr<UByte>, cbprocname: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLProceduresA")

public actual fun sQLProceduresW(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UShort>, cchcatalogname: Short, szschemaname: ConstPtr<UShort>, cchschemaname: Short, szprocname: ConstPtr<UShort>, cchprocname: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLProceduresW")

public actual fun sQLPutData(statementhandle: MutPtr<CVoid>, data: ConstPtr<CVoid>, strlenOrInd: Long): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLPutData")

public actual fun sQLRowCount(statementhandle: ConstPtr<CVoid>, rowcount: MutPtr<Long>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLRowCount")

public actual fun sQLSetConnectAttr(connectionhandle: MutPtr<CVoid>, attribute: Int, value: ConstPtr<CVoid>, stringlength: Int): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLSetConnectAttr")

public actual fun sQLSetConnectAttrA(hdbc: MutPtr<CVoid>, fattribute: Int, rgbvalue: ConstPtr<CVoid>, cbvalue: Int): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLSetConnectAttrA")

public actual fun sQLSetConnectAttrW(hdbc: MutPtr<CVoid>, fattribute: Int, rgbvalue: ConstPtr<CVoid>, cbvalue: Int): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLSetConnectAttrW")

public actual fun sQLSetConnectOption(connectionhandle: MutPtr<CVoid>, option: UShort, value: ULong): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLSetConnectOption")

public actual fun sQLSetConnectOptionA(hdbc: MutPtr<CVoid>, foption: UShort, vparam: ULong): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLSetConnectOptionA")

public actual fun sQLSetConnectOptionW(hdbc: MutPtr<CVoid>, foption: UShort, vparam: ULong): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLSetConnectOptionW")

public actual fun sQLSetCursorName(statementhandle: MutPtr<CVoid>, cursorname: ConstPtr<UByte>, namelength: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLSetCursorName")

public actual fun sQLSetCursorNameA(hstmt: MutPtr<CVoid>, szcursor: ConstPtr<UByte>, cbcursor: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLSetCursorNameA")

public actual fun sQLSetCursorNameW(hstmt: MutPtr<CVoid>, szcursor: ConstPtr<UShort>, cchcursor: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLSetCursorNameW")

public actual fun sQLSetDescField(descriptorhandle: MutPtr<CVoid>, recnumber: Short, fieldidentifier: Short, value: ConstPtr<CVoid>, bufferlength: Int): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLSetDescField")

public actual fun sQLSetDescFieldW(descriptorhandle: MutPtr<CVoid>, recnumber: Short, fieldidentifier: Short, value: MutPtr<CVoid>, bufferlength: Int): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLSetDescFieldW")

public actual fun sQLSetDescRec(descriptorhandle: MutPtr<CVoid>, recnumber: Short, type: Short, subtype: Short, length: Long, precision: Short, scale: Short, data: MutPtr<CVoid>, stringlength: MutPtr<Long>, indicator: MutPtr<Long>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLSetDescRec")

public actual fun sQLSetEnvAttr(environmenthandle: MutPtr<CVoid>, attribute: Int, value: ConstPtr<CVoid>, stringlength: Int): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLSetEnvAttr")

public actual fun sQLSetParam(statementhandle: MutPtr<CVoid>, parameternumber: UShort, valuetype: Short, parametertype: Short, lengthprecision: ULong, parameterscale: Short, parametervalue: ConstPtr<CVoid>, strlenOrInd: MutPtr<Long>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLSetParam")

public actual fun sQLSetPos(hstmt: MutPtr<CVoid>, irow: ULong, foption: UShort, flock: UShort): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLSetPos")

public actual fun sQLSetScrollOptions(hstmt: MutPtr<CVoid>, fconcurrency: UShort, crowkeyset: Long, crowrowset: UShort): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLSetScrollOptions")

public actual fun sQLSetStmtAttr(statementhandle: MutPtr<CVoid>, attribute: Int, value: ConstPtr<CVoid>, stringlength: Int): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLSetStmtAttr")

public actual fun sQLSetStmtAttrW(hstmt: MutPtr<CVoid>, fattribute: Int, rgbvalue: MutPtr<CVoid>, cbvaluemax: Int): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLSetStmtAttrW")

public actual fun sQLSetStmtOption(statementhandle: MutPtr<CVoid>, option: UShort, value: ULong): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLSetStmtOption")

public actual fun sQLSpecialColumns(statementhandle: MutPtr<CVoid>, identifiertype: UShort, catalogname: ConstPtr<UByte>, namelength1: Short, schemaname: ConstPtr<UByte>, namelength2: Short, tablename: ConstPtr<UByte>, namelength3: Short, scope: UShort, nullable: UShort): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLSpecialColumns")

public actual fun sQLSpecialColumnsA(hstmt: MutPtr<CVoid>, fcoltype: UShort, szcatalogname: ConstPtr<UByte>, cbcatalogname: Short, szschemaname: ConstPtr<UByte>, cbschemaname: Short, sztablename: ConstPtr<UByte>, cbtablename: Short, fscope: UShort, fnullable: UShort): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLSpecialColumnsA")

public actual fun sQLSpecialColumnsW(hstmt: MutPtr<CVoid>, fcoltype: UShort, szcatalogname: ConstPtr<UShort>, cchcatalogname: Short, szschemaname: ConstPtr<UShort>, cchschemaname: Short, sztablename: ConstPtr<UShort>, cchtablename: Short, fscope: UShort, fnullable: UShort): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLSpecialColumnsW")

public actual fun sQLStatistics(statementhandle: MutPtr<CVoid>, catalogname: ConstPtr<UByte>, namelength1: Short, schemaname: ConstPtr<UByte>, namelength2: Short, tablename: ConstPtr<UByte>, namelength3: Short, unique: UShort, reserved: UShort): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLStatistics")

public actual fun sQLStatisticsA(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UByte>, cbcatalogname: Short, szschemaname: ConstPtr<UByte>, cbschemaname: Short, sztablename: ConstPtr<UByte>, cbtablename: Short, funique: UShort, faccuracy: UShort): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLStatisticsA")

public actual fun sQLStatisticsW(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UShort>, cchcatalogname: Short, szschemaname: ConstPtr<UShort>, cchschemaname: Short, sztablename: ConstPtr<UShort>, cchtablename: Short, funique: UShort, faccuracy: UShort): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLStatisticsW")

public actual fun sQLTablePrivileges(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UByte>, cchcatalogname: Short, szschemaname: ConstPtr<UByte>, cchschemaname: Short, sztablename: ConstPtr<UByte>, cchtablename: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLTablePrivileges")

public actual fun sQLTablePrivilegesA(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UByte>, cbcatalogname: Short, szschemaname: ConstPtr<UByte>, cbschemaname: Short, sztablename: ConstPtr<UByte>, cbtablename: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLTablePrivilegesA")

public actual fun sQLTablePrivilegesW(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UShort>, cchcatalogname: Short, szschemaname: ConstPtr<UShort>, cchschemaname: Short, sztablename: ConstPtr<UShort>, cchtablename: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLTablePrivilegesW")

public actual fun sQLTables(statementhandle: MutPtr<CVoid>, catalogname: ConstPtr<UByte>, namelength1: Short, schemaname: ConstPtr<UByte>, namelength2: Short, tablename: ConstPtr<UByte>, namelength3: Short, tabletype: ConstPtr<UByte>, namelength4: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLTables")

public actual fun sQLTablesA(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UByte>, cbcatalogname: Short, szschemaname: ConstPtr<UByte>, cbschemaname: Short, sztablename: ConstPtr<UByte>, cbtablename: Short, sztabletype: ConstPtr<UByte>, cbtabletype: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLTablesA")

public actual fun sQLTablesW(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UShort>, cchcatalogname: Short, szschemaname: ConstPtr<UShort>, cchschemaname: Short, sztablename: ConstPtr<UShort>, cchtablename: Short, sztabletype: ConstPtr<UShort>, cchtabletype: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLTablesW")

public actual fun sQLTransact(environmenthandle: MutPtr<CVoid>, connectionhandle: MutPtr<CVoid>, completiontype: UShort): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLTransact")

public actual fun bcpBatch(param0: MutPtr<CVoid>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchBcpBatch")

public actual fun bcpBind(param0: MutPtr<CVoid>, param1: MutPtr<UByte>, param2: Int, param3: Int, param4: MutPtr<UByte>, param5: Int, param6: Int, param7: Int): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchBcpBind")

public actual fun bcpColfmt(param0: MutPtr<CVoid>, param1: Int, param2: UByte, param3: Int, param4: Int, param5: MutPtr<UByte>, param6: Int, param7: Int): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchBcpColfmt")

public actual fun bcpCollen(param0: MutPtr<CVoid>, param1: Int, param2: Int): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchBcpCollen")

public actual fun bcpColptr(param0: MutPtr<CVoid>, param1: MutPtr<UByte>, param2: Int): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchBcpColptr")

public actual fun bcpColumns(param0: MutPtr<CVoid>, param1: Int): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchBcpColumns")

public actual fun bcpControl(param0: MutPtr<CVoid>, param1: Int, param2: MutPtr<CVoid>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchBcpControl")

public actual fun bcpDone(param0: MutPtr<CVoid>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchBcpDone")

public actual fun bcpExec(param0: MutPtr<CVoid>, param1: MutPtr<Int>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchBcpExec")

public actual fun bcpGetcolfmt(param0: MutPtr<CVoid>, param1: Int, param2: Int, param3: MutPtr<CVoid>, param4: Int, param5: MutPtr<Int>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchBcpGetcolfmt")

public actual fun bcpInitA(param0: MutPtr<CVoid>, param1: Pcstr, param2: Pcstr, param3: Pcstr, param4: Int): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchBcpInitA")

public actual fun bcpInitW(param0: MutPtr<CVoid>, param1: Pcwstr, param2: Pcwstr, param3: Pcwstr, param4: Int): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchBcpInitW")

public actual fun bcpMoretext(param0: MutPtr<CVoid>, param1: Int, param2: MutPtr<UByte>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchBcpMoretext")

public actual fun bcpReadfmtA(param0: MutPtr<CVoid>, param1: Pcstr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchBcpReadfmtA")

public actual fun bcpReadfmtW(param0: MutPtr<CVoid>, param1: Pcwstr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchBcpReadfmtW")

public actual fun bcpSendrow(param0: MutPtr<CVoid>): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchBcpSendrow")

public actual fun bcpSetcolfmt(param0: MutPtr<CVoid>, param1: Int, param2: Int, param3: MutPtr<CVoid>, param4: Int): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchBcpSetcolfmt")

public actual fun bcpWritefmtA(param0: MutPtr<CVoid>, param1: Pcstr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchBcpWritefmtA")

public actual fun bcpWritefmtW(param0: MutPtr<CVoid>, param1: Pcwstr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchBcpWritefmtW")

public actual fun dbprtypeA(param0: Int): Pstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchDbprtypeA")

public actual fun dbprtypeW(param0: Int): Pwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchDbprtypeW")
