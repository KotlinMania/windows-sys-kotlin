@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.search

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

public actual fun sQLAllocConnect(environmenthandle: MutPtr, connectionhandle: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLAllocConnect")

public actual fun sQLAllocEnv(environmenthandle: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLAllocEnv")

public actual fun sQLAllocHandle(handletype: Short, inputhandle: MutPtr, outputhandle: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLAllocHandle")

public actual fun sQLAllocHandleStd(fhandletype: Short, hinput: MutPtr, phoutput: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLAllocHandleStd")

public actual fun sQLAllocStmt(connectionhandle: MutPtr, statementhandle: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLAllocStmt")

public actual fun sQLBindCol(statementhandle: MutPtr, columnnumber: UShort, targettype: Short, targetvalue: MutPtr, bufferlength: Long, strlenOrInd: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLBindCol")

public actual fun sQLBindParam(statementhandle: MutPtr, parameternumber: UShort, valuetype: Short, parametertype: Short, lengthprecision: ULong, parameterscale: Short, parametervalue: MutPtr, strlenOrInd: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLBindParam")

public actual fun sQLBindParameter(hstmt: MutPtr, ipar: UShort, fparamtype: Short, fctype: Short, fsqltype: Short, cbcoldef: ULong, ibscale: Short, rgbvalue: MutPtr, cbvaluemax: Long, pcbvalue: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLBindParameter")

public actual fun sQLBrowseConnect(hdbc: MutPtr, szconnstrin: ConstPtr, cchconnstrin: Short, szconnstrout: MutPtr, cchconnstroutmax: Short, pcchconnstrout: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLBrowseConnect")

public actual fun sQLBrowseConnectA(hdbc: MutPtr, szconnstrin: ConstPtr, cbconnstrin: Short, szconnstrout: MutPtr, cbconnstroutmax: Short, pcbconnstrout: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLBrowseConnectA")

public actual fun sQLBrowseConnectW(hdbc: MutPtr, szconnstrin: ConstPtr, cchconnstrin: Short, szconnstrout: MutPtr, cchconnstroutmax: Short, pcchconnstrout: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLBrowseConnectW")

public actual fun sQLBulkOperations(statementhandle: MutPtr, operation: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLBulkOperations")

public actual fun sQLCancel(statementhandle: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLCancel")

public actual fun sQLCancelHandle(handletype: Short, inputhandle: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLCancelHandle")

public actual fun sQLCloseCursor(statementhandle: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLCloseCursor")

public actual fun sQLCloseEnumServers(henumhandle: Handle): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLCloseEnumServers")

public actual fun sQLColAttribute(statementhandle: MutPtr, columnnumber: UShort, fieldidentifier: UShort, characterattribute: MutPtr, bufferlength: Short, stringlength: MutPtr, numericattribute: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLColAttribute")

public actual fun sQLColAttributeA(hstmt: MutPtr, icol: Short, ifield: Short, pcharattr: MutPtr, cbcharattrmax: Short, pcbcharattr: MutPtr, pnumattr: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLColAttributeA")

public actual fun sQLColAttributeW(hstmt: MutPtr, icol: UShort, ifield: UShort, pcharattr: MutPtr, cbdescmax: Short, pcbcharattr: MutPtr, pnumattr: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLColAttributeW")

public actual fun sQLColAttributes(hstmt: MutPtr, icol: UShort, fdesctype: UShort, rgbdesc: MutPtr, cbdescmax: Short, pcbdesc: MutPtr, pfdesc: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLColAttributes")

public actual fun sQLColAttributesA(hstmt: MutPtr, icol: UShort, fdesctype: UShort, rgbdesc: MutPtr, cbdescmax: Short, pcbdesc: MutPtr, pfdesc: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLColAttributesA")

public actual fun sQLColAttributesW(hstmt: MutPtr, icol: UShort, fdesctype: UShort, rgbdesc: MutPtr, cbdescmax: Short, pcbdesc: MutPtr, pfdesc: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLColAttributesW")

public actual fun sQLColumnPrivileges(hstmt: MutPtr, szcatalogname: ConstPtr, cchcatalogname: Short, szschemaname: ConstPtr, cchschemaname: Short, sztablename: ConstPtr, cchtablename: Short, szcolumnname: ConstPtr, cchcolumnname: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLColumnPrivileges")

public actual fun sQLColumnPrivilegesA(hstmt: MutPtr, szcatalogname: ConstPtr, cbcatalogname: Short, szschemaname: ConstPtr, cbschemaname: Short, sztablename: ConstPtr, cbtablename: Short, szcolumnname: ConstPtr, cbcolumnname: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLColumnPrivilegesA")

public actual fun sQLColumnPrivilegesW(hstmt: MutPtr, szcatalogname: ConstPtr, cchcatalogname: Short, szschemaname: ConstPtr, cchschemaname: Short, sztablename: ConstPtr, cchtablename: Short, szcolumnname: ConstPtr, cchcolumnname: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLColumnPrivilegesW")

public actual fun sQLColumns(statementhandle: MutPtr, catalogname: ConstPtr, namelength1: Short, schemaname: ConstPtr, namelength2: Short, tablename: ConstPtr, namelength3: Short, columnname: ConstPtr, namelength4: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLColumns")

public actual fun sQLColumnsA(hstmt: MutPtr, szcatalogname: ConstPtr, cbcatalogname: Short, szschemaname: ConstPtr, cbschemaname: Short, sztablename: ConstPtr, cbtablename: Short, szcolumnname: ConstPtr, cbcolumnname: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLColumnsA")

public actual fun sQLColumnsW(hstmt: MutPtr, szcatalogname: ConstPtr, cchcatalogname: Short, szschemaname: ConstPtr, cchschemaname: Short, sztablename: ConstPtr, cchtablename: Short, szcolumnname: ConstPtr, cchcolumnname: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLColumnsW")

public actual fun sQLCompleteAsync(handletype: Short, handle: MutPtr, asyncretcodeptr: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLCompleteAsync")

public actual fun sQLConnect(connectionhandle: MutPtr, servername: ConstPtr, namelength1: Short, username: ConstPtr, namelength2: Short, authentication: ConstPtr, namelength3: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLConnect")

public actual fun sQLConnectA(hdbc: MutPtr, szdsn: ConstPtr, cbdsn: Short, szuid: ConstPtr, cbuid: Short, szauthstr: ConstPtr, cbauthstr: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLConnectA")

public actual fun sQLConnectW(hdbc: MutPtr, szdsn: ConstPtr, cchdsn: Short, szuid: ConstPtr, cchuid: Short, szauthstr: ConstPtr, cchauthstr: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLConnectW")

public actual fun sQLCopyDesc(sourcedeschandle: MutPtr, targetdeschandle: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLCopyDesc")

public actual fun sQLDataSources(environmenthandle: MutPtr, direction: UShort, servername: MutPtr, bufferlength1: Short, namelength1ptr: MutPtr, description: MutPtr, bufferlength2: Short, namelength2ptr: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLDataSources")

public actual fun sQLDataSourcesA(henv: MutPtr, fdirection: UShort, szdsn: MutPtr, cbdsnmax: Short, pcbdsn: MutPtr, szdescription: MutPtr, cbdescriptionmax: Short, pcbdescription: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLDataSourcesA")

public actual fun sQLDataSourcesW(henv: MutPtr, fdirection: UShort, szdsn: MutPtr, cchdsnmax: Short, pcchdsn: MutPtr, wszdescription: MutPtr, cchdescriptionmax: Short, pcchdescription: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLDataSourcesW")

public actual fun sQLDescribeCol(statementhandle: MutPtr, columnnumber: UShort, columnname: MutPtr, bufferlength: Short, namelength: MutPtr, datatype: MutPtr, columnsize: MutPtr, decimaldigits: MutPtr, nullable: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLDescribeCol")

public actual fun sQLDescribeColA(hstmt: MutPtr, icol: UShort, szcolname: MutPtr, cbcolnamemax: Short, pcbcolname: MutPtr, pfsqltype: MutPtr, pcbcoldef: MutPtr, pibscale: MutPtr, pfnullable: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLDescribeColA")

public actual fun sQLDescribeColW(hstmt: MutPtr, icol: UShort, szcolname: MutPtr, cchcolnamemax: Short, pcchcolname: MutPtr, pfsqltype: MutPtr, pcbcoldef: MutPtr, pibscale: MutPtr, pfnullable: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLDescribeColW")

public actual fun sQLDescribeParam(hstmt: MutPtr, ipar: UShort, pfsqltype: MutPtr, pcbparamdef: MutPtr, pibscale: MutPtr, pfnullable: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLDescribeParam")

public actual fun sQLDisconnect(connectionhandle: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLDisconnect")

public actual fun sQLDriverConnect(hdbc: MutPtr, hwnd: Long, szconnstrin: ConstPtr, cchconnstrin: Short, szconnstrout: MutPtr, cchconnstroutmax: Short, pcchconnstrout: MutPtr, fdrivercompletion: UShort): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLDriverConnect")

public actual fun sQLDriverConnectA(hdbc: MutPtr, hwnd: Long, szconnstrin: ConstPtr, cbconnstrin: Short, szconnstrout: MutPtr, cbconnstroutmax: Short, pcbconnstrout: MutPtr, fdrivercompletion: UShort): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLDriverConnectA")

public actual fun sQLDriverConnectW(hdbc: MutPtr, hwnd: Long, szconnstrin: ConstPtr, cchconnstrin: Short, szconnstrout: MutPtr, cchconnstroutmax: Short, pcchconnstrout: MutPtr, fdrivercompletion: UShort): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLDriverConnectW")

public actual fun sQLDrivers(henv: MutPtr, fdirection: UShort, szdriverdesc: MutPtr, cchdriverdescmax: Short, pcchdriverdesc: MutPtr, szdriverattributes: MutPtr, cchdrvrattrmax: Short, pcchdrvrattr: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLDrivers")

public actual fun sQLDriversA(henv: MutPtr, fdirection: UShort, szdriverdesc: MutPtr, cbdriverdescmax: Short, pcbdriverdesc: MutPtr, szdriverattributes: MutPtr, cbdrvrattrmax: Short, pcbdrvrattr: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLDriversA")

public actual fun sQLDriversW(henv: MutPtr, fdirection: UShort, szdriverdesc: MutPtr, cchdriverdescmax: Short, pcchdriverdesc: MutPtr, szdriverattributes: MutPtr, cchdrvrattrmax: Short, pcchdrvrattr: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLDriversW")

public actual fun sQLEndTran(handletype: Short, handle: MutPtr, completiontype: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLEndTran")

public actual fun sQLError(environmenthandle: MutPtr, connectionhandle: MutPtr, statementhandle: MutPtr, sqlstate: MutPtr, nativeerror: MutPtr, messagetext: MutPtr, bufferlength: Short, textlength: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLError")

public actual fun sQLErrorA(henv: MutPtr, hdbc: MutPtr, hstmt: MutPtr, szsqlstate: MutPtr, pfnativeerror: MutPtr, szerrormsg: MutPtr, cberrormsgmax: Short, pcberrormsg: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLErrorA")

public actual fun sQLErrorW(henv: MutPtr, hdbc: MutPtr, hstmt: MutPtr, wszsqlstate: MutPtr, pfnativeerror: MutPtr, wszerrormsg: MutPtr, ccherrormsgmax: Short, pccherrormsg: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLErrorW")

public actual fun sQLExecDirect(statementhandle: MutPtr, statementtext: ConstPtr, textlength: Int): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLExecDirect")

public actual fun sQLExecDirectA(hstmt: MutPtr, szsqlstr: ConstPtr, cbsqlstr: Int): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLExecDirectA")

public actual fun sQLExecDirectW(hstmt: MutPtr, szsqlstr: ConstPtr, textlength: Int): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLExecDirectW")

public actual fun sQLExecute(statementhandle: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLExecute")

public actual fun sQLExtendedFetch(hstmt: MutPtr, ffetchtype: UShort, irow: Long, pcrow: MutPtr, rgfrowstatus: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLExtendedFetch")

public actual fun sQLFetch(statementhandle: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLFetch")

public actual fun sQLFetchScroll(statementhandle: MutPtr, fetchorientation: Short, fetchoffset: Long): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLFetchScroll")

public actual fun sQLForeignKeys(hstmt: MutPtr, szpkcatalogname: ConstPtr, cchpkcatalogname: Short, szpkschemaname: ConstPtr, cchpkschemaname: Short, szpktablename: ConstPtr, cchpktablename: Short, szfkcatalogname: ConstPtr, cchfkcatalogname: Short, szfkschemaname: ConstPtr, cchfkschemaname: Short, szfktablename: ConstPtr, cchfktablename: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLForeignKeys")

public actual fun sQLForeignKeysA(hstmt: MutPtr, szpkcatalogname: ConstPtr, cbpkcatalogname: Short, szpkschemaname: ConstPtr, cbpkschemaname: Short, szpktablename: ConstPtr, cbpktablename: Short, szfkcatalogname: ConstPtr, cbfkcatalogname: Short, szfkschemaname: ConstPtr, cbfkschemaname: Short, szfktablename: ConstPtr, cbfktablename: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLForeignKeysA")

public actual fun sQLForeignKeysW(hstmt: MutPtr, szpkcatalogname: ConstPtr, cchpkcatalogname: Short, szpkschemaname: ConstPtr, cchpkschemaname: Short, szpktablename: ConstPtr, cchpktablename: Short, szfkcatalogname: ConstPtr, cchfkcatalogname: Short, szfkschemaname: ConstPtr, cchfkschemaname: Short, szfktablename: ConstPtr, cchfktablename: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLForeignKeysW")

public actual fun sQLFreeConnect(connectionhandle: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLFreeConnect")

public actual fun sQLFreeEnv(environmenthandle: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLFreeEnv")

public actual fun sQLFreeHandle(handletype: Short, handle: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLFreeHandle")

public actual fun sQLFreeStmt(statementhandle: MutPtr, option: UShort): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLFreeStmt")

public actual fun sQLGetConnectAttr(connectionhandle: MutPtr, attribute: Int, value: MutPtr, bufferlength: Int, stringlengthptr: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLGetConnectAttr")

public actual fun sQLGetConnectAttrA(hdbc: MutPtr, fattribute: Int, rgbvalue: MutPtr, cbvaluemax: Int, pcbvalue: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLGetConnectAttrA")

public actual fun sQLGetConnectAttrW(hdbc: MutPtr, fattribute: Int, rgbvalue: MutPtr, cbvaluemax: Int, pcbvalue: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLGetConnectAttrW")

public actual fun sQLGetConnectOption(connectionhandle: MutPtr, option: UShort, value: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLGetConnectOption")

public actual fun sQLGetConnectOptionA(hdbc: MutPtr, foption: UShort, pvparam: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLGetConnectOptionA")

public actual fun sQLGetConnectOptionW(hdbc: MutPtr, foption: UShort, pvparam: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLGetConnectOptionW")

public actual fun sQLGetCursorName(statementhandle: MutPtr, cursorname: MutPtr, bufferlength: Short, namelengthptr: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLGetCursorName")

public actual fun sQLGetCursorNameA(hstmt: MutPtr, szcursor: MutPtr, cbcursormax: Short, pcbcursor: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLGetCursorNameA")

public actual fun sQLGetCursorNameW(hstmt: MutPtr, szcursor: MutPtr, cchcursormax: Short, pcchcursor: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLGetCursorNameW")

public actual fun sQLGetData(statementhandle: MutPtr, columnnumber: UShort, targettype: Short, targetvalue: MutPtr, bufferlength: Long, strlenOrIndptr: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLGetData")

public actual fun sQLGetDescField(descriptorhandle: MutPtr, recnumber: Short, fieldidentifier: Short, value: MutPtr, bufferlength: Int, stringlength: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLGetDescField")

public actual fun sQLGetDescFieldA(hdesc: MutPtr, irecord: Short, ifield: Short, rgbvalue: MutPtr, cbbufferlength: Int, stringlength: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLGetDescFieldA")

public actual fun sQLGetDescFieldW(hdesc: MutPtr, irecord: Short, ifield: Short, rgbvalue: MutPtr, cbbufferlength: Int, stringlength: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLGetDescFieldW")

public actual fun sQLGetDescRec(descriptorhandle: MutPtr, recnumber: Short, name: MutPtr, bufferlength: Short, stringlengthptr: MutPtr, typeptr: MutPtr, subtypeptr: MutPtr, lengthptr: MutPtr, precisionptr: MutPtr, scaleptr: MutPtr, nullableptr: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLGetDescRec")

public actual fun sQLGetDescRecA(hdesc: MutPtr, irecord: Short, szname: MutPtr, cbnamemax: Short, pcbname: MutPtr, pftype: MutPtr, pfsubtype: MutPtr, plength: MutPtr, pprecision: MutPtr, pscale: MutPtr, pnullable: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLGetDescRecA")

public actual fun sQLGetDescRecW(hdesc: MutPtr, irecord: Short, szname: MutPtr, cchnamemax: Short, pcchname: MutPtr, pftype: MutPtr, pfsubtype: MutPtr, plength: MutPtr, pprecision: MutPtr, pscale: MutPtr, pnullable: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLGetDescRecW")

public actual fun sQLGetDiagField(handletype: Short, handle: MutPtr, recnumber: Short, diagidentifier: Short, diaginfo: MutPtr, bufferlength: Short, stringlength: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLGetDiagField")

public actual fun sQLGetDiagFieldA(fhandletype: Short, handle: MutPtr, irecord: Short, fdiagfield: Short, rgbdiaginfo: MutPtr, cbdiaginfomax: Short, pcbdiaginfo: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLGetDiagFieldA")

public actual fun sQLGetDiagFieldW(fhandletype: Short, handle: MutPtr, irecord: Short, fdiagfield: Short, rgbdiaginfo: MutPtr, cbbufferlength: Short, pcbstringlength: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLGetDiagFieldW")

public actual fun sQLGetDiagRec(handletype: Short, handle: MutPtr, recnumber: Short, sqlstate: MutPtr, nativeerror: MutPtr, messagetext: MutPtr, bufferlength: Short, textlength: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLGetDiagRec")

public actual fun sQLGetDiagRecA(fhandletype: Short, handle: MutPtr, irecord: Short, szsqlstate: MutPtr, pfnativeerror: MutPtr, szerrormsg: MutPtr, cberrormsgmax: Short, pcberrormsg: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLGetDiagRecA")

public actual fun sQLGetDiagRecW(fhandletype: Short, handle: MutPtr, irecord: Short, szsqlstate: MutPtr, pfnativeerror: MutPtr, szerrormsg: MutPtr, ccherrormsgmax: Short, pccherrormsg: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLGetDiagRecW")

public actual fun sQLGetEnvAttr(environmenthandle: MutPtr, attribute: Int, value: MutPtr, bufferlength: Int, stringlength: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLGetEnvAttr")

public actual fun sQLGetFunctions(connectionhandle: MutPtr, functionid: UShort, supported: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLGetFunctions")

public actual fun sQLGetInfo(connectionhandle: MutPtr, infotype: UShort, infovalue: MutPtr, bufferlength: Short, stringlengthptr: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLGetInfo")

public actual fun sQLGetInfoA(hdbc: MutPtr, finfotype: UShort, rgbinfovalue: MutPtr, cbinfovaluemax: Short, pcbinfovalue: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLGetInfoA")

public actual fun sQLGetInfoW(hdbc: MutPtr, finfotype: UShort, rgbinfovalue: MutPtr, cbinfovaluemax: Short, pcbinfovalue: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLGetInfoW")

public actual fun sQLGetNextEnumeration(henumhandle: Handle, prgenumdata: MutPtr, pienumlength: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLGetNextEnumeration")

public actual fun sQLGetStmtAttr(statementhandle: MutPtr, attribute: Int, value: MutPtr, bufferlength: Int, stringlength: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLGetStmtAttr")

public actual fun sQLGetStmtAttrA(hstmt: MutPtr, fattribute: Int, rgbvalue: MutPtr, cbvaluemax: Int, pcbvalue: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLGetStmtAttrA")

public actual fun sQLGetStmtAttrW(hstmt: MutPtr, fattribute: Int, rgbvalue: MutPtr, cbvaluemax: Int, pcbvalue: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLGetStmtAttrW")

public actual fun sQLGetStmtOption(statementhandle: MutPtr, option: UShort, value: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLGetStmtOption")

public actual fun sQLGetTypeInfo(statementhandle: MutPtr, datatype: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLGetTypeInfo")

public actual fun sQLGetTypeInfoA(statementhandle: MutPtr, datatype: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLGetTypeInfoA")

public actual fun sQLGetTypeInfoW(statementhandle: MutPtr, datatype: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLGetTypeInfoW")

public actual fun sQLInitEnumServers(pwchservername: Pcwstr, pwchinstancename: Pcwstr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLInitEnumServers")

public actual fun sQLLinkedCatalogsA(param0: MutPtr, param1: Pcstr, param2: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLLinkedCatalogsA")

public actual fun sQLLinkedCatalogsW(param0: MutPtr, param1: Pcwstr, param2: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLLinkedCatalogsW")

public actual fun sQLLinkedServers(param0: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLLinkedServers")

public actual fun sQLMoreResults(hstmt: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLMoreResults")

public actual fun sQLNativeSql(hdbc: MutPtr, szsqlstrin: ConstPtr, cchsqlstrin: Int, szsqlstr: MutPtr, cchsqlstrmax: Int, pcbsqlstr: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLNativeSql")

public actual fun sQLNativeSqlA(hdbc: MutPtr, szsqlstrin: ConstPtr, cbsqlstrin: Int, szsqlstr: MutPtr, cbsqlstrmax: Int, pcbsqlstr: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLNativeSqlA")

public actual fun sQLNativeSqlW(hdbc: MutPtr, szsqlstrin: ConstPtr, cchsqlstrin: Int, szsqlstr: MutPtr, cchsqlstrmax: Int, pcchsqlstr: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLNativeSqlW")

public actual fun sQLNumParams(hstmt: MutPtr, pcpar: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLNumParams")

public actual fun sQLNumResultCols(statementhandle: MutPtr, columncount: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLNumResultCols")

public actual fun sQLParamData(statementhandle: MutPtr, value: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLParamData")

public actual fun sQLParamOptions(hstmt: MutPtr, crow: ULong, pirow: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLParamOptions")

public actual fun sQLPrepare(statementhandle: MutPtr, statementtext: ConstPtr, textlength: Int): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLPrepare")

public actual fun sQLPrepareA(hstmt: MutPtr, szsqlstr: ConstPtr, cbsqlstr: Int): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLPrepareA")

public actual fun sQLPrepareW(hstmt: MutPtr, szsqlstr: ConstPtr, cchsqlstr: Int): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLPrepareW")

public actual fun sQLPrimaryKeys(hstmt: MutPtr, szcatalogname: ConstPtr, cchcatalogname: Short, szschemaname: ConstPtr, cchschemaname: Short, sztablename: ConstPtr, cchtablename: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLPrimaryKeys")

public actual fun sQLPrimaryKeysA(hstmt: MutPtr, szcatalogname: ConstPtr, cbcatalogname: Short, szschemaname: ConstPtr, cbschemaname: Short, sztablename: ConstPtr, cbtablename: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLPrimaryKeysA")

public actual fun sQLPrimaryKeysW(hstmt: MutPtr, szcatalogname: ConstPtr, cchcatalogname: Short, szschemaname: ConstPtr, cchschemaname: Short, sztablename: ConstPtr, cchtablename: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLPrimaryKeysW")

public actual fun sQLProcedureColumns(hstmt: MutPtr, szcatalogname: ConstPtr, cchcatalogname: Short, szschemaname: ConstPtr, cchschemaname: Short, szprocname: ConstPtr, cchprocname: Short, szcolumnname: ConstPtr, cchcolumnname: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLProcedureColumns")

public actual fun sQLProcedureColumnsA(hstmt: MutPtr, szcatalogname: ConstPtr, cbcatalogname: Short, szschemaname: ConstPtr, cbschemaname: Short, szprocname: ConstPtr, cbprocname: Short, szcolumnname: ConstPtr, cbcolumnname: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLProcedureColumnsA")

public actual fun sQLProcedureColumnsW(hstmt: MutPtr, szcatalogname: ConstPtr, cchcatalogname: Short, szschemaname: ConstPtr, cchschemaname: Short, szprocname: ConstPtr, cchprocname: Short, szcolumnname: ConstPtr, cchcolumnname: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLProcedureColumnsW")

public actual fun sQLProcedures(hstmt: MutPtr, szcatalogname: ConstPtr, cchcatalogname: Short, szschemaname: ConstPtr, cchschemaname: Short, szprocname: ConstPtr, cchprocname: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLProcedures")

public actual fun sQLProceduresA(hstmt: MutPtr, szcatalogname: ConstPtr, cbcatalogname: Short, szschemaname: ConstPtr, cbschemaname: Short, szprocname: ConstPtr, cbprocname: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLProceduresA")

public actual fun sQLProceduresW(hstmt: MutPtr, szcatalogname: ConstPtr, cchcatalogname: Short, szschemaname: ConstPtr, cchschemaname: Short, szprocname: ConstPtr, cchprocname: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLProceduresW")

public actual fun sQLPutData(statementhandle: MutPtr, data: ConstPtr, strlenOrInd: Long): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLPutData")

public actual fun sQLRowCount(statementhandle: ConstPtr, rowcount: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLRowCount")

public actual fun sQLSetConnectAttr(connectionhandle: MutPtr, attribute: Int, value: ConstPtr, stringlength: Int): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLSetConnectAttr")

public actual fun sQLSetConnectAttrA(hdbc: MutPtr, fattribute: Int, rgbvalue: ConstPtr, cbvalue: Int): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLSetConnectAttrA")

public actual fun sQLSetConnectAttrW(hdbc: MutPtr, fattribute: Int, rgbvalue: ConstPtr, cbvalue: Int): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLSetConnectAttrW")

public actual fun sQLSetConnectOption(connectionhandle: MutPtr, option: UShort, value: ULong): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLSetConnectOption")

public actual fun sQLSetConnectOptionA(hdbc: MutPtr, foption: UShort, vparam: ULong): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLSetConnectOptionA")

public actual fun sQLSetConnectOptionW(hdbc: MutPtr, foption: UShort, vparam: ULong): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLSetConnectOptionW")

public actual fun sQLSetCursorName(statementhandle: MutPtr, cursorname: ConstPtr, namelength: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLSetCursorName")

public actual fun sQLSetCursorNameA(hstmt: MutPtr, szcursor: ConstPtr, cbcursor: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLSetCursorNameA")

public actual fun sQLSetCursorNameW(hstmt: MutPtr, szcursor: ConstPtr, cchcursor: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLSetCursorNameW")

public actual fun sQLSetDescField(descriptorhandle: MutPtr, recnumber: Short, fieldidentifier: Short, value: ConstPtr, bufferlength: Int): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLSetDescField")

public actual fun sQLSetDescFieldW(descriptorhandle: MutPtr, recnumber: Short, fieldidentifier: Short, value: MutPtr, bufferlength: Int): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLSetDescFieldW")

public actual fun sQLSetDescRec(descriptorhandle: MutPtr, recnumber: Short, type: Short, subtype: Short, length: Long, precision: Short, scale: Short, data: MutPtr, stringlength: MutPtr, indicator: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLSetDescRec")

public actual fun sQLSetEnvAttr(environmenthandle: MutPtr, attribute: Int, value: ConstPtr, stringlength: Int): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLSetEnvAttr")

public actual fun sQLSetParam(statementhandle: MutPtr, parameternumber: UShort, valuetype: Short, parametertype: Short, lengthprecision: ULong, parameterscale: Short, parametervalue: ConstPtr, strlenOrInd: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLSetParam")

public actual fun sQLSetPos(hstmt: MutPtr, irow: ULong, foption: UShort, flock: UShort): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLSetPos")

public actual fun sQLSetScrollOptions(hstmt: MutPtr, fconcurrency: UShort, crowkeyset: Long, crowrowset: UShort): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLSetScrollOptions")

public actual fun sQLSetStmtAttr(statementhandle: MutPtr, attribute: Int, value: ConstPtr, stringlength: Int): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLSetStmtAttr")

public actual fun sQLSetStmtAttrW(hstmt: MutPtr, fattribute: Int, rgbvalue: MutPtr, cbvaluemax: Int): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLSetStmtAttrW")

public actual fun sQLSetStmtOption(statementhandle: MutPtr, option: UShort, value: ULong): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLSetStmtOption")

public actual fun sQLSpecialColumns(statementhandle: MutPtr, identifiertype: UShort, catalogname: ConstPtr, namelength1: Short, schemaname: ConstPtr, namelength2: Short, tablename: ConstPtr, namelength3: Short, scope: UShort, nullable: UShort): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLSpecialColumns")

public actual fun sQLSpecialColumnsA(hstmt: MutPtr, fcoltype: UShort, szcatalogname: ConstPtr, cbcatalogname: Short, szschemaname: ConstPtr, cbschemaname: Short, sztablename: ConstPtr, cbtablename: Short, fscope: UShort, fnullable: UShort): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLSpecialColumnsA")

public actual fun sQLSpecialColumnsW(hstmt: MutPtr, fcoltype: UShort, szcatalogname: ConstPtr, cchcatalogname: Short, szschemaname: ConstPtr, cchschemaname: Short, sztablename: ConstPtr, cchtablename: Short, fscope: UShort, fnullable: UShort): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLSpecialColumnsW")

public actual fun sQLStatistics(statementhandle: MutPtr, catalogname: ConstPtr, namelength1: Short, schemaname: ConstPtr, namelength2: Short, tablename: ConstPtr, namelength3: Short, unique: UShort, reserved: UShort): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLStatistics")

public actual fun sQLStatisticsA(hstmt: MutPtr, szcatalogname: ConstPtr, cbcatalogname: Short, szschemaname: ConstPtr, cbschemaname: Short, sztablename: ConstPtr, cbtablename: Short, funique: UShort, faccuracy: UShort): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLStatisticsA")

public actual fun sQLStatisticsW(hstmt: MutPtr, szcatalogname: ConstPtr, cchcatalogname: Short, szschemaname: ConstPtr, cchschemaname: Short, sztablename: ConstPtr, cchtablename: Short, funique: UShort, faccuracy: UShort): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLStatisticsW")

public actual fun sQLTablePrivileges(hstmt: MutPtr, szcatalogname: ConstPtr, cchcatalogname: Short, szschemaname: ConstPtr, cchschemaname: Short, sztablename: ConstPtr, cchtablename: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLTablePrivileges")

public actual fun sQLTablePrivilegesA(hstmt: MutPtr, szcatalogname: ConstPtr, cbcatalogname: Short, szschemaname: ConstPtr, cbschemaname: Short, sztablename: ConstPtr, cbtablename: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLTablePrivilegesA")

public actual fun sQLTablePrivilegesW(hstmt: MutPtr, szcatalogname: ConstPtr, cchcatalogname: Short, szschemaname: ConstPtr, cchschemaname: Short, sztablename: ConstPtr, cchtablename: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLTablePrivilegesW")

public actual fun sQLTables(statementhandle: MutPtr, catalogname: ConstPtr, namelength1: Short, schemaname: ConstPtr, namelength2: Short, tablename: ConstPtr, namelength3: Short, tabletype: ConstPtr, namelength4: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLTables")

public actual fun sQLTablesA(hstmt: MutPtr, szcatalogname: ConstPtr, cbcatalogname: Short, szschemaname: ConstPtr, cbschemaname: Short, sztablename: ConstPtr, cbtablename: Short, sztabletype: ConstPtr, cbtabletype: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLTablesA")

public actual fun sQLTablesW(hstmt: MutPtr, szcatalogname: ConstPtr, cchcatalogname: Short, szschemaname: ConstPtr, cchschemaname: Short, sztablename: ConstPtr, cchtablename: Short, sztabletype: ConstPtr, cchtabletype: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLTablesW")

public actual fun sQLTransact(environmenthandle: MutPtr, connectionhandle: MutPtr, completiontype: UShort): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchSQLTransact")

public actual fun bcpBatch(param0: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchBcpBatch")

public actual fun bcpBind(param0: MutPtr, param1: MutPtr, param2: Int, param3: Int, param4: MutPtr, param5: Int, param6: Int, param7: Int): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchBcpBind")

public actual fun bcpColfmt(param0: MutPtr, param1: Int, param2: UByte, param3: Int, param4: Int, param5: MutPtr, param6: Int, param7: Int): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchBcpColfmt")

public actual fun bcpCollen(param0: MutPtr, param1: Int, param2: Int): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchBcpCollen")

public actual fun bcpColptr(param0: MutPtr, param1: MutPtr, param2: Int): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchBcpColptr")

public actual fun bcpColumns(param0: MutPtr, param1: Int): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchBcpColumns")

public actual fun bcpControl(param0: MutPtr, param1: Int, param2: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchBcpControl")

public actual fun bcpDone(param0: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchBcpDone")

public actual fun bcpExec(param0: MutPtr, param1: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchBcpExec")

public actual fun bcpGetcolfmt(param0: MutPtr, param1: Int, param2: Int, param3: MutPtr, param4: Int, param5: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchBcpGetcolfmt")

public actual fun bcpInitA(param0: MutPtr, param1: Pcstr, param2: Pcstr, param3: Pcstr, param4: Int): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchBcpInitA")

public actual fun bcpInitW(param0: MutPtr, param1: Pcwstr, param2: Pcwstr, param3: Pcwstr, param4: Int): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchBcpInitW")

public actual fun bcpMoretext(param0: MutPtr, param1: Int, param2: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchBcpMoretext")

public actual fun bcpReadfmtA(param0: MutPtr, param1: Pcstr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchBcpReadfmtA")

public actual fun bcpReadfmtW(param0: MutPtr, param1: Pcwstr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchBcpReadfmtW")

public actual fun bcpSendrow(param0: MutPtr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchBcpSendrow")

public actual fun bcpSetcolfmt(param0: MutPtr, param1: Int, param2: Int, param3: MutPtr, param4: Int): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchBcpSetcolfmt")

public actual fun bcpWritefmtA(param0: MutPtr, param1: Pcstr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchBcpWritefmtA")

public actual fun bcpWritefmtW(param0: MutPtr, param1: Pcwstr): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchBcpWritefmtW")

public actual fun dbprtypeA(param0: Int): Pstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchDbprtypeA")

public actual fun dbprtypeW(param0: Int): Pwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemSearchDbprtypeW")
