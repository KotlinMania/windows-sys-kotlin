@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.search

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

private object WindowsWin32SystemSearchJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_search_ODBCGetTryWaitValue(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_search_ODBCSetTryWaitValue(dwvalue: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLAllocConnect(environmenthandle: Long, connectionhandle: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLAllocEnv(environmenthandle: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLAllocHandle(handletype: Short, inputhandle: Long, outputhandle: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLAllocHandleStd(fhandletype: Short, hinput: Long, phoutput: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLAllocStmt(connectionhandle: Long, statementhandle: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLBindCol(statementhandle: Long, columnnumber: Short, targettype: Short, targetvalue: Long, bufferlength: Long, strlen_or_ind: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLBindParam(statementhandle: Long, parameternumber: Short, valuetype: Short, parametertype: Short, lengthprecision: Long, parameterscale: Short, parametervalue: Long, strlen_or_ind: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLBindParameter(hstmt: Long, ipar: Short, fparamtype: Short, fctype: Short, fsqltype: Short, cbcoldef: Long, ibscale: Short, rgbvalue: Long, cbvaluemax: Long, pcbvalue: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLBrowseConnect(hdbc: Long, szconnstrin: Long, cchconnstrin: Short, szconnstrout: Long, cchconnstroutmax: Short, pcchconnstrout: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLBrowseConnectA(hdbc: Long, szconnstrin: Long, cbconnstrin: Short, szconnstrout: Long, cbconnstroutmax: Short, pcbconnstrout: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLBrowseConnectW(hdbc: Long, szconnstrin: Long, cchconnstrin: Short, szconnstrout: Long, cchconnstroutmax: Short, pcchconnstrout: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLBulkOperations(statementhandle: Long, operation: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLCancel(statementhandle: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLCancelHandle(handletype: Short, inputhandle: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLCloseCursor(statementhandle: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLCloseEnumServers(henumhandle: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLColAttribute(statementhandle: Long, columnnumber: Short, fieldidentifier: Short, characterattribute: Long, bufferlength: Short, stringlength: Long, numericattribute: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLColAttributeA(hstmt: Long, icol: Short, ifield: Short, pcharattr: Long, cbcharattrmax: Short, pcbcharattr: Long, pnumattr: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLColAttributeW(hstmt: Long, icol: Short, ifield: Short, pcharattr: Long, cbdescmax: Short, pcbcharattr: Long, pnumattr: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLColAttributes(hstmt: Long, icol: Short, fdesctype: Short, rgbdesc: Long, cbdescmax: Short, pcbdesc: Long, pfdesc: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLColAttributesA(hstmt: Long, icol: Short, fdesctype: Short, rgbdesc: Long, cbdescmax: Short, pcbdesc: Long, pfdesc: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLColAttributesW(hstmt: Long, icol: Short, fdesctype: Short, rgbdesc: Long, cbdescmax: Short, pcbdesc: Long, pfdesc: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLColumnPrivileges(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short, szcolumnname: Long, cchcolumnname: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLColumnPrivilegesA(hstmt: Long, szcatalogname: Long, cbcatalogname: Short, szschemaname: Long, cbschemaname: Short, sztablename: Long, cbtablename: Short, szcolumnname: Long, cbcolumnname: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLColumnPrivilegesW(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short, szcolumnname: Long, cchcolumnname: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLColumns(statementhandle: Long, catalogname: Long, namelength1: Short, schemaname: Long, namelength2: Short, tablename: Long, namelength3: Short, columnname: Long, namelength4: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLColumnsA(hstmt: Long, szcatalogname: Long, cbcatalogname: Short, szschemaname: Long, cbschemaname: Short, sztablename: Long, cbtablename: Short, szcolumnname: Long, cbcolumnname: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLColumnsW(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short, szcolumnname: Long, cchcolumnname: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLCompleteAsync(handletype: Short, handle: Long, asyncretcodeptr: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLConnect(connectionhandle: Long, servername: Long, namelength1: Short, username: Long, namelength2: Short, authentication: Long, namelength3: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLConnectA(hdbc: Long, szdsn: Long, cbdsn: Short, szuid: Long, cbuid: Short, szauthstr: Long, cbauthstr: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLConnectW(hdbc: Long, szdsn: Long, cchdsn: Short, szuid: Long, cchuid: Short, szauthstr: Long, cchauthstr: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLCopyDesc(sourcedeschandle: Long, targetdeschandle: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLDataSources(environmenthandle: Long, direction: Short, servername: Long, bufferlength1: Short, namelength1ptr: Long, description: Long, bufferlength2: Short, namelength2ptr: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLDataSourcesA(henv: Long, fdirection: Short, szdsn: Long, cbdsnmax: Short, pcbdsn: Long, szdescription: Long, cbdescriptionmax: Short, pcbdescription: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLDataSourcesW(henv: Long, fdirection: Short, szdsn: Long, cchdsnmax: Short, pcchdsn: Long, wszdescription: Long, cchdescriptionmax: Short, pcchdescription: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLDescribeCol(statementhandle: Long, columnnumber: Short, columnname: Long, bufferlength: Short, namelength: Long, datatype: Long, columnsize: Long, decimaldigits: Long, nullable: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLDescribeColA(hstmt: Long, icol: Short, szcolname: Long, cbcolnamemax: Short, pcbcolname: Long, pfsqltype: Long, pcbcoldef: Long, pibscale: Long, pfnullable: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLDescribeColW(hstmt: Long, icol: Short, szcolname: Long, cchcolnamemax: Short, pcchcolname: Long, pfsqltype: Long, pcbcoldef: Long, pibscale: Long, pfnullable: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLDescribeParam(hstmt: Long, ipar: Short, pfsqltype: Long, pcbparamdef: Long, pibscale: Long, pfnullable: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLDisconnect(connectionhandle: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLDriverConnect(hdbc: Long, hwnd: Long, szconnstrin: Long, cchconnstrin: Short, szconnstrout: Long, cchconnstroutmax: Short, pcchconnstrout: Long, fdrivercompletion: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLDriverConnectA(hdbc: Long, hwnd: Long, szconnstrin: Long, cbconnstrin: Short, szconnstrout: Long, cbconnstroutmax: Short, pcbconnstrout: Long, fdrivercompletion: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLDriverConnectW(hdbc: Long, hwnd: Long, szconnstrin: Long, cchconnstrin: Short, szconnstrout: Long, cchconnstroutmax: Short, pcchconnstrout: Long, fdrivercompletion: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLDrivers(henv: Long, fdirection: Short, szdriverdesc: Long, cchdriverdescmax: Short, pcchdriverdesc: Long, szdriverattributes: Long, cchdrvrattrmax: Short, pcchdrvrattr: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLDriversA(henv: Long, fdirection: Short, szdriverdesc: Long, cbdriverdescmax: Short, pcbdriverdesc: Long, szdriverattributes: Long, cbdrvrattrmax: Short, pcbdrvrattr: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLDriversW(henv: Long, fdirection: Short, szdriverdesc: Long, cchdriverdescmax: Short, pcchdriverdesc: Long, szdriverattributes: Long, cchdrvrattrmax: Short, pcchdrvrattr: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLEndTran(handletype: Short, handle: Long, completiontype: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLError(environmenthandle: Long, connectionhandle: Long, statementhandle: Long, sqlstate: Long, nativeerror: Long, messagetext: Long, bufferlength: Short, textlength: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLErrorA(henv: Long, hdbc: Long, hstmt: Long, szsqlstate: Long, pfnativeerror: Long, szerrormsg: Long, cberrormsgmax: Short, pcberrormsg: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLErrorW(henv: Long, hdbc: Long, hstmt: Long, wszsqlstate: Long, pfnativeerror: Long, wszerrormsg: Long, ccherrormsgmax: Short, pccherrormsg: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLExecDirect(statementhandle: Long, statementtext: Long, textlength: Int): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLExecDirectA(hstmt: Long, szsqlstr: Long, cbsqlstr: Int): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLExecDirectW(hstmt: Long, szsqlstr: Long, textlength: Int): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLExecute(statementhandle: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLExtendedFetch(hstmt: Long, ffetchtype: Short, irow: Long, pcrow: Long, rgfrowstatus: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLFetch(statementhandle: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLFetchScroll(statementhandle: Long, fetchorientation: Short, fetchoffset: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLForeignKeys(hstmt: Long, szpkcatalogname: Long, cchpkcatalogname: Short, szpkschemaname: Long, cchpkschemaname: Short, szpktablename: Long, cchpktablename: Short, szfkcatalogname: Long, cchfkcatalogname: Short, szfkschemaname: Long, cchfkschemaname: Short, szfktablename: Long, cchfktablename: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLForeignKeysA(hstmt: Long, szpkcatalogname: Long, cbpkcatalogname: Short, szpkschemaname: Long, cbpkschemaname: Short, szpktablename: Long, cbpktablename: Short, szfkcatalogname: Long, cbfkcatalogname: Short, szfkschemaname: Long, cbfkschemaname: Short, szfktablename: Long, cbfktablename: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLForeignKeysW(hstmt: Long, szpkcatalogname: Long, cchpkcatalogname: Short, szpkschemaname: Long, cchpkschemaname: Short, szpktablename: Long, cchpktablename: Short, szfkcatalogname: Long, cchfkcatalogname: Short, szfkschemaname: Long, cchfkschemaname: Short, szfktablename: Long, cchfktablename: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLFreeConnect(connectionhandle: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLFreeEnv(environmenthandle: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLFreeHandle(handletype: Short, handle: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLFreeStmt(statementhandle: Long, option: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLGetConnectAttr(connectionhandle: Long, attribute: Int, value: Long, bufferlength: Int, stringlengthptr: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLGetConnectAttrA(hdbc: Long, fattribute: Int, rgbvalue: Long, cbvaluemax: Int, pcbvalue: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLGetConnectAttrW(hdbc: Long, fattribute: Int, rgbvalue: Long, cbvaluemax: Int, pcbvalue: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLGetConnectOption(connectionhandle: Long, option: Short, value: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLGetConnectOptionA(hdbc: Long, foption: Short, pvparam: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLGetConnectOptionW(hdbc: Long, foption: Short, pvparam: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLGetCursorName(statementhandle: Long, cursorname: Long, bufferlength: Short, namelengthptr: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLGetCursorNameA(hstmt: Long, szcursor: Long, cbcursormax: Short, pcbcursor: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLGetCursorNameW(hstmt: Long, szcursor: Long, cchcursormax: Short, pcchcursor: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLGetData(statementhandle: Long, columnnumber: Short, targettype: Short, targetvalue: Long, bufferlength: Long, strlen_or_indptr: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLGetDescField(descriptorhandle: Long, recnumber: Short, fieldidentifier: Short, value: Long, bufferlength: Int, stringlength: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLGetDescFieldA(hdesc: Long, irecord: Short, ifield: Short, rgbvalue: Long, cbbufferlength: Int, stringlength: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLGetDescFieldW(hdesc: Long, irecord: Short, ifield: Short, rgbvalue: Long, cbbufferlength: Int, stringlength: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLGetDescRec(descriptorhandle: Long, recnumber: Short, name: Long, bufferlength: Short, stringlengthptr: Long, typeptr: Long, subtypeptr: Long, lengthptr: Long, precisionptr: Long, scaleptr: Long, nullableptr: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLGetDescRecA(hdesc: Long, irecord: Short, szname: Long, cbnamemax: Short, pcbname: Long, pftype: Long, pfsubtype: Long, plength: Long, pprecision: Long, pscale: Long, pnullable: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLGetDescRecW(hdesc: Long, irecord: Short, szname: Long, cchnamemax: Short, pcchname: Long, pftype: Long, pfsubtype: Long, plength: Long, pprecision: Long, pscale: Long, pnullable: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLGetDiagField(handletype: Short, handle: Long, recnumber: Short, diagidentifier: Short, diaginfo: Long, bufferlength: Short, stringlength: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLGetDiagFieldA(fhandletype: Short, handle: Long, irecord: Short, fdiagfield: Short, rgbdiaginfo: Long, cbdiaginfomax: Short, pcbdiaginfo: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLGetDiagFieldW(fhandletype: Short, handle: Long, irecord: Short, fdiagfield: Short, rgbdiaginfo: Long, cbbufferlength: Short, pcbstringlength: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLGetDiagRec(handletype: Short, handle: Long, recnumber: Short, sqlstate: Long, nativeerror: Long, messagetext: Long, bufferlength: Short, textlength: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLGetDiagRecA(fhandletype: Short, handle: Long, irecord: Short, szsqlstate: Long, pfnativeerror: Long, szerrormsg: Long, cberrormsgmax: Short, pcberrormsg: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLGetDiagRecW(fhandletype: Short, handle: Long, irecord: Short, szsqlstate: Long, pfnativeerror: Long, szerrormsg: Long, ccherrormsgmax: Short, pccherrormsg: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLGetEnvAttr(environmenthandle: Long, attribute: Int, value: Long, bufferlength: Int, stringlength: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLGetFunctions(connectionhandle: Long, functionid: Short, supported: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLGetInfo(connectionhandle: Long, infotype: Short, infovalue: Long, bufferlength: Short, stringlengthptr: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLGetInfoA(hdbc: Long, finfotype: Short, rgbinfovalue: Long, cbinfovaluemax: Short, pcbinfovalue: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLGetInfoW(hdbc: Long, finfotype: Short, rgbinfovalue: Long, cbinfovaluemax: Short, pcbinfovalue: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLGetNextEnumeration(henumhandle: Long, prgenumdata: Long, pienumlength: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLGetStmtAttr(statementhandle: Long, attribute: Int, value: Long, bufferlength: Int, stringlength: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLGetStmtAttrA(hstmt: Long, fattribute: Int, rgbvalue: Long, cbvaluemax: Int, pcbvalue: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLGetStmtAttrW(hstmt: Long, fattribute: Int, rgbvalue: Long, cbvaluemax: Int, pcbvalue: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLGetStmtOption(statementhandle: Long, option: Short, value: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLGetTypeInfo(statementhandle: Long, datatype: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLGetTypeInfoA(statementhandle: Long, datatype: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLGetTypeInfoW(statementhandle: Long, datatype: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLInitEnumServers(pwchservername: Long, pwchinstancename: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLLinkedCatalogsA(param0: Long, param1: Long, param2: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLLinkedCatalogsW(param0: Long, param1: Long, param2: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLLinkedServers(param0: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLMoreResults(hstmt: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLNativeSql(hdbc: Long, szsqlstrin: Long, cchsqlstrin: Int, szsqlstr: Long, cchsqlstrmax: Int, pcbsqlstr: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLNativeSqlA(hdbc: Long, szsqlstrin: Long, cbsqlstrin: Int, szsqlstr: Long, cbsqlstrmax: Int, pcbsqlstr: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLNativeSqlW(hdbc: Long, szsqlstrin: Long, cchsqlstrin: Int, szsqlstr: Long, cchsqlstrmax: Int, pcchsqlstr: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLNumParams(hstmt: Long, pcpar: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLNumResultCols(statementhandle: Long, columncount: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLParamData(statementhandle: Long, value: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLParamOptions(hstmt: Long, crow: Long, pirow: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLPrepare(statementhandle: Long, statementtext: Long, textlength: Int): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLPrepareA(hstmt: Long, szsqlstr: Long, cbsqlstr: Int): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLPrepareW(hstmt: Long, szsqlstr: Long, cchsqlstr: Int): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLPrimaryKeys(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLPrimaryKeysA(hstmt: Long, szcatalogname: Long, cbcatalogname: Short, szschemaname: Long, cbschemaname: Short, sztablename: Long, cbtablename: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLPrimaryKeysW(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLProcedureColumns(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, szprocname: Long, cchprocname: Short, szcolumnname: Long, cchcolumnname: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLProcedureColumnsA(hstmt: Long, szcatalogname: Long, cbcatalogname: Short, szschemaname: Long, cbschemaname: Short, szprocname: Long, cbprocname: Short, szcolumnname: Long, cbcolumnname: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLProcedureColumnsW(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, szprocname: Long, cchprocname: Short, szcolumnname: Long, cchcolumnname: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLProcedures(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, szprocname: Long, cchprocname: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLProceduresA(hstmt: Long, szcatalogname: Long, cbcatalogname: Short, szschemaname: Long, cbschemaname: Short, szprocname: Long, cbprocname: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLProceduresW(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, szprocname: Long, cchprocname: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLPutData(statementhandle: Long, data: Long, strlen_or_ind: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLRowCount(statementhandle: Long, rowcount: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLSetConnectAttr(connectionhandle: Long, attribute: Int, value: Long, stringlength: Int): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLSetConnectAttrA(hdbc: Long, fattribute: Int, rgbvalue: Long, cbvalue: Int): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLSetConnectAttrW(hdbc: Long, fattribute: Int, rgbvalue: Long, cbvalue: Int): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLSetConnectOption(connectionhandle: Long, option: Short, value: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLSetConnectOptionA(hdbc: Long, foption: Short, vparam: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLSetConnectOptionW(hdbc: Long, foption: Short, vparam: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLSetCursorName(statementhandle: Long, cursorname: Long, namelength: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLSetCursorNameA(hstmt: Long, szcursor: Long, cbcursor: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLSetCursorNameW(hstmt: Long, szcursor: Long, cchcursor: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLSetDescField(descriptorhandle: Long, recnumber: Short, fieldidentifier: Short, value: Long, bufferlength: Int): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLSetDescFieldW(descriptorhandle: Long, recnumber: Short, fieldidentifier: Short, value: Long, bufferlength: Int): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLSetDescRec(descriptorhandle: Long, recnumber: Short, type: Short, subtype: Short, length: Long, precision: Short, scale: Short, data: Long, stringlength: Long, indicator: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLSetEnvAttr(environmenthandle: Long, attribute: Int, value: Long, stringlength: Int): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLSetParam(statementhandle: Long, parameternumber: Short, valuetype: Short, parametertype: Short, lengthprecision: Long, parameterscale: Short, parametervalue: Long, strlen_or_ind: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLSetPos(hstmt: Long, irow: Long, foption: Short, flock: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLSetScrollOptions(hstmt: Long, fconcurrency: Short, crowkeyset: Long, crowrowset: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLSetStmtAttr(statementhandle: Long, attribute: Int, value: Long, stringlength: Int): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLSetStmtAttrW(hstmt: Long, fattribute: Int, rgbvalue: Long, cbvaluemax: Int): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLSetStmtOption(statementhandle: Long, option: Short, value: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLSpecialColumns(statementhandle: Long, identifiertype: Short, catalogname: Long, namelength1: Short, schemaname: Long, namelength2: Short, tablename: Long, namelength3: Short, scope: Short, nullable: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLSpecialColumnsA(hstmt: Long, fcoltype: Short, szcatalogname: Long, cbcatalogname: Short, szschemaname: Long, cbschemaname: Short, sztablename: Long, cbtablename: Short, fscope: Short, fnullable: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLSpecialColumnsW(hstmt: Long, fcoltype: Short, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short, fscope: Short, fnullable: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLStatistics(statementhandle: Long, catalogname: Long, namelength1: Short, schemaname: Long, namelength2: Short, tablename: Long, namelength3: Short, unique: Short, reserved: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLStatisticsA(hstmt: Long, szcatalogname: Long, cbcatalogname: Short, szschemaname: Long, cbschemaname: Short, sztablename: Long, cbtablename: Short, funique: Short, faccuracy: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLStatisticsW(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short, funique: Short, faccuracy: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLTablePrivileges(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLTablePrivilegesA(hstmt: Long, szcatalogname: Long, cbcatalogname: Short, szschemaname: Long, cbschemaname: Short, sztablename: Long, cbtablename: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLTablePrivilegesW(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLTables(statementhandle: Long, catalogname: Long, namelength1: Short, schemaname: Long, namelength2: Short, tablename: Long, namelength3: Short, tabletype: Long, namelength4: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLTablesA(hstmt: Long, szcatalogname: Long, cbcatalogname: Short, szschemaname: Long, cbschemaname: Short, sztablename: Long, cbtablename: Short, sztabletype: Long, cbtabletype: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLTablesW(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short, sztabletype: Long, cchtabletype: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_SQLTransact(environmenthandle: Long, connectionhandle: Long, completiontype: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_bcp_batch(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_search_bcp_bind(param0: Long, param1: Long, param2: Int, param3: Int, param4: Long, param5: Int, param6: Int, param7: Int): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_bcp_colfmt(param0: Long, param1: Int, param2: Byte, param3: Int, param4: Int, param5: Long, param6: Int, param7: Int): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_bcp_collen(param0: Long, param1: Int, param2: Int): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_bcp_colptr(param0: Long, param1: Long, param2: Int): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_bcp_columns(param0: Long, param1: Int): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_bcp_control(param0: Long, param1: Int, param2: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_bcp_done(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_search_bcp_exec(param0: Long, param1: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_bcp_getcolfmt(param0: Long, param1: Int, param2: Int, param3: Long, param4: Int, param5: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_bcp_initA(param0: Long, param1: Long, param2: Long, param3: Long, param4: Int): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_bcp_initW(param0: Long, param1: Long, param2: Long, param3: Long, param4: Int): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_bcp_moretext(param0: Long, param1: Int, param2: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_bcp_readfmtA(param0: Long, param1: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_bcp_readfmtW(param0: Long, param1: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_bcp_sendrow(param0: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_bcp_setcolfmt(param0: Long, param1: Int, param2: Int, param3: Long, param4: Int): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_bcp_writefmtA(param0: Long, param1: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_bcp_writefmtW(param0: Long, param1: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_dbprtypeA(param0: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_search_dbprtypeW(param0: Int): Long
}

public actual fun ODBCGetTryWaitValue(): UInt =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_ODBCGetTryWaitValue().toUInt()

public actual fun ODBCSetTryWaitValue(dwvalue: UInt): BOOL =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_ODBCSetTryWaitValue(dwvalue.toInt())

public actual fun SQLAllocConnect(environmenthandle: Long, connectionhandle: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLAllocConnect(environmenthandle, connectionhandle)

public actual fun SQLAllocEnv(environmenthandle: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLAllocEnv(environmenthandle)

public actual fun SQLAllocHandle(handletype: Short, inputhandle: Long, outputhandle: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLAllocHandle(handletype, inputhandle, outputhandle)

public actual fun SQLAllocHandleStd(fhandletype: Short, hinput: Long, phoutput: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLAllocHandleStd(fhandletype, hinput, phoutput)

public actual fun SQLAllocStmt(connectionhandle: Long, statementhandle: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLAllocStmt(connectionhandle, statementhandle)

public actual fun SQLBindCol(statementhandle: Long, columnnumber: UShort, targettype: Short, targetvalue: Long, bufferlength: Long, strlen_or_ind: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLBindCol(statementhandle, columnnumber.toShort(), targettype, targetvalue, bufferlength, strlen_or_ind)

public actual fun SQLBindParam(statementhandle: Long, parameternumber: UShort, valuetype: Short, parametertype: Short, lengthprecision: ULong, parameterscale: Short, parametervalue: Long, strlen_or_ind: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLBindParam(statementhandle, parameternumber.toShort(), valuetype, parametertype, lengthprecision.toLong(), parameterscale, parametervalue, strlen_or_ind)

public actual fun SQLBindParameter(hstmt: Long, ipar: UShort, fparamtype: Short, fctype: Short, fsqltype: Short, cbcoldef: ULong, ibscale: Short, rgbvalue: Long, cbvaluemax: Long, pcbvalue: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLBindParameter(hstmt, ipar.toShort(), fparamtype, fctype, fsqltype, cbcoldef.toLong(), ibscale, rgbvalue, cbvaluemax, pcbvalue)

public actual fun SQLBrowseConnect(hdbc: Long, szconnstrin: Long, cchconnstrin: Short, szconnstrout: Long, cchconnstroutmax: Short, pcchconnstrout: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLBrowseConnect(hdbc, szconnstrin, cchconnstrin, szconnstrout, cchconnstroutmax, pcchconnstrout)

public actual fun SQLBrowseConnectA(hdbc: Long, szconnstrin: Long, cbconnstrin: Short, szconnstrout: Long, cbconnstroutmax: Short, pcbconnstrout: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLBrowseConnectA(hdbc, szconnstrin, cbconnstrin, szconnstrout, cbconnstroutmax, pcbconnstrout)

public actual fun SQLBrowseConnectW(hdbc: Long, szconnstrin: Long, cchconnstrin: Short, szconnstrout: Long, cchconnstroutmax: Short, pcchconnstrout: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLBrowseConnectW(hdbc, szconnstrin, cchconnstrin, szconnstrout, cchconnstroutmax, pcchconnstrout)

public actual fun SQLBulkOperations(statementhandle: Long, operation: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLBulkOperations(statementhandle, operation)

public actual fun SQLCancel(statementhandle: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLCancel(statementhandle)

public actual fun SQLCancelHandle(handletype: Short, inputhandle: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLCancelHandle(handletype, inputhandle)

public actual fun SQLCloseCursor(statementhandle: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLCloseCursor(statementhandle)

public actual fun SQLCloseEnumServers(henumhandle: HANDLE): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLCloseEnumServers(henumhandle)

public actual fun SQLColAttribute(statementhandle: Long, columnnumber: UShort, fieldidentifier: UShort, characterattribute: Long, bufferlength: Short, stringlength: Long, numericattribute: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLColAttribute(statementhandle, columnnumber.toShort(), fieldidentifier.toShort(), characterattribute, bufferlength, stringlength, numericattribute)

public actual fun SQLColAttributeA(hstmt: Long, icol: Short, ifield: Short, pcharattr: Long, cbcharattrmax: Short, pcbcharattr: Long, pnumattr: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLColAttributeA(hstmt, icol, ifield, pcharattr, cbcharattrmax, pcbcharattr, pnumattr)

public actual fun SQLColAttributeW(hstmt: Long, icol: UShort, ifield: UShort, pcharattr: Long, cbdescmax: Short, pcbcharattr: Long, pnumattr: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLColAttributeW(hstmt, icol.toShort(), ifield.toShort(), pcharattr, cbdescmax, pcbcharattr, pnumattr)

public actual fun SQLColAttributes(hstmt: Long, icol: UShort, fdesctype: UShort, rgbdesc: Long, cbdescmax: Short, pcbdesc: Long, pfdesc: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLColAttributes(hstmt, icol.toShort(), fdesctype.toShort(), rgbdesc, cbdescmax, pcbdesc, pfdesc)

public actual fun SQLColAttributesA(hstmt: Long, icol: UShort, fdesctype: UShort, rgbdesc: Long, cbdescmax: Short, pcbdesc: Long, pfdesc: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLColAttributesA(hstmt, icol.toShort(), fdesctype.toShort(), rgbdesc, cbdescmax, pcbdesc, pfdesc)

public actual fun SQLColAttributesW(hstmt: Long, icol: UShort, fdesctype: UShort, rgbdesc: Long, cbdescmax: Short, pcbdesc: Long, pfdesc: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLColAttributesW(hstmt, icol.toShort(), fdesctype.toShort(), rgbdesc, cbdescmax, pcbdesc, pfdesc)

public actual fun SQLColumnPrivileges(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short, szcolumnname: Long, cchcolumnname: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLColumnPrivileges(hstmt, szcatalogname, cchcatalogname, szschemaname, cchschemaname, sztablename, cchtablename, szcolumnname, cchcolumnname)

public actual fun SQLColumnPrivilegesA(hstmt: Long, szcatalogname: Long, cbcatalogname: Short, szschemaname: Long, cbschemaname: Short, sztablename: Long, cbtablename: Short, szcolumnname: Long, cbcolumnname: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLColumnPrivilegesA(hstmt, szcatalogname, cbcatalogname, szschemaname, cbschemaname, sztablename, cbtablename, szcolumnname, cbcolumnname)

public actual fun SQLColumnPrivilegesW(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short, szcolumnname: Long, cchcolumnname: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLColumnPrivilegesW(hstmt, szcatalogname, cchcatalogname, szschemaname, cchschemaname, sztablename, cchtablename, szcolumnname, cchcolumnname)

public actual fun SQLColumns(statementhandle: Long, catalogname: Long, namelength1: Short, schemaname: Long, namelength2: Short, tablename: Long, namelength3: Short, columnname: Long, namelength4: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLColumns(statementhandle, catalogname, namelength1, schemaname, namelength2, tablename, namelength3, columnname, namelength4)

public actual fun SQLColumnsA(hstmt: Long, szcatalogname: Long, cbcatalogname: Short, szschemaname: Long, cbschemaname: Short, sztablename: Long, cbtablename: Short, szcolumnname: Long, cbcolumnname: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLColumnsA(hstmt, szcatalogname, cbcatalogname, szschemaname, cbschemaname, sztablename, cbtablename, szcolumnname, cbcolumnname)

public actual fun SQLColumnsW(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short, szcolumnname: Long, cchcolumnname: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLColumnsW(hstmt, szcatalogname, cchcatalogname, szschemaname, cchschemaname, sztablename, cchtablename, szcolumnname, cchcolumnname)

public actual fun SQLCompleteAsync(handletype: Short, handle: Long, asyncretcodeptr: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLCompleteAsync(handletype, handle, asyncretcodeptr)

public actual fun SQLConnect(connectionhandle: Long, servername: Long, namelength1: Short, username: Long, namelength2: Short, authentication: Long, namelength3: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLConnect(connectionhandle, servername, namelength1, username, namelength2, authentication, namelength3)

public actual fun SQLConnectA(hdbc: Long, szdsn: Long, cbdsn: Short, szuid: Long, cbuid: Short, szauthstr: Long, cbauthstr: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLConnectA(hdbc, szdsn, cbdsn, szuid, cbuid, szauthstr, cbauthstr)

public actual fun SQLConnectW(hdbc: Long, szdsn: Long, cchdsn: Short, szuid: Long, cchuid: Short, szauthstr: Long, cchauthstr: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLConnectW(hdbc, szdsn, cchdsn, szuid, cchuid, szauthstr, cchauthstr)

public actual fun SQLCopyDesc(sourcedeschandle: Long, targetdeschandle: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLCopyDesc(sourcedeschandle, targetdeschandle)

public actual fun SQLDataSources(environmenthandle: Long, direction: UShort, servername: Long, bufferlength1: Short, namelength1ptr: Long, description: Long, bufferlength2: Short, namelength2ptr: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLDataSources(environmenthandle, direction.toShort(), servername, bufferlength1, namelength1ptr, description, bufferlength2, namelength2ptr)

public actual fun SQLDataSourcesA(henv: Long, fdirection: UShort, szdsn: Long, cbdsnmax: Short, pcbdsn: Long, szdescription: Long, cbdescriptionmax: Short, pcbdescription: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLDataSourcesA(henv, fdirection.toShort(), szdsn, cbdsnmax, pcbdsn, szdescription, cbdescriptionmax, pcbdescription)

public actual fun SQLDataSourcesW(henv: Long, fdirection: UShort, szdsn: Long, cchdsnmax: Short, pcchdsn: Long, wszdescription: Long, cchdescriptionmax: Short, pcchdescription: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLDataSourcesW(henv, fdirection.toShort(), szdsn, cchdsnmax, pcchdsn, wszdescription, cchdescriptionmax, pcchdescription)

public actual fun SQLDescribeCol(statementhandle: Long, columnnumber: UShort, columnname: Long, bufferlength: Short, namelength: Long, datatype: Long, columnsize: Long, decimaldigits: Long, nullable: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLDescribeCol(statementhandle, columnnumber.toShort(), columnname, bufferlength, namelength, datatype, columnsize, decimaldigits, nullable)

public actual fun SQLDescribeColA(hstmt: Long, icol: UShort, szcolname: Long, cbcolnamemax: Short, pcbcolname: Long, pfsqltype: Long, pcbcoldef: Long, pibscale: Long, pfnullable: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLDescribeColA(hstmt, icol.toShort(), szcolname, cbcolnamemax, pcbcolname, pfsqltype, pcbcoldef, pibscale, pfnullable)

public actual fun SQLDescribeColW(hstmt: Long, icol: UShort, szcolname: Long, cchcolnamemax: Short, pcchcolname: Long, pfsqltype: Long, pcbcoldef: Long, pibscale: Long, pfnullable: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLDescribeColW(hstmt, icol.toShort(), szcolname, cchcolnamemax, pcchcolname, pfsqltype, pcbcoldef, pibscale, pfnullable)

public actual fun SQLDescribeParam(hstmt: Long, ipar: UShort, pfsqltype: Long, pcbparamdef: Long, pibscale: Long, pfnullable: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLDescribeParam(hstmt, ipar.toShort(), pfsqltype, pcbparamdef, pibscale, pfnullable)

public actual fun SQLDisconnect(connectionhandle: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLDisconnect(connectionhandle)

public actual fun SQLDriverConnect(hdbc: Long, hwnd: Long, szconnstrin: Long, cchconnstrin: Short, szconnstrout: Long, cchconnstroutmax: Short, pcchconnstrout: Long, fdrivercompletion: UShort): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLDriverConnect(hdbc, hwnd, szconnstrin, cchconnstrin, szconnstrout, cchconnstroutmax, pcchconnstrout, fdrivercompletion.toShort())

public actual fun SQLDriverConnectA(hdbc: Long, hwnd: Long, szconnstrin: Long, cbconnstrin: Short, szconnstrout: Long, cbconnstroutmax: Short, pcbconnstrout: Long, fdrivercompletion: UShort): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLDriverConnectA(hdbc, hwnd, szconnstrin, cbconnstrin, szconnstrout, cbconnstroutmax, pcbconnstrout, fdrivercompletion.toShort())

public actual fun SQLDriverConnectW(hdbc: Long, hwnd: Long, szconnstrin: Long, cchconnstrin: Short, szconnstrout: Long, cchconnstroutmax: Short, pcchconnstrout: Long, fdrivercompletion: UShort): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLDriverConnectW(hdbc, hwnd, szconnstrin, cchconnstrin, szconnstrout, cchconnstroutmax, pcchconnstrout, fdrivercompletion.toShort())

public actual fun SQLDrivers(henv: Long, fdirection: UShort, szdriverdesc: Long, cchdriverdescmax: Short, pcchdriverdesc: Long, szdriverattributes: Long, cchdrvrattrmax: Short, pcchdrvrattr: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLDrivers(henv, fdirection.toShort(), szdriverdesc, cchdriverdescmax, pcchdriverdesc, szdriverattributes, cchdrvrattrmax, pcchdrvrattr)

public actual fun SQLDriversA(henv: Long, fdirection: UShort, szdriverdesc: Long, cbdriverdescmax: Short, pcbdriverdesc: Long, szdriverattributes: Long, cbdrvrattrmax: Short, pcbdrvrattr: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLDriversA(henv, fdirection.toShort(), szdriverdesc, cbdriverdescmax, pcbdriverdesc, szdriverattributes, cbdrvrattrmax, pcbdrvrattr)

public actual fun SQLDriversW(henv: Long, fdirection: UShort, szdriverdesc: Long, cchdriverdescmax: Short, pcchdriverdesc: Long, szdriverattributes: Long, cchdrvrattrmax: Short, pcchdrvrattr: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLDriversW(henv, fdirection.toShort(), szdriverdesc, cchdriverdescmax, pcchdriverdesc, szdriverattributes, cchdrvrattrmax, pcchdrvrattr)

public actual fun SQLEndTran(handletype: Short, handle: Long, completiontype: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLEndTran(handletype, handle, completiontype)

public actual fun SQLError(environmenthandle: Long, connectionhandle: Long, statementhandle: Long, sqlstate: Long, nativeerror: Long, messagetext: Long, bufferlength: Short, textlength: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLError(environmenthandle, connectionhandle, statementhandle, sqlstate, nativeerror, messagetext, bufferlength, textlength)

public actual fun SQLErrorA(henv: Long, hdbc: Long, hstmt: Long, szsqlstate: Long, pfnativeerror: Long, szerrormsg: Long, cberrormsgmax: Short, pcberrormsg: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLErrorA(henv, hdbc, hstmt, szsqlstate, pfnativeerror, szerrormsg, cberrormsgmax, pcberrormsg)

public actual fun SQLErrorW(henv: Long, hdbc: Long, hstmt: Long, wszsqlstate: Long, pfnativeerror: Long, wszerrormsg: Long, ccherrormsgmax: Short, pccherrormsg: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLErrorW(henv, hdbc, hstmt, wszsqlstate, pfnativeerror, wszerrormsg, ccherrormsgmax, pccherrormsg)

public actual fun SQLExecDirect(statementhandle: Long, statementtext: Long, textlength: Int): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLExecDirect(statementhandle, statementtext, textlength)

public actual fun SQLExecDirectA(hstmt: Long, szsqlstr: Long, cbsqlstr: Int): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLExecDirectA(hstmt, szsqlstr, cbsqlstr)

public actual fun SQLExecDirectW(hstmt: Long, szsqlstr: Long, textlength: Int): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLExecDirectW(hstmt, szsqlstr, textlength)

public actual fun SQLExecute(statementhandle: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLExecute(statementhandle)

public actual fun SQLExtendedFetch(hstmt: Long, ffetchtype: UShort, irow: Long, pcrow: Long, rgfrowstatus: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLExtendedFetch(hstmt, ffetchtype.toShort(), irow, pcrow, rgfrowstatus)

public actual fun SQLFetch(statementhandle: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLFetch(statementhandle)

public actual fun SQLFetchScroll(statementhandle: Long, fetchorientation: Short, fetchoffset: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLFetchScroll(statementhandle, fetchorientation, fetchoffset)

public actual fun SQLForeignKeys(hstmt: Long, szpkcatalogname: Long, cchpkcatalogname: Short, szpkschemaname: Long, cchpkschemaname: Short, szpktablename: Long, cchpktablename: Short, szfkcatalogname: Long, cchfkcatalogname: Short, szfkschemaname: Long, cchfkschemaname: Short, szfktablename: Long, cchfktablename: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLForeignKeys(hstmt, szpkcatalogname, cchpkcatalogname, szpkschemaname, cchpkschemaname, szpktablename, cchpktablename, szfkcatalogname, cchfkcatalogname, szfkschemaname, cchfkschemaname, szfktablename, cchfktablename)

public actual fun SQLForeignKeysA(hstmt: Long, szpkcatalogname: Long, cbpkcatalogname: Short, szpkschemaname: Long, cbpkschemaname: Short, szpktablename: Long, cbpktablename: Short, szfkcatalogname: Long, cbfkcatalogname: Short, szfkschemaname: Long, cbfkschemaname: Short, szfktablename: Long, cbfktablename: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLForeignKeysA(hstmt, szpkcatalogname, cbpkcatalogname, szpkschemaname, cbpkschemaname, szpktablename, cbpktablename, szfkcatalogname, cbfkcatalogname, szfkschemaname, cbfkschemaname, szfktablename, cbfktablename)

public actual fun SQLForeignKeysW(hstmt: Long, szpkcatalogname: Long, cchpkcatalogname: Short, szpkschemaname: Long, cchpkschemaname: Short, szpktablename: Long, cchpktablename: Short, szfkcatalogname: Long, cchfkcatalogname: Short, szfkschemaname: Long, cchfkschemaname: Short, szfktablename: Long, cchfktablename: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLForeignKeysW(hstmt, szpkcatalogname, cchpkcatalogname, szpkschemaname, cchpkschemaname, szpktablename, cchpktablename, szfkcatalogname, cchfkcatalogname, szfkschemaname, cchfkschemaname, szfktablename, cchfktablename)

public actual fun SQLFreeConnect(connectionhandle: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLFreeConnect(connectionhandle)

public actual fun SQLFreeEnv(environmenthandle: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLFreeEnv(environmenthandle)

public actual fun SQLFreeHandle(handletype: Short, handle: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLFreeHandle(handletype, handle)

public actual fun SQLFreeStmt(statementhandle: Long, option: UShort): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLFreeStmt(statementhandle, option.toShort())

public actual fun SQLGetConnectAttr(connectionhandle: Long, attribute: Int, value: Long, bufferlength: Int, stringlengthptr: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLGetConnectAttr(connectionhandle, attribute, value, bufferlength, stringlengthptr)

public actual fun SQLGetConnectAttrA(hdbc: Long, fattribute: Int, rgbvalue: Long, cbvaluemax: Int, pcbvalue: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLGetConnectAttrA(hdbc, fattribute, rgbvalue, cbvaluemax, pcbvalue)

public actual fun SQLGetConnectAttrW(hdbc: Long, fattribute: Int, rgbvalue: Long, cbvaluemax: Int, pcbvalue: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLGetConnectAttrW(hdbc, fattribute, rgbvalue, cbvaluemax, pcbvalue)

public actual fun SQLGetConnectOption(connectionhandle: Long, option: UShort, value: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLGetConnectOption(connectionhandle, option.toShort(), value)

public actual fun SQLGetConnectOptionA(hdbc: Long, foption: UShort, pvparam: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLGetConnectOptionA(hdbc, foption.toShort(), pvparam)

public actual fun SQLGetConnectOptionW(hdbc: Long, foption: UShort, pvparam: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLGetConnectOptionW(hdbc, foption.toShort(), pvparam)

public actual fun SQLGetCursorName(statementhandle: Long, cursorname: Long, bufferlength: Short, namelengthptr: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLGetCursorName(statementhandle, cursorname, bufferlength, namelengthptr)

public actual fun SQLGetCursorNameA(hstmt: Long, szcursor: Long, cbcursormax: Short, pcbcursor: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLGetCursorNameA(hstmt, szcursor, cbcursormax, pcbcursor)

public actual fun SQLGetCursorNameW(hstmt: Long, szcursor: Long, cchcursormax: Short, pcchcursor: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLGetCursorNameW(hstmt, szcursor, cchcursormax, pcchcursor)

public actual fun SQLGetData(statementhandle: Long, columnnumber: UShort, targettype: Short, targetvalue: Long, bufferlength: Long, strlen_or_indptr: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLGetData(statementhandle, columnnumber.toShort(), targettype, targetvalue, bufferlength, strlen_or_indptr)

public actual fun SQLGetDescField(descriptorhandle: Long, recnumber: Short, fieldidentifier: Short, value: Long, bufferlength: Int, stringlength: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLGetDescField(descriptorhandle, recnumber, fieldidentifier, value, bufferlength, stringlength)

public actual fun SQLGetDescFieldA(hdesc: Long, irecord: Short, ifield: Short, rgbvalue: Long, cbbufferlength: Int, stringlength: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLGetDescFieldA(hdesc, irecord, ifield, rgbvalue, cbbufferlength, stringlength)

public actual fun SQLGetDescFieldW(hdesc: Long, irecord: Short, ifield: Short, rgbvalue: Long, cbbufferlength: Int, stringlength: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLGetDescFieldW(hdesc, irecord, ifield, rgbvalue, cbbufferlength, stringlength)

public actual fun SQLGetDescRec(descriptorhandle: Long, recnumber: Short, name: Long, bufferlength: Short, stringlengthptr: Long, typeptr: Long, subtypeptr: Long, lengthptr: Long, precisionptr: Long, scaleptr: Long, nullableptr: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLGetDescRec(descriptorhandle, recnumber, name, bufferlength, stringlengthptr, typeptr, subtypeptr, lengthptr, precisionptr, scaleptr, nullableptr)

public actual fun SQLGetDescRecA(hdesc: Long, irecord: Short, szname: Long, cbnamemax: Short, pcbname: Long, pftype: Long, pfsubtype: Long, plength: Long, pprecision: Long, pscale: Long, pnullable: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLGetDescRecA(hdesc, irecord, szname, cbnamemax, pcbname, pftype, pfsubtype, plength, pprecision, pscale, pnullable)

public actual fun SQLGetDescRecW(hdesc: Long, irecord: Short, szname: Long, cchnamemax: Short, pcchname: Long, pftype: Long, pfsubtype: Long, plength: Long, pprecision: Long, pscale: Long, pnullable: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLGetDescRecW(hdesc, irecord, szname, cchnamemax, pcchname, pftype, pfsubtype, plength, pprecision, pscale, pnullable)

public actual fun SQLGetDiagField(handletype: Short, handle: Long, recnumber: Short, diagidentifier: Short, diaginfo: Long, bufferlength: Short, stringlength: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLGetDiagField(handletype, handle, recnumber, diagidentifier, diaginfo, bufferlength, stringlength)

public actual fun SQLGetDiagFieldA(fhandletype: Short, handle: Long, irecord: Short, fdiagfield: Short, rgbdiaginfo: Long, cbdiaginfomax: Short, pcbdiaginfo: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLGetDiagFieldA(fhandletype, handle, irecord, fdiagfield, rgbdiaginfo, cbdiaginfomax, pcbdiaginfo)

public actual fun SQLGetDiagFieldW(fhandletype: Short, handle: Long, irecord: Short, fdiagfield: Short, rgbdiaginfo: Long, cbbufferlength: Short, pcbstringlength: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLGetDiagFieldW(fhandletype, handle, irecord, fdiagfield, rgbdiaginfo, cbbufferlength, pcbstringlength)

public actual fun SQLGetDiagRec(handletype: Short, handle: Long, recnumber: Short, sqlstate: Long, nativeerror: Long, messagetext: Long, bufferlength: Short, textlength: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLGetDiagRec(handletype, handle, recnumber, sqlstate, nativeerror, messagetext, bufferlength, textlength)

public actual fun SQLGetDiagRecA(fhandletype: Short, handle: Long, irecord: Short, szsqlstate: Long, pfnativeerror: Long, szerrormsg: Long, cberrormsgmax: Short, pcberrormsg: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLGetDiagRecA(fhandletype, handle, irecord, szsqlstate, pfnativeerror, szerrormsg, cberrormsgmax, pcberrormsg)

public actual fun SQLGetDiagRecW(fhandletype: Short, handle: Long, irecord: Short, szsqlstate: Long, pfnativeerror: Long, szerrormsg: Long, ccherrormsgmax: Short, pccherrormsg: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLGetDiagRecW(fhandletype, handle, irecord, szsqlstate, pfnativeerror, szerrormsg, ccherrormsgmax, pccherrormsg)

public actual fun SQLGetEnvAttr(environmenthandle: Long, attribute: Int, value: Long, bufferlength: Int, stringlength: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLGetEnvAttr(environmenthandle, attribute, value, bufferlength, stringlength)

public actual fun SQLGetFunctions(connectionhandle: Long, functionid: UShort, supported: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLGetFunctions(connectionhandle, functionid.toShort(), supported)

public actual fun SQLGetInfo(connectionhandle: Long, infotype: UShort, infovalue: Long, bufferlength: Short, stringlengthptr: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLGetInfo(connectionhandle, infotype.toShort(), infovalue, bufferlength, stringlengthptr)

public actual fun SQLGetInfoA(hdbc: Long, finfotype: UShort, rgbinfovalue: Long, cbinfovaluemax: Short, pcbinfovalue: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLGetInfoA(hdbc, finfotype.toShort(), rgbinfovalue, cbinfovaluemax, pcbinfovalue)

public actual fun SQLGetInfoW(hdbc: Long, finfotype: UShort, rgbinfovalue: Long, cbinfovaluemax: Short, pcbinfovalue: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLGetInfoW(hdbc, finfotype.toShort(), rgbinfovalue, cbinfovaluemax, pcbinfovalue)

public actual fun SQLGetNextEnumeration(henumhandle: HANDLE, prgenumdata: Long, pienumlength: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLGetNextEnumeration(henumhandle, prgenumdata, pienumlength)

public actual fun SQLGetStmtAttr(statementhandle: Long, attribute: Int, value: Long, bufferlength: Int, stringlength: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLGetStmtAttr(statementhandle, attribute, value, bufferlength, stringlength)

public actual fun SQLGetStmtAttrA(hstmt: Long, fattribute: Int, rgbvalue: Long, cbvaluemax: Int, pcbvalue: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLGetStmtAttrA(hstmt, fattribute, rgbvalue, cbvaluemax, pcbvalue)

public actual fun SQLGetStmtAttrW(hstmt: Long, fattribute: Int, rgbvalue: Long, cbvaluemax: Int, pcbvalue: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLGetStmtAttrW(hstmt, fattribute, rgbvalue, cbvaluemax, pcbvalue)

public actual fun SQLGetStmtOption(statementhandle: Long, option: UShort, value: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLGetStmtOption(statementhandle, option.toShort(), value)

public actual fun SQLGetTypeInfo(statementhandle: Long, datatype: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLGetTypeInfo(statementhandle, datatype)

public actual fun SQLGetTypeInfoA(statementhandle: Long, datatype: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLGetTypeInfoA(statementhandle, datatype)

public actual fun SQLGetTypeInfoW(statementhandle: Long, datatype: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLGetTypeInfoW(statementhandle, datatype)

public actual fun SQLInitEnumServers(pwchservername: PCWSTR, pwchinstancename: PCWSTR): HANDLE =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLInitEnumServers(pwchservername, pwchinstancename)

public actual fun SQLLinkedCatalogsA(param0: Long, param1: PCSTR, param2: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLLinkedCatalogsA(param0, param1, param2)

public actual fun SQLLinkedCatalogsW(param0: Long, param1: PCWSTR, param2: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLLinkedCatalogsW(param0, param1, param2)

public actual fun SQLLinkedServers(param0: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLLinkedServers(param0)

public actual fun SQLMoreResults(hstmt: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLMoreResults(hstmt)

public actual fun SQLNativeSql(hdbc: Long, szsqlstrin: Long, cchsqlstrin: Int, szsqlstr: Long, cchsqlstrmax: Int, pcbsqlstr: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLNativeSql(hdbc, szsqlstrin, cchsqlstrin, szsqlstr, cchsqlstrmax, pcbsqlstr)

public actual fun SQLNativeSqlA(hdbc: Long, szsqlstrin: Long, cbsqlstrin: Int, szsqlstr: Long, cbsqlstrmax: Int, pcbsqlstr: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLNativeSqlA(hdbc, szsqlstrin, cbsqlstrin, szsqlstr, cbsqlstrmax, pcbsqlstr)

public actual fun SQLNativeSqlW(hdbc: Long, szsqlstrin: Long, cchsqlstrin: Int, szsqlstr: Long, cchsqlstrmax: Int, pcchsqlstr: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLNativeSqlW(hdbc, szsqlstrin, cchsqlstrin, szsqlstr, cchsqlstrmax, pcchsqlstr)

public actual fun SQLNumParams(hstmt: Long, pcpar: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLNumParams(hstmt, pcpar)

public actual fun SQLNumResultCols(statementhandle: Long, columncount: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLNumResultCols(statementhandle, columncount)

public actual fun SQLParamData(statementhandle: Long, value: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLParamData(statementhandle, value)

public actual fun SQLParamOptions(hstmt: Long, crow: ULong, pirow: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLParamOptions(hstmt, crow.toLong(), pirow)

public actual fun SQLPrepare(statementhandle: Long, statementtext: Long, textlength: Int): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLPrepare(statementhandle, statementtext, textlength)

public actual fun SQLPrepareA(hstmt: Long, szsqlstr: Long, cbsqlstr: Int): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLPrepareA(hstmt, szsqlstr, cbsqlstr)

public actual fun SQLPrepareW(hstmt: Long, szsqlstr: Long, cchsqlstr: Int): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLPrepareW(hstmt, szsqlstr, cchsqlstr)

public actual fun SQLPrimaryKeys(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLPrimaryKeys(hstmt, szcatalogname, cchcatalogname, szschemaname, cchschemaname, sztablename, cchtablename)

public actual fun SQLPrimaryKeysA(hstmt: Long, szcatalogname: Long, cbcatalogname: Short, szschemaname: Long, cbschemaname: Short, sztablename: Long, cbtablename: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLPrimaryKeysA(hstmt, szcatalogname, cbcatalogname, szschemaname, cbschemaname, sztablename, cbtablename)

public actual fun SQLPrimaryKeysW(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLPrimaryKeysW(hstmt, szcatalogname, cchcatalogname, szschemaname, cchschemaname, sztablename, cchtablename)

public actual fun SQLProcedureColumns(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, szprocname: Long, cchprocname: Short, szcolumnname: Long, cchcolumnname: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLProcedureColumns(hstmt, szcatalogname, cchcatalogname, szschemaname, cchschemaname, szprocname, cchprocname, szcolumnname, cchcolumnname)

public actual fun SQLProcedureColumnsA(hstmt: Long, szcatalogname: Long, cbcatalogname: Short, szschemaname: Long, cbschemaname: Short, szprocname: Long, cbprocname: Short, szcolumnname: Long, cbcolumnname: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLProcedureColumnsA(hstmt, szcatalogname, cbcatalogname, szschemaname, cbschemaname, szprocname, cbprocname, szcolumnname, cbcolumnname)

public actual fun SQLProcedureColumnsW(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, szprocname: Long, cchprocname: Short, szcolumnname: Long, cchcolumnname: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLProcedureColumnsW(hstmt, szcatalogname, cchcatalogname, szschemaname, cchschemaname, szprocname, cchprocname, szcolumnname, cchcolumnname)

public actual fun SQLProcedures(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, szprocname: Long, cchprocname: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLProcedures(hstmt, szcatalogname, cchcatalogname, szschemaname, cchschemaname, szprocname, cchprocname)

public actual fun SQLProceduresA(hstmt: Long, szcatalogname: Long, cbcatalogname: Short, szschemaname: Long, cbschemaname: Short, szprocname: Long, cbprocname: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLProceduresA(hstmt, szcatalogname, cbcatalogname, szschemaname, cbschemaname, szprocname, cbprocname)

public actual fun SQLProceduresW(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, szprocname: Long, cchprocname: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLProceduresW(hstmt, szcatalogname, cchcatalogname, szschemaname, cchschemaname, szprocname, cchprocname)

public actual fun SQLPutData(statementhandle: Long, data: Long, strlen_or_ind: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLPutData(statementhandle, data, strlen_or_ind)

public actual fun SQLRowCount(statementhandle: Long, rowcount: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLRowCount(statementhandle, rowcount)

public actual fun SQLSetConnectAttr(connectionhandle: Long, attribute: Int, value: Long, stringlength: Int): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLSetConnectAttr(connectionhandle, attribute, value, stringlength)

public actual fun SQLSetConnectAttrA(hdbc: Long, fattribute: Int, rgbvalue: Long, cbvalue: Int): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLSetConnectAttrA(hdbc, fattribute, rgbvalue, cbvalue)

public actual fun SQLSetConnectAttrW(hdbc: Long, fattribute: Int, rgbvalue: Long, cbvalue: Int): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLSetConnectAttrW(hdbc, fattribute, rgbvalue, cbvalue)

public actual fun SQLSetConnectOption(connectionhandle: Long, option: UShort, value: ULong): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLSetConnectOption(connectionhandle, option.toShort(), value.toLong())

public actual fun SQLSetConnectOptionA(hdbc: Long, foption: UShort, vparam: ULong): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLSetConnectOptionA(hdbc, foption.toShort(), vparam.toLong())

public actual fun SQLSetConnectOptionW(hdbc: Long, foption: UShort, vparam: ULong): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLSetConnectOptionW(hdbc, foption.toShort(), vparam.toLong())

public actual fun SQLSetCursorName(statementhandle: Long, cursorname: Long, namelength: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLSetCursorName(statementhandle, cursorname, namelength)

public actual fun SQLSetCursorNameA(hstmt: Long, szcursor: Long, cbcursor: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLSetCursorNameA(hstmt, szcursor, cbcursor)

public actual fun SQLSetCursorNameW(hstmt: Long, szcursor: Long, cchcursor: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLSetCursorNameW(hstmt, szcursor, cchcursor)

public actual fun SQLSetDescField(descriptorhandle: Long, recnumber: Short, fieldidentifier: Short, value: Long, bufferlength: Int): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLSetDescField(descriptorhandle, recnumber, fieldidentifier, value, bufferlength)

public actual fun SQLSetDescFieldW(descriptorhandle: Long, recnumber: Short, fieldidentifier: Short, value: Long, bufferlength: Int): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLSetDescFieldW(descriptorhandle, recnumber, fieldidentifier, value, bufferlength)

public actual fun SQLSetDescRec(descriptorhandle: Long, recnumber: Short, type: Short, subtype: Short, length: Long, precision: Short, scale: Short, data: Long, stringlength: Long, indicator: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLSetDescRec(descriptorhandle, recnumber, type, subtype, length, precision, scale, data, stringlength, indicator)

public actual fun SQLSetEnvAttr(environmenthandle: Long, attribute: Int, value: Long, stringlength: Int): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLSetEnvAttr(environmenthandle, attribute, value, stringlength)

public actual fun SQLSetParam(statementhandle: Long, parameternumber: UShort, valuetype: Short, parametertype: Short, lengthprecision: ULong, parameterscale: Short, parametervalue: Long, strlen_or_ind: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLSetParam(statementhandle, parameternumber.toShort(), valuetype, parametertype, lengthprecision.toLong(), parameterscale, parametervalue, strlen_or_ind)

public actual fun SQLSetPos(hstmt: Long, irow: ULong, foption: UShort, flock: UShort): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLSetPos(hstmt, irow.toLong(), foption.toShort(), flock.toShort())

public actual fun SQLSetScrollOptions(hstmt: Long, fconcurrency: UShort, crowkeyset: Long, crowrowset: UShort): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLSetScrollOptions(hstmt, fconcurrency.toShort(), crowkeyset, crowrowset.toShort())

public actual fun SQLSetStmtAttr(statementhandle: Long, attribute: Int, value: Long, stringlength: Int): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLSetStmtAttr(statementhandle, attribute, value, stringlength)

public actual fun SQLSetStmtAttrW(hstmt: Long, fattribute: Int, rgbvalue: Long, cbvaluemax: Int): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLSetStmtAttrW(hstmt, fattribute, rgbvalue, cbvaluemax)

public actual fun SQLSetStmtOption(statementhandle: Long, option: UShort, value: ULong): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLSetStmtOption(statementhandle, option.toShort(), value.toLong())

public actual fun SQLSpecialColumns(statementhandle: Long, identifiertype: UShort, catalogname: Long, namelength1: Short, schemaname: Long, namelength2: Short, tablename: Long, namelength3: Short, scope: UShort, nullable: UShort): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLSpecialColumns(statementhandle, identifiertype.toShort(), catalogname, namelength1, schemaname, namelength2, tablename, namelength3, scope.toShort(), nullable.toShort())

public actual fun SQLSpecialColumnsA(hstmt: Long, fcoltype: UShort, szcatalogname: Long, cbcatalogname: Short, szschemaname: Long, cbschemaname: Short, sztablename: Long, cbtablename: Short, fscope: UShort, fnullable: UShort): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLSpecialColumnsA(hstmt, fcoltype.toShort(), szcatalogname, cbcatalogname, szschemaname, cbschemaname, sztablename, cbtablename, fscope.toShort(), fnullable.toShort())

public actual fun SQLSpecialColumnsW(hstmt: Long, fcoltype: UShort, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short, fscope: UShort, fnullable: UShort): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLSpecialColumnsW(hstmt, fcoltype.toShort(), szcatalogname, cchcatalogname, szschemaname, cchschemaname, sztablename, cchtablename, fscope.toShort(), fnullable.toShort())

public actual fun SQLStatistics(statementhandle: Long, catalogname: Long, namelength1: Short, schemaname: Long, namelength2: Short, tablename: Long, namelength3: Short, unique: UShort, reserved: UShort): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLStatistics(statementhandle, catalogname, namelength1, schemaname, namelength2, tablename, namelength3, unique.toShort(), reserved.toShort())

public actual fun SQLStatisticsA(hstmt: Long, szcatalogname: Long, cbcatalogname: Short, szschemaname: Long, cbschemaname: Short, sztablename: Long, cbtablename: Short, funique: UShort, faccuracy: UShort): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLStatisticsA(hstmt, szcatalogname, cbcatalogname, szschemaname, cbschemaname, sztablename, cbtablename, funique.toShort(), faccuracy.toShort())

public actual fun SQLStatisticsW(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short, funique: UShort, faccuracy: UShort): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLStatisticsW(hstmt, szcatalogname, cchcatalogname, szschemaname, cchschemaname, sztablename, cchtablename, funique.toShort(), faccuracy.toShort())

public actual fun SQLTablePrivileges(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLTablePrivileges(hstmt, szcatalogname, cchcatalogname, szschemaname, cchschemaname, sztablename, cchtablename)

public actual fun SQLTablePrivilegesA(hstmt: Long, szcatalogname: Long, cbcatalogname: Short, szschemaname: Long, cbschemaname: Short, sztablename: Long, cbtablename: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLTablePrivilegesA(hstmt, szcatalogname, cbcatalogname, szschemaname, cbschemaname, sztablename, cbtablename)

public actual fun SQLTablePrivilegesW(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLTablePrivilegesW(hstmt, szcatalogname, cchcatalogname, szschemaname, cchschemaname, sztablename, cchtablename)

public actual fun SQLTables(statementhandle: Long, catalogname: Long, namelength1: Short, schemaname: Long, namelength2: Short, tablename: Long, namelength3: Short, tabletype: Long, namelength4: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLTables(statementhandle, catalogname, namelength1, schemaname, namelength2, tablename, namelength3, tabletype, namelength4)

public actual fun SQLTablesA(hstmt: Long, szcatalogname: Long, cbcatalogname: Short, szschemaname: Long, cbschemaname: Short, sztablename: Long, cbtablename: Short, sztabletype: Long, cbtabletype: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLTablesA(hstmt, szcatalogname, cbcatalogname, szschemaname, cbschemaname, sztablename, cbtablename, sztabletype, cbtabletype)

public actual fun SQLTablesW(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short, sztabletype: Long, cchtabletype: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLTablesW(hstmt, szcatalogname, cchcatalogname, szschemaname, cchschemaname, sztablename, cchtablename, sztabletype, cchtabletype)

public actual fun SQLTransact(environmenthandle: Long, connectionhandle: Long, completiontype: UShort): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_SQLTransact(environmenthandle, connectionhandle, completiontype.toShort())

public actual fun bcp_batch(param0: Long): Int =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_bcp_batch(param0)

public actual fun bcp_bind(param0: Long, param1: Long, param2: Int, param3: Int, param4: Long, param5: Int, param6: Int, param7: Int): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_bcp_bind(param0, param1, param2, param3, param4, param5, param6, param7)

public actual fun bcp_colfmt(param0: Long, param1: Int, param2: UByte, param3: Int, param4: Int, param5: Long, param6: Int, param7: Int): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_bcp_colfmt(param0, param1, param2.toByte(), param3, param4, param5, param6, param7)

public actual fun bcp_collen(param0: Long, param1: Int, param2: Int): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_bcp_collen(param0, param1, param2)

public actual fun bcp_colptr(param0: Long, param1: Long, param2: Int): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_bcp_colptr(param0, param1, param2)

public actual fun bcp_columns(param0: Long, param1: Int): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_bcp_columns(param0, param1)

public actual fun bcp_control(param0: Long, param1: Int, param2: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_bcp_control(param0, param1, param2)

public actual fun bcp_done(param0: Long): Int =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_bcp_done(param0)

public actual fun bcp_exec(param0: Long, param1: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_bcp_exec(param0, param1)

public actual fun bcp_getcolfmt(param0: Long, param1: Int, param2: Int, param3: Long, param4: Int, param5: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_bcp_getcolfmt(param0, param1, param2, param3, param4, param5)

public actual fun bcp_initA(param0: Long, param1: PCSTR, param2: PCSTR, param3: PCSTR, param4: Int): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_bcp_initA(param0, param1, param2, param3, param4)

public actual fun bcp_initW(param0: Long, param1: PCWSTR, param2: PCWSTR, param3: PCWSTR, param4: Int): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_bcp_initW(param0, param1, param2, param3, param4)

public actual fun bcp_moretext(param0: Long, param1: Int, param2: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_bcp_moretext(param0, param1, param2)

public actual fun bcp_readfmtA(param0: Long, param1: PCSTR): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_bcp_readfmtA(param0, param1)

public actual fun bcp_readfmtW(param0: Long, param1: PCWSTR): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_bcp_readfmtW(param0, param1)

public actual fun bcp_sendrow(param0: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_bcp_sendrow(param0)

public actual fun bcp_setcolfmt(param0: Long, param1: Int, param2: Int, param3: Long, param4: Int): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_bcp_setcolfmt(param0, param1, param2, param3, param4)

public actual fun bcp_writefmtA(param0: Long, param1: PCSTR): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_bcp_writefmtA(param0, param1)

public actual fun bcp_writefmtW(param0: Long, param1: PCWSTR): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_bcp_writefmtW(param0, param1)

public actual fun dbprtypeA(param0: Int): PSTR =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_dbprtypeA(param0)

public actual fun dbprtypeW(param0: Int): PWSTR =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_dbprtypeW(param0)
