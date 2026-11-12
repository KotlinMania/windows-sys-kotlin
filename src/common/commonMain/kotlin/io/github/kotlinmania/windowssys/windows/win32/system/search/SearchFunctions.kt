package io.github.kotlinmania.windowssys.windows.win32.system.search

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public expect fun oDBCGetTryWaitValue(): UInt

public expect fun oDBCSetTryWaitValue(dwvalue: UInt): Bool

public expect fun sQLAllocConnect(environmenthandle: MutPtr, connectionhandle: MutPtr): Short

public expect fun sQLAllocEnv(environmenthandle: MutPtr): Short

public expect fun sQLAllocHandle(handletype: Short, inputhandle: MutPtr, outputhandle: MutPtr): Short

public expect fun sQLAllocHandleStd(fhandletype: Short, hinput: MutPtr, phoutput: MutPtr): Short

public expect fun sQLAllocStmt(connectionhandle: MutPtr, statementhandle: MutPtr): Short

public expect fun sQLBindCol(statementhandle: MutPtr, columnnumber: UShort, targettype: Short, targetvalue: MutPtr, bufferlength: Long, strlenOrInd: MutPtr): Short

public expect fun sQLBindParam(statementhandle: MutPtr, parameternumber: UShort, valuetype: Short, parametertype: Short, lengthprecision: ULong, parameterscale: Short, parametervalue: MutPtr, strlenOrInd: MutPtr): Short

public expect fun sQLBindParameter(hstmt: MutPtr, ipar: UShort, fparamtype: Short, fctype: Short, fsqltype: Short, cbcoldef: ULong, ibscale: Short, rgbvalue: MutPtr, cbvaluemax: Long, pcbvalue: MutPtr): Short

public expect fun sQLBrowseConnect(hdbc: MutPtr, szconnstrin: ConstPtr, cchconnstrin: Short, szconnstrout: MutPtr, cchconnstroutmax: Short, pcchconnstrout: MutPtr): Short

public expect fun sQLBrowseConnectA(hdbc: MutPtr, szconnstrin: ConstPtr, cbconnstrin: Short, szconnstrout: MutPtr, cbconnstroutmax: Short, pcbconnstrout: MutPtr): Short

public expect fun sQLBrowseConnectW(hdbc: MutPtr, szconnstrin: ConstPtr, cchconnstrin: Short, szconnstrout: MutPtr, cchconnstroutmax: Short, pcchconnstrout: MutPtr): Short

public expect fun sQLBulkOperations(statementhandle: MutPtr, operation: Short): Short

public expect fun sQLCancel(statementhandle: MutPtr): Short

public expect fun sQLCancelHandle(handletype: Short, inputhandle: MutPtr): Short

public expect fun sQLCloseCursor(statementhandle: MutPtr): Short

public expect fun sQLCloseEnumServers(henumhandle: Handle): Short

public expect fun sQLColAttribute(statementhandle: MutPtr, columnnumber: UShort, fieldidentifier: UShort, characterattribute: MutPtr, bufferlength: Short, stringlength: MutPtr, numericattribute: MutPtr): Short

public expect fun sQLColAttributeA(hstmt: MutPtr, icol: Short, ifield: Short, pcharattr: MutPtr, cbcharattrmax: Short, pcbcharattr: MutPtr, pnumattr: MutPtr): Short

public expect fun sQLColAttributeW(hstmt: MutPtr, icol: UShort, ifield: UShort, pcharattr: MutPtr, cbdescmax: Short, pcbcharattr: MutPtr, pnumattr: MutPtr): Short

public expect fun sQLColAttributes(hstmt: MutPtr, icol: UShort, fdesctype: UShort, rgbdesc: MutPtr, cbdescmax: Short, pcbdesc: MutPtr, pfdesc: MutPtr): Short

public expect fun sQLColAttributesA(hstmt: MutPtr, icol: UShort, fdesctype: UShort, rgbdesc: MutPtr, cbdescmax: Short, pcbdesc: MutPtr, pfdesc: MutPtr): Short

public expect fun sQLColAttributesW(hstmt: MutPtr, icol: UShort, fdesctype: UShort, rgbdesc: MutPtr, cbdescmax: Short, pcbdesc: MutPtr, pfdesc: MutPtr): Short

