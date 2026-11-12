@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private val windowsWin32SystemSearchNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun oDBCGetTryWaitValue(): UInt =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchODBCGetTryWaitValue() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oDBCSetTryWaitValue(dwvalue: UInt): Bool =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchODBCSetTryWaitValue(dwvalue.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLAllocConnect(environmenthandle: MutPtr<CVoid>, connectionhandle: MutPtr<MutPtr<CVoid>>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLAllocConnect(environmenthandle.rawAddress.toString(), connectionhandle.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLAllocEnv(environmenthandle: MutPtr<MutPtr<CVoid>>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLAllocEnv(environmenthandle.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLAllocHandle(handletype: Short, inputhandle: MutPtr<CVoid>, outputhandle: MutPtr<MutPtr<CVoid>>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLAllocHandle(handletype.toInt(), inputhandle.rawAddress.toString(), outputhandle.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLAllocHandleStd(fhandletype: Short, hinput: MutPtr<CVoid>, phoutput: MutPtr<MutPtr<CVoid>>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLAllocHandleStd(fhandletype.toInt(), hinput.rawAddress.toString(), phoutput.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLAllocStmt(connectionhandle: MutPtr<CVoid>, statementhandle: MutPtr<MutPtr<CVoid>>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLAllocStmt(connectionhandle.rawAddress.toString(), statementhandle.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLBindCol(statementhandle: MutPtr<CVoid>, columnnumber: UShort, targettype: Short, targetvalue: MutPtr<CVoid>, bufferlength: Long, strlenOrInd: MutPtr<Long>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLBindCol(statementhandle.rawAddress.toString(), columnnumber.toInt(), targettype.toInt(), targetvalue.rawAddress.toString(), bufferlength.toString(), strlenOrInd.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLBindParam(statementhandle: MutPtr<CVoid>, parameternumber: UShort, valuetype: Short, parametertype: Short, lengthprecision: ULong, parameterscale: Short, parametervalue: MutPtr<CVoid>, strlenOrInd: MutPtr<Long>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLBindParam(statementhandle.rawAddress.toString(), parameternumber.toInt(), valuetype.toInt(), parametertype.toInt(), lengthprecision.toString(), parameterscale.toInt(), parametervalue.rawAddress.toString(), strlenOrInd.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLBindParameter(hstmt: MutPtr<CVoid>, ipar: UShort, fparamtype: Short, fctype: Short, fsqltype: Short, cbcoldef: ULong, ibscale: Short, rgbvalue: MutPtr<CVoid>, cbvaluemax: Long, pcbvalue: MutPtr<Long>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLBindParameter(hstmt.rawAddress.toString(), ipar.toInt(), fparamtype.toInt(), fctype.toInt(), fsqltype.toInt(), cbcoldef.toString(), ibscale.toInt(), rgbvalue.rawAddress.toString(), cbvaluemax.toString(), pcbvalue.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLBrowseConnect(hdbc: MutPtr<CVoid>, szconnstrin: ConstPtr<UByte>, cchconnstrin: Short, szconnstrout: MutPtr<UByte>, cchconnstroutmax: Short, pcchconnstrout: MutPtr<Short>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLBrowseConnect(hdbc.rawAddress.toString(), szconnstrin.rawAddress.toString(), cchconnstrin.toInt(), szconnstrout.rawAddress.toString(), cchconnstroutmax.toInt(), pcchconnstrout.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLBrowseConnectA(hdbc: MutPtr<CVoid>, szconnstrin: ConstPtr<UByte>, cbconnstrin: Short, szconnstrout: MutPtr<UByte>, cbconnstroutmax: Short, pcbconnstrout: MutPtr<Short>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLBrowseConnectA(hdbc.rawAddress.toString(), szconnstrin.rawAddress.toString(), cbconnstrin.toInt(), szconnstrout.rawAddress.toString(), cbconnstroutmax.toInt(), pcbconnstrout.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLBrowseConnectW(hdbc: MutPtr<CVoid>, szconnstrin: ConstPtr<UShort>, cchconnstrin: Short, szconnstrout: MutPtr<UShort>, cchconnstroutmax: Short, pcchconnstrout: MutPtr<Short>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLBrowseConnectW(hdbc.rawAddress.toString(), szconnstrin.rawAddress.toString(), cchconnstrin.toInt(), szconnstrout.rawAddress.toString(), cchconnstroutmax.toInt(), pcchconnstrout.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLBulkOperations(statementhandle: MutPtr<CVoid>, operation: Short): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLBulkOperations(statementhandle.rawAddress.toString(), operation.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLCancel(statementhandle: MutPtr<CVoid>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLCancel(statementhandle.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLCancelHandle(handletype: Short, inputhandle: MutPtr<CVoid>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLCancelHandle(handletype.toInt(), inputhandle.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLCloseCursor(statementhandle: MutPtr<CVoid>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLCloseCursor(statementhandle.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLCloseEnumServers(henumhandle: Handle): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLCloseEnumServers(henumhandle.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLColAttribute(statementhandle: MutPtr<CVoid>, columnnumber: UShort, fieldidentifier: UShort, characterattribute: MutPtr<CVoid>, bufferlength: Short, stringlength: MutPtr<Short>, numericattribute: MutPtr<Long>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLColAttribute(statementhandle.rawAddress.toString(), columnnumber.toInt(), fieldidentifier.toInt(), characterattribute.rawAddress.toString(), bufferlength.toInt(), stringlength.rawAddress.toString(), numericattribute.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLColAttributeA(hstmt: MutPtr<CVoid>, icol: Short, ifield: Short, pcharattr: MutPtr<CVoid>, cbcharattrmax: Short, pcbcharattr: MutPtr<Short>, pnumattr: MutPtr<Long>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLColAttributeA(hstmt.rawAddress.toString(), icol.toInt(), ifield.toInt(), pcharattr.rawAddress.toString(), cbcharattrmax.toInt(), pcbcharattr.rawAddress.toString(), pnumattr.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLColAttributeW(hstmt: MutPtr<CVoid>, icol: UShort, ifield: UShort, pcharattr: MutPtr<CVoid>, cbdescmax: Short, pcbcharattr: MutPtr<Short>, pnumattr: MutPtr<Long>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLColAttributeW(hstmt.rawAddress.toString(), icol.toInt(), ifield.toInt(), pcharattr.rawAddress.toString(), cbdescmax.toInt(), pcbcharattr.rawAddress.toString(), pnumattr.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLColAttributes(hstmt: MutPtr<CVoid>, icol: UShort, fdesctype: UShort, rgbdesc: MutPtr<CVoid>, cbdescmax: Short, pcbdesc: MutPtr<Short>, pfdesc: MutPtr<Long>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLColAttributes(hstmt.rawAddress.toString(), icol.toInt(), fdesctype.toInt(), rgbdesc.rawAddress.toString(), cbdescmax.toInt(), pcbdesc.rawAddress.toString(), pfdesc.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLColAttributesA(hstmt: MutPtr<CVoid>, icol: UShort, fdesctype: UShort, rgbdesc: MutPtr<CVoid>, cbdescmax: Short, pcbdesc: MutPtr<Short>, pfdesc: MutPtr<Long>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLColAttributesA(hstmt.rawAddress.toString(), icol.toInt(), fdesctype.toInt(), rgbdesc.rawAddress.toString(), cbdescmax.toInt(), pcbdesc.rawAddress.toString(), pfdesc.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLColAttributesW(hstmt: MutPtr<CVoid>, icol: UShort, fdesctype: UShort, rgbdesc: MutPtr<CVoid>, cbdescmax: Short, pcbdesc: MutPtr<Short>, pfdesc: MutPtr<Long>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLColAttributesW(hstmt.rawAddress.toString(), icol.toInt(), fdesctype.toInt(), rgbdesc.rawAddress.toString(), cbdescmax.toInt(), pcbdesc.rawAddress.toString(), pfdesc.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLColumnPrivileges(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UByte>, cchcatalogname: Short, szschemaname: ConstPtr<UByte>, cchschemaname: Short, sztablename: ConstPtr<UByte>, cchtablename: Short, szcolumnname: ConstPtr<UByte>, cchcolumnname: Short): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLColumnPrivileges(hstmt.rawAddress.toString(), szcatalogname.rawAddress.toString(), cchcatalogname.toInt(), szschemaname.rawAddress.toString(), cchschemaname.toInt(), sztablename.rawAddress.toString(), cchtablename.toInt(), szcolumnname.rawAddress.toString(), cchcolumnname.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLColumnPrivilegesA(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UByte>, cbcatalogname: Short, szschemaname: ConstPtr<UByte>, cbschemaname: Short, sztablename: ConstPtr<UByte>, cbtablename: Short, szcolumnname: ConstPtr<UByte>, cbcolumnname: Short): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLColumnPrivilegesA(hstmt.rawAddress.toString(), szcatalogname.rawAddress.toString(), cbcatalogname.toInt(), szschemaname.rawAddress.toString(), cbschemaname.toInt(), sztablename.rawAddress.toString(), cbtablename.toInt(), szcolumnname.rawAddress.toString(), cbcolumnname.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLColumnPrivilegesW(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UShort>, cchcatalogname: Short, szschemaname: ConstPtr<UShort>, cchschemaname: Short, sztablename: ConstPtr<UShort>, cchtablename: Short, szcolumnname: ConstPtr<UShort>, cchcolumnname: Short): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLColumnPrivilegesW(hstmt.rawAddress.toString(), szcatalogname.rawAddress.toString(), cchcatalogname.toInt(), szschemaname.rawAddress.toString(), cchschemaname.toInt(), sztablename.rawAddress.toString(), cchtablename.toInt(), szcolumnname.rawAddress.toString(), cchcolumnname.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLColumns(statementhandle: MutPtr<CVoid>, catalogname: ConstPtr<UByte>, namelength1: Short, schemaname: ConstPtr<UByte>, namelength2: Short, tablename: ConstPtr<UByte>, namelength3: Short, columnname: ConstPtr<UByte>, namelength4: Short): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLColumns(statementhandle.rawAddress.toString(), catalogname.rawAddress.toString(), namelength1.toInt(), schemaname.rawAddress.toString(), namelength2.toInt(), tablename.rawAddress.toString(), namelength3.toInt(), columnname.rawAddress.toString(), namelength4.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLColumnsA(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UByte>, cbcatalogname: Short, szschemaname: ConstPtr<UByte>, cbschemaname: Short, sztablename: ConstPtr<UByte>, cbtablename: Short, szcolumnname: ConstPtr<UByte>, cbcolumnname: Short): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLColumnsA(hstmt.rawAddress.toString(), szcatalogname.rawAddress.toString(), cbcatalogname.toInt(), szschemaname.rawAddress.toString(), cbschemaname.toInt(), sztablename.rawAddress.toString(), cbtablename.toInt(), szcolumnname.rawAddress.toString(), cbcolumnname.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLColumnsW(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UShort>, cchcatalogname: Short, szschemaname: ConstPtr<UShort>, cchschemaname: Short, sztablename: ConstPtr<UShort>, cchtablename: Short, szcolumnname: ConstPtr<UShort>, cchcolumnname: Short): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLColumnsW(hstmt.rawAddress.toString(), szcatalogname.rawAddress.toString(), cchcatalogname.toInt(), szschemaname.rawAddress.toString(), cchschemaname.toInt(), sztablename.rawAddress.toString(), cchtablename.toInt(), szcolumnname.rawAddress.toString(), cchcolumnname.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLCompleteAsync(handletype: Short, handle: MutPtr<CVoid>, asyncretcodeptr: MutPtr<Short>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLCompleteAsync(handletype.toInt(), handle.rawAddress.toString(), asyncretcodeptr.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLConnect(connectionhandle: MutPtr<CVoid>, servername: ConstPtr<UByte>, namelength1: Short, username: ConstPtr<UByte>, namelength2: Short, authentication: ConstPtr<UByte>, namelength3: Short): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLConnect(connectionhandle.rawAddress.toString(), servername.rawAddress.toString(), namelength1.toInt(), username.rawAddress.toString(), namelength2.toInt(), authentication.rawAddress.toString(), namelength3.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLConnectA(hdbc: MutPtr<CVoid>, szdsn: ConstPtr<UByte>, cbdsn: Short, szuid: ConstPtr<UByte>, cbuid: Short, szauthstr: ConstPtr<UByte>, cbauthstr: Short): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLConnectA(hdbc.rawAddress.toString(), szdsn.rawAddress.toString(), cbdsn.toInt(), szuid.rawAddress.toString(), cbuid.toInt(), szauthstr.rawAddress.toString(), cbauthstr.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLConnectW(hdbc: MutPtr<CVoid>, szdsn: ConstPtr<UShort>, cchdsn: Short, szuid: ConstPtr<UShort>, cchuid: Short, szauthstr: ConstPtr<UShort>, cchauthstr: Short): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLConnectW(hdbc.rawAddress.toString(), szdsn.rawAddress.toString(), cchdsn.toInt(), szuid.rawAddress.toString(), cchuid.toInt(), szauthstr.rawAddress.toString(), cchauthstr.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLCopyDesc(sourcedeschandle: MutPtr<CVoid>, targetdeschandle: MutPtr<CVoid>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLCopyDesc(sourcedeschandle.rawAddress.toString(), targetdeschandle.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLDataSources(environmenthandle: MutPtr<CVoid>, direction: UShort, servername: MutPtr<UByte>, bufferlength1: Short, namelength1ptr: MutPtr<Short>, description: MutPtr<UByte>, bufferlength2: Short, namelength2ptr: MutPtr<Short>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLDataSources(environmenthandle.rawAddress.toString(), direction.toInt(), servername.rawAddress.toString(), bufferlength1.toInt(), namelength1ptr.rawAddress.toString(), description.rawAddress.toString(), bufferlength2.toInt(), namelength2ptr.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLDataSourcesA(henv: MutPtr<CVoid>, fdirection: UShort, szdsn: MutPtr<UByte>, cbdsnmax: Short, pcbdsn: MutPtr<Short>, szdescription: MutPtr<UByte>, cbdescriptionmax: Short, pcbdescription: MutPtr<Short>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLDataSourcesA(henv.rawAddress.toString(), fdirection.toInt(), szdsn.rawAddress.toString(), cbdsnmax.toInt(), pcbdsn.rawAddress.toString(), szdescription.rawAddress.toString(), cbdescriptionmax.toInt(), pcbdescription.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLDataSourcesW(henv: MutPtr<CVoid>, fdirection: UShort, szdsn: MutPtr<UShort>, cchdsnmax: Short, pcchdsn: MutPtr<Short>, wszdescription: MutPtr<UShort>, cchdescriptionmax: Short, pcchdescription: MutPtr<Short>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLDataSourcesW(henv.rawAddress.toString(), fdirection.toInt(), szdsn.rawAddress.toString(), cchdsnmax.toInt(), pcchdsn.rawAddress.toString(), wszdescription.rawAddress.toString(), cchdescriptionmax.toInt(), pcchdescription.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLDescribeCol(statementhandle: MutPtr<CVoid>, columnnumber: UShort, columnname: MutPtr<UByte>, bufferlength: Short, namelength: MutPtr<Short>, datatype: MutPtr<Short>, columnsize: MutPtr<ULong>, decimaldigits: MutPtr<Short>, nullable: MutPtr<Short>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLDescribeCol(statementhandle.rawAddress.toString(), columnnumber.toInt(), columnname.rawAddress.toString(), bufferlength.toInt(), namelength.rawAddress.toString(), datatype.rawAddress.toString(), columnsize.rawAddress.toString(), decimaldigits.rawAddress.toString(), nullable.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLDescribeColA(hstmt: MutPtr<CVoid>, icol: UShort, szcolname: MutPtr<UByte>, cbcolnamemax: Short, pcbcolname: MutPtr<Short>, pfsqltype: MutPtr<Short>, pcbcoldef: MutPtr<ULong>, pibscale: MutPtr<Short>, pfnullable: MutPtr<Short>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLDescribeColA(hstmt.rawAddress.toString(), icol.toInt(), szcolname.rawAddress.toString(), cbcolnamemax.toInt(), pcbcolname.rawAddress.toString(), pfsqltype.rawAddress.toString(), pcbcoldef.rawAddress.toString(), pibscale.rawAddress.toString(), pfnullable.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLDescribeColW(hstmt: MutPtr<CVoid>, icol: UShort, szcolname: MutPtr<UShort>, cchcolnamemax: Short, pcchcolname: MutPtr<Short>, pfsqltype: MutPtr<Short>, pcbcoldef: MutPtr<ULong>, pibscale: MutPtr<Short>, pfnullable: MutPtr<Short>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLDescribeColW(hstmt.rawAddress.toString(), icol.toInt(), szcolname.rawAddress.toString(), cchcolnamemax.toInt(), pcchcolname.rawAddress.toString(), pfsqltype.rawAddress.toString(), pcbcoldef.rawAddress.toString(), pibscale.rawAddress.toString(), pfnullable.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLDescribeParam(hstmt: MutPtr<CVoid>, ipar: UShort, pfsqltype: MutPtr<Short>, pcbparamdef: MutPtr<ULong>, pibscale: MutPtr<Short>, pfnullable: MutPtr<Short>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLDescribeParam(hstmt.rawAddress.toString(), ipar.toInt(), pfsqltype.rawAddress.toString(), pcbparamdef.rawAddress.toString(), pibscale.rawAddress.toString(), pfnullable.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLDisconnect(connectionhandle: MutPtr<CVoid>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLDisconnect(connectionhandle.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLDriverConnect(hdbc: MutPtr<CVoid>, hwnd: Long, szconnstrin: ConstPtr<UByte>, cchconnstrin: Short, szconnstrout: MutPtr<UByte>, cchconnstroutmax: Short, pcchconnstrout: MutPtr<Short>, fdrivercompletion: UShort): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLDriverConnect(hdbc.rawAddress.toString(), hwnd.toString(), szconnstrin.rawAddress.toString(), cchconnstrin.toInt(), szconnstrout.rawAddress.toString(), cchconnstroutmax.toInt(), pcchconnstrout.rawAddress.toString(), fdrivercompletion.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLDriverConnectA(hdbc: MutPtr<CVoid>, hwnd: Long, szconnstrin: ConstPtr<UByte>, cbconnstrin: Short, szconnstrout: MutPtr<UByte>, cbconnstroutmax: Short, pcbconnstrout: MutPtr<Short>, fdrivercompletion: UShort): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLDriverConnectA(hdbc.rawAddress.toString(), hwnd.toString(), szconnstrin.rawAddress.toString(), cbconnstrin.toInt(), szconnstrout.rawAddress.toString(), cbconnstroutmax.toInt(), pcbconnstrout.rawAddress.toString(), fdrivercompletion.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLDriverConnectW(hdbc: MutPtr<CVoid>, hwnd: Long, szconnstrin: ConstPtr<UShort>, cchconnstrin: Short, szconnstrout: MutPtr<UShort>, cchconnstroutmax: Short, pcchconnstrout: MutPtr<Short>, fdrivercompletion: UShort): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLDriverConnectW(hdbc.rawAddress.toString(), hwnd.toString(), szconnstrin.rawAddress.toString(), cchconnstrin.toInt(), szconnstrout.rawAddress.toString(), cchconnstroutmax.toInt(), pcchconnstrout.rawAddress.toString(), fdrivercompletion.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLDrivers(henv: MutPtr<CVoid>, fdirection: UShort, szdriverdesc: MutPtr<UByte>, cchdriverdescmax: Short, pcchdriverdesc: MutPtr<Short>, szdriverattributes: MutPtr<UByte>, cchdrvrattrmax: Short, pcchdrvrattr: MutPtr<Short>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLDrivers(henv.rawAddress.toString(), fdirection.toInt(), szdriverdesc.rawAddress.toString(), cchdriverdescmax.toInt(), pcchdriverdesc.rawAddress.toString(), szdriverattributes.rawAddress.toString(), cchdrvrattrmax.toInt(), pcchdrvrattr.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLDriversA(henv: MutPtr<CVoid>, fdirection: UShort, szdriverdesc: MutPtr<UByte>, cbdriverdescmax: Short, pcbdriverdesc: MutPtr<Short>, szdriverattributes: MutPtr<UByte>, cbdrvrattrmax: Short, pcbdrvrattr: MutPtr<Short>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLDriversA(henv.rawAddress.toString(), fdirection.toInt(), szdriverdesc.rawAddress.toString(), cbdriverdescmax.toInt(), pcbdriverdesc.rawAddress.toString(), szdriverattributes.rawAddress.toString(), cbdrvrattrmax.toInt(), pcbdrvrattr.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLDriversW(henv: MutPtr<CVoid>, fdirection: UShort, szdriverdesc: MutPtr<UShort>, cchdriverdescmax: Short, pcchdriverdesc: MutPtr<Short>, szdriverattributes: MutPtr<UShort>, cchdrvrattrmax: Short, pcchdrvrattr: MutPtr<Short>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLDriversW(henv.rawAddress.toString(), fdirection.toInt(), szdriverdesc.rawAddress.toString(), cchdriverdescmax.toInt(), pcchdriverdesc.rawAddress.toString(), szdriverattributes.rawAddress.toString(), cchdrvrattrmax.toInt(), pcchdrvrattr.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLEndTran(handletype: Short, handle: MutPtr<CVoid>, completiontype: Short): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLEndTran(handletype.toInt(), handle.rawAddress.toString(), completiontype.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLError(environmenthandle: MutPtr<CVoid>, connectionhandle: MutPtr<CVoid>, statementhandle: MutPtr<CVoid>, sqlstate: MutPtr<UByte>, nativeerror: MutPtr<Int>, messagetext: MutPtr<UByte>, bufferlength: Short, textlength: MutPtr<Short>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLError(environmenthandle.rawAddress.toString(), connectionhandle.rawAddress.toString(), statementhandle.rawAddress.toString(), sqlstate.rawAddress.toString(), nativeerror.rawAddress.toString(), messagetext.rawAddress.toString(), bufferlength.toInt(), textlength.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLErrorA(henv: MutPtr<CVoid>, hdbc: MutPtr<CVoid>, hstmt: MutPtr<CVoid>, szsqlstate: MutPtr<UByte>, pfnativeerror: MutPtr<Int>, szerrormsg: MutPtr<UByte>, cberrormsgmax: Short, pcberrormsg: MutPtr<Short>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLErrorA(henv.rawAddress.toString(), hdbc.rawAddress.toString(), hstmt.rawAddress.toString(), szsqlstate.rawAddress.toString(), pfnativeerror.rawAddress.toString(), szerrormsg.rawAddress.toString(), cberrormsgmax.toInt(), pcberrormsg.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLErrorW(henv: MutPtr<CVoid>, hdbc: MutPtr<CVoid>, hstmt: MutPtr<CVoid>, wszsqlstate: MutPtr<UShort>, pfnativeerror: MutPtr<Int>, wszerrormsg: MutPtr<UShort>, ccherrormsgmax: Short, pccherrormsg: MutPtr<Short>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLErrorW(henv.rawAddress.toString(), hdbc.rawAddress.toString(), hstmt.rawAddress.toString(), wszsqlstate.rawAddress.toString(), pfnativeerror.rawAddress.toString(), wszerrormsg.rawAddress.toString(), ccherrormsgmax.toInt(), pccherrormsg.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLExecDirect(statementhandle: MutPtr<CVoid>, statementtext: ConstPtr<UByte>, textlength: Int): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLExecDirect(statementhandle.rawAddress.toString(), statementtext.rawAddress.toString(), textlength) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLExecDirectA(hstmt: MutPtr<CVoid>, szsqlstr: ConstPtr<UByte>, cbsqlstr: Int): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLExecDirectA(hstmt.rawAddress.toString(), szsqlstr.rawAddress.toString(), cbsqlstr) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLExecDirectW(hstmt: MutPtr<CVoid>, szsqlstr: ConstPtr<UShort>, textlength: Int): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLExecDirectW(hstmt.rawAddress.toString(), szsqlstr.rawAddress.toString(), textlength) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLExecute(statementhandle: MutPtr<CVoid>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLExecute(statementhandle.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLExtendedFetch(hstmt: MutPtr<CVoid>, ffetchtype: UShort, irow: Long, pcrow: MutPtr<ULong>, rgfrowstatus: MutPtr<UShort>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLExtendedFetch(hstmt.rawAddress.toString(), ffetchtype.toInt(), irow.toString(), pcrow.rawAddress.toString(), rgfrowstatus.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLFetch(statementhandle: MutPtr<CVoid>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLFetch(statementhandle.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLFetchScroll(statementhandle: MutPtr<CVoid>, fetchorientation: Short, fetchoffset: Long): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLFetchScroll(statementhandle.rawAddress.toString(), fetchorientation.toInt(), fetchoffset.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLForeignKeys(hstmt: MutPtr<CVoid>, szpkcatalogname: ConstPtr<UByte>, cchpkcatalogname: Short, szpkschemaname: ConstPtr<UByte>, cchpkschemaname: Short, szpktablename: ConstPtr<UByte>, cchpktablename: Short, szfkcatalogname: ConstPtr<UByte>, cchfkcatalogname: Short, szfkschemaname: ConstPtr<UByte>, cchfkschemaname: Short, szfktablename: ConstPtr<UByte>, cchfktablename: Short): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLForeignKeys(hstmt.rawAddress.toString(), szpkcatalogname.rawAddress.toString(), cchpkcatalogname.toInt(), szpkschemaname.rawAddress.toString(), cchpkschemaname.toInt(), szpktablename.rawAddress.toString(), cchpktablename.toInt(), szfkcatalogname.rawAddress.toString(), cchfkcatalogname.toInt(), szfkschemaname.rawAddress.toString(), cchfkschemaname.toInt(), szfktablename.rawAddress.toString(), cchfktablename.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLForeignKeysA(hstmt: MutPtr<CVoid>, szpkcatalogname: ConstPtr<UByte>, cbpkcatalogname: Short, szpkschemaname: ConstPtr<UByte>, cbpkschemaname: Short, szpktablename: ConstPtr<UByte>, cbpktablename: Short, szfkcatalogname: ConstPtr<UByte>, cbfkcatalogname: Short, szfkschemaname: ConstPtr<UByte>, cbfkschemaname: Short, szfktablename: ConstPtr<UByte>, cbfktablename: Short): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLForeignKeysA(hstmt.rawAddress.toString(), szpkcatalogname.rawAddress.toString(), cbpkcatalogname.toInt(), szpkschemaname.rawAddress.toString(), cbpkschemaname.toInt(), szpktablename.rawAddress.toString(), cbpktablename.toInt(), szfkcatalogname.rawAddress.toString(), cbfkcatalogname.toInt(), szfkschemaname.rawAddress.toString(), cbfkschemaname.toInt(), szfktablename.rawAddress.toString(), cbfktablename.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLForeignKeysW(hstmt: MutPtr<CVoid>, szpkcatalogname: ConstPtr<UShort>, cchpkcatalogname: Short, szpkschemaname: ConstPtr<UShort>, cchpkschemaname: Short, szpktablename: ConstPtr<UShort>, cchpktablename: Short, szfkcatalogname: ConstPtr<UShort>, cchfkcatalogname: Short, szfkschemaname: ConstPtr<UShort>, cchfkschemaname: Short, szfktablename: ConstPtr<UShort>, cchfktablename: Short): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLForeignKeysW(hstmt.rawAddress.toString(), szpkcatalogname.rawAddress.toString(), cchpkcatalogname.toInt(), szpkschemaname.rawAddress.toString(), cchpkschemaname.toInt(), szpktablename.rawAddress.toString(), cchpktablename.toInt(), szfkcatalogname.rawAddress.toString(), cchfkcatalogname.toInt(), szfkschemaname.rawAddress.toString(), cchfkschemaname.toInt(), szfktablename.rawAddress.toString(), cchfktablename.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLFreeConnect(connectionhandle: MutPtr<CVoid>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLFreeConnect(connectionhandle.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLFreeEnv(environmenthandle: MutPtr<CVoid>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLFreeEnv(environmenthandle.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLFreeHandle(handletype: Short, handle: MutPtr<CVoid>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLFreeHandle(handletype.toInt(), handle.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLFreeStmt(statementhandle: MutPtr<CVoid>, option: UShort): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLFreeStmt(statementhandle.rawAddress.toString(), option.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetConnectAttr(connectionhandle: MutPtr<CVoid>, attribute: Int, value: MutPtr<CVoid>, bufferlength: Int, stringlengthptr: MutPtr<Int>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLGetConnectAttr(connectionhandle.rawAddress.toString(), attribute, value.rawAddress.toString(), bufferlength, stringlengthptr.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetConnectAttrA(hdbc: MutPtr<CVoid>, fattribute: Int, rgbvalue: MutPtr<CVoid>, cbvaluemax: Int, pcbvalue: MutPtr<Int>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLGetConnectAttrA(hdbc.rawAddress.toString(), fattribute, rgbvalue.rawAddress.toString(), cbvaluemax, pcbvalue.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetConnectAttrW(hdbc: MutPtr<CVoid>, fattribute: Int, rgbvalue: MutPtr<CVoid>, cbvaluemax: Int, pcbvalue: MutPtr<Int>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLGetConnectAttrW(hdbc.rawAddress.toString(), fattribute, rgbvalue.rawAddress.toString(), cbvaluemax, pcbvalue.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetConnectOption(connectionhandle: MutPtr<CVoid>, option: UShort, value: MutPtr<CVoid>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLGetConnectOption(connectionhandle.rawAddress.toString(), option.toInt(), value.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetConnectOptionA(hdbc: MutPtr<CVoid>, foption: UShort, pvparam: MutPtr<CVoid>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLGetConnectOptionA(hdbc.rawAddress.toString(), foption.toInt(), pvparam.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetConnectOptionW(hdbc: MutPtr<CVoid>, foption: UShort, pvparam: MutPtr<CVoid>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLGetConnectOptionW(hdbc.rawAddress.toString(), foption.toInt(), pvparam.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetCursorName(statementhandle: MutPtr<CVoid>, cursorname: MutPtr<UByte>, bufferlength: Short, namelengthptr: MutPtr<Short>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLGetCursorName(statementhandle.rawAddress.toString(), cursorname.rawAddress.toString(), bufferlength.toInt(), namelengthptr.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetCursorNameA(hstmt: MutPtr<CVoid>, szcursor: MutPtr<UByte>, cbcursormax: Short, pcbcursor: MutPtr<Short>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLGetCursorNameA(hstmt.rawAddress.toString(), szcursor.rawAddress.toString(), cbcursormax.toInt(), pcbcursor.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetCursorNameW(hstmt: MutPtr<CVoid>, szcursor: MutPtr<UShort>, cchcursormax: Short, pcchcursor: MutPtr<Short>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLGetCursorNameW(hstmt.rawAddress.toString(), szcursor.rawAddress.toString(), cchcursormax.toInt(), pcchcursor.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetData(statementhandle: MutPtr<CVoid>, columnnumber: UShort, targettype: Short, targetvalue: MutPtr<CVoid>, bufferlength: Long, strlenOrIndptr: MutPtr<Long>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLGetData(statementhandle.rawAddress.toString(), columnnumber.toInt(), targettype.toInt(), targetvalue.rawAddress.toString(), bufferlength.toString(), strlenOrIndptr.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetDescField(descriptorhandle: MutPtr<CVoid>, recnumber: Short, fieldidentifier: Short, value: MutPtr<CVoid>, bufferlength: Int, stringlength: MutPtr<Int>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLGetDescField(descriptorhandle.rawAddress.toString(), recnumber.toInt(), fieldidentifier.toInt(), value.rawAddress.toString(), bufferlength, stringlength.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetDescFieldA(hdesc: MutPtr<CVoid>, irecord: Short, ifield: Short, rgbvalue: MutPtr<CVoid>, cbbufferlength: Int, stringlength: MutPtr<Int>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLGetDescFieldA(hdesc.rawAddress.toString(), irecord.toInt(), ifield.toInt(), rgbvalue.rawAddress.toString(), cbbufferlength, stringlength.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetDescFieldW(hdesc: MutPtr<CVoid>, irecord: Short, ifield: Short, rgbvalue: MutPtr<CVoid>, cbbufferlength: Int, stringlength: MutPtr<Int>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLGetDescFieldW(hdesc.rawAddress.toString(), irecord.toInt(), ifield.toInt(), rgbvalue.rawAddress.toString(), cbbufferlength, stringlength.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetDescRec(descriptorhandle: MutPtr<CVoid>, recnumber: Short, name: MutPtr<UByte>, bufferlength: Short, stringlengthptr: MutPtr<Short>, typeptr: MutPtr<Short>, subtypeptr: MutPtr<Short>, lengthptr: MutPtr<Long>, precisionptr: MutPtr<Short>, scaleptr: MutPtr<Short>, nullableptr: MutPtr<Short>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLGetDescRec(descriptorhandle.rawAddress.toString(), recnumber.toInt(), name.rawAddress.toString(), bufferlength.toInt(), stringlengthptr.rawAddress.toString(), typeptr.rawAddress.toString(), subtypeptr.rawAddress.toString(), lengthptr.rawAddress.toString(), precisionptr.rawAddress.toString(), scaleptr.rawAddress.toString(), nullableptr.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetDescRecA(hdesc: MutPtr<CVoid>, irecord: Short, szname: MutPtr<UByte>, cbnamemax: Short, pcbname: MutPtr<Short>, pftype: MutPtr<Short>, pfsubtype: MutPtr<Short>, plength: MutPtr<Long>, pprecision: MutPtr<Short>, pscale: MutPtr<Short>, pnullable: MutPtr<Short>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLGetDescRecA(hdesc.rawAddress.toString(), irecord.toInt(), szname.rawAddress.toString(), cbnamemax.toInt(), pcbname.rawAddress.toString(), pftype.rawAddress.toString(), pfsubtype.rawAddress.toString(), plength.rawAddress.toString(), pprecision.rawAddress.toString(), pscale.rawAddress.toString(), pnullable.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetDescRecW(hdesc: MutPtr<CVoid>, irecord: Short, szname: MutPtr<UShort>, cchnamemax: Short, pcchname: MutPtr<Short>, pftype: MutPtr<Short>, pfsubtype: MutPtr<Short>, plength: MutPtr<Long>, pprecision: MutPtr<Short>, pscale: MutPtr<Short>, pnullable: MutPtr<Short>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLGetDescRecW(hdesc.rawAddress.toString(), irecord.toInt(), szname.rawAddress.toString(), cchnamemax.toInt(), pcchname.rawAddress.toString(), pftype.rawAddress.toString(), pfsubtype.rawAddress.toString(), plength.rawAddress.toString(), pprecision.rawAddress.toString(), pscale.rawAddress.toString(), pnullable.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetDiagField(handletype: Short, handle: MutPtr<CVoid>, recnumber: Short, diagidentifier: Short, diaginfo: MutPtr<CVoid>, bufferlength: Short, stringlength: MutPtr<Short>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLGetDiagField(handletype.toInt(), handle.rawAddress.toString(), recnumber.toInt(), diagidentifier.toInt(), diaginfo.rawAddress.toString(), bufferlength.toInt(), stringlength.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetDiagFieldA(fhandletype: Short, handle: MutPtr<CVoid>, irecord: Short, fdiagfield: Short, rgbdiaginfo: MutPtr<CVoid>, cbdiaginfomax: Short, pcbdiaginfo: MutPtr<Short>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLGetDiagFieldA(fhandletype.toInt(), handle.rawAddress.toString(), irecord.toInt(), fdiagfield.toInt(), rgbdiaginfo.rawAddress.toString(), cbdiaginfomax.toInt(), pcbdiaginfo.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetDiagFieldW(fhandletype: Short, handle: MutPtr<CVoid>, irecord: Short, fdiagfield: Short, rgbdiaginfo: MutPtr<CVoid>, cbbufferlength: Short, pcbstringlength: MutPtr<Short>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLGetDiagFieldW(fhandletype.toInt(), handle.rawAddress.toString(), irecord.toInt(), fdiagfield.toInt(), rgbdiaginfo.rawAddress.toString(), cbbufferlength.toInt(), pcbstringlength.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetDiagRec(handletype: Short, handle: MutPtr<CVoid>, recnumber: Short, sqlstate: MutPtr<UByte>, nativeerror: MutPtr<Int>, messagetext: MutPtr<UByte>, bufferlength: Short, textlength: MutPtr<Short>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLGetDiagRec(handletype.toInt(), handle.rawAddress.toString(), recnumber.toInt(), sqlstate.rawAddress.toString(), nativeerror.rawAddress.toString(), messagetext.rawAddress.toString(), bufferlength.toInt(), textlength.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetDiagRecA(fhandletype: Short, handle: MutPtr<CVoid>, irecord: Short, szsqlstate: MutPtr<UByte>, pfnativeerror: MutPtr<Int>, szerrormsg: MutPtr<UByte>, cberrormsgmax: Short, pcberrormsg: MutPtr<Short>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLGetDiagRecA(fhandletype.toInt(), handle.rawAddress.toString(), irecord.toInt(), szsqlstate.rawAddress.toString(), pfnativeerror.rawAddress.toString(), szerrormsg.rawAddress.toString(), cberrormsgmax.toInt(), pcberrormsg.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetDiagRecW(fhandletype: Short, handle: MutPtr<CVoid>, irecord: Short, szsqlstate: MutPtr<UShort>, pfnativeerror: MutPtr<Int>, szerrormsg: MutPtr<UShort>, ccherrormsgmax: Short, pccherrormsg: MutPtr<Short>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLGetDiagRecW(fhandletype.toInt(), handle.rawAddress.toString(), irecord.toInt(), szsqlstate.rawAddress.toString(), pfnativeerror.rawAddress.toString(), szerrormsg.rawAddress.toString(), ccherrormsgmax.toInt(), pccherrormsg.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetEnvAttr(environmenthandle: MutPtr<CVoid>, attribute: Int, value: MutPtr<CVoid>, bufferlength: Int, stringlength: MutPtr<Int>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLGetEnvAttr(environmenthandle.rawAddress.toString(), attribute, value.rawAddress.toString(), bufferlength, stringlength.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetFunctions(connectionhandle: MutPtr<CVoid>, functionid: UShort, supported: MutPtr<UShort>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLGetFunctions(connectionhandle.rawAddress.toString(), functionid.toInt(), supported.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetInfo(connectionhandle: MutPtr<CVoid>, infotype: UShort, infovalue: MutPtr<CVoid>, bufferlength: Short, stringlengthptr: MutPtr<Short>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLGetInfo(connectionhandle.rawAddress.toString(), infotype.toInt(), infovalue.rawAddress.toString(), bufferlength.toInt(), stringlengthptr.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetInfoA(hdbc: MutPtr<CVoid>, finfotype: UShort, rgbinfovalue: MutPtr<CVoid>, cbinfovaluemax: Short, pcbinfovalue: MutPtr<Short>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLGetInfoA(hdbc.rawAddress.toString(), finfotype.toInt(), rgbinfovalue.rawAddress.toString(), cbinfovaluemax.toInt(), pcbinfovalue.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetInfoW(hdbc: MutPtr<CVoid>, finfotype: UShort, rgbinfovalue: MutPtr<CVoid>, cbinfovaluemax: Short, pcbinfovalue: MutPtr<Short>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLGetInfoW(hdbc.rawAddress.toString(), finfotype.toInt(), rgbinfovalue.rawAddress.toString(), cbinfovaluemax.toInt(), pcbinfovalue.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetNextEnumeration(henumhandle: Handle, prgenumdata: MutPtr<UByte>, pienumlength: MutPtr<Int>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLGetNextEnumeration(henumhandle.rawAddress.toString(), prgenumdata.rawAddress.toString(), pienumlength.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetStmtAttr(statementhandle: MutPtr<CVoid>, attribute: Int, value: MutPtr<CVoid>, bufferlength: Int, stringlength: MutPtr<Int>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLGetStmtAttr(statementhandle.rawAddress.toString(), attribute, value.rawAddress.toString(), bufferlength, stringlength.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetStmtAttrA(hstmt: MutPtr<CVoid>, fattribute: Int, rgbvalue: MutPtr<CVoid>, cbvaluemax: Int, pcbvalue: MutPtr<Int>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLGetStmtAttrA(hstmt.rawAddress.toString(), fattribute, rgbvalue.rawAddress.toString(), cbvaluemax, pcbvalue.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetStmtAttrW(hstmt: MutPtr<CVoid>, fattribute: Int, rgbvalue: MutPtr<CVoid>, cbvaluemax: Int, pcbvalue: MutPtr<Int>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLGetStmtAttrW(hstmt.rawAddress.toString(), fattribute, rgbvalue.rawAddress.toString(), cbvaluemax, pcbvalue.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetStmtOption(statementhandle: MutPtr<CVoid>, option: UShort, value: MutPtr<CVoid>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLGetStmtOption(statementhandle.rawAddress.toString(), option.toInt(), value.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetTypeInfo(statementhandle: MutPtr<CVoid>, datatype: Short): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLGetTypeInfo(statementhandle.rawAddress.toString(), datatype.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetTypeInfoA(statementhandle: MutPtr<CVoid>, datatype: Short): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLGetTypeInfoA(statementhandle.rawAddress.toString(), datatype.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLGetTypeInfoW(statementhandle: MutPtr<CVoid>, datatype: Short): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLGetTypeInfoW(statementhandle.rawAddress.toString(), datatype.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLInitEnumServers(pwchservername: Pcwstr, pwchinstancename: Pcwstr): Handle =
    if (windowsWin32SystemSearchNapiAddon != null) MutPtr((windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLInitEnumServers(pwchservername.rawAddress.toString(), pwchinstancename.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLLinkedCatalogsA(param0: MutPtr<CVoid>, param1: Pcstr, param2: Short): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLLinkedCatalogsA(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLLinkedCatalogsW(param0: MutPtr<CVoid>, param1: Pcwstr, param2: Short): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLLinkedCatalogsW(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLLinkedServers(param0: MutPtr<CVoid>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLLinkedServers(param0.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLMoreResults(hstmt: MutPtr<CVoid>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLMoreResults(hstmt.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLNativeSql(hdbc: MutPtr<CVoid>, szsqlstrin: ConstPtr<UByte>, cchsqlstrin: Int, szsqlstr: MutPtr<UByte>, cchsqlstrmax: Int, pcbsqlstr: MutPtr<Int>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLNativeSql(hdbc.rawAddress.toString(), szsqlstrin.rawAddress.toString(), cchsqlstrin, szsqlstr.rawAddress.toString(), cchsqlstrmax, pcbsqlstr.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLNativeSqlA(hdbc: MutPtr<CVoid>, szsqlstrin: ConstPtr<UByte>, cbsqlstrin: Int, szsqlstr: MutPtr<UByte>, cbsqlstrmax: Int, pcbsqlstr: MutPtr<Int>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLNativeSqlA(hdbc.rawAddress.toString(), szsqlstrin.rawAddress.toString(), cbsqlstrin, szsqlstr.rawAddress.toString(), cbsqlstrmax, pcbsqlstr.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLNativeSqlW(hdbc: MutPtr<CVoid>, szsqlstrin: ConstPtr<UShort>, cchsqlstrin: Int, szsqlstr: MutPtr<UShort>, cchsqlstrmax: Int, pcchsqlstr: MutPtr<Int>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLNativeSqlW(hdbc.rawAddress.toString(), szsqlstrin.rawAddress.toString(), cchsqlstrin, szsqlstr.rawAddress.toString(), cchsqlstrmax, pcchsqlstr.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLNumParams(hstmt: MutPtr<CVoid>, pcpar: MutPtr<Short>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLNumParams(hstmt.rawAddress.toString(), pcpar.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLNumResultCols(statementhandle: MutPtr<CVoid>, columncount: MutPtr<Short>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLNumResultCols(statementhandle.rawAddress.toString(), columncount.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLParamData(statementhandle: MutPtr<CVoid>, value: MutPtr<MutPtr<CVoid>>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLParamData(statementhandle.rawAddress.toString(), value.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLParamOptions(hstmt: MutPtr<CVoid>, crow: ULong, pirow: MutPtr<ULong>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLParamOptions(hstmt.rawAddress.toString(), crow.toString(), pirow.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLPrepare(statementhandle: MutPtr<CVoid>, statementtext: ConstPtr<UByte>, textlength: Int): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLPrepare(statementhandle.rawAddress.toString(), statementtext.rawAddress.toString(), textlength) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLPrepareA(hstmt: MutPtr<CVoid>, szsqlstr: ConstPtr<UByte>, cbsqlstr: Int): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLPrepareA(hstmt.rawAddress.toString(), szsqlstr.rawAddress.toString(), cbsqlstr) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLPrepareW(hstmt: MutPtr<CVoid>, szsqlstr: ConstPtr<UShort>, cchsqlstr: Int): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLPrepareW(hstmt.rawAddress.toString(), szsqlstr.rawAddress.toString(), cchsqlstr) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLPrimaryKeys(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UByte>, cchcatalogname: Short, szschemaname: ConstPtr<UByte>, cchschemaname: Short, sztablename: ConstPtr<UByte>, cchtablename: Short): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLPrimaryKeys(hstmt.rawAddress.toString(), szcatalogname.rawAddress.toString(), cchcatalogname.toInt(), szschemaname.rawAddress.toString(), cchschemaname.toInt(), sztablename.rawAddress.toString(), cchtablename.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLPrimaryKeysA(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UByte>, cbcatalogname: Short, szschemaname: ConstPtr<UByte>, cbschemaname: Short, sztablename: ConstPtr<UByte>, cbtablename: Short): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLPrimaryKeysA(hstmt.rawAddress.toString(), szcatalogname.rawAddress.toString(), cbcatalogname.toInt(), szschemaname.rawAddress.toString(), cbschemaname.toInt(), sztablename.rawAddress.toString(), cbtablename.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLPrimaryKeysW(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UShort>, cchcatalogname: Short, szschemaname: ConstPtr<UShort>, cchschemaname: Short, sztablename: ConstPtr<UShort>, cchtablename: Short): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLPrimaryKeysW(hstmt.rawAddress.toString(), szcatalogname.rawAddress.toString(), cchcatalogname.toInt(), szschemaname.rawAddress.toString(), cchschemaname.toInt(), sztablename.rawAddress.toString(), cchtablename.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLProcedureColumns(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UByte>, cchcatalogname: Short, szschemaname: ConstPtr<UByte>, cchschemaname: Short, szprocname: ConstPtr<UByte>, cchprocname: Short, szcolumnname: ConstPtr<UByte>, cchcolumnname: Short): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLProcedureColumns(hstmt.rawAddress.toString(), szcatalogname.rawAddress.toString(), cchcatalogname.toInt(), szschemaname.rawAddress.toString(), cchschemaname.toInt(), szprocname.rawAddress.toString(), cchprocname.toInt(), szcolumnname.rawAddress.toString(), cchcolumnname.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLProcedureColumnsA(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UByte>, cbcatalogname: Short, szschemaname: ConstPtr<UByte>, cbschemaname: Short, szprocname: ConstPtr<UByte>, cbprocname: Short, szcolumnname: ConstPtr<UByte>, cbcolumnname: Short): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLProcedureColumnsA(hstmt.rawAddress.toString(), szcatalogname.rawAddress.toString(), cbcatalogname.toInt(), szschemaname.rawAddress.toString(), cbschemaname.toInt(), szprocname.rawAddress.toString(), cbprocname.toInt(), szcolumnname.rawAddress.toString(), cbcolumnname.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLProcedureColumnsW(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UShort>, cchcatalogname: Short, szschemaname: ConstPtr<UShort>, cchschemaname: Short, szprocname: ConstPtr<UShort>, cchprocname: Short, szcolumnname: ConstPtr<UShort>, cchcolumnname: Short): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLProcedureColumnsW(hstmt.rawAddress.toString(), szcatalogname.rawAddress.toString(), cchcatalogname.toInt(), szschemaname.rawAddress.toString(), cchschemaname.toInt(), szprocname.rawAddress.toString(), cchprocname.toInt(), szcolumnname.rawAddress.toString(), cchcolumnname.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLProcedures(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UByte>, cchcatalogname: Short, szschemaname: ConstPtr<UByte>, cchschemaname: Short, szprocname: ConstPtr<UByte>, cchprocname: Short): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLProcedures(hstmt.rawAddress.toString(), szcatalogname.rawAddress.toString(), cchcatalogname.toInt(), szschemaname.rawAddress.toString(), cchschemaname.toInt(), szprocname.rawAddress.toString(), cchprocname.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLProceduresA(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UByte>, cbcatalogname: Short, szschemaname: ConstPtr<UByte>, cbschemaname: Short, szprocname: ConstPtr<UByte>, cbprocname: Short): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLProceduresA(hstmt.rawAddress.toString(), szcatalogname.rawAddress.toString(), cbcatalogname.toInt(), szschemaname.rawAddress.toString(), cbschemaname.toInt(), szprocname.rawAddress.toString(), cbprocname.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLProceduresW(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UShort>, cchcatalogname: Short, szschemaname: ConstPtr<UShort>, cchschemaname: Short, szprocname: ConstPtr<UShort>, cchprocname: Short): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLProceduresW(hstmt.rawAddress.toString(), szcatalogname.rawAddress.toString(), cchcatalogname.toInt(), szschemaname.rawAddress.toString(), cchschemaname.toInt(), szprocname.rawAddress.toString(), cchprocname.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLPutData(statementhandle: MutPtr<CVoid>, data: ConstPtr<CVoid>, strlenOrInd: Long): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLPutData(statementhandle.rawAddress.toString(), data.rawAddress.toString(), strlenOrInd.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLRowCount(statementhandle: ConstPtr<CVoid>, rowcount: MutPtr<Long>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLRowCount(statementhandle.rawAddress.toString(), rowcount.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLSetConnectAttr(connectionhandle: MutPtr<CVoid>, attribute: Int, value: ConstPtr<CVoid>, stringlength: Int): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLSetConnectAttr(connectionhandle.rawAddress.toString(), attribute, value.rawAddress.toString(), stringlength) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLSetConnectAttrA(hdbc: MutPtr<CVoid>, fattribute: Int, rgbvalue: ConstPtr<CVoid>, cbvalue: Int): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLSetConnectAttrA(hdbc.rawAddress.toString(), fattribute, rgbvalue.rawAddress.toString(), cbvalue) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLSetConnectAttrW(hdbc: MutPtr<CVoid>, fattribute: Int, rgbvalue: ConstPtr<CVoid>, cbvalue: Int): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLSetConnectAttrW(hdbc.rawAddress.toString(), fattribute, rgbvalue.rawAddress.toString(), cbvalue) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLSetConnectOption(connectionhandle: MutPtr<CVoid>, option: UShort, value: ULong): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLSetConnectOption(connectionhandle.rawAddress.toString(), option.toInt(), value.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLSetConnectOptionA(hdbc: MutPtr<CVoid>, foption: UShort, vparam: ULong): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLSetConnectOptionA(hdbc.rawAddress.toString(), foption.toInt(), vparam.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLSetConnectOptionW(hdbc: MutPtr<CVoid>, foption: UShort, vparam: ULong): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLSetConnectOptionW(hdbc.rawAddress.toString(), foption.toInt(), vparam.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLSetCursorName(statementhandle: MutPtr<CVoid>, cursorname: ConstPtr<UByte>, namelength: Short): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLSetCursorName(statementhandle.rawAddress.toString(), cursorname.rawAddress.toString(), namelength.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLSetCursorNameA(hstmt: MutPtr<CVoid>, szcursor: ConstPtr<UByte>, cbcursor: Short): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLSetCursorNameA(hstmt.rawAddress.toString(), szcursor.rawAddress.toString(), cbcursor.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLSetCursorNameW(hstmt: MutPtr<CVoid>, szcursor: ConstPtr<UShort>, cchcursor: Short): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLSetCursorNameW(hstmt.rawAddress.toString(), szcursor.rawAddress.toString(), cchcursor.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLSetDescField(descriptorhandle: MutPtr<CVoid>, recnumber: Short, fieldidentifier: Short, value: ConstPtr<CVoid>, bufferlength: Int): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLSetDescField(descriptorhandle.rawAddress.toString(), recnumber.toInt(), fieldidentifier.toInt(), value.rawAddress.toString(), bufferlength) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLSetDescFieldW(descriptorhandle: MutPtr<CVoid>, recnumber: Short, fieldidentifier: Short, value: MutPtr<CVoid>, bufferlength: Int): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLSetDescFieldW(descriptorhandle.rawAddress.toString(), recnumber.toInt(), fieldidentifier.toInt(), value.rawAddress.toString(), bufferlength) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLSetDescRec(descriptorhandle: MutPtr<CVoid>, recnumber: Short, type: Short, subtype: Short, length: Long, precision: Short, scale: Short, data: MutPtr<CVoid>, stringlength: MutPtr<Long>, indicator: MutPtr<Long>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLSetDescRec(descriptorhandle.rawAddress.toString(), recnumber.toInt(), type.toInt(), subtype.toInt(), length.toString(), precision.toInt(), scale.toInt(), data.rawAddress.toString(), stringlength.rawAddress.toString(), indicator.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLSetEnvAttr(environmenthandle: MutPtr<CVoid>, attribute: Int, value: ConstPtr<CVoid>, stringlength: Int): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLSetEnvAttr(environmenthandle.rawAddress.toString(), attribute, value.rawAddress.toString(), stringlength) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLSetParam(statementhandle: MutPtr<CVoid>, parameternumber: UShort, valuetype: Short, parametertype: Short, lengthprecision: ULong, parameterscale: Short, parametervalue: ConstPtr<CVoid>, strlenOrInd: MutPtr<Long>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLSetParam(statementhandle.rawAddress.toString(), parameternumber.toInt(), valuetype.toInt(), parametertype.toInt(), lengthprecision.toString(), parameterscale.toInt(), parametervalue.rawAddress.toString(), strlenOrInd.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLSetPos(hstmt: MutPtr<CVoid>, irow: ULong, foption: UShort, flock: UShort): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLSetPos(hstmt.rawAddress.toString(), irow.toString(), foption.toInt(), flock.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLSetScrollOptions(hstmt: MutPtr<CVoid>, fconcurrency: UShort, crowkeyset: Long, crowrowset: UShort): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLSetScrollOptions(hstmt.rawAddress.toString(), fconcurrency.toInt(), crowkeyset.toString(), crowrowset.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLSetStmtAttr(statementhandle: MutPtr<CVoid>, attribute: Int, value: ConstPtr<CVoid>, stringlength: Int): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLSetStmtAttr(statementhandle.rawAddress.toString(), attribute, value.rawAddress.toString(), stringlength) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLSetStmtAttrW(hstmt: MutPtr<CVoid>, fattribute: Int, rgbvalue: MutPtr<CVoid>, cbvaluemax: Int): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLSetStmtAttrW(hstmt.rawAddress.toString(), fattribute, rgbvalue.rawAddress.toString(), cbvaluemax) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLSetStmtOption(statementhandle: MutPtr<CVoid>, option: UShort, value: ULong): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLSetStmtOption(statementhandle.rawAddress.toString(), option.toInt(), value.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLSpecialColumns(statementhandle: MutPtr<CVoid>, identifiertype: UShort, catalogname: ConstPtr<UByte>, namelength1: Short, schemaname: ConstPtr<UByte>, namelength2: Short, tablename: ConstPtr<UByte>, namelength3: Short, scope: UShort, nullable: UShort): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLSpecialColumns(statementhandle.rawAddress.toString(), identifiertype.toInt(), catalogname.rawAddress.toString(), namelength1.toInt(), schemaname.rawAddress.toString(), namelength2.toInt(), tablename.rawAddress.toString(), namelength3.toInt(), scope.toInt(), nullable.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLSpecialColumnsA(hstmt: MutPtr<CVoid>, fcoltype: UShort, szcatalogname: ConstPtr<UByte>, cbcatalogname: Short, szschemaname: ConstPtr<UByte>, cbschemaname: Short, sztablename: ConstPtr<UByte>, cbtablename: Short, fscope: UShort, fnullable: UShort): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLSpecialColumnsA(hstmt.rawAddress.toString(), fcoltype.toInt(), szcatalogname.rawAddress.toString(), cbcatalogname.toInt(), szschemaname.rawAddress.toString(), cbschemaname.toInt(), sztablename.rawAddress.toString(), cbtablename.toInt(), fscope.toInt(), fnullable.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLSpecialColumnsW(hstmt: MutPtr<CVoid>, fcoltype: UShort, szcatalogname: ConstPtr<UShort>, cchcatalogname: Short, szschemaname: ConstPtr<UShort>, cchschemaname: Short, sztablename: ConstPtr<UShort>, cchtablename: Short, fscope: UShort, fnullable: UShort): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLSpecialColumnsW(hstmt.rawAddress.toString(), fcoltype.toInt(), szcatalogname.rawAddress.toString(), cchcatalogname.toInt(), szschemaname.rawAddress.toString(), cchschemaname.toInt(), sztablename.rawAddress.toString(), cchtablename.toInt(), fscope.toInt(), fnullable.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLStatistics(statementhandle: MutPtr<CVoid>, catalogname: ConstPtr<UByte>, namelength1: Short, schemaname: ConstPtr<UByte>, namelength2: Short, tablename: ConstPtr<UByte>, namelength3: Short, unique: UShort, reserved: UShort): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLStatistics(statementhandle.rawAddress.toString(), catalogname.rawAddress.toString(), namelength1.toInt(), schemaname.rawAddress.toString(), namelength2.toInt(), tablename.rawAddress.toString(), namelength3.toInt(), unique.toInt(), reserved.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLStatisticsA(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UByte>, cbcatalogname: Short, szschemaname: ConstPtr<UByte>, cbschemaname: Short, sztablename: ConstPtr<UByte>, cbtablename: Short, funique: UShort, faccuracy: UShort): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLStatisticsA(hstmt.rawAddress.toString(), szcatalogname.rawAddress.toString(), cbcatalogname.toInt(), szschemaname.rawAddress.toString(), cbschemaname.toInt(), sztablename.rawAddress.toString(), cbtablename.toInt(), funique.toInt(), faccuracy.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLStatisticsW(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UShort>, cchcatalogname: Short, szschemaname: ConstPtr<UShort>, cchschemaname: Short, sztablename: ConstPtr<UShort>, cchtablename: Short, funique: UShort, faccuracy: UShort): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLStatisticsW(hstmt.rawAddress.toString(), szcatalogname.rawAddress.toString(), cchcatalogname.toInt(), szschemaname.rawAddress.toString(), cchschemaname.toInt(), sztablename.rawAddress.toString(), cchtablename.toInt(), funique.toInt(), faccuracy.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLTablePrivileges(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UByte>, cchcatalogname: Short, szschemaname: ConstPtr<UByte>, cchschemaname: Short, sztablename: ConstPtr<UByte>, cchtablename: Short): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLTablePrivileges(hstmt.rawAddress.toString(), szcatalogname.rawAddress.toString(), cchcatalogname.toInt(), szschemaname.rawAddress.toString(), cchschemaname.toInt(), sztablename.rawAddress.toString(), cchtablename.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLTablePrivilegesA(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UByte>, cbcatalogname: Short, szschemaname: ConstPtr<UByte>, cbschemaname: Short, sztablename: ConstPtr<UByte>, cbtablename: Short): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLTablePrivilegesA(hstmt.rawAddress.toString(), szcatalogname.rawAddress.toString(), cbcatalogname.toInt(), szschemaname.rawAddress.toString(), cbschemaname.toInt(), sztablename.rawAddress.toString(), cbtablename.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLTablePrivilegesW(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UShort>, cchcatalogname: Short, szschemaname: ConstPtr<UShort>, cchschemaname: Short, sztablename: ConstPtr<UShort>, cchtablename: Short): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLTablePrivilegesW(hstmt.rawAddress.toString(), szcatalogname.rawAddress.toString(), cchcatalogname.toInt(), szschemaname.rawAddress.toString(), cchschemaname.toInt(), sztablename.rawAddress.toString(), cchtablename.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLTables(statementhandle: MutPtr<CVoid>, catalogname: ConstPtr<UByte>, namelength1: Short, schemaname: ConstPtr<UByte>, namelength2: Short, tablename: ConstPtr<UByte>, namelength3: Short, tabletype: ConstPtr<UByte>, namelength4: Short): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLTables(statementhandle.rawAddress.toString(), catalogname.rawAddress.toString(), namelength1.toInt(), schemaname.rawAddress.toString(), namelength2.toInt(), tablename.rawAddress.toString(), namelength3.toInt(), tabletype.rawAddress.toString(), namelength4.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLTablesA(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UByte>, cbcatalogname: Short, szschemaname: ConstPtr<UByte>, cbschemaname: Short, sztablename: ConstPtr<UByte>, cbtablename: Short, sztabletype: ConstPtr<UByte>, cbtabletype: Short): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLTablesA(hstmt.rawAddress.toString(), szcatalogname.rawAddress.toString(), cbcatalogname.toInt(), szschemaname.rawAddress.toString(), cbschemaname.toInt(), sztablename.rawAddress.toString(), cbtablename.toInt(), sztabletype.rawAddress.toString(), cbtabletype.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLTablesW(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UShort>, cchcatalogname: Short, szschemaname: ConstPtr<UShort>, cchschemaname: Short, sztablename: ConstPtr<UShort>, cchtablename: Short, sztabletype: ConstPtr<UShort>, cchtabletype: Short): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLTablesW(hstmt.rawAddress.toString(), szcatalogname.rawAddress.toString(), cchcatalogname.toInt(), szschemaname.rawAddress.toString(), cchschemaname.toInt(), sztablename.rawAddress.toString(), cchtablename.toInt(), sztabletype.rawAddress.toString(), cchtabletype.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sQLTransact(environmenthandle: MutPtr<CVoid>, connectionhandle: MutPtr<CVoid>, completiontype: UShort): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchSQLTransact(environmenthandle.rawAddress.toString(), connectionhandle.rawAddress.toString(), completiontype.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bcpBatch(param0: MutPtr<CVoid>): Int =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchBcpBatch(param0.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bcpBind(param0: MutPtr<CVoid>, param1: MutPtr<UByte>, param2: Int, param3: Int, param4: MutPtr<UByte>, param5: Int, param6: Int, param7: Int): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchBcpBind(param0.rawAddress.toString(), param1.rawAddress.toString(), param2, param3, param4.rawAddress.toString(), param5, param6, param7) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bcpColfmt(param0: MutPtr<CVoid>, param1: Int, param2: UByte, param3: Int, param4: Int, param5: MutPtr<UByte>, param6: Int, param7: Int): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchBcpColfmt(param0.rawAddress.toString(), param1, param2.toInt(), param3, param4, param5.rawAddress.toString(), param6, param7) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bcpCollen(param0: MutPtr<CVoid>, param1: Int, param2: Int): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchBcpCollen(param0.rawAddress.toString(), param1, param2) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bcpColptr(param0: MutPtr<CVoid>, param1: MutPtr<UByte>, param2: Int): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchBcpColptr(param0.rawAddress.toString(), param1.rawAddress.toString(), param2) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bcpColumns(param0: MutPtr<CVoid>, param1: Int): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchBcpColumns(param0.rawAddress.toString(), param1) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bcpControl(param0: MutPtr<CVoid>, param1: Int, param2: MutPtr<CVoid>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchBcpControl(param0.rawAddress.toString(), param1, param2.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bcpDone(param0: MutPtr<CVoid>): Int =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchBcpDone(param0.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bcpExec(param0: MutPtr<CVoid>, param1: MutPtr<Int>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchBcpExec(param0.rawAddress.toString(), param1.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bcpGetcolfmt(param0: MutPtr<CVoid>, param1: Int, param2: Int, param3: MutPtr<CVoid>, param4: Int, param5: MutPtr<Int>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchBcpGetcolfmt(param0.rawAddress.toString(), param1, param2, param3.rawAddress.toString(), param4, param5.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bcpInitA(param0: MutPtr<CVoid>, param1: Pcstr, param2: Pcstr, param3: Pcstr, param4: Int): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchBcpInitA(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString(), param3.rawAddress.toString(), param4) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bcpInitW(param0: MutPtr<CVoid>, param1: Pcwstr, param2: Pcwstr, param3: Pcwstr, param4: Int): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchBcpInitW(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString(), param3.rawAddress.toString(), param4) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bcpMoretext(param0: MutPtr<CVoid>, param1: Int, param2: MutPtr<UByte>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchBcpMoretext(param0.rawAddress.toString(), param1, param2.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bcpReadfmtA(param0: MutPtr<CVoid>, param1: Pcstr): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchBcpReadfmtA(param0.rawAddress.toString(), param1.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bcpReadfmtW(param0: MutPtr<CVoid>, param1: Pcwstr): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchBcpReadfmtW(param0.rawAddress.toString(), param1.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bcpSendrow(param0: MutPtr<CVoid>): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchBcpSendrow(param0.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bcpSetcolfmt(param0: MutPtr<CVoid>, param1: Int, param2: Int, param3: MutPtr<CVoid>, param4: Int): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchBcpSetcolfmt(param0.rawAddress.toString(), param1, param2, param3.rawAddress.toString(), param4) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bcpWritefmtA(param0: MutPtr<CVoid>, param1: Pcstr): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchBcpWritefmtA(param0.rawAddress.toString(), param1.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bcpWritefmtW(param0: MutPtr<CVoid>, param1: Pcwstr): Short =
    if (windowsWin32SystemSearchNapiAddon != null) (windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchBcpWritefmtW(param0.rawAddress.toString(), param1.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dbprtypeA(param0: Int): Pstr =
    if (windowsWin32SystemSearchNapiAddon != null) MutPtr((windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchDbprtypeA(param0) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dbprtypeW(param0: Int): Pwstr =
    if (windowsWin32SystemSearchNapiAddon != null) MutPtr((windowsWin32SystemSearchNapiAddon.windowssysWindowsWin32SystemSearchDbprtypeW(param0) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")
