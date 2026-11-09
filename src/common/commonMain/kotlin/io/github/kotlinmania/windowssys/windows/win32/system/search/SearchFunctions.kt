package io.github.kotlinmania.windowssys.windows.win32.system.search

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public expect fun ODBCGetTryWaitValue(): UInt

public expect fun ODBCSetTryWaitValue(dwvalue: UInt): BOOL

public expect fun SQLAllocConnect(environmenthandle: Long, connectionhandle: Long): Short

public expect fun SQLAllocEnv(environmenthandle: Long): Short

public expect fun SQLAllocHandle(handletype: Short, inputhandle: Long, outputhandle: Long): Short

public expect fun SQLAllocHandleStd(fhandletype: Short, hinput: Long, phoutput: Long): Short

public expect fun SQLAllocStmt(connectionhandle: Long, statementhandle: Long): Short

public expect fun SQLBindCol(statementhandle: Long, columnnumber: UShort, targettype: Short, targetvalue: Long, bufferlength: Long, strlen_or_ind: Long): Short

public expect fun SQLBindParam(statementhandle: Long, parameternumber: UShort, valuetype: Short, parametertype: Short, lengthprecision: ULong, parameterscale: Short, parametervalue: Long, strlen_or_ind: Long): Short

public expect fun SQLBindParameter(hstmt: Long, ipar: UShort, fparamtype: Short, fctype: Short, fsqltype: Short, cbcoldef: ULong, ibscale: Short, rgbvalue: Long, cbvaluemax: Long, pcbvalue: Long): Short

public expect fun SQLBrowseConnect(hdbc: Long, szconnstrin: Long, cchconnstrin: Short, szconnstrout: Long, cchconnstroutmax: Short, pcchconnstrout: Long): Short

public expect fun SQLBrowseConnectA(hdbc: Long, szconnstrin: Long, cbconnstrin: Short, szconnstrout: Long, cbconnstroutmax: Short, pcbconnstrout: Long): Short

public expect fun SQLBrowseConnectW(hdbc: Long, szconnstrin: Long, cchconnstrin: Short, szconnstrout: Long, cchconnstroutmax: Short, pcchconnstrout: Long): Short

public expect fun SQLBulkOperations(statementhandle: Long, operation: Short): Short

public expect fun SQLCancel(statementhandle: Long): Short

public expect fun SQLCancelHandle(handletype: Short, inputhandle: Long): Short

public expect fun SQLCloseCursor(statementhandle: Long): Short

public expect fun SQLCloseEnumServers(henumhandle: HANDLE): Short

public expect fun SQLColAttribute(statementhandle: Long, columnnumber: UShort, fieldidentifier: UShort, characterattribute: Long, bufferlength: Short, stringlength: Long, numericattribute: Long): Short

public expect fun SQLColAttributeA(hstmt: Long, icol: Short, ifield: Short, pcharattr: Long, cbcharattrmax: Short, pcbcharattr: Long, pnumattr: Long): Short

public expect fun SQLColAttributeW(hstmt: Long, icol: UShort, ifield: UShort, pcharattr: Long, cbdescmax: Short, pcbcharattr: Long, pnumattr: Long): Short

public expect fun SQLColAttributes(hstmt: Long, icol: UShort, fdesctype: UShort, rgbdesc: Long, cbdescmax: Short, pcbdesc: Long, pfdesc: Long): Short

public expect fun SQLColAttributesA(hstmt: Long, icol: UShort, fdesctype: UShort, rgbdesc: Long, cbdescmax: Short, pcbdesc: Long, pfdesc: Long): Short

public expect fun SQLColAttributesW(hstmt: Long, icol: UShort, fdesctype: UShort, rgbdesc: Long, cbdescmax: Short, pcbdesc: Long, pfdesc: Long): Short

public expect fun SQLColumnPrivileges(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short, szcolumnname: Long, cchcolumnname: Short): Short