public expect fun sQLColumnPrivileges(hstmt: MutPtr, szcatalogname: ConstPtr, cchcatalogname: Short, szschemaname: ConstPtr, cchschemaname: Short, sztablename: ConstPtr, cchtablename: Short, szcolumnname: ConstPtr, cchcolumnname: Short): Short

public expect fun sQLColumnPrivilegesA(hstmt: MutPtr, szcatalogname: ConstPtr, cbcatalogname: Short, szschemaname: ConstPtr, cbschemaname: Short, sztablename: ConstPtr, cbtablename: Short, szcolumnname: ConstPtr, cbcolumnname: Short): Short

public expect fun sQLColumnPrivilegesW(hstmt: MutPtr, szcatalogname: ConstPtr, cchcatalogname: Short, szschemaname: ConstPtr, cchschemaname: Short, sztablename: ConstPtr, cchtablename: Short, szcolumnname: ConstPtr, cchcolumnname: Short): Short

public expect fun sQLColumns(statementhandle: MutPtr, catalogname: ConstPtr, namelength1: Short, schemaname: ConstPtr, namelength2: Short, tablename: ConstPtr, namelength3: Short, columnname: ConstPtr, namelength4: Short): Short

public expect fun sQLColumnsA(hstmt: MutPtr, szcatalogname: ConstPtr, cbcatalogname: Short, szschemaname: ConstPtr, cbschemaname: Short, sztablename: ConstPtr, cbtablename: Short, szcolumnname: ConstPtr, cbcolumnname: Short): Short

public expect fun sQLColumnsW(hstmt: MutPtr, szcatalogname: ConstPtr, cchcatalogname: Short, szschemaname: ConstPtr, cchschemaname: Short, sztablename: ConstPtr, cchtablename: Short, szcolumnname: ConstPtr, cchcolumnname: Short): Short

public expect fun sQLCompleteAsync(handletype: Short, handle: MutPtr, asyncretcodeptr: MutPtr): Short

public expect fun sQLConnect(connectionhandle: MutPtr, servername: ConstPtr, namelength1: Short, username: ConstPtr, namelength2: Short, authentication: ConstPtr, namelength3: Short): Short

public expect fun sQLConnectA(hdbc: MutPtr, szdsn: ConstPtr, cbdsn: Short, szuid: ConstPtr, cbuid: Short, szauthstr: ConstPtr, cbauthstr: Short): Short

public expect fun sQLConnectW(hdbc: MutPtr, szdsn: ConstPtr, cchdsn: Short, szuid: ConstPtr, cchuid: Short, szauthstr: ConstPtr, cchauthstr: Short): Short

public expect fun sQLCopyDesc(sourcedeschandle: MutPtr, targetdeschandle: MutPtr): Short

public expect fun sQLDataSources(environmenthandle: MutPtr, direction: UShort, servername: MutPtr, bufferlength1: Short, namelength1ptr: MutPtr, description: MutPtr, bufferlength2: Short, namelength2ptr: MutPtr): Short

public expect fun sQLDataSourcesA(henv: MutPtr, fdirection: UShort, szdsn: MutPtr, cbdsnmax: Short, pcbdsn: MutPtr, szdescription: MutPtr, cbdescriptionmax: Short, pcbdescription: MutPtr): Short

public expect fun sQLDataSourcesW(henv: MutPtr, fdirection: UShort, szdsn: MutPtr, cchdsnmax: Short, pcchdsn: MutPtr, wszdescription: MutPtr, cchdescriptionmax: Short, pcchdescription: MutPtr): Short

public expect fun sQLDescribeCol(statementhandle: MutPtr, columnnumber: UShort, columnname: MutPtr, bufferlength: Short, namelength: MutPtr, datatype: MutPtr, columnsize: MutPtr, decimaldigits: MutPtr, nullable: MutPtr): Short

public expect fun sQLDescribeColA(hstmt: MutPtr, icol: UShort, szcolname: MutPtr, cbcolnamemax: Short, pcbcolname: MutPtr, pfsqltype: MutPtr, pcbcoldef: MutPtr, pibscale: MutPtr, pfnullable: MutPtr): Short

public expect fun sQLDescribeColW(hstmt: MutPtr, icol: UShort, szcolname: MutPtr, cchcolnamemax: Short, pcchcolname: MutPtr, pfsqltype: MutPtr, pcbcoldef: MutPtr, pibscale: MutPtr, pfnullable: MutPtr): Short

