@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.search

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

private val _windowsWin32SystemSearchNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/windowssys_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-windowssys/build/Release/windowssys_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-windowssys/build/Debug/windowssys_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-windowssys/dist/build/Release/windowssys_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-windowssys/dist/build/Debug/windowssys_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun ODBCGetTryWaitValue(): UInt =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_ODBCGetTryWaitValue() as Int).toUInt() else 0u

public actual fun ODBCSetTryWaitValue(dwvalue: UInt): BOOL =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_ODBCSetTryWaitValue(dwvalue.toInt()) as Int) else 0

public actual fun SQLAllocConnect(environmenthandle: Long, connectionhandle: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLAllocConnect(environmenthandle.toString(), connectionhandle.toString()) as Int).toShort() else 0

public actual fun SQLAllocEnv(environmenthandle: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLAllocEnv(environmenthandle.toString()) as Int).toShort() else 0

public actual fun SQLAllocHandle(handletype: Short, inputhandle: Long, outputhandle: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLAllocHandle(handletype.toInt(), inputhandle.toString(), outputhandle.toString()) as Int).toShort() else 0

public actual fun SQLAllocHandleStd(fhandletype: Short, hinput: Long, phoutput: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLAllocHandleStd(fhandletype.toInt(), hinput.toString(), phoutput.toString()) as Int).toShort() else 0

public actual fun SQLAllocStmt(connectionhandle: Long, statementhandle: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLAllocStmt(connectionhandle.toString(), statementhandle.toString()) as Int).toShort() else 0

public actual fun SQLBindCol(statementhandle: Long, columnnumber: UShort, targettype: Short, targetvalue: Long, bufferlength: Long, strlen_or_ind: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLBindCol(statementhandle.toString(), columnnumber.toInt(), targettype.toInt(), targetvalue.toString(), bufferlength.toString(), strlen_or_ind.toString()) as Int).toShort() else 0

public actual fun SQLBindParam(statementhandle: Long, parameternumber: UShort, valuetype: Short, parametertype: Short, lengthprecision: ULong, parameterscale: Short, parametervalue: Long, strlen_or_ind: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLBindParam(statementhandle.toString(), parameternumber.toInt(), valuetype.toInt(), parametertype.toInt(), lengthprecision.toString(), parameterscale.toInt(), parametervalue.toString(), strlen_or_ind.toString()) as Int).toShort() else 0

public actual fun SQLBindParameter(hstmt: Long, ipar: UShort, fparamtype: Short, fctype: Short, fsqltype: Short, cbcoldef: ULong, ibscale: Short, rgbvalue: Long, cbvaluemax: Long, pcbvalue: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLBindParameter(hstmt.toString(), ipar.toInt(), fparamtype.toInt(), fctype.toInt(), fsqltype.toInt(), cbcoldef.toString(), ibscale.toInt(), rgbvalue.toString(), cbvaluemax.toString(), pcbvalue.toString()) as Int).toShort() else 0

public actual fun SQLBrowseConnect(hdbc: Long, szconnstrin: Long, cchconnstrin: Short, szconnstrout: Long, cchconnstroutmax: Short, pcchconnstrout: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLBrowseConnect(hdbc.toString(), szconnstrin.toString(), cchconnstrin.toInt(), szconnstrout.toString(), cchconnstroutmax.toInt(), pcchconnstrout.toString()) as Int).toShort() else 0

public actual fun SQLBrowseConnectA(hdbc: Long, szconnstrin: Long, cbconnstrin: Short, szconnstrout: Long, cbconnstroutmax: Short, pcbconnstrout: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLBrowseConnectA(hdbc.toString(), szconnstrin.toString(), cbconnstrin.toInt(), szconnstrout.toString(), cbconnstroutmax.toInt(), pcbconnstrout.toString()) as Int).toShort() else 0

public actual fun SQLBrowseConnectW(hdbc: Long, szconnstrin: Long, cchconnstrin: Short, szconnstrout: Long, cchconnstroutmax: Short, pcchconnstrout: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLBrowseConnectW(hdbc.toString(), szconnstrin.toString(), cchconnstrin.toInt(), szconnstrout.toString(), cchconnstroutmax.toInt(), pcchconnstrout.toString()) as Int).toShort() else 0

public actual fun SQLBulkOperations(statementhandle: Long, operation: Short): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLBulkOperations(statementhandle.toString(), operation.toInt()) as Int).toShort() else 0

public actual fun SQLCancel(statementhandle: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLCancel(statementhandle.toString()) as Int).toShort() else 0

public actual fun SQLCancelHandle(handletype: Short, inputhandle: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLCancelHandle(handletype.toInt(), inputhandle.toString()) as Int).toShort() else 0

public actual fun SQLCloseCursor(statementhandle: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLCloseCursor(statementhandle.toString()) as Int).toShort() else 0

public actual fun SQLCloseEnumServers(henumhandle: HANDLE): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLCloseEnumServers(henumhandle.toString()) as Int).toShort() else 0

public actual fun SQLColAttribute(statementhandle: Long, columnnumber: UShort, fieldidentifier: UShort, characterattribute: Long, bufferlength: Short, stringlength: Long, numericattribute: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLColAttribute(statementhandle.toString(), columnnumber.toInt(), fieldidentifier.toInt(), characterattribute.toString(), bufferlength.toInt(), stringlength.toString(), numericattribute.toString()) as Int).toShort() else 0

public actual fun SQLColAttributeA(hstmt: Long, icol: Short, ifield: Short, pcharattr: Long, cbcharattrmax: Short, pcbcharattr: Long, pnumattr: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLColAttributeA(hstmt.toString(), icol.toInt(), ifield.toInt(), pcharattr.toString(), cbcharattrmax.toInt(), pcbcharattr.toString(), pnumattr.toString()) as Int).toShort() else 0

public actual fun SQLColAttributeW(hstmt: Long, icol: UShort, ifield: UShort, pcharattr: Long, cbdescmax: Short, pcbcharattr: Long, pnumattr: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLColAttributeW(hstmt.toString(), icol.toInt(), ifield.toInt(), pcharattr.toString(), cbdescmax.toInt(), pcbcharattr.toString(), pnumattr.toString()) as Int).toShort() else 0

public actual fun SQLColAttributes(hstmt: Long, icol: UShort, fdesctype: UShort, rgbdesc: Long, cbdescmax: Short, pcbdesc: Long, pfdesc: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLColAttributes(hstmt.toString(), icol.toInt(), fdesctype.toInt(), rgbdesc.toString(), cbdescmax.toInt(), pcbdesc.toString(), pfdesc.toString()) as Int).toShort() else 0

public actual fun SQLColAttributesA(hstmt: Long, icol: UShort, fdesctype: UShort, rgbdesc: Long, cbdescmax: Short, pcbdesc: Long, pfdesc: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLColAttributesA(hstmt.toString(), icol.toInt(), fdesctype.toInt(), rgbdesc.toString(), cbdescmax.toInt(), pcbdesc.toString(), pfdesc.toString()) as Int).toShort() else 0

public actual fun SQLColAttributesW(hstmt: Long, icol: UShort, fdesctype: UShort, rgbdesc: Long, cbdescmax: Short, pcbdesc: Long, pfdesc: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLColAttributesW(hstmt.toString(), icol.toInt(), fdesctype.toInt(), rgbdesc.toString(), cbdescmax.toInt(), pcbdesc.toString(), pfdesc.toString()) as Int).toShort() else 0