public expect fun SQLColumnPrivilegesA(hstmt: Long, szcatalogname: Long, cbcatalogname: Short, szschemaname: Long, cbschemaname: Short, sztablename: Long, cbtablename: Short, szcolumnname: Long, cbcolumnname: Short): Short

public expect fun SQLColumnPrivilegesW(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short, szcolumnname: Long, cchcolumnname: Short): Short

public expect fun SQLColumns(statementhandle: Long, catalogname: Long, namelength1: Short, schemaname: Long, namelength2: Short, tablename: Long, namelength3: Short, columnname: Long, namelength4: Short): Short

public expect fun SQLColumnsA(hstmt: Long, szcatalogname: Long, cbcatalogname: Short, szschemaname: Long, cbschemaname: Short, sztablename: Long, cbtablename: Short, szcolumnname: Long, cbcolumnname: Short): Short

public expect fun SQLColumnsW(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short, szcolumnname: Long, cchcolumnname: Short): Short

public expect fun SQLCompleteAsync(handletype: Short, handle: Long, asyncretcodeptr: Long): Short

public expect fun SQLConnect(connectionhandle: Long, servername: Long, namelength1: Short, username: Long, namelength2: Short, authentication: Long, namelength3: Short): Short

public expect fun SQLConnectA(hdbc: Long, szdsn: Long, cbdsn: Short, szuid: Long, cbuid: Short, szauthstr: Long, cbauthstr: Short): Short

public expect fun SQLConnectW(hdbc: Long, szdsn: Long, cchdsn: Short, szuid: Long, cchuid: Short, szauthstr: Long, cchauthstr: Short): Short

public expect fun SQLCopyDesc(sourcedeschandle: Long, targetdeschandle: Long): Short

public expect fun SQLDataSources(environmenthandle: Long, direction: UShort, servername: Long, bufferlength1: Short, namelength1ptr: Long, description: Long, bufferlength2: Short, namelength2ptr: Long): Short

public expect fun SQLDataSourcesA(henv: Long, fdirection: UShort, szdsn: Long, cbdsnmax: Short, pcbdsn: Long, szdescription: Long, cbdescriptionmax: Short, pcbdescription: Long): Short

public expect fun SQLDataSourcesW(henv: Long, fdirection: UShort, szdsn: Long, cchdsnmax: Short, pcchdsn: Long, wszdescription: Long, cchdescriptionmax: Short, pcchdescription: Long): Short

public expect fun SQLDescribeCol(statementhandle: Long, columnnumber: UShort, columnname: Long, bufferlength: Short, namelength: Long, datatype: Long, columnsize: Long, decimaldigits: Long, nullable: Long): Short

public expect fun SQLDescribeColA(hstmt: Long, icol: UShort, szcolname: Long, cbcolnamemax: Short, pcbcolname: Long, pfsqltype: Long, pcbcoldef: Long, pibscale: Long, pfnullable: Long): Short

public expect fun SQLDescribeColW(hstmt: Long, icol: UShort, szcolname: Long, cchcolnamemax: Short, pcchcolname: Long, pfsqltype: Long, pcbcoldef: Long, pibscale: Long, pfnullable: Long): Short

public expect fun SQLDescribeParam(hstmt: Long, ipar: UShort, pfsqltype: Long, pcbparamdef: Long, pibscale: Long, pfnullable: Long): Short

public expect fun SQLDisconnect(connectionhandle: Long): Short

public expect fun SQLDriverConnect(hdbc: Long, hwnd: Long, szconnstrin: Long, cchconnstrin: Short, szconnstrout: Long, cchconnstroutmax: Short, pcchconnstrout: Long, fdrivercompletion: UShort): Short

public expect fun SQLDriverConnectA(hdbc: Long, hwnd: Long, szconnstrin: Long, cbconnstrin: Short, szconnstrout: Long, cbconnstroutmax: Short, pcbconnstrout: Long, fdrivercompletion: UShort): Short

public expect fun SQLDriverConnectW(hdbc: Long, hwnd: Long, szconnstrin: Long, cchconnstrin: Short, szconnstrout: Long, cchconnstroutmax: Short, pcchconnstrout: Long, fdrivercompletion: UShort): Short