public expect fun sQLDescribeParam(hstmt: MutPtr, ipar: UShort, pfsqltype: MutPtr, pcbparamdef: MutPtr, pibscale: MutPtr, pfnullable: MutPtr): Short

public expect fun sQLDisconnect(connectionhandle: MutPtr): Short

public expect fun sQLDriverConnect(hdbc: MutPtr, hwnd: Long, szconnstrin: ConstPtr, cchconnstrin: Short, szconnstrout: MutPtr, cchconnstroutmax: Short, pcchconnstrout: MutPtr, fdrivercompletion: UShort): Short

public expect fun sQLDriverConnectA(hdbc: MutPtr, hwnd: Long, szconnstrin: ConstPtr, cbconnstrin: Short, szconnstrout: MutPtr, cbconnstroutmax: Short, pcbconnstrout: MutPtr, fdrivercompletion: UShort): Short

public expect fun sQLDriverConnectW(hdbc: MutPtr, hwnd: Long, szconnstrin: ConstPtr, cchconnstrin: Short, szconnstrout: MutPtr, cchconnstroutmax: Short, pcchconnstrout: MutPtr, fdrivercompletion: UShort): Short

public expect fun sQLDrivers(henv: MutPtr, fdirection: UShort, szdriverdesc: MutPtr, cchdriverdescmax: Short, pcchdriverdesc: MutPtr, szdriverattributes: MutPtr, cchdrvrattrmax: Short, pcchdrvrattr: MutPtr): Short

public expect fun sQLDriversA(henv: MutPtr, fdirection: UShort, szdriverdesc: MutPtr, cbdriverdescmax: Short, pcbdriverdesc: MutPtr, szdriverattributes: MutPtr, cbdrvrattrmax: Short, pcbdrvrattr: MutPtr): Short

public expect fun sQLDriversW(henv: MutPtr, fdirection: UShort, szdriverdesc: MutPtr, cchdriverdescmax: Short, pcchdriverdesc: MutPtr, szdriverattributes: MutPtr, cchdrvrattrmax: Short, pcchdrvrattr: MutPtr): Short

public expect fun sQLEndTran(handletype: Short, handle: MutPtr, completiontype: Short): Short

public expect fun sQLError(environmenthandle: MutPtr, connectionhandle: MutPtr, statementhandle: MutPtr, sqlstate: MutPtr, nativeerror: MutPtr, messagetext: MutPtr, bufferlength: Short, textlength: MutPtr): Short

public expect fun sQLErrorA(henv: MutPtr, hdbc: MutPtr, hstmt: MutPtr, szsqlstate: MutPtr, pfnativeerror: MutPtr, szerrormsg: MutPtr, cberrormsgmax: Short, pcberrormsg: MutPtr): Short

public expect fun sQLErrorW(henv: MutPtr, hdbc: MutPtr, hstmt: MutPtr, wszsqlstate: MutPtr, pfnativeerror: MutPtr, wszerrormsg: MutPtr, ccherrormsgmax: Short, pccherrormsg: MutPtr): Short

public expect fun sQLExecDirect(statementhandle: MutPtr, statementtext: ConstPtr, textlength: Int): Short

public expect fun sQLExecDirectA(hstmt: MutPtr, szsqlstr: ConstPtr, cbsqlstr: Int): Short

public expect fun sQLExecDirectW(hstmt: MutPtr, szsqlstr: ConstPtr, textlength: Int): Short

public expect fun sQLExecute(statementhandle: MutPtr): Short

public expect fun sQLExtendedFetch(hstmt: MutPtr, ffetchtype: UShort, irow: Long, pcrow: MutPtr, rgfrowstatus: MutPtr): Short

public expect fun sQLFetch(statementhandle: MutPtr): Short

public expect fun sQLFetchScroll(statementhandle: MutPtr, fetchorientation: Short, fetchoffset: Long): Short

public expect fun sQLForeignKeys(hstmt: MutPtr, szpkcatalogname: ConstPtr, cchpkcatalogname: Short, szpkschemaname: ConstPtr, cchpkschemaname: Short, szpktablename: ConstPtr, cchpktablename: Short, szfkcatalogname: ConstPtr, cchfkcatalogname: Short, szfkschemaname: ConstPtr, cchfkschemaname: Short, szfktablename: ConstPtr, cchfktablename: Short): Short

