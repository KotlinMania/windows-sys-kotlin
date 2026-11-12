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

public expect fun oDBCGetTryWaitValue(): UInt

public expect fun oDBCSetTryWaitValue(dwvalue: UInt): Bool

public expect fun sQLAllocConnect(environmenthandle: MutPtr<CVoid>, connectionhandle: MutPtr<MutPtr<CVoid>>): Short

public expect fun sQLAllocEnv(environmenthandle: MutPtr<MutPtr<CVoid>>): Short

public expect fun sQLAllocHandle(handletype: Short, inputhandle: MutPtr<CVoid>, outputhandle: MutPtr<MutPtr<CVoid>>): Short

public expect fun sQLAllocHandleStd(fhandletype: Short, hinput: MutPtr<CVoid>, phoutput: MutPtr<MutPtr<CVoid>>): Short

public expect fun sQLAllocStmt(connectionhandle: MutPtr<CVoid>, statementhandle: MutPtr<MutPtr<CVoid>>): Short

public expect fun sQLBindCol(statementhandle: MutPtr<CVoid>, columnnumber: UShort, targettype: Short, targetvalue: MutPtr<CVoid>, bufferlength: Long, strlenOrInd: MutPtr<Long>): Short

public expect fun sQLBindParam(statementhandle: MutPtr<CVoid>, parameternumber: UShort, valuetype: Short, parametertype: Short, lengthprecision: ULong, parameterscale: Short, parametervalue: MutPtr<CVoid>, strlenOrInd: MutPtr<Long>): Short

public expect fun sQLBindParameter(hstmt: MutPtr<CVoid>, ipar: UShort, fparamtype: Short, fctype: Short, fsqltype: Short, cbcoldef: ULong, ibscale: Short, rgbvalue: MutPtr<CVoid>, cbvaluemax: Long, pcbvalue: MutPtr<Long>): Short

public expect fun sQLBrowseConnect(hdbc: MutPtr<CVoid>, szconnstrin: ConstPtr<UByte>, cchconnstrin: Short, szconnstrout: MutPtr<UByte>, cchconnstroutmax: Short, pcchconnstrout: MutPtr<Short>): Short

public expect fun sQLBrowseConnectA(hdbc: MutPtr<CVoid>, szconnstrin: ConstPtr<UByte>, cbconnstrin: Short, szconnstrout: MutPtr<UByte>, cbconnstroutmax: Short, pcbconnstrout: MutPtr<Short>): Short

public expect fun sQLBrowseConnectW(hdbc: MutPtr<CVoid>, szconnstrin: ConstPtr<UShort>, cchconnstrin: Short, szconnstrout: MutPtr<UShort>, cchconnstroutmax: Short, pcchconnstrout: MutPtr<Short>): Short

public expect fun sQLBulkOperations(statementhandle: MutPtr<CVoid>, operation: Short): Short

public expect fun sQLCancel(statementhandle: MutPtr<CVoid>): Short

public expect fun sQLCancelHandle(handletype: Short, inputhandle: MutPtr<CVoid>): Short

public expect fun sQLCloseCursor(statementhandle: MutPtr<CVoid>): Short

public expect fun sQLCloseEnumServers(henumhandle: Handle): Short

public expect fun sQLColAttribute(statementhandle: MutPtr<CVoid>, columnnumber: UShort, fieldidentifier: UShort, characterattribute: MutPtr<CVoid>, bufferlength: Short, stringlength: MutPtr<Short>, numericattribute: MutPtr<Long>): Short

public expect fun sQLColAttributeA(hstmt: MutPtr<CVoid>, icol: Short, ifield: Short, pcharattr: MutPtr<CVoid>, cbcharattrmax: Short, pcbcharattr: MutPtr<Short>, pnumattr: MutPtr<Long>): Short

public expect fun sQLColAttributeW(hstmt: MutPtr<CVoid>, icol: UShort, ifield: UShort, pcharattr: MutPtr<CVoid>, cbdescmax: Short, pcbcharattr: MutPtr<Short>, pnumattr: MutPtr<Long>): Short

public expect fun sQLColAttributes(hstmt: MutPtr<CVoid>, icol: UShort, fdesctype: UShort, rgbdesc: MutPtr<CVoid>, cbdescmax: Short, pcbdesc: MutPtr<Short>, pfdesc: MutPtr<Long>): Short

public expect fun sQLColAttributesA(hstmt: MutPtr<CVoid>, icol: UShort, fdesctype: UShort, rgbdesc: MutPtr<CVoid>, cbdescmax: Short, pcbdesc: MutPtr<Short>, pfdesc: MutPtr<Long>): Short

public expect fun sQLColAttributesW(hstmt: MutPtr<CVoid>, icol: UShort, fdesctype: UShort, rgbdesc: MutPtr<CVoid>, cbdescmax: Short, pcbdesc: MutPtr<Short>, pfdesc: MutPtr<Long>): Short