public expect fun SQLDrivers(henv: Long, fdirection: UShort, szdriverdesc: Long, cchdriverdescmax: Short, pcchdriverdesc: Long, szdriverattributes: Long, cchdrvrattrmax: Short, pcchdrvrattr: Long): Short

public expect fun SQLDriversA(henv: Long, fdirection: UShort, szdriverdesc: Long, cbdriverdescmax: Short, pcbdriverdesc: Long, szdriverattributes: Long, cbdrvrattrmax: Short, pcbdrvrattr: Long): Short

public expect fun SQLDriversW(henv: Long, fdirection: UShort, szdriverdesc: Long, cchdriverdescmax: Short, pcchdriverdesc: Long, szdriverattributes: Long, cchdrvrattrmax: Short, pcchdrvrattr: Long): Short

public expect fun SQLEndTran(handletype: Short, handle: Long, completiontype: Short): Short

public expect fun SQLError(environmenthandle: Long, connectionhandle: Long, statementhandle: Long, sqlstate: Long, nativeerror: Long, messagetext: Long, bufferlength: Short, textlength: Long): Short

public expect fun SQLErrorA(henv: Long, hdbc: Long, hstmt: Long, szsqlstate: Long, pfnativeerror: Long, szerrormsg: Long, cberrormsgmax: Short, pcberrormsg: Long): Short

public expect fun SQLErrorW(henv: Long, hdbc: Long, hstmt: Long, wszsqlstate: Long, pfnativeerror: Long, wszerrormsg: Long, ccherrormsgmax: Short, pccherrormsg: Long): Short

public expect fun SQLExecDirect(statementhandle: Long, statementtext: Long, textlength: Int): Short

public expect fun SQLExecDirectA(hstmt: Long, szsqlstr: Long, cbsqlstr: Int): Short

public expect fun SQLExecDirectW(hstmt: Long, szsqlstr: Long, textlength: Int): Short

public expect fun SQLExecute(statementhandle: Long): Short

public expect fun SQLExtendedFetch(hstmt: Long, ffetchtype: UShort, irow: Long, pcrow: Long, rgfrowstatus: Long): Short

public expect fun SQLFetch(statementhandle: Long): Short

public expect fun SQLFetchScroll(statementhandle: Long, fetchorientation: Short, fetchoffset: Long): Short

public expect fun SQLForeignKeys(hstmt: Long, szpkcatalogname: Long, cchpkcatalogname: Short, szpkschemaname: Long, cchpkschemaname: Short, szpktablename: Long, cchpktablename: Short, szfkcatalogname: Long, cchfkcatalogname: Short, szfkschemaname: Long, cchfkschemaname: Short, szfktablename: Long, cchfktablename: Short): Short

public expect fun SQLForeignKeysA(hstmt: Long, szpkcatalogname: Long, cbpkcatalogname: Short, szpkschemaname: Long, cbpkschemaname: Short, szpktablename: Long, cbpktablename: Short, szfkcatalogname: Long, cbfkcatalogname: Short, szfkschemaname: Long, cbfkschemaname: Short, szfktablename: Long, cbfktablename: Short): Short

public expect fun SQLForeignKeysW(hstmt: Long, szpkcatalogname: Long, cchpkcatalogname: Short, szpkschemaname: Long, cchpkschemaname: Short, szpktablename: Long, cchpktablename: Short, szfkcatalogname: Long, cchfkcatalogname: Short, szfkschemaname: Long, cchfkschemaname: Short, szfktablename: Long, cchfktablename: Short): Short

public expect fun SQLFreeConnect(connectionhandle: Long): Short

public expect fun SQLFreeEnv(environmenthandle: Long): Short

public expect fun SQLFreeHandle(handletype: Short, handle: Long): Short

public expect fun SQLFreeStmt(statementhandle: Long, option: UShort): Short

