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

private object WindowsWin32SystemSearchJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchODBCGetTryWaitValue(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchODBCSetTryWaitValue(dwvalue: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLAllocConnect(environmenthandle: Long, connectionhandle: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLAllocEnv(environmenthandle: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLAllocHandle(handletype: Short, inputhandle: Long, outputhandle: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLAllocHandleStd(fhandletype: Short, hinput: Long, phoutput: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLAllocStmt(connectionhandle: Long, statementhandle: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLBindCol(statementhandle: Long, columnnumber: Short, targettype: Short, targetvalue: Long, bufferlength: Long, strlenOrInd: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLBindParam(statementhandle: Long, parameternumber: Short, valuetype: Short, parametertype: Short, lengthprecision: Long, parameterscale: Short, parametervalue: Long, strlenOrInd: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLBindParameter(hstmt: Long, ipar: Short, fparamtype: Short, fctype: Short, fsqltype: Short, cbcoldef: Long, ibscale: Short, rgbvalue: Long, cbvaluemax: Long, pcbvalue: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLBrowseConnect(hdbc: Long, szconnstrin: Long, cchconnstrin: Short, szconnstrout: Long, cchconnstroutmax: Short, pcchconnstrout: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLBrowseConnectA(hdbc: Long, szconnstrin: Long, cbconnstrin: Short, szconnstrout: Long, cbconnstroutmax: Short, pcbconnstrout: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLBrowseConnectW(hdbc: Long, szconnstrin: Long, cchconnstrin: Short, szconnstrout: Long, cchconnstroutmax: Short, pcchconnstrout: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLBulkOperations(statementhandle: Long, operation: Short): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLCancel(statementhandle: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLCancelHandle(handletype: Short, inputhandle: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLCloseCursor(statementhandle: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLCloseEnumServers(henumhandle: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLColAttribute(statementhandle: Long, columnnumber: Short, fieldidentifier: Short, characterattribute: Long, bufferlength: Short, stringlength: Long, numericattribute: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLColAttributeA(hstmt: Long, icol: Short, ifield: Short, pcharattr: Long, cbcharattrmax: Short, pcbcharattr: Long, pnumattr: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLColAttributeW(hstmt: Long, icol: Short, ifield: Short, pcharattr: Long, cbdescmax: Short, pcbcharattr: Long, pnumattr: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLColAttributes(hstmt: Long, icol: Short, fdesctype: Short, rgbdesc: Long, cbdescmax: Short, pcbdesc: Long, pfdesc: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLColAttributesA(hstmt: Long, icol: Short, fdesctype: Short, rgbdesc: Long, cbdescmax: Short, pcbdesc: Long, pfdesc: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLColAttributesW(hstmt: Long, icol: Short, fdesctype: Short, rgbdesc: Long, cbdescmax: Short, pcbdesc: Long, pfdesc: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLColumnPrivileges(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short, szcolumnname: Long, cchcolumnname: Short): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLColumnPrivilegesA(hstmt: Long, szcatalogname: Long, cbcatalogname: Short, szschemaname: Long, cbschemaname: Short, sztablename: Long, cbtablename: Short, szcolumnname: Long, cbcolumnname: Short): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLColumnPrivilegesW(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short, szcolumnname: Long, cchcolumnname: Short): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLColumns(statementhandle: Long, catalogname: Long, namelength1: Short, schemaname: Long, namelength2: Short, tablename: Long, namelength3: Short, columnname: Long, namelength4: Short): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLColumnsA(hstmt: Long, szcatalogname: Long, cbcatalogname: Short, szschemaname: Long, cbschemaname: Short, sztablename: Long, cbtablename: Short, szcolumnname: Long, cbcolumnname: Short): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLColumnsW(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short, szcolumnname: Long, cchcolumnname: Short): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLCompleteAsync(handletype: Short, handle: Long, asyncretcodeptr: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLConnect(connectionhandle: Long, servername: Long, namelength1: Short, username: Long, namelength2: Short, authentication: Long, namelength3: Short): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLConnectA(hdbc: Long, szdsn: Long, cbdsn: Short, szuid: Long, cbuid: Short, szauthstr: Long, cbauthstr: Short): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLConnectW(hdbc: Long, szdsn: Long, cchdsn: Short, szuid: Long, cchuid: Short, szauthstr: Long, cchauthstr: Short): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLCopyDesc(sourcedeschandle: Long, targetdeschandle: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLDataSources(environmenthandle: Long, direction: Short, servername: Long, bufferlength1: Short, namelength1ptr: Long, description: Long, bufferlength2: Short, namelength2ptr: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLDataSourcesA(henv: Long, fdirection: Short, szdsn: Long, cbdsnmax: Short, pcbdsn: Long, szdescription: Long, cbdescriptionmax: Short, pcbdescription: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLDataSourcesW(henv: Long, fdirection: Short, szdsn: Long, cchdsnmax: Short, pcchdsn: Long, wszdescription: Long, cchdescriptionmax: Short, pcchdescription: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLDescribeCol(statementhandle: Long, columnnumber: Short, columnname: Long, bufferlength: Short, namelength: Long, datatype: Long, columnsize: Long, decimaldigits: Long, nullable: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLDescribeColA(hstmt: Long, icol: Short, szcolname: Long, cbcolnamemax: Short, pcbcolname: Long, pfsqltype: Long, pcbcoldef: Long, pibscale: Long, pfnullable: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLDescribeColW(hstmt: Long, icol: Short, szcolname: Long, cchcolnamemax: Short, pcchcolname: Long, pfsqltype: Long, pcbcoldef: Long, pibscale: Long, pfnullable: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLDescribeParam(hstmt: Long, ipar: Short, pfsqltype: Long, pcbparamdef: Long, pibscale: Long, pfnullable: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLDisconnect(connectionhandle: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLDriverConnect(hdbc: Long, hwnd: Long, szconnstrin: Long, cchconnstrin: Short, szconnstrout: Long, cchconnstroutmax: Short, pcchconnstrout: Long, fdrivercompletion: Short): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLDriverConnectA(hdbc: Long, hwnd: Long, szconnstrin: Long, cbconnstrin: Short, szconnstrout: Long, cbconnstroutmax: Short, pcbconnstrout: Long, fdrivercompletion: Short): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLDriverConnectW(hdbc: Long, hwnd: Long, szconnstrin: Long, cchconnstrin: Short, szconnstrout: Long, cchconnstroutmax: Short, pcchconnstrout: Long, fdrivercompletion: Short): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLDrivers(henv: Long, fdirection: Short, szdriverdesc: Long, cchdriverdescmax: Short, pcchdriverdesc: Long, szdriverattributes: Long, cchdrvrattrmax: Short, pcchdrvrattr: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLDriversA(henv: Long, fdirection: Short, szdriverdesc: Long, cbdriverdescmax: Short, pcbdriverdesc: Long, szdriverattributes: Long, cbdrvrattrmax: Short, pcbdrvrattr: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLDriversW(henv: Long, fdirection: Short, szdriverdesc: Long, cchdriverdescmax: Short, pcchdriverdesc: Long, szdriverattributes: Long, cchdrvrattrmax: Short, pcchdrvrattr: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLEndTran(handletype: Short, handle: Long, completiontype: Short): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLError(environmenthandle: Long, connectionhandle: Long, statementhandle: Long, sqlstate: Long, nativeerror: Long, messagetext: Long, bufferlength: Short, textlength: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLErrorA(henv: Long, hdbc: Long, hstmt: Long, szsqlstate: Long, pfnativeerror: Long, szerrormsg: Long, cberrormsgmax: Short, pcberrormsg: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLErrorW(henv: Long, hdbc: Long, hstmt: Long, wszsqlstate: Long, pfnativeerror: Long, wszerrormsg: Long, ccherrormsgmax: Short, pccherrormsg: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLExecDirect(statementhandle: Long, statementtext: Long, textlength: Int): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLExecDirectA(hstmt: Long, szsqlstr: Long, cbsqlstr: Int): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLExecDirectW(hstmt: Long, szsqlstr: Long, textlength: Int): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLExecute(statementhandle: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLExtendedFetch(hstmt: Long, ffetchtype: Short, irow: Long, pcrow: Long, rgfrowstatus: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLFetch(statementhandle: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLFetchScroll(statementhandle: Long, fetchorientation: Short, fetchoffset: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLForeignKeys(hstmt: Long, szpkcatalogname: Long, cchpkcatalogname: Short, szpkschemaname: Long, cchpkschemaname: Short, szpktablename: Long, cchpktablename: Short, szfkcatalogname: Long, cchfkcatalogname: Short, szfkschemaname: Long, cchfkschemaname: Short, szfktablename: Long, cchfktablename: Short): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLForeignKeysA(hstmt: Long, szpkcatalogname: Long, cbpkcatalogname: Short, szpkschemaname: Long, cbpkschemaname: Short, szpktablename: Long, cbpktablename: Short, szfkcatalogname: Long, cbfkcatalogname: Short, szfkschemaname: Long, cbfkschemaname: Short, szfktablename: Long, cbfktablename: Short): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLForeignKeysW(hstmt: Long, szpkcatalogname: Long, cchpkcatalogname: Short, szpkschemaname: Long, cchpkschemaname: Short, szpktablename: Long, cchpktablename: Short, szfkcatalogname: Long, cchfkcatalogname: Short, szfkschemaname: Long, cchfkschemaname: Short, szfktablename: Long, cchfktablename: Short): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLFreeConnect(connectionhandle: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLFreeEnv(environmenthandle: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLFreeHandle(handletype: Short, handle: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLFreeStmt(statementhandle: Long, option: Short): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLGetConnectAttr(connectionhandle: Long, attribute: Int, value: Long, bufferlength: Int, stringlengthptr: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLGetConnectAttrA(hdbc: Long, fattribute: Int, rgbvalue: Long, cbvaluemax: Int, pcbvalue: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLGetConnectAttrW(hdbc: Long, fattribute: Int, rgbvalue: Long, cbvaluemax: Int, pcbvalue: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLGetConnectOption(connectionhandle: Long, option: Short, value: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLGetConnectOptionA(hdbc: Long, foption: Short, pvparam: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLGetConnectOptionW(hdbc: Long, foption: Short, pvparam: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLGetCursorName(statementhandle: Long, cursorname: Long, bufferlength: Short, namelengthptr: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLGetCursorNameA(hstmt: Long, szcursor: Long, cbcursormax: Short, pcbcursor: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLGetCursorNameW(hstmt: Long, szcursor: Long, cchcursormax: Short, pcchcursor: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLGetData(statementhandle: Long, columnnumber: Short, targettype: Short, targetvalue: Long, bufferlength: Long, strlenOrIndptr: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLGetDescField(descriptorhandle: Long, recnumber: Short, fieldidentifier: Short, value: Long, bufferlength: Int, stringlength: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLGetDescFieldA(hdesc: Long, irecord: Short, ifield: Short, rgbvalue: Long, cbbufferlength: Int, stringlength: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLGetDescFieldW(hdesc: Long, irecord: Short, ifield: Short, rgbvalue: Long, cbbufferlength: Int, stringlength: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLGetDescRec(descriptorhandle: Long, recnumber: Short, name: Long, bufferlength: Short, stringlengthptr: Long, typeptr: Long, subtypeptr: Long, lengthptr: Long, precisionptr: Long, scaleptr: Long, nullableptr: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLGetDescRecA(hdesc: Long, irecord: Short, szname: Long, cbnamemax: Short, pcbname: Long, pftype: Long, pfsubtype: Long, plength: Long, pprecision: Long, pscale: Long, pnullable: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLGetDescRecW(hdesc: Long, irecord: Short, szname: Long, cchnamemax: Short, pcchname: Long, pftype: Long, pfsubtype: Long, plength: Long, pprecision: Long, pscale: Long, pnullable: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLGetDiagField(handletype: Short, handle: Long, recnumber: Short, diagidentifier: Short, diaginfo: Long, bufferlength: Short, stringlength: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLGetDiagFieldA(fhandletype: Short, handle: Long, irecord: Short, fdiagfield: Short, rgbdiaginfo: Long, cbdiaginfomax: Short, pcbdiaginfo: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLGetDiagFieldW(fhandletype: Short, handle: Long, irecord: Short, fdiagfield: Short, rgbdiaginfo: Long, cbbufferlength: Short, pcbstringlength: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLGetDiagRec(handletype: Short, handle: Long, recnumber: Short, sqlstate: Long, nativeerror: Long, messagetext: Long, bufferlength: Short, textlength: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLGetDiagRecA(fhandletype: Short, handle: Long, irecord: Short, szsqlstate: Long, pfnativeerror: Long, szerrormsg: Long, cberrormsgmax: Short, pcberrormsg: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLGetDiagRecW(fhandletype: Short, handle: Long, irecord: Short, szsqlstate: Long, pfnativeerror: Long, szerrormsg: Long, ccherrormsgmax: Short, pccherrormsg: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLGetEnvAttr(environmenthandle: Long, attribute: Int, value: Long, bufferlength: Int, stringlength: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLGetFunctions(connectionhandle: Long, functionid: Short, supported: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLGetInfo(connectionhandle: Long, infotype: Short, infovalue: Long, bufferlength: Short, stringlengthptr: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLGetInfoA(hdbc: Long, finfotype: Short, rgbinfovalue: Long, cbinfovaluemax: Short, pcbinfovalue: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLGetInfoW(hdbc: Long, finfotype: Short, rgbinfovalue: Long, cbinfovaluemax: Short, pcbinfovalue: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLGetNextEnumeration(henumhandle: Long, prgenumdata: Long, pienumlength: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLGetStmtAttr(statementhandle: Long, attribute: Int, value: Long, bufferlength: Int, stringlength: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLGetStmtAttrA(hstmt: Long, fattribute: Int, rgbvalue: Long, cbvaluemax: Int, pcbvalue: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLGetStmtAttrW(hstmt: Long, fattribute: Int, rgbvalue: Long, cbvaluemax: Int, pcbvalue: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLGetStmtOption(statementhandle: Long, option: Short, value: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLGetTypeInfo(statementhandle: Long, datatype: Short): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLGetTypeInfoA(statementhandle: Long, datatype: Short): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLGetTypeInfoW(statementhandle: Long, datatype: Short): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLInitEnumServers(pwchservername: Long, pwchinstancename: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLLinkedCatalogsA(param0: Long, param1: Long, param2: Short): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLLinkedCatalogsW(param0: Long, param1: Long, param2: Short): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLLinkedServers(param0: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLMoreResults(hstmt: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLNativeSql(hdbc: Long, szsqlstrin: Long, cchsqlstrin: Int, szsqlstr: Long, cchsqlstrmax: Int, pcbsqlstr: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLNativeSqlA(hdbc: Long, szsqlstrin: Long, cbsqlstrin: Int, szsqlstr: Long, cbsqlstrmax: Int, pcbsqlstr: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLNativeSqlW(hdbc: Long, szsqlstrin: Long, cchsqlstrin: Int, szsqlstr: Long, cchsqlstrmax: Int, pcchsqlstr: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLNumParams(hstmt: Long, pcpar: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLNumResultCols(statementhandle: Long, columncount: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLParamData(statementhandle: Long, value: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLParamOptions(hstmt: Long, crow: Long, pirow: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLPrepare(statementhandle: Long, statementtext: Long, textlength: Int): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLPrepareA(hstmt: Long, szsqlstr: Long, cbsqlstr: Int): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLPrepareW(hstmt: Long, szsqlstr: Long, cchsqlstr: Int): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLPrimaryKeys(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLPrimaryKeysA(hstmt: Long, szcatalogname: Long, cbcatalogname: Short, szschemaname: Long, cbschemaname: Short, sztablename: Long, cbtablename: Short): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLPrimaryKeysW(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLProcedureColumns(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, szprocname: Long, cchprocname: Short, szcolumnname: Long, cchcolumnname: Short): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLProcedureColumnsA(hstmt: Long, szcatalogname: Long, cbcatalogname: Short, szschemaname: Long, cbschemaname: Short, szprocname: Long, cbprocname: Short, szcolumnname: Long, cbcolumnname: Short): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLProcedureColumnsW(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, szprocname: Long, cchprocname: Short, szcolumnname: Long, cchcolumnname: Short): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLProcedures(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, szprocname: Long, cchprocname: Short): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLProceduresA(hstmt: Long, szcatalogname: Long, cbcatalogname: Short, szschemaname: Long, cbschemaname: Short, szprocname: Long, cbprocname: Short): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLProceduresW(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, szprocname: Long, cchprocname: Short): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLPutData(statementhandle: Long, data: Long, strlenOrInd: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLRowCount(statementhandle: Long, rowcount: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLSetConnectAttr(connectionhandle: Long, attribute: Int, value: Long, stringlength: Int): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLSetConnectAttrA(hdbc: Long, fattribute: Int, rgbvalue: Long, cbvalue: Int): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLSetConnectAttrW(hdbc: Long, fattribute: Int, rgbvalue: Long, cbvalue: Int): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLSetConnectOption(connectionhandle: Long, option: Short, value: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLSetConnectOptionA(hdbc: Long, foption: Short, vparam: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLSetConnectOptionW(hdbc: Long, foption: Short, vparam: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLSetCursorName(statementhandle: Long, cursorname: Long, namelength: Short): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLSetCursorNameA(hstmt: Long, szcursor: Long, cbcursor: Short): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLSetCursorNameW(hstmt: Long, szcursor: Long, cchcursor: Short): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLSetDescField(descriptorhandle: Long, recnumber: Short, fieldidentifier: Short, value: Long, bufferlength: Int): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLSetDescFieldW(descriptorhandle: Long, recnumber: Short, fieldidentifier: Short, value: Long, bufferlength: Int): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLSetDescRec(descriptorhandle: Long, recnumber: Short, type: Short, subtype: Short, length: Long, precision: Short, scale: Short, data: Long, stringlength: Long, indicator: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLSetEnvAttr(environmenthandle: Long, attribute: Int, value: Long, stringlength: Int): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLSetParam(statementhandle: Long, parameternumber: Short, valuetype: Short, parametertype: Short, lengthprecision: Long, parameterscale: Short, parametervalue: Long, strlenOrInd: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLSetPos(hstmt: Long, irow: Long, foption: Short, flock: Short): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLSetScrollOptions(hstmt: Long, fconcurrency: Short, crowkeyset: Long, crowrowset: Short): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLSetStmtAttr(statementhandle: Long, attribute: Int, value: Long, stringlength: Int): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLSetStmtAttrW(hstmt: Long, fattribute: Int, rgbvalue: Long, cbvaluemax: Int): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLSetStmtOption(statementhandle: Long, option: Short, value: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLSpecialColumns(statementhandle: Long, identifiertype: Short, catalogname: Long, namelength1: Short, schemaname: Long, namelength2: Short, tablename: Long, namelength3: Short, scope: Short, nullable: Short): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLSpecialColumnsA(hstmt: Long, fcoltype: Short, szcatalogname: Long, cbcatalogname: Short, szschemaname: Long, cbschemaname: Short, sztablename: Long, cbtablename: Short, fscope: Short, fnullable: Short): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLSpecialColumnsW(hstmt: Long, fcoltype: Short, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short, fscope: Short, fnullable: Short): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLStatistics(statementhandle: Long, catalogname: Long, namelength1: Short, schemaname: Long, namelength2: Short, tablename: Long, namelength3: Short, unique: Short, reserved: Short): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLStatisticsA(hstmt: Long, szcatalogname: Long, cbcatalogname: Short, szschemaname: Long, cbschemaname: Short, sztablename: Long, cbtablename: Short, funique: Short, faccuracy: Short): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLStatisticsW(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short, funique: Short, faccuracy: Short): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLTablePrivileges(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLTablePrivilegesA(hstmt: Long, szcatalogname: Long, cbcatalogname: Short, szschemaname: Long, cbschemaname: Short, sztablename: Long, cbtablename: Short): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLTablePrivilegesW(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLTables(statementhandle: Long, catalogname: Long, namelength1: Short, schemaname: Long, namelength2: Short, tablename: Long, namelength3: Short, tabletype: Long, namelength4: Short): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLTablesA(hstmt: Long, szcatalogname: Long, cbcatalogname: Short, szschemaname: Long, cbschemaname: Short, sztablename: Long, cbtablename: Short, sztabletype: Long, cbtabletype: Short): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLTablesW(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short, sztabletype: Long, cchtabletype: Short): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchSQLTransact(environmenthandle: Long, connectionhandle: Long, completiontype: Short): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchBcpBatch(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchBcpBind(param0: Long, param1: Long, param2: Int, param3: Int, param4: Long, param5: Int, param6: Int, param7: Int): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchBcpColfmt(param0: Long, param1: Int, param2: Byte, param3: Int, param4: Int, param5: Long, param6: Int, param7: Int): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchBcpCollen(param0: Long, param1: Int, param2: Int): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchBcpColptr(param0: Long, param1: Long, param2: Int): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchBcpColumns(param0: Long, param1: Int): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchBcpControl(param0: Long, param1: Int, param2: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchBcpDone(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchBcpExec(param0: Long, param1: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchBcpGetcolfmt(param0: Long, param1: Int, param2: Int, param3: Long, param4: Int, param5: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchBcpInitA(param0: Long, param1: Long, param2: Long, param3: Long, param4: Int): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchBcpInitW(param0: Long, param1: Long, param2: Long, param3: Long, param4: Int): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchBcpMoretext(param0: Long, param1: Int, param2: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchBcpReadfmtA(param0: Long, param1: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchBcpReadfmtW(param0: Long, param1: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchBcpSendrow(param0: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchBcpSetcolfmt(param0: Long, param1: Int, param2: Int, param3: Long, param4: Int): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchBcpWritefmtA(param0: Long, param1: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchBcpWritefmtW(param0: Long, param1: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchDbprtypeA(param0: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemSearchDbprtypeW(param0: Int): Long
}

public actual fun oDBCGetTryWaitValue(): UInt =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchODBCGetTryWaitValue().toUInt()

public actual fun oDBCSetTryWaitValue(dwvalue: UInt): Bool =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchODBCSetTryWaitValue(dwvalue.toInt())

public actual fun sQLAllocConnect(environmenthandle: MutPtr<CVoid>, connectionhandle: MutPtr<MutPtr<CVoid>>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLAllocConnect(environmenthandle.rawAddress, connectionhandle.rawAddress)

public actual fun sQLAllocEnv(environmenthandle: MutPtr<MutPtr<CVoid>>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLAllocEnv(environmenthandle.rawAddress)

public actual fun sQLAllocHandle(handletype: Short, inputhandle: MutPtr<CVoid>, outputhandle: MutPtr<MutPtr<CVoid>>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLAllocHandle(handletype, inputhandle.rawAddress, outputhandle.rawAddress)

public actual fun sQLAllocHandleStd(fhandletype: Short, hinput: MutPtr<CVoid>, phoutput: MutPtr<MutPtr<CVoid>>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLAllocHandleStd(fhandletype, hinput.rawAddress, phoutput.rawAddress)

public actual fun sQLAllocStmt(connectionhandle: MutPtr<CVoid>, statementhandle: MutPtr<MutPtr<CVoid>>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLAllocStmt(connectionhandle.rawAddress, statementhandle.rawAddress)

public actual fun sQLBindCol(statementhandle: MutPtr<CVoid>, columnnumber: UShort, targettype: Short, targetvalue: MutPtr<CVoid>, bufferlength: Long, strlenOrInd: MutPtr<Long>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLBindCol(statementhandle.rawAddress, columnnumber.toShort(), targettype, targetvalue.rawAddress, bufferlength, strlenOrInd.rawAddress)

public actual fun sQLBindParam(statementhandle: MutPtr<CVoid>, parameternumber: UShort, valuetype: Short, parametertype: Short, lengthprecision: ULong, parameterscale: Short, parametervalue: MutPtr<CVoid>, strlenOrInd: MutPtr<Long>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLBindParam(statementhandle.rawAddress, parameternumber.toShort(), valuetype, parametertype, lengthprecision.toLong(), parameterscale, parametervalue.rawAddress, strlenOrInd.rawAddress)

public actual fun sQLBindParameter(hstmt: MutPtr<CVoid>, ipar: UShort, fparamtype: Short, fctype: Short, fsqltype: Short, cbcoldef: ULong, ibscale: Short, rgbvalue: MutPtr<CVoid>, cbvaluemax: Long, pcbvalue: MutPtr<Long>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLBindParameter(hstmt.rawAddress, ipar.toShort(), fparamtype, fctype, fsqltype, cbcoldef.toLong(), ibscale, rgbvalue.rawAddress, cbvaluemax, pcbvalue.rawAddress)

public actual fun sQLBrowseConnect(hdbc: MutPtr<CVoid>, szconnstrin: ConstPtr<UByte>, cchconnstrin: Short, szconnstrout: MutPtr<UByte>, cchconnstroutmax: Short, pcchconnstrout: MutPtr<Short>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLBrowseConnect(hdbc.rawAddress, szconnstrin.rawAddress, cchconnstrin, szconnstrout.rawAddress, cchconnstroutmax, pcchconnstrout.rawAddress)

public actual fun sQLBrowseConnectA(hdbc: MutPtr<CVoid>, szconnstrin: ConstPtr<UByte>, cbconnstrin: Short, szconnstrout: MutPtr<UByte>, cbconnstroutmax: Short, pcbconnstrout: MutPtr<Short>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLBrowseConnectA(hdbc.rawAddress, szconnstrin.rawAddress, cbconnstrin, szconnstrout.rawAddress, cbconnstroutmax, pcbconnstrout.rawAddress)

public actual fun sQLBrowseConnectW(hdbc: MutPtr<CVoid>, szconnstrin: ConstPtr<UShort>, cchconnstrin: Short, szconnstrout: MutPtr<UShort>, cchconnstroutmax: Short, pcchconnstrout: MutPtr<Short>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLBrowseConnectW(hdbc.rawAddress, szconnstrin.rawAddress, cchconnstrin, szconnstrout.rawAddress, cchconnstroutmax, pcchconnstrout.rawAddress)

public actual fun sQLBulkOperations(statementhandle: MutPtr<CVoid>, operation: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLBulkOperations(statementhandle.rawAddress, operation)

public actual fun sQLCancel(statementhandle: MutPtr<CVoid>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLCancel(statementhandle.rawAddress)

public actual fun sQLCancelHandle(handletype: Short, inputhandle: MutPtr<CVoid>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLCancelHandle(handletype, inputhandle.rawAddress)

public actual fun sQLCloseCursor(statementhandle: MutPtr<CVoid>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLCloseCursor(statementhandle.rawAddress)

public actual fun sQLCloseEnumServers(henumhandle: Handle): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLCloseEnumServers(henumhandle.rawAddress)

public actual fun sQLColAttribute(statementhandle: MutPtr<CVoid>, columnnumber: UShort, fieldidentifier: UShort, characterattribute: MutPtr<CVoid>, bufferlength: Short, stringlength: MutPtr<Short>, numericattribute: MutPtr<Long>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLColAttribute(statementhandle.rawAddress, columnnumber.toShort(), fieldidentifier.toShort(), characterattribute.rawAddress, bufferlength, stringlength.rawAddress, numericattribute.rawAddress)

public actual fun sQLColAttributeA(hstmt: MutPtr<CVoid>, icol: Short, ifield: Short, pcharattr: MutPtr<CVoid>, cbcharattrmax: Short, pcbcharattr: MutPtr<Short>, pnumattr: MutPtr<Long>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLColAttributeA(hstmt.rawAddress, icol, ifield, pcharattr.rawAddress, cbcharattrmax, pcbcharattr.rawAddress, pnumattr.rawAddress)

public actual fun sQLColAttributeW(hstmt: MutPtr<CVoid>, icol: UShort, ifield: UShort, pcharattr: MutPtr<CVoid>, cbdescmax: Short, pcbcharattr: MutPtr<Short>, pnumattr: MutPtr<Long>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLColAttributeW(hstmt.rawAddress, icol.toShort(), ifield.toShort(), pcharattr.rawAddress, cbdescmax, pcbcharattr.rawAddress, pnumattr.rawAddress)

public actual fun sQLColAttributes(hstmt: MutPtr<CVoid>, icol: UShort, fdesctype: UShort, rgbdesc: MutPtr<CVoid>, cbdescmax: Short, pcbdesc: MutPtr<Short>, pfdesc: MutPtr<Long>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLColAttributes(hstmt.rawAddress, icol.toShort(), fdesctype.toShort(), rgbdesc.rawAddress, cbdescmax, pcbdesc.rawAddress, pfdesc.rawAddress)

public actual fun sQLColAttributesA(hstmt: MutPtr<CVoid>, icol: UShort, fdesctype: UShort, rgbdesc: MutPtr<CVoid>, cbdescmax: Short, pcbdesc: MutPtr<Short>, pfdesc: MutPtr<Long>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLColAttributesA(hstmt.rawAddress, icol.toShort(), fdesctype.toShort(), rgbdesc.rawAddress, cbdescmax, pcbdesc.rawAddress, pfdesc.rawAddress)

public actual fun sQLColAttributesW(hstmt: MutPtr<CVoid>, icol: UShort, fdesctype: UShort, rgbdesc: MutPtr<CVoid>, cbdescmax: Short, pcbdesc: MutPtr<Short>, pfdesc: MutPtr<Long>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLColAttributesW(hstmt.rawAddress, icol.toShort(), fdesctype.toShort(), rgbdesc.rawAddress, cbdescmax, pcbdesc.rawAddress, pfdesc.rawAddress)

public actual fun sQLColumnPrivileges(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UByte>, cchcatalogname: Short, szschemaname: ConstPtr<UByte>, cchschemaname: Short, sztablename: ConstPtr<UByte>, cchtablename: Short, szcolumnname: ConstPtr<UByte>, cchcolumnname: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLColumnPrivileges(hstmt.rawAddress, szcatalogname.rawAddress, cchcatalogname, szschemaname.rawAddress, cchschemaname, sztablename.rawAddress, cchtablename, szcolumnname.rawAddress, cchcolumnname)

public actual fun sQLColumnPrivilegesA(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UByte>, cbcatalogname: Short, szschemaname: ConstPtr<UByte>, cbschemaname: Short, sztablename: ConstPtr<UByte>, cbtablename: Short, szcolumnname: ConstPtr<UByte>, cbcolumnname: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLColumnPrivilegesA(hstmt.rawAddress, szcatalogname.rawAddress, cbcatalogname, szschemaname.rawAddress, cbschemaname, sztablename.rawAddress, cbtablename, szcolumnname.rawAddress, cbcolumnname)

public actual fun sQLColumnPrivilegesW(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UShort>, cchcatalogname: Short, szschemaname: ConstPtr<UShort>, cchschemaname: Short, sztablename: ConstPtr<UShort>, cchtablename: Short, szcolumnname: ConstPtr<UShort>, cchcolumnname: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLColumnPrivilegesW(hstmt.rawAddress, szcatalogname.rawAddress, cchcatalogname, szschemaname.rawAddress, cchschemaname, sztablename.rawAddress, cchtablename, szcolumnname.rawAddress, cchcolumnname)

public actual fun sQLColumns(statementhandle: MutPtr<CVoid>, catalogname: ConstPtr<UByte>, namelength1: Short, schemaname: ConstPtr<UByte>, namelength2: Short, tablename: ConstPtr<UByte>, namelength3: Short, columnname: ConstPtr<UByte>, namelength4: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLColumns(statementhandle.rawAddress, catalogname.rawAddress, namelength1, schemaname.rawAddress, namelength2, tablename.rawAddress, namelength3, columnname.rawAddress, namelength4)

public actual fun sQLColumnsA(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UByte>, cbcatalogname: Short, szschemaname: ConstPtr<UByte>, cbschemaname: Short, sztablename: ConstPtr<UByte>, cbtablename: Short, szcolumnname: ConstPtr<UByte>, cbcolumnname: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLColumnsA(hstmt.rawAddress, szcatalogname.rawAddress, cbcatalogname, szschemaname.rawAddress, cbschemaname, sztablename.rawAddress, cbtablename, szcolumnname.rawAddress, cbcolumnname)

public actual fun sQLColumnsW(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UShort>, cchcatalogname: Short, szschemaname: ConstPtr<UShort>, cchschemaname: Short, sztablename: ConstPtr<UShort>, cchtablename: Short, szcolumnname: ConstPtr<UShort>, cchcolumnname: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLColumnsW(hstmt.rawAddress, szcatalogname.rawAddress, cchcatalogname, szschemaname.rawAddress, cchschemaname, sztablename.rawAddress, cchtablename, szcolumnname.rawAddress, cchcolumnname)

public actual fun sQLCompleteAsync(handletype: Short, handle: MutPtr<CVoid>, asyncretcodeptr: MutPtr<Short>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLCompleteAsync(handletype, handle.rawAddress, asyncretcodeptr.rawAddress)

public actual fun sQLConnect(connectionhandle: MutPtr<CVoid>, servername: ConstPtr<UByte>, namelength1: Short, username: ConstPtr<UByte>, namelength2: Short, authentication: ConstPtr<UByte>, namelength3: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLConnect(connectionhandle.rawAddress, servername.rawAddress, namelength1, username.rawAddress, namelength2, authentication.rawAddress, namelength3)

public actual fun sQLConnectA(hdbc: MutPtr<CVoid>, szdsn: ConstPtr<UByte>, cbdsn: Short, szuid: ConstPtr<UByte>, cbuid: Short, szauthstr: ConstPtr<UByte>, cbauthstr: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLConnectA(hdbc.rawAddress, szdsn.rawAddress, cbdsn, szuid.rawAddress, cbuid, szauthstr.rawAddress, cbauthstr)

public actual fun sQLConnectW(hdbc: MutPtr<CVoid>, szdsn: ConstPtr<UShort>, cchdsn: Short, szuid: ConstPtr<UShort>, cchuid: Short, szauthstr: ConstPtr<UShort>, cchauthstr: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLConnectW(hdbc.rawAddress, szdsn.rawAddress, cchdsn, szuid.rawAddress, cchuid, szauthstr.rawAddress, cchauthstr)

public actual fun sQLCopyDesc(sourcedeschandle: MutPtr<CVoid>, targetdeschandle: MutPtr<CVoid>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLCopyDesc(sourcedeschandle.rawAddress, targetdeschandle.rawAddress)

public actual fun sQLDataSources(environmenthandle: MutPtr<CVoid>, direction: UShort, servername: MutPtr<UByte>, bufferlength1: Short, namelength1ptr: MutPtr<Short>, description: MutPtr<UByte>, bufferlength2: Short, namelength2ptr: MutPtr<Short>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLDataSources(environmenthandle.rawAddress, direction.toShort(), servername.rawAddress, bufferlength1, namelength1ptr.rawAddress, description.rawAddress, bufferlength2, namelength2ptr.rawAddress)

public actual fun sQLDataSourcesA(henv: MutPtr<CVoid>, fdirection: UShort, szdsn: MutPtr<UByte>, cbdsnmax: Short, pcbdsn: MutPtr<Short>, szdescription: MutPtr<UByte>, cbdescriptionmax: Short, pcbdescription: MutPtr<Short>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLDataSourcesA(henv.rawAddress, fdirection.toShort(), szdsn.rawAddress, cbdsnmax, pcbdsn.rawAddress, szdescription.rawAddress, cbdescriptionmax, pcbdescription.rawAddress)

public actual fun sQLDataSourcesW(henv: MutPtr<CVoid>, fdirection: UShort, szdsn: MutPtr<UShort>, cchdsnmax: Short, pcchdsn: MutPtr<Short>, wszdescription: MutPtr<UShort>, cchdescriptionmax: Short, pcchdescription: MutPtr<Short>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLDataSourcesW(henv.rawAddress, fdirection.toShort(), szdsn.rawAddress, cchdsnmax, pcchdsn.rawAddress, wszdescription.rawAddress, cchdescriptionmax, pcchdescription.rawAddress)

public actual fun sQLDescribeCol(statementhandle: MutPtr<CVoid>, columnnumber: UShort, columnname: MutPtr<UByte>, bufferlength: Short, namelength: MutPtr<Short>, datatype: MutPtr<Short>, columnsize: MutPtr<ULong>, decimaldigits: MutPtr<Short>, nullable: MutPtr<Short>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLDescribeCol(statementhandle.rawAddress, columnnumber.toShort(), columnname.rawAddress, bufferlength, namelength.rawAddress, datatype.rawAddress, columnsize.rawAddress, decimaldigits.rawAddress, nullable.rawAddress)

public actual fun sQLDescribeColA(hstmt: MutPtr<CVoid>, icol: UShort, szcolname: MutPtr<UByte>, cbcolnamemax: Short, pcbcolname: MutPtr<Short>, pfsqltype: MutPtr<Short>, pcbcoldef: MutPtr<ULong>, pibscale: MutPtr<Short>, pfnullable: MutPtr<Short>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLDescribeColA(hstmt.rawAddress, icol.toShort(), szcolname.rawAddress, cbcolnamemax, pcbcolname.rawAddress, pfsqltype.rawAddress, pcbcoldef.rawAddress, pibscale.rawAddress, pfnullable.rawAddress)

public actual fun sQLDescribeColW(hstmt: MutPtr<CVoid>, icol: UShort, szcolname: MutPtr<UShort>, cchcolnamemax: Short, pcchcolname: MutPtr<Short>, pfsqltype: MutPtr<Short>, pcbcoldef: MutPtr<ULong>, pibscale: MutPtr<Short>, pfnullable: MutPtr<Short>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLDescribeColW(hstmt.rawAddress, icol.toShort(), szcolname.rawAddress, cchcolnamemax, pcchcolname.rawAddress, pfsqltype.rawAddress, pcbcoldef.rawAddress, pibscale.rawAddress, pfnullable.rawAddress)

public actual fun sQLDescribeParam(hstmt: MutPtr<CVoid>, ipar: UShort, pfsqltype: MutPtr<Short>, pcbparamdef: MutPtr<ULong>, pibscale: MutPtr<Short>, pfnullable: MutPtr<Short>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLDescribeParam(hstmt.rawAddress, ipar.toShort(), pfsqltype.rawAddress, pcbparamdef.rawAddress, pibscale.rawAddress, pfnullable.rawAddress)

public actual fun sQLDisconnect(connectionhandle: MutPtr<CVoid>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLDisconnect(connectionhandle.rawAddress)

public actual fun sQLDriverConnect(hdbc: MutPtr<CVoid>, hwnd: Long, szconnstrin: ConstPtr<UByte>, cchconnstrin: Short, szconnstrout: MutPtr<UByte>, cchconnstroutmax: Short, pcchconnstrout: MutPtr<Short>, fdrivercompletion: UShort): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLDriverConnect(hdbc.rawAddress, hwnd, szconnstrin.rawAddress, cchconnstrin, szconnstrout.rawAddress, cchconnstroutmax, pcchconnstrout.rawAddress, fdrivercompletion.toShort())

public actual fun sQLDriverConnectA(hdbc: MutPtr<CVoid>, hwnd: Long, szconnstrin: ConstPtr<UByte>, cbconnstrin: Short, szconnstrout: MutPtr<UByte>, cbconnstroutmax: Short, pcbconnstrout: MutPtr<Short>, fdrivercompletion: UShort): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLDriverConnectA(hdbc.rawAddress, hwnd, szconnstrin.rawAddress, cbconnstrin, szconnstrout.rawAddress, cbconnstroutmax, pcbconnstrout.rawAddress, fdrivercompletion.toShort())

public actual fun sQLDriverConnectW(hdbc: MutPtr<CVoid>, hwnd: Long, szconnstrin: ConstPtr<UShort>, cchconnstrin: Short, szconnstrout: MutPtr<UShort>, cchconnstroutmax: Short, pcchconnstrout: MutPtr<Short>, fdrivercompletion: UShort): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLDriverConnectW(hdbc.rawAddress, hwnd, szconnstrin.rawAddress, cchconnstrin, szconnstrout.rawAddress, cchconnstroutmax, pcchconnstrout.rawAddress, fdrivercompletion.toShort())

public actual fun sQLDrivers(henv: MutPtr<CVoid>, fdirection: UShort, szdriverdesc: MutPtr<UByte>, cchdriverdescmax: Short, pcchdriverdesc: MutPtr<Short>, szdriverattributes: MutPtr<UByte>, cchdrvrattrmax: Short, pcchdrvrattr: MutPtr<Short>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLDrivers(henv.rawAddress, fdirection.toShort(), szdriverdesc.rawAddress, cchdriverdescmax, pcchdriverdesc.rawAddress, szdriverattributes.rawAddress, cchdrvrattrmax, pcchdrvrattr.rawAddress)

public actual fun sQLDriversA(henv: MutPtr<CVoid>, fdirection: UShort, szdriverdesc: MutPtr<UByte>, cbdriverdescmax: Short, pcbdriverdesc: MutPtr<Short>, szdriverattributes: MutPtr<UByte>, cbdrvrattrmax: Short, pcbdrvrattr: MutPtr<Short>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLDriversA(henv.rawAddress, fdirection.toShort(), szdriverdesc.rawAddress, cbdriverdescmax, pcbdriverdesc.rawAddress, szdriverattributes.rawAddress, cbdrvrattrmax, pcbdrvrattr.rawAddress)

public actual fun sQLDriversW(henv: MutPtr<CVoid>, fdirection: UShort, szdriverdesc: MutPtr<UShort>, cchdriverdescmax: Short, pcchdriverdesc: MutPtr<Short>, szdriverattributes: MutPtr<UShort>, cchdrvrattrmax: Short, pcchdrvrattr: MutPtr<Short>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLDriversW(henv.rawAddress, fdirection.toShort(), szdriverdesc.rawAddress, cchdriverdescmax, pcchdriverdesc.rawAddress, szdriverattributes.rawAddress, cchdrvrattrmax, pcchdrvrattr.rawAddress)

public actual fun sQLEndTran(handletype: Short, handle: MutPtr<CVoid>, completiontype: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLEndTran(handletype, handle.rawAddress, completiontype)

public actual fun sQLError(environmenthandle: MutPtr<CVoid>, connectionhandle: MutPtr<CVoid>, statementhandle: MutPtr<CVoid>, sqlstate: MutPtr<UByte>, nativeerror: MutPtr<Int>, messagetext: MutPtr<UByte>, bufferlength: Short, textlength: MutPtr<Short>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLError(environmenthandle.rawAddress, connectionhandle.rawAddress, statementhandle.rawAddress, sqlstate.rawAddress, nativeerror.rawAddress, messagetext.rawAddress, bufferlength, textlength.rawAddress)

public actual fun sQLErrorA(henv: MutPtr<CVoid>, hdbc: MutPtr<CVoid>, hstmt: MutPtr<CVoid>, szsqlstate: MutPtr<UByte>, pfnativeerror: MutPtr<Int>, szerrormsg: MutPtr<UByte>, cberrormsgmax: Short, pcberrormsg: MutPtr<Short>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLErrorA(henv.rawAddress, hdbc.rawAddress, hstmt.rawAddress, szsqlstate.rawAddress, pfnativeerror.rawAddress, szerrormsg.rawAddress, cberrormsgmax, pcberrormsg.rawAddress)

public actual fun sQLErrorW(henv: MutPtr<CVoid>, hdbc: MutPtr<CVoid>, hstmt: MutPtr<CVoid>, wszsqlstate: MutPtr<UShort>, pfnativeerror: MutPtr<Int>, wszerrormsg: MutPtr<UShort>, ccherrormsgmax: Short, pccherrormsg: MutPtr<Short>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLErrorW(henv.rawAddress, hdbc.rawAddress, hstmt.rawAddress, wszsqlstate.rawAddress, pfnativeerror.rawAddress, wszerrormsg.rawAddress, ccherrormsgmax, pccherrormsg.rawAddress)

public actual fun sQLExecDirect(statementhandle: MutPtr<CVoid>, statementtext: ConstPtr<UByte>, textlength: Int): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLExecDirect(statementhandle.rawAddress, statementtext.rawAddress, textlength)

public actual fun sQLExecDirectA(hstmt: MutPtr<CVoid>, szsqlstr: ConstPtr<UByte>, cbsqlstr: Int): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLExecDirectA(hstmt.rawAddress, szsqlstr.rawAddress, cbsqlstr)

public actual fun sQLExecDirectW(hstmt: MutPtr<CVoid>, szsqlstr: ConstPtr<UShort>, textlength: Int): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLExecDirectW(hstmt.rawAddress, szsqlstr.rawAddress, textlength)

public actual fun sQLExecute(statementhandle: MutPtr<CVoid>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLExecute(statementhandle.rawAddress)

public actual fun sQLExtendedFetch(hstmt: MutPtr<CVoid>, ffetchtype: UShort, irow: Long, pcrow: MutPtr<ULong>, rgfrowstatus: MutPtr<UShort>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLExtendedFetch(hstmt.rawAddress, ffetchtype.toShort(), irow, pcrow.rawAddress, rgfrowstatus.rawAddress)

public actual fun sQLFetch(statementhandle: MutPtr<CVoid>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLFetch(statementhandle.rawAddress)

public actual fun sQLFetchScroll(statementhandle: MutPtr<CVoid>, fetchorientation: Short, fetchoffset: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLFetchScroll(statementhandle.rawAddress, fetchorientation, fetchoffset)

public actual fun sQLForeignKeys(hstmt: MutPtr<CVoid>, szpkcatalogname: ConstPtr<UByte>, cchpkcatalogname: Short, szpkschemaname: ConstPtr<UByte>, cchpkschemaname: Short, szpktablename: ConstPtr<UByte>, cchpktablename: Short, szfkcatalogname: ConstPtr<UByte>, cchfkcatalogname: Short, szfkschemaname: ConstPtr<UByte>, cchfkschemaname: Short, szfktablename: ConstPtr<UByte>, cchfktablename: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLForeignKeys(hstmt.rawAddress, szpkcatalogname.rawAddress, cchpkcatalogname, szpkschemaname.rawAddress, cchpkschemaname, szpktablename.rawAddress, cchpktablename, szfkcatalogname.rawAddress, cchfkcatalogname, szfkschemaname.rawAddress, cchfkschemaname, szfktablename.rawAddress, cchfktablename)

public actual fun sQLForeignKeysA(hstmt: MutPtr<CVoid>, szpkcatalogname: ConstPtr<UByte>, cbpkcatalogname: Short, szpkschemaname: ConstPtr<UByte>, cbpkschemaname: Short, szpktablename: ConstPtr<UByte>, cbpktablename: Short, szfkcatalogname: ConstPtr<UByte>, cbfkcatalogname: Short, szfkschemaname: ConstPtr<UByte>, cbfkschemaname: Short, szfktablename: ConstPtr<UByte>, cbfktablename: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLForeignKeysA(hstmt.rawAddress, szpkcatalogname.rawAddress, cbpkcatalogname, szpkschemaname.rawAddress, cbpkschemaname, szpktablename.rawAddress, cbpktablename, szfkcatalogname.rawAddress, cbfkcatalogname, szfkschemaname.rawAddress, cbfkschemaname, szfktablename.rawAddress, cbfktablename)

public actual fun sQLForeignKeysW(hstmt: MutPtr<CVoid>, szpkcatalogname: ConstPtr<UShort>, cchpkcatalogname: Short, szpkschemaname: ConstPtr<UShort>, cchpkschemaname: Short, szpktablename: ConstPtr<UShort>, cchpktablename: Short, szfkcatalogname: ConstPtr<UShort>, cchfkcatalogname: Short, szfkschemaname: ConstPtr<UShort>, cchfkschemaname: Short, szfktablename: ConstPtr<UShort>, cchfktablename: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLForeignKeysW(hstmt.rawAddress, szpkcatalogname.rawAddress, cchpkcatalogname, szpkschemaname.rawAddress, cchpkschemaname, szpktablename.rawAddress, cchpktablename, szfkcatalogname.rawAddress, cchfkcatalogname, szfkschemaname.rawAddress, cchfkschemaname, szfktablename.rawAddress, cchfktablename)

public actual fun sQLFreeConnect(connectionhandle: MutPtr<CVoid>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLFreeConnect(connectionhandle.rawAddress)

public actual fun sQLFreeEnv(environmenthandle: MutPtr<CVoid>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLFreeEnv(environmenthandle.rawAddress)

public actual fun sQLFreeHandle(handletype: Short, handle: MutPtr<CVoid>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLFreeHandle(handletype, handle.rawAddress)

public actual fun sQLFreeStmt(statementhandle: MutPtr<CVoid>, option: UShort): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLFreeStmt(statementhandle.rawAddress, option.toShort())

public actual fun sQLGetConnectAttr(connectionhandle: MutPtr<CVoid>, attribute: Int, value: MutPtr<CVoid>, bufferlength: Int, stringlengthptr: MutPtr<Int>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLGetConnectAttr(connectionhandle.rawAddress, attribute, value.rawAddress, bufferlength, stringlengthptr.rawAddress)

public actual fun sQLGetConnectAttrA(hdbc: MutPtr<CVoid>, fattribute: Int, rgbvalue: MutPtr<CVoid>, cbvaluemax: Int, pcbvalue: MutPtr<Int>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLGetConnectAttrA(hdbc.rawAddress, fattribute, rgbvalue.rawAddress, cbvaluemax, pcbvalue.rawAddress)

public actual fun sQLGetConnectAttrW(hdbc: MutPtr<CVoid>, fattribute: Int, rgbvalue: MutPtr<CVoid>, cbvaluemax: Int, pcbvalue: MutPtr<Int>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLGetConnectAttrW(hdbc.rawAddress, fattribute, rgbvalue.rawAddress, cbvaluemax, pcbvalue.rawAddress)

public actual fun sQLGetConnectOption(connectionhandle: MutPtr<CVoid>, option: UShort, value: MutPtr<CVoid>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLGetConnectOption(connectionhandle.rawAddress, option.toShort(), value.rawAddress)

public actual fun sQLGetConnectOptionA(hdbc: MutPtr<CVoid>, foption: UShort, pvparam: MutPtr<CVoid>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLGetConnectOptionA(hdbc.rawAddress, foption.toShort(), pvparam.rawAddress)

public actual fun sQLGetConnectOptionW(hdbc: MutPtr<CVoid>, foption: UShort, pvparam: MutPtr<CVoid>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLGetConnectOptionW(hdbc.rawAddress, foption.toShort(), pvparam.rawAddress)

public actual fun sQLGetCursorName(statementhandle: MutPtr<CVoid>, cursorname: MutPtr<UByte>, bufferlength: Short, namelengthptr: MutPtr<Short>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLGetCursorName(statementhandle.rawAddress, cursorname.rawAddress, bufferlength, namelengthptr.rawAddress)

public actual fun sQLGetCursorNameA(hstmt: MutPtr<CVoid>, szcursor: MutPtr<UByte>, cbcursormax: Short, pcbcursor: MutPtr<Short>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLGetCursorNameA(hstmt.rawAddress, szcursor.rawAddress, cbcursormax, pcbcursor.rawAddress)

public actual fun sQLGetCursorNameW(hstmt: MutPtr<CVoid>, szcursor: MutPtr<UShort>, cchcursormax: Short, pcchcursor: MutPtr<Short>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLGetCursorNameW(hstmt.rawAddress, szcursor.rawAddress, cchcursormax, pcchcursor.rawAddress)

public actual fun sQLGetData(statementhandle: MutPtr<CVoid>, columnnumber: UShort, targettype: Short, targetvalue: MutPtr<CVoid>, bufferlength: Long, strlenOrIndptr: MutPtr<Long>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLGetData(statementhandle.rawAddress, columnnumber.toShort(), targettype, targetvalue.rawAddress, bufferlength, strlenOrIndptr.rawAddress)

public actual fun sQLGetDescField(descriptorhandle: MutPtr<CVoid>, recnumber: Short, fieldidentifier: Short, value: MutPtr<CVoid>, bufferlength: Int, stringlength: MutPtr<Int>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLGetDescField(descriptorhandle.rawAddress, recnumber, fieldidentifier, value.rawAddress, bufferlength, stringlength.rawAddress)

public actual fun sQLGetDescFieldA(hdesc: MutPtr<CVoid>, irecord: Short, ifield: Short, rgbvalue: MutPtr<CVoid>, cbbufferlength: Int, stringlength: MutPtr<Int>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLGetDescFieldA(hdesc.rawAddress, irecord, ifield, rgbvalue.rawAddress, cbbufferlength, stringlength.rawAddress)

public actual fun sQLGetDescFieldW(hdesc: MutPtr<CVoid>, irecord: Short, ifield: Short, rgbvalue: MutPtr<CVoid>, cbbufferlength: Int, stringlength: MutPtr<Int>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLGetDescFieldW(hdesc.rawAddress, irecord, ifield, rgbvalue.rawAddress, cbbufferlength, stringlength.rawAddress)

public actual fun sQLGetDescRec(descriptorhandle: MutPtr<CVoid>, recnumber: Short, name: MutPtr<UByte>, bufferlength: Short, stringlengthptr: MutPtr<Short>, typeptr: MutPtr<Short>, subtypeptr: MutPtr<Short>, lengthptr: MutPtr<Long>, precisionptr: MutPtr<Short>, scaleptr: MutPtr<Short>, nullableptr: MutPtr<Short>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLGetDescRec(descriptorhandle.rawAddress, recnumber, name.rawAddress, bufferlength, stringlengthptr.rawAddress, typeptr.rawAddress, subtypeptr.rawAddress, lengthptr.rawAddress, precisionptr.rawAddress, scaleptr.rawAddress, nullableptr.rawAddress)

public actual fun sQLGetDescRecA(hdesc: MutPtr<CVoid>, irecord: Short, szname: MutPtr<UByte>, cbnamemax: Short, pcbname: MutPtr<Short>, pftype: MutPtr<Short>, pfsubtype: MutPtr<Short>, plength: MutPtr<Long>, pprecision: MutPtr<Short>, pscale: MutPtr<Short>, pnullable: MutPtr<Short>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLGetDescRecA(hdesc.rawAddress, irecord, szname.rawAddress, cbnamemax, pcbname.rawAddress, pftype.rawAddress, pfsubtype.rawAddress, plength.rawAddress, pprecision.rawAddress, pscale.rawAddress, pnullable.rawAddress)

public actual fun sQLGetDescRecW(hdesc: MutPtr<CVoid>, irecord: Short, szname: MutPtr<UShort>, cchnamemax: Short, pcchname: MutPtr<Short>, pftype: MutPtr<Short>, pfsubtype: MutPtr<Short>, plength: MutPtr<Long>, pprecision: MutPtr<Short>, pscale: MutPtr<Short>, pnullable: MutPtr<Short>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLGetDescRecW(hdesc.rawAddress, irecord, szname.rawAddress, cchnamemax, pcchname.rawAddress, pftype.rawAddress, pfsubtype.rawAddress, plength.rawAddress, pprecision.rawAddress, pscale.rawAddress, pnullable.rawAddress)

public actual fun sQLGetDiagField(handletype: Short, handle: MutPtr<CVoid>, recnumber: Short, diagidentifier: Short, diaginfo: MutPtr<CVoid>, bufferlength: Short, stringlength: MutPtr<Short>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLGetDiagField(handletype, handle.rawAddress, recnumber, diagidentifier, diaginfo.rawAddress, bufferlength, stringlength.rawAddress)

public actual fun sQLGetDiagFieldA(fhandletype: Short, handle: MutPtr<CVoid>, irecord: Short, fdiagfield: Short, rgbdiaginfo: MutPtr<CVoid>, cbdiaginfomax: Short, pcbdiaginfo: MutPtr<Short>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLGetDiagFieldA(fhandletype, handle.rawAddress, irecord, fdiagfield, rgbdiaginfo.rawAddress, cbdiaginfomax, pcbdiaginfo.rawAddress)

public actual fun sQLGetDiagFieldW(fhandletype: Short, handle: MutPtr<CVoid>, irecord: Short, fdiagfield: Short, rgbdiaginfo: MutPtr<CVoid>, cbbufferlength: Short, pcbstringlength: MutPtr<Short>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLGetDiagFieldW(fhandletype, handle.rawAddress, irecord, fdiagfield, rgbdiaginfo.rawAddress, cbbufferlength, pcbstringlength.rawAddress)

public actual fun sQLGetDiagRec(handletype: Short, handle: MutPtr<CVoid>, recnumber: Short, sqlstate: MutPtr<UByte>, nativeerror: MutPtr<Int>, messagetext: MutPtr<UByte>, bufferlength: Short, textlength: MutPtr<Short>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLGetDiagRec(handletype, handle.rawAddress, recnumber, sqlstate.rawAddress, nativeerror.rawAddress, messagetext.rawAddress, bufferlength, textlength.rawAddress)

public actual fun sQLGetDiagRecA(fhandletype: Short, handle: MutPtr<CVoid>, irecord: Short, szsqlstate: MutPtr<UByte>, pfnativeerror: MutPtr<Int>, szerrormsg: MutPtr<UByte>, cberrormsgmax: Short, pcberrormsg: MutPtr<Short>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLGetDiagRecA(fhandletype, handle.rawAddress, irecord, szsqlstate.rawAddress, pfnativeerror.rawAddress, szerrormsg.rawAddress, cberrormsgmax, pcberrormsg.rawAddress)

public actual fun sQLGetDiagRecW(fhandletype: Short, handle: MutPtr<CVoid>, irecord: Short, szsqlstate: MutPtr<UShort>, pfnativeerror: MutPtr<Int>, szerrormsg: MutPtr<UShort>, ccherrormsgmax: Short, pccherrormsg: MutPtr<Short>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLGetDiagRecW(fhandletype, handle.rawAddress, irecord, szsqlstate.rawAddress, pfnativeerror.rawAddress, szerrormsg.rawAddress, ccherrormsgmax, pccherrormsg.rawAddress)

public actual fun sQLGetEnvAttr(environmenthandle: MutPtr<CVoid>, attribute: Int, value: MutPtr<CVoid>, bufferlength: Int, stringlength: MutPtr<Int>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLGetEnvAttr(environmenthandle.rawAddress, attribute, value.rawAddress, bufferlength, stringlength.rawAddress)

public actual fun sQLGetFunctions(connectionhandle: MutPtr<CVoid>, functionid: UShort, supported: MutPtr<UShort>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLGetFunctions(connectionhandle.rawAddress, functionid.toShort(), supported.rawAddress)

public actual fun sQLGetInfo(connectionhandle: MutPtr<CVoid>, infotype: UShort, infovalue: MutPtr<CVoid>, bufferlength: Short, stringlengthptr: MutPtr<Short>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLGetInfo(connectionhandle.rawAddress, infotype.toShort(), infovalue.rawAddress, bufferlength, stringlengthptr.rawAddress)

public actual fun sQLGetInfoA(hdbc: MutPtr<CVoid>, finfotype: UShort, rgbinfovalue: MutPtr<CVoid>, cbinfovaluemax: Short, pcbinfovalue: MutPtr<Short>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLGetInfoA(hdbc.rawAddress, finfotype.toShort(), rgbinfovalue.rawAddress, cbinfovaluemax, pcbinfovalue.rawAddress)

public actual fun sQLGetInfoW(hdbc: MutPtr<CVoid>, finfotype: UShort, rgbinfovalue: MutPtr<CVoid>, cbinfovaluemax: Short, pcbinfovalue: MutPtr<Short>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLGetInfoW(hdbc.rawAddress, finfotype.toShort(), rgbinfovalue.rawAddress, cbinfovaluemax, pcbinfovalue.rawAddress)

public actual fun sQLGetNextEnumeration(henumhandle: Handle, prgenumdata: MutPtr<UByte>, pienumlength: MutPtr<Int>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLGetNextEnumeration(henumhandle.rawAddress, prgenumdata.rawAddress, pienumlength.rawAddress)

public actual fun sQLGetStmtAttr(statementhandle: MutPtr<CVoid>, attribute: Int, value: MutPtr<CVoid>, bufferlength: Int, stringlength: MutPtr<Int>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLGetStmtAttr(statementhandle.rawAddress, attribute, value.rawAddress, bufferlength, stringlength.rawAddress)

public actual fun sQLGetStmtAttrA(hstmt: MutPtr<CVoid>, fattribute: Int, rgbvalue: MutPtr<CVoid>, cbvaluemax: Int, pcbvalue: MutPtr<Int>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLGetStmtAttrA(hstmt.rawAddress, fattribute, rgbvalue.rawAddress, cbvaluemax, pcbvalue.rawAddress)

public actual fun sQLGetStmtAttrW(hstmt: MutPtr<CVoid>, fattribute: Int, rgbvalue: MutPtr<CVoid>, cbvaluemax: Int, pcbvalue: MutPtr<Int>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLGetStmtAttrW(hstmt.rawAddress, fattribute, rgbvalue.rawAddress, cbvaluemax, pcbvalue.rawAddress)

public actual fun sQLGetStmtOption(statementhandle: MutPtr<CVoid>, option: UShort, value: MutPtr<CVoid>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLGetStmtOption(statementhandle.rawAddress, option.toShort(), value.rawAddress)

public actual fun sQLGetTypeInfo(statementhandle: MutPtr<CVoid>, datatype: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLGetTypeInfo(statementhandle.rawAddress, datatype)

public actual fun sQLGetTypeInfoA(statementhandle: MutPtr<CVoid>, datatype: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLGetTypeInfoA(statementhandle.rawAddress, datatype)

public actual fun sQLGetTypeInfoW(statementhandle: MutPtr<CVoid>, datatype: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLGetTypeInfoW(statementhandle.rawAddress, datatype)

public actual fun sQLInitEnumServers(pwchservername: Pcwstr, pwchinstancename: Pcwstr): Handle =
    MutPtr(WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLInitEnumServers(pwchservername.rawAddress, pwchinstancename.rawAddress))

public actual fun sQLLinkedCatalogsA(param0: MutPtr<CVoid>, param1: Pcstr, param2: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLLinkedCatalogsA(param0.rawAddress, param1.rawAddress, param2)

public actual fun sQLLinkedCatalogsW(param0: MutPtr<CVoid>, param1: Pcwstr, param2: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLLinkedCatalogsW(param0.rawAddress, param1.rawAddress, param2)

public actual fun sQLLinkedServers(param0: MutPtr<CVoid>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLLinkedServers(param0.rawAddress)

public actual fun sQLMoreResults(hstmt: MutPtr<CVoid>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLMoreResults(hstmt.rawAddress)

public actual fun sQLNativeSql(hdbc: MutPtr<CVoid>, szsqlstrin: ConstPtr<UByte>, cchsqlstrin: Int, szsqlstr: MutPtr<UByte>, cchsqlstrmax: Int, pcbsqlstr: MutPtr<Int>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLNativeSql(hdbc.rawAddress, szsqlstrin.rawAddress, cchsqlstrin, szsqlstr.rawAddress, cchsqlstrmax, pcbsqlstr.rawAddress)

public actual fun sQLNativeSqlA(hdbc: MutPtr<CVoid>, szsqlstrin: ConstPtr<UByte>, cbsqlstrin: Int, szsqlstr: MutPtr<UByte>, cbsqlstrmax: Int, pcbsqlstr: MutPtr<Int>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLNativeSqlA(hdbc.rawAddress, szsqlstrin.rawAddress, cbsqlstrin, szsqlstr.rawAddress, cbsqlstrmax, pcbsqlstr.rawAddress)

public actual fun sQLNativeSqlW(hdbc: MutPtr<CVoid>, szsqlstrin: ConstPtr<UShort>, cchsqlstrin: Int, szsqlstr: MutPtr<UShort>, cchsqlstrmax: Int, pcchsqlstr: MutPtr<Int>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLNativeSqlW(hdbc.rawAddress, szsqlstrin.rawAddress, cchsqlstrin, szsqlstr.rawAddress, cchsqlstrmax, pcchsqlstr.rawAddress)

public actual fun sQLNumParams(hstmt: MutPtr<CVoid>, pcpar: MutPtr<Short>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLNumParams(hstmt.rawAddress, pcpar.rawAddress)

public actual fun sQLNumResultCols(statementhandle: MutPtr<CVoid>, columncount: MutPtr<Short>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLNumResultCols(statementhandle.rawAddress, columncount.rawAddress)

public actual fun sQLParamData(statementhandle: MutPtr<CVoid>, value: MutPtr<MutPtr<CVoid>>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLParamData(statementhandle.rawAddress, value.rawAddress)

public actual fun sQLParamOptions(hstmt: MutPtr<CVoid>, crow: ULong, pirow: MutPtr<ULong>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLParamOptions(hstmt.rawAddress, crow.toLong(), pirow.rawAddress)

public actual fun sQLPrepare(statementhandle: MutPtr<CVoid>, statementtext: ConstPtr<UByte>, textlength: Int): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLPrepare(statementhandle.rawAddress, statementtext.rawAddress, textlength)

public actual fun sQLPrepareA(hstmt: MutPtr<CVoid>, szsqlstr: ConstPtr<UByte>, cbsqlstr: Int): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLPrepareA(hstmt.rawAddress, szsqlstr.rawAddress, cbsqlstr)

public actual fun sQLPrepareW(hstmt: MutPtr<CVoid>, szsqlstr: ConstPtr<UShort>, cchsqlstr: Int): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLPrepareW(hstmt.rawAddress, szsqlstr.rawAddress, cchsqlstr)

public actual fun sQLPrimaryKeys(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UByte>, cchcatalogname: Short, szschemaname: ConstPtr<UByte>, cchschemaname: Short, sztablename: ConstPtr<UByte>, cchtablename: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLPrimaryKeys(hstmt.rawAddress, szcatalogname.rawAddress, cchcatalogname, szschemaname.rawAddress, cchschemaname, sztablename.rawAddress, cchtablename)

public actual fun sQLPrimaryKeysA(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UByte>, cbcatalogname: Short, szschemaname: ConstPtr<UByte>, cbschemaname: Short, sztablename: ConstPtr<UByte>, cbtablename: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLPrimaryKeysA(hstmt.rawAddress, szcatalogname.rawAddress, cbcatalogname, szschemaname.rawAddress, cbschemaname, sztablename.rawAddress, cbtablename)

public actual fun sQLPrimaryKeysW(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UShort>, cchcatalogname: Short, szschemaname: ConstPtr<UShort>, cchschemaname: Short, sztablename: ConstPtr<UShort>, cchtablename: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLPrimaryKeysW(hstmt.rawAddress, szcatalogname.rawAddress, cchcatalogname, szschemaname.rawAddress, cchschemaname, sztablename.rawAddress, cchtablename)

public actual fun sQLProcedureColumns(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UByte>, cchcatalogname: Short, szschemaname: ConstPtr<UByte>, cchschemaname: Short, szprocname: ConstPtr<UByte>, cchprocname: Short, szcolumnname: ConstPtr<UByte>, cchcolumnname: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLProcedureColumns(hstmt.rawAddress, szcatalogname.rawAddress, cchcatalogname, szschemaname.rawAddress, cchschemaname, szprocname.rawAddress, cchprocname, szcolumnname.rawAddress, cchcolumnname)

public actual fun sQLProcedureColumnsA(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UByte>, cbcatalogname: Short, szschemaname: ConstPtr<UByte>, cbschemaname: Short, szprocname: ConstPtr<UByte>, cbprocname: Short, szcolumnname: ConstPtr<UByte>, cbcolumnname: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLProcedureColumnsA(hstmt.rawAddress, szcatalogname.rawAddress, cbcatalogname, szschemaname.rawAddress, cbschemaname, szprocname.rawAddress, cbprocname, szcolumnname.rawAddress, cbcolumnname)

public actual fun sQLProcedureColumnsW(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UShort>, cchcatalogname: Short, szschemaname: ConstPtr<UShort>, cchschemaname: Short, szprocname: ConstPtr<UShort>, cchprocname: Short, szcolumnname: ConstPtr<UShort>, cchcolumnname: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLProcedureColumnsW(hstmt.rawAddress, szcatalogname.rawAddress, cchcatalogname, szschemaname.rawAddress, cchschemaname, szprocname.rawAddress, cchprocname, szcolumnname.rawAddress, cchcolumnname)

public actual fun sQLProcedures(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UByte>, cchcatalogname: Short, szschemaname: ConstPtr<UByte>, cchschemaname: Short, szprocname: ConstPtr<UByte>, cchprocname: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLProcedures(hstmt.rawAddress, szcatalogname.rawAddress, cchcatalogname, szschemaname.rawAddress, cchschemaname, szprocname.rawAddress, cchprocname)

public actual fun sQLProceduresA(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UByte>, cbcatalogname: Short, szschemaname: ConstPtr<UByte>, cbschemaname: Short, szprocname: ConstPtr<UByte>, cbprocname: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLProceduresA(hstmt.rawAddress, szcatalogname.rawAddress, cbcatalogname, szschemaname.rawAddress, cbschemaname, szprocname.rawAddress, cbprocname)

public actual fun sQLProceduresW(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UShort>, cchcatalogname: Short, szschemaname: ConstPtr<UShort>, cchschemaname: Short, szprocname: ConstPtr<UShort>, cchprocname: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLProceduresW(hstmt.rawAddress, szcatalogname.rawAddress, cchcatalogname, szschemaname.rawAddress, cchschemaname, szprocname.rawAddress, cchprocname)

public actual fun sQLPutData(statementhandle: MutPtr<CVoid>, data: ConstPtr<CVoid>, strlenOrInd: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLPutData(statementhandle.rawAddress, data.rawAddress, strlenOrInd)

public actual fun sQLRowCount(statementhandle: ConstPtr<CVoid>, rowcount: MutPtr<Long>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLRowCount(statementhandle.rawAddress, rowcount.rawAddress)

public actual fun sQLSetConnectAttr(connectionhandle: MutPtr<CVoid>, attribute: Int, value: ConstPtr<CVoid>, stringlength: Int): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLSetConnectAttr(connectionhandle.rawAddress, attribute, value.rawAddress, stringlength)

public actual fun sQLSetConnectAttrA(hdbc: MutPtr<CVoid>, fattribute: Int, rgbvalue: ConstPtr<CVoid>, cbvalue: Int): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLSetConnectAttrA(hdbc.rawAddress, fattribute, rgbvalue.rawAddress, cbvalue)

public actual fun sQLSetConnectAttrW(hdbc: MutPtr<CVoid>, fattribute: Int, rgbvalue: ConstPtr<CVoid>, cbvalue: Int): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLSetConnectAttrW(hdbc.rawAddress, fattribute, rgbvalue.rawAddress, cbvalue)

public actual fun sQLSetConnectOption(connectionhandle: MutPtr<CVoid>, option: UShort, value: ULong): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLSetConnectOption(connectionhandle.rawAddress, option.toShort(), value.toLong())

public actual fun sQLSetConnectOptionA(hdbc: MutPtr<CVoid>, foption: UShort, vparam: ULong): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLSetConnectOptionA(hdbc.rawAddress, foption.toShort(), vparam.toLong())

public actual fun sQLSetConnectOptionW(hdbc: MutPtr<CVoid>, foption: UShort, vparam: ULong): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLSetConnectOptionW(hdbc.rawAddress, foption.toShort(), vparam.toLong())

public actual fun sQLSetCursorName(statementhandle: MutPtr<CVoid>, cursorname: ConstPtr<UByte>, namelength: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLSetCursorName(statementhandle.rawAddress, cursorname.rawAddress, namelength)

public actual fun sQLSetCursorNameA(hstmt: MutPtr<CVoid>, szcursor: ConstPtr<UByte>, cbcursor: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLSetCursorNameA(hstmt.rawAddress, szcursor.rawAddress, cbcursor)

public actual fun sQLSetCursorNameW(hstmt: MutPtr<CVoid>, szcursor: ConstPtr<UShort>, cchcursor: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLSetCursorNameW(hstmt.rawAddress, szcursor.rawAddress, cchcursor)

public actual fun sQLSetDescField(descriptorhandle: MutPtr<CVoid>, recnumber: Short, fieldidentifier: Short, value: ConstPtr<CVoid>, bufferlength: Int): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLSetDescField(descriptorhandle.rawAddress, recnumber, fieldidentifier, value.rawAddress, bufferlength)

public actual fun sQLSetDescFieldW(descriptorhandle: MutPtr<CVoid>, recnumber: Short, fieldidentifier: Short, value: MutPtr<CVoid>, bufferlength: Int): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLSetDescFieldW(descriptorhandle.rawAddress, recnumber, fieldidentifier, value.rawAddress, bufferlength)

public actual fun sQLSetDescRec(descriptorhandle: MutPtr<CVoid>, recnumber: Short, type: Short, subtype: Short, length: Long, precision: Short, scale: Short, data: MutPtr<CVoid>, stringlength: MutPtr<Long>, indicator: MutPtr<Long>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLSetDescRec(descriptorhandle.rawAddress, recnumber, type, subtype, length, precision, scale, data.rawAddress, stringlength.rawAddress, indicator.rawAddress)

public actual fun sQLSetEnvAttr(environmenthandle: MutPtr<CVoid>, attribute: Int, value: ConstPtr<CVoid>, stringlength: Int): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLSetEnvAttr(environmenthandle.rawAddress, attribute, value.rawAddress, stringlength)

public actual fun sQLSetParam(statementhandle: MutPtr<CVoid>, parameternumber: UShort, valuetype: Short, parametertype: Short, lengthprecision: ULong, parameterscale: Short, parametervalue: ConstPtr<CVoid>, strlenOrInd: MutPtr<Long>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLSetParam(statementhandle.rawAddress, parameternumber.toShort(), valuetype, parametertype, lengthprecision.toLong(), parameterscale, parametervalue.rawAddress, strlenOrInd.rawAddress)

public actual fun sQLSetPos(hstmt: MutPtr<CVoid>, irow: ULong, foption: UShort, flock: UShort): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLSetPos(hstmt.rawAddress, irow.toLong(), foption.toShort(), flock.toShort())

public actual fun sQLSetScrollOptions(hstmt: MutPtr<CVoid>, fconcurrency: UShort, crowkeyset: Long, crowrowset: UShort): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLSetScrollOptions(hstmt.rawAddress, fconcurrency.toShort(), crowkeyset, crowrowset.toShort())

public actual fun sQLSetStmtAttr(statementhandle: MutPtr<CVoid>, attribute: Int, value: ConstPtr<CVoid>, stringlength: Int): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLSetStmtAttr(statementhandle.rawAddress, attribute, value.rawAddress, stringlength)

public actual fun sQLSetStmtAttrW(hstmt: MutPtr<CVoid>, fattribute: Int, rgbvalue: MutPtr<CVoid>, cbvaluemax: Int): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLSetStmtAttrW(hstmt.rawAddress, fattribute, rgbvalue.rawAddress, cbvaluemax)

public actual fun sQLSetStmtOption(statementhandle: MutPtr<CVoid>, option: UShort, value: ULong): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLSetStmtOption(statementhandle.rawAddress, option.toShort(), value.toLong())

public actual fun sQLSpecialColumns(statementhandle: MutPtr<CVoid>, identifiertype: UShort, catalogname: ConstPtr<UByte>, namelength1: Short, schemaname: ConstPtr<UByte>, namelength2: Short, tablename: ConstPtr<UByte>, namelength3: Short, scope: UShort, nullable: UShort): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLSpecialColumns(statementhandle.rawAddress, identifiertype.toShort(), catalogname.rawAddress, namelength1, schemaname.rawAddress, namelength2, tablename.rawAddress, namelength3, scope.toShort(), nullable.toShort())

public actual fun sQLSpecialColumnsA(hstmt: MutPtr<CVoid>, fcoltype: UShort, szcatalogname: ConstPtr<UByte>, cbcatalogname: Short, szschemaname: ConstPtr<UByte>, cbschemaname: Short, sztablename: ConstPtr<UByte>, cbtablename: Short, fscope: UShort, fnullable: UShort): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLSpecialColumnsA(hstmt.rawAddress, fcoltype.toShort(), szcatalogname.rawAddress, cbcatalogname, szschemaname.rawAddress, cbschemaname, sztablename.rawAddress, cbtablename, fscope.toShort(), fnullable.toShort())

public actual fun sQLSpecialColumnsW(hstmt: MutPtr<CVoid>, fcoltype: UShort, szcatalogname: ConstPtr<UShort>, cchcatalogname: Short, szschemaname: ConstPtr<UShort>, cchschemaname: Short, sztablename: ConstPtr<UShort>, cchtablename: Short, fscope: UShort, fnullable: UShort): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLSpecialColumnsW(hstmt.rawAddress, fcoltype.toShort(), szcatalogname.rawAddress, cchcatalogname, szschemaname.rawAddress, cchschemaname, sztablename.rawAddress, cchtablename, fscope.toShort(), fnullable.toShort())

public actual fun sQLStatistics(statementhandle: MutPtr<CVoid>, catalogname: ConstPtr<UByte>, namelength1: Short, schemaname: ConstPtr<UByte>, namelength2: Short, tablename: ConstPtr<UByte>, namelength3: Short, unique: UShort, reserved: UShort): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLStatistics(statementhandle.rawAddress, catalogname.rawAddress, namelength1, schemaname.rawAddress, namelength2, tablename.rawAddress, namelength3, unique.toShort(), reserved.toShort())

public actual fun sQLStatisticsA(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UByte>, cbcatalogname: Short, szschemaname: ConstPtr<UByte>, cbschemaname: Short, sztablename: ConstPtr<UByte>, cbtablename: Short, funique: UShort, faccuracy: UShort): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLStatisticsA(hstmt.rawAddress, szcatalogname.rawAddress, cbcatalogname, szschemaname.rawAddress, cbschemaname, sztablename.rawAddress, cbtablename, funique.toShort(), faccuracy.toShort())

public actual fun sQLStatisticsW(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UShort>, cchcatalogname: Short, szschemaname: ConstPtr<UShort>, cchschemaname: Short, sztablename: ConstPtr<UShort>, cchtablename: Short, funique: UShort, faccuracy: UShort): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLStatisticsW(hstmt.rawAddress, szcatalogname.rawAddress, cchcatalogname, szschemaname.rawAddress, cchschemaname, sztablename.rawAddress, cchtablename, funique.toShort(), faccuracy.toShort())

public actual fun sQLTablePrivileges(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UByte>, cchcatalogname: Short, szschemaname: ConstPtr<UByte>, cchschemaname: Short, sztablename: ConstPtr<UByte>, cchtablename: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLTablePrivileges(hstmt.rawAddress, szcatalogname.rawAddress, cchcatalogname, szschemaname.rawAddress, cchschemaname, sztablename.rawAddress, cchtablename)

public actual fun sQLTablePrivilegesA(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UByte>, cbcatalogname: Short, szschemaname: ConstPtr<UByte>, cbschemaname: Short, sztablename: ConstPtr<UByte>, cbtablename: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLTablePrivilegesA(hstmt.rawAddress, szcatalogname.rawAddress, cbcatalogname, szschemaname.rawAddress, cbschemaname, sztablename.rawAddress, cbtablename)

public actual fun sQLTablePrivilegesW(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UShort>, cchcatalogname: Short, szschemaname: ConstPtr<UShort>, cchschemaname: Short, sztablename: ConstPtr<UShort>, cchtablename: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLTablePrivilegesW(hstmt.rawAddress, szcatalogname.rawAddress, cchcatalogname, szschemaname.rawAddress, cchschemaname, sztablename.rawAddress, cchtablename)

public actual fun sQLTables(statementhandle: MutPtr<CVoid>, catalogname: ConstPtr<UByte>, namelength1: Short, schemaname: ConstPtr<UByte>, namelength2: Short, tablename: ConstPtr<UByte>, namelength3: Short, tabletype: ConstPtr<UByte>, namelength4: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLTables(statementhandle.rawAddress, catalogname.rawAddress, namelength1, schemaname.rawAddress, namelength2, tablename.rawAddress, namelength3, tabletype.rawAddress, namelength4)

public actual fun sQLTablesA(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UByte>, cbcatalogname: Short, szschemaname: ConstPtr<UByte>, cbschemaname: Short, sztablename: ConstPtr<UByte>, cbtablename: Short, sztabletype: ConstPtr<UByte>, cbtabletype: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLTablesA(hstmt.rawAddress, szcatalogname.rawAddress, cbcatalogname, szschemaname.rawAddress, cbschemaname, sztablename.rawAddress, cbtablename, sztabletype.rawAddress, cbtabletype)

public actual fun sQLTablesW(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UShort>, cchcatalogname: Short, szschemaname: ConstPtr<UShort>, cchschemaname: Short, sztablename: ConstPtr<UShort>, cchtablename: Short, sztabletype: ConstPtr<UShort>, cchtabletype: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLTablesW(hstmt.rawAddress, szcatalogname.rawAddress, cchcatalogname, szschemaname.rawAddress, cchschemaname, sztablename.rawAddress, cchtablename, sztabletype.rawAddress, cchtabletype)

public actual fun sQLTransact(environmenthandle: MutPtr<CVoid>, connectionhandle: MutPtr<CVoid>, completiontype: UShort): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchSQLTransact(environmenthandle.rawAddress, connectionhandle.rawAddress, completiontype.toShort())

public actual fun bcpBatch(param0: MutPtr<CVoid>): Int =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchBcpBatch(param0.rawAddress)

public actual fun bcpBind(param0: MutPtr<CVoid>, param1: MutPtr<UByte>, param2: Int, param3: Int, param4: MutPtr<UByte>, param5: Int, param6: Int, param7: Int): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchBcpBind(param0.rawAddress, param1.rawAddress, param2, param3, param4.rawAddress, param5, param6, param7)

public actual fun bcpColfmt(param0: MutPtr<CVoid>, param1: Int, param2: UByte, param3: Int, param4: Int, param5: MutPtr<UByte>, param6: Int, param7: Int): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchBcpColfmt(param0.rawAddress, param1, param2.toByte(), param3, param4, param5.rawAddress, param6, param7)

public actual fun bcpCollen(param0: MutPtr<CVoid>, param1: Int, param2: Int): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchBcpCollen(param0.rawAddress, param1, param2)

public actual fun bcpColptr(param0: MutPtr<CVoid>, param1: MutPtr<UByte>, param2: Int): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchBcpColptr(param0.rawAddress, param1.rawAddress, param2)

public actual fun bcpColumns(param0: MutPtr<CVoid>, param1: Int): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchBcpColumns(param0.rawAddress, param1)

public actual fun bcpControl(param0: MutPtr<CVoid>, param1: Int, param2: MutPtr<CVoid>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchBcpControl(param0.rawAddress, param1, param2.rawAddress)

public actual fun bcpDone(param0: MutPtr<CVoid>): Int =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchBcpDone(param0.rawAddress)

public actual fun bcpExec(param0: MutPtr<CVoid>, param1: MutPtr<Int>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchBcpExec(param0.rawAddress, param1.rawAddress)

public actual fun bcpGetcolfmt(param0: MutPtr<CVoid>, param1: Int, param2: Int, param3: MutPtr<CVoid>, param4: Int, param5: MutPtr<Int>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchBcpGetcolfmt(param0.rawAddress, param1, param2, param3.rawAddress, param4, param5.rawAddress)

public actual fun bcpInitA(param0: MutPtr<CVoid>, param1: Pcstr, param2: Pcstr, param3: Pcstr, param4: Int): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchBcpInitA(param0.rawAddress, param1.rawAddress, param2.rawAddress, param3.rawAddress, param4)

public actual fun bcpInitW(param0: MutPtr<CVoid>, param1: Pcwstr, param2: Pcwstr, param3: Pcwstr, param4: Int): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchBcpInitW(param0.rawAddress, param1.rawAddress, param2.rawAddress, param3.rawAddress, param4)

public actual fun bcpMoretext(param0: MutPtr<CVoid>, param1: Int, param2: MutPtr<UByte>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchBcpMoretext(param0.rawAddress, param1, param2.rawAddress)

public actual fun bcpReadfmtA(param0: MutPtr<CVoid>, param1: Pcstr): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchBcpReadfmtA(param0.rawAddress, param1.rawAddress)

public actual fun bcpReadfmtW(param0: MutPtr<CVoid>, param1: Pcwstr): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchBcpReadfmtW(param0.rawAddress, param1.rawAddress)

public actual fun bcpSendrow(param0: MutPtr<CVoid>): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchBcpSendrow(param0.rawAddress)

public actual fun bcpSetcolfmt(param0: MutPtr<CVoid>, param1: Int, param2: Int, param3: MutPtr<CVoid>, param4: Int): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchBcpSetcolfmt(param0.rawAddress, param1, param2, param3.rawAddress, param4)

public actual fun bcpWritefmtA(param0: MutPtr<CVoid>, param1: Pcstr): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchBcpWritefmtA(param0.rawAddress, param1.rawAddress)

public actual fun bcpWritefmtW(param0: MutPtr<CVoid>, param1: Pcwstr): Short =
    WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchBcpWritefmtW(param0.rawAddress, param1.rawAddress)

public actual fun dbprtypeA(param0: Int): Pstr =
    MutPtr(WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchDbprtypeA(param0))

public actual fun dbprtypeW(param0: Int): Pwstr =
    MutPtr(WindowsWin32SystemSearchJniBridge.windowssysWindowsWin32SystemSearchDbprtypeW(param0))