public expect fun sQLColumnPrivileges(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UByte>, cchcatalogname: Short, szschemaname: ConstPtr<UByte>, cchschemaname: Short, sztablename: ConstPtr<UByte>, cchtablename: Short, szcolumnname: ConstPtr<UByte>, cchcolumnname: Short): Short

public expect fun sQLColumnPrivilegesA(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UByte>, cbcatalogname: Short, szschemaname: ConstPtr<UByte>, cbschemaname: Short, sztablename: ConstPtr<UByte>, cbtablename: Short, szcolumnname: ConstPtr<UByte>, cbcolumnname: Short): Short

public expect fun sQLColumnPrivilegesW(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UShort>, cchcatalogname: Short, szschemaname: ConstPtr<UShort>, cchschemaname: Short, sztablename: ConstPtr<UShort>, cchtablename: Short, szcolumnname: ConstPtr<UShort>, cchcolumnname: Short): Short

public expect fun sQLColumns(statementhandle: MutPtr<CVoid>, catalogname: ConstPtr<UByte>, namelength1: Short, schemaname: ConstPtr<UByte>, namelength2: Short, tablename: ConstPtr<UByte>, namelength3: Short, columnname: ConstPtr<UByte>, namelength4: Short): Short

public expect fun sQLColumnsA(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UByte>, cbcatalogname: Short, szschemaname: ConstPtr<UByte>, cbschemaname: Short, sztablename: ConstPtr<UByte>, cbtablename: Short, szcolumnname: ConstPtr<UByte>, cbcolumnname: Short): Short

public expect fun sQLColumnsW(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UShort>, cchcatalogname: Short, szschemaname: ConstPtr<UShort>, cchschemaname: Short, sztablename: ConstPtr<UShort>, cchtablename: Short, szcolumnname: ConstPtr<UShort>, cchcolumnname: Short): Short

public expect fun sQLCompleteAsync(handletype: Short, handle: MutPtr<CVoid>, asyncretcodeptr: MutPtr<Short>): Short

public expect fun sQLConnect(connectionhandle: MutPtr<CVoid>, servername: ConstPtr<UByte>, namelength1: Short, username: ConstPtr<UByte>, namelength2: Short, authentication: ConstPtr<UByte>, namelength3: Short): Short

public expect fun sQLConnectA(hdbc: MutPtr<CVoid>, szdsn: ConstPtr<UByte>, cbdsn: Short, szuid: ConstPtr<UByte>, cbuid: Short, szauthstr: ConstPtr<UByte>, cbauthstr: Short): Short

public expect fun sQLConnectW(hdbc: MutPtr<CVoid>, szdsn: ConstPtr<UShort>, cchdsn: Short, szuid: ConstPtr<UShort>, cchuid: Short, szauthstr: ConstPtr<UShort>, cchauthstr: Short): Short

public expect fun sQLCopyDesc(sourcedeschandle: MutPtr<CVoid>, targetdeschandle: MutPtr<CVoid>): Short

public expect fun sQLDataSources(environmenthandle: MutPtr<CVoid>, direction: UShort, servername: MutPtr<UByte>, bufferlength1: Short, namelength1ptr: MutPtr<Short>, description: MutPtr<UByte>, bufferlength2: Short, namelength2ptr: MutPtr<Short>): Short

public expect fun sQLDataSourcesA(henv: MutPtr<CVoid>, fdirection: UShort, szdsn: MutPtr<UByte>, cbdsnmax: Short, pcbdsn: MutPtr<Short>, szdescription: MutPtr<UByte>, cbdescriptionmax: Short, pcbdescription: MutPtr<Short>): Short

public expect fun sQLDataSourcesW(henv: MutPtr<CVoid>, fdirection: UShort, szdsn: MutPtr<UShort>, cchdsnmax: Short, pcchdsn: MutPtr<Short>, wszdescription: MutPtr<UShort>, cchdescriptionmax: Short, pcchdescription: MutPtr<Short>): Short

public expect fun sQLDescribeCol(statementhandle: MutPtr<CVoid>, columnnumber: UShort, columnname: MutPtr<UByte>, bufferlength: Short, namelength: MutPtr<Short>, datatype: MutPtr<Short>, columnsize: MutPtr<ULong>, decimaldigits: MutPtr<Short>, nullable: MutPtr<Short>): Short

public expect fun sQLDescribeColA(hstmt: MutPtr<CVoid>, icol: UShort, szcolname: MutPtr<UByte>, cbcolnamemax: Short, pcbcolname: MutPtr<Short>, pfsqltype: MutPtr<Short>, pcbcoldef: MutPtr<ULong>, pibscale: MutPtr<Short>, pfnullable: MutPtr<Short>): Short

public expect fun sQLDescribeColW(hstmt: MutPtr<CVoid>, icol: UShort, szcolname: MutPtr<UShort>, cchcolnamemax: Short, pcchcolname: MutPtr<Short>, pfsqltype: MutPtr<Short>, pcbcoldef: MutPtr<ULong>, pibscale: MutPtr<Short>, pfnullable: MutPtr<Short>): Short