public expect fun SQLGetConnectAttr(connectionhandle: Long, attribute: Int, value: Long, bufferlength: Int, stringlengthptr: Long): Short

public expect fun SQLGetConnectAttrA(hdbc: Long, fattribute: Int, rgbvalue: Long, cbvaluemax: Int, pcbvalue: Long): Short

public expect fun SQLGetConnectAttrW(hdbc: Long, fattribute: Int, rgbvalue: Long, cbvaluemax: Int, pcbvalue: Long): Short

public expect fun SQLGetConnectOption(connectionhandle: Long, option: UShort, value: Long): Short

public expect fun SQLGetConnectOptionA(hdbc: Long, foption: UShort, pvparam: Long): Short

public expect fun SQLGetConnectOptionW(hdbc: Long, foption: UShort, pvparam: Long): Short

public expect fun SQLGetCursorName(statementhandle: Long, cursorname: Long, bufferlength: Short, namelengthptr: Long): Short

public expect fun SQLGetCursorNameA(hstmt: Long, szcursor: Long, cbcursormax: Short, pcbcursor: Long): Short

public expect fun SQLGetCursorNameW(hstmt: Long, szcursor: Long, cchcursormax: Short, pcchcursor: Long): Short

public expect fun SQLGetData(statementhandle: Long, columnnumber: UShort, targettype: Short, targetvalue: Long, bufferlength: Long, strlen_or_indptr: Long): Short

public expect fun SQLGetDescField(descriptorhandle: Long, recnumber: Short, fieldidentifier: Short, value: Long, bufferlength: Int, stringlength: Long): Short

public expect fun SQLGetDescFieldA(hdesc: Long, irecord: Short, ifield: Short, rgbvalue: Long, cbbufferlength: Int, stringlength: Long): Short

public expect fun SQLGetDescFieldW(hdesc: Long, irecord: Short, ifield: Short, rgbvalue: Long, cbbufferlength: Int, stringlength: Long): Short

public expect fun SQLGetDescRec(descriptorhandle: Long, recnumber: Short, name: Long, bufferlength: Short, stringlengthptr: Long, typeptr: Long, subtypeptr: Long, lengthptr: Long, precisionptr: Long, scaleptr: Long, nullableptr: Long): Short

public expect fun SQLGetDescRecA(hdesc: Long, irecord: Short, szname: Long, cbnamemax: Short, pcbname: Long, pftype: Long, pfsubtype: Long, plength: Long, pprecision: Long, pscale: Long, pnullable: Long): Short

public expect fun SQLGetDescRecW(hdesc: Long, irecord: Short, szname: Long, cchnamemax: Short, pcchname: Long, pftype: Long, pfsubtype: Long, plength: Long, pprecision: Long, pscale: Long, pnullable: Long): Short

public expect fun SQLGetDiagField(handletype: Short, handle: Long, recnumber: Short, diagidentifier: Short, diaginfo: Long, bufferlength: Short, stringlength: Long): Short

public expect fun SQLGetDiagFieldA(fhandletype: Short, handle: Long, irecord: Short, fdiagfield: Short, rgbdiaginfo: Long, cbdiaginfomax: Short, pcbdiaginfo: Long): Short

public expect fun SQLGetDiagFieldW(fhandletype: Short, handle: Long, irecord: Short, fdiagfield: Short, rgbdiaginfo: Long, cbbufferlength: Short, pcbstringlength: Long): Short

public expect fun SQLGetDiagRec(handletype: Short, handle: Long, recnumber: Short, sqlstate: Long, nativeerror: Long, messagetext: Long, bufferlength: Short, textlength: Long): Short

public expect fun SQLGetDiagRecA(fhandletype: Short, handle: Long, irecord: Short, szsqlstate: Long, pfnativeerror: Long, szerrormsg: Long, cberrormsgmax: Short, pcberrormsg: Long): Short

public expect fun SQLGetDiagRecW(fhandletype: Short, handle: Long, irecord: Short, szsqlstate: Long, pfnativeerror: Long, szerrormsg: Long, ccherrormsgmax: Short, pccherrormsg: Long): Short