public actual fun SQLColumnPrivileges(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short, szcolumnname: Long, cchcolumnname: Short): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLColumnPrivileges(hstmt.toString(), szcatalogname.toString(), cchcatalogname.toInt(), szschemaname.toString(), cchschemaname.toInt(), sztablename.toString(), cchtablename.toInt(), szcolumnname.toString(), cchcolumnname.toInt()) as Int).toShort() else 0

public actual fun SQLColumnPrivilegesA(hstmt: Long, szcatalogname: Long, cbcatalogname: Short, szschemaname: Long, cbschemaname: Short, sztablename: Long, cbtablename: Short, szcolumnname: Long, cbcolumnname: Short): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLColumnPrivilegesA(hstmt.toString(), szcatalogname.toString(), cbcatalogname.toInt(), szschemaname.toString(), cbschemaname.toInt(), sztablename.toString(), cbtablename.toInt(), szcolumnname.toString(), cbcolumnname.toInt()) as Int).toShort() else 0

public actual fun SQLColumnPrivilegesW(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short, szcolumnname: Long, cchcolumnname: Short): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLColumnPrivilegesW(hstmt.toString(), szcatalogname.toString(), cchcatalogname.toInt(), szschemaname.toString(), cchschemaname.toInt(), sztablename.toString(), cchtablename.toInt(), szcolumnname.toString(), cchcolumnname.toInt()) as Int).toShort() else 0

public actual fun SQLColumns(statementhandle: Long, catalogname: Long, namelength1: Short, schemaname: Long, namelength2: Short, tablename: Long, namelength3: Short, columnname: Long, namelength4: Short): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLColumns(statementhandle.toString(), catalogname.toString(), namelength1.toInt(), schemaname.toString(), namelength2.toInt(), tablename.toString(), namelength3.toInt(), columnname.toString(), namelength4.toInt()) as Int).toShort() else 0

public actual fun SQLColumnsA(hstmt: Long, szcatalogname: Long, cbcatalogname: Short, szschemaname: Long, cbschemaname: Short, sztablename: Long, cbtablename: Short, szcolumnname: Long, cbcolumnname: Short): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLColumnsA(hstmt.toString(), szcatalogname.toString(), cbcatalogname.toInt(), szschemaname.toString(), cbschemaname.toInt(), sztablename.toString(), cbtablename.toInt(), szcolumnname.toString(), cbcolumnname.toInt()) as Int).toShort() else 0

public actual fun SQLColumnsW(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short, szcolumnname: Long, cchcolumnname: Short): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLColumnsW(hstmt.toString(), szcatalogname.toString(), cchcatalogname.toInt(), szschemaname.toString(), cchschemaname.toInt(), sztablename.toString(), cchtablename.toInt(), szcolumnname.toString(), cchcolumnname.toInt()) as Int).toShort() else 0

public actual fun SQLCompleteAsync(handletype: Short, handle: Long, asyncretcodeptr: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLCompleteAsync(handletype.toInt(), handle.toString(), asyncretcodeptr.toString()) as Int).toShort() else 0

public actual fun SQLConnect(connectionhandle: Long, servername: Long, namelength1: Short, username: Long, namelength2: Short, authentication: Long, namelength3: Short): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLConnect(connectionhandle.toString(), servername.toString(), namelength1.toInt(), username.toString(), namelength2.toInt(), authentication.toString(), namelength3.toInt()) as Int).toShort() else 0

public actual fun SQLConnectA(hdbc: Long, szdsn: Long, cbdsn: Short, szuid: Long, cbuid: Short, szauthstr: Long, cbauthstr: Short): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLConnectA(hdbc.toString(), szdsn.toString(), cbdsn.toInt(), szuid.toString(), cbuid.toInt(), szauthstr.toString(), cbauthstr.toInt()) as Int).toShort() else 0

public actual fun SQLConnectW(hdbc: Long, szdsn: Long, cchdsn: Short, szuid: Long, cchuid: Short, szauthstr: Long, cchauthstr: Short): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLConnectW(hdbc.toString(), szdsn.toString(), cchdsn.toInt(), szuid.toString(), cchuid.toInt(), szauthstr.toString(), cchauthstr.toInt()) as Int).toShort() else 0

public actual fun SQLCopyDesc(sourcedeschandle: Long, targetdeschandle: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLCopyDesc(sourcedeschandle.toString(), targetdeschandle.toString()) as Int).toShort() else 0

public actual fun SQLDataSources(environmenthandle: Long, direction: UShort, servername: Long, bufferlength1: Short, namelength1ptr: Long, description: Long, bufferlength2: Short, namelength2ptr: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLDataSources(environmenthandle.toString(), direction.toInt(), servername.toString(), bufferlength1.toInt(), namelength1ptr.toString(), description.toString(), bufferlength2.toInt(), namelength2ptr.toString()) as Int).toShort() else 0

public actual fun SQLDataSourcesA(henv: Long, fdirection: UShort, szdsn: Long, cbdsnmax: Short, pcbdsn: Long, szdescription: Long, cbdescriptionmax: Short, pcbdescription: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLDataSourcesA(henv.toString(), fdirection.toInt(), szdsn.toString(), cbdsnmax.toInt(), pcbdsn.toString(), szdescription.toString(), cbdescriptionmax.toInt(), pcbdescription.toString()) as Int).toShort() else 0

public actual fun SQLDataSourcesW(henv: Long, fdirection: UShort, szdsn: Long, cchdsnmax: Short, pcchdsn: Long, wszdescription: Long, cchdescriptionmax: Short, pcchdescription: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLDataSourcesW(henv.toString(), fdirection.toInt(), szdsn.toString(), cchdsnmax.toInt(), pcchdsn.toString(), wszdescription.toString(), cchdescriptionmax.toInt(), pcchdescription.toString()) as Int).toShort() else 0

public actual fun SQLDescribeCol(statementhandle: Long, columnnumber: UShort, columnname: Long, bufferlength: Short, namelength: Long, datatype: Long, columnsize: Long, decimaldigits: Long, nullable: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLDescribeCol(statementhandle.toString(), columnnumber.toInt(), columnname.toString(), bufferlength.toInt(), namelength.toString(), datatype.toString(), columnsize.toString(), decimaldigits.toString(), nullable.toString()) as Int).toShort() else 0

public actual fun SQLDescribeColA(hstmt: Long, icol: UShort, szcolname: Long, cbcolnamemax: Short, pcbcolname: Long, pfsqltype: Long, pcbcoldef: Long, pibscale: Long, pfnullable: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLDescribeColA(hstmt.toString(), icol.toInt(), szcolname.toString(), cbcolnamemax.toInt(), pcbcolname.toString(), pfsqltype.toString(), pcbcoldef.toString(), pibscale.toString(), pfnullable.toString()) as Int).toShort() else 0

public actual fun SQLDescribeColW(hstmt: Long, icol: UShort, szcolname: Long, cchcolnamemax: Short, pcchcolname: Long, pfsqltype: Long, pcbcoldef: Long, pibscale: Long, pfnullable: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLDescribeColW(hstmt.toString(), icol.toInt(), szcolname.toString(), cchcolnamemax.toInt(), pcchcolname.toString(), pfsqltype.toString(), pcbcoldef.toString(), pibscale.toString(), pfnullable.toString()) as Int).toShort() else 0