public expect fun sQLDescribeParam(hstmt: MutPtr<CVoid>, ipar: UShort, pfsqltype: MutPtr<Short>, pcbparamdef: MutPtr<ULong>, pibscale: MutPtr<Short>, pfnullable: MutPtr<Short>): Short

public expect fun sQLDisconnect(connectionhandle: MutPtr<CVoid>): Short

public expect fun sQLDriverConnect(hdbc: MutPtr<CVoid>, hwnd: Long, szconnstrin: ConstPtr<UByte>, cchconnstrin: Short, szconnstrout: MutPtr<UByte>, cchconnstroutmax: Short, pcchconnstrout: MutPtr<Short>, fdrivercompletion: UShort): Short

public expect fun sQLDriverConnectA(hdbc: MutPtr<CVoid>, hwnd: Long, szconnstrin: ConstPtr<UByte>, cbconnstrin: Short, szconnstrout: MutPtr<UByte>, cbconnstroutmax: Short, pcbconnstrout: MutPtr<Short>, fdrivercompletion: UShort): Short

public expect fun sQLDriverConnectW(hdbc: MutPtr<CVoid>, hwnd: Long, szconnstrin: ConstPtr<UShort>, cchconnstrin: Short, szconnstrout: MutPtr<UShort>, cchconnstroutmax: Short, pcchconnstrout: MutPtr<Short>, fdrivercompletion: UShort): Short

public expect fun sQLDrivers(henv: MutPtr<CVoid>, fdirection: UShort, szdriverdesc: MutPtr<UByte>, cchdriverdescmax: Short, pcchdriverdesc: MutPtr<Short>, szdriverattributes: MutPtr<UByte>, cchdrvrattrmax: Short, pcchdrvrattr: MutPtr<Short>): Short

public expect fun sQLDriversA(henv: MutPtr<CVoid>, fdirection: UShort, szdriverdesc: MutPtr<UByte>, cbdriverdescmax: Short, pcbdriverdesc: MutPtr<Short>, szdriverattributes: MutPtr<UByte>, cbdrvrattrmax: Short, pcbdrvrattr: MutPtr<Short>): Short

public expect fun sQLDriversW(henv: MutPtr<CVoid>, fdirection: UShort, szdriverdesc: MutPtr<UShort>, cchdriverdescmax: Short, pcchdriverdesc: MutPtr<Short>, szdriverattributes: MutPtr<UShort>, cchdrvrattrmax: Short, pcchdrvrattr: MutPtr<Short>): Short

public expect fun sQLEndTran(handletype: Short, handle: MutPtr<CVoid>, completiontype: Short): Short

public expect fun sQLError(environmenthandle: MutPtr<CVoid>, connectionhandle: MutPtr<CVoid>, statementhandle: MutPtr<CVoid>, sqlstate: MutPtr<UByte>, nativeerror: MutPtr<Int>, messagetext: MutPtr<UByte>, bufferlength: Short, textlength: MutPtr<Short>): Short

public expect fun sQLErrorA(henv: MutPtr<CVoid>, hdbc: MutPtr<CVoid>, hstmt: MutPtr<CVoid>, szsqlstate: MutPtr<UByte>, pfnativeerror: MutPtr<Int>, szerrormsg: MutPtr<UByte>, cberrormsgmax: Short, pcberrormsg: MutPtr<Short>): Short

public expect fun sQLErrorW(henv: MutPtr<CVoid>, hdbc: MutPtr<CVoid>, hstmt: MutPtr<CVoid>, wszsqlstate: MutPtr<UShort>, pfnativeerror: MutPtr<Int>, wszerrormsg: MutPtr<UShort>, ccherrormsgmax: Short, pccherrormsg: MutPtr<Short>): Short

public expect fun sQLExecDirect(statementhandle: MutPtr<CVoid>, statementtext: ConstPtr<UByte>, textlength: Int): Short

public expect fun sQLExecDirectA(hstmt: MutPtr<CVoid>, szsqlstr: ConstPtr<UByte>, cbsqlstr: Int): Short

public expect fun sQLExecDirectW(hstmt: MutPtr<CVoid>, szsqlstr: ConstPtr<UShort>, textlength: Int): Short

public expect fun sQLExecute(statementhandle: MutPtr<CVoid>): Short

public expect fun sQLExtendedFetch(hstmt: MutPtr<CVoid>, ffetchtype: UShort, irow: Long, pcrow: MutPtr<ULong>, rgfrowstatus: MutPtr<UShort>): Short

public expect fun sQLFetch(statementhandle: MutPtr<CVoid>): Short

public expect fun sQLFetchScroll(statementhandle: MutPtr<CVoid>, fetchorientation: Short, fetchoffset: Long): Short