public expect fun SQLGetEnvAttr(environmenthandle: Long, attribute: Int, value: Long, bufferlength: Int, stringlength: Long): Short

public expect fun SQLGetFunctions(connectionhandle: Long, functionid: UShort, supported: Long): Short

public expect fun SQLGetInfo(connectionhandle: Long, infotype: UShort, infovalue: Long, bufferlength: Short, stringlengthptr: Long): Short

public expect fun SQLGetInfoA(hdbc: Long, finfotype: UShort, rgbinfovalue: Long, cbinfovaluemax: Short, pcbinfovalue: Long): Short

public expect fun SQLGetInfoW(hdbc: Long, finfotype: UShort, rgbinfovalue: Long, cbinfovaluemax: Short, pcbinfovalue: Long): Short

public expect fun SQLGetNextEnumeration(henumhandle: HANDLE, prgenumdata: Long, pienumlength: Long): Short

public expect fun SQLGetStmtAttr(statementhandle: Long, attribute: Int, value: Long, bufferlength: Int, stringlength: Long): Short

public expect fun SQLGetStmtAttrA(hstmt: Long, fattribute: Int, rgbvalue: Long, cbvaluemax: Int, pcbvalue: Long): Short

public expect fun SQLGetStmtAttrW(hstmt: Long, fattribute: Int, rgbvalue: Long, cbvaluemax: Int, pcbvalue: Long): Short

public expect fun SQLGetStmtOption(statementhandle: Long, option: UShort, value: Long): Short

public expect fun SQLGetTypeInfo(statementhandle: Long, datatype: Short): Short

public expect fun SQLGetTypeInfoA(statementhandle: Long, datatype: Short): Short

public expect fun SQLGetTypeInfoW(statementhandle: Long, datatype: Short): Short

public expect fun SQLInitEnumServers(pwchservername: PCWSTR, pwchinstancename: PCWSTR): HANDLE

public expect fun SQLLinkedCatalogsA(param0: Long, param1: PCSTR, param2: Short): Short

public expect fun SQLLinkedCatalogsW(param0: Long, param1: PCWSTR, param2: Short): Short

public expect fun SQLLinkedServers(param0: Long): Short

public expect fun SQLMoreResults(hstmt: Long): Short

public expect fun SQLNativeSql(hdbc: Long, szsqlstrin: Long, cchsqlstrin: Int, szsqlstr: Long, cchsqlstrmax: Int, pcbsqlstr: Long): Short

public expect fun SQLNativeSqlA(hdbc: Long, szsqlstrin: Long, cbsqlstrin: Int, szsqlstr: Long, cbsqlstrmax: Int, pcbsqlstr: Long): Short

public expect fun SQLNativeSqlW(hdbc: Long, szsqlstrin: Long, cchsqlstrin: Int, szsqlstr: Long, cchsqlstrmax: Int, pcchsqlstr: Long): Short

public expect fun SQLNumParams(hstmt: Long, pcpar: Long): Short

public expect fun SQLNumResultCols(statementhandle: Long, columncount: Long): Short

public expect fun SQLParamData(statementhandle: Long, value: Long): Short

public expect fun SQLParamOptions(hstmt: Long, crow: ULong, pirow: Long): Short

public expect fun SQLPrepare(statementhandle: Long, statementtext: Long, textlength: Int): Short

public expect fun SQLPrepareA(hstmt: Long, szsqlstr: Long, cbsqlstr: Int): Short

public expect fun SQLPrepareW(hstmt: Long, szsqlstr: Long, cchsqlstr: Int): Short

public expect fun SQLPrimaryKeys(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short): Short

public expect fun SQLPrimaryKeysA(hstmt: Long, szcatalogname: Long, cbcatalogname: Short, szschemaname: Long, cbschemaname: Short, sztablename: Long, cbtablename: Short): Short

public expect fun SQLPrimaryKeysW(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short): Short