public actual fun SQLDescribeParam(hstmt: Long, ipar: UShort, pfsqltype: Long, pcbparamdef: Long, pibscale: Long, pfnullable: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLDescribeParam(hstmt.toString(), ipar.toInt(), pfsqltype.toString(), pcbparamdef.toString(), pibscale.toString(), pfnullable.toString()) as Int).toShort() else 0

public actual fun SQLDisconnect(connectionhandle: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLDisconnect(connectionhandle.toString()) as Int).toShort() else 0

public actual fun SQLDriverConnect(hdbc: Long, hwnd: Long, szconnstrin: Long, cchconnstrin: Short, szconnstrout: Long, cchconnstroutmax: Short, pcchconnstrout: Long, fdrivercompletion: UShort): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLDriverConnect(hdbc.toString(), hwnd.toString(), szconnstrin.toString(), cchconnstrin.toInt(), szconnstrout.toString(), cchconnstroutmax.toInt(), pcchconnstrout.toString(), fdrivercompletion.toInt()) as Int).toShort() else 0

public actual fun SQLDriverConnectA(hdbc: Long, hwnd: Long, szconnstrin: Long, cbconnstrin: Short, szconnstrout: Long, cbconnstroutmax: Short, pcbconnstrout: Long, fdrivercompletion: UShort): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLDriverConnectA(hdbc.toString(), hwnd.toString(), szconnstrin.toString(), cbconnstrin.toInt(), szconnstrout.toString(), cbconnstroutmax.toInt(), pcbconnstrout.toString(), fdrivercompletion.toInt()) as Int).toShort() else 0

public actual fun SQLDriverConnectW(hdbc: Long, hwnd: Long, szconnstrin: Long, cchconnstrin: Short, szconnstrout: Long, cchconnstroutmax: Short, pcchconnstrout: Long, fdrivercompletion: UShort): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLDriverConnectW(hdbc.toString(), hwnd.toString(), szconnstrin.toString(), cchconnstrin.toInt(), szconnstrout.toString(), cchconnstroutmax.toInt(), pcchconnstrout.toString(), fdrivercompletion.toInt()) as Int).toShort() else 0

public actual fun SQLDrivers(henv: Long, fdirection: UShort, szdriverdesc: Long, cchdriverdescmax: Short, pcchdriverdesc: Long, szdriverattributes: Long, cchdrvrattrmax: Short, pcchdrvrattr: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLDrivers(henv.toString(), fdirection.toInt(), szdriverdesc.toString(), cchdriverdescmax.toInt(), pcchdriverdesc.toString(), szdriverattributes.toString(), cchdrvrattrmax.toInt(), pcchdrvrattr.toString()) as Int).toShort() else 0

public actual fun SQLDriversA(henv: Long, fdirection: UShort, szdriverdesc: Long, cbdriverdescmax: Short, pcbdriverdesc: Long, szdriverattributes: Long, cbdrvrattrmax: Short, pcbdrvrattr: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLDriversA(henv.toString(), fdirection.toInt(), szdriverdesc.toString(), cbdriverdescmax.toInt(), pcbdriverdesc.toString(), szdriverattributes.toString(), cbdrvrattrmax.toInt(), pcbdrvrattr.toString()) as Int).toShort() else 0

public actual fun SQLDriversW(henv: Long, fdirection: UShort, szdriverdesc: Long, cchdriverdescmax: Short, pcchdriverdesc: Long, szdriverattributes: Long, cchdrvrattrmax: Short, pcchdrvrattr: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLDriversW(henv.toString(), fdirection.toInt(), szdriverdesc.toString(), cchdriverdescmax.toInt(), pcchdriverdesc.toString(), szdriverattributes.toString(), cchdrvrattrmax.toInt(), pcchdrvrattr.toString()) as Int).toShort() else 0

public actual fun SQLEndTran(handletype: Short, handle: Long, completiontype: Short): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLEndTran(handletype.toInt(), handle.toString(), completiontype.toInt()) as Int).toShort() else 0

public actual fun SQLError(environmenthandle: Long, connectionhandle: Long, statementhandle: Long, sqlstate: Long, nativeerror: Long, messagetext: Long, bufferlength: Short, textlength: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLError(environmenthandle.toString(), connectionhandle.toString(), statementhandle.toString(), sqlstate.toString(), nativeerror.toString(), messagetext.toString(), bufferlength.toInt(), textlength.toString()) as Int).toShort() else 0

public actual fun SQLErrorA(henv: Long, hdbc: Long, hstmt: Long, szsqlstate: Long, pfnativeerror: Long, szerrormsg: Long, cberrormsgmax: Short, pcberrormsg: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLErrorA(henv.toString(), hdbc.toString(), hstmt.toString(), szsqlstate.toString(), pfnativeerror.toString(), szerrormsg.toString(), cberrormsgmax.toInt(), pcberrormsg.toString()) as Int).toShort() else 0

public actual fun SQLErrorW(henv: Long, hdbc: Long, hstmt: Long, wszsqlstate: Long, pfnativeerror: Long, wszerrormsg: Long, ccherrormsgmax: Short, pccherrormsg: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLErrorW(henv.toString(), hdbc.toString(), hstmt.toString(), wszsqlstate.toString(), pfnativeerror.toString(), wszerrormsg.toString(), ccherrormsgmax.toInt(), pccherrormsg.toString()) as Int).toShort() else 0

public actual fun SQLExecDirect(statementhandle: Long, statementtext: Long, textlength: Int): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLExecDirect(statementhandle.toString(), statementtext.toString(), textlength) as Int).toShort() else 0

public actual fun SQLExecDirectA(hstmt: Long, szsqlstr: Long, cbsqlstr: Int): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLExecDirectA(hstmt.toString(), szsqlstr.toString(), cbsqlstr) as Int).toShort() else 0

public actual fun SQLExecDirectW(hstmt: Long, szsqlstr: Long, textlength: Int): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLExecDirectW(hstmt.toString(), szsqlstr.toString(), textlength) as Int).toShort() else 0

public actual fun SQLExecute(statementhandle: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLExecute(statementhandle.toString()) as Int).toShort() else 0

public actual fun SQLExtendedFetch(hstmt: Long, ffetchtype: UShort, irow: Long, pcrow: Long, rgfrowstatus: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLExtendedFetch(hstmt.toString(), ffetchtype.toInt(), irow.toString(), pcrow.toString(), rgfrowstatus.toString()) as Int).toShort() else 0

public actual fun SQLFetch(statementhandle: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLFetch(statementhandle.toString()) as Int).toShort() else 0

public actual fun SQLFetchScroll(statementhandle: Long, fetchorientation: Short, fetchoffset: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLFetchScroll(statementhandle.toString(), fetchorientation.toInt(), fetchoffset.toString()) as Int).toShort() else 0