public expect fun sQLForeignKeys(hstmt: MutPtr<CVoid>, szpkcatalogname: ConstPtr<UByte>, cchpkcatalogname: Short, szpkschemaname: ConstPtr<UByte>, cchpkschemaname: Short, szpktablename: ConstPtr<UByte>, cchpktablename: Short, szfkcatalogname: ConstPtr<UByte>, cchfkcatalogname: Short, szfkschemaname: ConstPtr<UByte>, cchfkschemaname: Short, szfktablename: ConstPtr<UByte>, cchfktablename: Short): Short

public expect fun sQLForeignKeysA(hstmt: MutPtr<CVoid>, szpkcatalogname: ConstPtr<UByte>, cbpkcatalogname: Short, szpkschemaname: ConstPtr<UByte>, cbpkschemaname: Short, szpktablename: ConstPtr<UByte>, cbpktablename: Short, szfkcatalogname: ConstPtr<UByte>, cbfkcatalogname: Short, szfkschemaname: ConstPtr<UByte>, cbfkschemaname: Short, szfktablename: ConstPtr<UByte>, cbfktablename: Short): Short

public expect fun sQLForeignKeysW(hstmt: MutPtr<CVoid>, szpkcatalogname: ConstPtr<UShort>, cchpkcatalogname: Short, szpkschemaname: ConstPtr<UShort>, cchpkschemaname: Short, szpktablename: ConstPtr<UShort>, cchpktablename: Short, szfkcatalogname: ConstPtr<UShort>, cchfkcatalogname: Short, szfkschemaname: ConstPtr<UShort>, cchfkschemaname: Short, szfktablename: ConstPtr<UShort>, cchfktablename: Short): Short

public expect fun sQLFreeConnect(connectionhandle: MutPtr<CVoid>): Short

public expect fun sQLFreeEnv(environmenthandle: MutPtr<CVoid>): Short

public expect fun sQLFreeHandle(handletype: Short, handle: MutPtr<CVoid>): Short

public expect fun sQLFreeStmt(statementhandle: MutPtr<CVoid>, option: UShort): Short

public expect fun sQLGetConnectAttr(connectionhandle: MutPtr<CVoid>, attribute: Int, value: MutPtr<CVoid>, bufferlength: Int, stringlengthptr: MutPtr<Int>): Short

public expect fun sQLGetConnectAttrA(hdbc: MutPtr<CVoid>, fattribute: Int, rgbvalue: MutPtr<CVoid>, cbvaluemax: Int, pcbvalue: MutPtr<Int>): Short

public expect fun sQLGetConnectAttrW(hdbc: MutPtr<CVoid>, fattribute: Int, rgbvalue: MutPtr<CVoid>, cbvaluemax: Int, pcbvalue: MutPtr<Int>): Short

public expect fun sQLGetConnectOption(connectionhandle: MutPtr<CVoid>, option: UShort, value: MutPtr<CVoid>): Short

public expect fun sQLGetConnectOptionA(hdbc: MutPtr<CVoid>, foption: UShort, pvparam: MutPtr<CVoid>): Short

public expect fun sQLGetConnectOptionW(hdbc: MutPtr<CVoid>, foption: UShort, pvparam: MutPtr<CVoid>): Short

public expect fun sQLGetCursorName(statementhandle: MutPtr<CVoid>, cursorname: MutPtr<UByte>, bufferlength: Short, namelengthptr: MutPtr<Short>): Short

public expect fun sQLGetCursorNameA(hstmt: MutPtr<CVoid>, szcursor: MutPtr<UByte>, cbcursormax: Short, pcbcursor: MutPtr<Short>): Short

public expect fun sQLGetCursorNameW(hstmt: MutPtr<CVoid>, szcursor: MutPtr<UShort>, cchcursormax: Short, pcchcursor: MutPtr<Short>): Short

public expect fun sQLGetData(statementhandle: MutPtr<CVoid>, columnnumber: UShort, targettype: Short, targetvalue: MutPtr<CVoid>, bufferlength: Long, strlenOrIndptr: MutPtr<Long>): Short

public expect fun sQLGetDescField(descriptorhandle: MutPtr<CVoid>, recnumber: Short, fieldidentifier: Short, value: MutPtr<CVoid>, bufferlength: Int, stringlength: MutPtr<Int>): Short

public expect fun sQLGetDescFieldA(hdesc: MutPtr<CVoid>, irecord: Short, ifield: Short, rgbvalue: MutPtr<CVoid>, cbbufferlength: Int, stringlength: MutPtr<Int>): Short

public expect fun sQLGetDescFieldW(hdesc: MutPtr<CVoid>, irecord: Short, ifield: Short, rgbvalue: MutPtr<CVoid>, cbbufferlength: Int, stringlength: MutPtr<Int>): Short

public expect fun sQLGetDescRec(descriptorhandle: MutPtr<CVoid>, recnumber: Short, name: MutPtr<UByte>, bufferlength: Short, stringlengthptr: MutPtr<Short>, typeptr: MutPtr<Short>, subtypeptr: MutPtr<Short>, lengthptr: MutPtr<Long>, precisionptr: MutPtr<Short>, scaleptr: MutPtr<Short>, nullableptr: MutPtr<Short>): Short