public expect fun SQLProcedureColumns(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, szprocname: Long, cchprocname: Short, szcolumnname: Long, cchcolumnname: Short): Short

public expect fun SQLProcedureColumnsA(hstmt: Long, szcatalogname: Long, cbcatalogname: Short, szschemaname: Long, cbschemaname: Short, szprocname: Long, cbprocname: Short, szcolumnname: Long, cbcolumnname: Short): Short

public expect fun SQLProcedureColumnsW(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, szprocname: Long, cchprocname: Short, szcolumnname: Long, cchcolumnname: Short): Short

public expect fun SQLProcedures(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, szprocname: Long, cchprocname: Short): Short

public expect fun SQLProceduresA(hstmt: Long, szcatalogname: Long, cbcatalogname: Short, szschemaname: Long, cbschemaname: Short, szprocname: Long, cbprocname: Short): Short

public expect fun SQLProceduresW(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, szprocname: Long, cchprocname: Short): Short

public expect fun SQLPutData(statementhandle: Long, data: Long, strlen_or_ind: Long): Short

public expect fun SQLRowCount(statementhandle: Long, rowcount: Long): Short

public expect fun SQLSetConnectAttr(connectionhandle: Long, attribute: Int, value: Long, stringlength: Int): Short

public expect fun SQLSetConnectAttrA(hdbc: Long, fattribute: Int, rgbvalue: Long, cbvalue: Int): Short

public expect fun SQLSetConnectAttrW(hdbc: Long, fattribute: Int, rgbvalue: Long, cbvalue: Int): Short

public expect fun SQLSetConnectOption(connectionhandle: Long, option: UShort, value: ULong): Short

public expect fun SQLSetConnectOptionA(hdbc: Long, foption: UShort, vparam: ULong): Short

public expect fun SQLSetConnectOptionW(hdbc: Long, foption: UShort, vparam: ULong): Short

public expect fun SQLSetCursorName(statementhandle: Long, cursorname: Long, namelength: Short): Short

public expect fun SQLSetCursorNameA(hstmt: Long, szcursor: Long, cbcursor: Short): Short

public expect fun SQLSetCursorNameW(hstmt: Long, szcursor: Long, cchcursor: Short): Short

public expect fun SQLSetDescField(descriptorhandle: Long, recnumber: Short, fieldidentifier: Short, value: Long, bufferlength: Int): Short

public expect fun SQLSetDescFieldW(descriptorhandle: Long, recnumber: Short, fieldidentifier: Short, value: Long, bufferlength: Int): Short

public expect fun SQLSetDescRec(descriptorhandle: Long, recnumber: Short, type: Short, subtype: Short, length: Long, precision: Short, scale: Short, data: Long, stringlength: Long, indicator: Long): Short

public expect fun SQLSetEnvAttr(environmenthandle: Long, attribute: Int, value: Long, stringlength: Int): Short

public expect fun SQLSetParam(statementhandle: Long, parameternumber: UShort, valuetype: Short, parametertype: Short, lengthprecision: ULong, parameterscale: Short, parametervalue: Long, strlen_or_ind: Long): Short

public expect fun SQLSetPos(hstmt: Long, irow: ULong, foption: UShort, flock: UShort): Short

public expect fun SQLSetScrollOptions(hstmt: Long, fconcurrency: UShort, crowkeyset: Long, crowrowset: UShort): Short

public expect fun SQLSetStmtAttr(statementhandle: Long, attribute: Int, value: Long, stringlength: Int): Short

public expect fun SQLSetStmtAttrW(hstmt: Long, fattribute: Int, rgbvalue: Long, cbvaluemax: Int): Short

public expect fun SQLSetStmtOption(statementhandle: Long, option: UShort, value: ULong): Short

public expect fun SQLSpecialColumns(statementhandle: Long, identifiertype: UShort, catalogname: Long, namelength1: Short, schemaname: Long, namelength2: Short, tablename: Long, namelength3: Short, scope: UShort, nullable: UShort): Short