public actual fun SQLForeignKeys(hstmt: Long, szpkcatalogname: Long, cchpkcatalogname: Short, szpkschemaname: Long, cchpkschemaname: Short, szpktablename: Long, cchpktablename: Short, szfkcatalogname: Long, cchfkcatalogname: Short, szfkschemaname: Long, cchfkschemaname: Short, szfktablename: Long, cchfktablename: Short): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLForeignKeys(hstmt.toString(), szpkcatalogname.toString(), cchpkcatalogname.toInt(), szpkschemaname.toString(), cchpkschemaname.toInt(), szpktablename.toString(), cchpktablename.toInt(), szfkcatalogname.toString(), cchfkcatalogname.toInt(), szfkschemaname.toString(), cchfkschemaname.toInt(), szfktablename.toString(), cchfktablename.toInt()) as Int).toShort() else 0

public actual fun SQLForeignKeysA(hstmt: Long, szpkcatalogname: Long, cbpkcatalogname: Short, szpkschemaname: Long, cbpkschemaname: Short, szpktablename: Long, cbpktablename: Short, szfkcatalogname: Long, cbfkcatalogname: Short, szfkschemaname: Long, cbfkschemaname: Short, szfktablename: Long, cbfktablename: Short): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLForeignKeysA(hstmt.toString(), szpkcatalogname.toString(), cbpkcatalogname.toInt(), szpkschemaname.toString(), cbpkschemaname.toInt(), szpktablename.toString(), cbpktablename.toInt(), szfkcatalogname.toString(), cbfkcatalogname.toInt(), szfkschemaname.toString(), cbfkschemaname.toInt(), szfktablename.toString(), cbfktablename.toInt()) as Int).toShort() else 0

public actual fun SQLForeignKeysW(hstmt: Long, szpkcatalogname: Long, cchpkcatalogname: Short, szpkschemaname: Long, cchpkschemaname: Short, szpktablename: Long, cchpktablename: Short, szfkcatalogname: Long, cchfkcatalogname: Short, szfkschemaname: Long, cchfkschemaname: Short, szfktablename: Long, cchfktablename: Short): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLForeignKeysW(hstmt.toString(), szpkcatalogname.toString(), cchpkcatalogname.toInt(), szpkschemaname.toString(), cchpkschemaname.toInt(), szpktablename.toString(), cchpktablename.toInt(), szfkcatalogname.toString(), cchfkcatalogname.toInt(), szfkschemaname.toString(), cchfkschemaname.toInt(), szfktablename.toString(), cchfktablename.toInt()) as Int).toShort() else 0

public actual fun SQLFreeConnect(connectionhandle: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLFreeConnect(connectionhandle.toString()) as Int).toShort() else 0

public actual fun SQLFreeEnv(environmenthandle: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLFreeEnv(environmenthandle.toString()) as Int).toShort() else 0

public actual fun SQLFreeHandle(handletype: Short, handle: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLFreeHandle(handletype.toInt(), handle.toString()) as Int).toShort() else 0

public actual fun SQLFreeStmt(statementhandle: Long, option: UShort): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLFreeStmt(statementhandle.toString(), option.toInt()) as Int).toShort() else 0

public actual fun SQLGetConnectAttr(connectionhandle: Long, attribute: Int, value: Long, bufferlength: Int, stringlengthptr: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLGetConnectAttr(connectionhandle.toString(), attribute, value.toString(), bufferlength, stringlengthptr.toString()) as Int).toShort() else 0

public actual fun SQLGetConnectAttrA(hdbc: Long, fattribute: Int, rgbvalue: Long, cbvaluemax: Int, pcbvalue: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLGetConnectAttrA(hdbc.toString(), fattribute, rgbvalue.toString(), cbvaluemax, pcbvalue.toString()) as Int).toShort() else 0

public actual fun SQLGetConnectAttrW(hdbc: Long, fattribute: Int, rgbvalue: Long, cbvaluemax: Int, pcbvalue: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLGetConnectAttrW(hdbc.toString(), fattribute, rgbvalue.toString(), cbvaluemax, pcbvalue.toString()) as Int).toShort() else 0

public actual fun SQLGetConnectOption(connectionhandle: Long, option: UShort, value: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLGetConnectOption(connectionhandle.toString(), option.toInt(), value.toString()) as Int).toShort() else 0

public actual fun SQLGetConnectOptionA(hdbc: Long, foption: UShort, pvparam: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLGetConnectOptionA(hdbc.toString(), foption.toInt(), pvparam.toString()) as Int).toShort() else 0

public actual fun SQLGetConnectOptionW(hdbc: Long, foption: UShort, pvparam: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLGetConnectOptionW(hdbc.toString(), foption.toInt(), pvparam.toString()) as Int).toShort() else 0

public actual fun SQLGetCursorName(statementhandle: Long, cursorname: Long, bufferlength: Short, namelengthptr: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLGetCursorName(statementhandle.toString(), cursorname.toString(), bufferlength.toInt(), namelengthptr.toString()) as Int).toShort() else 0

public actual fun SQLGetCursorNameA(hstmt: Long, szcursor: Long, cbcursormax: Short, pcbcursor: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLGetCursorNameA(hstmt.toString(), szcursor.toString(), cbcursormax.toInt(), pcbcursor.toString()) as Int).toShort() else 0

public actual fun SQLGetCursorNameW(hstmt: Long, szcursor: Long, cchcursormax: Short, pcchcursor: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLGetCursorNameW(hstmt.toString(), szcursor.toString(), cchcursormax.toInt(), pcchcursor.toString()) as Int).toShort() else 0

public actual fun SQLGetData(statementhandle: Long, columnnumber: UShort, targettype: Short, targetvalue: Long, bufferlength: Long, strlen_or_indptr: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLGetData(statementhandle.toString(), columnnumber.toInt(), targettype.toInt(), targetvalue.toString(), bufferlength.toString(), strlen_or_indptr.toString()) as Int).toShort() else 0

public actual fun SQLGetDescField(descriptorhandle: Long, recnumber: Short, fieldidentifier: Short, value: Long, bufferlength: Int, stringlength: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLGetDescField(descriptorhandle.toString(), recnumber.toInt(), fieldidentifier.toInt(), value.toString(), bufferlength, stringlength.toString()) as Int).toShort() else 0

public actual fun SQLGetDescFieldA(hdesc: Long, irecord: Short, ifield: Short, rgbvalue: Long, cbbufferlength: Int, stringlength: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLGetDescFieldA(hdesc.toString(), irecord.toInt(), ifield.toInt(), rgbvalue.toString(), cbbufferlength, stringlength.toString()) as Int).toShort() else 0

public actual fun SQLGetDescFieldW(hdesc: Long, irecord: Short, ifield: Short, rgbvalue: Long, cbbufferlength: Int, stringlength: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLGetDescFieldW(hdesc.toString(), irecord.toInt(), ifield.toInt(), rgbvalue.toString(), cbbufferlength, stringlength.toString()) as Int).toShort() else 0

public actual fun SQLGetDescRec(descriptorhandle: Long, recnumber: Short, name: Long, bufferlength: Short, stringlengthptr: Long, typeptr: Long, subtypeptr: Long, lengthptr: Long, precisionptr: Long, scaleptr: Long, nullableptr: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLGetDescRec(descriptorhandle.toString(), recnumber.toInt(), name.toString(), bufferlength.toInt(), stringlengthptr.toString(), typeptr.toString(), subtypeptr.toString(), lengthptr.toString(), precisionptr.toString(), scaleptr.toString(), nullableptr.toString()) as Int).toShort() else 0