public expect fun sQLGetDescRecA(hdesc: MutPtr<CVoid>, irecord: Short, szname: MutPtr<UByte>, cbnamemax: Short, pcbname: MutPtr<Short>, pftype: MutPtr<Short>, pfsubtype: MutPtr<Short>, plength: MutPtr<Long>, pprecision: MutPtr<Short>, pscale: MutPtr<Short>, pnullable: MutPtr<Short>): Short

public expect fun sQLGetDescRecW(hdesc: MutPtr<CVoid>, irecord: Short, szname: MutPtr<UShort>, cchnamemax: Short, pcchname: MutPtr<Short>, pftype: MutPtr<Short>, pfsubtype: MutPtr<Short>, plength: MutPtr<Long>, pprecision: MutPtr<Short>, pscale: MutPtr<Short>, pnullable: MutPtr<Short>): Short

public expect fun sQLGetDiagField(handletype: Short, handle: MutPtr<CVoid>, recnumber: Short, diagidentifier: Short, diaginfo: MutPtr<CVoid>, bufferlength: Short, stringlength: MutPtr<Short>): Short

public expect fun sQLGetDiagFieldA(fhandletype: Short, handle: MutPtr<CVoid>, irecord: Short, fdiagfield: Short, rgbdiaginfo: MutPtr<CVoid>, cbdiaginfomax: Short, pcbdiaginfo: MutPtr<Short>): Short

public expect fun sQLGetDiagFieldW(fhandletype: Short, handle: MutPtr<CVoid>, irecord: Short, fdiagfield: Short, rgbdiaginfo: MutPtr<CVoid>, cbbufferlength: Short, pcbstringlength: MutPtr<Short>): Short

public expect fun sQLGetDiagRec(handletype: Short, handle: MutPtr<CVoid>, recnumber: Short, sqlstate: MutPtr<UByte>, nativeerror: MutPtr<Int>, messagetext: MutPtr<UByte>, bufferlength: Short, textlength: MutPtr<Short>): Short

public expect fun sQLGetDiagRecA(fhandletype: Short, handle: MutPtr<CVoid>, irecord: Short, szsqlstate: MutPtr<UByte>, pfnativeerror: MutPtr<Int>, szerrormsg: MutPtr<UByte>, cberrormsgmax: Short, pcberrormsg: MutPtr<Short>): Short

public expect fun sQLGetDiagRecW(fhandletype: Short, handle: MutPtr<CVoid>, irecord: Short, szsqlstate: MutPtr<UShort>, pfnativeerror: MutPtr<Int>, szerrormsg: MutPtr<UShort>, ccherrormsgmax: Short, pccherrormsg: MutPtr<Short>): Short

public expect fun sQLGetEnvAttr(environmenthandle: MutPtr<CVoid>, attribute: Int, value: MutPtr<CVoid>, bufferlength: Int, stringlength: MutPtr<Int>): Short

public expect fun sQLGetFunctions(connectionhandle: MutPtr<CVoid>, functionid: UShort, supported: MutPtr<UShort>): Short

public expect fun sQLGetInfo(connectionhandle: MutPtr<CVoid>, infotype: UShort, infovalue: MutPtr<CVoid>, bufferlength: Short, stringlengthptr: MutPtr<Short>): Short

public expect fun sQLGetInfoA(hdbc: MutPtr<CVoid>, finfotype: UShort, rgbinfovalue: MutPtr<CVoid>, cbinfovaluemax: Short, pcbinfovalue: MutPtr<Short>): Short

public expect fun sQLGetInfoW(hdbc: MutPtr<CVoid>, finfotype: UShort, rgbinfovalue: MutPtr<CVoid>, cbinfovaluemax: Short, pcbinfovalue: MutPtr<Short>): Short

public expect fun sQLGetNextEnumeration(henumhandle: Handle, prgenumdata: MutPtr<UByte>, pienumlength: MutPtr<Int>): Short

public expect fun sQLGetStmtAttr(statementhandle: MutPtr<CVoid>, attribute: Int, value: MutPtr<CVoid>, bufferlength: Int, stringlength: MutPtr<Int>): Short

public expect fun sQLGetStmtAttrA(hstmt: MutPtr<CVoid>, fattribute: Int, rgbvalue: MutPtr<CVoid>, cbvaluemax: Int, pcbvalue: MutPtr<Int>): Short

public expect fun sQLGetStmtAttrW(hstmt: MutPtr<CVoid>, fattribute: Int, rgbvalue: MutPtr<CVoid>, cbvaluemax: Int, pcbvalue: MutPtr<Int>): Short

public expect fun sQLGetStmtOption(statementhandle: MutPtr<CVoid>, option: UShort, value: MutPtr<CVoid>): Short

public expect fun sQLGetTypeInfo(statementhandle: MutPtr<CVoid>, datatype: Short): Short