public expect fun sQLForeignKeysA(hstmt: MutPtr, szpkcatalogname: ConstPtr, cbpkcatalogname: Short, szpkschemaname: ConstPtr, cbpkschemaname: Short, szpktablename: ConstPtr, cbpktablename: Short, szfkcatalogname: ConstPtr, cbfkcatalogname: Short, szfkschemaname: ConstPtr, cbfkschemaname: Short, szfktablename: ConstPtr, cbfktablename: Short): Short

public expect fun sQLForeignKeysW(hstmt: MutPtr, szpkcatalogname: ConstPtr, cchpkcatalogname: Short, szpkschemaname: ConstPtr, cchpkschemaname: Short, szpktablename: ConstPtr, cchpktablename: Short, szfkcatalogname: ConstPtr, cchfkcatalogname: Short, szfkschemaname: ConstPtr, cchfkschemaname: Short, szfktablename: ConstPtr, cchfktablename: Short): Short

public expect fun sQLFreeConnect(connectionhandle: MutPtr): Short

public expect fun sQLFreeEnv(environmenthandle: MutPtr): Short

public expect fun sQLFreeHandle(handletype: Short, handle: MutPtr): Short

public expect fun sQLFreeStmt(statementhandle: MutPtr, option: UShort): Short

public expect fun sQLGetConnectAttr(connectionhandle: MutPtr, attribute: Int, value: MutPtr, bufferlength: Int, stringlengthptr: MutPtr): Short

public expect fun sQLGetConnectAttrA(hdbc: MutPtr, fattribute: Int, rgbvalue: MutPtr, cbvaluemax: Int, pcbvalue: MutPtr): Short

public expect fun sQLGetConnectAttrW(hdbc: MutPtr, fattribute: Int, rgbvalue: MutPtr, cbvaluemax: Int, pcbvalue: MutPtr): Short

public expect fun sQLGetConnectOption(connectionhandle: MutPtr, option: UShort, value: MutPtr): Short

public expect fun sQLGetConnectOptionA(hdbc: MutPtr, foption: UShort, pvparam: MutPtr): Short

public expect fun sQLGetConnectOptionW(hdbc: MutPtr, foption: UShort, pvparam: MutPtr): Short

public expect fun sQLGetCursorName(statementhandle: MutPtr, cursorname: MutPtr, bufferlength: Short, namelengthptr: MutPtr): Short

public expect fun sQLGetCursorNameA(hstmt: MutPtr, szcursor: MutPtr, cbcursormax: Short, pcbcursor: MutPtr): Short

public expect fun sQLGetCursorNameW(hstmt: MutPtr, szcursor: MutPtr, cchcursormax: Short, pcchcursor: MutPtr): Short

public expect fun sQLGetData(statementhandle: MutPtr, columnnumber: UShort, targettype: Short, targetvalue: MutPtr, bufferlength: Long, strlenOrIndptr: MutPtr): Short

public expect fun sQLGetDescField(descriptorhandle: MutPtr, recnumber: Short, fieldidentifier: Short, value: MutPtr, bufferlength: Int, stringlength: MutPtr): Short

public expect fun sQLGetDescFieldA(hdesc: MutPtr, irecord: Short, ifield: Short, rgbvalue: MutPtr, cbbufferlength: Int, stringlength: MutPtr): Short

public expect fun sQLGetDescFieldW(hdesc: MutPtr, irecord: Short, ifield: Short, rgbvalue: MutPtr, cbbufferlength: Int, stringlength: MutPtr): Short

public expect fun sQLGetDescRec(descriptorhandle: MutPtr, recnumber: Short, name: MutPtr, bufferlength: Short, stringlengthptr: MutPtr, typeptr: MutPtr, subtypeptr: MutPtr, lengthptr: MutPtr, precisionptr: MutPtr, scaleptr: MutPtr, nullableptr: MutPtr): Short

public expect fun sQLGetDescRecA(hdesc: MutPtr, irecord: Short, szname: MutPtr, cbnamemax: Short, pcbname: MutPtr, pftype: MutPtr, pfsubtype: MutPtr, plength: MutPtr, pprecision: MutPtr, pscale: MutPtr, pnullable: MutPtr): Short

