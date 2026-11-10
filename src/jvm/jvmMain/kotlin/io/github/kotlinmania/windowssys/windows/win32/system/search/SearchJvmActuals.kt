@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.search

import io.github.kotlinmania.windowssys.COpaquePointer
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
    external fun windowssys_windows_win32_system_search_oDBCGetTryWaitValue(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_search_oDBCSetTryWaitValue(dwvalue: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLAllocConnect(environmenthandle: Long, connectionhandle: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLAllocEnv(environmenthandle: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLAllocHandle(handletype: Short, inputhandle: Long, outputhandle: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLAllocHandleStd(fhandletype: Short, hinput: Long, phoutput: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLAllocStmt(connectionhandle: Long, statementhandle: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLBindCol(statementhandle: Long, columnnumber: Short, targettype: Short, targetvalue: Long, bufferlength: Long, strlenOrInd: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLBindParam(statementhandle: Long, parameternumber: Short, valuetype: Short, parametertype: Short, lengthprecision: Long, parameterscale: Short, parametervalue: Long, strlenOrInd: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLBindParameter(hstmt: Long, ipar: Short, fparamtype: Short, fctype: Short, fsqltype: Short, cbcoldef: Long, ibscale: Short, rgbvalue: Long, cbvaluemax: Long, pcbvalue: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLBrowseConnect(hdbc: Long, szconnstrin: Long, cchconnstrin: Short, szconnstrout: Long, cchconnstroutmax: Short, pcchconnstrout: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLBrowseConnectA(hdbc: Long, szconnstrin: Long, cbconnstrin: Short, szconnstrout: Long, cbconnstroutmax: Short, pcbconnstrout: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLBrowseConnectW(hdbc: Long, szconnstrin: Long, cchconnstrin: Short, szconnstrout: Long, cchconnstroutmax: Short, pcchconnstrout: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLBulkOperations(statementhandle: Long, operation: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLCancel(statementhandle: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLCancelHandle(handletype: Short, inputhandle: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLCloseCursor(statementhandle: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLCloseEnumServers(henumhandle: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLColAttribute(statementhandle: Long, columnnumber: Short, fieldidentifier: Short, characterattribute: Long, bufferlength: Short, stringlength: Long, numericattribute: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLColAttributeA(hstmt: Long, icol: Short, ifield: Short, pcharattr: Long, cbcharattrmax: Short, pcbcharattr: Long, pnumattr: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLColAttributeW(hstmt: Long, icol: Short, ifield: Short, pcharattr: Long, cbdescmax: Short, pcbcharattr: Long, pnumattr: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLColAttributes(hstmt: Long, icol: Short, fdesctype: Short, rgbdesc: Long, cbdescmax: Short, pcbdesc: Long, pfdesc: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLColAttributesA(hstmt: Long, icol: Short, fdesctype: Short, rgbdesc: Long, cbdescmax: Short, pcbdesc: Long, pfdesc: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLColAttributesW(hstmt: Long, icol: Short, fdesctype: Short, rgbdesc: Long, cbdescmax: Short, pcbdesc: Long, pfdesc: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLColumnPrivileges(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short, szcolumnname: Long, cchcolumnname: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLColumnPrivilegesA(hstmt: Long, szcatalogname: Long, cbcatalogname: Short, szschemaname: Long, cbschemaname: Short, sztablename: Long, cbtablename: Short, szcolumnname: Long, cbcolumnname: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLColumnPrivilegesW(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short, szcolumnname: Long, cchcolumnname: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLColumns(statementhandle: Long, catalogname: Long, namelength1: Short, schemaname: Long, namelength2: Short, tablename: Long, namelength3: Short, columnname: Long, namelength4: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLColumnsA(hstmt: Long, szcatalogname: Long, cbcatalogname: Short, szschemaname: Long, cbschemaname: Short, sztablename: Long, cbtablename: Short, szcolumnname: Long, cbcolumnname: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLColumnsW(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short, szcolumnname: Long, cchcolumnname: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLCompleteAsync(handletype: Short, handle: Long, asyncretcodeptr: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLConnect(connectionhandle: Long, servername: Long, namelength1: Short, username: Long, namelength2: Short, authentication: Long, namelength3: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLConnectA(hdbc: Long, szdsn: Long, cbdsn: Short, szuid: Long, cbuid: Short, szauthstr: Long, cbauthstr: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLConnectW(hdbc: Long, szdsn: Long, cchdsn: Short, szuid: Long, cchuid: Short, szauthstr: Long, cchauthstr: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLCopyDesc(sourcedeschandle: Long, targetdeschandle: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLDataSources(environmenthandle: Long, direction: Short, servername: Long, bufferlength1: Short, namelength1ptr: Long, description: Long, bufferlength2: Short, namelength2ptr: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLDataSourcesA(henv: Long, fdirection: Short, szdsn: Long, cbdsnmax: Short, pcbdsn: Long, szdescription: Long, cbdescriptionmax: Short, pcbdescription: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLDataSourcesW(henv: Long, fdirection: Short, szdsn: Long, cchdsnmax: Short, pcchdsn: Long, wszdescription: Long, cchdescriptionmax: Short, pcchdescription: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLDescribeCol(statementhandle: Long, columnnumber: Short, columnname: Long, bufferlength: Short, namelength: Long, datatype: Long, columnsize: Long, decimaldigits: Long, nullable: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLDescribeColA(hstmt: Long, icol: Short, szcolname: Long, cbcolnamemax: Short, pcbcolname: Long, pfsqltype: Long, pcbcoldef: Long, pibscale: Long, pfnullable: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLDescribeColW(hstmt: Long, icol: Short, szcolname: Long, cchcolnamemax: Short, pcchcolname: Long, pfsqltype: Long, pcbcoldef: Long, pibscale: Long, pfnullable: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLDescribeParam(hstmt: Long, ipar: Short, pfsqltype: Long, pcbparamdef: Long, pibscale: Long, pfnullable: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLDisconnect(connectionhandle: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLDriverConnect(hdbc: Long, hwnd: Long, szconnstrin: Long, cchconnstrin: Short, szconnstrout: Long, cchconnstroutmax: Short, pcchconnstrout: Long, fdrivercompletion: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLDriverConnectA(hdbc: Long, hwnd: Long, szconnstrin: Long, cbconnstrin: Short, szconnstrout: Long, cbconnstroutmax: Short, pcbconnstrout: Long, fdrivercompletion: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLDriverConnectW(hdbc: Long, hwnd: Long, szconnstrin: Long, cchconnstrin: Short, szconnstrout: Long, cchconnstroutmax: Short, pcchconnstrout: Long, fdrivercompletion: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLDrivers(henv: Long, fdirection: Short, szdriverdesc: Long, cchdriverdescmax: Short, pcchdriverdesc: Long, szdriverattributes: Long, cchdrvrattrmax: Short, pcchdrvrattr: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLDriversA(henv: Long, fdirection: Short, szdriverdesc: Long, cbdriverdescmax: Short, pcbdriverdesc: Long, szdriverattributes: Long, cbdrvrattrmax: Short, pcbdrvrattr: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLDriversW(henv: Long, fdirection: Short, szdriverdesc: Long, cchdriverdescmax: Short, pcchdriverdesc: Long, szdriverattributes: Long, cchdrvrattrmax: Short, pcchdrvrattr: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLEndTran(handletype: Short, handle: Long, completiontype: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLError(environmenthandle: Long, connectionhandle: Long, statementhandle: Long, sqlstate: Long, nativeerror: Long, messagetext: Long, bufferlength: Short, textlength: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLErrorA(henv: Long, hdbc: Long, hstmt: Long, szsqlstate: Long, pfnativeerror: Long, szerrormsg: Long, cberrormsgmax: Short, pcberrormsg: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLErrorW(henv: Long, hdbc: Long, hstmt: Long, wszsqlstate: Long, pfnativeerror: Long, wszerrormsg: Long, ccherrormsgmax: Short, pccherrormsg: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLExecDirect(statementhandle: Long, statementtext: Long, textlength: Int): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLExecDirectA(hstmt: Long, szsqlstr: Long, cbsqlstr: Int): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLExecDirectW(hstmt: Long, szsqlstr: Long, textlength: Int): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLExecute(statementhandle: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLExtendedFetch(hstmt: Long, ffetchtype: Short, irow: Long, pcrow: Long, rgfrowstatus: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLFetch(statementhandle: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLFetchScroll(statementhandle: Long, fetchorientation: Short, fetchoffset: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLForeignKeys(hstmt: Long, szpkcatalogname: Long, cchpkcatalogname: Short, szpkschemaname: Long, cchpkschemaname: Short, szpktablename: Long, cchpktablename: Short, szfkcatalogname: Long, cchfkcatalogname: Short, szfkschemaname: Long, cchfkschemaname: Short, szfktablename: Long, cchfktablename: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLForeignKeysA(hstmt: Long, szpkcatalogname: Long, cbpkcatalogname: Short, szpkschemaname: Long, cbpkschemaname: Short, szpktablename: Long, cbpktablename: Short, szfkcatalogname: Long, cbfkcatalogname: Short, szfkschemaname: Long, cbfkschemaname: Short, szfktablename: Long, cbfktablename: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLForeignKeysW(hstmt: Long, szpkcatalogname: Long, cchpkcatalogname: Short, szpkschemaname: Long, cchpkschemaname: Short, szpktablename: Long, cchpktablename: Short, szfkcatalogname: Long, cchfkcatalogname: Short, szfkschemaname: Long, cchfkschemaname: Short, szfktablename: Long, cchfktablename: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLFreeConnect(connectionhandle: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLFreeEnv(environmenthandle: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLFreeHandle(handletype: Short, handle: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLFreeStmt(statementhandle: Long, option: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLGetConnectAttr(connectionhandle: Long, attribute: Int, value: Long, bufferlength: Int, stringlengthptr: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLGetConnectAttrA(hdbc: Long, fattribute: Int, rgbvalue: Long, cbvaluemax: Int, pcbvalue: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLGetConnectAttrW(hdbc: Long, fattribute: Int, rgbvalue: Long, cbvaluemax: Int, pcbvalue: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLGetConnectOption(connectionhandle: Long, option: Short, value: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLGetConnectOptionA(hdbc: Long, foption: Short, pvparam: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLGetConnectOptionW(hdbc: Long, foption: Short, pvparam: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLGetCursorName(statementhandle: Long, cursorname: Long, bufferlength: Short, namelengthptr: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLGetCursorNameA(hstmt: Long, szcursor: Long, cbcursormax: Short, pcbcursor: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLGetCursorNameW(hstmt: Long, szcursor: Long, cchcursormax: Short, pcchcursor: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLGetData(statementhandle: Long, columnnumber: Short, targettype: Short, targetvalue: Long, bufferlength: Long, strlenOrIndptr: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLGetDescField(descriptorhandle: Long, recnumber: Short, fieldidentifier: Short, value: Long, bufferlength: Int, stringlength: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLGetDescFieldA(hdesc: Long, irecord: Short, ifield: Short, rgbvalue: Long, cbbufferlength: Int, stringlength: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLGetDescFieldW(hdesc: Long, irecord: Short, ifield: Short, rgbvalue: Long, cbbufferlength: Int, stringlength: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLGetDescRec(descriptorhandle: Long, recnumber: Short, name: Long, bufferlength: Short, stringlengthptr: Long, typeptr: Long, subtypeptr: Long, lengthptr: Long, precisionptr: Long, scaleptr: Long, nullableptr: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLGetDescRecA(hdesc: Long, irecord: Short, szname: Long, cbnamemax: Short, pcbname: Long, pftype: Long, pfsubtype: Long, plength: Long, pprecision: Long, pscale: Long, pnullable: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLGetDescRecW(hdesc: Long, irecord: Short, szname: Long, cchnamemax: Short, pcchname: Long, pftype: Long, pfsubtype: Long, plength: Long, pprecision: Long, pscale: Long, pnullable: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLGetDiagField(handletype: Short, handle: Long, recnumber: Short, diagidentifier: Short, diaginfo: Long, bufferlength: Short, stringlength: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLGetDiagFieldA(fhandletype: Short, handle: Long, irecord: Short, fdiagfield: Short, rgbdiaginfo: Long, cbdiaginfomax: Short, pcbdiaginfo: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLGetDiagFieldW(fhandletype: Short, handle: Long, irecord: Short, fdiagfield: Short, rgbdiaginfo: Long, cbbufferlength: Short, pcbstringlength: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLGetDiagRec(handletype: Short, handle: Long, recnumber: Short, sqlstate: Long, nativeerror: Long, messagetext: Long, bufferlength: Short, textlength: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLGetDiagRecA(fhandletype: Short, handle: Long, irecord: Short, szsqlstate: Long, pfnativeerror: Long, szerrormsg: Long, cberrormsgmax: Short, pcberrormsg: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLGetDiagRecW(fhandletype: Short, handle: Long, irecord: Short, szsqlstate: Long, pfnativeerror: Long, szerrormsg: Long, ccherrormsgmax: Short, pccherrormsg: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLGetEnvAttr(environmenthandle: Long, attribute: Int, value: Long, bufferlength: Int, stringlength: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLGetFunctions(connectionhandle: Long, functionid: Short, supported: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLGetInfo(connectionhandle: Long, infotype: Short, infovalue: Long, bufferlength: Short, stringlengthptr: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLGetInfoA(hdbc: Long, finfotype: Short, rgbinfovalue: Long, cbinfovaluemax: Short, pcbinfovalue: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLGetInfoW(hdbc: Long, finfotype: Short, rgbinfovalue: Long, cbinfovaluemax: Short, pcbinfovalue: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLGetNextEnumeration(henumhandle: Long, prgenumdata: Long, pienumlength: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLGetStmtAttr(statementhandle: Long, attribute: Int, value: Long, bufferlength: Int, stringlength: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLGetStmtAttrA(hstmt: Long, fattribute: Int, rgbvalue: Long, cbvaluemax: Int, pcbvalue: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLGetStmtAttrW(hstmt: Long, fattribute: Int, rgbvalue: Long, cbvaluemax: Int, pcbvalue: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLGetStmtOption(statementhandle: Long, option: Short, value: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLGetTypeInfo(statementhandle: Long, datatype: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLGetTypeInfoA(statementhandle: Long, datatype: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLGetTypeInfoW(statementhandle: Long, datatype: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLInitEnumServers(pwchservername: Long, pwchinstancename: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLLinkedCatalogsA(param0: Long, param1: Long, param2: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLLinkedCatalogsW(param0: Long, param1: Long, param2: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLLinkedServers(param0: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLMoreResults(hstmt: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLNativeSql(hdbc: Long, szsqlstrin: Long, cchsqlstrin: Int, szsqlstr: Long, cchsqlstrmax: Int, pcbsqlstr: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLNativeSqlA(hdbc: Long, szsqlstrin: Long, cbsqlstrin: Int, szsqlstr: Long, cbsqlstrmax: Int, pcbsqlstr: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLNativeSqlW(hdbc: Long, szsqlstrin: Long, cchsqlstrin: Int, szsqlstr: Long, cchsqlstrmax: Int, pcchsqlstr: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLNumParams(hstmt: Long, pcpar: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLNumResultCols(statementhandle: Long, columncount: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLParamData(statementhandle: Long, value: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLParamOptions(hstmt: Long, crow: Long, pirow: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLPrepare(statementhandle: Long, statementtext: Long, textlength: Int): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLPrepareA(hstmt: Long, szsqlstr: Long, cbsqlstr: Int): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLPrepareW(hstmt: Long, szsqlstr: Long, cchsqlstr: Int): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLPrimaryKeys(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLPrimaryKeysA(hstmt: Long, szcatalogname: Long, cbcatalogname: Short, szschemaname: Long, cbschemaname: Short, sztablename: Long, cbtablename: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLPrimaryKeysW(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLProcedureColumns(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, szprocname: Long, cchprocname: Short, szcolumnname: Long, cchcolumnname: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLProcedureColumnsA(hstmt: Long, szcatalogname: Long, cbcatalogname: Short, szschemaname: Long, cbschemaname: Short, szprocname: Long, cbprocname: Short, szcolumnname: Long, cbcolumnname: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLProcedureColumnsW(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, szprocname: Long, cchprocname: Short, szcolumnname: Long, cchcolumnname: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLProcedures(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, szprocname: Long, cchprocname: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLProceduresA(hstmt: Long, szcatalogname: Long, cbcatalogname: Short, szschemaname: Long, cbschemaname: Short, szprocname: Long, cbprocname: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLProceduresW(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, szprocname: Long, cchprocname: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLPutData(statementhandle: Long, data: Long, strlenOrInd: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLRowCount(statementhandle: Long, rowcount: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLSetConnectAttr(connectionhandle: Long, attribute: Int, value: Long, stringlength: Int): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLSetConnectAttrA(hdbc: Long, fattribute: Int, rgbvalue: Long, cbvalue: Int): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLSetConnectAttrW(hdbc: Long, fattribute: Int, rgbvalue: Long, cbvalue: Int): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLSetConnectOption(connectionhandle: Long, option: Short, value: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLSetConnectOptionA(hdbc: Long, foption: Short, vparam: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLSetConnectOptionW(hdbc: Long, foption: Short, vparam: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLSetCursorName(statementhandle: Long, cursorname: Long, namelength: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLSetCursorNameA(hstmt: Long, szcursor: Long, cbcursor: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLSetCursorNameW(hstmt: Long, szcursor: Long, cchcursor: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLSetDescField(descriptorhandle: Long, recnumber: Short, fieldidentifier: Short, value: Long, bufferlength: Int): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLSetDescFieldW(descriptorhandle: Long, recnumber: Short, fieldidentifier: Short, value: Long, bufferlength: Int): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLSetDescRec(descriptorhandle: Long, recnumber: Short, type: Short, subtype: Short, length: Long, precision: Short, scale: Short, data: Long, stringlength: Long, indicator: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLSetEnvAttr(environmenthandle: Long, attribute: Int, value: Long, stringlength: Int): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLSetParam(statementhandle: Long, parameternumber: Short, valuetype: Short, parametertype: Short, lengthprecision: Long, parameterscale: Short, parametervalue: Long, strlenOrInd: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLSetPos(hstmt: Long, irow: Long, foption: Short, flock: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLSetScrollOptions(hstmt: Long, fconcurrency: Short, crowkeyset: Long, crowrowset: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLSetStmtAttr(statementhandle: Long, attribute: Int, value: Long, stringlength: Int): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLSetStmtAttrW(hstmt: Long, fattribute: Int, rgbvalue: Long, cbvaluemax: Int): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLSetStmtOption(statementhandle: Long, option: Short, value: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLSpecialColumns(statementhandle: Long, identifiertype: Short, catalogname: Long, namelength1: Short, schemaname: Long, namelength2: Short, tablename: Long, namelength3: Short, scope: Short, nullable: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLSpecialColumnsA(hstmt: Long, fcoltype: Short, szcatalogname: Long, cbcatalogname: Short, szschemaname: Long, cbschemaname: Short, sztablename: Long, cbtablename: Short, fscope: Short, fnullable: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLSpecialColumnsW(hstmt: Long, fcoltype: Short, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short, fscope: Short, fnullable: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLStatistics(statementhandle: Long, catalogname: Long, namelength1: Short, schemaname: Long, namelength2: Short, tablename: Long, namelength3: Short, unique: Short, reserved: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLStatisticsA(hstmt: Long, szcatalogname: Long, cbcatalogname: Short, szschemaname: Long, cbschemaname: Short, sztablename: Long, cbtablename: Short, funique: Short, faccuracy: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLStatisticsW(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short, funique: Short, faccuracy: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLTablePrivileges(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLTablePrivilegesA(hstmt: Long, szcatalogname: Long, cbcatalogname: Short, szschemaname: Long, cbschemaname: Short, sztablename: Long, cbtablename: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLTablePrivilegesW(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLTables(statementhandle: Long, catalogname: Long, namelength1: Short, schemaname: Long, namelength2: Short, tablename: Long, namelength3: Short, tabletype: Long, namelength4: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLTablesA(hstmt: Long, szcatalogname: Long, cbcatalogname: Short, szschemaname: Long, cbschemaname: Short, sztablename: Long, cbtablename: Short, sztabletype: Long, cbtabletype: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLTablesW(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short, sztabletype: Long, cchtabletype: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_sQLTransact(environmenthandle: Long, connectionhandle: Long, completiontype: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_bcpBatch(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_search_bcpBind(param0: Long, param1: Long, param2: Int, param3: Int, param4: Long, param5: Int, param6: Int, param7: Int): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_bcpColfmt(param0: Long, param1: Int, param2: Byte, param3: Int, param4: Int, param5: Long, param6: Int, param7: Int): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_bcpCollen(param0: Long, param1: Int, param2: Int): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_bcpColptr(param0: Long, param1: Long, param2: Int): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_bcpColumns(param0: Long, param1: Int): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_bcpControl(param0: Long, param1: Int, param2: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_bcpDone(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_search_bcpExec(param0: Long, param1: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_bcpGetcolfmt(param0: Long, param1: Int, param2: Int, param3: Long, param4: Int, param5: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_bcpInitA(param0: Long, param1: Long, param2: Long, param3: Long, param4: Int): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_bcpInitW(param0: Long, param1: Long, param2: Long, param3: Long, param4: Int): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_bcpMoretext(param0: Long, param1: Int, param2: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_bcpReadfmtA(param0: Long, param1: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_bcpReadfmtW(param0: Long, param1: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_bcpSendrow(param0: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_bcpSetcolfmt(param0: Long, param1: Int, param2: Int, param3: Long, param4: Int): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_bcpWritefmtA(param0: Long, param1: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_bcpWritefmtW(param0: Long, param1: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_search_dbprtypeA(param0: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_search_dbprtypeW(param0: Int): Long
}

public actual fun oDBCGetTryWaitValue(): UInt =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_oDBCGetTryWaitValue().toUInt()

public actual fun oDBCSetTryWaitValue(dwvalue: UInt): Bool =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_oDBCSetTryWaitValue(dwvalue.toInt())

public actual fun sQLAllocConnect(environmenthandle: COpaquePointer?, connectionhandle: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLAllocConnect((environmenthandle?.value ?: 0L), (connectionhandle?.value ?: 0L))

public actual fun sQLAllocEnv(environmenthandle: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLAllocEnv((environmenthandle?.value ?: 0L))

public actual fun sQLAllocHandle(handletype: Short, inputhandle: COpaquePointer?, outputhandle: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLAllocHandle(handletype, (inputhandle?.value ?: 0L), (outputhandle?.value ?: 0L))

public actual fun sQLAllocHandleStd(fhandletype: Short, hinput: COpaquePointer?, phoutput: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLAllocHandleStd(fhandletype, (hinput?.value ?: 0L), (phoutput?.value ?: 0L))

public actual fun sQLAllocStmt(connectionhandle: COpaquePointer?, statementhandle: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLAllocStmt((connectionhandle?.value ?: 0L), (statementhandle?.value ?: 0L))

public actual fun sQLBindCol(statementhandle: COpaquePointer?, columnnumber: UShort, targettype: Short, targetvalue: COpaquePointer?, bufferlength: Long, strlenOrInd: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLBindCol((statementhandle?.value ?: 0L), columnnumber.toShort(), targettype, (targetvalue?.value ?: 0L), bufferlength, (strlenOrInd?.value ?: 0L))

public actual fun sQLBindParam(statementhandle: COpaquePointer?, parameternumber: UShort, valuetype: Short, parametertype: Short, lengthprecision: ULong, parameterscale: Short, parametervalue: COpaquePointer?, strlenOrInd: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLBindParam((statementhandle?.value ?: 0L), parameternumber.toShort(), valuetype, parametertype, lengthprecision.toLong(), parameterscale, (parametervalue?.value ?: 0L), (strlenOrInd?.value ?: 0L))

public actual fun sQLBindParameter(hstmt: COpaquePointer?, ipar: UShort, fparamtype: Short, fctype: Short, fsqltype: Short, cbcoldef: ULong, ibscale: Short, rgbvalue: COpaquePointer?, cbvaluemax: Long, pcbvalue: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLBindParameter((hstmt?.value ?: 0L), ipar.toShort(), fparamtype, fctype, fsqltype, cbcoldef.toLong(), ibscale, (rgbvalue?.value ?: 0L), cbvaluemax, (pcbvalue?.value ?: 0L))

public actual fun sQLBrowseConnect(hdbc: COpaquePointer?, szconnstrin: COpaquePointer?, cchconnstrin: Short, szconnstrout: COpaquePointer?, cchconnstroutmax: Short, pcchconnstrout: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLBrowseConnect((hdbc?.value ?: 0L), (szconnstrin?.value ?: 0L), cchconnstrin, (szconnstrout?.value ?: 0L), cchconnstroutmax, (pcchconnstrout?.value ?: 0L))

public actual fun sQLBrowseConnectA(hdbc: COpaquePointer?, szconnstrin: COpaquePointer?, cbconnstrin: Short, szconnstrout: COpaquePointer?, cbconnstroutmax: Short, pcbconnstrout: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLBrowseConnectA((hdbc?.value ?: 0L), (szconnstrin?.value ?: 0L), cbconnstrin, (szconnstrout?.value ?: 0L), cbconnstroutmax, (pcbconnstrout?.value ?: 0L))

public actual fun sQLBrowseConnectW(hdbc: COpaquePointer?, szconnstrin: COpaquePointer?, cchconnstrin: Short, szconnstrout: COpaquePointer?, cchconnstroutmax: Short, pcchconnstrout: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLBrowseConnectW((hdbc?.value ?: 0L), (szconnstrin?.value ?: 0L), cchconnstrin, (szconnstrout?.value ?: 0L), cchconnstroutmax, (pcchconnstrout?.value ?: 0L))

public actual fun sQLBulkOperations(statementhandle: COpaquePointer?, operation: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLBulkOperations((statementhandle?.value ?: 0L), operation)

public actual fun sQLCancel(statementhandle: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLCancel((statementhandle?.value ?: 0L))

public actual fun sQLCancelHandle(handletype: Short, inputhandle: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLCancelHandle(handletype, (inputhandle?.value ?: 0L))

public actual fun sQLCloseCursor(statementhandle: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLCloseCursor((statementhandle?.value ?: 0L))

public actual fun sQLCloseEnumServers(henumhandle: Handle): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLCloseEnumServers((henumhandle?.value ?: 0L))

public actual fun sQLColAttribute(statementhandle: COpaquePointer?, columnnumber: UShort, fieldidentifier: UShort, characterattribute: COpaquePointer?, bufferlength: Short, stringlength: COpaquePointer?, numericattribute: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLColAttribute((statementhandle?.value ?: 0L), columnnumber.toShort(), fieldidentifier.toShort(), (characterattribute?.value ?: 0L), bufferlength, (stringlength?.value ?: 0L), (numericattribute?.value ?: 0L))

public actual fun sQLColAttributeA(hstmt: COpaquePointer?, icol: Short, ifield: Short, pcharattr: COpaquePointer?, cbcharattrmax: Short, pcbcharattr: COpaquePointer?, pnumattr: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLColAttributeA((hstmt?.value ?: 0L), icol, ifield, (pcharattr?.value ?: 0L), cbcharattrmax, (pcbcharattr?.value ?: 0L), (pnumattr?.value ?: 0L))

public actual fun sQLColAttributeW(hstmt: COpaquePointer?, icol: UShort, ifield: UShort, pcharattr: COpaquePointer?, cbdescmax: Short, pcbcharattr: COpaquePointer?, pnumattr: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLColAttributeW((hstmt?.value ?: 0L), icol.toShort(), ifield.toShort(), (pcharattr?.value ?: 0L), cbdescmax, (pcbcharattr?.value ?: 0L), (pnumattr?.value ?: 0L))

public actual fun sQLColAttributes(hstmt: COpaquePointer?, icol: UShort, fdesctype: UShort, rgbdesc: COpaquePointer?, cbdescmax: Short, pcbdesc: COpaquePointer?, pfdesc: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLColAttributes((hstmt?.value ?: 0L), icol.toShort(), fdesctype.toShort(), (rgbdesc?.value ?: 0L), cbdescmax, (pcbdesc?.value ?: 0L), (pfdesc?.value ?: 0L))

public actual fun sQLColAttributesA(hstmt: COpaquePointer?, icol: UShort, fdesctype: UShort, rgbdesc: COpaquePointer?, cbdescmax: Short, pcbdesc: COpaquePointer?, pfdesc: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLColAttributesA((hstmt?.value ?: 0L), icol.toShort(), fdesctype.toShort(), (rgbdesc?.value ?: 0L), cbdescmax, (pcbdesc?.value ?: 0L), (pfdesc?.value ?: 0L))

public actual fun sQLColAttributesW(hstmt: COpaquePointer?, icol: UShort, fdesctype: UShort, rgbdesc: COpaquePointer?, cbdescmax: Short, pcbdesc: COpaquePointer?, pfdesc: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLColAttributesW((hstmt?.value ?: 0L), icol.toShort(), fdesctype.toShort(), (rgbdesc?.value ?: 0L), cbdescmax, (pcbdesc?.value ?: 0L), (pfdesc?.value ?: 0L))

public actual fun sQLColumnPrivileges(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cchcatalogname: Short, szschemaname: COpaquePointer?, cchschemaname: Short, sztablename: COpaquePointer?, cchtablename: Short, szcolumnname: COpaquePointer?, cchcolumnname: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLColumnPrivileges((hstmt?.value ?: 0L), (szcatalogname?.value ?: 0L), cchcatalogname, (szschemaname?.value ?: 0L), cchschemaname, (sztablename?.value ?: 0L), cchtablename, (szcolumnname?.value ?: 0L), cchcolumnname)

public actual fun sQLColumnPrivilegesA(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cbcatalogname: Short, szschemaname: COpaquePointer?, cbschemaname: Short, sztablename: COpaquePointer?, cbtablename: Short, szcolumnname: COpaquePointer?, cbcolumnname: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLColumnPrivilegesA((hstmt?.value ?: 0L), (szcatalogname?.value ?: 0L), cbcatalogname, (szschemaname?.value ?: 0L), cbschemaname, (sztablename?.value ?: 0L), cbtablename, (szcolumnname?.value ?: 0L), cbcolumnname)

public actual fun sQLColumnPrivilegesW(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cchcatalogname: Short, szschemaname: COpaquePointer?, cchschemaname: Short, sztablename: COpaquePointer?, cchtablename: Short, szcolumnname: COpaquePointer?, cchcolumnname: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLColumnPrivilegesW((hstmt?.value ?: 0L), (szcatalogname?.value ?: 0L), cchcatalogname, (szschemaname?.value ?: 0L), cchschemaname, (sztablename?.value ?: 0L), cchtablename, (szcolumnname?.value ?: 0L), cchcolumnname)

public actual fun sQLColumns(statementhandle: COpaquePointer?, catalogname: COpaquePointer?, namelength1: Short, schemaname: COpaquePointer?, namelength2: Short, tablename: COpaquePointer?, namelength3: Short, columnname: COpaquePointer?, namelength4: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLColumns((statementhandle?.value ?: 0L), (catalogname?.value ?: 0L), namelength1, (schemaname?.value ?: 0L), namelength2, (tablename?.value ?: 0L), namelength3, (columnname?.value ?: 0L), namelength4)

public actual fun sQLColumnsA(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cbcatalogname: Short, szschemaname: COpaquePointer?, cbschemaname: Short, sztablename: COpaquePointer?, cbtablename: Short, szcolumnname: COpaquePointer?, cbcolumnname: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLColumnsA((hstmt?.value ?: 0L), (szcatalogname?.value ?: 0L), cbcatalogname, (szschemaname?.value ?: 0L), cbschemaname, (sztablename?.value ?: 0L), cbtablename, (szcolumnname?.value ?: 0L), cbcolumnname)

public actual fun sQLColumnsW(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cchcatalogname: Short, szschemaname: COpaquePointer?, cchschemaname: Short, sztablename: COpaquePointer?, cchtablename: Short, szcolumnname: COpaquePointer?, cchcolumnname: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLColumnsW((hstmt?.value ?: 0L), (szcatalogname?.value ?: 0L), cchcatalogname, (szschemaname?.value ?: 0L), cchschemaname, (sztablename?.value ?: 0L), cchtablename, (szcolumnname?.value ?: 0L), cchcolumnname)

public actual fun sQLCompleteAsync(handletype: Short, handle: COpaquePointer?, asyncretcodeptr: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLCompleteAsync(handletype, (handle?.value ?: 0L), (asyncretcodeptr?.value ?: 0L))

public actual fun sQLConnect(connectionhandle: COpaquePointer?, servername: COpaquePointer?, namelength1: Short, username: COpaquePointer?, namelength2: Short, authentication: COpaquePointer?, namelength3: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLConnect((connectionhandle?.value ?: 0L), (servername?.value ?: 0L), namelength1, (username?.value ?: 0L), namelength2, (authentication?.value ?: 0L), namelength3)

public actual fun sQLConnectA(hdbc: COpaquePointer?, szdsn: COpaquePointer?, cbdsn: Short, szuid: COpaquePointer?, cbuid: Short, szauthstr: COpaquePointer?, cbauthstr: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLConnectA((hdbc?.value ?: 0L), (szdsn?.value ?: 0L), cbdsn, (szuid?.value ?: 0L), cbuid, (szauthstr?.value ?: 0L), cbauthstr)

public actual fun sQLConnectW(hdbc: COpaquePointer?, szdsn: COpaquePointer?, cchdsn: Short, szuid: COpaquePointer?, cchuid: Short, szauthstr: COpaquePointer?, cchauthstr: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLConnectW((hdbc?.value ?: 0L), (szdsn?.value ?: 0L), cchdsn, (szuid?.value ?: 0L), cchuid, (szauthstr?.value ?: 0L), cchauthstr)

public actual fun sQLCopyDesc(sourcedeschandle: COpaquePointer?, targetdeschandle: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLCopyDesc((sourcedeschandle?.value ?: 0L), (targetdeschandle?.value ?: 0L))

public actual fun sQLDataSources(environmenthandle: COpaquePointer?, direction: UShort, servername: COpaquePointer?, bufferlength1: Short, namelength1ptr: COpaquePointer?, description: COpaquePointer?, bufferlength2: Short, namelength2ptr: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLDataSources((environmenthandle?.value ?: 0L), direction.toShort(), (servername?.value ?: 0L), bufferlength1, (namelength1ptr?.value ?: 0L), (description?.value ?: 0L), bufferlength2, (namelength2ptr?.value ?: 0L))

public actual fun sQLDataSourcesA(henv: COpaquePointer?, fdirection: UShort, szdsn: COpaquePointer?, cbdsnmax: Short, pcbdsn: COpaquePointer?, szdescription: COpaquePointer?, cbdescriptionmax: Short, pcbdescription: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLDataSourcesA((henv?.value ?: 0L), fdirection.toShort(), (szdsn?.value ?: 0L), cbdsnmax, (pcbdsn?.value ?: 0L), (szdescription?.value ?: 0L), cbdescriptionmax, (pcbdescription?.value ?: 0L))

public actual fun sQLDataSourcesW(henv: COpaquePointer?, fdirection: UShort, szdsn: COpaquePointer?, cchdsnmax: Short, pcchdsn: COpaquePointer?, wszdescription: COpaquePointer?, cchdescriptionmax: Short, pcchdescription: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLDataSourcesW((henv?.value ?: 0L), fdirection.toShort(), (szdsn?.value ?: 0L), cchdsnmax, (pcchdsn?.value ?: 0L), (wszdescription?.value ?: 0L), cchdescriptionmax, (pcchdescription?.value ?: 0L))

public actual fun sQLDescribeCol(statementhandle: COpaquePointer?, columnnumber: UShort, columnname: COpaquePointer?, bufferlength: Short, namelength: COpaquePointer?, datatype: COpaquePointer?, columnsize: COpaquePointer?, decimaldigits: COpaquePointer?, nullable: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLDescribeCol((statementhandle?.value ?: 0L), columnnumber.toShort(), (columnname?.value ?: 0L), bufferlength, (namelength?.value ?: 0L), (datatype?.value ?: 0L), (columnsize?.value ?: 0L), (decimaldigits?.value ?: 0L), (nullable?.value ?: 0L))

public actual fun sQLDescribeColA(hstmt: COpaquePointer?, icol: UShort, szcolname: COpaquePointer?, cbcolnamemax: Short, pcbcolname: COpaquePointer?, pfsqltype: COpaquePointer?, pcbcoldef: COpaquePointer?, pibscale: COpaquePointer?, pfnullable: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLDescribeColA((hstmt?.value ?: 0L), icol.toShort(), (szcolname?.value ?: 0L), cbcolnamemax, (pcbcolname?.value ?: 0L), (pfsqltype?.value ?: 0L), (pcbcoldef?.value ?: 0L), (pibscale?.value ?: 0L), (pfnullable?.value ?: 0L))

public actual fun sQLDescribeColW(hstmt: COpaquePointer?, icol: UShort, szcolname: COpaquePointer?, cchcolnamemax: Short, pcchcolname: COpaquePointer?, pfsqltype: COpaquePointer?, pcbcoldef: COpaquePointer?, pibscale: COpaquePointer?, pfnullable: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLDescribeColW((hstmt?.value ?: 0L), icol.toShort(), (szcolname?.value ?: 0L), cchcolnamemax, (pcchcolname?.value ?: 0L), (pfsqltype?.value ?: 0L), (pcbcoldef?.value ?: 0L), (pibscale?.value ?: 0L), (pfnullable?.value ?: 0L))

public actual fun sQLDescribeParam(hstmt: COpaquePointer?, ipar: UShort, pfsqltype: COpaquePointer?, pcbparamdef: COpaquePointer?, pibscale: COpaquePointer?, pfnullable: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLDescribeParam((hstmt?.value ?: 0L), ipar.toShort(), (pfsqltype?.value ?: 0L), (pcbparamdef?.value ?: 0L), (pibscale?.value ?: 0L), (pfnullable?.value ?: 0L))

public actual fun sQLDisconnect(connectionhandle: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLDisconnect((connectionhandle?.value ?: 0L))

public actual fun sQLDriverConnect(hdbc: COpaquePointer?, hwnd: Long, szconnstrin: COpaquePointer?, cchconnstrin: Short, szconnstrout: COpaquePointer?, cchconnstroutmax: Short, pcchconnstrout: COpaquePointer?, fdrivercompletion: UShort): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLDriverConnect((hdbc?.value ?: 0L), hwnd, (szconnstrin?.value ?: 0L), cchconnstrin, (szconnstrout?.value ?: 0L), cchconnstroutmax, (pcchconnstrout?.value ?: 0L), fdrivercompletion.toShort())

public actual fun sQLDriverConnectA(hdbc: COpaquePointer?, hwnd: Long, szconnstrin: COpaquePointer?, cbconnstrin: Short, szconnstrout: COpaquePointer?, cbconnstroutmax: Short, pcbconnstrout: COpaquePointer?, fdrivercompletion: UShort): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLDriverConnectA((hdbc?.value ?: 0L), hwnd, (szconnstrin?.value ?: 0L), cbconnstrin, (szconnstrout?.value ?: 0L), cbconnstroutmax, (pcbconnstrout?.value ?: 0L), fdrivercompletion.toShort())

public actual fun sQLDriverConnectW(hdbc: COpaquePointer?, hwnd: Long, szconnstrin: COpaquePointer?, cchconnstrin: Short, szconnstrout: COpaquePointer?, cchconnstroutmax: Short, pcchconnstrout: COpaquePointer?, fdrivercompletion: UShort): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLDriverConnectW((hdbc?.value ?: 0L), hwnd, (szconnstrin?.value ?: 0L), cchconnstrin, (szconnstrout?.value ?: 0L), cchconnstroutmax, (pcchconnstrout?.value ?: 0L), fdrivercompletion.toShort())

public actual fun sQLDrivers(henv: COpaquePointer?, fdirection: UShort, szdriverdesc: COpaquePointer?, cchdriverdescmax: Short, pcchdriverdesc: COpaquePointer?, szdriverattributes: COpaquePointer?, cchdrvrattrmax: Short, pcchdrvrattr: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLDrivers((henv?.value ?: 0L), fdirection.toShort(), (szdriverdesc?.value ?: 0L), cchdriverdescmax, (pcchdriverdesc?.value ?: 0L), (szdriverattributes?.value ?: 0L), cchdrvrattrmax, (pcchdrvrattr?.value ?: 0L))

public actual fun sQLDriversA(henv: COpaquePointer?, fdirection: UShort, szdriverdesc: COpaquePointer?, cbdriverdescmax: Short, pcbdriverdesc: COpaquePointer?, szdriverattributes: COpaquePointer?, cbdrvrattrmax: Short, pcbdrvrattr: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLDriversA((henv?.value ?: 0L), fdirection.toShort(), (szdriverdesc?.value ?: 0L), cbdriverdescmax, (pcbdriverdesc?.value ?: 0L), (szdriverattributes?.value ?: 0L), cbdrvrattrmax, (pcbdrvrattr?.value ?: 0L))

public actual fun sQLDriversW(henv: COpaquePointer?, fdirection: UShort, szdriverdesc: COpaquePointer?, cchdriverdescmax: Short, pcchdriverdesc: COpaquePointer?, szdriverattributes: COpaquePointer?, cchdrvrattrmax: Short, pcchdrvrattr: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLDriversW((henv?.value ?: 0L), fdirection.toShort(), (szdriverdesc?.value ?: 0L), cchdriverdescmax, (pcchdriverdesc?.value ?: 0L), (szdriverattributes?.value ?: 0L), cchdrvrattrmax, (pcchdrvrattr?.value ?: 0L))

public actual fun sQLEndTran(handletype: Short, handle: COpaquePointer?, completiontype: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLEndTran(handletype, (handle?.value ?: 0L), completiontype)

public actual fun sQLError(environmenthandle: COpaquePointer?, connectionhandle: COpaquePointer?, statementhandle: COpaquePointer?, sqlstate: COpaquePointer?, nativeerror: COpaquePointer?, messagetext: COpaquePointer?, bufferlength: Short, textlength: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLError((environmenthandle?.value ?: 0L), (connectionhandle?.value ?: 0L), (statementhandle?.value ?: 0L), (sqlstate?.value ?: 0L), (nativeerror?.value ?: 0L), (messagetext?.value ?: 0L), bufferlength, (textlength?.value ?: 0L))

public actual fun sQLErrorA(henv: COpaquePointer?, hdbc: COpaquePointer?, hstmt: COpaquePointer?, szsqlstate: COpaquePointer?, pfnativeerror: COpaquePointer?, szerrormsg: COpaquePointer?, cberrormsgmax: Short, pcberrormsg: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLErrorA((henv?.value ?: 0L), (hdbc?.value ?: 0L), (hstmt?.value ?: 0L), (szsqlstate?.value ?: 0L), (pfnativeerror?.value ?: 0L), (szerrormsg?.value ?: 0L), cberrormsgmax, (pcberrormsg?.value ?: 0L))

public actual fun sQLErrorW(henv: COpaquePointer?, hdbc: COpaquePointer?, hstmt: COpaquePointer?, wszsqlstate: COpaquePointer?, pfnativeerror: COpaquePointer?, wszerrormsg: COpaquePointer?, ccherrormsgmax: Short, pccherrormsg: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLErrorW((henv?.value ?: 0L), (hdbc?.value ?: 0L), (hstmt?.value ?: 0L), (wszsqlstate?.value ?: 0L), (pfnativeerror?.value ?: 0L), (wszerrormsg?.value ?: 0L), ccherrormsgmax, (pccherrormsg?.value ?: 0L))

public actual fun sQLExecDirect(statementhandle: COpaquePointer?, statementtext: COpaquePointer?, textlength: Int): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLExecDirect((statementhandle?.value ?: 0L), (statementtext?.value ?: 0L), textlength)

public actual fun sQLExecDirectA(hstmt: COpaquePointer?, szsqlstr: COpaquePointer?, cbsqlstr: Int): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLExecDirectA((hstmt?.value ?: 0L), (szsqlstr?.value ?: 0L), cbsqlstr)

public actual fun sQLExecDirectW(hstmt: COpaquePointer?, szsqlstr: COpaquePointer?, textlength: Int): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLExecDirectW((hstmt?.value ?: 0L), (szsqlstr?.value ?: 0L), textlength)

public actual fun sQLExecute(statementhandle: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLExecute((statementhandle?.value ?: 0L))

public actual fun sQLExtendedFetch(hstmt: COpaquePointer?, ffetchtype: UShort, irow: Long, pcrow: COpaquePointer?, rgfrowstatus: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLExtendedFetch((hstmt?.value ?: 0L), ffetchtype.toShort(), irow, (pcrow?.value ?: 0L), (rgfrowstatus?.value ?: 0L))

public actual fun sQLFetch(statementhandle: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLFetch((statementhandle?.value ?: 0L))

public actual fun sQLFetchScroll(statementhandle: COpaquePointer?, fetchorientation: Short, fetchoffset: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLFetchScroll((statementhandle?.value ?: 0L), fetchorientation, fetchoffset)

public actual fun sQLForeignKeys(hstmt: COpaquePointer?, szpkcatalogname: COpaquePointer?, cchpkcatalogname: Short, szpkschemaname: COpaquePointer?, cchpkschemaname: Short, szpktablename: COpaquePointer?, cchpktablename: Short, szfkcatalogname: COpaquePointer?, cchfkcatalogname: Short, szfkschemaname: COpaquePointer?, cchfkschemaname: Short, szfktablename: COpaquePointer?, cchfktablename: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLForeignKeys((hstmt?.value ?: 0L), (szpkcatalogname?.value ?: 0L), cchpkcatalogname, (szpkschemaname?.value ?: 0L), cchpkschemaname, (szpktablename?.value ?: 0L), cchpktablename, (szfkcatalogname?.value ?: 0L), cchfkcatalogname, (szfkschemaname?.value ?: 0L), cchfkschemaname, (szfktablename?.value ?: 0L), cchfktablename)

public actual fun sQLForeignKeysA(hstmt: COpaquePointer?, szpkcatalogname: COpaquePointer?, cbpkcatalogname: Short, szpkschemaname: COpaquePointer?, cbpkschemaname: Short, szpktablename: COpaquePointer?, cbpktablename: Short, szfkcatalogname: COpaquePointer?, cbfkcatalogname: Short, szfkschemaname: COpaquePointer?, cbfkschemaname: Short, szfktablename: COpaquePointer?, cbfktablename: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLForeignKeysA((hstmt?.value ?: 0L), (szpkcatalogname?.value ?: 0L), cbpkcatalogname, (szpkschemaname?.value ?: 0L), cbpkschemaname, (szpktablename?.value ?: 0L), cbpktablename, (szfkcatalogname?.value ?: 0L), cbfkcatalogname, (szfkschemaname?.value ?: 0L), cbfkschemaname, (szfktablename?.value ?: 0L), cbfktablename)

public actual fun sQLForeignKeysW(hstmt: COpaquePointer?, szpkcatalogname: COpaquePointer?, cchpkcatalogname: Short, szpkschemaname: COpaquePointer?, cchpkschemaname: Short, szpktablename: COpaquePointer?, cchpktablename: Short, szfkcatalogname: COpaquePointer?, cchfkcatalogname: Short, szfkschemaname: COpaquePointer?, cchfkschemaname: Short, szfktablename: COpaquePointer?, cchfktablename: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLForeignKeysW((hstmt?.value ?: 0L), (szpkcatalogname?.value ?: 0L), cchpkcatalogname, (szpkschemaname?.value ?: 0L), cchpkschemaname, (szpktablename?.value ?: 0L), cchpktablename, (szfkcatalogname?.value ?: 0L), cchfkcatalogname, (szfkschemaname?.value ?: 0L), cchfkschemaname, (szfktablename?.value ?: 0L), cchfktablename)

public actual fun sQLFreeConnect(connectionhandle: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLFreeConnect((connectionhandle?.value ?: 0L))

public actual fun sQLFreeEnv(environmenthandle: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLFreeEnv((environmenthandle?.value ?: 0L))

public actual fun sQLFreeHandle(handletype: Short, handle: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLFreeHandle(handletype, (handle?.value ?: 0L))

public actual fun sQLFreeStmt(statementhandle: COpaquePointer?, option: UShort): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLFreeStmt((statementhandle?.value ?: 0L), option.toShort())

public actual fun sQLGetConnectAttr(connectionhandle: COpaquePointer?, attribute: Int, value: COpaquePointer?, bufferlength: Int, stringlengthptr: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLGetConnectAttr((connectionhandle?.value ?: 0L), attribute, (value?.value ?: 0L), bufferlength, (stringlengthptr?.value ?: 0L))

public actual fun sQLGetConnectAttrA(hdbc: COpaquePointer?, fattribute: Int, rgbvalue: COpaquePointer?, cbvaluemax: Int, pcbvalue: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLGetConnectAttrA((hdbc?.value ?: 0L), fattribute, (rgbvalue?.value ?: 0L), cbvaluemax, (pcbvalue?.value ?: 0L))

public actual fun sQLGetConnectAttrW(hdbc: COpaquePointer?, fattribute: Int, rgbvalue: COpaquePointer?, cbvaluemax: Int, pcbvalue: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLGetConnectAttrW((hdbc?.value ?: 0L), fattribute, (rgbvalue?.value ?: 0L), cbvaluemax, (pcbvalue?.value ?: 0L))

public actual fun sQLGetConnectOption(connectionhandle: COpaquePointer?, option: UShort, value: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLGetConnectOption((connectionhandle?.value ?: 0L), option.toShort(), (value?.value ?: 0L))

public actual fun sQLGetConnectOptionA(hdbc: COpaquePointer?, foption: UShort, pvparam: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLGetConnectOptionA((hdbc?.value ?: 0L), foption.toShort(), (pvparam?.value ?: 0L))

public actual fun sQLGetConnectOptionW(hdbc: COpaquePointer?, foption: UShort, pvparam: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLGetConnectOptionW((hdbc?.value ?: 0L), foption.toShort(), (pvparam?.value ?: 0L))

public actual fun sQLGetCursorName(statementhandle: COpaquePointer?, cursorname: COpaquePointer?, bufferlength: Short, namelengthptr: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLGetCursorName((statementhandle?.value ?: 0L), (cursorname?.value ?: 0L), bufferlength, (namelengthptr?.value ?: 0L))

public actual fun sQLGetCursorNameA(hstmt: COpaquePointer?, szcursor: COpaquePointer?, cbcursormax: Short, pcbcursor: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLGetCursorNameA((hstmt?.value ?: 0L), (szcursor?.value ?: 0L), cbcursormax, (pcbcursor?.value ?: 0L))

public actual fun sQLGetCursorNameW(hstmt: COpaquePointer?, szcursor: COpaquePointer?, cchcursormax: Short, pcchcursor: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLGetCursorNameW((hstmt?.value ?: 0L), (szcursor?.value ?: 0L), cchcursormax, (pcchcursor?.value ?: 0L))

public actual fun sQLGetData(statementhandle: COpaquePointer?, columnnumber: UShort, targettype: Short, targetvalue: COpaquePointer?, bufferlength: Long, strlenOrIndptr: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLGetData((statementhandle?.value ?: 0L), columnnumber.toShort(), targettype, (targetvalue?.value ?: 0L), bufferlength, (strlenOrIndptr?.value ?: 0L))

public actual fun sQLGetDescField(descriptorhandle: COpaquePointer?, recnumber: Short, fieldidentifier: Short, value: COpaquePointer?, bufferlength: Int, stringlength: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLGetDescField((descriptorhandle?.value ?: 0L), recnumber, fieldidentifier, (value?.value ?: 0L), bufferlength, (stringlength?.value ?: 0L))

public actual fun sQLGetDescFieldA(hdesc: COpaquePointer?, irecord: Short, ifield: Short, rgbvalue: COpaquePointer?, cbbufferlength: Int, stringlength: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLGetDescFieldA((hdesc?.value ?: 0L), irecord, ifield, (rgbvalue?.value ?: 0L), cbbufferlength, (stringlength?.value ?: 0L))

public actual fun sQLGetDescFieldW(hdesc: COpaquePointer?, irecord: Short, ifield: Short, rgbvalue: COpaquePointer?, cbbufferlength: Int, stringlength: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLGetDescFieldW((hdesc?.value ?: 0L), irecord, ifield, (rgbvalue?.value ?: 0L), cbbufferlength, (stringlength?.value ?: 0L))

public actual fun sQLGetDescRec(descriptorhandle: COpaquePointer?, recnumber: Short, name: COpaquePointer?, bufferlength: Short, stringlengthptr: COpaquePointer?, typeptr: COpaquePointer?, subtypeptr: COpaquePointer?, lengthptr: COpaquePointer?, precisionptr: COpaquePointer?, scaleptr: COpaquePointer?, nullableptr: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLGetDescRec((descriptorhandle?.value ?: 0L), recnumber, (name?.value ?: 0L), bufferlength, (stringlengthptr?.value ?: 0L), (typeptr?.value ?: 0L), (subtypeptr?.value ?: 0L), (lengthptr?.value ?: 0L), (precisionptr?.value ?: 0L), (scaleptr?.value ?: 0L), (nullableptr?.value ?: 0L))

public actual fun sQLGetDescRecA(hdesc: COpaquePointer?, irecord: Short, szname: COpaquePointer?, cbnamemax: Short, pcbname: COpaquePointer?, pftype: COpaquePointer?, pfsubtype: COpaquePointer?, plength: COpaquePointer?, pprecision: COpaquePointer?, pscale: COpaquePointer?, pnullable: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLGetDescRecA((hdesc?.value ?: 0L), irecord, (szname?.value ?: 0L), cbnamemax, (pcbname?.value ?: 0L), (pftype?.value ?: 0L), (pfsubtype?.value ?: 0L), (plength?.value ?: 0L), (pprecision?.value ?: 0L), (pscale?.value ?: 0L), (pnullable?.value ?: 0L))

public actual fun sQLGetDescRecW(hdesc: COpaquePointer?, irecord: Short, szname: COpaquePointer?, cchnamemax: Short, pcchname: COpaquePointer?, pftype: COpaquePointer?, pfsubtype: COpaquePointer?, plength: COpaquePointer?, pprecision: COpaquePointer?, pscale: COpaquePointer?, pnullable: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLGetDescRecW((hdesc?.value ?: 0L), irecord, (szname?.value ?: 0L), cchnamemax, (pcchname?.value ?: 0L), (pftype?.value ?: 0L), (pfsubtype?.value ?: 0L), (plength?.value ?: 0L), (pprecision?.value ?: 0L), (pscale?.value ?: 0L), (pnullable?.value ?: 0L))

public actual fun sQLGetDiagField(handletype: Short, handle: COpaquePointer?, recnumber: Short, diagidentifier: Short, diaginfo: COpaquePointer?, bufferlength: Short, stringlength: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLGetDiagField(handletype, (handle?.value ?: 0L), recnumber, diagidentifier, (diaginfo?.value ?: 0L), bufferlength, (stringlength?.value ?: 0L))

public actual fun sQLGetDiagFieldA(fhandletype: Short, handle: COpaquePointer?, irecord: Short, fdiagfield: Short, rgbdiaginfo: COpaquePointer?, cbdiaginfomax: Short, pcbdiaginfo: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLGetDiagFieldA(fhandletype, (handle?.value ?: 0L), irecord, fdiagfield, (rgbdiaginfo?.value ?: 0L), cbdiaginfomax, (pcbdiaginfo?.value ?: 0L))

public actual fun sQLGetDiagFieldW(fhandletype: Short, handle: COpaquePointer?, irecord: Short, fdiagfield: Short, rgbdiaginfo: COpaquePointer?, cbbufferlength: Short, pcbstringlength: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLGetDiagFieldW(fhandletype, (handle?.value ?: 0L), irecord, fdiagfield, (rgbdiaginfo?.value ?: 0L), cbbufferlength, (pcbstringlength?.value ?: 0L))

public actual fun sQLGetDiagRec(handletype: Short, handle: COpaquePointer?, recnumber: Short, sqlstate: COpaquePointer?, nativeerror: COpaquePointer?, messagetext: COpaquePointer?, bufferlength: Short, textlength: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLGetDiagRec(handletype, (handle?.value ?: 0L), recnumber, (sqlstate?.value ?: 0L), (nativeerror?.value ?: 0L), (messagetext?.value ?: 0L), bufferlength, (textlength?.value ?: 0L))

public actual fun sQLGetDiagRecA(fhandletype: Short, handle: COpaquePointer?, irecord: Short, szsqlstate: COpaquePointer?, pfnativeerror: COpaquePointer?, szerrormsg: COpaquePointer?, cberrormsgmax: Short, pcberrormsg: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLGetDiagRecA(fhandletype, (handle?.value ?: 0L), irecord, (szsqlstate?.value ?: 0L), (pfnativeerror?.value ?: 0L), (szerrormsg?.value ?: 0L), cberrormsgmax, (pcberrormsg?.value ?: 0L))

public actual fun sQLGetDiagRecW(fhandletype: Short, handle: COpaquePointer?, irecord: Short, szsqlstate: COpaquePointer?, pfnativeerror: COpaquePointer?, szerrormsg: COpaquePointer?, ccherrormsgmax: Short, pccherrormsg: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLGetDiagRecW(fhandletype, (handle?.value ?: 0L), irecord, (szsqlstate?.value ?: 0L), (pfnativeerror?.value ?: 0L), (szerrormsg?.value ?: 0L), ccherrormsgmax, (pccherrormsg?.value ?: 0L))

public actual fun sQLGetEnvAttr(environmenthandle: COpaquePointer?, attribute: Int, value: COpaquePointer?, bufferlength: Int, stringlength: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLGetEnvAttr((environmenthandle?.value ?: 0L), attribute, (value?.value ?: 0L), bufferlength, (stringlength?.value ?: 0L))

public actual fun sQLGetFunctions(connectionhandle: COpaquePointer?, functionid: UShort, supported: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLGetFunctions((connectionhandle?.value ?: 0L), functionid.toShort(), (supported?.value ?: 0L))

public actual fun sQLGetInfo(connectionhandle: COpaquePointer?, infotype: UShort, infovalue: COpaquePointer?, bufferlength: Short, stringlengthptr: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLGetInfo((connectionhandle?.value ?: 0L), infotype.toShort(), (infovalue?.value ?: 0L), bufferlength, (stringlengthptr?.value ?: 0L))

public actual fun sQLGetInfoA(hdbc: COpaquePointer?, finfotype: UShort, rgbinfovalue: COpaquePointer?, cbinfovaluemax: Short, pcbinfovalue: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLGetInfoA((hdbc?.value ?: 0L), finfotype.toShort(), (rgbinfovalue?.value ?: 0L), cbinfovaluemax, (pcbinfovalue?.value ?: 0L))

public actual fun sQLGetInfoW(hdbc: COpaquePointer?, finfotype: UShort, rgbinfovalue: COpaquePointer?, cbinfovaluemax: Short, pcbinfovalue: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLGetInfoW((hdbc?.value ?: 0L), finfotype.toShort(), (rgbinfovalue?.value ?: 0L), cbinfovaluemax, (pcbinfovalue?.value ?: 0L))

public actual fun sQLGetNextEnumeration(henumhandle: Handle, prgenumdata: COpaquePointer?, pienumlength: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLGetNextEnumeration((henumhandle?.value ?: 0L), (prgenumdata?.value ?: 0L), (pienumlength?.value ?: 0L))

public actual fun sQLGetStmtAttr(statementhandle: COpaquePointer?, attribute: Int, value: COpaquePointer?, bufferlength: Int, stringlength: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLGetStmtAttr((statementhandle?.value ?: 0L), attribute, (value?.value ?: 0L), bufferlength, (stringlength?.value ?: 0L))

public actual fun sQLGetStmtAttrA(hstmt: COpaquePointer?, fattribute: Int, rgbvalue: COpaquePointer?, cbvaluemax: Int, pcbvalue: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLGetStmtAttrA((hstmt?.value ?: 0L), fattribute, (rgbvalue?.value ?: 0L), cbvaluemax, (pcbvalue?.value ?: 0L))

public actual fun sQLGetStmtAttrW(hstmt: COpaquePointer?, fattribute: Int, rgbvalue: COpaquePointer?, cbvaluemax: Int, pcbvalue: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLGetStmtAttrW((hstmt?.value ?: 0L), fattribute, (rgbvalue?.value ?: 0L), cbvaluemax, (pcbvalue?.value ?: 0L))

public actual fun sQLGetStmtOption(statementhandle: COpaquePointer?, option: UShort, value: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLGetStmtOption((statementhandle?.value ?: 0L), option.toShort(), (value?.value ?: 0L))

public actual fun sQLGetTypeInfo(statementhandle: COpaquePointer?, datatype: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLGetTypeInfo((statementhandle?.value ?: 0L), datatype)

public actual fun sQLGetTypeInfoA(statementhandle: COpaquePointer?, datatype: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLGetTypeInfoA((statementhandle?.value ?: 0L), datatype)

public actual fun sQLGetTypeInfoW(statementhandle: COpaquePointer?, datatype: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLGetTypeInfoW((statementhandle?.value ?: 0L), datatype)

public actual fun sQLInitEnumServers(pwchservername: Pcwstr, pwchinstancename: Pcwstr): Handle =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLInitEnumServers((pwchservername?.value ?: 0L), (pwchinstancename?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun sQLLinkedCatalogsA(param0: COpaquePointer?, param1: Pcstr, param2: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLLinkedCatalogsA((param0?.value ?: 0L), (param1?.value ?: 0L), param2)

public actual fun sQLLinkedCatalogsW(param0: COpaquePointer?, param1: Pcwstr, param2: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLLinkedCatalogsW((param0?.value ?: 0L), (param1?.value ?: 0L), param2)

public actual fun sQLLinkedServers(param0: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLLinkedServers((param0?.value ?: 0L))

public actual fun sQLMoreResults(hstmt: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLMoreResults((hstmt?.value ?: 0L))

public actual fun sQLNativeSql(hdbc: COpaquePointer?, szsqlstrin: COpaquePointer?, cchsqlstrin: Int, szsqlstr: COpaquePointer?, cchsqlstrmax: Int, pcbsqlstr: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLNativeSql((hdbc?.value ?: 0L), (szsqlstrin?.value ?: 0L), cchsqlstrin, (szsqlstr?.value ?: 0L), cchsqlstrmax, (pcbsqlstr?.value ?: 0L))

public actual fun sQLNativeSqlA(hdbc: COpaquePointer?, szsqlstrin: COpaquePointer?, cbsqlstrin: Int, szsqlstr: COpaquePointer?, cbsqlstrmax: Int, pcbsqlstr: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLNativeSqlA((hdbc?.value ?: 0L), (szsqlstrin?.value ?: 0L), cbsqlstrin, (szsqlstr?.value ?: 0L), cbsqlstrmax, (pcbsqlstr?.value ?: 0L))

public actual fun sQLNativeSqlW(hdbc: COpaquePointer?, szsqlstrin: COpaquePointer?, cchsqlstrin: Int, szsqlstr: COpaquePointer?, cchsqlstrmax: Int, pcchsqlstr: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLNativeSqlW((hdbc?.value ?: 0L), (szsqlstrin?.value ?: 0L), cchsqlstrin, (szsqlstr?.value ?: 0L), cchsqlstrmax, (pcchsqlstr?.value ?: 0L))

public actual fun sQLNumParams(hstmt: COpaquePointer?, pcpar: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLNumParams((hstmt?.value ?: 0L), (pcpar?.value ?: 0L))

public actual fun sQLNumResultCols(statementhandle: COpaquePointer?, columncount: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLNumResultCols((statementhandle?.value ?: 0L), (columncount?.value ?: 0L))

public actual fun sQLParamData(statementhandle: COpaquePointer?, value: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLParamData((statementhandle?.value ?: 0L), (value?.value ?: 0L))

public actual fun sQLParamOptions(hstmt: COpaquePointer?, crow: ULong, pirow: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLParamOptions((hstmt?.value ?: 0L), crow.toLong(), (pirow?.value ?: 0L))

public actual fun sQLPrepare(statementhandle: COpaquePointer?, statementtext: COpaquePointer?, textlength: Int): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLPrepare((statementhandle?.value ?: 0L), (statementtext?.value ?: 0L), textlength)

public actual fun sQLPrepareA(hstmt: COpaquePointer?, szsqlstr: COpaquePointer?, cbsqlstr: Int): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLPrepareA((hstmt?.value ?: 0L), (szsqlstr?.value ?: 0L), cbsqlstr)

public actual fun sQLPrepareW(hstmt: COpaquePointer?, szsqlstr: COpaquePointer?, cchsqlstr: Int): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLPrepareW((hstmt?.value ?: 0L), (szsqlstr?.value ?: 0L), cchsqlstr)

public actual fun sQLPrimaryKeys(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cchcatalogname: Short, szschemaname: COpaquePointer?, cchschemaname: Short, sztablename: COpaquePointer?, cchtablename: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLPrimaryKeys((hstmt?.value ?: 0L), (szcatalogname?.value ?: 0L), cchcatalogname, (szschemaname?.value ?: 0L), cchschemaname, (sztablename?.value ?: 0L), cchtablename)

public actual fun sQLPrimaryKeysA(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cbcatalogname: Short, szschemaname: COpaquePointer?, cbschemaname: Short, sztablename: COpaquePointer?, cbtablename: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLPrimaryKeysA((hstmt?.value ?: 0L), (szcatalogname?.value ?: 0L), cbcatalogname, (szschemaname?.value ?: 0L), cbschemaname, (sztablename?.value ?: 0L), cbtablename)

public actual fun sQLPrimaryKeysW(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cchcatalogname: Short, szschemaname: COpaquePointer?, cchschemaname: Short, sztablename: COpaquePointer?, cchtablename: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLPrimaryKeysW((hstmt?.value ?: 0L), (szcatalogname?.value ?: 0L), cchcatalogname, (szschemaname?.value ?: 0L), cchschemaname, (sztablename?.value ?: 0L), cchtablename)

public actual fun sQLProcedureColumns(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cchcatalogname: Short, szschemaname: COpaquePointer?, cchschemaname: Short, szprocname: COpaquePointer?, cchprocname: Short, szcolumnname: COpaquePointer?, cchcolumnname: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLProcedureColumns((hstmt?.value ?: 0L), (szcatalogname?.value ?: 0L), cchcatalogname, (szschemaname?.value ?: 0L), cchschemaname, (szprocname?.value ?: 0L), cchprocname, (szcolumnname?.value ?: 0L), cchcolumnname)

public actual fun sQLProcedureColumnsA(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cbcatalogname: Short, szschemaname: COpaquePointer?, cbschemaname: Short, szprocname: COpaquePointer?, cbprocname: Short, szcolumnname: COpaquePointer?, cbcolumnname: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLProcedureColumnsA((hstmt?.value ?: 0L), (szcatalogname?.value ?: 0L), cbcatalogname, (szschemaname?.value ?: 0L), cbschemaname, (szprocname?.value ?: 0L), cbprocname, (szcolumnname?.value ?: 0L), cbcolumnname)

public actual fun sQLProcedureColumnsW(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cchcatalogname: Short, szschemaname: COpaquePointer?, cchschemaname: Short, szprocname: COpaquePointer?, cchprocname: Short, szcolumnname: COpaquePointer?, cchcolumnname: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLProcedureColumnsW((hstmt?.value ?: 0L), (szcatalogname?.value ?: 0L), cchcatalogname, (szschemaname?.value ?: 0L), cchschemaname, (szprocname?.value ?: 0L), cchprocname, (szcolumnname?.value ?: 0L), cchcolumnname)

public actual fun sQLProcedures(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cchcatalogname: Short, szschemaname: COpaquePointer?, cchschemaname: Short, szprocname: COpaquePointer?, cchprocname: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLProcedures((hstmt?.value ?: 0L), (szcatalogname?.value ?: 0L), cchcatalogname, (szschemaname?.value ?: 0L), cchschemaname, (szprocname?.value ?: 0L), cchprocname)

public actual fun sQLProceduresA(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cbcatalogname: Short, szschemaname: COpaquePointer?, cbschemaname: Short, szprocname: COpaquePointer?, cbprocname: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLProceduresA((hstmt?.value ?: 0L), (szcatalogname?.value ?: 0L), cbcatalogname, (szschemaname?.value ?: 0L), cbschemaname, (szprocname?.value ?: 0L), cbprocname)

public actual fun sQLProceduresW(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cchcatalogname: Short, szschemaname: COpaquePointer?, cchschemaname: Short, szprocname: COpaquePointer?, cchprocname: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLProceduresW((hstmt?.value ?: 0L), (szcatalogname?.value ?: 0L), cchcatalogname, (szschemaname?.value ?: 0L), cchschemaname, (szprocname?.value ?: 0L), cchprocname)

public actual fun sQLPutData(statementhandle: COpaquePointer?, data: COpaquePointer?, strlenOrInd: Long): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLPutData((statementhandle?.value ?: 0L), (data?.value ?: 0L), strlenOrInd)

public actual fun sQLRowCount(statementhandle: COpaquePointer?, rowcount: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLRowCount((statementhandle?.value ?: 0L), (rowcount?.value ?: 0L))

public actual fun sQLSetConnectAttr(connectionhandle: COpaquePointer?, attribute: Int, value: COpaquePointer?, stringlength: Int): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLSetConnectAttr((connectionhandle?.value ?: 0L), attribute, (value?.value ?: 0L), stringlength)

public actual fun sQLSetConnectAttrA(hdbc: COpaquePointer?, fattribute: Int, rgbvalue: COpaquePointer?, cbvalue: Int): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLSetConnectAttrA((hdbc?.value ?: 0L), fattribute, (rgbvalue?.value ?: 0L), cbvalue)

public actual fun sQLSetConnectAttrW(hdbc: COpaquePointer?, fattribute: Int, rgbvalue: COpaquePointer?, cbvalue: Int): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLSetConnectAttrW((hdbc?.value ?: 0L), fattribute, (rgbvalue?.value ?: 0L), cbvalue)

public actual fun sQLSetConnectOption(connectionhandle: COpaquePointer?, option: UShort, value: ULong): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLSetConnectOption((connectionhandle?.value ?: 0L), option.toShort(), value.toLong())

public actual fun sQLSetConnectOptionA(hdbc: COpaquePointer?, foption: UShort, vparam: ULong): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLSetConnectOptionA((hdbc?.value ?: 0L), foption.toShort(), vparam.toLong())

public actual fun sQLSetConnectOptionW(hdbc: COpaquePointer?, foption: UShort, vparam: ULong): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLSetConnectOptionW((hdbc?.value ?: 0L), foption.toShort(), vparam.toLong())

public actual fun sQLSetCursorName(statementhandle: COpaquePointer?, cursorname: COpaquePointer?, namelength: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLSetCursorName((statementhandle?.value ?: 0L), (cursorname?.value ?: 0L), namelength)

public actual fun sQLSetCursorNameA(hstmt: COpaquePointer?, szcursor: COpaquePointer?, cbcursor: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLSetCursorNameA((hstmt?.value ?: 0L), (szcursor?.value ?: 0L), cbcursor)

public actual fun sQLSetCursorNameW(hstmt: COpaquePointer?, szcursor: COpaquePointer?, cchcursor: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLSetCursorNameW((hstmt?.value ?: 0L), (szcursor?.value ?: 0L), cchcursor)

public actual fun sQLSetDescField(descriptorhandle: COpaquePointer?, recnumber: Short, fieldidentifier: Short, value: COpaquePointer?, bufferlength: Int): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLSetDescField((descriptorhandle?.value ?: 0L), recnumber, fieldidentifier, (value?.value ?: 0L), bufferlength)

public actual fun sQLSetDescFieldW(descriptorhandle: COpaquePointer?, recnumber: Short, fieldidentifier: Short, value: COpaquePointer?, bufferlength: Int): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLSetDescFieldW((descriptorhandle?.value ?: 0L), recnumber, fieldidentifier, (value?.value ?: 0L), bufferlength)

public actual fun sQLSetDescRec(descriptorhandle: COpaquePointer?, recnumber: Short, type: Short, subtype: Short, length: Long, precision: Short, scale: Short, data: COpaquePointer?, stringlength: COpaquePointer?, indicator: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLSetDescRec((descriptorhandle?.value ?: 0L), recnumber, type, subtype, length, precision, scale, (data?.value ?: 0L), (stringlength?.value ?: 0L), (indicator?.value ?: 0L))

public actual fun sQLSetEnvAttr(environmenthandle: COpaquePointer?, attribute: Int, value: COpaquePointer?, stringlength: Int): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLSetEnvAttr((environmenthandle?.value ?: 0L), attribute, (value?.value ?: 0L), stringlength)

public actual fun sQLSetParam(statementhandle: COpaquePointer?, parameternumber: UShort, valuetype: Short, parametertype: Short, lengthprecision: ULong, parameterscale: Short, parametervalue: COpaquePointer?, strlenOrInd: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLSetParam((statementhandle?.value ?: 0L), parameternumber.toShort(), valuetype, parametertype, lengthprecision.toLong(), parameterscale, (parametervalue?.value ?: 0L), (strlenOrInd?.value ?: 0L))

public actual fun sQLSetPos(hstmt: COpaquePointer?, irow: ULong, foption: UShort, flock: UShort): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLSetPos((hstmt?.value ?: 0L), irow.toLong(), foption.toShort(), flock.toShort())

public actual fun sQLSetScrollOptions(hstmt: COpaquePointer?, fconcurrency: UShort, crowkeyset: Long, crowrowset: UShort): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLSetScrollOptions((hstmt?.value ?: 0L), fconcurrency.toShort(), crowkeyset, crowrowset.toShort())

public actual fun sQLSetStmtAttr(statementhandle: COpaquePointer?, attribute: Int, value: COpaquePointer?, stringlength: Int): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLSetStmtAttr((statementhandle?.value ?: 0L), attribute, (value?.value ?: 0L), stringlength)

public actual fun sQLSetStmtAttrW(hstmt: COpaquePointer?, fattribute: Int, rgbvalue: COpaquePointer?, cbvaluemax: Int): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLSetStmtAttrW((hstmt?.value ?: 0L), fattribute, (rgbvalue?.value ?: 0L), cbvaluemax)

public actual fun sQLSetStmtOption(statementhandle: COpaquePointer?, option: UShort, value: ULong): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLSetStmtOption((statementhandle?.value ?: 0L), option.toShort(), value.toLong())

public actual fun sQLSpecialColumns(statementhandle: COpaquePointer?, identifiertype: UShort, catalogname: COpaquePointer?, namelength1: Short, schemaname: COpaquePointer?, namelength2: Short, tablename: COpaquePointer?, namelength3: Short, scope: UShort, nullable: UShort): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLSpecialColumns((statementhandle?.value ?: 0L), identifiertype.toShort(), (catalogname?.value ?: 0L), namelength1, (schemaname?.value ?: 0L), namelength2, (tablename?.value ?: 0L), namelength3, scope.toShort(), nullable.toShort())

public actual fun sQLSpecialColumnsA(hstmt: COpaquePointer?, fcoltype: UShort, szcatalogname: COpaquePointer?, cbcatalogname: Short, szschemaname: COpaquePointer?, cbschemaname: Short, sztablename: COpaquePointer?, cbtablename: Short, fscope: UShort, fnullable: UShort): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLSpecialColumnsA((hstmt?.value ?: 0L), fcoltype.toShort(), (szcatalogname?.value ?: 0L), cbcatalogname, (szschemaname?.value ?: 0L), cbschemaname, (sztablename?.value ?: 0L), cbtablename, fscope.toShort(), fnullable.toShort())

public actual fun sQLSpecialColumnsW(hstmt: COpaquePointer?, fcoltype: UShort, szcatalogname: COpaquePointer?, cchcatalogname: Short, szschemaname: COpaquePointer?, cchschemaname: Short, sztablename: COpaquePointer?, cchtablename: Short, fscope: UShort, fnullable: UShort): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLSpecialColumnsW((hstmt?.value ?: 0L), fcoltype.toShort(), (szcatalogname?.value ?: 0L), cchcatalogname, (szschemaname?.value ?: 0L), cchschemaname, (sztablename?.value ?: 0L), cchtablename, fscope.toShort(), fnullable.toShort())

public actual fun sQLStatistics(statementhandle: COpaquePointer?, catalogname: COpaquePointer?, namelength1: Short, schemaname: COpaquePointer?, namelength2: Short, tablename: COpaquePointer?, namelength3: Short, unique: UShort, reserved: UShort): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLStatistics((statementhandle?.value ?: 0L), (catalogname?.value ?: 0L), namelength1, (schemaname?.value ?: 0L), namelength2, (tablename?.value ?: 0L), namelength3, unique.toShort(), reserved.toShort())

public actual fun sQLStatisticsA(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cbcatalogname: Short, szschemaname: COpaquePointer?, cbschemaname: Short, sztablename: COpaquePointer?, cbtablename: Short, funique: UShort, faccuracy: UShort): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLStatisticsA((hstmt?.value ?: 0L), (szcatalogname?.value ?: 0L), cbcatalogname, (szschemaname?.value ?: 0L), cbschemaname, (sztablename?.value ?: 0L), cbtablename, funique.toShort(), faccuracy.toShort())

public actual fun sQLStatisticsW(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cchcatalogname: Short, szschemaname: COpaquePointer?, cchschemaname: Short, sztablename: COpaquePointer?, cchtablename: Short, funique: UShort, faccuracy: UShort): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLStatisticsW((hstmt?.value ?: 0L), (szcatalogname?.value ?: 0L), cchcatalogname, (szschemaname?.value ?: 0L), cchschemaname, (sztablename?.value ?: 0L), cchtablename, funique.toShort(), faccuracy.toShort())

public actual fun sQLTablePrivileges(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cchcatalogname: Short, szschemaname: COpaquePointer?, cchschemaname: Short, sztablename: COpaquePointer?, cchtablename: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLTablePrivileges((hstmt?.value ?: 0L), (szcatalogname?.value ?: 0L), cchcatalogname, (szschemaname?.value ?: 0L), cchschemaname, (sztablename?.value ?: 0L), cchtablename)

public actual fun sQLTablePrivilegesA(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cbcatalogname: Short, szschemaname: COpaquePointer?, cbschemaname: Short, sztablename: COpaquePointer?, cbtablename: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLTablePrivilegesA((hstmt?.value ?: 0L), (szcatalogname?.value ?: 0L), cbcatalogname, (szschemaname?.value ?: 0L), cbschemaname, (sztablename?.value ?: 0L), cbtablename)

public actual fun sQLTablePrivilegesW(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cchcatalogname: Short, szschemaname: COpaquePointer?, cchschemaname: Short, sztablename: COpaquePointer?, cchtablename: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLTablePrivilegesW((hstmt?.value ?: 0L), (szcatalogname?.value ?: 0L), cchcatalogname, (szschemaname?.value ?: 0L), cchschemaname, (sztablename?.value ?: 0L), cchtablename)

public actual fun sQLTables(statementhandle: COpaquePointer?, catalogname: COpaquePointer?, namelength1: Short, schemaname: COpaquePointer?, namelength2: Short, tablename: COpaquePointer?, namelength3: Short, tabletype: COpaquePointer?, namelength4: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLTables((statementhandle?.value ?: 0L), (catalogname?.value ?: 0L), namelength1, (schemaname?.value ?: 0L), namelength2, (tablename?.value ?: 0L), namelength3, (tabletype?.value ?: 0L), namelength4)

public actual fun sQLTablesA(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cbcatalogname: Short, szschemaname: COpaquePointer?, cbschemaname: Short, sztablename: COpaquePointer?, cbtablename: Short, sztabletype: COpaquePointer?, cbtabletype: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLTablesA((hstmt?.value ?: 0L), (szcatalogname?.value ?: 0L), cbcatalogname, (szschemaname?.value ?: 0L), cbschemaname, (sztablename?.value ?: 0L), cbtablename, (sztabletype?.value ?: 0L), cbtabletype)

public actual fun sQLTablesW(hstmt: COpaquePointer?, szcatalogname: COpaquePointer?, cchcatalogname: Short, szschemaname: COpaquePointer?, cchschemaname: Short, sztablename: COpaquePointer?, cchtablename: Short, sztabletype: COpaquePointer?, cchtabletype: Short): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLTablesW((hstmt?.value ?: 0L), (szcatalogname?.value ?: 0L), cchcatalogname, (szschemaname?.value ?: 0L), cchschemaname, (sztablename?.value ?: 0L), cchtablename, (sztabletype?.value ?: 0L), cchtabletype)

public actual fun sQLTransact(environmenthandle: COpaquePointer?, connectionhandle: COpaquePointer?, completiontype: UShort): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_sQLTransact((environmenthandle?.value ?: 0L), (connectionhandle?.value ?: 0L), completiontype.toShort())

public actual fun bcpBatch(param0: COpaquePointer?): Int =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_bcpBatch((param0?.value ?: 0L))

public actual fun bcpBind(param0: COpaquePointer?, param1: COpaquePointer?, param2: Int, param3: Int, param4: COpaquePointer?, param5: Int, param6: Int, param7: Int): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_bcpBind((param0?.value ?: 0L), (param1?.value ?: 0L), param2, param3, (param4?.value ?: 0L), param5, param6, param7)

public actual fun bcpColfmt(param0: COpaquePointer?, param1: Int, param2: UByte, param3: Int, param4: Int, param5: COpaquePointer?, param6: Int, param7: Int): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_bcpColfmt((param0?.value ?: 0L), param1, param2.toByte(), param3, param4, (param5?.value ?: 0L), param6, param7)

public actual fun bcpCollen(param0: COpaquePointer?, param1: Int, param2: Int): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_bcpCollen((param0?.value ?: 0L), param1, param2)

public actual fun bcpColptr(param0: COpaquePointer?, param1: COpaquePointer?, param2: Int): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_bcpColptr((param0?.value ?: 0L), (param1?.value ?: 0L), param2)

public actual fun bcpColumns(param0: COpaquePointer?, param1: Int): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_bcpColumns((param0?.value ?: 0L), param1)

public actual fun bcpControl(param0: COpaquePointer?, param1: Int, param2: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_bcpControl((param0?.value ?: 0L), param1, (param2?.value ?: 0L))

public actual fun bcpDone(param0: COpaquePointer?): Int =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_bcpDone((param0?.value ?: 0L))

public actual fun bcpExec(param0: COpaquePointer?, param1: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_bcpExec((param0?.value ?: 0L), (param1?.value ?: 0L))

public actual fun bcpGetcolfmt(param0: COpaquePointer?, param1: Int, param2: Int, param3: COpaquePointer?, param4: Int, param5: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_bcpGetcolfmt((param0?.value ?: 0L), param1, param2, (param3?.value ?: 0L), param4, (param5?.value ?: 0L))

public actual fun bcpInitA(param0: COpaquePointer?, param1: Pcstr, param2: Pcstr, param3: Pcstr, param4: Int): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_bcpInitA((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L), (param3?.value ?: 0L), param4)

public actual fun bcpInitW(param0: COpaquePointer?, param1: Pcwstr, param2: Pcwstr, param3: Pcwstr, param4: Int): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_bcpInitW((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L), (param3?.value ?: 0L), param4)

public actual fun bcpMoretext(param0: COpaquePointer?, param1: Int, param2: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_bcpMoretext((param0?.value ?: 0L), param1, (param2?.value ?: 0L))

public actual fun bcpReadfmtA(param0: COpaquePointer?, param1: Pcstr): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_bcpReadfmtA((param0?.value ?: 0L), (param1?.value ?: 0L))

public actual fun bcpReadfmtW(param0: COpaquePointer?, param1: Pcwstr): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_bcpReadfmtW((param0?.value ?: 0L), (param1?.value ?: 0L))

public actual fun bcpSendrow(param0: COpaquePointer?): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_bcpSendrow((param0?.value ?: 0L))

public actual fun bcpSetcolfmt(param0: COpaquePointer?, param1: Int, param2: Int, param3: COpaquePointer?, param4: Int): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_bcpSetcolfmt((param0?.value ?: 0L), param1, param2, (param3?.value ?: 0L), param4)

public actual fun bcpWritefmtA(param0: COpaquePointer?, param1: Pcstr): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_bcpWritefmtA((param0?.value ?: 0L), (param1?.value ?: 0L))

public actual fun bcpWritefmtW(param0: COpaquePointer?, param1: Pcwstr): Short =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_bcpWritefmtW((param0?.value ?: 0L), (param1?.value ?: 0L))

public actual fun dbprtypeA(param0: Int): Pstr =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_dbprtypeA(param0).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dbprtypeW(param0: Int): Pwstr =
    WindowsWin32SystemSearchJniBridge.windowssys_windows_win32_system_search_dbprtypeW(param0).let { if (it == 0L) null else COpaquePointer(it) }