public expect fun sQLGetTypeInfoA(statementhandle: MutPtr<CVoid>, datatype: Short): Short

public expect fun sQLGetTypeInfoW(statementhandle: MutPtr<CVoid>, datatype: Short): Short

public expect fun sQLInitEnumServers(pwchservername: Pcwstr, pwchinstancename: Pcwstr): Handle

public expect fun sQLLinkedCatalogsA(param0: MutPtr<CVoid>, param1: Pcstr, param2: Short): Short

public expect fun sQLLinkedCatalogsW(param0: MutPtr<CVoid>, param1: Pcwstr, param2: Short): Short

public expect fun sQLLinkedServers(param0: MutPtr<CVoid>): Short

public expect fun sQLMoreResults(hstmt: MutPtr<CVoid>): Short

public expect fun sQLNativeSql(hdbc: MutPtr<CVoid>, szsqlstrin: ConstPtr<UByte>, cchsqlstrin: Int, szsqlstr: MutPtr<UByte>, cchsqlstrmax: Int, pcbsqlstr: MutPtr<Int>): Short

public expect fun sQLNativeSqlA(hdbc: MutPtr<CVoid>, szsqlstrin: ConstPtr<UByte>, cbsqlstrin: Int, szsqlstr: MutPtr<UByte>, cbsqlstrmax: Int, pcbsqlstr: MutPtr<Int>): Short

public expect fun sQLNativeSqlW(hdbc: MutPtr<CVoid>, szsqlstrin: ConstPtr<UShort>, cchsqlstrin: Int, szsqlstr: MutPtr<UShort>, cchsqlstrmax: Int, pcchsqlstr: MutPtr<Int>): Short

public expect fun sQLNumParams(hstmt: MutPtr<CVoid>, pcpar: MutPtr<Short>): Short

public expect fun sQLNumResultCols(statementhandle: MutPtr<CVoid>, columncount: MutPtr<Short>): Short

public expect fun sQLParamData(statementhandle: MutPtr<CVoid>, value: MutPtr<MutPtr<CVoid>>): Short

public expect fun sQLParamOptions(hstmt: MutPtr<CVoid>, crow: ULong, pirow: MutPtr<ULong>): Short

public expect fun sQLPrepare(statementhandle: MutPtr<CVoid>, statementtext: ConstPtr<UByte>, textlength: Int): Short

public expect fun sQLPrepareA(hstmt: MutPtr<CVoid>, szsqlstr: ConstPtr<UByte>, cbsqlstr: Int): Short

public expect fun sQLPrepareW(hstmt: MutPtr<CVoid>, szsqlstr: ConstPtr<UShort>, cchsqlstr: Int): Short

public expect fun sQLPrimaryKeys(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UByte>, cchcatalogname: Short, szschemaname: ConstPtr<UByte>, cchschemaname: Short, sztablename: ConstPtr<UByte>, cchtablename: Short): Short

public expect fun sQLPrimaryKeysA(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UByte>, cbcatalogname: Short, szschemaname: ConstPtr<UByte>, cbschemaname: Short, sztablename: ConstPtr<UByte>, cbtablename: Short): Short

public expect fun sQLPrimaryKeysW(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UShort>, cchcatalogname: Short, szschemaname: ConstPtr<UShort>, cchschemaname: Short, sztablename: ConstPtr<UShort>, cchtablename: Short): Short

public expect fun sQLProcedureColumns(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UByte>, cchcatalogname: Short, szschemaname: ConstPtr<UByte>, cchschemaname: Short, szprocname: ConstPtr<UByte>, cchprocname: Short, szcolumnname: ConstPtr<UByte>, cchcolumnname: Short): Short

public expect fun sQLProcedureColumnsA(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UByte>, cbcatalogname: Short, szschemaname: ConstPtr<UByte>, cbschemaname: Short, szprocname: ConstPtr<UByte>, cbprocname: Short, szcolumnname: ConstPtr<UByte>, cbcolumnname: Short): Short

public expect fun sQLProcedureColumnsW(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UShort>, cchcatalogname: Short, szschemaname: ConstPtr<UShort>, cchschemaname: Short, szprocname: ConstPtr<UShort>, cchprocname: Short, szcolumnname: ConstPtr<UShort>, cchcolumnname: Short): Short

public expect fun sQLProcedures(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UByte>, cchcatalogname: Short, szschemaname: ConstPtr<UByte>, cchschemaname: Short, szprocname: ConstPtr<UByte>, cchprocname: Short): Short

public expect fun sQLProceduresA(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UByte>, cbcatalogname: Short, szschemaname: ConstPtr<UByte>, cbschemaname: Short, szprocname: ConstPtr<UByte>, cbprocname: Short): Short

public expect fun sQLProceduresW(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UShort>, cchcatalogname: Short, szschemaname: ConstPtr<UShort>, cchschemaname: Short, szprocname: ConstPtr<UShort>, cchprocname: Short): Short