public expect fun sQLGetDescRecW(hdesc: MutPtr, irecord: Short, szname: MutPtr, cchnamemax: Short, pcchname: MutPtr, pftype: MutPtr, pfsubtype: MutPtr, plength: MutPtr, pprecision: MutPtr, pscale: MutPtr, pnullable: MutPtr): Short

public expect fun sQLGetDiagField(handletype: Short, handle: MutPtr, recnumber: Short, diagidentifier: Short, diaginfo: MutPtr, bufferlength: Short, stringlength: MutPtr): Short

public expect fun sQLGetDiagFieldA(fhandletype: Short, handle: MutPtr, irecord: Short, fdiagfield: Short, rgbdiaginfo: MutPtr, cbdiaginfomax: Short, pcbdiaginfo: MutPtr): Short

public expect fun sQLGetDiagFieldW(fhandletype: Short, handle: MutPtr, irecord: Short, fdiagfield: Short, rgbdiaginfo: MutPtr, cbbufferlength: Short, pcbstringlength: MutPtr): Short

public expect fun sQLGetDiagRec(handletype: Short, handle: MutPtr, recnumber: Short, sqlstate: MutPtr, nativeerror: MutPtr, messagetext: MutPtr, bufferlength: Short, textlength: MutPtr): Short

public expect fun sQLGetDiagRecA(fhandletype: Short, handle: MutPtr, irecord: Short, szsqlstate: MutPtr, pfnativeerror: MutPtr, szerrormsg: MutPtr, cberrormsgmax: Short, pcberrormsg: MutPtr): Short

public expect fun sQLGetDiagRecW(fhandletype: Short, handle: MutPtr, irecord: Short, szsqlstate: MutPtr, pfnativeerror: MutPtr, szerrormsg: MutPtr, ccherrormsgmax: Short, pccherrormsg: MutPtr): Short

public expect fun sQLGetEnvAttr(environmenthandle: MutPtr, attribute: Int, value: MutPtr, bufferlength: Int, stringlength: MutPtr): Short

public expect fun sQLGetFunctions(connectionhandle: MutPtr, functionid: UShort, supported: MutPtr): Short

public expect fun sQLGetInfo(connectionhandle: MutPtr, infotype: UShort, infovalue: MutPtr, bufferlength: Short, stringlengthptr: MutPtr): Short

public expect fun sQLGetInfoA(hdbc: MutPtr, finfotype: UShort, rgbinfovalue: MutPtr, cbinfovaluemax: Short, pcbinfovalue: MutPtr): Short

public expect fun sQLGetInfoW(hdbc: MutPtr, finfotype: UShort, rgbinfovalue: MutPtr, cbinfovaluemax: Short, pcbinfovalue: MutPtr): Short

public expect fun sQLGetNextEnumeration(henumhandle: Handle, prgenumdata: MutPtr, pienumlength: MutPtr): Short

public expect fun sQLGetStmtAttr(statementhandle: MutPtr, attribute: Int, value: MutPtr, bufferlength: Int, stringlength: MutPtr): Short

public expect fun sQLGetStmtAttrA(hstmt: MutPtr, fattribute: Int, rgbvalue: MutPtr, cbvaluemax: Int, pcbvalue: MutPtr): Short

public expect fun sQLGetStmtAttrW(hstmt: MutPtr, fattribute: Int, rgbvalue: MutPtr, cbvaluemax: Int, pcbvalue: MutPtr): Short

public expect fun sQLGetStmtOption(statementhandle: MutPtr, option: UShort, value: MutPtr): Short

public expect fun sQLGetTypeInfo(statementhandle: MutPtr, datatype: Short): Short

public expect fun sQLGetTypeInfoA(statementhandle: MutPtr, datatype: Short): Short

public expect fun sQLGetTypeInfoW(statementhandle: MutPtr, datatype: Short): Short

public expect fun sQLInitEnumServers(pwchservername: Pcwstr, pwchinstancename: Pcwstr): Handle

public expect fun sQLLinkedCatalogsA(param0: MutPtr, param1: Pcstr, param2: Short): Short

public expect fun sQLLinkedCatalogsW(param0: MutPtr, param1: Pcwstr, param2: Short): Short

