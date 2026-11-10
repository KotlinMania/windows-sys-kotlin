@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.search

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun oDBCGetTryWaitValue(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_oDBCGetTryWaitValue()

public actual fun oDBCSetTryWaitValue(dwvalue: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_oDBCSetTryWaitValue(dwvalue)

public actual fun sQLAllocConnect(environmenthandle: COpaquePointer?, connectionhandle: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLAllocConnect(environmenthandle?.value?.toCPointer<ByteVar>(), connectionhandle?.value?.toCPointer<ByteVar>())

public actual fun sQLAllocEnv(environmenthandle: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLAllocEnv(environmenthandle?.value?.toCPointer<ByteVar>())

public actual fun sQLAllocHandle(handletype: Short, inputhandle: COpaquePointer?, outputhandle: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLAllocHandle(handletype, inputhandle?.value?.toCPointer<ByteVar>(), outputhandle?.value?.toCPointer<ByteVar>())

public actual fun sQLAllocHandleStd(fhandletype: Short, hinput: COpaquePointer?, phoutput: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLAllocHandleStd(fhandletype, hinput?.value?.toCPointer<ByteVar>(), phoutput?.value?.toCPointer<ByteVar>())

public actual fun sQLAllocStmt(connectionhandle: COpaquePointer?, statementhandle: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLAllocStmt(connectionhandle?.value?.toCPointer<ByteVar>(), statementhandle?.value?.toCPointer<ByteVar>())

public actual fun sQLBindCol(statementhandle: COpaquePointer?, columnnumber: UShort, targettype: Short, targetvalue: COpaquePointer?, bufferlength: Long, strlenOrInd: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLBindCol(statementhandle?.value?.toCPointer<ByteVar>(), columnnumber, targettype, targetvalue?.value?.toCPointer<ByteVar>(), bufferlength, strlenOrInd?.value?.toCPointer<ByteVar>())

public actual fun sQLBindParam(statementhandle: COpaquePointer?, parameternumber: UShort, valuetype: Short, parametertype: Short, lengthprecision: ULong, parameterscale: Short, parametervalue: COpaquePointer?, strlenOrInd: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLBindParam(statementhandle?.value?.toCPointer<ByteVar>(), parameternumber, valuetype, parametertype, lengthprecision, parameterscale, parametervalue?.value?.toCPointer<ByteVar>(), strlenOrInd?.value?.toCPointer<ByteVar>())

public actual fun sQLBindParameter(hstmt: COpaquePointer?, ipar: UShort, fparamtype: Short, fctype: Short, fsqltype: Short, cbcoldef: ULong, ibscale: Short, rgbvalue: COpaquePointer?, cbvaluemax: Long, pcbvalue: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLBindParameter(hstmt?.value?.toCPointer<ByteVar>(), ipar, fparamtype, fctype, fsqltype, cbcoldef, ibscale, rgbvalue?.value?.toCPointer<ByteVar>(), cbvaluemax, pcbvalue?.value?.toCPointer<ByteVar>())

public actual fun sQLBrowseConnect(hdbc: COpaquePointer?, szconnstrin: COpaquePointer?, cchconnstrin: Short, szconnstrout: COpaquePointer?, cchconnstroutmax: Short, pcchconnstrout: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLBrowseConnect(hdbc?.value?.toCPointer<ByteVar>(), szconnstrin?.value?.toCPointer<ByteVar>(), cchconnstrin, szconnstrout?.value?.toCPointer<ByteVar>(), cchconnstroutmax, pcchconnstrout?.value?.toCPointer<ByteVar>())

public actual fun sQLBrowseConnectA(hdbc: COpaquePointer?, szconnstrin: COpaquePointer?, cbconnstrin: Short, szconnstrout: COpaquePointer?, cbconnstroutmax: Short, pcbconnstrout: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLBrowseConnectA(hdbc?.value?.toCPointer<ByteVar>(), szconnstrin?.value?.toCPointer<ByteVar>(), cbconnstrin, szconnstrout?.value?.toCPointer<ByteVar>(), cbconnstroutmax, pcbconnstrout?.value?.toCPointer<ByteVar>())

public actual fun sQLBrowseConnectW(hdbc: COpaquePointer?, szconnstrin: COpaquePointer?, cchconnstrin: Short, szconnstrout: COpaquePointer?, cchconnstroutmax: Short, pcchconnstrout: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLBrowseConnectW(hdbc?.value?.toCPointer<ByteVar>(), szconnstrin?.value?.toCPointer<ByteVar>(), cchconnstrin, szconnstrout?.value?.toCPointer<ByteVar>(), cchconnstroutmax, pcchconnstrout?.value?.toCPointer<ByteVar>())

public actual fun sQLBulkOperations(statementhandle: COpaquePointer?, operation: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLBulkOperations(statementhandle?.value?.toCPointer<ByteVar>(), operation)

public actual fun sQLCancel(statementhandle: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLCancel(statementhandle?.value?.toCPointer<ByteVar>())

public actual fun sQLCancelHandle(handletype: Short, inputhandle: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLCancelHandle(handletype, inputhandle?.value?.toCPointer<ByteVar>())

public actual fun sQLCloseCursor(statementhandle: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLCloseCursor(statementhandle?.value?.toCPointer<ByteVar>())

public actual fun sQLCloseEnumServers(henumhandle: Handle): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLCloseEnumServers(henumhandle?.value?.toCPointer<ByteVar>())

public actual fun sQLColAttribute(statementhandle: COpaquePointer?, columnnumber: UShort, fieldidentifier: UShort, characterattribute: COpaquePointer?, bufferlength: Short, stringlength: COpaquePointer?, numericattribute: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLColAttribute(statementhandle?.value?.toCPointer<ByteVar>(), columnnumber, fieldidentifier, characterattribute?.value?.toCPointer<ByteVar>(), bufferlength, stringlength?.value?.toCPointer<ByteVar>(), numericattribute?.value?.toCPointer<ByteVar>())

public actual fun sQLColAttributeA(hstmt: COpaquePointer?, icol: Short, ifield: Short, pcharattr: COpaquePointer?, cbcharattrmax: Short, pcbcharattr: COpaquePointer?, pnumattr: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLColAttributeA(hstmt?.value?.toCPointer<ByteVar>(), icol, ifield, pcharattr?.value?.toCPointer<ByteVar>(), cbcharattrmax, pcbcharattr?.value?.toCPointer<ByteVar>(), pnumattr?.value?.toCPointer<ByteVar>())

public actual fun sQLColAttributeW(hstmt: COpaquePointer?, icol: UShort, ifield: UShort, pcharattr: COpaquePointer?, cbdescmax: Short, pcbcharattr: COpaquePointer?, pnumattr: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLColAttributeW(hstmt?.value?.toCPointer<ByteVar>(), icol, ifield, pcharattr?.value?.toCPointer<ByteVar>(), cbdescmax, pcbcharattr?.value?.toCPointer<ByteVar>(), pnumattr?.value?.toCPointer<ByteVar>())

public actual fun sQLColAttributes(hstmt: COpaquePointer?, icol: UShort, fdesctype: UShort, rgbdesc: COpaquePointer?, cbdescmax: Short, pcbdesc: COpaquePointer?, pfdesc: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLColAttributes(hstmt?.value?.toCPointer<ByteVar>(), icol, fdesctype, rgbdesc?.value?.toCPointer<ByteVar>(), cbdescmax, pcbdesc?.value?.toCPointer<ByteVar>(), pfdesc?.value?.toCPointer<ByteVar>())

public actual fun sQLColAttributesA(hstmt: COpaquePointer?, icol: UShort, fdesctype: UShort, rgbdesc: COpaquePointer?, cbdescmax: Short, pcbdesc: COpaquePointer?, pfdesc: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLColAttributesA(hstmt?.value?.toCPointer<ByteVar>(), icol, fdesctype, rgbdesc?.value?.toCPointer<ByteVar>(), cbdescmax, pcbdesc?.value?.toCPointer<ByteVar>(), pfdesc?.value?.toCPointer<ByteVar>())

public actual fun sQLColAttributesW(hstmt: COpaquePointer?, icol: UShort, fdesctype: UShort, rgbdesc: COpaquePointer?, cbdescmax: Short, pcbdesc: COpaquePointer?, pfdesc: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLColAttributesW(hstmt?.value?.toCPointer<ByteVar>(), icol, fdesctype, rgbdesc?.value?.toCPointer<ByteVar>(), cbdescmax, pcbdesc?.value?.toCPointer<ByteVar>(), pfdesc?.value?.toCPointer<ByteVar>())

public actual fun sQLColumnPrivileges(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cchcatalogname: Short, szschemaname: COpaquePointer?, cchschemaname: Short, sztablename: COpaquePointer?, cchtablename: Short, szcolumnname: COpaquePointer?, cchcolumnname: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLColumnPrivileges(hstmt?.value?.toCPointer<ByteVar>(), szcatalogname?.value?.toCPointer<ByteVar>(), cchcatalogname, szschemaname?.value?.toCPointer<ByteVar>(), cchschemaname, sztablename?.value?.toCPointer<ByteVar>(), cchtablename, szcolumnname?.value?.toCPointer<ByteVar>(), cchcolumnname)

public actual fun sQLColumnPrivilegesA(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cbcatalogname: Short, szschemaname: COpaquePointer?, cbschemaname: Short, sztablename: COpaquePointer?, cbtablename: Short, szcolumnname: COpaquePointer?, cbcolumnname: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLColumnPrivilegesA(hstmt?.value?.toCPointer<ByteVar>(), szcatalogname?.value?.toCPointer<ByteVar>(), cbcatalogname, szschemaname?.value?.toCPointer<ByteVar>(), cbschemaname, sztablename?.value?.toCPointer<ByteVar>(), cbtablename, szcolumnname?.value?.toCPointer<ByteVar>(), cbcolumnname)

public actual fun sQLColumnPrivilegesW(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cchcatalogname: Short, szschemaname: COpaquePointer?, cchschemaname: Short, sztablename: COpaquePointer?, cchtablename: Short, szcolumnname: COpaquePointer?, cchcolumnname: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLColumnPrivilegesW(hstmt?.value?.toCPointer<ByteVar>(), szcatalogname?.value?.toCPointer<ByteVar>(), cchcatalogname, szschemaname?.value?.toCPointer<ByteVar>(), cchschemaname, sztablename?.value?.toCPointer<ByteVar>(), cchtablename, szcolumnname?.value?.toCPointer<ByteVar>(), cchcolumnname)

public actual fun sQLColumns(statementhandle: COpaquePointer?, catalogname: COpaquePointer?, namelength1: Short, schemaname: COpaquePointer?, namelength2: Short, tablename: COpaquePointer?, namelength3: Short, columnname: COpaquePointer?, namelength4: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLColumns(statementhandle?.value?.toCPointer<ByteVar>(), catalogname?.value?.toCPointer<ByteVar>(), namelength1, schemaname?.value?.toCPointer<ByteVar>(), namelength2, tablename?.value?.toCPointer<ByteVar>(), namelength3, columnname?.value?.toCPointer<ByteVar>(), namelength4)

public actual fun sQLColumnsA(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cbcatalogname: Short, szschemaname: COpaquePointer?, cbschemaname: Short, sztablename: COpaquePointer?, cbtablename: Short, szcolumnname: COpaquePointer?, cbcolumnname: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLColumnsA(hstmt?.value?.toCPointer<ByteVar>(), szcatalogname?.value?.toCPointer<ByteVar>(), cbcatalogname, szschemaname?.value?.toCPointer<ByteVar>(), cbschemaname, sztablename?.value?.toCPointer<ByteVar>(), cbtablename, szcolumnname?.value?.toCPointer<ByteVar>(), cbcolumnname)

public actual fun sQLColumnsW(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cchcatalogname: Short, szschemaname: COpaquePointer?, cchschemaname: Short, sztablename: COpaquePointer?, cchtablename: Short, szcolumnname: COpaquePointer?, cchcolumnname: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLColumnsW(hstmt?.value?.toCPointer<ByteVar>(), szcatalogname?.value?.toCPointer<ByteVar>(), cchcatalogname, szschemaname?.value?.toCPointer<ByteVar>(), cchschemaname, sztablename?.value?.toCPointer<ByteVar>(), cchtablename, szcolumnname?.value?.toCPointer<ByteVar>(), cchcolumnname)

public actual fun sQLCompleteAsync(handletype: Short, handle: COpaquePointer?, asyncretcodeptr: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLCompleteAsync(handletype, handle?.value?.toCPointer<ByteVar>(), asyncretcodeptr?.value?.toCPointer<ByteVar>())

public actual fun sQLConnect(connectionhandle: COpaquePointer?, servername: COpaquePointer?, namelength1: Short, username: COpaquePointer?, namelength2: Short, authentication: COpaquePointer?, namelength3: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLConnect(connectionhandle?.value?.toCPointer<ByteVar>(), servername?.value?.toCPointer<ByteVar>(), namelength1, username?.value?.toCPointer<ByteVar>(), namelength2, authentication?.value?.toCPointer<ByteVar>(), namelength3)

public actual fun sQLConnectA(hdbc: COpaquePointer?, szdsn: COpaquePointer?, cbdsn: Short, szuid: COpaquePointer?, cbuid: Short, szauthstr: COpaquePointer?, cbauthstr: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLConnectA(hdbc?.value?.toCPointer<ByteVar>(), szdsn?.value?.toCPointer<ByteVar>(), cbdsn, szuid?.value?.toCPointer<ByteVar>(), cbuid, szauthstr?.value?.toCPointer<ByteVar>(), cbauthstr)

public actual fun sQLConnectW(hdbc: COpaquePointer?, szdsn: COpaquePointer?, cchdsn: Short, szuid: COpaquePointer?, cchuid: Short, szauthstr: COpaquePointer?, cchauthstr: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLConnectW(hdbc?.value?.toCPointer<ByteVar>(), szdsn?.value?.toCPointer<ByteVar>(), cchdsn, szuid?.value?.toCPointer<ByteVar>(), cchuid, szauthstr?.value?.toCPointer<ByteVar>(), cchauthstr)

public actual fun sQLCopyDesc(sourcedeschandle: COpaquePointer?, targetdeschandle: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLCopyDesc(sourcedeschandle?.value?.toCPointer<ByteVar>(), targetdeschandle?.value?.toCPointer<ByteVar>())

public actual fun sQLDataSources(environmenthandle: COpaquePointer?, direction: UShort, servername: COpaquePointer?, bufferlength1: Short, namelength1ptr: COpaquePointer?, description: COpaquePointer?, bufferlength2: Short, namelength2ptr: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLDataSources(environmenthandle?.value?.toCPointer<ByteVar>(), direction, servername?.value?.toCPointer<ByteVar>(), bufferlength1, namelength1ptr?.value?.toCPointer<ByteVar>(), description?.value?.toCPointer<ByteVar>(), bufferlength2, namelength2ptr?.value?.toCPointer<ByteVar>())

public actual fun sQLDataSourcesA(henv: COpaquePointer?, fdirection: UShort, szdsn: COpaquePointer?, cbdsnmax: Short, pcbdsn: COpaquePointer?, szdescription: COpaquePointer?, cbdescriptionmax: Short, pcbdescription: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLDataSourcesA(henv?.value?.toCPointer<ByteVar>(), fdirection, szdsn?.value?.toCPointer<ByteVar>(), cbdsnmax, pcbdsn?.value?.toCPointer<ByteVar>(), szdescription?.value?.toCPointer<ByteVar>(), cbdescriptionmax, pcbdescription?.value?.toCPointer<ByteVar>())

public actual fun sQLDataSourcesW(henv: COpaquePointer?, fdirection: UShort, szdsn: COpaquePointer?, cchdsnmax: Short, pcchdsn: COpaquePointer?, wszdescription: COpaquePointer?, cchdescriptionmax: Short, pcchdescription: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLDataSourcesW(henv?.value?.toCPointer<ByteVar>(), fdirection, szdsn?.value?.toCPointer<ByteVar>(), cchdsnmax, pcchdsn?.value?.toCPointer<ByteVar>(), wszdescription?.value?.toCPointer<ByteVar>(), cchdescriptionmax, pcchdescription?.value?.toCPointer<ByteVar>())

public actual fun sQLDescribeCol(statementhandle: COpaquePointer?, columnnumber: UShort, columnname: COpaquePointer?, bufferlength: Short, namelength: COpaquePointer?, datatype: COpaquePointer?, columnsize: COpaquePointer?, decimaldigits: COpaquePointer?, nullable: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLDescribeCol(statementhandle?.value?.toCPointer<ByteVar>(), columnnumber, columnname?.value?.toCPointer<ByteVar>(), bufferlength, namelength?.value?.toCPointer<ByteVar>(), datatype?.value?.toCPointer<ByteVar>(), columnsize?.value?.toCPointer<ByteVar>(), decimaldigits?.value?.toCPointer<ByteVar>(), nullable?.value?.toCPointer<ByteVar>())

public actual fun sQLDescribeColA(hstmt: COpaquePointer?, icol: UShort, szcolname: COpaquePointer?, cbcolnamemax: Short, pcbcolname: COpaquePointer?, pfsqltype: COpaquePointer?, pcbcoldef: COpaquePointer?, pibscale: COpaquePointer?, pfnullable: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLDescribeColA(hstmt?.value?.toCPointer<ByteVar>(), icol, szcolname?.value?.toCPointer<ByteVar>(), cbcolnamemax, pcbcolname?.value?.toCPointer<ByteVar>(), pfsqltype?.value?.toCPointer<ByteVar>(), pcbcoldef?.value?.toCPointer<ByteVar>(), pibscale?.value?.toCPointer<ByteVar>(), pfnullable?.value?.toCPointer<ByteVar>())

public actual fun sQLDescribeColW(hstmt: COpaquePointer?, icol: UShort, szcolname: COpaquePointer?, cchcolnamemax: Short, pcchcolname: COpaquePointer?, pfsqltype: COpaquePointer?, pcbcoldef: COpaquePointer?, pibscale: COpaquePointer?, pfnullable: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLDescribeColW(hstmt?.value?.toCPointer<ByteVar>(), icol, szcolname?.value?.toCPointer<ByteVar>(), cchcolnamemax, pcchcolname?.value?.toCPointer<ByteVar>(), pfsqltype?.value?.toCPointer<ByteVar>(), pcbcoldef?.value?.toCPointer<ByteVar>(), pibscale?.value?.toCPointer<ByteVar>(), pfnullable?.value?.toCPointer<ByteVar>())

public actual fun sQLDescribeParam(hstmt: COpaquePointer?, ipar: UShort, pfsqltype: COpaquePointer?, pcbparamdef: COpaquePointer?, pibscale: COpaquePointer?, pfnullable: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLDescribeParam(hstmt?.value?.toCPointer<ByteVar>(), ipar, pfsqltype?.value?.toCPointer<ByteVar>(), pcbparamdef?.value?.toCPointer<ByteVar>(), pibscale?.value?.toCPointer<ByteVar>(), pfnullable?.value?.toCPointer<ByteVar>())

public actual fun sQLDisconnect(connectionhandle: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLDisconnect(connectionhandle?.value?.toCPointer<ByteVar>())

public actual fun sQLDriverConnect(hdbc: COpaquePointer?, hwnd: Long, szconnstrin: COpaquePointer?, cchconnstrin: Short, szconnstrout: COpaquePointer?, cchconnstroutmax: Short, pcchconnstrout: COpaquePointer?, fdrivercompletion: UShort): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLDriverConnect(hdbc?.value?.toCPointer<ByteVar>(), hwnd, szconnstrin?.value?.toCPointer<ByteVar>(), cchconnstrin, szconnstrout?.value?.toCPointer<ByteVar>(), cchconnstroutmax, pcchconnstrout?.value?.toCPointer<ByteVar>(), fdrivercompletion)

public actual fun sQLDriverConnectA(hdbc: COpaquePointer?, hwnd: Long, szconnstrin: COpaquePointer?, cbconnstrin: Short, szconnstrout: COpaquePointer?, cbconnstroutmax: Short, pcbconnstrout: COpaquePointer?, fdrivercompletion: UShort): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLDriverConnectA(hdbc?.value?.toCPointer<ByteVar>(), hwnd, szconnstrin?.value?.toCPointer<ByteVar>(), cbconnstrin, szconnstrout?.value?.toCPointer<ByteVar>(), cbconnstroutmax, pcbconnstrout?.value?.toCPointer<ByteVar>(), fdrivercompletion)

public actual fun sQLDriverConnectW(hdbc: COpaquePointer?, hwnd: Long, szconnstrin: COpaquePointer?, cchconnstrin: Short, szconnstrout: COpaquePointer?, cchconnstroutmax: Short, pcchconnstrout: COpaquePointer?, fdrivercompletion: UShort): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLDriverConnectW(hdbc?.value?.toCPointer<ByteVar>(), hwnd, szconnstrin?.value?.toCPointer<ByteVar>(), cchconnstrin, szconnstrout?.value?.toCPointer<ByteVar>(), cchconnstroutmax, pcchconnstrout?.value?.toCPointer<ByteVar>(), fdrivercompletion)

public actual fun sQLDrivers(henv: COpaquePointer?, fdirection: UShort, szdriverdesc: COpaquePointer?, cchdriverdescmax: Short, pcchdriverdesc: COpaquePointer?, szdriverattributes: COpaquePointer?, cchdrvrattrmax: Short, pcchdrvrattr: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLDrivers(henv?.value?.toCPointer<ByteVar>(), fdirection, szdriverdesc?.value?.toCPointer<ByteVar>(), cchdriverdescmax, pcchdriverdesc?.value?.toCPointer<ByteVar>(), szdriverattributes?.value?.toCPointer<ByteVar>(), cchdrvrattrmax, pcchdrvrattr?.value?.toCPointer<ByteVar>())

public actual fun sQLDriversA(henv: COpaquePointer?, fdirection: UShort, szdriverdesc: COpaquePointer?, cbdriverdescmax: Short, pcbdriverdesc: COpaquePointer?, szdriverattributes: COpaquePointer?, cbdrvrattrmax: Short, pcbdrvrattr: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLDriversA(henv?.value?.toCPointer<ByteVar>(), fdirection, szdriverdesc?.value?.toCPointer<ByteVar>(), cbdriverdescmax, pcbdriverdesc?.value?.toCPointer<ByteVar>(), szdriverattributes?.value?.toCPointer<ByteVar>(), cbdrvrattrmax, pcbdrvrattr?.value?.toCPointer<ByteVar>())

public actual fun sQLDriversW(henv: COpaquePointer?, fdirection: UShort, szdriverdesc: COpaquePointer?, cchdriverdescmax: Short, pcchdriverdesc: COpaquePointer?, szdriverattributes: COpaquePointer?, cchdrvrattrmax: Short, pcchdrvrattr: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLDriversW(henv?.value?.toCPointer<ByteVar>(), fdirection, szdriverdesc?.value?.toCPointer<ByteVar>(), cchdriverdescmax, pcchdriverdesc?.value?.toCPointer<ByteVar>(), szdriverattributes?.value?.toCPointer<ByteVar>(), cchdrvrattrmax, pcchdrvrattr?.value?.toCPointer<ByteVar>())

public actual fun sQLEndTran(handletype: Short, handle: COpaquePointer?, completiontype: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLEndTran(handletype, handle?.value?.toCPointer<ByteVar>(), completiontype)

public actual fun sQLError(environmenthandle: COpaquePointer?, connectionhandle: COpaquePointer?, statementhandle: COpaquePointer?, sqlstate: COpaquePointer?, nativeerror: COpaquePointer?, messagetext: COpaquePointer?, bufferlength: Short, textlength: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLError(environmenthandle?.value?.toCPointer<ByteVar>(), connectionhandle?.value?.toCPointer<ByteVar>(), statementhandle?.value?.toCPointer<ByteVar>(), sqlstate?.value?.toCPointer<ByteVar>(), nativeerror?.value?.toCPointer<ByteVar>(), messagetext?.value?.toCPointer<ByteVar>(), bufferlength, textlength?.value?.toCPointer<ByteVar>())

public actual fun sQLErrorA(henv: COpaquePointer?, hdbc: COpaquePointer?, hstmt: COpaquePointer?, szsqlstate: COpaquePointer?, pfnativeerror: COpaquePointer?, szerrormsg: COpaquePointer?, cberrormsgmax: Short, pcberrormsg: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLErrorA(henv?.value?.toCPointer<ByteVar>(), hdbc?.value?.toCPointer<ByteVar>(), hstmt?.value?.toCPointer<ByteVar>(), szsqlstate?.value?.toCPointer<ByteVar>(), pfnativeerror?.value?.toCPointer<ByteVar>(), szerrormsg?.value?.toCPointer<ByteVar>(), cberrormsgmax, pcberrormsg?.value?.toCPointer<ByteVar>())

public actual fun sQLErrorW(henv: COpaquePointer?, hdbc: COpaquePointer?, hstmt: COpaquePointer?, wszsqlstate: COpaquePointer?, pfnativeerror: COpaquePointer?, wszerrormsg: COpaquePointer?, ccherrormsgmax: Short, pccherrormsg: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLErrorW(henv?.value?.toCPointer<ByteVar>(), hdbc?.value?.toCPointer<ByteVar>(), hstmt?.value?.toCPointer<ByteVar>(), wszsqlstate?.value?.toCPointer<ByteVar>(), pfnativeerror?.value?.toCPointer<ByteVar>(), wszerrormsg?.value?.toCPointer<ByteVar>(), ccherrormsgmax, pccherrormsg?.value?.toCPointer<ByteVar>())

public actual fun sQLExecDirect(statementhandle: COpaquePointer?, statementtext: COpaquePointer?, textlength: Int): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLExecDirect(statementhandle?.value?.toCPointer<ByteVar>(), statementtext?.value?.toCPointer<ByteVar>(), textlength)

public actual fun sQLExecDirectA(hstmt: COpaquePointer?, szsqlstr: COpaquePointer?, cbsqlstr: Int): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLExecDirectA(hstmt?.value?.toCPointer<ByteVar>(), szsqlstr?.value?.toCPointer<ByteVar>(), cbsqlstr)

public actual fun sQLExecDirectW(hstmt: COpaquePointer?, szsqlstr: COpaquePointer?, textlength: Int): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLExecDirectW(hstmt?.value?.toCPointer<ByteVar>(), szsqlstr?.value?.toCPointer<ByteVar>(), textlength)

public actual fun sQLExecute(statementhandle: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLExecute(statementhandle?.value?.toCPointer<ByteVar>())

public actual fun sQLExtendedFetch(hstmt: COpaquePointer?, ffetchtype: UShort, irow: Long, pcrow: COpaquePointer?, rgfrowstatus: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLExtendedFetch(hstmt?.value?.toCPointer<ByteVar>(), ffetchtype, irow, pcrow?.value?.toCPointer<ByteVar>(), rgfrowstatus?.value?.toCPointer<ByteVar>())

public actual fun sQLFetch(statementhandle: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLFetch(statementhandle?.value?.toCPointer<ByteVar>())

public actual fun sQLFetchScroll(statementhandle: COpaquePointer?, fetchorientation: Short, fetchoffset: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLFetchScroll(statementhandle?.value?.toCPointer<ByteVar>(), fetchorientation, fetchoffset)

public actual fun sQLForeignKeys(hstmt: COpaquePointer?, szpkcatalogname: COpaquePointer?, cchpkcatalogname: Short, szpkschemaname: COpaquePointer?, cchpkschemaname: Short, szpktablename: COpaquePointer?, cchpktablename: Short, szfkcatalogname: COpaquePointer?, cchfkcatalogname: Short, szfkschemaname: COpaquePointer?, cchfkschemaname: Short, szfktablename: COpaquePointer?, cchfktablename: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLForeignKeys(hstmt?.value?.toCPointer<ByteVar>(), szpkcatalogname?.value?.toCPointer<ByteVar>(), cchpkcatalogname, szpkschemaname?.value?.toCPointer<ByteVar>(), cchpkschemaname, szpktablename?.value?.toCPointer<ByteVar>(), cchpktablename, szfkcatalogname?.value?.toCPointer<ByteVar>(), cchfkcatalogname, szfkschemaname?.value?.toCPointer<ByteVar>(), cchfkschemaname, szfktablename?.value?.toCPointer<ByteVar>(), cchfktablename)

public actual fun sQLForeignKeysA(hstmt: COpaquePointer?, szpkcatalogname: COpaquePointer?, cbpkcatalogname: Short, szpkschemaname: COpaquePointer?, cbpkschemaname: Short, szpktablename: COpaquePointer?, cbpktablename: Short, szfkcatalogname: COpaquePointer?, cbfkcatalogname: Short, szfkschemaname: COpaquePointer?, cbfkschemaname: Short, szfktablename: COpaquePointer?, cbfktablename: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLForeignKeysA(hstmt?.value?.toCPointer<ByteVar>(), szpkcatalogname?.value?.toCPointer<ByteVar>(), cbpkcatalogname, szpkschemaname?.value?.toCPointer<ByteVar>(), cbpkschemaname, szpktablename?.value?.toCPointer<ByteVar>(), cbpktablename, szfkcatalogname?.value?.toCPointer<ByteVar>(), cbfkcatalogname, szfkschemaname?.value?.toCPointer<ByteVar>(), cbfkschemaname, szfktablename?.value?.toCPointer<ByteVar>(), cbfktablename)

public actual fun sQLForeignKeysW(hstmt: COpaquePointer?, szpkcatalogname: COpaquePointer?, cchpkcatalogname: Short, szpkschemaname: COpaquePointer?, cchpkschemaname: Short, szpktablename: COpaquePointer?, cchpktablename: Short, szfkcatalogname: COpaquePointer?, cchfkcatalogname: Short, szfkschemaname: COpaquePointer?, cchfkschemaname: Short, szfktablename: COpaquePointer?, cchfktablename: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLForeignKeysW(hstmt?.value?.toCPointer<ByteVar>(), szpkcatalogname?.value?.toCPointer<ByteVar>(), cchpkcatalogname, szpkschemaname?.value?.toCPointer<ByteVar>(), cchpkschemaname, szpktablename?.value?.toCPointer<ByteVar>(), cchpktablename, szfkcatalogname?.value?.toCPointer<ByteVar>(), cchfkcatalogname, szfkschemaname?.value?.toCPointer<ByteVar>(), cchfkschemaname, szfktablename?.value?.toCPointer<ByteVar>(), cchfktablename)

public actual fun sQLFreeConnect(connectionhandle: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLFreeConnect(connectionhandle?.value?.toCPointer<ByteVar>())

public actual fun sQLFreeEnv(environmenthandle: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLFreeEnv(environmenthandle?.value?.toCPointer<ByteVar>())

public actual fun sQLFreeHandle(handletype: Short, handle: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLFreeHandle(handletype, handle?.value?.toCPointer<ByteVar>())

public actual fun sQLFreeStmt(statementhandle: COpaquePointer?, option: UShort): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLFreeStmt(statementhandle?.value?.toCPointer<ByteVar>(), option)

public actual fun sQLGetConnectAttr(connectionhandle: COpaquePointer?, attribute: Int, value: COpaquePointer?, bufferlength: Int, stringlengthptr: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLGetConnectAttr(connectionhandle?.value?.toCPointer<ByteVar>(), attribute, value?.value?.toCPointer<ByteVar>(), bufferlength, stringlengthptr?.value?.toCPointer<ByteVar>())

public actual fun sQLGetConnectAttrA(hdbc: COpaquePointer?, fattribute: Int, rgbvalue: COpaquePointer?, cbvaluemax: Int, pcbvalue: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLGetConnectAttrA(hdbc?.value?.toCPointer<ByteVar>(), fattribute, rgbvalue?.value?.toCPointer<ByteVar>(), cbvaluemax, pcbvalue?.value?.toCPointer<ByteVar>())

public actual fun sQLGetConnectAttrW(hdbc: COpaquePointer?, fattribute: Int, rgbvalue: COpaquePointer?, cbvaluemax: Int, pcbvalue: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLGetConnectAttrW(hdbc?.value?.toCPointer<ByteVar>(), fattribute, rgbvalue?.value?.toCPointer<ByteVar>(), cbvaluemax, pcbvalue?.value?.toCPointer<ByteVar>())

public actual fun sQLGetConnectOption(connectionhandle: COpaquePointer?, option: UShort, value: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLGetConnectOption(connectionhandle?.value?.toCPointer<ByteVar>(), option, value?.value?.toCPointer<ByteVar>())

public actual fun sQLGetConnectOptionA(hdbc: COpaquePointer?, foption: UShort, pvparam: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLGetConnectOptionA(hdbc?.value?.toCPointer<ByteVar>(), foption, pvparam?.value?.toCPointer<ByteVar>())

public actual fun sQLGetConnectOptionW(hdbc: COpaquePointer?, foption: UShort, pvparam: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLGetConnectOptionW(hdbc?.value?.toCPointer<ByteVar>(), foption, pvparam?.value?.toCPointer<ByteVar>())

public actual fun sQLGetCursorName(statementhandle: COpaquePointer?, cursorname: COpaquePointer?, bufferlength: Short, namelengthptr: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLGetCursorName(statementhandle?.value?.toCPointer<ByteVar>(), cursorname?.value?.toCPointer<ByteVar>(), bufferlength, namelengthptr?.value?.toCPointer<ByteVar>())

public actual fun sQLGetCursorNameA(hstmt: COpaquePointer?, szcursor: COpaquePointer?, cbcursormax: Short, pcbcursor: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLGetCursorNameA(hstmt?.value?.toCPointer<ByteVar>(), szcursor?.value?.toCPointer<ByteVar>(), cbcursormax, pcbcursor?.value?.toCPointer<ByteVar>())

public actual fun sQLGetCursorNameW(hstmt: COpaquePointer?, szcursor: COpaquePointer?, cchcursormax: Short, pcchcursor: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLGetCursorNameW(hstmt?.value?.toCPointer<ByteVar>(), szcursor?.value?.toCPointer<ByteVar>(), cchcursormax, pcchcursor?.value?.toCPointer<ByteVar>())

public actual fun sQLGetData(statementhandle: COpaquePointer?, columnnumber: UShort, targettype: Short, targetvalue: COpaquePointer?, bufferlength: Long, strlenOrIndptr: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLGetData(statementhandle?.value?.toCPointer<ByteVar>(), columnnumber, targettype, targetvalue?.value?.toCPointer<ByteVar>(), bufferlength, strlenOrIndptr?.value?.toCPointer<ByteVar>())

public actual fun sQLGetDescField(descriptorhandle: COpaquePointer?, recnumber: Short, fieldidentifier: Short, value: COpaquePointer?, bufferlength: Int, stringlength: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLGetDescField(descriptorhandle?.value?.toCPointer<ByteVar>(), recnumber, fieldidentifier, value?.value?.toCPointer<ByteVar>(), bufferlength, stringlength?.value?.toCPointer<ByteVar>())

public actual fun sQLGetDescFieldA(hdesc: COpaquePointer?, irecord: Short, ifield: Short, rgbvalue: COpaquePointer?, cbbufferlength: Int, stringlength: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLGetDescFieldA(hdesc?.value?.toCPointer<ByteVar>(), irecord, ifield, rgbvalue?.value?.toCPointer<ByteVar>(), cbbufferlength, stringlength?.value?.toCPointer<ByteVar>())

public actual fun sQLGetDescFieldW(hdesc: COpaquePointer?, irecord: Short, ifield: Short, rgbvalue: COpaquePointer?, cbbufferlength: Int, stringlength: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLGetDescFieldW(hdesc?.value?.toCPointer<ByteVar>(), irecord, ifield, rgbvalue?.value?.toCPointer<ByteVar>(), cbbufferlength, stringlength?.value?.toCPointer<ByteVar>())

public actual fun sQLGetDescRec(descriptorhandle: COpaquePointer?, recnumber: Short, name: COpaquePointer?, bufferlength: Short, stringlengthptr: COpaquePointer?, typeptr: COpaquePointer?, subtypeptr: COpaquePointer?, lengthptr: COpaquePointer?, precisionptr: COpaquePointer?, scaleptr: COpaquePointer?, nullableptr: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLGetDescRec(descriptorhandle?.value?.toCPointer<ByteVar>(), recnumber, name?.value?.toCPointer<ByteVar>(), bufferlength, stringlengthptr?.value?.toCPointer<ByteVar>(), typeptr?.value?.toCPointer<ByteVar>(), subtypeptr?.value?.toCPointer<ByteVar>(), lengthptr?.value?.toCPointer<ByteVar>(), precisionptr?.value?.toCPointer<ByteVar>(), scaleptr?.value?.toCPointer<ByteVar>(), nullableptr?.value?.toCPointer<ByteVar>())

public actual fun sQLGetDescRecA(hdesc: COpaquePointer?, irecord: Short, szname: COpaquePointer?, cbnamemax: Short, pcbname: COpaquePointer?, pftype: COpaquePointer?, pfsubtype: COpaquePointer?, plength: COpaquePointer?, pprecision: COpaquePointer?, pscale: COpaquePointer?, pnullable: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLGetDescRecA(hdesc?.value?.toCPointer<ByteVar>(), irecord, szname?.value?.toCPointer<ByteVar>(), cbnamemax, pcbname?.value?.toCPointer<ByteVar>(), pftype?.value?.toCPointer<ByteVar>(), pfsubtype?.value?.toCPointer<ByteVar>(), plength?.value?.toCPointer<ByteVar>(), pprecision?.value?.toCPointer<ByteVar>(), pscale?.value?.toCPointer<ByteVar>(), pnullable?.value?.toCPointer<ByteVar>())

public actual fun sQLGetDescRecW(hdesc: COpaquePointer?, irecord: Short, szname: COpaquePointer?, cchnamemax: Short, pcchname: COpaquePointer?, pftype: COpaquePointer?, pfsubtype: COpaquePointer?, plength: COpaquePointer?, pprecision: COpaquePointer?, pscale: COpaquePointer?, pnullable: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLGetDescRecW(hdesc?.value?.toCPointer<ByteVar>(), irecord, szname?.value?.toCPointer<ByteVar>(), cchnamemax, pcchname?.value?.toCPointer<ByteVar>(), pftype?.value?.toCPointer<ByteVar>(), pfsubtype?.value?.toCPointer<ByteVar>(), plength?.value?.toCPointer<ByteVar>(), pprecision?.value?.toCPointer<ByteVar>(), pscale?.value?.toCPointer<ByteVar>(), pnullable?.value?.toCPointer<ByteVar>())

public actual fun sQLGetDiagField(handletype: Short, handle: COpaquePointer?, recnumber: Short, diagidentifier: Short, diaginfo: COpaquePointer?, bufferlength: Short, stringlength: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLGetDiagField(handletype, handle?.value?.toCPointer<ByteVar>(), recnumber, diagidentifier, diaginfo?.value?.toCPointer<ByteVar>(), bufferlength, stringlength?.value?.toCPointer<ByteVar>())

public actual fun sQLGetDiagFieldA(fhandletype: Short, handle: COpaquePointer?, irecord: Short, fdiagfield: Short, rgbdiaginfo: COpaquePointer?, cbdiaginfomax: Short, pcbdiaginfo: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLGetDiagFieldA(fhandletype, handle?.value?.toCPointer<ByteVar>(), irecord, fdiagfield, rgbdiaginfo?.value?.toCPointer<ByteVar>(), cbdiaginfomax, pcbdiaginfo?.value?.toCPointer<ByteVar>())

public actual fun sQLGetDiagFieldW(fhandletype: Short, handle: COpaquePointer?, irecord: Short, fdiagfield: Short, rgbdiaginfo: COpaquePointer?, cbbufferlength: Short, pcbstringlength: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLGetDiagFieldW(fhandletype, handle?.value?.toCPointer<ByteVar>(), irecord, fdiagfield, rgbdiaginfo?.value?.toCPointer<ByteVar>(), cbbufferlength, pcbstringlength?.value?.toCPointer<ByteVar>())

public actual fun sQLGetDiagRec(handletype: Short, handle: COpaquePointer?, recnumber: Short, sqlstate: COpaquePointer?, nativeerror: COpaquePointer?, messagetext: COpaquePointer?, bufferlength: Short, textlength: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLGetDiagRec(handletype, handle?.value?.toCPointer<ByteVar>(), recnumber, sqlstate?.value?.toCPointer<ByteVar>(), nativeerror?.value?.toCPointer<ByteVar>(), messagetext?.value?.toCPointer<ByteVar>(), bufferlength, textlength?.value?.toCPointer<ByteVar>())

public actual fun sQLGetDiagRecA(fhandletype: Short, handle: COpaquePointer?, irecord: Short, szsqlstate: COpaquePointer?, pfnativeerror: COpaquePointer?, szerrormsg: COpaquePointer?, cberrormsgmax: Short, pcberrormsg: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLGetDiagRecA(fhandletype, handle?.value?.toCPointer<ByteVar>(), irecord, szsqlstate?.value?.toCPointer<ByteVar>(), pfnativeerror?.value?.toCPointer<ByteVar>(), szerrormsg?.value?.toCPointer<ByteVar>(), cberrormsgmax, pcberrormsg?.value?.toCPointer<ByteVar>())

public actual fun sQLGetDiagRecW(fhandletype: Short, handle: COpaquePointer?, irecord: Short, szsqlstate: COpaquePointer?, pfnativeerror: COpaquePointer?, szerrormsg: COpaquePointer?, ccherrormsgmax: Short, pccherrormsg: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLGetDiagRecW(fhandletype, handle?.value?.toCPointer<ByteVar>(), irecord, szsqlstate?.value?.toCPointer<ByteVar>(), pfnativeerror?.value?.toCPointer<ByteVar>(), szerrormsg?.value?.toCPointer<ByteVar>(), ccherrormsgmax, pccherrormsg?.value?.toCPointer<ByteVar>())

public actual fun sQLGetEnvAttr(environmenthandle: COpaquePointer?, attribute: Int, value: COpaquePointer?, bufferlength: Int, stringlength: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLGetEnvAttr(environmenthandle?.value?.toCPointer<ByteVar>(), attribute, value?.value?.toCPointer<ByteVar>(), bufferlength, stringlength?.value?.toCPointer<ByteVar>())

public actual fun sQLGetFunctions(connectionhandle: COpaquePointer?, functionid: UShort, supported: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLGetFunctions(connectionhandle?.value?.toCPointer<ByteVar>(), functionid, supported?.value?.toCPointer<ByteVar>())

public actual fun sQLGetInfo(connectionhandle: COpaquePointer?, infotype: UShort, infovalue: COpaquePointer?, bufferlength: Short, stringlengthptr: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLGetInfo(connectionhandle?.value?.toCPointer<ByteVar>(), infotype, infovalue?.value?.toCPointer<ByteVar>(), bufferlength, stringlengthptr?.value?.toCPointer<ByteVar>())

public actual fun sQLGetInfoA(hdbc: COpaquePointer?, finfotype: UShort, rgbinfovalue: COpaquePointer?, cbinfovaluemax: Short, pcbinfovalue: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLGetInfoA(hdbc?.value?.toCPointer<ByteVar>(), finfotype, rgbinfovalue?.value?.toCPointer<ByteVar>(), cbinfovaluemax, pcbinfovalue?.value?.toCPointer<ByteVar>())

public actual fun sQLGetInfoW(hdbc: COpaquePointer?, finfotype: UShort, rgbinfovalue: COpaquePointer?, cbinfovaluemax: Short, pcbinfovalue: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLGetInfoW(hdbc?.value?.toCPointer<ByteVar>(), finfotype, rgbinfovalue?.value?.toCPointer<ByteVar>(), cbinfovaluemax, pcbinfovalue?.value?.toCPointer<ByteVar>())

public actual fun sQLGetNextEnumeration(henumhandle: Handle, prgenumdata: COpaquePointer?, pienumlength: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLGetNextEnumeration(henumhandle?.value?.toCPointer<ByteVar>(), prgenumdata?.value?.toCPointer<ByteVar>(), pienumlength?.value?.toCPointer<ByteVar>())

public actual fun sQLGetStmtAttr(statementhandle: COpaquePointer?, attribute: Int, value: COpaquePointer?, bufferlength: Int, stringlength: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLGetStmtAttr(statementhandle?.value?.toCPointer<ByteVar>(), attribute, value?.value?.toCPointer<ByteVar>(), bufferlength, stringlength?.value?.toCPointer<ByteVar>())

public actual fun sQLGetStmtAttrA(hstmt: COpaquePointer?, fattribute: Int, rgbvalue: COpaquePointer?, cbvaluemax: Int, pcbvalue: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLGetStmtAttrA(hstmt?.value?.toCPointer<ByteVar>(), fattribute, rgbvalue?.value?.toCPointer<ByteVar>(), cbvaluemax, pcbvalue?.value?.toCPointer<ByteVar>())

public actual fun sQLGetStmtAttrW(hstmt: COpaquePointer?, fattribute: Int, rgbvalue: COpaquePointer?, cbvaluemax: Int, pcbvalue: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLGetStmtAttrW(hstmt?.value?.toCPointer<ByteVar>(), fattribute, rgbvalue?.value?.toCPointer<ByteVar>(), cbvaluemax, pcbvalue?.value?.toCPointer<ByteVar>())

public actual fun sQLGetStmtOption(statementhandle: COpaquePointer?, option: UShort, value: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLGetStmtOption(statementhandle?.value?.toCPointer<ByteVar>(), option, value?.value?.toCPointer<ByteVar>())

public actual fun sQLGetTypeInfo(statementhandle: COpaquePointer?, datatype: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLGetTypeInfo(statementhandle?.value?.toCPointer<ByteVar>(), datatype)

public actual fun sQLGetTypeInfoA(statementhandle: COpaquePointer?, datatype: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLGetTypeInfoA(statementhandle?.value?.toCPointer<ByteVar>(), datatype)

public actual fun sQLGetTypeInfoW(statementhandle: COpaquePointer?, datatype: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLGetTypeInfoW(statementhandle?.value?.toCPointer<ByteVar>(), datatype)

public actual fun sQLInitEnumServers(pwchservername: Pcwstr, pwchinstancename: Pcwstr): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLInitEnumServers(pwchservername?.value?.toCPointer<ByteVar>(), pwchinstancename?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun sQLLinkedCatalogsA(param0: COpaquePointer?, param1: Pcstr, param2: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLLinkedCatalogsA(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2)

public actual fun sQLLinkedCatalogsW(param0: COpaquePointer?, param1: Pcwstr, param2: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLLinkedCatalogsW(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2)

public actual fun sQLLinkedServers(param0: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLLinkedServers(param0?.value?.toCPointer<ByteVar>())

public actual fun sQLMoreResults(hstmt: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLMoreResults(hstmt?.value?.toCPointer<ByteVar>())

public actual fun sQLNativeSql(hdbc: COpaquePointer?, szsqlstrin: COpaquePointer?, cchsqlstrin: Int, szsqlstr: COpaquePointer?, cchsqlstrmax: Int, pcbsqlstr: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLNativeSql(hdbc?.value?.toCPointer<ByteVar>(), szsqlstrin?.value?.toCPointer<ByteVar>(), cchsqlstrin, szsqlstr?.value?.toCPointer<ByteVar>(), cchsqlstrmax, pcbsqlstr?.value?.toCPointer<ByteVar>())

public actual fun sQLNativeSqlA(hdbc: COpaquePointer?, szsqlstrin: COpaquePointer?, cbsqlstrin: Int, szsqlstr: COpaquePointer?, cbsqlstrmax: Int, pcbsqlstr: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLNativeSqlA(hdbc?.value?.toCPointer<ByteVar>(), szsqlstrin?.value?.toCPointer<ByteVar>(), cbsqlstrin, szsqlstr?.value?.toCPointer<ByteVar>(), cbsqlstrmax, pcbsqlstr?.value?.toCPointer<ByteVar>())

public actual fun sQLNativeSqlW(hdbc: COpaquePointer?, szsqlstrin: COpaquePointer?, cchsqlstrin: Int, szsqlstr: COpaquePointer?, cchsqlstrmax: Int, pcchsqlstr: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLNativeSqlW(hdbc?.value?.toCPointer<ByteVar>(), szsqlstrin?.value?.toCPointer<ByteVar>(), cchsqlstrin, szsqlstr?.value?.toCPointer<ByteVar>(), cchsqlstrmax, pcchsqlstr?.value?.toCPointer<ByteVar>())

public actual fun sQLNumParams(hstmt: COpaquePointer?, pcpar: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLNumParams(hstmt?.value?.toCPointer<ByteVar>(), pcpar?.value?.toCPointer<ByteVar>())

public actual fun sQLNumResultCols(statementhandle: COpaquePointer?, columncount: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLNumResultCols(statementhandle?.value?.toCPointer<ByteVar>(), columncount?.value?.toCPointer<ByteVar>())

public actual fun sQLParamData(statementhandle: COpaquePointer?, value: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLParamData(statementhandle?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun sQLParamOptions(hstmt: COpaquePointer?, crow: ULong, pirow: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLParamOptions(hstmt?.value?.toCPointer<ByteVar>(), crow, pirow?.value?.toCPointer<ByteVar>())

public actual fun sQLPrepare(statementhandle: COpaquePointer?, statementtext: COpaquePointer?, textlength: Int): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLPrepare(statementhandle?.value?.toCPointer<ByteVar>(), statementtext?.value?.toCPointer<ByteVar>(), textlength)

public actual fun sQLPrepareA(hstmt: COpaquePointer?, szsqlstr: COpaquePointer?, cbsqlstr: Int): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLPrepareA(hstmt?.value?.toCPointer<ByteVar>(), szsqlstr?.value?.toCPointer<ByteVar>(), cbsqlstr)

public actual fun sQLPrepareW(hstmt: COpaquePointer?, szsqlstr: COpaquePointer?, cchsqlstr: Int): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLPrepareW(hstmt?.value?.toCPointer<ByteVar>(), szsqlstr?.value?.toCPointer<ByteVar>(), cchsqlstr)

public actual fun sQLPrimaryKeys(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cchcatalogname: Short, szschemaname: COpaquePointer?, cchschemaname: Short, sztablename: COpaquePointer?, cchtablename: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLPrimaryKeys(hstmt?.value?.toCPointer<ByteVar>(), szcatalogname?.value?.toCPointer<ByteVar>(), cchcatalogname, szschemaname?.value?.toCPointer<ByteVar>(), cchschemaname, sztablename?.value?.toCPointer<ByteVar>(), cchtablename)

public actual fun sQLPrimaryKeysA(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cbcatalogname: Short, szschemaname: COpaquePointer?, cbschemaname: Short, sztablename: COpaquePointer?, cbtablename: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLPrimaryKeysA(hstmt?.value?.toCPointer<ByteVar>(), szcatalogname?.value?.toCPointer<ByteVar>(), cbcatalogname, szschemaname?.value?.toCPointer<ByteVar>(), cbschemaname, sztablename?.value?.toCPointer<ByteVar>(), cbtablename)

public actual fun sQLPrimaryKeysW(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cchcatalogname: Short, szschemaname: COpaquePointer?, cchschemaname: Short, sztablename: COpaquePointer?, cchtablename: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLPrimaryKeysW(hstmt?.value?.toCPointer<ByteVar>(), szcatalogname?.value?.toCPointer<ByteVar>(), cchcatalogname, szschemaname?.value?.toCPointer<ByteVar>(), cchschemaname, sztablename?.value?.toCPointer<ByteVar>(), cchtablename)

public actual fun sQLProcedureColumns(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cchcatalogname: Short, szschemaname: COpaquePointer?, cchschemaname: Short, szprocname: COpaquePointer?, cchprocname: Short, szcolumnname: COpaquePointer?, cchcolumnname: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLProcedureColumns(hstmt?.value?.toCPointer<ByteVar>(), szcatalogname?.value?.toCPointer<ByteVar>(), cchcatalogname, szschemaname?.value?.toCPointer<ByteVar>(), cchschemaname, szprocname?.value?.toCPointer<ByteVar>(), cchprocname, szcolumnname?.value?.toCPointer<ByteVar>(), cchcolumnname)

public actual fun sQLProcedureColumnsA(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cbcatalogname: Short, szschemaname: COpaquePointer?, cbschemaname: Short, szprocname: COpaquePointer?, cbprocname: Short, szcolumnname: COpaquePointer?, cbcolumnname: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLProcedureColumnsA(hstmt?.value?.toCPointer<ByteVar>(), szcatalogname?.value?.toCPointer<ByteVar>(), cbcatalogname, szschemaname?.value?.toCPointer<ByteVar>(), cbschemaname, szprocname?.value?.toCPointer<ByteVar>(), cbprocname, szcolumnname?.value?.toCPointer<ByteVar>(), cbcolumnname)

public actual fun sQLProcedureColumnsW(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cchcatalogname: Short, szschemaname: COpaquePointer?, cchschemaname: Short, szprocname: COpaquePointer?, cchprocname: Short, szcolumnname: COpaquePointer?, cchcolumnname: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLProcedureColumnsW(hstmt?.value?.toCPointer<ByteVar>(), szcatalogname?.value?.toCPointer<ByteVar>(), cchcatalogname, szschemaname?.value?.toCPointer<ByteVar>(), cchschemaname, szprocname?.value?.toCPointer<ByteVar>(), cchprocname, szcolumnname?.value?.toCPointer<ByteVar>(), cchcolumnname)

public actual fun sQLProcedures(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cchcatalogname: Short, szschemaname: COpaquePointer?, cchschemaname: Short, szprocname: COpaquePointer?, cchprocname: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLProcedures(hstmt?.value?.toCPointer<ByteVar>(), szcatalogname?.value?.toCPointer<ByteVar>(), cchcatalogname, szschemaname?.value?.toCPointer<ByteVar>(), cchschemaname, szprocname?.value?.toCPointer<ByteVar>(), cchprocname)

public actual fun sQLProceduresA(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cbcatalogname: Short, szschemaname: COpaquePointer?, cbschemaname: Short, szprocname: COpaquePointer?, cbprocname: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLProceduresA(hstmt?.value?.toCPointer<ByteVar>(), szcatalogname?.value?.toCPointer<ByteVar>(), cbcatalogname, szschemaname?.value?.toCPointer<ByteVar>(), cbschemaname, szprocname?.value?.toCPointer<ByteVar>(), cbprocname)

public actual fun sQLProceduresW(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cchcatalogname: Short, szschemaname: COpaquePointer?, cchschemaname: Short, szprocname: COpaquePointer?, cchprocname: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLProceduresW(hstmt?.value?.toCPointer<ByteVar>(), szcatalogname?.value?.toCPointer<ByteVar>(), cchcatalogname, szschemaname?.value?.toCPointer<ByteVar>(), cchschemaname, szprocname?.value?.toCPointer<ByteVar>(), cchprocname)

public actual fun sQLPutData(statementhandle: COpaquePointer?, data: COpaquePointer?, strlenOrInd: Long): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLPutData(statementhandle?.value?.toCPointer<ByteVar>(), data?.value?.toCPointer<ByteVar>(), strlenOrInd)

public actual fun sQLRowCount(statementhandle: COpaquePointer?, rowcount: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLRowCount(statementhandle?.value?.toCPointer<ByteVar>(), rowcount?.value?.toCPointer<ByteVar>())

public actual fun sQLSetConnectAttr(connectionhandle: COpaquePointer?, attribute: Int, value: COpaquePointer?, stringlength: Int): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLSetConnectAttr(connectionhandle?.value?.toCPointer<ByteVar>(), attribute, value?.value?.toCPointer<ByteVar>(), stringlength)

public actual fun sQLSetConnectAttrA(hdbc: COpaquePointer?, fattribute: Int, rgbvalue: COpaquePointer?, cbvalue: Int): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLSetConnectAttrA(hdbc?.value?.toCPointer<ByteVar>(), fattribute, rgbvalue?.value?.toCPointer<ByteVar>(), cbvalue)

public actual fun sQLSetConnectAttrW(hdbc: COpaquePointer?, fattribute: Int, rgbvalue: COpaquePointer?, cbvalue: Int): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLSetConnectAttrW(hdbc?.value?.toCPointer<ByteVar>(), fattribute, rgbvalue?.value?.toCPointer<ByteVar>(), cbvalue)

public actual fun sQLSetConnectOption(connectionhandle: COpaquePointer?, option: UShort, value: ULong): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLSetConnectOption(connectionhandle?.value?.toCPointer<ByteVar>(), option, value)

public actual fun sQLSetConnectOptionA(hdbc: COpaquePointer?, foption: UShort, vparam: ULong): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLSetConnectOptionA(hdbc?.value?.toCPointer<ByteVar>(), foption, vparam)

public actual fun sQLSetConnectOptionW(hdbc: COpaquePointer?, foption: UShort, vparam: ULong): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLSetConnectOptionW(hdbc?.value?.toCPointer<ByteVar>(), foption, vparam)

public actual fun sQLSetCursorName(statementhandle: COpaquePointer?, cursorname: COpaquePointer?, namelength: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLSetCursorName(statementhandle?.value?.toCPointer<ByteVar>(), cursorname?.value?.toCPointer<ByteVar>(), namelength)

public actual fun sQLSetCursorNameA(hstmt: COpaquePointer?, szcursor: COpaquePointer?, cbcursor: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLSetCursorNameA(hstmt?.value?.toCPointer<ByteVar>(), szcursor?.value?.toCPointer<ByteVar>(), cbcursor)

public actual fun sQLSetCursorNameW(hstmt: COpaquePointer?, szcursor: COpaquePointer?, cchcursor: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLSetCursorNameW(hstmt?.value?.toCPointer<ByteVar>(), szcursor?.value?.toCPointer<ByteVar>(), cchcursor)

public actual fun sQLSetDescField(descriptorhandle: COpaquePointer?, recnumber: Short, fieldidentifier: Short, value: COpaquePointer?, bufferlength: Int): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLSetDescField(descriptorhandle?.value?.toCPointer<ByteVar>(), recnumber, fieldidentifier, value?.value?.toCPointer<ByteVar>(), bufferlength)

public actual fun sQLSetDescFieldW(descriptorhandle: COpaquePointer?, recnumber: Short, fieldidentifier: Short, value: COpaquePointer?, bufferlength: Int): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLSetDescFieldW(descriptorhandle?.value?.toCPointer<ByteVar>(), recnumber, fieldidentifier, value?.value?.toCPointer<ByteVar>(), bufferlength)

public actual fun sQLSetDescRec(descriptorhandle: COpaquePointer?, recnumber: Short, type: Short, subtype: Short, length: Long, precision: Short, scale: Short, data: COpaquePointer?, stringlength: COpaquePointer?, indicator: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLSetDescRec(descriptorhandle?.value?.toCPointer<ByteVar>(), recnumber, type, subtype, length, precision, scale, data?.value?.toCPointer<ByteVar>(), stringlength?.value?.toCPointer<ByteVar>(), indicator?.value?.toCPointer<ByteVar>())

public actual fun sQLSetEnvAttr(environmenthandle: COpaquePointer?, attribute: Int, value: COpaquePointer?, stringlength: Int): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLSetEnvAttr(environmenthandle?.value?.toCPointer<ByteVar>(), attribute, value?.value?.toCPointer<ByteVar>(), stringlength)

public actual fun sQLSetParam(statementhandle: COpaquePointer?, parameternumber: UShort, valuetype: Short, parametertype: Short, lengthprecision: ULong, parameterscale: Short, parametervalue: COpaquePointer?, strlenOrInd: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLSetParam(statementhandle?.value?.toCPointer<ByteVar>(), parameternumber, valuetype, parametertype, lengthprecision, parameterscale, parametervalue?.value?.toCPointer<ByteVar>(), strlenOrInd?.value?.toCPointer<ByteVar>())

public actual fun sQLSetPos(hstmt: COpaquePointer?, irow: ULong, foption: UShort, flock: UShort): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLSetPos(hstmt?.value?.toCPointer<ByteVar>(), irow, foption, flock)

public actual fun sQLSetScrollOptions(hstmt: COpaquePointer?, fconcurrency: UShort, crowkeyset: Long, crowrowset: UShort): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLSetScrollOptions(hstmt?.value?.toCPointer<ByteVar>(), fconcurrency, crowkeyset, crowrowset)

public actual fun sQLSetStmtAttr(statementhandle: COpaquePointer?, attribute: Int, value: COpaquePointer?, stringlength: Int): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLSetStmtAttr(statementhandle?.value?.toCPointer<ByteVar>(), attribute, value?.value?.toCPointer<ByteVar>(), stringlength)

public actual fun sQLSetStmtAttrW(hstmt: COpaquePointer?, fattribute: Int, rgbvalue: COpaquePointer?, cbvaluemax: Int): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLSetStmtAttrW(hstmt?.value?.toCPointer<ByteVar>(), fattribute, rgbvalue?.value?.toCPointer<ByteVar>(), cbvaluemax)

public actual fun sQLSetStmtOption(statementhandle: COpaquePointer?, option: UShort, value: ULong): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLSetStmtOption(statementhandle?.value?.toCPointer<ByteVar>(), option, value)

public actual fun sQLSpecialColumns(statementhandle: COpaquePointer?, identifiertype: UShort, catalogname: COpaquePointer?, namelength1: Short, schemaname: COpaquePointer?, namelength2: Short, tablename: COpaquePointer?, namelength3: Short, scope: UShort, nullable: UShort): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLSpecialColumns(statementhandle?.value?.toCPointer<ByteVar>(), identifiertype, catalogname?.value?.toCPointer<ByteVar>(), namelength1, schemaname?.value?.toCPointer<ByteVar>(), namelength2, tablename?.value?.toCPointer<ByteVar>(), namelength3, scope, nullable)

public actual fun sQLSpecialColumnsA(hstmt: COpaquePointer?, fcoltype: UShort, szcatalogname: COpaquePointer?, cbcatalogname: Short, szschemaname: COpaquePointer?, cbschemaname: Short, sztablename: COpaquePointer?, cbtablename: Short, fscope: UShort, fnullable: UShort): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLSpecialColumnsA(hstmt?.value?.toCPointer<ByteVar>(), fcoltype, szcatalogname?.value?.toCPointer<ByteVar>(), cbcatalogname, szschemaname?.value?.toCPointer<ByteVar>(), cbschemaname, sztablename?.value?.toCPointer<ByteVar>(), cbtablename, fscope, fnullable)

public actual fun sQLSpecialColumnsW(hstmt: COpaquePointer?, fcoltype: UShort, szcatalogname: COpaquePointer?, cchcatalogname: Short, szschemaname: COpaquePointer?, cchschemaname: Short, sztablename: COpaquePointer?, cchtablename: Short, fscope: UShort, fnullable: UShort): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLSpecialColumnsW(hstmt?.value?.toCPointer<ByteVar>(), fcoltype, szcatalogname?.value?.toCPointer<ByteVar>(), cchcatalogname, szschemaname?.value?.toCPointer<ByteVar>(), cchschemaname, sztablename?.value?.toCPointer<ByteVar>(), cchtablename, fscope, fnullable)

public actual fun sQLStatistics(statementhandle: COpaquePointer?, catalogname: COpaquePointer?, namelength1: Short, schemaname: COpaquePointer?, namelength2: Short, tablename: COpaquePointer?, namelength3: Short, unique: UShort, reserved: UShort): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLStatistics(statementhandle?.value?.toCPointer<ByteVar>(), catalogname?.value?.toCPointer<ByteVar>(), namelength1, schemaname?.value?.toCPointer<ByteVar>(), namelength2, tablename?.value?.toCPointer<ByteVar>(), namelength3, unique, reserved)

public actual fun sQLStatisticsA(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cbcatalogname: Short, szschemaname: COpaquePointer?, cbschemaname: Short, sztablename: COpaquePointer?, cbtablename: Short, funique: UShort, faccuracy: UShort): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLStatisticsA(hstmt?.value?.toCPointer<ByteVar>(), szcatalogname?.value?.toCPointer<ByteVar>(), cbcatalogname, szschemaname?.value?.toCPointer<ByteVar>(), cbschemaname, sztablename?.value?.toCPointer<ByteVar>(), cbtablename, funique, faccuracy)

public actual fun sQLStatisticsW(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cchcatalogname: Short, szschemaname: COpaquePointer?, cchschemaname: Short, sztablename: COpaquePointer?, cchtablename: Short, funique: UShort, faccuracy: UShort): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLStatisticsW(hstmt?.value?.toCPointer<ByteVar>(), szcatalogname?.value?.toCPointer<ByteVar>(), cchcatalogname, szschemaname?.value?.toCPointer<ByteVar>(), cchschemaname, sztablename?.value?.toCPointer<ByteVar>(), cchtablename, funique, faccuracy)

public actual fun sQLTablePrivileges(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cchcatalogname: Short, szschemaname: COpaquePointer?, cchschemaname: Short, sztablename: COpaquePointer?, cchtablename: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLTablePrivileges(hstmt?.value?.toCPointer<ByteVar>(), szcatalogname?.value?.toCPointer<ByteVar>(), cchcatalogname, szschemaname?.value?.toCPointer<ByteVar>(), cchschemaname, sztablename?.value?.toCPointer<ByteVar>(), cchtablename)

public actual fun sQLTablePrivilegesA(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cbcatalogname: Short, szschemaname: COpaquePointer?, cbschemaname: Short, sztablename: COpaquePointer?, cbtablename: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLTablePrivilegesA(hstmt?.value?.toCPointer<ByteVar>(), szcatalogname?.value?.toCPointer<ByteVar>(), cbcatalogname, szschemaname?.value?.toCPointer<ByteVar>(), cbschemaname, sztablename?.value?.toCPointer<ByteVar>(), cbtablename)

public actual fun sQLTablePrivilegesW(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cchcatalogname: Short, szschemaname: COpaquePointer?, cchschemaname: Short, sztablename: COpaquePointer?, cchtablename: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLTablePrivilegesW(hstmt?.value?.toCPointer<ByteVar>(), szcatalogname?.value?.toCPointer<ByteVar>(), cchcatalogname, szschemaname?.value?.toCPointer<ByteVar>(), cchschemaname, sztablename?.value?.toCPointer<ByteVar>(), cchtablename)

public actual fun sQLTables(statementhandle: COpaquePointer?, catalogname: COpaquePointer?, namelength1: Short, schemaname: COpaquePointer?, namelength2: Short, tablename: COpaquePointer?, namelength3: Short, tabletype: COpaquePointer?, namelength4: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLTables(statementhandle?.value?.toCPointer<ByteVar>(), catalogname?.value?.toCPointer<ByteVar>(), namelength1, schemaname?.value?.toCPointer<ByteVar>(), namelength2, tablename?.value?.toCPointer<ByteVar>(), namelength3, tabletype?.value?.toCPointer<ByteVar>(), namelength4)

public actual fun sQLTablesA(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cbcatalogname: Short, szschemaname: COpaquePointer?, cbschemaname: Short, sztablename: COpaquePointer?, cbtablename: Short, sztabletype: COpaquePointer?, cbtabletype: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLTablesA(hstmt?.value?.toCPointer<ByteVar>(), szcatalogname?.value?.toCPointer<ByteVar>(), cbcatalogname, szschemaname?.value?.toCPointer<ByteVar>(), cbschemaname, sztablename?.value?.toCPointer<ByteVar>(), cbtablename, sztabletype?.value?.toCPointer<ByteVar>(), cbtabletype)

public actual fun sQLTablesW(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cchcatalogname: Short, szschemaname: COpaquePointer?, cchschemaname: Short, sztablename: COpaquePointer?, cchtablename: Short, sztabletype: COpaquePointer?, cchtabletype: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLTablesW(hstmt?.value?.toCPointer<ByteVar>(), szcatalogname?.value?.toCPointer<ByteVar>(), cchcatalogname, szschemaname?.value?.toCPointer<ByteVar>(), cchschemaname, sztablename?.value?.toCPointer<ByteVar>(), cchtablename, sztabletype?.value?.toCPointer<ByteVar>(), cchtabletype)

public actual fun sQLTransact(environmenthandle: COpaquePointer?, connectionhandle: COpaquePointer?, completiontype: UShort): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_sQLTransact(environmenthandle?.value?.toCPointer<ByteVar>(), connectionhandle?.value?.toCPointer<ByteVar>(), completiontype)

public actual fun bcpBatch(param0: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_bcpBatch(param0?.value?.toCPointer<ByteVar>())

public actual fun bcpBind(param0: COpaquePointer?, param1: COpaquePointer?, param2: Int, param3: Int, param4: COpaquePointer?, param5: Int, param6: Int, param7: Int): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_bcpBind(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2, param3, param4?.value?.toCPointer<ByteVar>(), param5, param6, param7)

public actual fun bcpColfmt(param0: COpaquePointer?, param1: Int, param2: UByte, param3: Int, param4: Int, param5: COpaquePointer?, param6: Int, param7: Int): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_bcpColfmt(param0?.value?.toCPointer<ByteVar>(), param1, param2, param3, param4, param5?.value?.toCPointer<ByteVar>(), param6, param7)

public actual fun bcpCollen(param0: COpaquePointer?, param1: Int, param2: Int): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_bcpCollen(param0?.value?.toCPointer<ByteVar>(), param1, param2)

public actual fun bcpColptr(param0: COpaquePointer?, param1: COpaquePointer?, param2: Int): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_bcpColptr(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2)

public actual fun bcpColumns(param0: COpaquePointer?, param1: Int): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_bcpColumns(param0?.value?.toCPointer<ByteVar>(), param1)

public actual fun bcpControl(param0: COpaquePointer?, param1: Int, param2: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_bcpControl(param0?.value?.toCPointer<ByteVar>(), param1, param2?.value?.toCPointer<ByteVar>())

public actual fun bcpDone(param0: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_bcpDone(param0?.value?.toCPointer<ByteVar>())

public actual fun bcpExec(param0: COpaquePointer?, param1: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_bcpExec(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>())

public actual fun bcpGetcolfmt(param0: COpaquePointer?, param1: Int, param2: Int, param3: COpaquePointer?, param4: Int, param5: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_bcpGetcolfmt(param0?.value?.toCPointer<ByteVar>(), param1, param2, param3?.value?.toCPointer<ByteVar>(), param4, param5?.value?.toCPointer<ByteVar>())

public actual fun bcpInitA(param0: COpaquePointer?, param1: Pcstr, param2: Pcstr, param3: Pcstr, param4: Int): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_bcpInitA(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>(), param3?.value?.toCPointer<ByteVar>(), param4)

public actual fun bcpInitW(param0: COpaquePointer?, param1: Pcwstr, param2: Pcwstr, param3: Pcwstr, param4: Int): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_bcpInitW(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>(), param3?.value?.toCPointer<ByteVar>(), param4)

public actual fun bcpMoretext(param0: COpaquePointer?, param1: Int, param2: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_bcpMoretext(param0?.value?.toCPointer<ByteVar>(), param1, param2?.value?.toCPointer<ByteVar>())

public actual fun bcpReadfmtA(param0: COpaquePointer?, param1: Pcstr): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_bcpReadfmtA(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>())

public actual fun bcpReadfmtW(param0: COpaquePointer?, param1: Pcwstr): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_bcpReadfmtW(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>())

public actual fun bcpSendrow(param0: COpaquePointer?): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_bcpSendrow(param0?.value?.toCPointer<ByteVar>())

public actual fun bcpSetcolfmt(param0: COpaquePointer?, param1: Int, param2: Int, param3: COpaquePointer?, param4: Int): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_bcpSetcolfmt(param0?.value?.toCPointer<ByteVar>(), param1, param2, param3?.value?.toCPointer<ByteVar>(), param4)

public actual fun bcpWritefmtA(param0: COpaquePointer?, param1: Pcstr): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_bcpWritefmtA(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>())

public actual fun bcpWritefmtW(param0: COpaquePointer?, param1: Pcwstr): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_bcpWritefmtW(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>())

public actual fun dbprtypeA(param0: Int): Pstr =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_dbprtypeA(param0)?.let { COpaquePointer(it.toLong()) }

public actual fun dbprtypeW(param0: Int): Pwstr =
    io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssys_windows_win32_system_search_dbprtypeW(param0)?.let { COpaquePointer(it.toLong()) }