public expect fun sQLPutData(statementhandle: MutPtr<CVoid>, data: ConstPtr<CVoid>, strlenOrInd: Long): Short

public expect fun sQLRowCount(statementhandle: ConstPtr<CVoid>, rowcount: MutPtr<Long>): Short

public expect fun sQLSetConnectAttr(connectionhandle: MutPtr<CVoid>, attribute: Int, value: ConstPtr<CVoid>, stringlength: Int): Short

public expect fun sQLSetConnectAttrA(hdbc: MutPtr<CVoid>, fattribute: Int, rgbvalue: ConstPtr<CVoid>, cbvalue: Int): Short

public expect fun sQLSetConnectAttrW(hdbc: MutPtr<CVoid>, fattribute: Int, rgbvalue: ConstPtr<CVoid>, cbvalue: Int): Short

public expect fun sQLSetConnectOption(connectionhandle: MutPtr<CVoid>, option: UShort, value: ULong): Short

public expect fun sQLSetConnectOptionA(hdbc: MutPtr<CVoid>, foption: UShort, vparam: ULong): Short

public expect fun sQLSetConnectOptionW(hdbc: MutPtr<CVoid>, foption: UShort, vparam: ULong): Short

public expect fun sQLSetCursorName(statementhandle: MutPtr<CVoid>, cursorname: ConstPtr<UByte>, namelength: Short): Short

public expect fun sQLSetCursorNameA(hstmt: MutPtr<CVoid>, szcursor: ConstPtr<UByte>, cbcursor: Short): Short

public expect fun sQLSetCursorNameW(hstmt: MutPtr<CVoid>, szcursor: ConstPtr<UShort>, cchcursor: Short): Short

public expect fun sQLSetDescField(descriptorhandle: MutPtr<CVoid>, recnumber: Short, fieldidentifier: Short, value: ConstPtr<CVoid>, bufferlength: Int): Short

public expect fun sQLSetDescFieldW(descriptorhandle: MutPtr<CVoid>, recnumber: Short, fieldidentifier: Short, value: MutPtr<CVoid>, bufferlength: Int): Short

public expect fun sQLSetDescRec(descriptorhandle: MutPtr<CVoid>, recnumber: Short, type: Short, subtype: Short, length: Long, precision: Short, scale: Short, data: MutPtr<CVoid>, stringlength: MutPtr<Long>, indicator: MutPtr<Long>): Short

public expect fun sQLSetEnvAttr(environmenthandle: MutPtr<CVoid>, attribute: Int, value: ConstPtr<CVoid>, stringlength: Int): Short

public expect fun sQLSetParam(statementhandle: MutPtr<CVoid>, parameternumber: UShort, valuetype: Short, parametertype: Short, lengthprecision: ULong, parameterscale: Short, parametervalue: ConstPtr<CVoid>, strlenOrInd: MutPtr<Long>): Short

public expect fun sQLSetPos(hstmt: MutPtr<CVoid>, irow: ULong, foption: UShort, flock: UShort): Short

public expect fun sQLSetScrollOptions(hstmt: MutPtr<CVoid>, fconcurrency: UShort, crowkeyset: Long, crowrowset: UShort): Short

public expect fun sQLSetStmtAttr(statementhandle: MutPtr<CVoid>, attribute: Int, value: ConstPtr<CVoid>, stringlength: Int): Short

public expect fun sQLSetStmtAttrW(hstmt: MutPtr<CVoid>, fattribute: Int, rgbvalue: MutPtr<CVoid>, cbvaluemax: Int): Short

public expect fun sQLSetStmtOption(statementhandle: MutPtr<CVoid>, option: UShort, value: ULong): Short

public expect fun sQLSpecialColumns(statementhandle: MutPtr<CVoid>, identifiertype: UShort, catalogname: ConstPtr<UByte>, namelength1: Short, schemaname: ConstPtr<UByte>, namelength2: Short, tablename: ConstPtr<UByte>, namelength3: Short, scope: UShort, nullable: UShort): Short

public expect fun sQLSpecialColumnsA(hstmt: MutPtr<CVoid>, fcoltype: UShort, szcatalogname: ConstPtr<UByte>, cbcatalogname: Short, szschemaname: ConstPtr<UByte>, cbschemaname: Short, sztablename: ConstPtr<UByte>, cbtablename: Short, fscope: UShort, fnullable: UShort): Short

public expect fun sQLSpecialColumnsW(hstmt: MutPtr<CVoid>, fcoltype: UShort, szcatalogname: ConstPtr<UShort>, cchcatalogname: Short, szschemaname: ConstPtr<UShort>, cchschemaname: Short, sztablename: ConstPtr<UShort>, cchtablename: Short, fscope: UShort, fnullable: UShort): Short

public expect fun sQLStatistics(statementhandle: MutPtr<CVoid>, catalogname: ConstPtr<UByte>, namelength1: Short, schemaname: ConstPtr<UByte>, namelength2: Short, tablename: ConstPtr<UByte>, namelength3: Short, unique: UShort, reserved: UShort): Short