public expect fun sQLLinkedServers(param0: MutPtr): Short

public expect fun sQLMoreResults(hstmt: MutPtr): Short

public expect fun sQLNativeSql(hdbc: MutPtr, szsqlstrin: ConstPtr, cchsqlstrin: Int, szsqlstr: MutPtr, cchsqlstrmax: Int, pcbsqlstr: MutPtr): Short

public expect fun sQLNativeSqlA(hdbc: MutPtr, szsqlstrin: ConstPtr, cbsqlstrin: Int, szsqlstr: MutPtr, cbsqlstrmax: Int, pcbsqlstr: MutPtr): Short

public expect fun sQLNativeSqlW(hdbc: MutPtr, szsqlstrin: ConstPtr, cchsqlstrin: Int, szsqlstr: MutPtr, cchsqlstrmax: Int, pcchsqlstr: MutPtr): Short

public expect fun sQLNumParams(hstmt: MutPtr, pcpar: MutPtr): Short

public expect fun sQLNumResultCols(statementhandle: MutPtr, columncount: MutPtr): Short

public expect fun sQLParamData(statementhandle: MutPtr, value: MutPtr): Short

public expect fun sQLParamOptions(hstmt: MutPtr, crow: ULong, pirow: MutPtr): Short

public expect fun sQLPrepare(statementhandle: MutPtr, statementtext: ConstPtr, textlength: Int): Short

public expect fun sQLPrepareA(hstmt: MutPtr, szsqlstr: ConstPtr, cbsqlstr: Int): Short

public expect fun sQLPrepareW(hstmt: MutPtr, szsqlstr: ConstPtr, cchsqlstr: Int): Short

public expect fun sQLPrimaryKeys(hstmt: MutPtr, szcatalogname: ConstPtr, cchcatalogname: Short, szschemaname: ConstPtr, cchschemaname: Short, sztablename: ConstPtr, cchtablename: Short): Short

public expect fun sQLPrimaryKeysA(hstmt: MutPtr, szcatalogname: ConstPtr, cbcatalogname: Short, szschemaname: ConstPtr, cbschemaname: Short, sztablename: ConstPtr, cbtablename: Short): Short

public expect fun sQLPrimaryKeysW(hstmt: MutPtr, szcatalogname: ConstPtr, cchcatalogname: Short, szschemaname: ConstPtr, cchschemaname: Short, sztablename: ConstPtr, cchtablename: Short): Short

public expect fun sQLProcedureColumns(hstmt: MutPtr, szcatalogname: ConstPtr, cchcatalogname: Short, szschemaname: ConstPtr, cchschemaname: Short, szprocname: ConstPtr, cchprocname: Short, szcolumnname: ConstPtr, cchcolumnname: Short): Short

public expect fun sQLProcedureColumnsA(hstmt: MutPtr, szcatalogname: ConstPtr, cbcatalogname: Short, szschemaname: ConstPtr, cbschemaname: Short, szprocname: ConstPtr, cbprocname: Short, szcolumnname: ConstPtr, cbcolumnname: Short): Short

public expect fun sQLProcedureColumnsW(hstmt: MutPtr, szcatalogname: ConstPtr, cchcatalogname: Short, szschemaname: ConstPtr, cchschemaname: Short, szprocname: ConstPtr, cchprocname: Short, szcolumnname: ConstPtr, cchcolumnname: Short): Short

public expect fun sQLProcedures(hstmt: MutPtr, szcatalogname: ConstPtr, cchcatalogname: Short, szschemaname: ConstPtr, cchschemaname: Short, szprocname: ConstPtr, cchprocname: Short): Short

public expect fun sQLProceduresA(hstmt: MutPtr, szcatalogname: ConstPtr, cbcatalogname: Short, szschemaname: ConstPtr, cbschemaname: Short, szprocname: ConstPtr, cbprocname: Short): Short

public expect fun sQLProceduresW(hstmt: MutPtr, szcatalogname: ConstPtr, cchcatalogname: Short, szschemaname: ConstPtr, cchschemaname: Short, szprocname: ConstPtr, cchprocname: Short): Short

public expect fun sQLPutData(statementhandle: MutPtr, data: ConstPtr, strlenOrInd: Long): Short

public expect fun sQLRowCount(statementhandle: ConstPtr, rowcount: MutPtr): Short