public actual fun SQLGetDescRecA(hdesc: Long, irecord: Short, szname: Long, cbnamemax: Short, pcbname: Long, pftype: Long, pfsubtype: Long, plength: Long, pprecision: Long, pscale: Long, pnullable: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLGetDescRecA(hdesc.toString(), irecord.toInt(), szname.toString(), cbnamemax.toInt(), pcbname.toString(), pftype.toString(), pfsubtype.toString(), plength.toString(), pprecision.toString(), pscale.toString(), pnullable.toString()) as Int).toShort() else 0

public actual fun SQLGetDescRecW(hdesc: Long, irecord: Short, szname: Long, cchnamemax: Short, pcchname: Long, pftype: Long, pfsubtype: Long, plength: Long, pprecision: Long, pscale: Long, pnullable: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLGetDescRecW(hdesc.toString(), irecord.toInt(), szname.toString(), cchnamemax.toInt(), pcchname.toString(), pftype.toString(), pfsubtype.toString(), plength.toString(), pprecision.toString(), pscale.toString(), pnullable.toString()) as Int).toShort() else 0

public actual fun SQLGetDiagField(handletype: Short, handle: Long, recnumber: Short, diagidentifier: Short, diaginfo: Long, bufferlength: Short, stringlength: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLGetDiagField(handletype.toInt(), handle.toString(), recnumber.toInt(), diagidentifier.toInt(), diaginfo.toString(), bufferlength.toInt(), stringlength.toString()) as Int).toShort() else 0

public actual fun SQLGetDiagFieldA(fhandletype: Short, handle: Long, irecord: Short, fdiagfield: Short, rgbdiaginfo: Long, cbdiaginfomax: Short, pcbdiaginfo: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLGetDiagFieldA(fhandletype.toInt(), handle.toString(), irecord.toInt(), fdiagfield.toInt(), rgbdiaginfo.toString(), cbdiaginfomax.toInt(), pcbdiaginfo.toString()) as Int).toShort() else 0

public actual fun SQLGetDiagFieldW(fhandletype: Short, handle: Long, irecord: Short, fdiagfield: Short, rgbdiaginfo: Long, cbbufferlength: Short, pcbstringlength: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLGetDiagFieldW(fhandletype.toInt(), handle.toString(), irecord.toInt(), fdiagfield.toInt(), rgbdiaginfo.toString(), cbbufferlength.toInt(), pcbstringlength.toString()) as Int).toShort() else 0

public actual fun SQLGetDiagRec(handletype: Short, handle: Long, recnumber: Short, sqlstate: Long, nativeerror: Long, messagetext: Long, bufferlength: Short, textlength: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLGetDiagRec(handletype.toInt(), handle.toString(), recnumber.toInt(), sqlstate.toString(), nativeerror.toString(), messagetext.toString(), bufferlength.toInt(), textlength.toString()) as Int).toShort() else 0

public actual fun SQLGetDiagRecA(fhandletype: Short, handle: Long, irecord: Short, szsqlstate: Long, pfnativeerror: Long, szerrormsg: Long, cberrormsgmax: Short, pcberrormsg: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLGetDiagRecA(fhandletype.toInt(), handle.toString(), irecord.toInt(), szsqlstate.toString(), pfnativeerror.toString(), szerrormsg.toString(), cberrormsgmax.toInt(), pcberrormsg.toString()) as Int).toShort() else 0

public actual fun SQLGetDiagRecW(fhandletype: Short, handle: Long, irecord: Short, szsqlstate: Long, pfnativeerror: Long, szerrormsg: Long, ccherrormsgmax: Short, pccherrormsg: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLGetDiagRecW(fhandletype.toInt(), handle.toString(), irecord.toInt(), szsqlstate.toString(), pfnativeerror.toString(), szerrormsg.toString(), ccherrormsgmax.toInt(), pccherrormsg.toString()) as Int).toShort() else 0

public actual fun SQLGetEnvAttr(environmenthandle: Long, attribute: Int, value: Long, bufferlength: Int, stringlength: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLGetEnvAttr(environmenthandle.toString(), attribute, value.toString(), bufferlength, stringlength.toString()) as Int).toShort() else 0

public actual fun SQLGetFunctions(connectionhandle: Long, functionid: UShort, supported: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLGetFunctions(connectionhandle.toString(), functionid.toInt(), supported.toString()) as Int).toShort() else 0

public actual fun SQLGetInfo(connectionhandle: Long, infotype: UShort, infovalue: Long, bufferlength: Short, stringlengthptr: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLGetInfo(connectionhandle.toString(), infotype.toInt(), infovalue.toString(), bufferlength.toInt(), stringlengthptr.toString()) as Int).toShort() else 0

public actual fun SQLGetInfoA(hdbc: Long, finfotype: UShort, rgbinfovalue: Long, cbinfovaluemax: Short, pcbinfovalue: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLGetInfoA(hdbc.toString(), finfotype.toInt(), rgbinfovalue.toString(), cbinfovaluemax.toInt(), pcbinfovalue.toString()) as Int).toShort() else 0

public actual fun SQLGetInfoW(hdbc: Long, finfotype: UShort, rgbinfovalue: Long, cbinfovaluemax: Short, pcbinfovalue: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLGetInfoW(hdbc.toString(), finfotype.toInt(), rgbinfovalue.toString(), cbinfovaluemax.toInt(), pcbinfovalue.toString()) as Int).toShort() else 0

public actual fun SQLGetNextEnumeration(henumhandle: HANDLE, prgenumdata: Long, pienumlength: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLGetNextEnumeration(henumhandle.toString(), prgenumdata.toString(), pienumlength.toString()) as Int).toShort() else 0

public actual fun SQLGetStmtAttr(statementhandle: Long, attribute: Int, value: Long, bufferlength: Int, stringlength: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLGetStmtAttr(statementhandle.toString(), attribute, value.toString(), bufferlength, stringlength.toString()) as Int).toShort() else 0

public actual fun SQLGetStmtAttrA(hstmt: Long, fattribute: Int, rgbvalue: Long, cbvaluemax: Int, pcbvalue: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLGetStmtAttrA(hstmt.toString(), fattribute, rgbvalue.toString(), cbvaluemax, pcbvalue.toString()) as Int).toShort() else 0

public actual fun SQLGetStmtAttrW(hstmt: Long, fattribute: Int, rgbvalue: Long, cbvaluemax: Int, pcbvalue: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLGetStmtAttrW(hstmt.toString(), fattribute, rgbvalue.toString(), cbvaluemax, pcbvalue.toString()) as Int).toShort() else 0

public actual fun SQLGetStmtOption(statementhandle: Long, option: UShort, value: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLGetStmtOption(statementhandle.toString(), option.toInt(), value.toString()) as Int).toShort() else 0

public actual fun SQLGetTypeInfo(statementhandle: Long, datatype: Short): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLGetTypeInfo(statementhandle.toString(), datatype.toInt()) as Int).toShort() else 0

public actual fun SQLGetTypeInfoA(statementhandle: Long, datatype: Short): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLGetTypeInfoA(statementhandle.toString(), datatype.toInt()) as Int).toShort() else 0

public actual fun SQLGetTypeInfoW(statementhandle: Long, datatype: Short): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLGetTypeInfoW(statementhandle.toString(), datatype.toInt()) as Int).toShort() else 0

