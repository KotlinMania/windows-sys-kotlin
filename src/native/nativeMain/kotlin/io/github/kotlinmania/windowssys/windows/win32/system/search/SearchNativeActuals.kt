@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.search

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun ODBCGetTryWaitValue(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_ODBCGetTryWaitValue()

public actual fun ODBCSetTryWaitValue(dwvalue: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_ODBCSetTryWaitValue(dwvalue)

public actual fun SQLAllocConnect(environmenthandle: Long, connectionhandle: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLAllocConnect(environmenthandle.toCPointer<ByteVar>(), connectionhandle.toCPointer<ByteVar>())

public actual fun SQLAllocEnv(environmenthandle: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLAllocEnv(environmenthandle.toCPointer<ByteVar>())

public actual fun SQLAllocHandle(handletype: Short, inputhandle: Long, outputhandle: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLAllocHandle(handletype, inputhandle.toCPointer<ByteVar>(), outputhandle.toCPointer<ByteVar>())

public actual fun SQLAllocHandleStd(fhandletype: Short, hinput: Long, phoutput: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLAllocHandleStd(fhandletype, hinput.toCPointer<ByteVar>(), phoutput.toCPointer<ByteVar>())

public actual fun SQLAllocStmt(connectionhandle: Long, statementhandle: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLAllocStmt(connectionhandle.toCPointer<ByteVar>(), statementhandle.toCPointer<ByteVar>())

public actual fun SQLBindCol(statementhandle: Long, columnnumber: UShort, targettype: Short, targetvalue: Long, bufferlength: Long, strlen_or_ind: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLBindCol(statementhandle.toCPointer<ByteVar>(), columnnumber, targettype, targetvalue.toCPointer<ByteVar>(), bufferlength, strlen_or_ind.toCPointer<ByteVar>())

public actual fun SQLBindParam(statementhandle: Long, parameternumber: UShort, valuetype: Short, parametertype: Short, lengthprecision: ULong, parameterscale: Short, parametervalue: Long, strlen_or_ind: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLBindParam(statementhandle.toCPointer<ByteVar>(), parameternumber, valuetype, parametertype, lengthprecision, parameterscale, parametervalue.toCPointer<ByteVar>(), strlen_or_ind.toCPointer<ByteVar>())

public actual fun SQLBindParameter(hstmt: Long, ipar: UShort, fparamtype: Short, fctype: Short, fsqltype: Short, cbcoldef: ULong, ibscale: Short, rgbvalue: Long, cbvaluemax: Long, pcbvalue: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLBindParameter(hstmt.toCPointer<ByteVar>(), ipar, fparamtype, fctype, fsqltype, cbcoldef, ibscale, rgbvalue.toCPointer<ByteVar>(), cbvaluemax, pcbvalue.toCPointer<ByteVar>())

public actual fun SQLBrowseConnect(hdbc: Long, szconnstrin: Long, cchconnstrin: Short, szconnstrout: Long, cchconnstroutmax: Short, pcchconnstrout: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLBrowseConnect(hdbc.toCPointer<ByteVar>(), szconnstrin.toCPointer<ByteVar>(), cchconnstrin, szconnstrout.toCPointer<ByteVar>(), cchconnstroutmax, pcchconnstrout.toCPointer<ByteVar>())

public actual fun SQLBrowseConnectA(hdbc: Long, szconnstrin: Long, cbconnstrin: Short, szconnstrout: Long, cbconnstroutmax: Short, pcbconnstrout: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLBrowseConnectA(hdbc.toCPointer<ByteVar>(), szconnstrin.toCPointer<ByteVar>(), cbconnstrin, szconnstrout.toCPointer<ByteVar>(), cbconnstroutmax, pcbconnstrout.toCPointer<ByteVar>())

public actual fun SQLBrowseConnectW(hdbc: Long, szconnstrin: Long, cchconnstrin: Short, szconnstrout: Long, cchconnstroutmax: Short, pcchconnstrout: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLBrowseConnectW(hdbc.toCPointer<ByteVar>(), szconnstrin.toCPointer<ByteVar>(), cchconnstrin, szconnstrout.toCPointer<ByteVar>(), cchconnstroutmax, pcchconnstrout.toCPointer<ByteVar>())

public actual fun SQLBulkOperations(statementhandle: Long, operation: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLBulkOperations(statementhandle.toCPointer<ByteVar>(), operation)

public actual fun SQLCancel(statementhandle: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLCancel(statementhandle.toCPointer<ByteVar>())

public actual fun SQLCancelHandle(handletype: Short, inputhandle: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLCancelHandle(handletype, inputhandle.toCPointer<ByteVar>())

public actual fun SQLCloseCursor(statementhandle: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLCloseCursor(statementhandle.toCPointer<ByteVar>())

public actual fun SQLCloseEnumServers(henumhandle: HANDLE): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLCloseEnumServers(henumhandle.toCPointer<ByteVar>())

public actual fun SQLColAttribute(statementhandle: Long, columnnumber: UShort, fieldidentifier: UShort, characterattribute: Long, bufferlength: Short, stringlength: Long, numericattribute: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLColAttribute(statementhandle.toCPointer<ByteVar>(), columnnumber, fieldidentifier, characterattribute.toCPointer<ByteVar>(), bufferlength, stringlength.toCPointer<ByteVar>(), numericattribute.toCPointer<ByteVar>())

public actual fun SQLColAttributeA(hstmt: Long, icol: Short, ifield: Short, pcharattr: Long, cbcharattrmax: Short, pcbcharattr: Long, pnumattr: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLColAttributeA(hstmt.toCPointer<ByteVar>(), icol, ifield, pcharattr.toCPointer<ByteVar>(), cbcharattrmax, pcbcharattr.toCPointer<ByteVar>(), pnumattr.toCPointer<ByteVar>())

public actual fun SQLColAttributeW(hstmt: Long, icol: UShort, ifield: UShort, pcharattr: Long, cbdescmax: Short, pcbcharattr: Long, pnumattr: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLColAttributeW(hstmt.toCPointer<ByteVar>(), icol, ifield, pcharattr.toCPointer<ByteVar>(), cbdescmax, pcbcharattr.toCPointer<ByteVar>(), pnumattr.toCPointer<ByteVar>())

public actual fun SQLColAttributes(hstmt: Long, icol: UShort, fdesctype: UShort, rgbdesc: Long, cbdescmax: Short, pcbdesc: Long, pfdesc: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLColAttributes(hstmt.toCPointer<ByteVar>(), icol, fdesctype, rgbdesc.toCPointer<ByteVar>(), cbdescmax, pcbdesc.toCPointer<ByteVar>(), pfdesc.toCPointer<ByteVar>())

public actual fun SQLColAttributesA(hstmt: Long, icol: UShort, fdesctype: UShort, rgbdesc: Long, cbdescmax: Short, pcbdesc: Long, pfdesc: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLColAttributesA(hstmt.toCPointer<ByteVar>(), icol, fdesctype, rgbdesc.toCPointer<ByteVar>(), cbdescmax, pcbdesc.toCPointer<ByteVar>(), pfdesc.toCPointer<ByteVar>())

public actual fun SQLColAttributesW(hstmt: Long, icol: UShort, fdesctype: UShort, rgbdesc: Long, cbdescmax: Short, pcbdesc: Long, pfdesc: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLColAttributesW(hstmt.toCPointer<ByteVar>(), icol, fdesctype, rgbdesc.toCPointer<ByteVar>(), cbdescmax, pcbdesc.toCPointer<ByteVar>(), pfdesc.toCPointer<ByteVar>())

public actual fun SQLColumnPrivileges(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short, szcolumnname: Long, cchcolumnname: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLColumnPrivileges(hstmt.toCPointer<ByteVar>(), szcatalogname.toCPointer<ByteVar>(), cchcatalogname, szschemaname.toCPointer<ByteVar>(), cchschemaname, sztablename.toCPointer<ByteVar>(), cchtablename, szcolumnname.toCPointer<ByteVar>(), cchcolumnname)

public actual fun SQLColumnPrivilegesA(hstmt: Long, szcatalogname: Long, cbcatalogname: Short, szschemaname: Long, cbschemaname: Short, sztablename: Long, cbtablename: Short, szcolumnname: Long, cbcolumnname: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLColumnPrivilegesA(hstmt.toCPointer<ByteVar>(), szcatalogname.toCPointer<ByteVar>(), cbcatalogname, szschemaname.toCPointer<ByteVar>(), cbschemaname, sztablename.toCPointer<ByteVar>(), cbtablename, szcolumnname.toCPointer<ByteVar>(), cbcolumnname)

public actual fun SQLColumnPrivilegesW(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short, szcolumnname: Long, cchcolumnname: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLColumnPrivilegesW(hstmt.toCPointer<ByteVar>(), szcatalogname.toCPointer<ByteVar>(), cchcatalogname, szschemaname.toCPointer<ByteVar>(), cchschemaname, sztablename.toCPointer<ByteVar>(), cchtablename, szcolumnname.toCPointer<ByteVar>(), cchcolumnname)

public actual fun SQLColumns(statementhandle: Long, catalogname: Long, namelength1: Short, schemaname: Long, namelength2: Short, tablename: Long, namelength3: Short, columnname: Long, namelength4: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLColumns(statementhandle.toCPointer<ByteVar>(), catalogname.toCPointer<ByteVar>(), namelength1, schemaname.toCPointer<ByteVar>(), namelength2, tablename.toCPointer<ByteVar>(), namelength3, columnname.toCPointer<ByteVar>(), namelength4)

public actual fun SQLColumnsA(hstmt: Long, szcatalogname: Long, cbcatalogname: Short, szschemaname: Long, cbschemaname: Short, sztablename: Long, cbtablename: Short, szcolumnname: Long, cbcolumnname: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLColumnsA(hstmt.toCPointer<ByteVar>(), szcatalogname.toCPointer<ByteVar>(), cbcatalogname, szschemaname.toCPointer<ByteVar>(), cbschemaname, sztablename.toCPointer<ByteVar>(), cbtablename, szcolumnname.toCPointer<ByteVar>(), cbcolumnname)

public actual fun SQLColumnsW(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short, szcolumnname: Long, cchcolumnname: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLColumnsW(hstmt.toCPointer<ByteVar>(), szcatalogname.toCPointer<ByteVar>(), cchcatalogname, szschemaname.toCPointer<ByteVar>(), cchschemaname, sztablename.toCPointer<ByteVar>(), cchtablename, szcolumnname.toCPointer<ByteVar>(), cchcolumnname)

public actual fun SQLCompleteAsync(handletype: Short, handle: Long, asyncretcodeptr: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLCompleteAsync(handletype, handle.toCPointer<ByteVar>(), asyncretcodeptr.toCPointer<ByteVar>())

public actual fun SQLConnect(connectionhandle: Long, servername: Long, namelength1: Short, username: Long, namelength2: Short, authentication: Long, namelength3: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLConnect(connectionhandle.toCPointer<ByteVar>(), servername.toCPointer<ByteVar>(), namelength1, username.toCPointer<ByteVar>(), namelength2, authentication.toCPointer<ByteVar>(), namelength3)

public actual fun SQLConnectA(hdbc: Long, szdsn: Long, cbdsn: Short, szuid: Long, cbuid: Short, szauthstr: Long, cbauthstr: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLConnectA(hdbc.toCPointer<ByteVar>(), szdsn.toCPointer<ByteVar>(), cbdsn, szuid.toCPointer<ByteVar>(), cbuid, szauthstr.toCPointer<ByteVar>(), cbauthstr)

public actual fun SQLConnectW(hdbc: Long, szdsn: Long, cchdsn: Short, szuid: Long, cchuid: Short, szauthstr: Long, cchauthstr: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLConnectW(hdbc.toCPointer<ByteVar>(), szdsn.toCPointer<ByteVar>(), cchdsn, szuid.toCPointer<ByteVar>(), cchuid, szauthstr.toCPointer<ByteVar>(), cchauthstr)

public actual fun SQLCopyDesc(sourcedeschandle: Long, targetdeschandle: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLCopyDesc(sourcedeschandle.toCPointer<ByteVar>(), targetdeschandle.toCPointer<ByteVar>())

public actual fun SQLDataSources(environmenthandle: Long, direction: UShort, servername: Long, bufferlength1: Short, namelength1ptr: Long, description: Long, bufferlength2: Short, namelength2ptr: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLDataSources(environmenthandle.toCPointer<ByteVar>(), direction, servername.toCPointer<ByteVar>(), bufferlength1, namelength1ptr.toCPointer<ByteVar>(), description.toCPointer<ByteVar>(), bufferlength2, namelength2ptr.toCPointer<ByteVar>())

public actual fun SQLDataSourcesA(henv: Long, fdirection: UShort, szdsn: Long, cbdsnmax: Short, pcbdsn: Long, szdescription: Long, cbdescriptionmax: Short, pcbdescription: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLDataSourcesA(henv.toCPointer<ByteVar>(), fdirection, szdsn.toCPointer<ByteVar>(), cbdsnmax, pcbdsn.toCPointer<ByteVar>(), szdescription.toCPointer<ByteVar>(), cbdescriptionmax, pcbdescription.toCPointer<ByteVar>())

public actual fun SQLDataSourcesW(henv: Long, fdirection: UShort, szdsn: Long, cchdsnmax: Short, pcchdsn: Long, wszdescription: Long, cchdescriptionmax: Short, pcchdescription: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLDataSourcesW(henv.toCPointer<ByteVar>(), fdirection, szdsn.toCPointer<ByteVar>(), cchdsnmax, pcchdsn.toCPointer<ByteVar>(), wszdescription.toCPointer<ByteVar>(), cchdescriptionmax, pcchdescription.toCPointer<ByteVar>())

public actual fun SQLDescribeCol(statementhandle: Long, columnnumber: UShort, columnname: Long, bufferlength: Short, namelength: Long, datatype: Long, columnsize: Long, decimaldigits: Long, nullable: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLDescribeCol(statementhandle.toCPointer<ByteVar>(), columnnumber, columnname.toCPointer<ByteVar>(), bufferlength, namelength.toCPointer<ByteVar>(), datatype.toCPointer<ByteVar>(), columnsize.toCPointer<ByteVar>(), decimaldigits.toCPointer<ByteVar>(), nullable.toCPointer<ByteVar>())

public actual fun SQLDescribeColA(hstmt: Long, icol: UShort, szcolname: Long, cbcolnamemax: Short, pcbcolname: Long, pfsqltype: Long, pcbcoldef: Long, pibscale: Long, pfnullable: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLDescribeColA(hstmt.toCPointer<ByteVar>(), icol, szcolname.toCPointer<ByteVar>(), cbcolnamemax, pcbcolname.toCPointer<ByteVar>(), pfsqltype.toCPointer<ByteVar>(), pcbcoldef.toCPointer<ByteVar>(), pibscale.toCPointer<ByteVar>(), pfnullable.toCPointer<ByteVar>())

public actual fun SQLDescribeColW(hstmt: Long, icol: UShort, szcolname: Long, cchcolnamemax: Short, pcchcolname: Long, pfsqltype: Long, pcbcoldef: Long, pibscale: Long, pfnullable: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLDescribeColW(hstmt.toCPointer<ByteVar>(), icol, szcolname.toCPointer<ByteVar>(), cchcolnamemax, pcchcolname.toCPointer<ByteVar>(), pfsqltype.toCPointer<ByteVar>(), pcbcoldef.toCPointer<ByteVar>(), pibscale.toCPointer<ByteVar>(), pfnullable.toCPointer<ByteVar>())

public actual fun SQLDescribeParam(hstmt: Long, ipar: UShort, pfsqltype: Long, pcbparamdef: Long, pibscale: Long, pfnullable: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLDescribeParam(hstmt.toCPointer<ByteVar>(), ipar, pfsqltype.toCPointer<ByteVar>(), pcbparamdef.toCPointer<ByteVar>(), pibscale.toCPointer<ByteVar>(), pfnullable.toCPointer<ByteVar>())

public actual fun SQLDisconnect(connectionhandle: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLDisconnect(connectionhandle.toCPointer<ByteVar>())

public actual fun SQLDriverConnect(hdbc: Long, hwnd: Long, szconnstrin: Long, cchconnstrin: Short, szconnstrout: Long, cchconnstroutmax: Short, pcchconnstrout: Long, fdrivercompletion: UShort): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLDriverConnect(hdbc.toCPointer<ByteVar>(), hwnd, szconnstrin.toCPointer<ByteVar>(), cchconnstrin, szconnstrout.toCPointer<ByteVar>(), cchconnstroutmax, pcchconnstrout.toCPointer<ByteVar>(), fdrivercompletion)

public actual fun SQLDriverConnectA(hdbc: Long, hwnd: Long, szconnstrin: Long, cbconnstrin: Short, szconnstrout: Long, cbconnstroutmax: Short, pcbconnstrout: Long, fdrivercompletion: UShort): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLDriverConnectA(hdbc.toCPointer<ByteVar>(), hwnd, szconnstrin.toCPointer<ByteVar>(), cbconnstrin, szconnstrout.toCPointer<ByteVar>(), cbconnstroutmax, pcbconnstrout.toCPointer<ByteVar>(), fdrivercompletion)

public actual fun SQLDriverConnectW(hdbc: Long, hwnd: Long, szconnstrin: Long, cchconnstrin: Short, szconnstrout: Long, cchconnstroutmax: Short, pcchconnstrout: Long, fdrivercompletion: UShort): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLDriverConnectW(hdbc.toCPointer<ByteVar>(), hwnd, szconnstrin.toCPointer<ByteVar>(), cchconnstrin, szconnstrout.toCPointer<ByteVar>(), cchconnstroutmax, pcchconnstrout.toCPointer<ByteVar>(), fdrivercompletion)

public actual fun SQLDrivers(henv: Long, fdirection: UShort, szdriverdesc: Long, cchdriverdescmax: Short, pcchdriverdesc: Long, szdriverattributes: Long, cchdrvrattrmax: Short, pcchdrvrattr: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLDrivers(henv.toCPointer<ByteVar>(), fdirection, szdriverdesc.toCPointer<ByteVar>(), cchdriverdescmax, pcchdriverdesc.toCPointer<ByteVar>(), szdriverattributes.toCPointer<ByteVar>(), cchdrvrattrmax, pcchdrvrattr.toCPointer<ByteVar>())

public actual fun SQLDriversA(henv: Long, fdirection: UShort, szdriverdesc: Long, cbdriverdescmax: Short, pcbdriverdesc: Long, szdriverattributes: Long, cbdrvrattrmax: Short, pcbdrvrattr: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLDriversA(henv.toCPointer<ByteVar>(), fdirection, szdriverdesc.toCPointer<ByteVar>(), cbdriverdescmax, pcbdriverdesc.toCPointer<ByteVar>(), szdriverattributes.toCPointer<ByteVar>(), cbdrvrattrmax, pcbdrvrattr.toCPointer<ByteVar>())

public actual fun SQLDriversW(henv: Long, fdirection: UShort, szdriverdesc: Long, cchdriverdescmax: Short, pcchdriverdesc: Long, szdriverattributes: Long, cchdrvrattrmax: Short, pcchdrvrattr: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLDriversW(henv.toCPointer<ByteVar>(), fdirection, szdriverdesc.toCPointer<ByteVar>(), cchdriverdescmax, pcchdriverdesc.toCPointer<ByteVar>(), szdriverattributes.toCPointer<ByteVar>(), cchdrvrattrmax, pcchdrvrattr.toCPointer<ByteVar>())

public actual fun SQLEndTran(handletype: Short, handle: Long, completiontype: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLEndTran(handletype, handle.toCPointer<ByteVar>(), completiontype)

public actual fun SQLError(environmenthandle: Long, connectionhandle: Long, statementhandle: Long, sqlstate: Long, nativeerror: Long, messagetext: Long, bufferlength: Short, textlength: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLError(environmenthandle.toCPointer<ByteVar>(), connectionhandle.toCPointer<ByteVar>(), statementhandle.toCPointer<ByteVar>(), sqlstate.toCPointer<ByteVar>(), nativeerror.toCPointer<ByteVar>(), messagetext.toCPointer<ByteVar>(), bufferlength, textlength.toCPointer<ByteVar>())

public actual fun SQLErrorA(henv: Long, hdbc: Long, hstmt: Long, szsqlstate: Long, pfnativeerror: Long, szerrormsg: Long, cberrormsgmax: Short, pcberrormsg: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLErrorA(henv.toCPointer<ByteVar>(), hdbc.toCPointer<ByteVar>(), hstmt.toCPointer<ByteVar>(), szsqlstate.toCPointer<ByteVar>(), pfnativeerror.toCPointer<ByteVar>(), szerrormsg.toCPointer<ByteVar>(), cberrormsgmax, pcberrormsg.toCPointer<ByteVar>())

public actual fun SQLErrorW(henv: Long, hdbc: Long, hstmt: Long, wszsqlstate: Long, pfnativeerror: Long, wszerrormsg: Long, ccherrormsgmax: Short, pccherrormsg: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLErrorW(henv.toCPointer<ByteVar>(), hdbc.toCPointer<ByteVar>(), hstmt.toCPointer<ByteVar>(), wszsqlstate.toCPointer<ByteVar>(), pfnativeerror.toCPointer<ByteVar>(), wszerrormsg.toCPointer<ByteVar>(), ccherrormsgmax, pccherrormsg.toCPointer<ByteVar>())

public actual fun SQLExecDirect(statementhandle: Long, statementtext: Long, textlength: Int): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLExecDirect(statementhandle.toCPointer<ByteVar>(), statementtext.toCPointer<ByteVar>(), textlength)

public actual fun SQLExecDirectA(hstmt: Long, szsqlstr: Long, cbsqlstr: Int): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLExecDirectA(hstmt.toCPointer<ByteVar>(), szsqlstr.toCPointer<ByteVar>(), cbsqlstr)

public actual fun SQLExecDirectW(hstmt: Long, szsqlstr: Long, textlength: Int): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLExecDirectW(hstmt.toCPointer<ByteVar>(), szsqlstr.toCPointer<ByteVar>(), textlength)

public actual fun SQLExecute(statementhandle: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLExecute(statementhandle.toCPointer<ByteVar>())

public actual fun SQLExtendedFetch(hstmt: Long, ffetchtype: UShort, irow: Long, pcrow: Long, rgfrowstatus: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLExtendedFetch(hstmt.toCPointer<ByteVar>(), ffetchtype, irow, pcrow.toCPointer<ByteVar>(), rgfrowstatus.toCPointer<ByteVar>())

public actual fun SQLFetch(statementhandle: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLFetch(statementhandle.toCPointer<ByteVar>())

public actual fun SQLFetchScroll(statementhandle: Long, fetchorientation: Short, fetchoffset: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLFetchScroll(statementhandle.toCPointer<ByteVar>(), fetchorientation, fetchoffset)

public actual fun SQLForeignKeys(hstmt: Long, szpkcatalogname: Long, cchpkcatalogname: Short, szpkschemaname: Long, cchpkschemaname: Short, szpktablename: Long, cchpktablename: Short, szfkcatalogname: Long, cchfkcatalogname: Short, szfkschemaname: Long, cchfkschemaname: Short, szfktablename: Long, cchfktablename: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLForeignKeys(hstmt.toCPointer<ByteVar>(), szpkcatalogname.toCPointer<ByteVar>(), cchpkcatalogname, szpkschemaname.toCPointer<ByteVar>(), cchpkschemaname, szpktablename.toCPointer<ByteVar>(), cchpktablename, szfkcatalogname.toCPointer<ByteVar>(), cchfkcatalogname, szfkschemaname.toCPointer<ByteVar>(), cchfkschemaname, szfktablename.toCPointer<ByteVar>(), cchfktablename)

public actual fun SQLForeignKeysA(hstmt: Long, szpkcatalogname: Long, cbpkcatalogname: Short, szpkschemaname: Long, cbpkschemaname: Short, szpktablename: Long, cbpktablename: Short, szfkcatalogname: Long, cbfkcatalogname: Short, szfkschemaname: Long, cbfkschemaname: Short, szfktablename: Long, cbfktablename: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLForeignKeysA(hstmt.toCPointer<ByteVar>(), szpkcatalogname.toCPointer<ByteVar>(), cbpkcatalogname, szpkschemaname.toCPointer<ByteVar>(), cbpkschemaname, szpktablename.toCPointer<ByteVar>(), cbpktablename, szfkcatalogname.toCPointer<ByteVar>(), cbfkcatalogname, szfkschemaname.toCPointer<ByteVar>(), cbfkschemaname, szfktablename.toCPointer<ByteVar>(), cbfktablename)

public actual fun SQLForeignKeysW(hstmt: Long, szpkcatalogname: Long, cchpkcatalogname: Short, szpkschemaname: Long, cchpkschemaname: Short, szpktablename: Long, cchpktablename: Short, szfkcatalogname: Long, cchfkcatalogname: Short, szfkschemaname: Long, cchfkschemaname: Short, szfktablename: Long, cchfktablename: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLForeignKeysW(hstmt.toCPointer<ByteVar>(), szpkcatalogname.toCPointer<ByteVar>(), cchpkcatalogname, szpkschemaname.toCPointer<ByteVar>(), cchpkschemaname, szpktablename.toCPointer<ByteVar>(), cchpktablename, szfkcatalogname.toCPointer<ByteVar>(), cchfkcatalogname, szfkschemaname.toCPointer<ByteVar>(), cchfkschemaname, szfktablename.toCPointer<ByteVar>(), cchfktablename)

public actual fun SQLFreeConnect(connectionhandle: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLFreeConnect(connectionhandle.toCPointer<ByteVar>())

public actual fun SQLFreeEnv(environmenthandle: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLFreeEnv(environmenthandle.toCPointer<ByteVar>())

public actual fun SQLFreeHandle(handletype: Short, handle: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLFreeHandle(handletype, handle.toCPointer<ByteVar>())

public actual fun SQLFreeStmt(statementhandle: Long, option: UShort): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLFreeStmt(statementhandle.toCPointer<ByteVar>(), option)

public actual fun SQLGetConnectAttr(connectionhandle: Long, attribute: Int, value: Long, bufferlength: Int, stringlengthptr: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLGetConnectAttr(connectionhandle.toCPointer<ByteVar>(), attribute, value.toCPointer<ByteVar>(), bufferlength, stringlengthptr.toCPointer<ByteVar>())

public actual fun SQLGetConnectAttrA(hdbc: Long, fattribute: Int, rgbvalue: Long, cbvaluemax: Int, pcbvalue: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLGetConnectAttrA(hdbc.toCPointer<ByteVar>(), fattribute, rgbvalue.toCPointer<ByteVar>(), cbvaluemax, pcbvalue.toCPointer<ByteVar>())

public actual fun SQLGetConnectAttrW(hdbc: Long, fattribute: Int, rgbvalue: Long, cbvaluemax: Int, pcbvalue: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLGetConnectAttrW(hdbc.toCPointer<ByteVar>(), fattribute, rgbvalue.toCPointer<ByteVar>(), cbvaluemax, pcbvalue.toCPointer<ByteVar>())

public actual fun SQLGetConnectOption(connectionhandle: Long, option: UShort, value: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLGetConnectOption(connectionhandle.toCPointer<ByteVar>(), option, value.toCPointer<ByteVar>())

public actual fun SQLGetConnectOptionA(hdbc: Long, foption: UShort, pvparam: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLGetConnectOptionA(hdbc.toCPointer<ByteVar>(), foption, pvparam.toCPointer<ByteVar>())

public actual fun SQLGetConnectOptionW(hdbc: Long, foption: UShort, pvparam: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLGetConnectOptionW(hdbc.toCPointer<ByteVar>(), foption, pvparam.toCPointer<ByteVar>())

public actual fun SQLGetCursorName(statementhandle: Long, cursorname: Long, bufferlength: Short, namelengthptr: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLGetCursorName(statementhandle.toCPointer<ByteVar>(), cursorname.toCPointer<ByteVar>(), bufferlength, namelengthptr.toCPointer<ByteVar>())

public actual fun SQLGetCursorNameA(hstmt: Long, szcursor: Long, cbcursormax: Short, pcbcursor: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLGetCursorNameA(hstmt.toCPointer<ByteVar>(), szcursor.toCPointer<ByteVar>(), cbcursormax, pcbcursor.toCPointer<ByteVar>())

public actual fun SQLGetCursorNameW(hstmt: Long, szcursor: Long, cchcursormax: Short, pcchcursor: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLGetCursorNameW(hstmt.toCPointer<ByteVar>(), szcursor.toCPointer<ByteVar>(), cchcursormax, pcchcursor.toCPointer<ByteVar>())

public actual fun SQLGetData(statementhandle: Long, columnnumber: UShort, targettype: Short, targetvalue: Long, bufferlength: Long, strlen_or_indptr: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLGetData(statementhandle.toCPointer<ByteVar>(), columnnumber, targettype, targetvalue.toCPointer<ByteVar>(), bufferlength, strlen_or_indptr.toCPointer<ByteVar>())

public actual fun SQLGetDescField(descriptorhandle: Long, recnumber: Short, fieldidentifier: Short, value: Long, bufferlength: Int, stringlength: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLGetDescField(descriptorhandle.toCPointer<ByteVar>(), recnumber, fieldidentifier, value.toCPointer<ByteVar>(), bufferlength, stringlength.toCPointer<ByteVar>())

public actual fun SQLGetDescFieldA(hdesc: Long, irecord: Short, ifield: Short, rgbvalue: Long, cbbufferlength: Int, stringlength: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLGetDescFieldA(hdesc.toCPointer<ByteVar>(), irecord, ifield, rgbvalue.toCPointer<ByteVar>(), cbbufferlength, stringlength.toCPointer<ByteVar>())

public actual fun SQLGetDescFieldW(hdesc: Long, irecord: Short, ifield: Short, rgbvalue: Long, cbbufferlength: Int, stringlength: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLGetDescFieldW(hdesc.toCPointer<ByteVar>(), irecord, ifield, rgbvalue.toCPointer<ByteVar>(), cbbufferlength, stringlength.toCPointer<ByteVar>())

public actual fun SQLGetDescRec(descriptorhandle: Long, recnumber: Short, name: Long, bufferlength: Short, stringlengthptr: Long, typeptr: Long, subtypeptr: Long, lengthptr: Long, precisionptr: Long, scaleptr: Long, nullableptr: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLGetDescRec(descriptorhandle.toCPointer<ByteVar>(), recnumber, name.toCPointer<ByteVar>(), bufferlength, stringlengthptr.toCPointer<ByteVar>(), typeptr.toCPointer<ByteVar>(), subtypeptr.toCPointer<ByteVar>(), lengthptr.toCPointer<ByteVar>(), precisionptr.toCPointer<ByteVar>(), scaleptr.toCPointer<ByteVar>(), nullableptr.toCPointer<ByteVar>())

public actual fun SQLGetDescRecA(hdesc: Long, irecord: Short, szname: Long, cbnamemax: Short, pcbname: Long, pftype: Long, pfsubtype: Long, plength: Long, pprecision: Long, pscale: Long, pnullable: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLGetDescRecA(hdesc.toCPointer<ByteVar>(), irecord, szname.toCPointer<ByteVar>(), cbnamemax, pcbname.toCPointer<ByteVar>(), pftype.toCPointer<ByteVar>(), pfsubtype.toCPointer<ByteVar>(), plength.toCPointer<ByteVar>(), pprecision.toCPointer<ByteVar>(), pscale.toCPointer<ByteVar>(), pnullable.toCPointer<ByteVar>())

public actual fun SQLGetDescRecW(hdesc: Long, irecord: Short, szname: Long, cchnamemax: Short, pcchname: Long, pftype: Long, pfsubtype: Long, plength: Long, pprecision: Long, pscale: Long, pnullable: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLGetDescRecW(hdesc.toCPointer<ByteVar>(), irecord, szname.toCPointer<ByteVar>(), cchnamemax, pcchname.toCPointer<ByteVar>(), pftype.toCPointer<ByteVar>(), pfsubtype.toCPointer<ByteVar>(), plength.toCPointer<ByteVar>(), pprecision.toCPointer<ByteVar>(), pscale.toCPointer<ByteVar>(), pnullable.toCPointer<ByteVar>())

public actual fun SQLGetDiagField(handletype: Short, handle: Long, recnumber: Short, diagidentifier: Short, diaginfo: Long, bufferlength: Short, stringlength: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLGetDiagField(handletype, handle.toCPointer<ByteVar>(), recnumber, diagidentifier, diaginfo.toCPointer<ByteVar>(), bufferlength, stringlength.toCPointer<ByteVar>())

public actual fun SQLGetDiagFieldA(fhandletype: Short, handle: Long, irecord: Short, fdiagfield: Short, rgbdiaginfo: Long, cbdiaginfomax: Short, pcbdiaginfo: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLGetDiagFieldA(fhandletype, handle.toCPointer<ByteVar>(), irecord, fdiagfield, rgbdiaginfo.toCPointer<ByteVar>(), cbdiaginfomax, pcbdiaginfo.toCPointer<ByteVar>())

public actual fun SQLGetDiagFieldW(fhandletype: Short, handle: Long, irecord: Short, fdiagfield: Short, rgbdiaginfo: Long, cbbufferlength: Short, pcbstringlength: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLGetDiagFieldW(fhandletype, handle.toCPointer<ByteVar>(), irecord, fdiagfield, rgbdiaginfo.toCPointer<ByteVar>(), cbbufferlength, pcbstringlength.toCPointer<ByteVar>())

public actual fun SQLGetDiagRec(handletype: Short, handle: Long, recnumber: Short, sqlstate: Long, nativeerror: Long, messagetext: Long, bufferlength: Short, textlength: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLGetDiagRec(handletype, handle.toCPointer<ByteVar>(), recnumber, sqlstate.toCPointer<ByteVar>(), nativeerror.toCPointer<ByteVar>(), messagetext.toCPointer<ByteVar>(), bufferlength, textlength.toCPointer<ByteVar>())

public actual fun SQLGetDiagRecA(fhandletype: Short, handle: Long, irecord: Short, szsqlstate: Long, pfnativeerror: Long, szerrormsg: Long, cberrormsgmax: Short, pcberrormsg: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLGetDiagRecA(fhandletype, handle.toCPointer<ByteVar>(), irecord, szsqlstate.toCPointer<ByteVar>(), pfnativeerror.toCPointer<ByteVar>(), szerrormsg.toCPointer<ByteVar>(), cberrormsgmax, pcberrormsg.toCPointer<ByteVar>())

public actual fun SQLGetDiagRecW(fhandletype: Short, handle: Long, irecord: Short, szsqlstate: Long, pfnativeerror: Long, szerrormsg: Long, ccherrormsgmax: Short, pccherrormsg: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLGetDiagRecW(fhandletype, handle.toCPointer<ByteVar>(), irecord, szsqlstate.toCPointer<ByteVar>(), pfnativeerror.toCPointer<ByteVar>(), szerrormsg.toCPointer<ByteVar>(), ccherrormsgmax, pccherrormsg.toCPointer<ByteVar>())

public actual fun SQLGetEnvAttr(environmenthandle: Long, attribute: Int, value: Long, bufferlength: Int, stringlength: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLGetEnvAttr(environmenthandle.toCPointer<ByteVar>(), attribute, value.toCPointer<ByteVar>(), bufferlength, stringlength.toCPointer<ByteVar>())

public actual fun SQLGetFunctions(connectionhandle: Long, functionid: UShort, supported: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLGetFunctions(connectionhandle.toCPointer<ByteVar>(), functionid, supported.toCPointer<ByteVar>())

public actual fun SQLGetInfo(connectionhandle: Long, infotype: UShort, infovalue: Long, bufferlength: Short, stringlengthptr: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLGetInfo(connectionhandle.toCPointer<ByteVar>(), infotype, infovalue.toCPointer<ByteVar>(), bufferlength, stringlengthptr.toCPointer<ByteVar>())

public actual fun SQLGetInfoA(hdbc: Long, finfotype: UShort, rgbinfovalue: Long, cbinfovaluemax: Short, pcbinfovalue: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLGetInfoA(hdbc.toCPointer<ByteVar>(), finfotype, rgbinfovalue.toCPointer<ByteVar>(), cbinfovaluemax, pcbinfovalue.toCPointer<ByteVar>())

public actual fun SQLGetInfoW(hdbc: Long, finfotype: UShort, rgbinfovalue: Long, cbinfovaluemax: Short, pcbinfovalue: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLGetInfoW(hdbc.toCPointer<ByteVar>(), finfotype, rgbinfovalue.toCPointer<ByteVar>(), cbinfovaluemax, pcbinfovalue.toCPointer<ByteVar>())

public actual fun SQLGetNextEnumeration(henumhandle: HANDLE, prgenumdata: Long, pienumlength: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLGetNextEnumeration(henumhandle.toCPointer<ByteVar>(), prgenumdata.toCPointer<ByteVar>(), pienumlength.toCPointer<ByteVar>())

public actual fun SQLGetStmtAttr(statementhandle: Long, attribute: Int, value: Long, bufferlength: Int, stringlength: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLGetStmtAttr(statementhandle.toCPointer<ByteVar>(), attribute, value.toCPointer<ByteVar>(), bufferlength, stringlength.toCPointer<ByteVar>())

public actual fun SQLGetStmtAttrA(hstmt: Long, fattribute: Int, rgbvalue: Long, cbvaluemax: Int, pcbvalue: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLGetStmtAttrA(hstmt.toCPointer<ByteVar>(), fattribute, rgbvalue.toCPointer<ByteVar>(), cbvaluemax, pcbvalue.toCPointer<ByteVar>())

public actual fun SQLGetStmtAttrW(hstmt: Long, fattribute: Int, rgbvalue: Long, cbvaluemax: Int, pcbvalue: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLGetStmtAttrW(hstmt.toCPointer<ByteVar>(), fattribute, rgbvalue.toCPointer<ByteVar>(), cbvaluemax, pcbvalue.toCPointer<ByteVar>())

public actual fun SQLGetStmtOption(statementhandle: Long, option: UShort, value: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLGetStmtOption(statementhandle.toCPointer<ByteVar>(), option, value.toCPointer<ByteVar>())

public actual fun SQLGetTypeInfo(statementhandle: Long, datatype: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLGetTypeInfo(statementhandle.toCPointer<ByteVar>(), datatype)

public actual fun SQLGetTypeInfoA(statementhandle: Long, datatype: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLGetTypeInfoA(statementhandle.toCPointer<ByteVar>(), datatype)

public actual fun SQLGetTypeInfoW(statementhandle: Long, datatype: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLGetTypeInfoW(statementhandle.toCPointer<ByteVar>(), datatype)

public actual fun SQLInitEnumServers(pwchservername: PCWSTR, pwchinstancename: PCWSTR): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLInitEnumServers(pwchservername.toCPointer<ByteVar>(), pwchinstancename.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun SQLLinkedCatalogsA(param0: Long, param1: PCSTR, param2: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLLinkedCatalogsA(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2)

public actual fun SQLLinkedCatalogsW(param0: Long, param1: PCWSTR, param2: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLLinkedCatalogsW(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2)

public actual fun SQLLinkedServers(param0: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLLinkedServers(param0.toCPointer<ByteVar>())

public actual fun SQLMoreResults(hstmt: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLMoreResults(hstmt.toCPointer<ByteVar>())

public actual fun SQLNativeSql(hdbc: Long, szsqlstrin: Long, cchsqlstrin: Int, szsqlstr: Long, cchsqlstrmax: Int, pcbsqlstr: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLNativeSql(hdbc.toCPointer<ByteVar>(), szsqlstrin.toCPointer<ByteVar>(), cchsqlstrin, szsqlstr.toCPointer<ByteVar>(), cchsqlstrmax, pcbsqlstr.toCPointer<ByteVar>())

public actual fun SQLNativeSqlA(hdbc: Long, szsqlstrin: Long, cbsqlstrin: Int, szsqlstr: Long, cbsqlstrmax: Int, pcbsqlstr: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLNativeSqlA(hdbc.toCPointer<ByteVar>(), szsqlstrin.toCPointer<ByteVar>(), cbsqlstrin, szsqlstr.toCPointer<ByteVar>(), cbsqlstrmax, pcbsqlstr.toCPointer<ByteVar>())

public actual fun SQLNativeSqlW(hdbc: Long, szsqlstrin: Long, cchsqlstrin: Int, szsqlstr: Long, cchsqlstrmax: Int, pcchsqlstr: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLNativeSqlW(hdbc.toCPointer<ByteVar>(), szsqlstrin.toCPointer<ByteVar>(), cchsqlstrin, szsqlstr.toCPointer<ByteVar>(), cchsqlstrmax, pcchsqlstr.toCPointer<ByteVar>())

public actual fun SQLNumParams(hstmt: Long, pcpar: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLNumParams(hstmt.toCPointer<ByteVar>(), pcpar.toCPointer<ByteVar>())

public actual fun SQLNumResultCols(statementhandle: Long, columncount: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLNumResultCols(statementhandle.toCPointer<ByteVar>(), columncount.toCPointer<ByteVar>())

public actual fun SQLParamData(statementhandle: Long, value: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLParamData(statementhandle.toCPointer<ByteVar>(), value.toCPointer<ByteVar>())

public actual fun SQLParamOptions(hstmt: Long, crow: ULong, pirow: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLParamOptions(hstmt.toCPointer<ByteVar>(), crow, pirow.toCPointer<ByteVar>())

public actual fun SQLPrepare(statementhandle: Long, statementtext: Long, textlength: Int): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLPrepare(statementhandle.toCPointer<ByteVar>(), statementtext.toCPointer<ByteVar>(), textlength)

public actual fun SQLPrepareA(hstmt: Long, szsqlstr: Long, cbsqlstr: Int): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLPrepareA(hstmt.toCPointer<ByteVar>(), szsqlstr.toCPointer<ByteVar>(), cbsqlstr)

public actual fun SQLPrepareW(hstmt: Long, szsqlstr: Long, cchsqlstr: Int): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLPrepareW(hstmt.toCPointer<ByteVar>(), szsqlstr.toCPointer<ByteVar>(), cchsqlstr)

public actual fun SQLPrimaryKeys(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLPrimaryKeys(hstmt.toCPointer<ByteVar>(), szcatalogname.toCPointer<ByteVar>(), cchcatalogname, szschemaname.toCPointer<ByteVar>(), cchschemaname, sztablename.toCPointer<ByteVar>(), cchtablename)

public actual fun SQLPrimaryKeysA(hstmt: Long, szcatalogname: Long, cbcatalogname: Short, szschemaname: Long, cbschemaname: Short, sztablename: Long, cbtablename: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLPrimaryKeysA(hstmt.toCPointer<ByteVar>(), szcatalogname.toCPointer<ByteVar>(), cbcatalogname, szschemaname.toCPointer<ByteVar>(), cbschemaname, sztablename.toCPointer<ByteVar>(), cbtablename)

public actual fun SQLPrimaryKeysW(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLPrimaryKeysW(hstmt.toCPointer<ByteVar>(), szcatalogname.toCPointer<ByteVar>(), cchcatalogname, szschemaname.toCPointer<ByteVar>(), cchschemaname, sztablename.toCPointer<ByteVar>(), cchtablename)

public actual fun SQLProcedureColumns(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, szprocname: Long, cchprocname: Short, szcolumnname: Long, cchcolumnname: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLProcedureColumns(hstmt.toCPointer<ByteVar>(), szcatalogname.toCPointer<ByteVar>(), cchcatalogname, szschemaname.toCPointer<ByteVar>(), cchschemaname, szprocname.toCPointer<ByteVar>(), cchprocname, szcolumnname.toCPointer<ByteVar>(), cchcolumnname)

public actual fun SQLProcedureColumnsA(hstmt: Long, szcatalogname: Long, cbcatalogname: Short, szschemaname: Long, cbschemaname: Short, szprocname: Long, cbprocname: Short, szcolumnname: Long, cbcolumnname: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLProcedureColumnsA(hstmt.toCPointer<ByteVar>(), szcatalogname.toCPointer<ByteVar>(), cbcatalogname, szschemaname.toCPointer<ByteVar>(), cbschemaname, szprocname.toCPointer<ByteVar>(), cbprocname, szcolumnname.toCPointer<ByteVar>(), cbcolumnname)

public actual fun SQLProcedureColumnsW(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, szprocname: Long, cchprocname: Short, szcolumnname: Long, cchcolumnname: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLProcedureColumnsW(hstmt.toCPointer<ByteVar>(), szcatalogname.toCPointer<ByteVar>(), cchcatalogname, szschemaname.toCPointer<ByteVar>(), cchschemaname, szprocname.toCPointer<ByteVar>(), cchprocname, szcolumnname.toCPointer<ByteVar>(), cchcolumnname)

public actual fun SQLProcedures(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, szprocname: Long, cchprocname: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLProcedures(hstmt.toCPointer<ByteVar>(), szcatalogname.toCPointer<ByteVar>(), cchcatalogname, szschemaname.toCPointer<ByteVar>(), cchschemaname, szprocname.toCPointer<ByteVar>(), cchprocname)

public actual fun SQLProceduresA(hstmt: Long, szcatalogname: Long, cbcatalogname: Short, szschemaname: Long, cbschemaname: Short, szprocname: Long, cbprocname: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLProceduresA(hstmt.toCPointer<ByteVar>(), szcatalogname.toCPointer<ByteVar>(), cbcatalogname, szschemaname.toCPointer<ByteVar>(), cbschemaname, szprocname.toCPointer<ByteVar>(), cbprocname)

public actual fun SQLProceduresW(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, szprocname: Long, cchprocname: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLProceduresW(hstmt.toCPointer<ByteVar>(), szcatalogname.toCPointer<ByteVar>(), cchcatalogname, szschemaname.toCPointer<ByteVar>(), cchschemaname, szprocname.toCPointer<ByteVar>(), cchprocname)

public actual fun SQLPutData(statementhandle: Long, data: Long, strlen_or_ind: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLPutData(statementhandle.toCPointer<ByteVar>(), data.toCPointer<ByteVar>(), strlen_or_ind)

public actual fun SQLRowCount(statementhandle: Long, rowcount: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLRowCount(statementhandle.toCPointer<ByteVar>(), rowcount.toCPointer<ByteVar>())

public actual fun SQLSetConnectAttr(connectionhandle: Long, attribute: Int, value: Long, stringlength: Int): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLSetConnectAttr(connectionhandle.toCPointer<ByteVar>(), attribute, value.toCPointer<ByteVar>(), stringlength)

public actual fun SQLSetConnectAttrA(hdbc: Long, fattribute: Int, rgbvalue: Long, cbvalue: Int): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLSetConnectAttrA(hdbc.toCPointer<ByteVar>(), fattribute, rgbvalue.toCPointer<ByteVar>(), cbvalue)

public actual fun SQLSetConnectAttrW(hdbc: Long, fattribute: Int, rgbvalue: Long, cbvalue: Int): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLSetConnectAttrW(hdbc.toCPointer<ByteVar>(), fattribute, rgbvalue.toCPointer<ByteVar>(), cbvalue)

public actual fun SQLSetConnectOption(connectionhandle: Long, option: UShort, value: ULong): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLSetConnectOption(connectionhandle.toCPointer<ByteVar>(), option, value)

public actual fun SQLSetConnectOptionA(hdbc: Long, foption: UShort, vparam: ULong): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLSetConnectOptionA(hdbc.toCPointer<ByteVar>(), foption, vparam)

public actual fun SQLSetConnectOptionW(hdbc: Long, foption: UShort, vparam: ULong): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLSetConnectOptionW(hdbc.toCPointer<ByteVar>(), foption, vparam)

public actual fun SQLSetCursorName(statementhandle: Long, cursorname: Long, namelength: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLSetCursorName(statementhandle.toCPointer<ByteVar>(), cursorname.toCPointer<ByteVar>(), namelength)

public actual fun SQLSetCursorNameA(hstmt: Long, szcursor: Long, cbcursor: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLSetCursorNameA(hstmt.toCPointer<ByteVar>(), szcursor.toCPointer<ByteVar>(), cbcursor)

public actual fun SQLSetCursorNameW(hstmt: Long, szcursor: Long, cchcursor: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLSetCursorNameW(hstmt.toCPointer<ByteVar>(), szcursor.toCPointer<ByteVar>(), cchcursor)

public actual fun SQLSetDescField(descriptorhandle: Long, recnumber: Short, fieldidentifier: Short, value: Long, bufferlength: Int): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLSetDescField(descriptorhandle.toCPointer<ByteVar>(), recnumber, fieldidentifier, value.toCPointer<ByteVar>(), bufferlength)

public actual fun SQLSetDescFieldW(descriptorhandle: Long, recnumber: Short, fieldidentifier: Short, value: Long, bufferlength: Int): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLSetDescFieldW(descriptorhandle.toCPointer<ByteVar>(), recnumber, fieldidentifier, value.toCPointer<ByteVar>(), bufferlength)

public actual fun SQLSetDescRec(descriptorhandle: Long, recnumber: Short, type: Short, subtype: Short, length: Long, precision: Short, scale: Short, data: Long, stringlength: Long, indicator: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLSetDescRec(descriptorhandle.toCPointer<ByteVar>(), recnumber, type, subtype, length, precision, scale, data.toCPointer<ByteVar>(), stringlength.toCPointer<ByteVar>(), indicator.toCPointer<ByteVar>())

public actual fun SQLSetEnvAttr(environmenthandle: Long, attribute: Int, value: Long, stringlength: Int): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLSetEnvAttr(environmenthandle.toCPointer<ByteVar>(), attribute, value.toCPointer<ByteVar>(), stringlength)

public actual fun SQLSetParam(statementhandle: Long, parameternumber: UShort, valuetype: Short, parametertype: Short, lengthprecision: ULong, parameterscale: Short, parametervalue: Long, strlen_or_ind: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLSetParam(statementhandle.toCPointer<ByteVar>(), parameternumber, valuetype, parametertype, lengthprecision, parameterscale, parametervalue.toCPointer<ByteVar>(), strlen_or_ind.toCPointer<ByteVar>())

public actual fun SQLSetPos(hstmt: Long, irow: ULong, foption: UShort, flock: UShort): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLSetPos(hstmt.toCPointer<ByteVar>(), irow, foption, flock)

public actual fun SQLSetScrollOptions(hstmt: Long, fconcurrency: UShort, crowkeyset: Long, crowrowset: UShort): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLSetScrollOptions(hstmt.toCPointer<ByteVar>(), fconcurrency, crowkeyset, crowrowset)

public actual fun SQLSetStmtAttr(statementhandle: Long, attribute: Int, value: Long, stringlength: Int): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLSetStmtAttr(statementhandle.toCPointer<ByteVar>(), attribute, value.toCPointer<ByteVar>(), stringlength)

public actual fun SQLSetStmtAttrW(hstmt: Long, fattribute: Int, rgbvalue: Long, cbvaluemax: Int): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLSetStmtAttrW(hstmt.toCPointer<ByteVar>(), fattribute, rgbvalue.toCPointer<ByteVar>(), cbvaluemax)

public actual fun SQLSetStmtOption(statementhandle: Long, option: UShort, value: ULong): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLSetStmtOption(statementhandle.toCPointer<ByteVar>(), option, value)

public actual fun SQLSpecialColumns(statementhandle: Long, identifiertype: UShort, catalogname: Long, namelength1: Short, schemaname: Long, namelength2: Short, tablename: Long, namelength3: Short, scope: UShort, nullable: UShort): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLSpecialColumns(statementhandle.toCPointer<ByteVar>(), identifiertype, catalogname.toCPointer<ByteVar>(), namelength1, schemaname.toCPointer<ByteVar>(), namelength2, tablename.toCPointer<ByteVar>(), namelength3, scope, nullable)

public actual fun SQLSpecialColumnsA(hstmt: Long, fcoltype: UShort, szcatalogname: Long, cbcatalogname: Short, szschemaname: Long, cbschemaname: Short, sztablename: Long, cbtablename: Short, fscope: UShort, fnullable: UShort): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLSpecialColumnsA(hstmt.toCPointer<ByteVar>(), fcoltype, szcatalogname.toCPointer<ByteVar>(), cbcatalogname, szschemaname.toCPointer<ByteVar>(), cbschemaname, sztablename.toCPointer<ByteVar>(), cbtablename, fscope, fnullable)

public actual fun SQLSpecialColumnsW(hstmt: Long, fcoltype: UShort, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short, fscope: UShort, fnullable: UShort): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLSpecialColumnsW(hstmt.toCPointer<ByteVar>(), fcoltype, szcatalogname.toCPointer<ByteVar>(), cchcatalogname, szschemaname.toCPointer<ByteVar>(), cchschemaname, sztablename.toCPointer<ByteVar>(), cchtablename, fscope, fnullable)

public actual fun SQLStatistics(statementhandle: Long, catalogname: Long, namelength1: Short, schemaname: Long, namelength2: Short, tablename: Long, namelength3: Short, unique: UShort, reserved: UShort): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLStatistics(statementhandle.toCPointer<ByteVar>(), catalogname.toCPointer<ByteVar>(), namelength1, schemaname.toCPointer<ByteVar>(), namelength2, tablename.toCPointer<ByteVar>(), namelength3, unique, reserved)

public actual fun SQLStatisticsA(hstmt: Long, szcatalogname: Long, cbcatalogname: Short, szschemaname: Long, cbschemaname: Short, sztablename: Long, cbtablename: Short, funique: UShort, faccuracy: UShort): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLStatisticsA(hstmt.toCPointer<ByteVar>(), szcatalogname.toCPointer<ByteVar>(), cbcatalogname, szschemaname.toCPointer<ByteVar>(), cbschemaname, sztablename.toCPointer<ByteVar>(), cbtablename, funique, faccuracy)

public actual fun SQLStatisticsW(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short, funique: UShort, faccuracy: UShort): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLStatisticsW(hstmt.toCPointer<ByteVar>(), szcatalogname.toCPointer<ByteVar>(), cchcatalogname, szschemaname.toCPointer<ByteVar>(), cchschemaname, sztablename.toCPointer<ByteVar>(), cchtablename, funique, faccuracy)

public actual fun SQLTablePrivileges(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLTablePrivileges(hstmt.toCPointer<ByteVar>(), szcatalogname.toCPointer<ByteVar>(), cchcatalogname, szschemaname.toCPointer<ByteVar>(), cchschemaname, sztablename.toCPointer<ByteVar>(), cchtablename)

public actual fun SQLTablePrivilegesA(hstmt: Long, szcatalogname: Long, cbcatalogname: Short, szschemaname: Long, cbschemaname: Short, sztablename: Long, cbtablename: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLTablePrivilegesA(hstmt.toCPointer<ByteVar>(), szcatalogname.toCPointer<ByteVar>(), cbcatalogname, szschemaname.toCPointer<ByteVar>(), cbschemaname, sztablename.toCPointer<ByteVar>(), cbtablename)

public actual fun SQLTablePrivilegesW(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLTablePrivilegesW(hstmt.toCPointer<ByteVar>(), szcatalogname.toCPointer<ByteVar>(), cchcatalogname, szschemaname.toCPointer<ByteVar>(), cchschemaname, sztablename.toCPointer<ByteVar>(), cchtablename)

public actual fun SQLTables(statementhandle: Long, catalogname: Long, namelength1: Short, schemaname: Long, namelength2: Short, tablename: Long, namelength3: Short, tabletype: Long, namelength4: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLTables(statementhandle.toCPointer<ByteVar>(), catalogname.toCPointer<ByteVar>(), namelength1, schemaname.toCPointer<ByteVar>(), namelength2, tablename.toCPointer<ByteVar>(), namelength3, tabletype.toCPointer<ByteVar>(), namelength4)

public actual fun SQLTablesA(hstmt: Long, szcatalogname: Long, cbcatalogname: Short, szschemaname: Long, cbschemaname: Short, sztablename: Long, cbtablename: Short, sztabletype: Long, cbtabletype: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLTablesA(hstmt.toCPointer<ByteVar>(), szcatalogname.toCPointer<ByteVar>(), cbcatalogname, szschemaname.toCPointer<ByteVar>(), cbschemaname, sztablename.toCPointer<ByteVar>(), cbtablename, sztabletype.toCPointer<ByteVar>(), cbtabletype)

public actual fun SQLTablesW(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short, sztabletype: Long, cchtabletype: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLTablesW(hstmt.toCPointer<ByteVar>(), szcatalogname.toCPointer<ByteVar>(), cchcatalogname, szschemaname.toCPointer<ByteVar>(), cchschemaname, sztablename.toCPointer<ByteVar>(), cchtablename, sztabletype.toCPointer<ByteVar>(), cchtabletype)

public actual fun SQLTransact(environmenthandle: Long, connectionhandle: Long, completiontype: UShort): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_SQLTransact(environmenthandle.toCPointer<ByteVar>(), connectionhandle.toCPointer<ByteVar>(), completiontype)

public actual fun bcp_batch(param0: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_bcp_batch(param0.toCPointer<ByteVar>())

public actual fun bcp_bind(param0: Long, param1: Long, param2: Int, param3: Int, param4: Long, param5: Int, param6: Int, param7: Int): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_bcp_bind(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2, param3, param4.toCPointer<ByteVar>(), param5, param6, param7)

public actual fun bcp_colfmt(param0: Long, param1: Int, param2: UByte, param3: Int, param4: Int, param5: Long, param6: Int, param7: Int): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_bcp_colfmt(param0.toCPointer<ByteVar>(), param1, param2, param3, param4, param5.toCPointer<ByteVar>(), param6, param7)

public actual fun bcp_collen(param0: Long, param1: Int, param2: Int): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_bcp_collen(param0.toCPointer<ByteVar>(), param1, param2)

public actual fun bcp_colptr(param0: Long, param1: Long, param2: Int): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_bcp_colptr(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2)

public actual fun bcp_columns(param0: Long, param1: Int): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_bcp_columns(param0.toCPointer<ByteVar>(), param1)

public actual fun bcp_control(param0: Long, param1: Int, param2: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_bcp_control(param0.toCPointer<ByteVar>(), param1, param2.toCPointer<ByteVar>())

public actual fun bcp_done(param0: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_bcp_done(param0.toCPointer<ByteVar>())

public actual fun bcp_exec(param0: Long, param1: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_bcp_exec(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>())

public actual fun bcp_getcolfmt(param0: Long, param1: Int, param2: Int, param3: Long, param4: Int, param5: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_bcp_getcolfmt(param0.toCPointer<ByteVar>(), param1, param2, param3.toCPointer<ByteVar>(), param4, param5.toCPointer<ByteVar>())

public actual fun bcp_initA(param0: Long, param1: PCSTR, param2: PCSTR, param3: PCSTR, param4: Int): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_bcp_initA(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>(), param3.toCPointer<ByteVar>(), param4)

public actual fun bcp_initW(param0: Long, param1: PCWSTR, param2: PCWSTR, param3: PCWSTR, param4: Int): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_bcp_initW(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>(), param3.toCPointer<ByteVar>(), param4)

public actual fun bcp_moretext(param0: Long, param1: Int, param2: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_bcp_moretext(param0.toCPointer<ByteVar>(), param1, param2.toCPointer<ByteVar>())

public actual fun bcp_readfmtA(param0: Long, param1: PCSTR): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_bcp_readfmtA(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>())

public actual fun bcp_readfmtW(param0: Long, param1: PCWSTR): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_bcp_readfmtW(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>())

public actual fun bcp_sendrow(param0: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_bcp_sendrow(param0.toCPointer<ByteVar>())

public actual fun bcp_setcolfmt(param0: Long, param1: Int, param2: Int, param3: Long, param4: Int): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_bcp_setcolfmt(param0.toCPointer<ByteVar>(), param1, param2, param3.toCPointer<ByteVar>(), param4)

public actual fun bcp_writefmtA(param0: Long, param1: PCSTR): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_bcp_writefmtA(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>())

public actual fun bcp_writefmtW(param0: Long, param1: PCWSTR): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_bcp_writefmtW(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>())

public actual fun dbprtypeA(param0: Int): PSTR =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_dbprtypeA(param0)?.toLong() ?: 0L

public actual fun dbprtypeW(param0: Int): PWSTR =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_dbprtypeW(param0)?.toLong() ?: 0L