public expect fun sQLSetConnectAttr(connectionhandle: MutPtr, attribute: Int, value: ConstPtr, stringlength: Int): Short

public expect fun sQLSetConnectAttrA(hdbc: MutPtr, fattribute: Int, rgbvalue: ConstPtr, cbvalue: Int): Short

public expect fun sQLSetConnectAttrW(hdbc: MutPtr, fattribute: Int, rgbvalue: ConstPtr, cbvalue: Int): Short

public expect fun sQLSetConnectOption(connectionhandle: MutPtr, option: UShort, value: ULong): Short

public expect fun sQLSetConnectOptionA(hdbc: MutPtr, foption: UShort, vparam: ULong): Short

public expect fun sQLSetConnectOptionW(hdbc: MutPtr, foption: UShort, vparam: ULong): Short

public expect fun sQLSetCursorName(statementhandle: MutPtr, cursorname: ConstPtr, namelength: Short): Short

public expect fun sQLSetCursorNameA(hstmt: MutPtr, szcursor: ConstPtr, cbcursor: Short): Short

public expect fun sQLSetCursorNameW(hstmt: MutPtr, szcursor: ConstPtr, cchcursor: Short): Short

public expect fun sQLSetDescField(descriptorhandle: MutPtr, recnumber: Short, fieldidentifier: Short, value: ConstPtr, bufferlength: Int): Short

public expect fun sQLSetDescFieldW(descriptorhandle: MutPtr, recnumber: Short, fieldidentifier: Short, value: MutPtr, bufferlength: Int): Short

public expect fun sQLSetDescRec(descriptorhandle: MutPtr, recnumber: Short, type: Short, subtype: Short, length: Long, precision: Short, scale: Short, data: MutPtr, stringlength: MutPtr, indicator: MutPtr): Short

public expect fun sQLSetEnvAttr(environmenthandle: MutPtr, attribute: Int, value: ConstPtr, stringlength: Int): Short

public expect fun sQLSetParam(statementhandle: MutPtr, parameternumber: UShort, valuetype: Short, parametertype: Short, lengthprecision: ULong, parameterscale: Short, parametervalue: ConstPtr, strlenOrInd: MutPtr): Short

public expect fun sQLSetPos(hstmt: MutPtr, irow: ULong, foption: UShort, flock: UShort): Short

public expect fun sQLSetScrollOptions(hstmt: MutPtr, fconcurrency: UShort, crowkeyset: Long, crowrowset: UShort): Short

public expect fun sQLSetStmtAttr(statementhandle: MutPtr, attribute: Int, value: ConstPtr, stringlength: Int): Short

public expect fun sQLSetStmtAttrW(hstmt: MutPtr, fattribute: Int, rgbvalue: MutPtr, cbvaluemax: Int): Short

public expect fun sQLSetStmtOption(statementhandle: MutPtr, option: UShort, value: ULong): Short

public expect fun sQLSpecialColumns(statementhandle: MutPtr, identifiertype: UShort, catalogname: ConstPtr, namelength1: Short, schemaname: ConstPtr, namelength2: Short, tablename: ConstPtr, namelength3: Short, scope: UShort, nullable: UShort): Short

public expect fun sQLSpecialColumnsA(hstmt: MutPtr, fcoltype: UShort, szcatalogname: ConstPtr, cbcatalogname: Short, szschemaname: ConstPtr, cbschemaname: Short, sztablename: ConstPtr, cbtablename: Short, fscope: UShort, fnullable: UShort): Short

public expect fun sQLSpecialColumnsW(hstmt: MutPtr, fcoltype: UShort, szcatalogname: ConstPtr, cchcatalogname: Short, szschemaname: ConstPtr, cchschemaname: Short, sztablename: ConstPtr, cchtablename: Short, fscope: UShort, fnullable: UShort): Short

public expect fun sQLStatistics(statementhandle: MutPtr, catalogname: ConstPtr, namelength1: Short, schemaname: ConstPtr, namelength2: Short, tablename: ConstPtr, namelength3: Short, unique: UShort, reserved: UShort): Short

public expect fun sQLStatisticsA(hstmt: MutPtr, szcatalogname: ConstPtr, cbcatalogname: Short, szschemaname: ConstPtr, cbschemaname: Short, sztablename: ConstPtr, cbtablename: Short, funique: UShort, faccuracy: UShort): Short