public actual fun SQLInitEnumServers(pwchservername: PCWSTR, pwchinstancename: PCWSTR): HANDLE =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLInitEnumServers(pwchservername.toString(), pwchinstancename.toString()) as String).toLong() else 0L

public actual fun SQLLinkedCatalogsA(param0: Long, param1: PCSTR, param2: Short): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLLinkedCatalogsA(param0.toString(), param1.toString(), param2.toInt()) as Int).toShort() else 0

public actual fun SQLLinkedCatalogsW(param0: Long, param1: PCWSTR, param2: Short): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLLinkedCatalogsW(param0.toString(), param1.toString(), param2.toInt()) as Int).toShort() else 0

public actual fun SQLLinkedServers(param0: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLLinkedServers(param0.toString()) as Int).toShort() else 0

public actual fun SQLMoreResults(hstmt: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLMoreResults(hstmt.toString()) as Int).toShort() else 0

public actual fun SQLNativeSql(hdbc: Long, szsqlstrin: Long, cchsqlstrin: Int, szsqlstr: Long, cchsqlstrmax: Int, pcbsqlstr: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLNativeSql(hdbc.toString(), szsqlstrin.toString(), cchsqlstrin, szsqlstr.toString(), cchsqlstrmax, pcbsqlstr.toString()) as Int).toShort() else 0

public actual fun SQLNativeSqlA(hdbc: Long, szsqlstrin: Long, cbsqlstrin: Int, szsqlstr: Long, cbsqlstrmax: Int, pcbsqlstr: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLNativeSqlA(hdbc.toString(), szsqlstrin.toString(), cbsqlstrin, szsqlstr.toString(), cbsqlstrmax, pcbsqlstr.toString()) as Int).toShort() else 0

public actual fun SQLNativeSqlW(hdbc: Long, szsqlstrin: Long, cchsqlstrin: Int, szsqlstr: Long, cchsqlstrmax: Int, pcchsqlstr: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLNativeSqlW(hdbc.toString(), szsqlstrin.toString(), cchsqlstrin, szsqlstr.toString(), cchsqlstrmax, pcchsqlstr.toString()) as Int).toShort() else 0

public actual fun SQLNumParams(hstmt: Long, pcpar: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLNumParams(hstmt.toString(), pcpar.toString()) as Int).toShort() else 0

public actual fun SQLNumResultCols(statementhandle: Long, columncount: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLNumResultCols(statementhandle.toString(), columncount.toString()) as Int).toShort() else 0

public actual fun SQLParamData(statementhandle: Long, value: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLParamData(statementhandle.toString(), value.toString()) as Int).toShort() else 0

public actual fun SQLParamOptions(hstmt: Long, crow: ULong, pirow: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLParamOptions(hstmt.toString(), crow.toString(), pirow.toString()) as Int).toShort() else 0

public actual fun SQLPrepare(statementhandle: Long, statementtext: Long, textlength: Int): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLPrepare(statementhandle.toString(), statementtext.toString(), textlength) as Int).toShort() else 0

public actual fun SQLPrepareA(hstmt: Long, szsqlstr: Long, cbsqlstr: Int): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLPrepareA(hstmt.toString(), szsqlstr.toString(), cbsqlstr) as Int).toShort() else 0

public actual fun SQLPrepareW(hstmt: Long, szsqlstr: Long, cchsqlstr: Int): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLPrepareW(hstmt.toString(), szsqlstr.toString(), cchsqlstr) as Int).toShort() else 0

public actual fun SQLPrimaryKeys(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLPrimaryKeys(hstmt.toString(), szcatalogname.toString(), cchcatalogname.toInt(), szschemaname.toString(), cchschemaname.toInt(), sztablename.toString(), cchtablename.toInt()) as Int).toShort() else 0

public actual fun SQLPrimaryKeysA(hstmt: Long, szcatalogname: Long, cbcatalogname: Short, szschemaname: Long, cbschemaname: Short, sztablename: Long, cbtablename: Short): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLPrimaryKeysA(hstmt.toString(), szcatalogname.toString(), cbcatalogname.toInt(), szschemaname.toString(), cbschemaname.toInt(), sztablename.toString(), cbtablename.toInt()) as Int).toShort() else 0

public actual fun SQLPrimaryKeysW(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLPrimaryKeysW(hstmt.toString(), szcatalogname.toString(), cchcatalogname.toInt(), szschemaname.toString(), cchschemaname.toInt(), sztablename.toString(), cchtablename.toInt()) as Int).toShort() else 0

public actual fun SQLProcedureColumns(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, szprocname: Long, cchprocname: Short, szcolumnname: Long, cchcolumnname: Short): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLProcedureColumns(hstmt.toString(), szcatalogname.toString(), cchcatalogname.toInt(), szschemaname.toString(), cchschemaname.toInt(), szprocname.toString(), cchprocname.toInt(), szcolumnname.toString(), cchcolumnname.toInt()) as Int).toShort() else 0

public actual fun SQLProcedureColumnsA(hstmt: Long, szcatalogname: Long, cbcatalogname: Short, szschemaname: Long, cbschemaname: Short, szprocname: Long, cbprocname: Short, szcolumnname: Long, cbcolumnname: Short): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLProcedureColumnsA(hstmt.toString(), szcatalogname.toString(), cbcatalogname.toInt(), szschemaname.toString(), cbschemaname.toInt(), szprocname.toString(), cbprocname.toInt(), szcolumnname.toString(), cbcolumnname.toInt()) as Int).toShort() else 0

public actual fun SQLProcedureColumnsW(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, szprocname: Long, cchprocname: Short, szcolumnname: Long, cchcolumnname: Short): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLProcedureColumnsW(hstmt.toString(), szcatalogname.toString(), cchcatalogname.toInt(), szschemaname.toString(), cchschemaname.toInt(), szprocname.toString(), cchprocname.toInt(), szcolumnname.toString(), cchcolumnname.toInt()) as Int).toShort() else 0

public actual fun SQLProcedures(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, szprocname: Long, cchprocname: Short): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLProcedures(hstmt.toString(), szcatalogname.toString(), cchcatalogname.toInt(), szschemaname.toString(), cchschemaname.toInt(), szprocname.toString(), cchprocname.toInt()) as Int).toShort() else 0

public actual fun SQLProceduresA(hstmt: Long, szcatalogname: Long, cbcatalogname: Short, szschemaname: Long, cbschemaname: Short, szprocname: Long, cbprocname: Short): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLProceduresA(hstmt.toString(), szcatalogname.toString(), cbcatalogname.toInt(), szschemaname.toString(), cbschemaname.toInt(), szprocname.toString(), cbprocname.toInt()) as Int).toShort() else 0

public actual fun SQLProceduresW(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, szprocname: Long, cchprocname: Short): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLProceduresW(hstmt.toString(), szcatalogname.toString(), cchcatalogname.toInt(), szschemaname.toString(), cchschemaname.toInt(), szprocname.toString(), cchprocname.toInt()) as Int).toShort() else 0

public actual fun SQLPutData(statementhandle: Long, data: Long, strlen_or_ind: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLPutData(statementhandle.toString(), data.toString(), strlen_or_ind.toString()) as Int).toShort() else 0

public actual fun SQLRowCount(statementhandle: Long, rowcount: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLRowCount(statementhandle.toString(), rowcount.toString()) as Int).toShort() else 0

