@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.search

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public actual fun oDBCGetTryWaitValue(): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun oDBCSetTryWaitValue(dwvalue: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLAllocConnect(environmenthandle: COpaquePointer?, connectionhandle: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLAllocEnv(environmenthandle: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLAllocHandle(handletype: Short, inputhandle: COpaquePointer?, outputhandle: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLAllocHandleStd(fhandletype: Short, hinput: COpaquePointer?, phoutput: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLAllocStmt(connectionhandle: COpaquePointer?, statementhandle: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLBindCol(statementhandle: COpaquePointer?, columnnumber: UShort, targettype: Short, targetvalue: COpaquePointer?, bufferlength: Long, strlenOrInd: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLBindParam(statementhandle: COpaquePointer?, parameternumber: UShort, valuetype: Short, parametertype: Short, lengthprecision: ULong, parameterscale: Short, parametervalue: COpaquePointer?, strlenOrInd: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLBindParameter(hstmt: COpaquePointer?, ipar: UShort, fparamtype: Short, fctype: Short, fsqltype: Short, cbcoldef: ULong, ibscale: Short, rgbvalue: COpaquePointer?, cbvaluemax: Long, pcbvalue: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLBrowseConnect(hdbc: COpaquePointer?, szconnstrin: COpaquePointer?, cchconnstrin: Short, szconnstrout: COpaquePointer?, cchconnstroutmax: Short, pcchconnstrout: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLBrowseConnectA(hdbc: COpaquePointer?, szconnstrin: COpaquePointer?, cbconnstrin: Short, szconnstrout: COpaquePointer?, cbconnstroutmax: Short, pcbconnstrout: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLBrowseConnectW(hdbc: COpaquePointer?, szconnstrin: COpaquePointer?, cchconnstrin: Short, szconnstrout: COpaquePointer?, cchconnstroutmax: Short, pcchconnstrout: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLBulkOperations(statementhandle: COpaquePointer?, operation: Short): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLCancel(statementhandle: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLCancelHandle(handletype: Short, inputhandle: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLCloseCursor(statementhandle: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLCloseEnumServers(henumhandle: Handle): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLColAttribute(statementhandle: COpaquePointer?, columnnumber: UShort, fieldidentifier: UShort, characterattribute: COpaquePointer?, bufferlength: Short, stringlength: COpaquePointer?, numericattribute: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLColAttributeA(hstmt: COpaquePointer?, icol: Short, ifield: Short, pcharattr: COpaquePointer?, cbcharattrmax: Short, pcbcharattr: COpaquePointer?, pnumattr: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLColAttributeW(hstmt: COpaquePointer?, icol: UShort, ifield: UShort, pcharattr: COpaquePointer?, cbdescmax: Short, pcbcharattr: COpaquePointer?, pnumattr: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLColAttributes(hstmt: COpaquePointer?, icol: UShort, fdesctype: UShort, rgbdesc: COpaquePointer?, cbdescmax: Short, pcbdesc: COpaquePointer?, pfdesc: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLColAttributesA(hstmt: COpaquePointer?, icol: UShort, fdesctype: UShort, rgbdesc: COpaquePointer?, cbdescmax: Short, pcbdesc: COpaquePointer?, pfdesc: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLColAttributesW(hstmt: COpaquePointer?, icol: UShort, fdesctype: UShort, rgbdesc: COpaquePointer?, cbdescmax: Short, pcbdesc: COpaquePointer?, pfdesc: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLColumnPrivileges(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cchcatalogname: Short, szschemaname: COpaquePointer?, cchschemaname: Short, sztablename: COpaquePointer?, cchtablename: Short, szcolumnname: COpaquePointer?, cchcolumnname: Short): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLColumnPrivilegesA(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cbcatalogname: Short, szschemaname: COpaquePointer?, cbschemaname: Short, sztablename: COpaquePointer?, cbtablename: Short, szcolumnname: COpaquePointer?, cbcolumnname: Short): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLColumnPrivilegesW(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cchcatalogname: Short, szschemaname: COpaquePointer?, cchschemaname: Short, sztablename: COpaquePointer?, cchtablename: Short, szcolumnname: COpaquePointer?, cchcolumnname: Short): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLColumns(statementhandle: COpaquePointer?, catalogname: COpaquePointer?, namelength1: Short, schemaname: COpaquePointer?, namelength2: Short, tablename: COpaquePointer?, namelength3: Short, columnname: COpaquePointer?, namelength4: Short): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLColumnsA(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cbcatalogname: Short, szschemaname: COpaquePointer?, cbschemaname: Short, sztablename: COpaquePointer?, cbtablename: Short, szcolumnname: COpaquePointer?, cbcolumnname: Short): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLColumnsW(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cchcatalogname: Short, szschemaname: COpaquePointer?, cchschemaname: Short, sztablename: COpaquePointer?, cchtablename: Short, szcolumnname: COpaquePointer?, cchcolumnname: Short): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLCompleteAsync(handletype: Short, handle: COpaquePointer?, asyncretcodeptr: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLConnect(connectionhandle: COpaquePointer?, servername: COpaquePointer?, namelength1: Short, username: COpaquePointer?, namelength2: Short, authentication: COpaquePointer?, namelength3: Short): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLConnectA(hdbc: COpaquePointer?, szdsn: COpaquePointer?, cbdsn: Short, szuid: COpaquePointer?, cbuid: Short, szauthstr: COpaquePointer?, cbauthstr: Short): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLConnectW(hdbc: COpaquePointer?, szdsn: COpaquePointer?, cchdsn: Short, szuid: COpaquePointer?, cchuid: Short, szauthstr: COpaquePointer?, cchauthstr: Short): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLCopyDesc(sourcedeschandle: COpaquePointer?, targetdeschandle: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLDataSources(environmenthandle: COpaquePointer?, direction: UShort, servername: COpaquePointer?, bufferlength1: Short, namelength1ptr: COpaquePointer?, description: COpaquePointer?, bufferlength2: Short, namelength2ptr: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLDataSourcesA(henv: COpaquePointer?, fdirection: UShort, szdsn: COpaquePointer?, cbdsnmax: Short, pcbdsn: COpaquePointer?, szdescription: COpaquePointer?, cbdescriptionmax: Short, pcbdescription: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLDataSourcesW(henv: COpaquePointer?, fdirection: UShort, szdsn: COpaquePointer?, cchdsnmax: Short, pcchdsn: COpaquePointer?, wszdescription: COpaquePointer?, cchdescriptionmax: Short, pcchdescription: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLDescribeCol(statementhandle: COpaquePointer?, columnnumber: UShort, columnname: COpaquePointer?, bufferlength: Short, namelength: COpaquePointer?, datatype: COpaquePointer?, columnsize: COpaquePointer?, decimaldigits: COpaquePointer?, nullable: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLDescribeColA(hstmt: COpaquePointer?, icol: UShort, szcolname: COpaquePointer?, cbcolnamemax: Short, pcbcolname: COpaquePointer?, pfsqltype: COpaquePointer?, pcbcoldef: COpaquePointer?, pibscale: COpaquePointer?, pfnullable: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLDescribeColW(hstmt: COpaquePointer?, icol: UShort, szcolname: COpaquePointer?, cchcolnamemax: Short, pcchcolname: COpaquePointer?, pfsqltype: COpaquePointer?, pcbcoldef: COpaquePointer?, pibscale: COpaquePointer?, pfnullable: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLDescribeParam(hstmt: COpaquePointer?, ipar: UShort, pfsqltype: COpaquePointer?, pcbparamdef: COpaquePointer?, pibscale: COpaquePointer?, pfnullable: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLDisconnect(connectionhandle: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLDriverConnect(hdbc: COpaquePointer?, hwnd: Long, szconnstrin: COpaquePointer?, cchconnstrin: Short, szconnstrout: COpaquePointer?, cchconnstroutmax: Short, pcchconnstrout: COpaquePointer?, fdrivercompletion: UShort): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLDriverConnectA(hdbc: COpaquePointer?, hwnd: Long, szconnstrin: COpaquePointer?, cbconnstrin: Short, szconnstrout: COpaquePointer?, cbconnstroutmax: Short, pcbconnstrout: COpaquePointer?, fdrivercompletion: UShort): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLDriverConnectW(hdbc: COpaquePointer?, hwnd: Long, szconnstrin: COpaquePointer?, cchconnstrin: Short, szconnstrout: COpaquePointer?, cchconnstroutmax: Short, pcchconnstrout: COpaquePointer?, fdrivercompletion: UShort): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLDrivers(henv: COpaquePointer?, fdirection: UShort, szdriverdesc: COpaquePointer?, cchdriverdescmax: Short, pcchdriverdesc: COpaquePointer?, szdriverattributes: COpaquePointer?, cchdrvrattrmax: Short, pcchdrvrattr: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLDriversA(henv: COpaquePointer?, fdirection: UShort, szdriverdesc: COpaquePointer?, cbdriverdescmax: Short, pcbdriverdesc: COpaquePointer?, szdriverattributes: COpaquePointer?, cbdrvrattrmax: Short, pcbdrvrattr: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLDriversW(henv: COpaquePointer?, fdirection: UShort, szdriverdesc: COpaquePointer?, cchdriverdescmax: Short, pcchdriverdesc: COpaquePointer?, szdriverattributes: COpaquePointer?, cchdrvrattrmax: Short, pcchdrvrattr: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLEndTran(handletype: Short, handle: COpaquePointer?, completiontype: Short): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLError(environmenthandle: COpaquePointer?, connectionhandle: COpaquePointer?, statementhandle: COpaquePointer?, sqlstate: COpaquePointer?, nativeerror: COpaquePointer?, messagetext: COpaquePointer?, bufferlength: Short, textlength: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLErrorA(henv: COpaquePointer?, hdbc: COpaquePointer?, hstmt: COpaquePointer?, szsqlstate: COpaquePointer?, pfnativeerror: COpaquePointer?, szerrormsg: COpaquePointer?, cberrormsgmax: Short, pcberrormsg: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLErrorW(henv: COpaquePointer?, hdbc: COpaquePointer?, hstmt: COpaquePointer?, wszsqlstate: COpaquePointer?, pfnativeerror: COpaquePointer?, wszerrormsg: COpaquePointer?, ccherrormsgmax: Short, pccherrormsg: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLExecDirect(statementhandle: COpaquePointer?, statementtext: COpaquePointer?, textlength: Int): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLExecDirectA(hstmt: COpaquePointer?, szsqlstr: COpaquePointer?, cbsqlstr: Int): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLExecDirectW(hstmt: COpaquePointer?, szsqlstr: COpaquePointer?, textlength: Int): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLExecute(statementhandle: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLExtendedFetch(hstmt: COpaquePointer?, ffetchtype: UShort, irow: Long, pcrow: COpaquePointer?, rgfrowstatus: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLFetch(statementhandle: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLFetchScroll(statementhandle: COpaquePointer?, fetchorientation: Short, fetchoffset: Long): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLForeignKeys(hstmt: COpaquePointer?, szpkcatalogname: COpaquePointer?, cchpkcatalogname: Short, szpkschemaname: COpaquePointer?, cchpkschemaname: Short, szpktablename: COpaquePointer?, cchpktablename: Short, szfkcatalogname: COpaquePointer?, cchfkcatalogname: Short, szfkschemaname: COpaquePointer?, cchfkschemaname: Short, szfktablename: COpaquePointer?, cchfktablename: Short): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLForeignKeysA(hstmt: COpaquePointer?, szpkcatalogname: COpaquePointer?, cbpkcatalogname: Short, szpkschemaname: COpaquePointer?, cbpkschemaname: Short, szpktablename: COpaquePointer?, cbpktablename: Short, szfkcatalogname: COpaquePointer?, cbfkcatalogname: Short, szfkschemaname: COpaquePointer?, cbfkschemaname: Short, szfktablename: COpaquePointer?, cbfktablename: Short): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLForeignKeysW(hstmt: COpaquePointer?, szpkcatalogname: COpaquePointer?, cchpkcatalogname: Short, szpkschemaname: COpaquePointer?, cchpkschemaname: Short, szpktablename: COpaquePointer?, cchpktablename: Short, szfkcatalogname: COpaquePointer?, cchfkcatalogname: Short, szfkschemaname: COpaquePointer?, cchfkschemaname: Short, szfktablename: COpaquePointer?, cchfktablename: Short): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLFreeConnect(connectionhandle: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLFreeEnv(environmenthandle: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLFreeHandle(handletype: Short, handle: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLFreeStmt(statementhandle: COpaquePointer?, option: UShort): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLGetConnectAttr(connectionhandle: COpaquePointer?, attribute: Int, value: COpaquePointer?, bufferlength: Int, stringlengthptr: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLGetConnectAttrA(hdbc: COpaquePointer?, fattribute: Int, rgbvalue: COpaquePointer?, cbvaluemax: Int, pcbvalue: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLGetConnectAttrW(hdbc: COpaquePointer?, fattribute: Int, rgbvalue: COpaquePointer?, cbvaluemax: Int, pcbvalue: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLGetConnectOption(connectionhandle: COpaquePointer?, option: UShort, value: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLGetConnectOptionA(hdbc: COpaquePointer?, foption: UShort, pvparam: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLGetConnectOptionW(hdbc: COpaquePointer?, foption: UShort, pvparam: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLGetCursorName(statementhandle: COpaquePointer?, cursorname: COpaquePointer?, bufferlength: Short, namelengthptr: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLGetCursorNameA(hstmt: COpaquePointer?, szcursor: COpaquePointer?, cbcursormax: Short, pcbcursor: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLGetCursorNameW(hstmt: COpaquePointer?, szcursor: COpaquePointer?, cchcursormax: Short, pcchcursor: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLGetData(statementhandle: COpaquePointer?, columnnumber: UShort, targettype: Short, targetvalue: COpaquePointer?, bufferlength: Long, strlenOrIndptr: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLGetDescField(descriptorhandle: COpaquePointer?, recnumber: Short, fieldidentifier: Short, value: COpaquePointer?, bufferlength: Int, stringlength: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLGetDescFieldA(hdesc: COpaquePointer?, irecord: Short, ifield: Short, rgbvalue: COpaquePointer?, cbbufferlength: Int, stringlength: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLGetDescFieldW(hdesc: COpaquePointer?, irecord: Short, ifield: Short, rgbvalue: COpaquePointer?, cbbufferlength: Int, stringlength: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLGetDescRec(descriptorhandle: COpaquePointer?, recnumber: Short, name: COpaquePointer?, bufferlength: Short, stringlengthptr: COpaquePointer?, typeptr: COpaquePointer?, subtypeptr: COpaquePointer?, lengthptr: COpaquePointer?, precisionptr: COpaquePointer?, scaleptr: COpaquePointer?, nullableptr: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLGetDescRecA(hdesc: COpaquePointer?, irecord: Short, szname: COpaquePointer?, cbnamemax: Short, pcbname: COpaquePointer?, pftype: COpaquePointer?, pfsubtype: COpaquePointer?, plength: COpaquePointer?, pprecision: COpaquePointer?, pscale: COpaquePointer?, pnullable: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLGetDescRecW(hdesc: COpaquePointer?, irecord: Short, szname: COpaquePointer?, cchnamemax: Short, pcchname: COpaquePointer?, pftype: COpaquePointer?, pfsubtype: COpaquePointer?, plength: COpaquePointer?, pprecision: COpaquePointer?, pscale: COpaquePointer?, pnullable: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLGetDiagField(handletype: Short, handle: COpaquePointer?, recnumber: Short, diagidentifier: Short, diaginfo: COpaquePointer?, bufferlength: Short, stringlength: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLGetDiagFieldA(fhandletype: Short, handle: COpaquePointer?, irecord: Short, fdiagfield: Short, rgbdiaginfo: COpaquePointer?, cbdiaginfomax: Short, pcbdiaginfo: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLGetDiagFieldW(fhandletype: Short, handle: COpaquePointer?, irecord: Short, fdiagfield: Short, rgbdiaginfo: COpaquePointer?, cbbufferlength: Short, pcbstringlength: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLGetDiagRec(handletype: Short, handle: COpaquePointer?, recnumber: Short, sqlstate: COpaquePointer?, nativeerror: COpaquePointer?, messagetext: COpaquePointer?, bufferlength: Short, textlength: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLGetDiagRecA(fhandletype: Short, handle: COpaquePointer?, irecord: Short, szsqlstate: COpaquePointer?, pfnativeerror: COpaquePointer?, szerrormsg: COpaquePointer?, cberrormsgmax: Short, pcberrormsg: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLGetDiagRecW(fhandletype: Short, handle: COpaquePointer?, irecord: Short, szsqlstate: COpaquePointer?, pfnativeerror: COpaquePointer?, szerrormsg: COpaquePointer?, ccherrormsgmax: Short, pccherrormsg: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLGetEnvAttr(environmenthandle: COpaquePointer?, attribute: Int, value: COpaquePointer?, bufferlength: Int, stringlength: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLGetFunctions(connectionhandle: COpaquePointer?, functionid: UShort, supported: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLGetInfo(connectionhandle: COpaquePointer?, infotype: UShort, infovalue: COpaquePointer?, bufferlength: Short, stringlengthptr: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLGetInfoA(hdbc: COpaquePointer?, finfotype: UShort, rgbinfovalue: COpaquePointer?, cbinfovaluemax: Short, pcbinfovalue: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLGetInfoW(hdbc: COpaquePointer?, finfotype: UShort, rgbinfovalue: COpaquePointer?, cbinfovaluemax: Short, pcbinfovalue: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLGetNextEnumeration(henumhandle: Handle, prgenumdata: COpaquePointer?, pienumlength: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLGetStmtAttr(statementhandle: COpaquePointer?, attribute: Int, value: COpaquePointer?, bufferlength: Int, stringlength: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLGetStmtAttrA(hstmt: COpaquePointer?, fattribute: Int, rgbvalue: COpaquePointer?, cbvaluemax: Int, pcbvalue: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLGetStmtAttrW(hstmt: COpaquePointer?, fattribute: Int, rgbvalue: COpaquePointer?, cbvaluemax: Int, pcbvalue: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLGetStmtOption(statementhandle: COpaquePointer?, option: UShort, value: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLGetTypeInfo(statementhandle: COpaquePointer?, datatype: Short): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLGetTypeInfoA(statementhandle: COpaquePointer?, datatype: Short): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLGetTypeInfoW(statementhandle: COpaquePointer?, datatype: Short): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLInitEnumServers(pwchservername: Pcwstr, pwchinstancename: Pcwstr): Handle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLLinkedCatalogsA(param0: COpaquePointer?, param1: Pcstr, param2: Short): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLLinkedCatalogsW(param0: COpaquePointer?, param1: Pcwstr, param2: Short): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLLinkedServers(param0: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLMoreResults(hstmt: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLNativeSql(hdbc: COpaquePointer?, szsqlstrin: COpaquePointer?, cchsqlstrin: Int, szsqlstr: COpaquePointer?, cchsqlstrmax: Int, pcbsqlstr: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLNativeSqlA(hdbc: COpaquePointer?, szsqlstrin: COpaquePointer?, cbsqlstrin: Int, szsqlstr: COpaquePointer?, cbsqlstrmax: Int, pcbsqlstr: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLNativeSqlW(hdbc: COpaquePointer?, szsqlstrin: COpaquePointer?, cchsqlstrin: Int, szsqlstr: COpaquePointer?, cchsqlstrmax: Int, pcchsqlstr: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLNumParams(hstmt: COpaquePointer?, pcpar: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLNumResultCols(statementhandle: COpaquePointer?, columncount: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLParamData(statementhandle: COpaquePointer?, value: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLParamOptions(hstmt: COpaquePointer?, crow: ULong, pirow: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLPrepare(statementhandle: COpaquePointer?, statementtext: COpaquePointer?, textlength: Int): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLPrepareA(hstmt: COpaquePointer?, szsqlstr: COpaquePointer?, cbsqlstr: Int): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLPrepareW(hstmt: COpaquePointer?, szsqlstr: COpaquePointer?, cchsqlstr: Int): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLPrimaryKeys(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cchcatalogname: Short, szschemaname: COpaquePointer?, cchschemaname: Short, sztablename: COpaquePointer?, cchtablename: Short): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLPrimaryKeysA(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cbcatalogname: Short, szschemaname: COpaquePointer?, cbschemaname: Short, sztablename: COpaquePointer?, cbtablename: Short): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLPrimaryKeysW(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cchcatalogname: Short, szschemaname: COpaquePointer?, cchschemaname: Short, sztablename: COpaquePointer?, cchtablename: Short): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLProcedureColumns(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cchcatalogname: Short, szschemaname: COpaquePointer?, cchschemaname: Short, szprocname: COpaquePointer?, cchprocname: Short, szcolumnname: COpaquePointer?, cchcolumnname: Short): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLProcedureColumnsA(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cbcatalogname: Short, szschemaname: COpaquePointer?, cbschemaname: Short, szprocname: COpaquePointer?, cbprocname: Short, szcolumnname: COpaquePointer?, cbcolumnname: Short): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLProcedureColumnsW(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cchcatalogname: Short, szschemaname: COpaquePointer?, cchschemaname: Short, szprocname: COpaquePointer?, cchprocname: Short, szcolumnname: COpaquePointer?, cchcolumnname: Short): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLProcedures(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cchcatalogname: Short, szschemaname: COpaquePointer?, cchschemaname: Short, szprocname: COpaquePointer?, cchprocname: Short): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLProceduresA(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cbcatalogname: Short, szschemaname: COpaquePointer?, cbschemaname: Short, szprocname: COpaquePointer?, cbprocname: Short): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLProceduresW(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cchcatalogname: Short, szschemaname: COpaquePointer?, cchschemaname: Short, szprocname: COpaquePointer?, cchprocname: Short): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLPutData(statementhandle: COpaquePointer?, data: COpaquePointer?, strlenOrInd: Long): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLRowCount(statementhandle: COpaquePointer?, rowcount: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLSetConnectAttr(connectionhandle: COpaquePointer?, attribute: Int, value: COpaquePointer?, stringlength: Int): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLSetConnectAttrA(hdbc: COpaquePointer?, fattribute: Int, rgbvalue: COpaquePointer?, cbvalue: Int): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLSetConnectAttrW(hdbc: COpaquePointer?, fattribute: Int, rgbvalue: COpaquePointer?, cbvalue: Int): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLSetConnectOption(connectionhandle: COpaquePointer?, option: UShort, value: ULong): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLSetConnectOptionA(hdbc: COpaquePointer?, foption: UShort, vparam: ULong): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLSetConnectOptionW(hdbc: COpaquePointer?, foption: UShort, vparam: ULong): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLSetCursorName(statementhandle: COpaquePointer?, cursorname: COpaquePointer?, namelength: Short): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLSetCursorNameA(hstmt: COpaquePointer?, szcursor: COpaquePointer?, cbcursor: Short): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLSetCursorNameW(hstmt: COpaquePointer?, szcursor: COpaquePointer?, cchcursor: Short): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLSetDescField(descriptorhandle: COpaquePointer?, recnumber: Short, fieldidentifier: Short, value: COpaquePointer?, bufferlength: Int): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLSetDescFieldW(descriptorhandle: COpaquePointer?, recnumber: Short, fieldidentifier: Short, value: COpaquePointer?, bufferlength: Int): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLSetDescRec(descriptorhandle: COpaquePointer?, recnumber: Short, type: Short, subtype: Short, length: Long, precision: Short, scale: Short, data: COpaquePointer?, stringlength: COpaquePointer?, indicator: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLSetEnvAttr(environmenthandle: COpaquePointer?, attribute: Int, value: COpaquePointer?, stringlength: Int): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLSetParam(statementhandle: COpaquePointer?, parameternumber: UShort, valuetype: Short, parametertype: Short, lengthprecision: ULong, parameterscale: Short, parametervalue: COpaquePointer?, strlenOrInd: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLSetPos(hstmt: COpaquePointer?, irow: ULong, foption: UShort, flock: UShort): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLSetScrollOptions(hstmt: COpaquePointer?, fconcurrency: UShort, crowkeyset: Long, crowrowset: UShort): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLSetStmtAttr(statementhandle: COpaquePointer?, attribute: Int, value: COpaquePointer?, stringlength: Int): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLSetStmtAttrW(hstmt: COpaquePointer?, fattribute: Int, rgbvalue: COpaquePointer?, cbvaluemax: Int): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLSetStmtOption(statementhandle: COpaquePointer?, option: UShort, value: ULong): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLSpecialColumns(statementhandle: COpaquePointer?, identifiertype: UShort, catalogname: COpaquePointer?, namelength1: Short, schemaname: COpaquePointer?, namelength2: Short, tablename: COpaquePointer?, namelength3: Short, scope: UShort, nullable: UShort): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLSpecialColumnsA(hstmt: COpaquePointer?, fcoltype: UShort, szcatalogname: COpaquePointer?, cbcatalogname: Short, szschemaname: COpaquePointer?, cbschemaname: Short, sztablename: COpaquePointer?, cbtablename: Short, fscope: UShort, fnullable: UShort): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLSpecialColumnsW(hstmt: COpaquePointer?, fcoltype: UShort, szcatalogname: COpaquePointer?, cchcatalogname: Short, szschemaname: COpaquePointer?, cchschemaname: Short, sztablename: COpaquePointer?, cchtablename: Short, fscope: UShort, fnullable: UShort): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLStatistics(statementhandle: COpaquePointer?, catalogname: COpaquePointer?, namelength1: Short, schemaname: COpaquePointer?, namelength2: Short, tablename: COpaquePointer?, namelength3: Short, unique: UShort, reserved: UShort): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLStatisticsA(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cbcatalogname: Short, szschemaname: COpaquePointer?, cbschemaname: Short, sztablename: COpaquePointer?, cbtablename: Short, funique: UShort, faccuracy: UShort): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLStatisticsW(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cchcatalogname: Short, szschemaname: COpaquePointer?, cchschemaname: Short, sztablename: COpaquePointer?, cchtablename: Short, funique: UShort, faccuracy: UShort): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLTablePrivileges(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cchcatalogname: Short, szschemaname: COpaquePointer?, cchschemaname: Short, sztablename: COpaquePointer?, cchtablename: Short): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLTablePrivilegesA(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cbcatalogname: Short, szschemaname: COpaquePointer?, cbschemaname: Short, sztablename: COpaquePointer?, cbtablename: Short): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLTablePrivilegesW(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cchcatalogname: Short, szschemaname: COpaquePointer?, cchschemaname: Short, sztablename: COpaquePointer?, cchtablename: Short): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLTables(statementhandle: COpaquePointer?, catalogname: COpaquePointer?, namelength1: Short, schemaname: COpaquePointer?, namelength2: Short, tablename: COpaquePointer?, namelength3: Short, tabletype: COpaquePointer?, namelength4: Short): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLTablesA(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cbcatalogname: Short, szschemaname: COpaquePointer?, cbschemaname: Short, sztablename: COpaquePointer?, cbtablename: Short, sztabletype: COpaquePointer?, cbtabletype: Short): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLTablesW(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cchcatalogname: Short, szschemaname: COpaquePointer?, cchschemaname: Short, sztablename: COpaquePointer?, cchtablename: Short, sztabletype: COpaquePointer?, cchtabletype: Short): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sQLTransact(environmenthandle: COpaquePointer?, connectionhandle: COpaquePointer?, completiontype: UShort): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bcpBatch(param0: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bcpBind(param0: COpaquePointer?, param1: COpaquePointer?, param2: Int, param3: Int, param4: COpaquePointer?, param5: Int, param6: Int, param7: Int): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bcpColfmt(param0: COpaquePointer?, param1: Int, param2: UByte, param3: Int, param4: Int, param5: COpaquePointer?, param6: Int, param7: Int): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bcpCollen(param0: COpaquePointer?, param1: Int, param2: Int): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bcpColptr(param0: COpaquePointer?, param1: COpaquePointer?, param2: Int): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bcpColumns(param0: COpaquePointer?, param1: Int): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bcpControl(param0: COpaquePointer?, param1: Int, param2: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bcpDone(param0: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bcpExec(param0: COpaquePointer?, param1: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bcpGetcolfmt(param0: COpaquePointer?, param1: Int, param2: Int, param3: COpaquePointer?, param4: Int, param5: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bcpInitA(param0: COpaquePointer?, param1: Pcstr, param2: Pcstr, param3: Pcstr, param4: Int): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bcpInitW(param0: COpaquePointer?, param1: Pcwstr, param2: Pcwstr, param3: Pcwstr, param4: Int): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bcpMoretext(param0: COpaquePointer?, param1: Int, param2: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bcpReadfmtA(param0: COpaquePointer?, param1: Pcstr): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bcpReadfmtW(param0: COpaquePointer?, param1: Pcwstr): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bcpSendrow(param0: COpaquePointer?): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bcpSetcolfmt(param0: COpaquePointer?, param1: Int, param2: Int, param3: COpaquePointer?, param4: Int): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bcpWritefmtA(param0: COpaquePointer?, param1: Pcstr): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bcpWritefmtW(param0: COpaquePointer?, param1: Pcwstr): Short =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dbprtypeA(param0: Int): Pstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dbprtypeW(param0: Int): Pwstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
