@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.search

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private val _windowsWin32SystemSearchNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun oDBCGetTryWaitValue(): UInt =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_oDBCGetTryWaitValue() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oDBCSetTryWaitValue(dwvalue: UInt): Bool =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_oDBCSetTryWaitValue(dwvalue.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLAllocConnect(environmenthandle: COpaquePointer?, connectionhandle: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLAllocConnect((environmenthandle?.value ?: 0L).toString(), (connectionhandle?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLAllocEnv(environmenthandle: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLAllocEnv((environmenthandle?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLAllocHandle(handletype: Short, inputhandle: COpaquePointer?, outputhandle: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLAllocHandle(handletype.toInt(), (inputhandle?.value ?: 0L).toString(), (outputhandle?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLAllocHandleStd(fhandletype: Short, hinput: COpaquePointer?, phoutput: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLAllocHandleStd(fhandletype.toInt(), (hinput?.value ?: 0L).toString(), (phoutput?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLAllocStmt(connectionhandle: COpaquePointer?, statementhandle: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLAllocStmt((connectionhandle?.value ?: 0L).toString(), (statementhandle?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLBindCol(statementhandle: COpaquePointer?, columnnumber: UShort, targettype: Short, targetvalue: COpaquePointer?, bufferlength: Long, strlenOrInd: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLBindCol((statementhandle?.value ?: 0L).toString(), columnnumber.toInt(), targettype.toInt(), (targetvalue?.value ?: 0L).toString(), bufferlength.toString(), (strlenOrInd?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLBindParam(statementhandle: COpaquePointer?, parameternumber: UShort, valuetype: Short, parametertype: Short, lengthprecision: ULong, parameterscale: Short, parametervalue: COpaquePointer?, strlenOrInd: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLBindParam((statementhandle?.value ?: 0L).toString(), parameternumber.toInt(), valuetype.toInt(), parametertype.toInt(), lengthprecision.toString(), parameterscale.toInt(), (parametervalue?.value ?: 0L).toString(), (strlenOrInd?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLBindParameter(hstmt: COpaquePointer?, ipar: UShort, fparamtype: Short, fctype: Short, fsqltype: Short, cbcoldef: ULong, ibscale: Short, rgbvalue: COpaquePointer?, cbvaluemax: Long, pcbvalue: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLBindParameter((hstmt?.value ?: 0L).toString(), ipar.toInt(), fparamtype.toInt(), fctype.toInt(), fsqltype.toInt(), cbcoldef.toString(), ibscale.toInt(), (rgbvalue?.value ?: 0L).toString(), cbvaluemax.toString(), (pcbvalue?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLBrowseConnect(hdbc: COpaquePointer?, szconnstrin: COpaquePointer?, cchconnstrin: Short, szconnstrout: COpaquePointer?, cchconnstroutmax: Short, pcchconnstrout: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLBrowseConnect((hdbc?.value ?: 0L).toString(), (szconnstrin?.value ?: 0L).toString(), cchconnstrin.toInt(), (szconnstrout?.value ?: 0L).toString(), cchconnstroutmax.toInt(), (pcchconnstrout?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLBrowseConnectA(hdbc: COpaquePointer?, szconnstrin: COpaquePointer?, cbconnstrin: Short, szconnstrout: COpaquePointer?, cbconnstroutmax: Short, pcbconnstrout: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLBrowseConnectA((hdbc?.value ?: 0L).toString(), (szconnstrin?.value ?: 0L).toString(), cbconnstrin.toInt(), (szconnstrout?.value ?: 0L).toString(), cbconnstroutmax.toInt(), (pcbconnstrout?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLBrowseConnectW(hdbc: COpaquePointer?, szconnstrin: COpaquePointer?, cchconnstrin: Short, szconnstrout: COpaquePointer?, cchconnstroutmax: Short, pcchconnstrout: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLBrowseConnectW((hdbc?.value ?: 0L).toString(), (szconnstrin?.value ?: 0L).toString(), cchconnstrin.toInt(), (szconnstrout?.value ?: 0L).toString(), cchconnstroutmax.toInt(), (pcchconnstrout?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLBulkOperations(statementhandle: COpaquePointer?, operation: Short): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLBulkOperations((statementhandle?.value ?: 0L).toString(), operation.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLCancel(statementhandle: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLCancel((statementhandle?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLCancelHandle(handletype: Short, inputhandle: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLCancelHandle(handletype.toInt(), (inputhandle?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLCloseCursor(statementhandle: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLCloseCursor((statementhandle?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLCloseEnumServers(henumhandle: Handle): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLCloseEnumServers((henumhandle?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLColAttribute(statementhandle: COpaquePointer?, columnnumber: UShort, fieldidentifier: UShort, characterattribute: COpaquePointer?, bufferlength: Short, stringlength: COpaquePointer?, numericattribute: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLColAttribute((statementhandle?.value ?: 0L).toString(), columnnumber.toInt(), fieldidentifier.toInt(), (characterattribute?.value ?: 0L).toString(), bufferlength.toInt(), (stringlength?.value ?: 0L).toString(), (numericattribute?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLColAttributeA(hstmt: COpaquePointer?, icol: Short, ifield: Short, pcharattr: COpaquePointer?, cbcharattrmax: Short, pcbcharattr: COpaquePointer?, pnumattr: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLColAttributeA((hstmt?.value ?: 0L).toString(), icol.toInt(), ifield.toInt(), (pcharattr?.value ?: 0L).toString(), cbcharattrmax.toInt(), (pcbcharattr?.value ?: 0L).toString(), (pnumattr?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLColAttributeW(hstmt: COpaquePointer?, icol: UShort, ifield: UShort, pcharattr: COpaquePointer?, cbdescmax: Short, pcbcharattr: COpaquePointer?, pnumattr: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLColAttributeW((hstmt?.value ?: 0L).toString(), icol.toInt(), ifield.toInt(), (pcharattr?.value ?: 0L).toString(), cbdescmax.toInt(), (pcbcharattr?.value ?: 0L).toString(), (pnumattr?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLColAttributes(hstmt: COpaquePointer?, icol: UShort, fdesctype: UShort, rgbdesc: COpaquePointer?, cbdescmax: Short, pcbdesc: COpaquePointer?, pfdesc: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLColAttributes((hstmt?.value ?: 0L).toString(), icol.toInt(), fdesctype.toInt(), (rgbdesc?.value ?: 0L).toString(), cbdescmax.toInt(), (pcbdesc?.value ?: 0L).toString(), (pfdesc?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLColAttributesA(hstmt: COpaquePointer?, icol: UShort, fdesctype: UShort, rgbdesc: COpaquePointer?, cbdescmax: Short, pcbdesc: COpaquePointer?, pfdesc: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLColAttributesA((hstmt?.value ?: 0L).toString(), icol.toInt(), fdesctype.toInt(), (rgbdesc?.value ?: 0L).toString(), cbdescmax.toInt(), (pcbdesc?.value ?: 0L).toString(), (pfdesc?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLColAttributesW(hstmt: COpaquePointer?, icol: UShort, fdesctype: UShort, rgbdesc: COpaquePointer?, cbdescmax: Short, pcbdesc: COpaquePointer?, pfdesc: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLColAttributesW((hstmt?.value ?: 0L).toString(), icol.toInt(), fdesctype.toInt(), (rgbdesc?.value ?: 0L).toString(), cbdescmax.toInt(), (pcbdesc?.value ?: 0L).toString(), (pfdesc?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLColumnPrivileges(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cchcatalogname: Short, szschemaname: COpaquePointer?, cchschemaname: Short, sztablename: COpaquePointer?, cchtablename: Short, szcolumnname: COpaquePointer?, cchcolumnname: Short): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLColumnPrivileges((hstmt?.value ?: 0L).toString(), (szcatalogname?.value ?: 0L).toString(), cchcatalogname.toInt(), (szschemaname?.value ?: 0L).toString(), cchschemaname.toInt(), (sztablename?.value ?: 0L).toString(), cchtablename.toInt(), (szcolumnname?.value ?: 0L).toString(), cchcolumnname.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLColumnPrivilegesA(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cbcatalogname: Short, szschemaname: COpaquePointer?, cbschemaname: Short, sztablename: COpaquePointer?, cbtablename: Short, szcolumnname: COpaquePointer?, cbcolumnname: Short): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLColumnPrivilegesA((hstmt?.value ?: 0L).toString(), (szcatalogname?.value ?: 0L).toString(), cbcatalogname.toInt(), (szschemaname?.value ?: 0L).toString(), cbschemaname.toInt(), (sztablename?.value ?: 0L).toString(), cbtablename.toInt(), (szcolumnname?.value ?: 0L).toString(), cbcolumnname.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLColumnPrivilegesW(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cchcatalogname: Short, szschemaname: COpaquePointer?, cchschemaname: Short, sztablename: COpaquePointer?, cchtablename: Short, szcolumnname: COpaquePointer?, cchcolumnname: Short): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLColumnPrivilegesW((hstmt?.value ?: 0L).toString(), (szcatalogname?.value ?: 0L).toString(), cchcatalogname.toInt(), (szschemaname?.value ?: 0L).toString(), cchschemaname.toInt(), (sztablename?.value ?: 0L).toString(), cchtablename.toInt(), (szcolumnname?.value ?: 0L).toString(), cchcolumnname.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLColumns(statementhandle: COpaquePointer?, catalogname: COpaquePointer?, namelength1: Short, schemaname: COpaquePointer?, namelength2: Short, tablename: COpaquePointer?, namelength3: Short, columnname: COpaquePointer?, namelength4: Short): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLColumns((statementhandle?.value ?: 0L).toString(), (catalogname?.value ?: 0L).toString(), namelength1.toInt(), (schemaname?.value ?: 0L).toString(), namelength2.toInt(), (tablename?.value ?: 0L).toString(), namelength3.toInt(), (columnname?.value ?: 0L).toString(), namelength4.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLColumnsA(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cbcatalogname: Short, szschemaname: COpaquePointer?, cbschemaname: Short, sztablename: COpaquePointer?, cbtablename: Short, szcolumnname: COpaquePointer?, cbcolumnname: Short): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLColumnsA((hstmt?.value ?: 0L).toString(), (szcatalogname?.value ?: 0L).toString(), cbcatalogname.toInt(), (szschemaname?.value ?: 0L).toString(), cbschemaname.toInt(), (sztablename?.value ?: 0L).toString(), cbtablename.toInt(), (szcolumnname?.value ?: 0L).toString(), cbcolumnname.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLColumnsW(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cchcatalogname: Short, szschemaname: COpaquePointer?, cchschemaname: Short, sztablename: COpaquePointer?, cchtablename: Short, szcolumnname: COpaquePointer?, cchcolumnname: Short): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLColumnsW((hstmt?.value ?: 0L).toString(), (szcatalogname?.value ?: 0L).toString(), cchcatalogname.toInt(), (szschemaname?.value ?: 0L).toString(), cchschemaname.toInt(), (sztablename?.value ?: 0L).toString(), cchtablename.toInt(), (szcolumnname?.value ?: 0L).toString(), cchcolumnname.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLCompleteAsync(handletype: Short, handle: COpaquePointer?, asyncretcodeptr: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLCompleteAsync(handletype.toInt(), (handle?.value ?: 0L).toString(), (asyncretcodeptr?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLConnect(connectionhandle: COpaquePointer?, servername: COpaquePointer?, namelength1: Short, username: COpaquePointer?, namelength2: Short, authentication: COpaquePointer?, namelength3: Short): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLConnect((connectionhandle?.value ?: 0L).toString(), (servername?.value ?: 0L).toString(), namelength1.toInt(), (username?.value ?: 0L).toString(), namelength2.toInt(), (authentication?.value ?: 0L).toString(), namelength3.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLConnectA(hdbc: COpaquePointer?, szdsn: COpaquePointer?, cbdsn: Short, szuid: COpaquePointer?, cbuid: Short, szauthstr: COpaquePointer?, cbauthstr: Short): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLConnectA((hdbc?.value ?: 0L).toString(), (szdsn?.value ?: 0L).toString(), cbdsn.toInt(), (szuid?.value ?: 0L).toString(), cbuid.toInt(), (szauthstr?.value ?: 0L).toString(), cbauthstr.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLConnectW(hdbc: COpaquePointer?, szdsn: COpaquePointer?, cchdsn: Short, szuid: COpaquePointer?, cchuid: Short, szauthstr: COpaquePointer?, cchauthstr: Short): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLConnectW((hdbc?.value ?: 0L).toString(), (szdsn?.value ?: 0L).toString(), cchdsn.toInt(), (szuid?.value ?: 0L).toString(), cchuid.toInt(), (szauthstr?.value ?: 0L).toString(), cchauthstr.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLCopyDesc(sourcedeschandle: COpaquePointer?, targetdeschandle: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLCopyDesc((sourcedeschandle?.value ?: 0L).toString(), (targetdeschandle?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLDataSources(environmenthandle: COpaquePointer?, direction: UShort, servername: COpaquePointer?, bufferlength1: Short, namelength1ptr: COpaquePointer?, description: COpaquePointer?, bufferlength2: Short, namelength2ptr: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLDataSources((environmenthandle?.value ?: 0L).toString(), direction.toInt(), (servername?.value ?: 0L).toString(), bufferlength1.toInt(), (namelength1ptr?.value ?: 0L).toString(), (description?.value ?: 0L).toString(), bufferlength2.toInt(), (namelength2ptr?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLDataSourcesA(henv: COpaquePointer?, fdirection: UShort, szdsn: COpaquePointer?, cbdsnmax: Short, pcbdsn: COpaquePointer?, szdescription: COpaquePointer?, cbdescriptionmax: Short, pcbdescription: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLDataSourcesA((henv?.value ?: 0L).toString(), fdirection.toInt(), (szdsn?.value ?: 0L).toString(), cbdsnmax.toInt(), (pcbdsn?.value ?: 0L).toString(), (szdescription?.value ?: 0L).toString(), cbdescriptionmax.toInt(), (pcbdescription?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLDataSourcesW(henv: COpaquePointer?, fdirection: UShort, szdsn: COpaquePointer?, cchdsnmax: Short, pcchdsn: COpaquePointer?, wszdescription: COpaquePointer?, cchdescriptionmax: Short, pcchdescription: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLDataSourcesW((henv?.value ?: 0L).toString(), fdirection.toInt(), (szdsn?.value ?: 0L).toString(), cchdsnmax.toInt(), (pcchdsn?.value ?: 0L).toString(), (wszdescription?.value ?: 0L).toString(), cchdescriptionmax.toInt(), (pcchdescription?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLDescribeCol(statementhandle: COpaquePointer?, columnnumber: UShort, columnname: COpaquePointer?, bufferlength: Short, namelength: COpaquePointer?, datatype: COpaquePointer?, columnsize: COpaquePointer?, decimaldigits: COpaquePointer?, nullable: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLDescribeCol((statementhandle?.value ?: 0L).toString(), columnnumber.toInt(), (columnname?.value ?: 0L).toString(), bufferlength.toInt(), (namelength?.value ?: 0L).toString(), (datatype?.value ?: 0L).toString(), (columnsize?.value ?: 0L).toString(), (decimaldigits?.value ?: 0L).toString(), (nullable?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLDescribeColA(hstmt: COpaquePointer?, icol: UShort, szcolname: COpaquePointer?, cbcolnamemax: Short, pcbcolname: COpaquePointer?, pfsqltype: COpaquePointer?, pcbcoldef: COpaquePointer?, pibscale: COpaquePointer?, pfnullable: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLDescribeColA((hstmt?.value ?: 0L).toString(), icol.toInt(), (szcolname?.value ?: 0L).toString(), cbcolnamemax.toInt(), (pcbcolname?.value ?: 0L).toString(), (pfsqltype?.value ?: 0L).toString(), (pcbcoldef?.value ?: 0L).toString(), (pibscale?.value ?: 0L).toString(), (pfnullable?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLDescribeColW(hstmt: COpaquePointer?, icol: UShort, szcolname: COpaquePointer?, cchcolnamemax: Short, pcchcolname: COpaquePointer?, pfsqltype: COpaquePointer?, pcbcoldef: COpaquePointer?, pibscale: COpaquePointer?, pfnullable: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLDescribeColW((hstmt?.value ?: 0L).toString(), icol.toInt(), (szcolname?.value ?: 0L).toString(), cchcolnamemax.toInt(), (pcchcolname?.value ?: 0L).toString(), (pfsqltype?.value ?: 0L).toString(), (pcbcoldef?.value ?: 0L).toString(), (pibscale?.value ?: 0L).toString(), (pfnullable?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLDescribeParam(hstmt: COpaquePointer?, ipar: UShort, pfsqltype: COpaquePointer?, pcbparamdef: COpaquePointer?, pibscale: COpaquePointer?, pfnullable: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLDescribeParam((hstmt?.value ?: 0L).toString(), ipar.toInt(), (pfsqltype?.value ?: 0L).toString(), (pcbparamdef?.value ?: 0L).toString(), (pibscale?.value ?: 0L).toString(), (pfnullable?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLDisconnect(connectionhandle: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLDisconnect((connectionhandle?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLDriverConnect(hdbc: COpaquePointer?, hwnd: Long, szconnstrin: COpaquePointer?, cchconnstrin: Short, szconnstrout: COpaquePointer?, cchconnstroutmax: Short, pcchconnstrout: COpaquePointer?, fdrivercompletion: UShort): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLDriverConnect((hdbc?.value ?: 0L).toString(), hwnd.toString(), (szconnstrin?.value ?: 0L).toString(), cchconnstrin.toInt(), (szconnstrout?.value ?: 0L).toString(), cchconnstroutmax.toInt(), (pcchconnstrout?.value ?: 0L).toString(), fdrivercompletion.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLDriverConnectA(hdbc: COpaquePointer?, hwnd: Long, szconnstrin: COpaquePointer?, cbconnstrin: Short, szconnstrout: COpaquePointer?, cbconnstroutmax: Short, pcbconnstrout: COpaquePointer?, fdrivercompletion: UShort): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLDriverConnectA((hdbc?.value ?: 0L).toString(), hwnd.toString(), (szconnstrin?.value ?: 0L).toString(), cbconnstrin.toInt(), (szconnstrout?.value ?: 0L).toString(), cbconnstroutmax.toInt(), (pcbconnstrout?.value ?: 0L).toString(), fdrivercompletion.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLDriverConnectW(hdbc: COpaquePointer?, hwnd: Long, szconnstrin: COpaquePointer?, cchconnstrin: Short, szconnstrout: COpaquePointer?, cchconnstroutmax: Short, pcchconnstrout: COpaquePointer?, fdrivercompletion: UShort): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLDriverConnectW((hdbc?.value ?: 0L).toString(), hwnd.toString(), (szconnstrin?.value ?: 0L).toString(), cchconnstrin.toInt(), (szconnstrout?.value ?: 0L).toString(), cchconnstroutmax.toInt(), (pcchconnstrout?.value ?: 0L).toString(), fdrivercompletion.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLDrivers(henv: COpaquePointer?, fdirection: UShort, szdriverdesc: COpaquePointer?, cchdriverdescmax: Short, pcchdriverdesc: COpaquePointer?, szdriverattributes: COpaquePointer?, cchdrvrattrmax: Short, pcchdrvrattr: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLDrivers((henv?.value ?: 0L).toString(), fdirection.toInt(), (szdriverdesc?.value ?: 0L).toString(), cchdriverdescmax.toInt(), (pcchdriverdesc?.value ?: 0L).toString(), (szdriverattributes?.value ?: 0L).toString(), cchdrvrattrmax.toInt(), (pcchdrvrattr?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLDriversA(henv: COpaquePointer?, fdirection: UShort, szdriverdesc: COpaquePointer?, cbdriverdescmax: Short, pcbdriverdesc: COpaquePointer?, szdriverattributes: COpaquePointer?, cbdrvrattrmax: Short, pcbdrvrattr: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLDriversA((henv?.value ?: 0L).toString(), fdirection.toInt(), (szdriverdesc?.value ?: 0L).toString(), cbdriverdescmax.toInt(), (pcbdriverdesc?.value ?: 0L).toString(), (szdriverattributes?.value ?: 0L).toString(), cbdrvrattrmax.toInt(), (pcbdrvrattr?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLDriversW(henv: COpaquePointer?, fdirection: UShort, szdriverdesc: COpaquePointer?, cchdriverdescmax: Short, pcchdriverdesc: COpaquePointer?, szdriverattributes: COpaquePointer?, cchdrvrattrmax: Short, pcchdrvrattr: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLDriversW((henv?.value ?: 0L).toString(), fdirection.toInt(), (szdriverdesc?.value ?: 0L).toString(), cchdriverdescmax.toInt(), (pcchdriverdesc?.value ?: 0L).toString(), (szdriverattributes?.value ?: 0L).toString(), cchdrvrattrmax.toInt(), (pcchdrvrattr?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLEndTran(handletype: Short, handle: COpaquePointer?, completiontype: Short): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLEndTran(handletype.toInt(), (handle?.value ?: 0L).toString(), completiontype.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLError(environmenthandle: COpaquePointer?, connectionhandle: COpaquePointer?, statementhandle: COpaquePointer?, sqlstate: COpaquePointer?, nativeerror: COpaquePointer?, messagetext: COpaquePointer?, bufferlength: Short, textlength: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLError((environmenthandle?.value ?: 0L).toString(), (connectionhandle?.value ?: 0L).toString(), (statementhandle?.value ?: 0L).toString(), (sqlstate?.value ?: 0L).toString(), (nativeerror?.value ?: 0L).toString(), (messagetext?.value ?: 0L).toString(), bufferlength.toInt(), (textlength?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLErrorA(henv: COpaquePointer?, hdbc: COpaquePointer?, hstmt: COpaquePointer?, szsqlstate: COpaquePointer?, pfnativeerror: COpaquePointer?, szerrormsg: COpaquePointer?, cberrormsgmax: Short, pcberrormsg: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLErrorA((henv?.value ?: 0L).toString(), (hdbc?.value ?: 0L).toString(), (hstmt?.value ?: 0L).toString(), (szsqlstate?.value ?: 0L).toString(), (pfnativeerror?.value ?: 0L).toString(), (szerrormsg?.value ?: 0L).toString(), cberrormsgmax.toInt(), (pcberrormsg?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLErrorW(henv: COpaquePointer?, hdbc: COpaquePointer?, hstmt: COpaquePointer?, wszsqlstate: COpaquePointer?, pfnativeerror: COpaquePointer?, wszerrormsg: COpaquePointer?, ccherrormsgmax: Short, pccherrormsg: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLErrorW((henv?.value ?: 0L).toString(), (hdbc?.value ?: 0L).toString(), (hstmt?.value ?: 0L).toString(), (wszsqlstate?.value ?: 0L).toString(), (pfnativeerror?.value ?: 0L).toString(), (wszerrormsg?.value ?: 0L).toString(), ccherrormsgmax.toInt(), (pccherrormsg?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLExecDirect(statementhandle: COpaquePointer?, statementtext: COpaquePointer?, textlength: Int): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLExecDirect((statementhandle?.value ?: 0L).toString(), (statementtext?.value ?: 0L).toString(), textlength) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLExecDirectA(hstmt: COpaquePointer?, szsqlstr: COpaquePointer?, cbsqlstr: Int): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLExecDirectA((hstmt?.value ?: 0L).toString(), (szsqlstr?.value ?: 0L).toString(), cbsqlstr) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLExecDirectW(hstmt: COpaquePointer?, szsqlstr: COpaquePointer?, textlength: Int): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLExecDirectW((hstmt?.value ?: 0L).toString(), (szsqlstr?.value ?: 0L).toString(), textlength) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLExecute(statementhandle: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLExecute((statementhandle?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLExtendedFetch(hstmt: COpaquePointer?, ffetchtype: UShort, irow: Long, pcrow: COpaquePointer?, rgfrowstatus: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLExtendedFetch((hstmt?.value ?: 0L).toString(), ffetchtype.toInt(), irow.toString(), (pcrow?.value ?: 0L).toString(), (rgfrowstatus?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLFetch(statementhandle: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLFetch((statementhandle?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLFetchScroll(statementhandle: COpaquePointer?, fetchorientation: Short, fetchoffset: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLFetchScroll((statementhandle?.value ?: 0L).toString(), fetchorientation.toInt(), fetchoffset.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLForeignKeys(hstmt: COpaquePointer?, szpkcatalogname: COpaquePointer?, cchpkcatalogname: Short, szpkschemaname: COpaquePointer?, cchpkschemaname: Short, szpktablename: COpaquePointer?, cchpktablename: Short, szfkcatalogname: COpaquePointer?, cchfkcatalogname: Short, szfkschemaname: COpaquePointer?, cchfkschemaname: Short, szfktablename: COpaquePointer?, cchfktablename: Short): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLForeignKeys((hstmt?.value ?: 0L).toString(), (szpkcatalogname?.value ?: 0L).toString(), cchpkcatalogname.toInt(), (szpkschemaname?.value ?: 0L).toString(), cchpkschemaname.toInt(), (szpktablename?.value ?: 0L).toString(), cchpktablename.toInt(), (szfkcatalogname?.value ?: 0L).toString(), cchfkcatalogname.toInt(), (szfkschemaname?.value ?: 0L).toString(), cchfkschemaname.toInt(), (szfktablename?.value ?: 0L).toString(), cchfktablename.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLForeignKeysA(hstmt: COpaquePointer?, szpkcatalogname: COpaquePointer?, cbpkcatalogname: Short, szpkschemaname: COpaquePointer?, cbpkschemaname: Short, szpktablename: COpaquePointer?, cbpktablename: Short, szfkcatalogname: COpaquePointer?, cbfkcatalogname: Short, szfkschemaname: COpaquePointer?, cbfkschemaname: Short, szfktablename: COpaquePointer?, cbfktablename: Short): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLForeignKeysA((hstmt?.value ?: 0L).toString(), (szpkcatalogname?.value ?: 0L).toString(), cbpkcatalogname.toInt(), (szpkschemaname?.value ?: 0L).toString(), cbpkschemaname.toInt(), (szpktablename?.value ?: 0L).toString(), cbpktablename.toInt(), (szfkcatalogname?.value ?: 0L).toString(), cbfkcatalogname.toInt(), (szfkschemaname?.value ?: 0L).toString(), cbfkschemaname.toInt(), (szfktablename?.value ?: 0L).toString(), cbfktablename.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLForeignKeysW(hstmt: COpaquePointer?, szpkcatalogname: COpaquePointer?, cchpkcatalogname: Short, szpkschemaname: COpaquePointer?, cchpkschemaname: Short, szpktablename: COpaquePointer?, cchpktablename: Short, szfkcatalogname: COpaquePointer?, cchfkcatalogname: Short, szfkschemaname: COpaquePointer?, cchfkschemaname: Short, szfktablename: COpaquePointer?, cchfktablename: Short): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLForeignKeysW((hstmt?.value ?: 0L).toString(), (szpkcatalogname?.value ?: 0L).toString(), cchpkcatalogname.toInt(), (szpkschemaname?.value ?: 0L).toString(), cchpkschemaname.toInt(), (szpktablename?.value ?: 0L).toString(), cchpktablename.toInt(), (szfkcatalogname?.value ?: 0L).toString(), cchfkcatalogname.toInt(), (szfkschemaname?.value ?: 0L).toString(), cchfkschemaname.toInt(), (szfktablename?.value ?: 0L).toString(), cchfktablename.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLFreeConnect(connectionhandle: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLFreeConnect((connectionhandle?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLFreeEnv(environmenthandle: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLFreeEnv((environmenthandle?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLFreeHandle(handletype: Short, handle: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLFreeHandle(handletype.toInt(), (handle?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLFreeStmt(statementhandle: COpaquePointer?, option: UShort): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLFreeStmt((statementhandle?.value ?: 0L).toString(), option.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetConnectAttr(connectionhandle: COpaquePointer?, attribute: Int, value: COpaquePointer?, bufferlength: Int, stringlengthptr: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLGetConnectAttr((connectionhandle?.value ?: 0L).toString(), attribute, (value?.value ?: 0L).toString(), bufferlength, (stringlengthptr?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetConnectAttrA(hdbc: COpaquePointer?, fattribute: Int, rgbvalue: COpaquePointer?, cbvaluemax: Int, pcbvalue: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLGetConnectAttrA((hdbc?.value ?: 0L).toString(), fattribute, (rgbvalue?.value ?: 0L).toString(), cbvaluemax, (pcbvalue?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetConnectAttrW(hdbc: COpaquePointer?, fattribute: Int, rgbvalue: COpaquePointer?, cbvaluemax: Int, pcbvalue: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLGetConnectAttrW((hdbc?.value ?: 0L).toString(), fattribute, (rgbvalue?.value ?: 0L).toString(), cbvaluemax, (pcbvalue?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetConnectOption(connectionhandle: COpaquePointer?, option: UShort, value: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLGetConnectOption((connectionhandle?.value ?: 0L).toString(), option.toInt(), (value?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetConnectOptionA(hdbc: COpaquePointer?, foption: UShort, pvparam: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLGetConnectOptionA((hdbc?.value ?: 0L).toString(), foption.toInt(), (pvparam?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetConnectOptionW(hdbc: COpaquePointer?, foption: UShort, pvparam: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLGetConnectOptionW((hdbc?.value ?: 0L).toString(), foption.toInt(), (pvparam?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetCursorName(statementhandle: COpaquePointer?, cursorname: COpaquePointer?, bufferlength: Short, namelengthptr: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLGetCursorName((statementhandle?.value ?: 0L).toString(), (cursorname?.value ?: 0L).toString(), bufferlength.toInt(), (namelengthptr?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetCursorNameA(hstmt: COpaquePointer?, szcursor: COpaquePointer?, cbcursormax: Short, pcbcursor: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLGetCursorNameA((hstmt?.value ?: 0L).toString(), (szcursor?.value ?: 0L).toString(), cbcursormax.toInt(), (pcbcursor?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetCursorNameW(hstmt: COpaquePointer?, szcursor: COpaquePointer?, cchcursormax: Short, pcchcursor: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLGetCursorNameW((hstmt?.value ?: 0L).toString(), (szcursor?.value ?: 0L).toString(), cchcursormax.toInt(), (pcchcursor?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetData(statementhandle: COpaquePointer?, columnnumber: UShort, targettype: Short, targetvalue: COpaquePointer?, bufferlength: Long, strlenOrIndptr: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLGetData((statementhandle?.value ?: 0L).toString(), columnnumber.toInt(), targettype.toInt(), (targetvalue?.value ?: 0L).toString(), bufferlength.toString(), (strlenOrIndptr?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetDescField(descriptorhandle: COpaquePointer?, recnumber: Short, fieldidentifier: Short, value: COpaquePointer?, bufferlength: Int, stringlength: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLGetDescField((descriptorhandle?.value ?: 0L).toString(), recnumber.toInt(), fieldidentifier.toInt(), (value?.value ?: 0L).toString(), bufferlength, (stringlength?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetDescFieldA(hdesc: COpaquePointer?, irecord: Short, ifield: Short, rgbvalue: COpaquePointer?, cbbufferlength: Int, stringlength: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLGetDescFieldA((hdesc?.value ?: 0L).toString(), irecord.toInt(), ifield.toInt(), (rgbvalue?.value ?: 0L).toString(), cbbufferlength, (stringlength?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetDescFieldW(hdesc: COpaquePointer?, irecord: Short, ifield: Short, rgbvalue: COpaquePointer?, cbbufferlength: Int, stringlength: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLGetDescFieldW((hdesc?.value ?: 0L).toString(), irecord.toInt(), ifield.toInt(), (rgbvalue?.value ?: 0L).toString(), cbbufferlength, (stringlength?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetDescRec(descriptorhandle: COpaquePointer?, recnumber: Short, name: COpaquePointer?, bufferlength: Short, stringlengthptr: COpaquePointer?, typeptr: COpaquePointer?, subtypeptr: COpaquePointer?, lengthptr: COpaquePointer?, precisionptr: COpaquePointer?, scaleptr: COpaquePointer?, nullableptr: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLGetDescRec((descriptorhandle?.value ?: 0L).toString(), recnumber.toInt(), (name?.value ?: 0L).toString(), bufferlength.toInt(), (stringlengthptr?.value ?: 0L).toString(), (typeptr?.value ?: 0L).toString(), (subtypeptr?.value ?: 0L).toString(), (lengthptr?.value ?: 0L).toString(), (precisionptr?.value ?: 0L).toString(), (scaleptr?.value ?: 0L).toString(), (nullableptr?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetDescRecA(hdesc: COpaquePointer?, irecord: Short, szname: COpaquePointer?, cbnamemax: Short, pcbname: COpaquePointer?, pftype: COpaquePointer?, pfsubtype: COpaquePointer?, plength: COpaquePointer?, pprecision: COpaquePointer?, pscale: COpaquePointer?, pnullable: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLGetDescRecA((hdesc?.value ?: 0L).toString(), irecord.toInt(), (szname?.value ?: 0L).toString(), cbnamemax.toInt(), (pcbname?.value ?: 0L).toString(), (pftype?.value ?: 0L).toString(), (pfsubtype?.value ?: 0L).toString(), (plength?.value ?: 0L).toString(), (pprecision?.value ?: 0L).toString(), (pscale?.value ?: 0L).toString(), (pnullable?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetDescRecW(hdesc: COpaquePointer?, irecord: Short, szname: COpaquePointer?, cchnamemax: Short, pcchname: COpaquePointer?, pftype: COpaquePointer?, pfsubtype: COpaquePointer?, plength: COpaquePointer?, pprecision: COpaquePointer?, pscale: COpaquePointer?, pnullable: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLGetDescRecW((hdesc?.value ?: 0L).toString(), irecord.toInt(), (szname?.value ?: 0L).toString(), cchnamemax.toInt(), (pcchname?.value ?: 0L).toString(), (pftype?.value ?: 0L).toString(), (pfsubtype?.value ?: 0L).toString(), (plength?.value ?: 0L).toString(), (pprecision?.value ?: 0L).toString(), (pscale?.value ?: 0L).toString(), (pnullable?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetDiagField(handletype: Short, handle: COpaquePointer?, recnumber: Short, diagidentifier: Short, diaginfo: COpaquePointer?, bufferlength: Short, stringlength: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLGetDiagField(handletype.toInt(), (handle?.value ?: 0L).toString(), recnumber.toInt(), diagidentifier.toInt(), (diaginfo?.value ?: 0L).toString(), bufferlength.toInt(), (stringlength?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetDiagFieldA(fhandletype: Short, handle: COpaquePointer?, irecord: Short, fdiagfield: Short, rgbdiaginfo: COpaquePointer?, cbdiaginfomax: Short, pcbdiaginfo: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLGetDiagFieldA(fhandletype.toInt(), (handle?.value ?: 0L).toString(), irecord.toInt(), fdiagfield.toInt(), (rgbdiaginfo?.value ?: 0L).toString(), cbdiaginfomax.toInt(), (pcbdiaginfo?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetDiagFieldW(fhandletype: Short, handle: COpaquePointer?, irecord: Short, fdiagfield: Short, rgbdiaginfo: COpaquePointer?, cbbufferlength: Short, pcbstringlength: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLGetDiagFieldW(fhandletype.toInt(), (handle?.value ?: 0L).toString(), irecord.toInt(), fdiagfield.toInt(), (rgbdiaginfo?.value ?: 0L).toString(), cbbufferlength.toInt(), (pcbstringlength?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetDiagRec(handletype: Short, handle: COpaquePointer?, recnumber: Short, sqlstate: COpaquePointer?, nativeerror: COpaquePointer?, messagetext: COpaquePointer?, bufferlength: Short, textlength: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLGetDiagRec(handletype.toInt(), (handle?.value ?: 0L).toString(), recnumber.toInt(), (sqlstate?.value ?: 0L).toString(), (nativeerror?.value ?: 0L).toString(), (messagetext?.value ?: 0L).toString(), bufferlength.toInt(), (textlength?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetDiagRecA(fhandletype: Short, handle: COpaquePointer?, irecord: Short, szsqlstate: COpaquePointer?, pfnativeerror: COpaquePointer?, szerrormsg: COpaquePointer?, cberrormsgmax: Short, pcberrormsg: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLGetDiagRecA(fhandletype.toInt(), (handle?.value ?: 0L).toString(), irecord.toInt(), (szsqlstate?.value ?: 0L).toString(), (pfnativeerror?.value ?: 0L).toString(), (szerrormsg?.value ?: 0L).toString(), cberrormsgmax.toInt(), (pcberrormsg?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetDiagRecW(fhandletype: Short, handle: COpaquePointer?, irecord: Short, szsqlstate: COpaquePointer?, pfnativeerror: COpaquePointer?, szerrormsg: COpaquePointer?, ccherrormsgmax: Short, pccherrormsg: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLGetDiagRecW(fhandletype.toInt(), (handle?.value ?: 0L).toString(), irecord.toInt(), (szsqlstate?.value ?: 0L).toString(), (pfnativeerror?.value ?: 0L).toString(), (szerrormsg?.value ?: 0L).toString(), ccherrormsgmax.toInt(), (pccherrormsg?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetEnvAttr(environmenthandle: COpaquePointer?, attribute: Int, value: COpaquePointer?, bufferlength: Int, stringlength: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLGetEnvAttr((environmenthandle?.value ?: 0L).toString(), attribute, (value?.value ?: 0L).toString(), bufferlength, (stringlength?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetFunctions(connectionhandle: COpaquePointer?, functionid: UShort, supported: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLGetFunctions((connectionhandle?.value ?: 0L).toString(), functionid.toInt(), (supported?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetInfo(connectionhandle: COpaquePointer?, infotype: UShort, infovalue: COpaquePointer?, bufferlength: Short, stringlengthptr: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLGetInfo((connectionhandle?.value ?: 0L).toString(), infotype.toInt(), (infovalue?.value ?: 0L).toString(), bufferlength.toInt(), (stringlengthptr?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetInfoA(hdbc: COpaquePointer?, finfotype: UShort, rgbinfovalue: COpaquePointer?, cbinfovaluemax: Short, pcbinfovalue: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLGetInfoA((hdbc?.value ?: 0L).toString(), finfotype.toInt(), (rgbinfovalue?.value ?: 0L).toString(), cbinfovaluemax.toInt(), (pcbinfovalue?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetInfoW(hdbc: COpaquePointer?, finfotype: UShort, rgbinfovalue: COpaquePointer?, cbinfovaluemax: Short, pcbinfovalue: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLGetInfoW((hdbc?.value ?: 0L).toString(), finfotype.toInt(), (rgbinfovalue?.value ?: 0L).toString(), cbinfovaluemax.toInt(), (pcbinfovalue?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetNextEnumeration(henumhandle: Handle, prgenumdata: COpaquePointer?, pienumlength: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLGetNextEnumeration((henumhandle?.value ?: 0L).toString(), (prgenumdata?.value ?: 0L).toString(), (pienumlength?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetStmtAttr(statementhandle: COpaquePointer?, attribute: Int, value: COpaquePointer?, bufferlength: Int, stringlength: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLGetStmtAttr((statementhandle?.value ?: 0L).toString(), attribute, (value?.value ?: 0L).toString(), bufferlength, (stringlength?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetStmtAttrA(hstmt: COpaquePointer?, fattribute: Int, rgbvalue: COpaquePointer?, cbvaluemax: Int, pcbvalue: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLGetStmtAttrA((hstmt?.value ?: 0L).toString(), fattribute, (rgbvalue?.value ?: 0L).toString(), cbvaluemax, (pcbvalue?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetStmtAttrW(hstmt: COpaquePointer?, fattribute: Int, rgbvalue: COpaquePointer?, cbvaluemax: Int, pcbvalue: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLGetStmtAttrW((hstmt?.value ?: 0L).toString(), fattribute, (rgbvalue?.value ?: 0L).toString(), cbvaluemax, (pcbvalue?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetStmtOption(statementhandle: COpaquePointer?, option: UShort, value: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLGetStmtOption((statementhandle?.value ?: 0L).toString(), option.toInt(), (value?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetTypeInfo(statementhandle: COpaquePointer?, datatype: Short): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLGetTypeInfo((statementhandle?.value ?: 0L).toString(), datatype.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetTypeInfoA(statementhandle: COpaquePointer?, datatype: Short): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLGetTypeInfoA((statementhandle?.value ?: 0L).toString(), datatype.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetTypeInfoW(statementhandle: COpaquePointer?, datatype: Short): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLGetTypeInfoW((statementhandle?.value ?: 0L).toString(), datatype.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLInitEnumServers(pwchservername: Pcwstr, pwchinstancename: Pcwstr): Handle =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLInitEnumServers((pwchservername?.value ?: 0L).toString(), (pwchinstancename?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLLinkedCatalogsA(param0: COpaquePointer?, param1: Pcstr, param2: Short): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLLinkedCatalogsA((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), param2.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLLinkedCatalogsW(param0: COpaquePointer?, param1: Pcwstr, param2: Short): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLLinkedCatalogsW((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), param2.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLLinkedServers(param0: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLLinkedServers((param0?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLMoreResults(hstmt: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLMoreResults((hstmt?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLNativeSql(hdbc: COpaquePointer?, szsqlstrin: COpaquePointer?, cchsqlstrin: Int, szsqlstr: COpaquePointer?, cchsqlstrmax: Int, pcbsqlstr: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLNativeSql((hdbc?.value ?: 0L).toString(), (szsqlstrin?.value ?: 0L).toString(), cchsqlstrin, (szsqlstr?.value ?: 0L).toString(), cchsqlstrmax, (pcbsqlstr?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLNativeSqlA(hdbc: COpaquePointer?, szsqlstrin: COpaquePointer?, cbsqlstrin: Int, szsqlstr: COpaquePointer?, cbsqlstrmax: Int, pcbsqlstr: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLNativeSqlA((hdbc?.value ?: 0L).toString(), (szsqlstrin?.value ?: 0L).toString(), cbsqlstrin, (szsqlstr?.value ?: 0L).toString(), cbsqlstrmax, (pcbsqlstr?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLNativeSqlW(hdbc: COpaquePointer?, szsqlstrin: COpaquePointer?, cchsqlstrin: Int, szsqlstr: COpaquePointer?, cchsqlstrmax: Int, pcchsqlstr: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLNativeSqlW((hdbc?.value ?: 0L).toString(), (szsqlstrin?.value ?: 0L).toString(), cchsqlstrin, (szsqlstr?.value ?: 0L).toString(), cchsqlstrmax, (pcchsqlstr?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLNumParams(hstmt: COpaquePointer?, pcpar: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLNumParams((hstmt?.value ?: 0L).toString(), (pcpar?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLNumResultCols(statementhandle: COpaquePointer?, columncount: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLNumResultCols((statementhandle?.value ?: 0L).toString(), (columncount?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLParamData(statementhandle: COpaquePointer?, value: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLParamData((statementhandle?.value ?: 0L).toString(), (value?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLParamOptions(hstmt: COpaquePointer?, crow: ULong, pirow: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLParamOptions((hstmt?.value ?: 0L).toString(), crow.toString(), (pirow?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLPrepare(statementhandle: COpaquePointer?, statementtext: COpaquePointer?, textlength: Int): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLPrepare((statementhandle?.value ?: 0L).toString(), (statementtext?.value ?: 0L).toString(), textlength) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLPrepareA(hstmt: COpaquePointer?, szsqlstr: COpaquePointer?, cbsqlstr: Int): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLPrepareA((hstmt?.value ?: 0L).toString(), (szsqlstr?.value ?: 0L).toString(), cbsqlstr) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLPrepareW(hstmt: COpaquePointer?, szsqlstr: COpaquePointer?, cchsqlstr: Int): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLPrepareW((hstmt?.value ?: 0L).toString(), (szsqlstr?.value ?: 0L).toString(), cchsqlstr) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLPrimaryKeys(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cchcatalogname: Short, szschemaname: COpaquePointer?, cchschemaname: Short, sztablename: COpaquePointer?, cchtablename: Short): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLPrimaryKeys((hstmt?.value ?: 0L).toString(), (szcatalogname?.value ?: 0L).toString(), cchcatalogname.toInt(), (szschemaname?.value ?: 0L).toString(), cchschemaname.toInt(), (sztablename?.value ?: 0L).toString(), cchtablename.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLPrimaryKeysA(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cbcatalogname: Short, szschemaname: COpaquePointer?, cbschemaname: Short, sztablename: COpaquePointer?, cbtablename: Short): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLPrimaryKeysA((hstmt?.value ?: 0L).toString(), (szcatalogname?.value ?: 0L).toString(), cbcatalogname.toInt(), (szschemaname?.value ?: 0L).toString(), cbschemaname.toInt(), (sztablename?.value ?: 0L).toString(), cbtablename.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLPrimaryKeysW(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cchcatalogname: Short, szschemaname: COpaquePointer?, cchschemaname: Short, sztablename: COpaquePointer?, cchtablename: Short): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLPrimaryKeysW((hstmt?.value ?: 0L).toString(), (szcatalogname?.value ?: 0L).toString(), cchcatalogname.toInt(), (szschemaname?.value ?: 0L).toString(), cchschemaname.toInt(), (sztablename?.value ?: 0L).toString(), cchtablename.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLProcedureColumns(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cchcatalogname: Short, szschemaname: COpaquePointer?, cchschemaname: Short, szprocname: COpaquePointer?, cchprocname: Short, szcolumnname: COpaquePointer?, cchcolumnname: Short): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLProcedureColumns((hstmt?.value ?: 0L).toString(), (szcatalogname?.value ?: 0L).toString(), cchcatalogname.toInt(), (szschemaname?.value ?: 0L).toString(), cchschemaname.toInt(), (szprocname?.value ?: 0L).toString(), cchprocname.toInt(), (szcolumnname?.value ?: 0L).toString(), cchcolumnname.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLProcedureColumnsA(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cbcatalogname: Short, szschemaname: COpaquePointer?, cbschemaname: Short, szprocname: COpaquePointer?, cbprocname: Short, szcolumnname: COpaquePointer?, cbcolumnname: Short): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLProcedureColumnsA((hstmt?.value ?: 0L).toString(), (szcatalogname?.value ?: 0L).toString(), cbcatalogname.toInt(), (szschemaname?.value ?: 0L).toString(), cbschemaname.toInt(), (szprocname?.value ?: 0L).toString(), cbprocname.toInt(), (szcolumnname?.value ?: 0L).toString(), cbcolumnname.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLProcedureColumnsW(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cchcatalogname: Short, szschemaname: COpaquePointer?, cchschemaname: Short, szprocname: COpaquePointer?, cchprocname: Short, szcolumnname: COpaquePointer?, cchcolumnname: Short): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLProcedureColumnsW((hstmt?.value ?: 0L).toString(), (szcatalogname?.value ?: 0L).toString(), cchcatalogname.toInt(), (szschemaname?.value ?: 0L).toString(), cchschemaname.toInt(), (szprocname?.value ?: 0L).toString(), cchprocname.toInt(), (szcolumnname?.value ?: 0L).toString(), cchcolumnname.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLProcedures(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cchcatalogname: Short, szschemaname: COpaquePointer?, cchschemaname: Short, szprocname: COpaquePointer?, cchprocname: Short): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLProcedures((hstmt?.value ?: 0L).toString(), (szcatalogname?.value ?: 0L).toString(), cchcatalogname.toInt(), (szschemaname?.value ?: 0L).toString(), cchschemaname.toInt(), (szprocname?.value ?: 0L).toString(), cchprocname.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLProceduresA(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cbcatalogname: Short, szschemaname: COpaquePointer?, cbschemaname: Short, szprocname: COpaquePointer?, cbprocname: Short): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLProceduresA((hstmt?.value ?: 0L).toString(), (szcatalogname?.value ?: 0L).toString(), cbcatalogname.toInt(), (szschemaname?.value ?: 0L).toString(), cbschemaname.toInt(), (szprocname?.value ?: 0L).toString(), cbprocname.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLProceduresW(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cchcatalogname: Short, szschemaname: COpaquePointer?, cchschemaname: Short, szprocname: COpaquePointer?, cchprocname: Short): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLProceduresW((hstmt?.value ?: 0L).toString(), (szcatalogname?.value ?: 0L).toString(), cchcatalogname.toInt(), (szschemaname?.value ?: 0L).toString(), cchschemaname.toInt(), (szprocname?.value ?: 0L).toString(), cchprocname.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLPutData(statementhandle: COpaquePointer?, data: COpaquePointer?, strlenOrInd: Long): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLPutData((statementhandle?.value ?: 0L).toString(), (data?.value ?: 0L).toString(), strlenOrInd.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLRowCount(statementhandle: COpaquePointer?, rowcount: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLRowCount((statementhandle?.value ?: 0L).toString(), (rowcount?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLSetConnectAttr(connectionhandle: COpaquePointer?, attribute: Int, value: COpaquePointer?, stringlength: Int): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLSetConnectAttr((connectionhandle?.value ?: 0L).toString(), attribute, (value?.value ?: 0L).toString(), stringlength) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLSetConnectAttrA(hdbc: COpaquePointer?, fattribute: Int, rgbvalue: COpaquePointer?, cbvalue: Int): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLSetConnectAttrA((hdbc?.value ?: 0L).toString(), fattribute, (rgbvalue?.value ?: 0L).toString(), cbvalue) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLSetConnectAttrW(hdbc: COpaquePointer?, fattribute: Int, rgbvalue: COpaquePointer?, cbvalue: Int): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLSetConnectAttrW((hdbc?.value ?: 0L).toString(), fattribute, (rgbvalue?.value ?: 0L).toString(), cbvalue) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLSetConnectOption(connectionhandle: COpaquePointer?, option: UShort, value: ULong): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLSetConnectOption((connectionhandle?.value ?: 0L).toString(), option.toInt(), value.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLSetConnectOptionA(hdbc: COpaquePointer?, foption: UShort, vparam: ULong): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLSetConnectOptionA((hdbc?.value ?: 0L).toString(), foption.toInt(), vparam.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLSetConnectOptionW(hdbc: COpaquePointer?, foption: UShort, vparam: ULong): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLSetConnectOptionW((hdbc?.value ?: 0L).toString(), foption.toInt(), vparam.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLSetCursorName(statementhandle: COpaquePointer?, cursorname: COpaquePointer?, namelength: Short): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLSetCursorName((statementhandle?.value ?: 0L).toString(), (cursorname?.value ?: 0L).toString(), namelength.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLSetCursorNameA(hstmt: COpaquePointer?, szcursor: COpaquePointer?, cbcursor: Short): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLSetCursorNameA((hstmt?.value ?: 0L).toString(), (szcursor?.value ?: 0L).toString(), cbcursor.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLSetCursorNameW(hstmt: COpaquePointer?, szcursor: COpaquePointer?, cchcursor: Short): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLSetCursorNameW((hstmt?.value ?: 0L).toString(), (szcursor?.value ?: 0L).toString(), cchcursor.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLSetDescField(descriptorhandle: COpaquePointer?, recnumber: Short, fieldidentifier: Short, value: COpaquePointer?, bufferlength: Int): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLSetDescField((descriptorhandle?.value ?: 0L).toString(), recnumber.toInt(), fieldidentifier.toInt(), (value?.value ?: 0L).toString(), bufferlength) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLSetDescFieldW(descriptorhandle: COpaquePointer?, recnumber: Short, fieldidentifier: Short, value: COpaquePointer?, bufferlength: Int): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLSetDescFieldW((descriptorhandle?.value ?: 0L).toString(), recnumber.toInt(), fieldidentifier.toInt(), (value?.value ?: 0L).toString(), bufferlength) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLSetDescRec(descriptorhandle: COpaquePointer?, recnumber: Short, type: Short, subtype: Short, length: Long, precision: Short, scale: Short, data: COpaquePointer?, stringlength: COpaquePointer?, indicator: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLSetDescRec((descriptorhandle?.value ?: 0L).toString(), recnumber.toInt(), type.toInt(), subtype.toInt(), length.toString(), precision.toInt(), scale.toInt(), (data?.value ?: 0L).toString(), (stringlength?.value ?: 0L).toString(), (indicator?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLSetEnvAttr(environmenthandle: COpaquePointer?, attribute: Int, value: COpaquePointer?, stringlength: Int): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLSetEnvAttr((environmenthandle?.value ?: 0L).toString(), attribute, (value?.value ?: 0L).toString(), stringlength) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLSetParam(statementhandle: COpaquePointer?, parameternumber: UShort, valuetype: Short, parametertype: Short, lengthprecision: ULong, parameterscale: Short, parametervalue: COpaquePointer?, strlenOrInd: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLSetParam((statementhandle?.value ?: 0L).toString(), parameternumber.toInt(), valuetype.toInt(), parametertype.toInt(), lengthprecision.toString(), parameterscale.toInt(), (parametervalue?.value ?: 0L).toString(), (strlenOrInd?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLSetPos(hstmt: COpaquePointer?, irow: ULong, foption: UShort, flock: UShort): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLSetPos((hstmt?.value ?: 0L).toString(), irow.toString(), foption.toInt(), flock.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLSetScrollOptions(hstmt: COpaquePointer?, fconcurrency: UShort, crowkeyset: Long, crowrowset: UShort): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLSetScrollOptions((hstmt?.value ?: 0L).toString(), fconcurrency.toInt(), crowkeyset.toString(), crowrowset.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLSetStmtAttr(statementhandle: COpaquePointer?, attribute: Int, value: COpaquePointer?, stringlength: Int): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLSetStmtAttr((statementhandle?.value ?: 0L).toString(), attribute, (value?.value ?: 0L).toString(), stringlength) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLSetStmtAttrW(hstmt: COpaquePointer?, fattribute: Int, rgbvalue: COpaquePointer?, cbvaluemax: Int): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLSetStmtAttrW((hstmt?.value ?: 0L).toString(), fattribute, (rgbvalue?.value ?: 0L).toString(), cbvaluemax) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLSetStmtOption(statementhandle: COpaquePointer?, option: UShort, value: ULong): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLSetStmtOption((statementhandle?.value ?: 0L).toString(), option.toInt(), value.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLSpecialColumns(statementhandle: COpaquePointer?, identifiertype: UShort, catalogname: COpaquePointer?, namelength1: Short, schemaname: COpaquePointer?, namelength2: Short, tablename: COpaquePointer?, namelength3: Short, scope: UShort, nullable: UShort): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLSpecialColumns((statementhandle?.value ?: 0L).toString(), identifiertype.toInt(), (catalogname?.value ?: 0L).toString(), namelength1.toInt(), (schemaname?.value ?: 0L).toString(), namelength2.toInt(), (tablename?.value ?: 0L).toString(), namelength3.toInt(), scope.toInt(), nullable.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLSpecialColumnsA(hstmt: COpaquePointer?, fcoltype: UShort, szcatalogname: COpaquePointer?, cbcatalogname: Short, szschemaname: COpaquePointer?, cbschemaname: Short, sztablename: COpaquePointer?, cbtablename: Short, fscope: UShort, fnullable: UShort): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLSpecialColumnsA((hstmt?.value ?: 0L).toString(), fcoltype.toInt(), (szcatalogname?.value ?: 0L).toString(), cbcatalogname.toInt(), (szschemaname?.value ?: 0L).toString(), cbschemaname.toInt(), (sztablename?.value ?: 0L).toString(), cbtablename.toInt(), fscope.toInt(), fnullable.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLSpecialColumnsW(hstmt: COpaquePointer?, fcoltype: UShort, szcatalogname: COpaquePointer?, cchcatalogname: Short, szschemaname: COpaquePointer?, cchschemaname: Short, sztablename: COpaquePointer?, cchtablename: Short, fscope: UShort, fnullable: UShort): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLSpecialColumnsW((hstmt?.value ?: 0L).toString(), fcoltype.toInt(), (szcatalogname?.value ?: 0L).toString(), cchcatalogname.toInt(), (szschemaname?.value ?: 0L).toString(), cchschemaname.toInt(), (sztablename?.value ?: 0L).toString(), cchtablename.toInt(), fscope.toInt(), fnullable.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLStatistics(statementhandle: COpaquePointer?, catalogname: COpaquePointer?, namelength1: Short, schemaname: COpaquePointer?, namelength2: Short, tablename: COpaquePointer?, namelength3: Short, unique: UShort, reserved: UShort): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLStatistics((statementhandle?.value ?: 0L).toString(), (catalogname?.value ?: 0L).toString(), namelength1.toInt(), (schemaname?.value ?: 0L).toString(), namelength2.toInt(), (tablename?.value ?: 0L).toString(), namelength3.toInt(), unique.toInt(), reserved.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLStatisticsA(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cbcatalogname: Short, szschemaname: COpaquePointer?, cbschemaname: Short, sztablename: COpaquePointer?, cbtablename: Short, funique: UShort, faccuracy: UShort): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLStatisticsA((hstmt?.value ?: 0L).toString(), (szcatalogname?.value ?: 0L).toString(), cbcatalogname.toInt(), (szschemaname?.value ?: 0L).toString(), cbschemaname.toInt(), (sztablename?.value ?: 0L).toString(), cbtablename.toInt(), funique.toInt(), faccuracy.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLStatisticsW(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cchcatalogname: Short, szschemaname: COpaquePointer?, cchschemaname: Short, sztablename: COpaquePointer?, cchtablename: Short, funique: UShort, faccuracy: UShort): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLStatisticsW((hstmt?.value ?: 0L).toString(), (szcatalogname?.value ?: 0L).toString(), cchcatalogname.toInt(), (szschemaname?.value ?: 0L).toString(), cchschemaname.toInt(), (sztablename?.value ?: 0L).toString(), cchtablename.toInt(), funique.toInt(), faccuracy.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLTablePrivileges(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cchcatalogname: Short, szschemaname: COpaquePointer?, cchschemaname: Short, sztablename: COpaquePointer?, cchtablename: Short): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLTablePrivileges((hstmt?.value ?: 0L).toString(), (szcatalogname?.value ?: 0L).toString(), cchcatalogname.toInt(), (szschemaname?.value ?: 0L).toString(), cchschemaname.toInt(), (sztablename?.value ?: 0L).toString(), cchtablename.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLTablePrivilegesA(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cbcatalogname: Short, szschemaname: COpaquePointer?, cbschemaname: Short, sztablename: COpaquePointer?, cbtablename: Short): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLTablePrivilegesA((hstmt?.value ?: 0L).toString(), (szcatalogname?.value ?: 0L).toString(), cbcatalogname.toInt(), (szschemaname?.value ?: 0L).toString(), cbschemaname.toInt(), (sztablename?.value ?: 0L).toString(), cbtablename.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLTablePrivilegesW(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cchcatalogname: Short, szschemaname: COpaquePointer?, cchschemaname: Short, sztablename: COpaquePointer?, cchtablename: Short): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLTablePrivilegesW((hstmt?.value ?: 0L).toString(), (szcatalogname?.value ?: 0L).toString(), cchcatalogname.toInt(), (szschemaname?.value ?: 0L).toString(), cchschemaname.toInt(), (sztablename?.value ?: 0L).toString(), cchtablename.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLTables(statementhandle: COpaquePointer?, catalogname: COpaquePointer?, namelength1: Short, schemaname: COpaquePointer?, namelength2: Short, tablename: COpaquePointer?, namelength3: Short, tabletype: COpaquePointer?, namelength4: Short): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLTables((statementhandle?.value ?: 0L).toString(), (catalogname?.value ?: 0L).toString(), namelength1.toInt(), (schemaname?.value ?: 0L).toString(), namelength2.toInt(), (tablename?.value ?: 0L).toString(), namelength3.toInt(), (tabletype?.value ?: 0L).toString(), namelength4.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLTablesA(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cbcatalogname: Short, szschemaname: COpaquePointer?, cbschemaname: Short, sztablename: COpaquePointer?, cbtablename: Short, sztabletype: COpaquePointer?, cbtabletype: Short): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLTablesA((hstmt?.value ?: 0L).toString(), (szcatalogname?.value ?: 0L).toString(), cbcatalogname.toInt(), (szschemaname?.value ?: 0L).toString(), cbschemaname.toInt(), (sztablename?.value ?: 0L).toString(), cbtablename.toInt(), (sztabletype?.value ?: 0L).toString(), cbtabletype.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLTablesW(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cchcatalogname: Short, szschemaname: COpaquePointer?, cchschemaname: Short, sztablename: COpaquePointer?, cchtablename: Short, sztabletype: COpaquePointer?, cchtabletype: Short): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLTablesW((hstmt?.value ?: 0L).toString(), (szcatalogname?.value ?: 0L).toString(), cchcatalogname.toInt(), (szschemaname?.value ?: 0L).toString(), cchschemaname.toInt(), (sztablename?.value ?: 0L).toString(), cchtablename.toInt(), (sztabletype?.value ?: 0L).toString(), cchtabletype.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLTransact(environmenthandle: COpaquePointer?, connectionhandle: COpaquePointer?, completiontype: UShort): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_sQLTransact((environmenthandle?.value ?: 0L).toString(), (connectionhandle?.value ?: 0L).toString(), completiontype.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bcpBatch(param0: COpaquePointer?): Int =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_bcpBatch((param0?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bcpBind(param0: COpaquePointer?, param1: COpaquePointer?, param2: Int, param3: Int, param4: COpaquePointer?, param5: Int, param6: Int, param7: Int): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_bcpBind((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), param2, param3, (param4?.value ?: 0L).toString(), param5, param6, param7) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bcpColfmt(param0: COpaquePointer?, param1: Int, param2: UByte, param3: Int, param4: Int, param5: COpaquePointer?, param6: Int, param7: Int): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_bcpColfmt((param0?.value ?: 0L).toString(), param1, param2.toInt(), param3, param4, (param5?.value ?: 0L).toString(), param6, param7) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bcpCollen(param0: COpaquePointer?, param1: Int, param2: Int): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_bcpCollen((param0?.value ?: 0L).toString(), param1, param2) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bcpColptr(param0: COpaquePointer?, param1: COpaquePointer?, param2: Int): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_bcpColptr((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), param2) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bcpColumns(param0: COpaquePointer?, param1: Int): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_bcpColumns((param0?.value ?: 0L).toString(), param1) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bcpControl(param0: COpaquePointer?, param1: Int, param2: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_bcpControl((param0?.value ?: 0L).toString(), param1, (param2?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bcpDone(param0: COpaquePointer?): Int =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_bcpDone((param0?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bcpExec(param0: COpaquePointer?, param1: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_bcpExec((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bcpGetcolfmt(param0: COpaquePointer?, param1: Int, param2: Int, param3: COpaquePointer?, param4: Int, param5: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_bcpGetcolfmt((param0?.value ?: 0L).toString(), param1, param2, (param3?.value ?: 0L).toString(), param4, (param5?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bcpInitA(param0: COpaquePointer?, param1: Pcstr, param2: Pcstr, param3: Pcstr, param4: Int): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_bcpInitA((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString(), (param3?.value ?: 0L).toString(), param4) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bcpInitW(param0: COpaquePointer?, param1: Pcwstr, param2: Pcwstr, param3: Pcwstr, param4: Int): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_bcpInitW((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString(), (param3?.value ?: 0L).toString(), param4) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bcpMoretext(param0: COpaquePointer?, param1: Int, param2: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_bcpMoretext((param0?.value ?: 0L).toString(), param1, (param2?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bcpReadfmtA(param0: COpaquePointer?, param1: Pcstr): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_bcpReadfmtA((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bcpReadfmtW(param0: COpaquePointer?, param1: Pcwstr): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_bcpReadfmtW((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bcpSendrow(param0: COpaquePointer?): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_bcpSendrow((param0?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bcpSetcolfmt(param0: COpaquePointer?, param1: Int, param2: Int, param3: COpaquePointer?, param4: Int): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_bcpSetcolfmt((param0?.value ?: 0L).toString(), param1, param2, (param3?.value ?: 0L).toString(), param4) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bcpWritefmtA(param0: COpaquePointer?, param1: Pcstr): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_bcpWritefmtA((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bcpWritefmtW(param0: COpaquePointer?, param1: Pcwstr): Short =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_bcpWritefmtW((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dbprtypeA(param0: Int): Pstr =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_dbprtypeA(param0) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dbprtypeW(param0: Int): Pwstr =
    if (_windowsWin32SystemSearchNapiAddon != null) (_windowsWin32SystemSearchNapiAddon.windowssys_windows_win32_system_search_dbprtypeW(param0) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")