public actual fun SQLSetConnectAttr(connectionhandle: Long, attribute: Int, value: Long, stringlength: Int): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLSetConnectAttr(connectionhandle.toString(), attribute, value.toString(), stringlength) as Int).toShort() else 0

public actual fun SQLSetConnectAttrA(hdbc: Long, fattribute: Int, rgbvalue: Long, cbvalue: Int): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLSetConnectAttrA(hdbc.toString(), fattribute, rgbvalue.toString(), cbvalue) as Int).toShort() else 0

public actual fun SQLSetConnectAttrW(hdbc: Long, fattribute: Int, rgbvalue: Long, cbvalue: Int): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLSetConnectAttrW(hdbc.toString(), fattribute, rgbvalue.toString(), cbvalue) as Int).toShort() else 0

public actual fun SQLSetConnectOption(connectionhandle: Long, option: UShort, value: ULong): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLSetConnectOption(connectionhandle.toString(), option.toInt(), value.toString()) as Int).toShort() else 0

public actual fun SQLSetConnectOptionA(hdbc: Long, foption: UShort, vparam: ULong): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLSetConnectOptionA(hdbc.toString(), foption.toInt(), vparam.toString()) as Int).toShort() else 0

public actual fun SQLSetConnectOptionW(hdbc: Long, foption: UShort, vparam: ULong): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLSetConnectOptionW(hdbc.toString(), foption.toInt(), vparam.toString()) as Int).toShort() else 0

public actual fun SQLSetCursorName(statementhandle: Long, cursorname: Long, namelength: Short): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLSetCursorName(statementhandle.toString(), cursorname.toString(), namelength.toInt()) as Int).toShort() else 0

public actual fun SQLSetCursorNameA(hstmt: Long, szcursor: Long, cbcursor: Short): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLSetCursorNameA(hstmt.toString(), szcursor.toString(), cbcursor.toInt()) as Int).toShort() else 0

public actual fun SQLSetCursorNameW(hstmt: Long, szcursor: Long, cchcursor: Short): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLSetCursorNameW(hstmt.toString(), szcursor.toString(), cchcursor.toInt()) as Int).toShort() else 0

public actual fun SQLSetDescField(descriptorhandle: Long, recnumber: Short, fieldidentifier: Short, value: Long, bufferlength: Int): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLSetDescField(descriptorhandle.toString(), recnumber.toInt(), fieldidentifier.toInt(), value.toString(), bufferlength) as Int).toShort() else 0

public actual fun SQLSetDescFieldW(descriptorhandle: Long, recnumber: Short, fieldidentifier: Short, value: Long, bufferlength: Int): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLSetDescFieldW(descriptorhandle.toString(), recnumber.toInt(), fieldidentifier.toInt(), value.toString(), bufferlength) as Int).toShort() else 0

public actual fun SQLSetDescRec(descriptorhandle: Long, recnumber: Short, type: Short, subtype: Short, length: Long, precision: Short, scale: Short, data: Long, stringlength: Long, indicator: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLSetDescRec(descriptorhandle.toString(), recnumber.toInt(), type.toInt(), subtype.toInt(), length.toString(), precision.toInt(), scale.toInt(), data.toString(), stringlength.toString(), indicator.toString()) as Int).toShort() else 0

public actual fun SQLSetEnvAttr(environmenthandle: Long, attribute: Int, value: Long, stringlength: Int): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLSetEnvAttr(environmenthandle.toString(), attribute, value.toString(), stringlength) as Int).toShort() else 0

public actual fun SQLSetParam(statementhandle: Long, parameternumber: UShort, valuetype: Short, parametertype: Short, lengthprecision: ULong, parameterscale: Short, parametervalue: Long, strlen_or_ind: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLSetParam(statementhandle.toString(), parameternumber.toInt(), valuetype.toInt(), parametertype.toInt(), lengthprecision.toString(), parameterscale.toInt(), parametervalue.toString(), strlen_or_ind.toString()) as Int).toShort() else 0

public actual fun SQLSetPos(hstmt: Long, irow: ULong, foption: UShort, flock: UShort): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLSetPos(hstmt.toString(), irow.toString(), foption.toInt(), flock.toInt()) as Int).toShort() else 0

public actual fun SQLSetScrollOptions(hstmt: Long, fconcurrency: UShort, crowkeyset: Long, crowrowset: UShort): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLSetScrollOptions(hstmt.toString(), fconcurrency.toInt(), crowkeyset.toString(), crowrowset.toInt()) as Int).toShort() else 0

public actual fun SQLSetStmtAttr(statementhandle: Long, attribute: Int, value: Long, stringlength: Int): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLSetStmtAttr(statementhandle.toString(), attribute, value.toString(), stringlength) as Int).toShort() else 0

public actual fun SQLSetStmtAttrW(hstmt: Long, fattribute: Int, rgbvalue: Long, cbvaluemax: Int): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLSetStmtAttrW(hstmt.toString(), fattribute, rgbvalue.toString(), cbvaluemax) as Int).toShort() else 0

public actual fun SQLSetStmtOption(statementhandle: Long, option: UShort, value: ULong): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLSetStmtOption(statementhandle.toString(), option.toInt(), value.toString()) as Int).toShort() else 0

public actual fun SQLSpecialColumns(statementhandle: Long, identifiertype: UShort, catalogname: Long, namelength1: Short, schemaname: Long, namelength2: Short, tablename: Long, namelength3: Short, scope: UShort, nullable: UShort): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLSpecialColumns(statementhandle.toString(), identifiertype.toInt(), catalogname.toString(), namelength1.toInt(), schemaname.toString(), namelength2.toInt(), tablename.toString(), namelength3.toInt(), scope.toInt(), nullable.toInt()) as Int).toShort() else 0

public actual fun SQLSpecialColumnsA(hstmt: Long, fcoltype: UShort, szcatalogname: Long, cbcatalogname: Short, szschemaname: Long, cbschemaname: Short, sztablename: Long, cbtablename: Short, fscope: UShort, fnullable: UShort): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLSpecialColumnsA(hstmt.toString(), fcoltype.toInt(), szcatalogname.toString(), cbcatalogname.toInt(), szschemaname.toString(), cbschemaname.toInt(), sztablename.toString(), cbtablename.toInt(), fscope.toInt(), fnullable.toInt()) as Int).toShort() else 0

public actual fun SQLSpecialColumnsW(hstmt: Long, fcoltype: UShort, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short, fscope: UShort, fnullable: UShort): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLSpecialColumnsW(hstmt.toString(), fcoltype.toInt(), szcatalogname.toString(), cchcatalogname.toInt(), szschemaname.toString(), cchschemaname.toInt(), sztablename.toString(), cchtablename.toInt(), fscope.toInt(), fnullable.toInt()) as Int).toShort() else 0

public actual fun SQLStatistics(statementhandle: Long, catalogname: Long, namelength1: Short, schemaname: Long, namelength2: Short, tablename: Long, namelength3: Short, unique: UShort, reserved: UShort): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLStatistics(statementhandle.toString(), catalogname.toString(), namelength1.toInt(), schemaname.toString(), namelength2.toInt(), tablename.toString(), namelength3.toInt(), unique.toInt(), reserved.toInt()) as Int).toShort() else 0