public expect fun sQLStatisticsW(hstmt: MutPtr, szcatalogname: ConstPtr, cchcatalogname: Short, szschemaname: ConstPtr, cchschemaname: Short, sztablename: ConstPtr, cchtablename: Short, funique: UShort, faccuracy: UShort): Short

public expect fun sQLTablePrivileges(hstmt: MutPtr, szcatalogname: ConstPtr, cchcatalogname: Short, szschemaname: ConstPtr, cchschemaname: Short, sztablename: ConstPtr, cchtablename: Short): Short

public expect fun sQLTablePrivilegesA(hstmt: MutPtr, szcatalogname: ConstPtr, cbcatalogname: Short, szschemaname: ConstPtr, cbschemaname: Short, sztablename: ConstPtr, cbtablename: Short): Short

public expect fun sQLTablePrivilegesW(hstmt: MutPtr, szcatalogname: ConstPtr, cchcatalogname: Short, szschemaname: ConstPtr, cchschemaname: Short, sztablename: ConstPtr, cchtablename: Short): Short

public expect fun sQLTables(statementhandle: MutPtr, catalogname: ConstPtr, namelength1: Short, schemaname: ConstPtr, namelength2: Short, tablename: ConstPtr, namelength3: Short, tabletype: ConstPtr, namelength4: Short): Short

public expect fun sQLTablesA(hstmt: MutPtr, szcatalogname: ConstPtr, cbcatalogname: Short, szschemaname: ConstPtr, cbschemaname: Short, sztablename: ConstPtr, cbtablename: Short, sztabletype: ConstPtr, cbtabletype: Short): Short

public expect fun sQLTablesW(hstmt: MutPtr, szcatalogname: ConstPtr, cchcatalogname: Short, szschemaname: ConstPtr, cchschemaname: Short, sztablename: ConstPtr, cchtablename: Short, sztabletype: ConstPtr, cchtabletype: Short): Short

public expect fun sQLTransact(environmenthandle: MutPtr, connectionhandle: MutPtr, completiontype: UShort): Short

public expect fun bcpBatch(param0: MutPtr): Int

public expect fun bcpBind(param0: MutPtr, param1: MutPtr, param2: Int, param3: Int, param4: MutPtr, param5: Int, param6: Int, param7: Int): Short

public expect fun bcpColfmt(param0: MutPtr, param1: Int, param2: UByte, param3: Int, param4: Int, param5: MutPtr, param6: Int, param7: Int): Short

public expect fun bcpCollen(param0: MutPtr, param1: Int, param2: Int): Short

public expect fun bcpColptr(param0: MutPtr, param1: MutPtr, param2: Int): Short

public expect fun bcpColumns(param0: MutPtr, param1: Int): Short

public expect fun bcpControl(param0: MutPtr, param1: Int, param2: MutPtr): Short

public expect fun bcpDone(param0: MutPtr): Int

public expect fun bcpExec(param0: MutPtr, param1: MutPtr): Short

public expect fun bcpGetcolfmt(param0: MutPtr, param1: Int, param2: Int, param3: MutPtr, param4: Int, param5: MutPtr): Short

public expect fun bcpInitA(param0: MutPtr, param1: Pcstr, param2: Pcstr, param3: Pcstr, param4: Int): Short

public expect fun bcpInitW(param0: MutPtr, param1: Pcwstr, param2: Pcwstr, param3: Pcwstr, param4: Int): Short

public expect fun bcpMoretext(param0: MutPtr, param1: Int, param2: MutPtr): Short

public expect fun bcpReadfmtA(param0: MutPtr, param1: Pcstr): Short

public expect fun bcpReadfmtW(param0: MutPtr, param1: Pcwstr): Short

public expect fun bcpSendrow(param0: MutPtr): Short

public expect fun bcpSetcolfmt(param0: MutPtr, param1: Int, param2: Int, param3: MutPtr, param4: Int): Short

public expect fun bcpWritefmtA(param0: MutPtr, param1: Pcstr): Short

public expect fun bcpWritefmtW(param0: MutPtr, param1: Pcwstr): Short

public expect fun dbprtypeA(param0: Int): Pstr

public expect fun dbprtypeW(param0: Int): Pwstr