public expect fun sQLStatisticsA(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UByte>, cbcatalogname: Short, szschemaname: ConstPtr<UByte>, cbschemaname: Short, sztablename: ConstPtr<UByte>, cbtablename: Short, funique: UShort, faccuracy: UShort): Short

public expect fun sQLStatisticsW(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UShort>, cchcatalogname: Short, szschemaname: ConstPtr<UShort>, cchschemaname: Short, sztablename: ConstPtr<UShort>, cchtablename: Short, funique: UShort, faccuracy: UShort): Short

public expect fun sQLTablePrivileges(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UByte>, cchcatalogname: Short, szschemaname: ConstPtr<UByte>, cchschemaname: Short, sztablename: ConstPtr<UByte>, cchtablename: Short): Short

public expect fun sQLTablePrivilegesA(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UByte>, cbcatalogname: Short, szschemaname: ConstPtr<UByte>, cbschemaname: Short, sztablename: ConstPtr<UByte>, cbtablename: Short): Short

public expect fun sQLTablePrivilegesW(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UShort>, cchcatalogname: Short, szschemaname: ConstPtr<UShort>, cchschemaname: Short, sztablename: ConstPtr<UShort>, cchtablename: Short): Short

public expect fun sQLTables(statementhandle: MutPtr<CVoid>, catalogname: ConstPtr<UByte>, namelength1: Short, schemaname: ConstPtr<UByte>, namelength2: Short, tablename: ConstPtr<UByte>, namelength3: Short, tabletype: ConstPtr<UByte>, namelength4: Short): Short

public expect fun sQLTablesA(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UByte>, cbcatalogname: Short, szschemaname: ConstPtr<UByte>, cbschemaname: Short, sztablename: ConstPtr<UByte>, cbtablename: Short, sztabletype: ConstPtr<UByte>, cbtabletype: Short): Short

public expect fun sQLTablesW(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UShort>, cchcatalogname: Short, szschemaname: ConstPtr<UShort>, cchschemaname: Short, sztablename: ConstPtr<UShort>, cchtablename: Short, sztabletype: ConstPtr<UShort>, cchtabletype: Short): Short

public expect fun sQLTransact(environmenthandle: MutPtr<CVoid>, connectionhandle: MutPtr<CVoid>, completiontype: UShort): Short

public expect fun bcpBatch(param0: MutPtr<CVoid>): Int

public expect fun bcpBind(param0: MutPtr<CVoid>, param1: MutPtr<UByte>, param2: Int, param3: Int, param4: MutPtr<UByte>, param5: Int, param6: Int, param7: Int): Short

public expect fun bcpColfmt(param0: MutPtr<CVoid>, param1: Int, param2: UByte, param3: Int, param4: Int, param5: MutPtr<UByte>, param6: Int, param7: Int): Short

public expect fun bcpCollen(param0: MutPtr<CVoid>, param1: Int, param2: Int): Short

public expect fun bcpColptr(param0: MutPtr<CVoid>, param1: MutPtr<UByte>, param2: Int): Short

public expect fun bcpColumns(param0: MutPtr<CVoid>, param1: Int): Short

public expect fun bcpControl(param0: MutPtr<CVoid>, param1: Int, param2: MutPtr<CVoid>): Short

public expect fun bcpDone(param0: MutPtr<CVoid>): Int

public expect fun bcpExec(param0: MutPtr<CVoid>, param1: MutPtr<Int>): Short

public expect fun bcpGetcolfmt(param0: MutPtr<CVoid>, param1: Int, param2: Int, param3: MutPtr<CVoid>, param4: Int, param5: MutPtr<Int>): Short

public expect fun bcpInitA(param0: MutPtr<CVoid>, param1: Pcstr, param2: Pcstr, param3: Pcstr, param4: Int): Short

public expect fun bcpInitW(param0: MutPtr<CVoid>, param1: Pcwstr, param2: Pcwstr, param3: Pcwstr, param4: Int): Short

public expect fun bcpMoretext(param0: MutPtr<CVoid>, param1: Int, param2: MutPtr<UByte>): Short

public expect fun bcpReadfmtA(param0: MutPtr<CVoid>, param1: Pcstr): Short

public expect fun bcpReadfmtW(param0: MutPtr<CVoid>, param1: Pcwstr): Short

public expect fun bcpSendrow(param0: MutPtr<CVoid>): Short

public expect fun bcpSetcolfmt(param0: MutPtr<CVoid>, param1: Int, param2: Int, param3: MutPtr<CVoid>, param4: Int): Short

public expect fun bcpWritefmtA(param0: MutPtr<CVoid>, param1: Pcstr): Short

public expect fun bcpWritefmtW(param0: MutPtr<CVoid>, param1: Pcwstr): Short

public expect fun dbprtypeA(param0: Int): Pstr

public expect fun dbprtypeW(param0: Int): Pwstr