public actual fun SQLStatisticsA(hstmt: Long, szcatalogname: Long, cbcatalogname: Short, szschemaname: Long, cbschemaname: Short, sztablename: Long, cbtablename: Short, funique: UShort, faccuracy: UShort): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLStatisticsA(hstmt.toString(), szcatalogname.toString(), cbcatalogname.toInt(), szschemaname.toString(), cbschemaname.toInt(), sztablename.toString(), cbtablename.toInt(), funique.toInt(), faccuracy.toInt()) as Int).toShort() else 0

public actual fun SQLStatisticsW(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short, funique: UShort, faccuracy: UShort): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLStatisticsW(hstmt.toString(), szcatalogname.toString(), cchcatalogname.toInt(), szschemaname.toString(), cchschemaname.toInt(), sztablename.toString(), cchtablename.toInt(), funique.toInt(), faccuracy.toInt()) as Int).toShort() else 0

public actual fun SQLTablePrivileges(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLTablePrivileges(hstmt.toString(), szcatalogname.toString(), cchcatalogname.toInt(), szschemaname.toString(), cchschemaname.toInt(), sztablename.toString(), cchtablename.toInt()) as Int).toShort() else 0

public actual fun SQLTablePrivilegesA(hstmt: Long, szcatalogname: Long, cbcatalogname: Short, szschemaname: Long, cbschemaname: Short, sztablename: Long, cbtablename: Short): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLTablePrivilegesA(hstmt.toString(), szcatalogname.toString(), cbcatalogname.toInt(), szschemaname.toString(), cbschemaname.toInt(), sztablename.toString(), cbtablename.toInt()) as Int).toShort() else 0

public actual fun SQLTablePrivilegesW(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLTablePrivilegesW(hstmt.toString(), szcatalogname.toString(), cchcatalogname.toInt(), szschemaname.toString(), cchschemaname.toInt(), sztablename.toString(), cchtablename.toInt()) as Int).toShort() else 0

public actual fun SQLTables(statementhandle: Long, catalogname: Long, namelength1: Short, schemaname: Long, namelength2: Short, tablename: Long, namelength3: Short, tabletype: Long, namelength4: Short): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLTables(statementhandle.toString(), catalogname.toString(), namelength1.toInt(), schemaname.toString(), namelength2.toInt(), tablename.toString(), namelength3.toInt(), tabletype.toString(), namelength4.toInt()) as Int).toShort() else 0

public actual fun SQLTablesA(hstmt: Long, szcatalogname: Long, cbcatalogname: Short, szschemaname: Long, cbschemaname: Short, sztablename: Long, cbtablename: Short, sztabletype: Long, cbtabletype: Short): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLTablesA(hstmt.toString(), szcatalogname.toString(), cbcatalogname.toInt(), szschemaname.toString(), cbschemaname.toInt(), sztablename.toString(), cbtablename.toInt(), sztabletype.toString(), cbtabletype.toInt()) as Int).toShort() else 0

public actual fun SQLTablesW(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short, sztabletype: Long, cchtabletype: Short): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLTablesW(hstmt.toString(), szcatalogname.toString(), cchcatalogname.toInt(), szschemaname.toString(), cchschemaname.toInt(), sztablename.toString(), cchtablename.toInt(), sztabletype.toString(), cchtabletype.toInt()) as Int).toShort() else 0

public actual fun SQLTransact(environmenthandle: Long, connectionhandle: Long, completiontype: UShort): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_SQLTransact(environmenthandle.toString(), connectionhandle.toString(), completiontype.toInt()) as Int).toShort() else 0

public actual fun bcp_batch(param0: Long): Int =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_bcp_batch(param0.toString()) as Int) else 0

public actual fun bcp_bind(param0: Long, param1: Long, param2: Int, param3: Int, param4: Long, param5: Int, param6: Int, param7: Int): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_bcp_bind(param0.toString(), param1.toString(), param2, param3, param4.toString(), param5, param6, param7) as Int).toShort() else 0

public actual fun bcp_colfmt(param0: Long, param1: Int, param2: UByte, param3: Int, param4: Int, param5: Long, param6: Int, param7: Int): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_bcp_colfmt(param0.toString(), param1, param2.toInt(), param3, param4, param5.toString(), param6, param7) as Int).toShort() else 0

public actual fun bcp_collen(param0: Long, param1: Int, param2: Int): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_bcp_collen(param0.toString(), param1, param2) as Int).toShort() else 0

public actual fun bcp_colptr(param0: Long, param1: Long, param2: Int): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_bcp_colptr(param0.toString(), param1.toString(), param2) as Int).toShort() else 0

public actual fun bcp_columns(param0: Long, param1: Int): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_bcp_columns(param0.toString(), param1) as Int).toShort() else 0

public actual fun bcp_control(param0: Long, param1: Int, param2: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_bcp_control(param0.toString(), param1, param2.toString()) as Int).toShort() else 0

public actual fun bcp_done(param0: Long): Int =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_bcp_done(param0.toString()) as Int) else 0

public actual fun bcp_exec(param0: Long, param1: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_bcp_exec(param0.toString(), param1.toString()) as Int).toShort() else 0

public actual fun bcp_getcolfmt(param0: Long, param1: Int, param2: Int, param3: Long, param4: Int, param5: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_bcp_getcolfmt(param0.toString(), param1, param2, param3.toString(), param4, param5.toString()) as Int).toShort() else 0

public actual fun bcp_initA(param0: Long, param1: PCSTR, param2: PCSTR, param3: PCSTR, param4: Int): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_bcp_initA(param0.toString(), param1.toString(), param2.toString(), param3.toString(), param4) as Int).toShort() else 0

public actual fun bcp_initW(param0: Long, param1: PCWSTR, param2: PCWSTR, param3: PCWSTR, param4: Int): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_bcp_initW(param0.toString(), param1.toString(), param2.toString(), param3.toString(), param4) as Int).toShort() else 0

public actual fun bcp_moretext(param0: Long, param1: Int, param2: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_bcp_moretext(param0.toString(), param1, param2.toString()) as Int).toShort() else 0

public actual fun bcp_readfmtA(param0: Long, param1: PCSTR): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_bcp_readfmtA(param0.toString(), param1.toString()) as Int).toShort() else 0

public actual fun bcp_readfmtW(param0: Long, param1: PCWSTR): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_bcp_readfmtW(param0.toString(), param1.toString()) as Int).toShort() else 0

public actual fun bcp_sendrow(param0: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_bcp_sendrow(param0.toString()) as Int).toShort() else 0

public actual fun bcp_setcolfmt(param0: Long, param1: Int, param2: Int, param3: Long, param4: Int): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_bcp_setcolfmt(param0.toString(), param1, param2, param3.toString(), param4) as Int).toShort() else 0

public actual fun bcp_writefmtA(param0: Long, param1: PCSTR): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_bcp_writefmtA(param0.toString(), param1.toString()) as Int).toShort() else 0

public actual fun bcp_writefmtW(param0: Long, param1: PCWSTR): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_bcp_writefmtW(param0.toString(), param1.toString()) as Int).toShort() else 0

public actual fun dbprtypeA(param0: Int): PSTR =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_dbprtypeA(param0) as String).toLong() else 0L

public actual fun dbprtypeW(param0: Int): PWSTR =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_dbprtypeW(param0) as String).toLong() else 0L