public expect fun SQLSpecialColumnsA(hstmt: Long, fcoltype: UShort, szcatalogname: Long, cbcatalogname: Short, szschemaname: Long, cbschemaname: Short, sztablename: Long, cbtablename: Short, fscope: UShort, fnullable: UShort): Short

public expect fun SQLSpecialColumnsW(hstmt: Long, fcoltype: UShort, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short, fscope: UShort, fnullable: UShort): Short

public expect fun SQLStatistics(statementhandle: Long, catalogname: Long, namelength1: Short, schemaname: Long, namelength2: Short, tablename: Long, namelength3: Short, unique: UShort, reserved: UShort): Short

public expect fun SQLStatisticsA(hstmt: Long, szcatalogname: Long, cbcatalogname: Short, szschemaname: Long, cbschemaname: Short, sztablename: Long, cbtablename: Short, funique: UShort, faccuracy: UShort): Short

public expect fun SQLStatisticsW(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short, funique: UShort, faccuracy: UShort): Short

public expect fun SQLTablePrivileges(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short): Short

public expect fun SQLTablePrivilegesA(hstmt: Long, szcatalogname: Long, cbcatalogname: Short, szschemaname: Long, cbschemaname: Short, sztablename: Long, cbtablename: Short): Short

public expect fun SQLTablePrivilegesW(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short): Short

public expect fun SQLTables(statementhandle: Long, catalogname: Long, namelength1: Short, schemaname: Long, namelength2: Short, tablename: Long, namelength3: Short, tabletype: Long, namelength4: Short): Short

public expect fun SQLTablesA(hstmt: Long, szcatalogname: Long, cbcatalogname: Short, szschemaname: Long, cbschemaname: Short, sztablename: Long, cbtablename: Short, sztabletype: Long, cbtabletype: Short): Short

public expect fun SQLTablesW(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short, sztabletype: Long, cchtabletype: Short): Short

public expect fun SQLTransact(environmenthandle: Long, connectionhandle: Long, completiontype: UShort): Short

public expect fun bcp_batch(param0: Long): Int

public expect fun bcp_bind(param0: Long, param1: Long, param2: Int, param3: Int, param4: Long, param5: Int, param6: Int, param7: Int): Short

public expect fun bcp_colfmt(param0: Long, param1: Int, param2: UByte, param3: Int, param4: Int, param5: Long, param6: Int, param7: Int): Short

public expect fun bcp_collen(param0: Long, param1: Int, param2: Int): Short

public expect fun bcp_colptr(param0: Long, param1: Long, param2: Int): Short

public expect fun bcp_columns(param0: Long, param1: Int): Short

public expect fun bcp_control(param0: Long, param1: Int, param2: Long): Short

public expect fun bcp_done(param0: Long): Int

public expect fun bcp_exec(param0: Long, param1: Long): Short

public expect fun bcp_getcolfmt(param0: Long, param1: Int, param2: Int, param3: Long, param4: Int, param5: Long): Short

public expect fun bcp_initA(param0: Long, param1: PCSTR, param2: PCSTR, param3: PCSTR, param4: Int): Short

public expect fun bcp_initW(param0: Long, param1: PCWSTR, param2: PCWSTR, param3: PCWSTR, param4: Int): Short

public expect fun bcp_moretext(param0: Long, param1: Int, param2: Long): Short

public expect fun bcp_readfmtA(param0: Long, param1: PCSTR): Short

public expect fun bcp_readfmtW(param0: Long, param1: PCWSTR): Short

public expect fun bcp_sendrow(param0: Long): Short

public expect fun bcp_setcolfmt(param0: Long, param1: Int, param2: Int, param3: Long, param4: Int): Short

public expect fun bcp_writefmtA(param0: Long, param1: PCSTR): Short

public expect fun bcp_writefmtW(param0: Long, param1: PCWSTR): Short

public expect fun dbprtypeA(param0: Int): PSTR

public expect fun dbprtypeW(param0: Int): PWSTR
