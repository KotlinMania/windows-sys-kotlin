package io.github.kotlinmania.windowssys.windows.win32.system.search

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public fun ODBCGetTryWaitValue(): UInt {
    return Win32DynamicFfi.invoke("odbc32.dll", "ODBCGetTryWaitValue", longArrayOf()).toUInt()
}

public fun ODBCSetTryWaitValue(dwvalue: UInt): BOOL {
    return Win32DynamicFfi.invoke("odbc32.dll", "ODBCSetTryWaitValue", longArrayOf(dwvalue.toLong())).toInt()
}

public fun SQLAllocConnect(environmenthandle: Long, connectionhandle: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLAllocConnect", longArrayOf(environmenthandle, connectionhandle)).toShort()
}

public fun SQLAllocEnv(environmenthandle: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLAllocEnv", longArrayOf(environmenthandle)).toShort()
}

public fun SQLAllocHandle(handletype: Short, inputhandle: Long, outputhandle: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLAllocHandle", longArrayOf(handletype.toLong(), inputhandle, outputhandle)).toShort()
}

public fun SQLAllocHandleStd(fhandletype: Short, hinput: Long, phoutput: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLAllocHandleStd", longArrayOf(fhandletype.toLong(), hinput, phoutput)).toShort()
}

public fun SQLAllocStmt(connectionhandle: Long, statementhandle: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLAllocStmt", longArrayOf(connectionhandle, statementhandle)).toShort()
}

public fun SQLBindCol(statementhandle: Long, columnnumber: UShort, targettype: Short, targetvalue: Long, bufferlength: Long, strlen_or_ind: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLBindCol", longArrayOf(statementhandle, columnnumber.toLong(), targettype.toLong(), targetvalue, bufferlength, strlen_or_ind)).toShort()
}

public fun SQLBindParam(statementhandle: Long, parameternumber: UShort, valuetype: Short, parametertype: Short, lengthprecision: ULong, parameterscale: Short, parametervalue: Long, strlen_or_ind: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLBindParam", longArrayOf(statementhandle, parameternumber.toLong(), valuetype.toLong(), parametertype.toLong(), lengthprecision.toLong(), parameterscale.toLong(), parametervalue, strlen_or_ind)).toShort()
}

public fun SQLBindParameter(hstmt: Long, ipar: UShort, fparamtype: Short, fctype: Short, fsqltype: Short, cbcoldef: ULong, ibscale: Short, rgbvalue: Long, cbvaluemax: Long, pcbvalue: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLBindParameter", longArrayOf(hstmt, ipar.toLong(), fparamtype.toLong(), fctype.toLong(), fsqltype.toLong(), cbcoldef.toLong(), ibscale.toLong(), rgbvalue, cbvaluemax, pcbvalue)).toShort()
}

public fun SQLBrowseConnect(hdbc: Long, szconnstrin: Long, cchconnstrin: Short, szconnstrout: Long, cchconnstroutmax: Short, pcchconnstrout: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLBrowseConnect", longArrayOf(hdbc, szconnstrin, cchconnstrin.toLong(), szconnstrout, cchconnstroutmax.toLong(), pcchconnstrout)).toShort()
}

public fun SQLBrowseConnectA(hdbc: Long, szconnstrin: Long, cbconnstrin: Short, szconnstrout: Long, cbconnstroutmax: Short, pcbconnstrout: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLBrowseConnectA", longArrayOf(hdbc, szconnstrin, cbconnstrin.toLong(), szconnstrout, cbconnstroutmax.toLong(), pcbconnstrout)).toShort()
}

public fun SQLBrowseConnectW(hdbc: Long, szconnstrin: Long, cchconnstrin: Short, szconnstrout: Long, cchconnstroutmax: Short, pcchconnstrout: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLBrowseConnectW", longArrayOf(hdbc, szconnstrin, cchconnstrin.toLong(), szconnstrout, cchconnstroutmax.toLong(), pcchconnstrout)).toShort()
}

public fun SQLBulkOperations(statementhandle: Long, operation: Short): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLBulkOperations", longArrayOf(statementhandle, operation.toLong())).toShort()
}

public fun SQLCancel(statementhandle: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLCancel", longArrayOf(statementhandle)).toShort()
}

public fun SQLCancelHandle(handletype: Short, inputhandle: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLCancelHandle", longArrayOf(handletype.toLong(), inputhandle)).toShort()
}

public fun SQLCloseCursor(statementhandle: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLCloseCursor", longArrayOf(statementhandle)).toShort()
}

public fun SQLCloseEnumServers(henumhandle: HANDLE): Short {
    return Win32DynamicFfi.invoke("odbcbcp.dll", "SQLCloseEnumServers", longArrayOf(henumhandle)).toShort()
}

public fun SQLColAttribute(statementhandle: Long, columnnumber: UShort, fieldidentifier: UShort, characterattribute: Long, bufferlength: Short, stringlength: Long, numericattribute: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLColAttribute", longArrayOf(statementhandle, columnnumber.toLong(), fieldidentifier.toLong(), characterattribute, bufferlength.toLong(), stringlength, numericattribute)).toShort()
}

public fun SQLColAttributeA(hstmt: Long, icol: Short, ifield: Short, pcharattr: Long, cbcharattrmax: Short, pcbcharattr: Long, pnumattr: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLColAttributeA", longArrayOf(hstmt, icol.toLong(), ifield.toLong(), pcharattr, cbcharattrmax.toLong(), pcbcharattr, pnumattr)).toShort()
}

public fun SQLColAttributeW(hstmt: Long, icol: UShort, ifield: UShort, pcharattr: Long, cbdescmax: Short, pcbcharattr: Long, pnumattr: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLColAttributeW", longArrayOf(hstmt, icol.toLong(), ifield.toLong(), pcharattr, cbdescmax.toLong(), pcbcharattr, pnumattr)).toShort()
}

public fun SQLColAttributes(hstmt: Long, icol: UShort, fdesctype: UShort, rgbdesc: Long, cbdescmax: Short, pcbdesc: Long, pfdesc: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLColAttributes", longArrayOf(hstmt, icol.toLong(), fdesctype.toLong(), rgbdesc, cbdescmax.toLong(), pcbdesc, pfdesc)).toShort()
}

public fun SQLColAttributesA(hstmt: Long, icol: UShort, fdesctype: UShort, rgbdesc: Long, cbdescmax: Short, pcbdesc: Long, pfdesc: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLColAttributesA", longArrayOf(hstmt, icol.toLong(), fdesctype.toLong(), rgbdesc, cbdescmax.toLong(), pcbdesc, pfdesc)).toShort()
}

public fun SQLColAttributesW(hstmt: Long, icol: UShort, fdesctype: UShort, rgbdesc: Long, cbdescmax: Short, pcbdesc: Long, pfdesc: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLColAttributesW", longArrayOf(hstmt, icol.toLong(), fdesctype.toLong(), rgbdesc, cbdescmax.toLong(), pcbdesc, pfdesc)).toShort()
}

public fun SQLColumnPrivileges(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short, szcolumnname: Long, cchcolumnname: Short): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLColumnPrivileges", longArrayOf(hstmt, szcatalogname, cchcatalogname.toLong(), szschemaname, cchschemaname.toLong(), sztablename, cchtablename.toLong(), szcolumnname, cchcolumnname.toLong())).toShort()
}

public fun SQLColumnPrivilegesA(hstmt: Long, szcatalogname: Long, cbcatalogname: Short, szschemaname: Long, cbschemaname: Short, sztablename: Long, cbtablename: Short, szcolumnname: Long, cbcolumnname: Short): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLColumnPrivilegesA", longArrayOf(hstmt, szcatalogname, cbcatalogname.toLong(), szschemaname, cbschemaname.toLong(), sztablename, cbtablename.toLong(), szcolumnname, cbcolumnname.toLong())).toShort()
}

public fun SQLColumnPrivilegesW(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short, szcolumnname: Long, cchcolumnname: Short): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLColumnPrivilegesW", longArrayOf(hstmt, szcatalogname, cchcatalogname.toLong(), szschemaname, cchschemaname.toLong(), sztablename, cchtablename.toLong(), szcolumnname, cchcolumnname.toLong())).toShort()
}

public fun SQLColumns(statementhandle: Long, catalogname: Long, namelength1: Short, schemaname: Long, namelength2: Short, tablename: Long, namelength3: Short, columnname: Long, namelength4: Short): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLColumns", longArrayOf(statementhandle, catalogname, namelength1.toLong(), schemaname, namelength2.toLong(), tablename, namelength3.toLong(), columnname, namelength4.toLong())).toShort()
}

public fun SQLColumnsA(hstmt: Long, szcatalogname: Long, cbcatalogname: Short, szschemaname: Long, cbschemaname: Short, sztablename: Long, cbtablename: Short, szcolumnname: Long, cbcolumnname: Short): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLColumnsA", longArrayOf(hstmt, szcatalogname, cbcatalogname.toLong(), szschemaname, cbschemaname.toLong(), sztablename, cbtablename.toLong(), szcolumnname, cbcolumnname.toLong())).toShort()
}

public fun SQLColumnsW(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short, szcolumnname: Long, cchcolumnname: Short): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLColumnsW", longArrayOf(hstmt, szcatalogname, cchcatalogname.toLong(), szschemaname, cchschemaname.toLong(), sztablename, cchtablename.toLong(), szcolumnname, cchcolumnname.toLong())).toShort()
}

public fun SQLCompleteAsync(handletype: Short, handle: Long, asyncretcodeptr: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLCompleteAsync", longArrayOf(handletype.toLong(), handle, asyncretcodeptr)).toShort()
}

public fun SQLConnect(connectionhandle: Long, servername: Long, namelength1: Short, username: Long, namelength2: Short, authentication: Long, namelength3: Short): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLConnect", longArrayOf(connectionhandle, servername, namelength1.toLong(), username, namelength2.toLong(), authentication, namelength3.toLong())).toShort()
}

public fun SQLConnectA(hdbc: Long, szdsn: Long, cbdsn: Short, szuid: Long, cbuid: Short, szauthstr: Long, cbauthstr: Short): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLConnectA", longArrayOf(hdbc, szdsn, cbdsn.toLong(), szuid, cbuid.toLong(), szauthstr, cbauthstr.toLong())).toShort()
}

public fun SQLConnectW(hdbc: Long, szdsn: Long, cchdsn: Short, szuid: Long, cchuid: Short, szauthstr: Long, cchauthstr: Short): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLConnectW", longArrayOf(hdbc, szdsn, cchdsn.toLong(), szuid, cchuid.toLong(), szauthstr, cchauthstr.toLong())).toShort()
}

public fun SQLCopyDesc(sourcedeschandle: Long, targetdeschandle: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLCopyDesc", longArrayOf(sourcedeschandle, targetdeschandle)).toShort()
}

public fun SQLDataSources(environmenthandle: Long, direction: UShort, servername: Long, bufferlength1: Short, namelength1ptr: Long, description: Long, bufferlength2: Short, namelength2ptr: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLDataSources", longArrayOf(environmenthandle, direction.toLong(), servername, bufferlength1.toLong(), namelength1ptr, description, bufferlength2.toLong(), namelength2ptr)).toShort()
}

public fun SQLDataSourcesA(henv: Long, fdirection: UShort, szdsn: Long, cbdsnmax: Short, pcbdsn: Long, szdescription: Long, cbdescriptionmax: Short, pcbdescription: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLDataSourcesA", longArrayOf(henv, fdirection.toLong(), szdsn, cbdsnmax.toLong(), pcbdsn, szdescription, cbdescriptionmax.toLong(), pcbdescription)).toShort()
}

public fun SQLDataSourcesW(henv: Long, fdirection: UShort, szdsn: Long, cchdsnmax: Short, pcchdsn: Long, wszdescription: Long, cchdescriptionmax: Short, pcchdescription: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLDataSourcesW", longArrayOf(henv, fdirection.toLong(), szdsn, cchdsnmax.toLong(), pcchdsn, wszdescription, cchdescriptionmax.toLong(), pcchdescription)).toShort()
}

public fun SQLDescribeCol(statementhandle: Long, columnnumber: UShort, columnname: Long, bufferlength: Short, namelength: Long, datatype: Long, columnsize: Long, decimaldigits: Long, nullable: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLDescribeCol", longArrayOf(statementhandle, columnnumber.toLong(), columnname, bufferlength.toLong(), namelength, datatype, columnsize, decimaldigits, nullable)).toShort()
}

public fun SQLDescribeColA(hstmt: Long, icol: UShort, szcolname: Long, cbcolnamemax: Short, pcbcolname: Long, pfsqltype: Long, pcbcoldef: Long, pibscale: Long, pfnullable: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLDescribeColA", longArrayOf(hstmt, icol.toLong(), szcolname, cbcolnamemax.toLong(), pcbcolname, pfsqltype, pcbcoldef, pibscale, pfnullable)).toShort()
}

public fun SQLDescribeColW(hstmt: Long, icol: UShort, szcolname: Long, cchcolnamemax: Short, pcchcolname: Long, pfsqltype: Long, pcbcoldef: Long, pibscale: Long, pfnullable: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLDescribeColW", longArrayOf(hstmt, icol.toLong(), szcolname, cchcolnamemax.toLong(), pcchcolname, pfsqltype, pcbcoldef, pibscale, pfnullable)).toShort()
}

public fun SQLDescribeParam(hstmt: Long, ipar: UShort, pfsqltype: Long, pcbparamdef: Long, pibscale: Long, pfnullable: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLDescribeParam", longArrayOf(hstmt, ipar.toLong(), pfsqltype, pcbparamdef, pibscale, pfnullable)).toShort()
}

public fun SQLDisconnect(connectionhandle: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLDisconnect", longArrayOf(connectionhandle)).toShort()
}

public fun SQLDriverConnect(hdbc: Long, hwnd: Long, szconnstrin: Long, cchconnstrin: Short, szconnstrout: Long, cchconnstroutmax: Short, pcchconnstrout: Long, fdrivercompletion: UShort): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLDriverConnect", longArrayOf(hdbc, hwnd, szconnstrin, cchconnstrin.toLong(), szconnstrout, cchconnstroutmax.toLong(), pcchconnstrout, fdrivercompletion.toLong())).toShort()
}

public fun SQLDriverConnectA(hdbc: Long, hwnd: Long, szconnstrin: Long, cbconnstrin: Short, szconnstrout: Long, cbconnstroutmax: Short, pcbconnstrout: Long, fdrivercompletion: UShort): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLDriverConnectA", longArrayOf(hdbc, hwnd, szconnstrin, cbconnstrin.toLong(), szconnstrout, cbconnstroutmax.toLong(), pcbconnstrout, fdrivercompletion.toLong())).toShort()
}

public fun SQLDriverConnectW(hdbc: Long, hwnd: Long, szconnstrin: Long, cchconnstrin: Short, szconnstrout: Long, cchconnstroutmax: Short, pcchconnstrout: Long, fdrivercompletion: UShort): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLDriverConnectW", longArrayOf(hdbc, hwnd, szconnstrin, cchconnstrin.toLong(), szconnstrout, cchconnstroutmax.toLong(), pcchconnstrout, fdrivercompletion.toLong())).toShort()
}

public fun SQLDrivers(henv: Long, fdirection: UShort, szdriverdesc: Long, cchdriverdescmax: Short, pcchdriverdesc: Long, szdriverattributes: Long, cchdrvrattrmax: Short, pcchdrvrattr: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLDrivers", longArrayOf(henv, fdirection.toLong(), szdriverdesc, cchdriverdescmax.toLong(), pcchdriverdesc, szdriverattributes, cchdrvrattrmax.toLong(), pcchdrvrattr)).toShort()
}

public fun SQLDriversA(henv: Long, fdirection: UShort, szdriverdesc: Long, cbdriverdescmax: Short, pcbdriverdesc: Long, szdriverattributes: Long, cbdrvrattrmax: Short, pcbdrvrattr: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLDriversA", longArrayOf(henv, fdirection.toLong(), szdriverdesc, cbdriverdescmax.toLong(), pcbdriverdesc, szdriverattributes, cbdrvrattrmax.toLong(), pcbdrvrattr)).toShort()
}

public fun SQLDriversW(henv: Long, fdirection: UShort, szdriverdesc: Long, cchdriverdescmax: Short, pcchdriverdesc: Long, szdriverattributes: Long, cchdrvrattrmax: Short, pcchdrvrattr: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLDriversW", longArrayOf(henv, fdirection.toLong(), szdriverdesc, cchdriverdescmax.toLong(), pcchdriverdesc, szdriverattributes, cchdrvrattrmax.toLong(), pcchdrvrattr)).toShort()
}

public fun SQLEndTran(handletype: Short, handle: Long, completiontype: Short): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLEndTran", longArrayOf(handletype.toLong(), handle, completiontype.toLong())).toShort()
}

public fun SQLError(environmenthandle: Long, connectionhandle: Long, statementhandle: Long, sqlstate: Long, nativeerror: Long, messagetext: Long, bufferlength: Short, textlength: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLError", longArrayOf(environmenthandle, connectionhandle, statementhandle, sqlstate, nativeerror, messagetext, bufferlength.toLong(), textlength)).toShort()
}

public fun SQLErrorA(henv: Long, hdbc: Long, hstmt: Long, szsqlstate: Long, pfnativeerror: Long, szerrormsg: Long, cberrormsgmax: Short, pcberrormsg: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLErrorA", longArrayOf(henv, hdbc, hstmt, szsqlstate, pfnativeerror, szerrormsg, cberrormsgmax.toLong(), pcberrormsg)).toShort()
}

public fun SQLErrorW(henv: Long, hdbc: Long, hstmt: Long, wszsqlstate: Long, pfnativeerror: Long, wszerrormsg: Long, ccherrormsgmax: Short, pccherrormsg: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLErrorW", longArrayOf(henv, hdbc, hstmt, wszsqlstate, pfnativeerror, wszerrormsg, ccherrormsgmax.toLong(), pccherrormsg)).toShort()
}

public fun SQLExecDirect(statementhandle: Long, statementtext: Long, textlength: Int): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLExecDirect", longArrayOf(statementhandle, statementtext, textlength.toLong())).toShort()
}

public fun SQLExecDirectA(hstmt: Long, szsqlstr: Long, cbsqlstr: Int): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLExecDirectA", longArrayOf(hstmt, szsqlstr, cbsqlstr.toLong())).toShort()
}

public fun SQLExecDirectW(hstmt: Long, szsqlstr: Long, textlength: Int): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLExecDirectW", longArrayOf(hstmt, szsqlstr, textlength.toLong())).toShort()
}

public fun SQLExecute(statementhandle: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLExecute", longArrayOf(statementhandle)).toShort()
}

public fun SQLExtendedFetch(hstmt: Long, ffetchtype: UShort, irow: Long, pcrow: Long, rgfrowstatus: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLExtendedFetch", longArrayOf(hstmt, ffetchtype.toLong(), irow, pcrow, rgfrowstatus)).toShort()
}

public fun SQLFetch(statementhandle: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLFetch", longArrayOf(statementhandle)).toShort()
}

public fun SQLFetchScroll(statementhandle: Long, fetchorientation: Short, fetchoffset: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLFetchScroll", longArrayOf(statementhandle, fetchorientation.toLong(), fetchoffset)).toShort()
}

public fun SQLForeignKeys(hstmt: Long, szpkcatalogname: Long, cchpkcatalogname: Short, szpkschemaname: Long, cchpkschemaname: Short, szpktablename: Long, cchpktablename: Short, szfkcatalogname: Long, cchfkcatalogname: Short, szfkschemaname: Long, cchfkschemaname: Short, szfktablename: Long, cchfktablename: Short): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLForeignKeys", longArrayOf(hstmt, szpkcatalogname, cchpkcatalogname.toLong(), szpkschemaname, cchpkschemaname.toLong(), szpktablename, cchpktablename.toLong(), szfkcatalogname, cchfkcatalogname.toLong(), szfkschemaname, cchfkschemaname.toLong(), szfktablename, cchfktablename.toLong())).toShort()
}

public fun SQLForeignKeysA(hstmt: Long, szpkcatalogname: Long, cbpkcatalogname: Short, szpkschemaname: Long, cbpkschemaname: Short, szpktablename: Long, cbpktablename: Short, szfkcatalogname: Long, cbfkcatalogname: Short, szfkschemaname: Long, cbfkschemaname: Short, szfktablename: Long, cbfktablename: Short): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLForeignKeysA", longArrayOf(hstmt, szpkcatalogname, cbpkcatalogname.toLong(), szpkschemaname, cbpkschemaname.toLong(), szpktablename, cbpktablename.toLong(), szfkcatalogname, cbfkcatalogname.toLong(), szfkschemaname, cbfkschemaname.toLong(), szfktablename, cbfktablename.toLong())).toShort()
}

public fun SQLForeignKeysW(hstmt: Long, szpkcatalogname: Long, cchpkcatalogname: Short, szpkschemaname: Long, cchpkschemaname: Short, szpktablename: Long, cchpktablename: Short, szfkcatalogname: Long, cchfkcatalogname: Short, szfkschemaname: Long, cchfkschemaname: Short, szfktablename: Long, cchfktablename: Short): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLForeignKeysW", longArrayOf(hstmt, szpkcatalogname, cchpkcatalogname.toLong(), szpkschemaname, cchpkschemaname.toLong(), szpktablename, cchpktablename.toLong(), szfkcatalogname, cchfkcatalogname.toLong(), szfkschemaname, cchfkschemaname.toLong(), szfktablename, cchfktablename.toLong())).toShort()
}

public fun SQLFreeConnect(connectionhandle: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLFreeConnect", longArrayOf(connectionhandle)).toShort()
}

public fun SQLFreeEnv(environmenthandle: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLFreeEnv", longArrayOf(environmenthandle)).toShort()
}

public fun SQLFreeHandle(handletype: Short, handle: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLFreeHandle", longArrayOf(handletype.toLong(), handle)).toShort()
}

public fun SQLFreeStmt(statementhandle: Long, option: UShort): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLFreeStmt", longArrayOf(statementhandle, option.toLong())).toShort()
}

public fun SQLGetConnectAttr(connectionhandle: Long, attribute: Int, value: Long, bufferlength: Int, stringlengthptr: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLGetConnectAttr", longArrayOf(connectionhandle, attribute.toLong(), value, bufferlength.toLong(), stringlengthptr)).toShort()
}

public fun SQLGetConnectAttrA(hdbc: Long, fattribute: Int, rgbvalue: Long, cbvaluemax: Int, pcbvalue: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLGetConnectAttrA", longArrayOf(hdbc, fattribute.toLong(), rgbvalue, cbvaluemax.toLong(), pcbvalue)).toShort()
}

public fun SQLGetConnectAttrW(hdbc: Long, fattribute: Int, rgbvalue: Long, cbvaluemax: Int, pcbvalue: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLGetConnectAttrW", longArrayOf(hdbc, fattribute.toLong(), rgbvalue, cbvaluemax.toLong(), pcbvalue)).toShort()
}

public fun SQLGetConnectOption(connectionhandle: Long, option: UShort, value: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLGetConnectOption", longArrayOf(connectionhandle, option.toLong(), value)).toShort()
}

public fun SQLGetConnectOptionA(hdbc: Long, foption: UShort, pvparam: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLGetConnectOptionA", longArrayOf(hdbc, foption.toLong(), pvparam)).toShort()
}

public fun SQLGetConnectOptionW(hdbc: Long, foption: UShort, pvparam: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLGetConnectOptionW", longArrayOf(hdbc, foption.toLong(), pvparam)).toShort()
}

public fun SQLGetCursorName(statementhandle: Long, cursorname: Long, bufferlength: Short, namelengthptr: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLGetCursorName", longArrayOf(statementhandle, cursorname, bufferlength.toLong(), namelengthptr)).toShort()
}

public fun SQLGetCursorNameA(hstmt: Long, szcursor: Long, cbcursormax: Short, pcbcursor: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLGetCursorNameA", longArrayOf(hstmt, szcursor, cbcursormax.toLong(), pcbcursor)).toShort()
}

public fun SQLGetCursorNameW(hstmt: Long, szcursor: Long, cchcursormax: Short, pcchcursor: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLGetCursorNameW", longArrayOf(hstmt, szcursor, cchcursormax.toLong(), pcchcursor)).toShort()
}

public fun SQLGetData(statementhandle: Long, columnnumber: UShort, targettype: Short, targetvalue: Long, bufferlength: Long, strlen_or_indptr: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLGetData", longArrayOf(statementhandle, columnnumber.toLong(), targettype.toLong(), targetvalue, bufferlength, strlen_or_indptr)).toShort()
}

public fun SQLGetDescField(descriptorhandle: Long, recnumber: Short, fieldidentifier: Short, value: Long, bufferlength: Int, stringlength: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLGetDescField", longArrayOf(descriptorhandle, recnumber.toLong(), fieldidentifier.toLong(), value, bufferlength.toLong(), stringlength)).toShort()
}

public fun SQLGetDescFieldA(hdesc: Long, irecord: Short, ifield: Short, rgbvalue: Long, cbbufferlength: Int, stringlength: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLGetDescFieldA", longArrayOf(hdesc, irecord.toLong(), ifield.toLong(), rgbvalue, cbbufferlength.toLong(), stringlength)).toShort()
}

public fun SQLGetDescFieldW(hdesc: Long, irecord: Short, ifield: Short, rgbvalue: Long, cbbufferlength: Int, stringlength: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLGetDescFieldW", longArrayOf(hdesc, irecord.toLong(), ifield.toLong(), rgbvalue, cbbufferlength.toLong(), stringlength)).toShort()
}

public fun SQLGetDescRec(descriptorhandle: Long, recnumber: Short, name: Long, bufferlength: Short, stringlengthptr: Long, typeptr: Long, subtypeptr: Long, lengthptr: Long, precisionptr: Long, scaleptr: Long, nullableptr: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLGetDescRec", longArrayOf(descriptorhandle, recnumber.toLong(), name, bufferlength.toLong(), stringlengthptr, typeptr, subtypeptr, lengthptr, precisionptr, scaleptr, nullableptr)).toShort()
}

public fun SQLGetDescRecA(hdesc: Long, irecord: Short, szname: Long, cbnamemax: Short, pcbname: Long, pftype: Long, pfsubtype: Long, plength: Long, pprecision: Long, pscale: Long, pnullable: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLGetDescRecA", longArrayOf(hdesc, irecord.toLong(), szname, cbnamemax.toLong(), pcbname, pftype, pfsubtype, plength, pprecision, pscale, pnullable)).toShort()
}

public fun SQLGetDescRecW(hdesc: Long, irecord: Short, szname: Long, cchnamemax: Short, pcchname: Long, pftype: Long, pfsubtype: Long, plength: Long, pprecision: Long, pscale: Long, pnullable: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLGetDescRecW", longArrayOf(hdesc, irecord.toLong(), szname, cchnamemax.toLong(), pcchname, pftype, pfsubtype, plength, pprecision, pscale, pnullable)).toShort()
}

public fun SQLGetDiagField(handletype: Short, handle: Long, recnumber: Short, diagidentifier: Short, diaginfo: Long, bufferlength: Short, stringlength: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLGetDiagField", longArrayOf(handletype.toLong(), handle, recnumber.toLong(), diagidentifier.toLong(), diaginfo, bufferlength.toLong(), stringlength)).toShort()
}

public fun SQLGetDiagFieldA(fhandletype: Short, handle: Long, irecord: Short, fdiagfield: Short, rgbdiaginfo: Long, cbdiaginfomax: Short, pcbdiaginfo: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLGetDiagFieldA", longArrayOf(fhandletype.toLong(), handle, irecord.toLong(), fdiagfield.toLong(), rgbdiaginfo, cbdiaginfomax.toLong(), pcbdiaginfo)).toShort()
}

public fun SQLGetDiagFieldW(fhandletype: Short, handle: Long, irecord: Short, fdiagfield: Short, rgbdiaginfo: Long, cbbufferlength: Short, pcbstringlength: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLGetDiagFieldW", longArrayOf(fhandletype.toLong(), handle, irecord.toLong(), fdiagfield.toLong(), rgbdiaginfo, cbbufferlength.toLong(), pcbstringlength)).toShort()
}

public fun SQLGetDiagRec(handletype: Short, handle: Long, recnumber: Short, sqlstate: Long, nativeerror: Long, messagetext: Long, bufferlength: Short, textlength: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLGetDiagRec", longArrayOf(handletype.toLong(), handle, recnumber.toLong(), sqlstate, nativeerror, messagetext, bufferlength.toLong(), textlength)).toShort()
}

public fun SQLGetDiagRecA(fhandletype: Short, handle: Long, irecord: Short, szsqlstate: Long, pfnativeerror: Long, szerrormsg: Long, cberrormsgmax: Short, pcberrormsg: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLGetDiagRecA", longArrayOf(fhandletype.toLong(), handle, irecord.toLong(), szsqlstate, pfnativeerror, szerrormsg, cberrormsgmax.toLong(), pcberrormsg)).toShort()
}

public fun SQLGetDiagRecW(fhandletype: Short, handle: Long, irecord: Short, szsqlstate: Long, pfnativeerror: Long, szerrormsg: Long, ccherrormsgmax: Short, pccherrormsg: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLGetDiagRecW", longArrayOf(fhandletype.toLong(), handle, irecord.toLong(), szsqlstate, pfnativeerror, szerrormsg, ccherrormsgmax.toLong(), pccherrormsg)).toShort()
}

public fun SQLGetEnvAttr(environmenthandle: Long, attribute: Int, value: Long, bufferlength: Int, stringlength: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLGetEnvAttr", longArrayOf(environmenthandle, attribute.toLong(), value, bufferlength.toLong(), stringlength)).toShort()
}

public fun SQLGetFunctions(connectionhandle: Long, functionid: UShort, supported: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLGetFunctions", longArrayOf(connectionhandle, functionid.toLong(), supported)).toShort()
}

public fun SQLGetInfo(connectionhandle: Long, infotype: UShort, infovalue: Long, bufferlength: Short, stringlengthptr: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLGetInfo", longArrayOf(connectionhandle, infotype.toLong(), infovalue, bufferlength.toLong(), stringlengthptr)).toShort()
}

public fun SQLGetInfoA(hdbc: Long, finfotype: UShort, rgbinfovalue: Long, cbinfovaluemax: Short, pcbinfovalue: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLGetInfoA", longArrayOf(hdbc, finfotype.toLong(), rgbinfovalue, cbinfovaluemax.toLong(), pcbinfovalue)).toShort()
}

public fun SQLGetInfoW(hdbc: Long, finfotype: UShort, rgbinfovalue: Long, cbinfovaluemax: Short, pcbinfovalue: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLGetInfoW", longArrayOf(hdbc, finfotype.toLong(), rgbinfovalue, cbinfovaluemax.toLong(), pcbinfovalue)).toShort()
}

public fun SQLGetNextEnumeration(henumhandle: HANDLE, prgenumdata: Long, pienumlength: Long): Short {
    return Win32DynamicFfi.invoke("odbcbcp.dll", "SQLGetNextEnumeration", longArrayOf(henumhandle, prgenumdata, pienumlength)).toShort()
}

public fun SQLGetStmtAttr(statementhandle: Long, attribute: Int, value: Long, bufferlength: Int, stringlength: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLGetStmtAttr", longArrayOf(statementhandle, attribute.toLong(), value, bufferlength.toLong(), stringlength)).toShort()
}

public fun SQLGetStmtAttrA(hstmt: Long, fattribute: Int, rgbvalue: Long, cbvaluemax: Int, pcbvalue: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLGetStmtAttrA", longArrayOf(hstmt, fattribute.toLong(), rgbvalue, cbvaluemax.toLong(), pcbvalue)).toShort()
}

public fun SQLGetStmtAttrW(hstmt: Long, fattribute: Int, rgbvalue: Long, cbvaluemax: Int, pcbvalue: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLGetStmtAttrW", longArrayOf(hstmt, fattribute.toLong(), rgbvalue, cbvaluemax.toLong(), pcbvalue)).toShort()
}

public fun SQLGetStmtOption(statementhandle: Long, option: UShort, value: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLGetStmtOption", longArrayOf(statementhandle, option.toLong(), value)).toShort()
}

public fun SQLGetTypeInfo(statementhandle: Long, datatype: Short): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLGetTypeInfo", longArrayOf(statementhandle, datatype.toLong())).toShort()
}

public fun SQLGetTypeInfoA(statementhandle: Long, datatype: Short): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLGetTypeInfoA", longArrayOf(statementhandle, datatype.toLong())).toShort()
}

public fun SQLGetTypeInfoW(statementhandle: Long, datatype: Short): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLGetTypeInfoW", longArrayOf(statementhandle, datatype.toLong())).toShort()
}

public fun SQLInitEnumServers(pwchservername: PCWSTR, pwchinstancename: PCWSTR): HANDLE {
    return Win32DynamicFfi.invoke("odbcbcp.dll", "SQLInitEnumServers", longArrayOf(pwchservername, pwchinstancename))
}

public fun SQLLinkedCatalogsA(param0: Long, param1: PCSTR, param2: Short): Short {
    return Win32DynamicFfi.invoke("odbcbcp.dll", "SQLLinkedCatalogsA", longArrayOf(param0, param1, param2.toLong())).toShort()
}

public fun SQLLinkedCatalogsW(param0: Long, param1: PCWSTR, param2: Short): Short {
    return Win32DynamicFfi.invoke("odbcbcp.dll", "SQLLinkedCatalogsW", longArrayOf(param0, param1, param2.toLong())).toShort()
}

public fun SQLLinkedServers(param0: Long): Short {
    return Win32DynamicFfi.invoke("odbcbcp.dll", "SQLLinkedServers", longArrayOf(param0)).toShort()
}

public fun SQLMoreResults(hstmt: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLMoreResults", longArrayOf(hstmt)).toShort()
}

public fun SQLNativeSql(hdbc: Long, szsqlstrin: Long, cchsqlstrin: Int, szsqlstr: Long, cchsqlstrmax: Int, pcbsqlstr: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLNativeSql", longArrayOf(hdbc, szsqlstrin, cchsqlstrin.toLong(), szsqlstr, cchsqlstrmax.toLong(), pcbsqlstr)).toShort()
}

public fun SQLNativeSqlA(hdbc: Long, szsqlstrin: Long, cbsqlstrin: Int, szsqlstr: Long, cbsqlstrmax: Int, pcbsqlstr: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLNativeSqlA", longArrayOf(hdbc, szsqlstrin, cbsqlstrin.toLong(), szsqlstr, cbsqlstrmax.toLong(), pcbsqlstr)).toShort()
}

public fun SQLNativeSqlW(hdbc: Long, szsqlstrin: Long, cchsqlstrin: Int, szsqlstr: Long, cchsqlstrmax: Int, pcchsqlstr: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLNativeSqlW", longArrayOf(hdbc, szsqlstrin, cchsqlstrin.toLong(), szsqlstr, cchsqlstrmax.toLong(), pcchsqlstr)).toShort()
}

public fun SQLNumParams(hstmt: Long, pcpar: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLNumParams", longArrayOf(hstmt, pcpar)).toShort()
}

public fun SQLNumResultCols(statementhandle: Long, columncount: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLNumResultCols", longArrayOf(statementhandle, columncount)).toShort()
}

public fun SQLParamData(statementhandle: Long, value: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLParamData", longArrayOf(statementhandle, value)).toShort()
}

public fun SQLParamOptions(hstmt: Long, crow: ULong, pirow: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLParamOptions", longArrayOf(hstmt, crow.toLong(), pirow)).toShort()
}

public fun SQLPrepare(statementhandle: Long, statementtext: Long, textlength: Int): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLPrepare", longArrayOf(statementhandle, statementtext, textlength.toLong())).toShort()
}

public fun SQLPrepareA(hstmt: Long, szsqlstr: Long, cbsqlstr: Int): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLPrepareA", longArrayOf(hstmt, szsqlstr, cbsqlstr.toLong())).toShort()
}

public fun SQLPrepareW(hstmt: Long, szsqlstr: Long, cchsqlstr: Int): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLPrepareW", longArrayOf(hstmt, szsqlstr, cchsqlstr.toLong())).toShort()
}

public fun SQLPrimaryKeys(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLPrimaryKeys", longArrayOf(hstmt, szcatalogname, cchcatalogname.toLong(), szschemaname, cchschemaname.toLong(), sztablename, cchtablename.toLong())).toShort()
}

public fun SQLPrimaryKeysA(hstmt: Long, szcatalogname: Long, cbcatalogname: Short, szschemaname: Long, cbschemaname: Short, sztablename: Long, cbtablename: Short): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLPrimaryKeysA", longArrayOf(hstmt, szcatalogname, cbcatalogname.toLong(), szschemaname, cbschemaname.toLong(), sztablename, cbtablename.toLong())).toShort()
}

public fun SQLPrimaryKeysW(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLPrimaryKeysW", longArrayOf(hstmt, szcatalogname, cchcatalogname.toLong(), szschemaname, cchschemaname.toLong(), sztablename, cchtablename.toLong())).toShort()
}

public fun SQLProcedureColumns(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, szprocname: Long, cchprocname: Short, szcolumnname: Long, cchcolumnname: Short): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLProcedureColumns", longArrayOf(hstmt, szcatalogname, cchcatalogname.toLong(), szschemaname, cchschemaname.toLong(), szprocname, cchprocname.toLong(), szcolumnname, cchcolumnname.toLong())).toShort()
}

public fun SQLProcedureColumnsA(hstmt: Long, szcatalogname: Long, cbcatalogname: Short, szschemaname: Long, cbschemaname: Short, szprocname: Long, cbprocname: Short, szcolumnname: Long, cbcolumnname: Short): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLProcedureColumnsA", longArrayOf(hstmt, szcatalogname, cbcatalogname.toLong(), szschemaname, cbschemaname.toLong(), szprocname, cbprocname.toLong(), szcolumnname, cbcolumnname.toLong())).toShort()
}

public fun SQLProcedureColumnsW(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, szprocname: Long, cchprocname: Short, szcolumnname: Long, cchcolumnname: Short): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLProcedureColumnsW", longArrayOf(hstmt, szcatalogname, cchcatalogname.toLong(), szschemaname, cchschemaname.toLong(), szprocname, cchprocname.toLong(), szcolumnname, cchcolumnname.toLong())).toShort()
}

public fun SQLProcedures(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, szprocname: Long, cchprocname: Short): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLProcedures", longArrayOf(hstmt, szcatalogname, cchcatalogname.toLong(), szschemaname, cchschemaname.toLong(), szprocname, cchprocname.toLong())).toShort()
}

public fun SQLProceduresA(hstmt: Long, szcatalogname: Long, cbcatalogname: Short, szschemaname: Long, cbschemaname: Short, szprocname: Long, cbprocname: Short): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLProceduresA", longArrayOf(hstmt, szcatalogname, cbcatalogname.toLong(), szschemaname, cbschemaname.toLong(), szprocname, cbprocname.toLong())).toShort()
}

public fun SQLProceduresW(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, szprocname: Long, cchprocname: Short): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLProceduresW", longArrayOf(hstmt, szcatalogname, cchcatalogname.toLong(), szschemaname, cchschemaname.toLong(), szprocname, cchprocname.toLong())).toShort()
}

public fun SQLPutData(statementhandle: Long, data: Long, strlen_or_ind: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLPutData", longArrayOf(statementhandle, data, strlen_or_ind)).toShort()
}

public fun SQLRowCount(statementhandle: Long, rowcount: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLRowCount", longArrayOf(statementhandle, rowcount)).toShort()
}

public fun SQLSetConnectAttr(connectionhandle: Long, attribute: Int, value: Long, stringlength: Int): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLSetConnectAttr", longArrayOf(connectionhandle, attribute.toLong(), value, stringlength.toLong())).toShort()
}

public fun SQLSetConnectAttrA(hdbc: Long, fattribute: Int, rgbvalue: Long, cbvalue: Int): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLSetConnectAttrA", longArrayOf(hdbc, fattribute.toLong(), rgbvalue, cbvalue.toLong())).toShort()
}

public fun SQLSetConnectAttrW(hdbc: Long, fattribute: Int, rgbvalue: Long, cbvalue: Int): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLSetConnectAttrW", longArrayOf(hdbc, fattribute.toLong(), rgbvalue, cbvalue.toLong())).toShort()
}

public fun SQLSetConnectOption(connectionhandle: Long, option: UShort, value: ULong): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLSetConnectOption", longArrayOf(connectionhandle, option.toLong(), value.toLong())).toShort()
}

public fun SQLSetConnectOptionA(hdbc: Long, foption: UShort, vparam: ULong): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLSetConnectOptionA", longArrayOf(hdbc, foption.toLong(), vparam.toLong())).toShort()
}

public fun SQLSetConnectOptionW(hdbc: Long, foption: UShort, vparam: ULong): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLSetConnectOptionW", longArrayOf(hdbc, foption.toLong(), vparam.toLong())).toShort()
}

public fun SQLSetCursorName(statementhandle: Long, cursorname: Long, namelength: Short): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLSetCursorName", longArrayOf(statementhandle, cursorname, namelength.toLong())).toShort()
}

public fun SQLSetCursorNameA(hstmt: Long, szcursor: Long, cbcursor: Short): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLSetCursorNameA", longArrayOf(hstmt, szcursor, cbcursor.toLong())).toShort()
}

public fun SQLSetCursorNameW(hstmt: Long, szcursor: Long, cchcursor: Short): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLSetCursorNameW", longArrayOf(hstmt, szcursor, cchcursor.toLong())).toShort()
}

public fun SQLSetDescField(descriptorhandle: Long, recnumber: Short, fieldidentifier: Short, value: Long, bufferlength: Int): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLSetDescField", longArrayOf(descriptorhandle, recnumber.toLong(), fieldidentifier.toLong(), value, bufferlength.toLong())).toShort()
}

public fun SQLSetDescFieldW(descriptorhandle: Long, recnumber: Short, fieldidentifier: Short, value: Long, bufferlength: Int): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLSetDescFieldW", longArrayOf(descriptorhandle, recnumber.toLong(), fieldidentifier.toLong(), value, bufferlength.toLong())).toShort()
}

public fun SQLSetDescRec(descriptorhandle: Long, recnumber: Short, type: Short, subtype: Short, length: Long, precision: Short, scale: Short, data: Long, stringlength: Long, indicator: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLSetDescRec", longArrayOf(descriptorhandle, recnumber.toLong(), type.toLong(), subtype.toLong(), length, precision.toLong(), scale.toLong(), data, stringlength, indicator)).toShort()
}

public fun SQLSetEnvAttr(environmenthandle: Long, attribute: Int, value: Long, stringlength: Int): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLSetEnvAttr", longArrayOf(environmenthandle, attribute.toLong(), value, stringlength.toLong())).toShort()
}

public fun SQLSetParam(statementhandle: Long, parameternumber: UShort, valuetype: Short, parametertype: Short, lengthprecision: ULong, parameterscale: Short, parametervalue: Long, strlen_or_ind: Long): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLSetParam", longArrayOf(statementhandle, parameternumber.toLong(), valuetype.toLong(), parametertype.toLong(), lengthprecision.toLong(), parameterscale.toLong(), parametervalue, strlen_or_ind)).toShort()
}

public fun SQLSetPos(hstmt: Long, irow: ULong, foption: UShort, flock: UShort): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLSetPos", longArrayOf(hstmt, irow.toLong(), foption.toLong(), flock.toLong())).toShort()
}

public fun SQLSetScrollOptions(hstmt: Long, fconcurrency: UShort, crowkeyset: Long, crowrowset: UShort): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLSetScrollOptions", longArrayOf(hstmt, fconcurrency.toLong(), crowkeyset, crowrowset.toLong())).toShort()
}

public fun SQLSetStmtAttr(statementhandle: Long, attribute: Int, value: Long, stringlength: Int): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLSetStmtAttr", longArrayOf(statementhandle, attribute.toLong(), value, stringlength.toLong())).toShort()
}

public fun SQLSetStmtAttrW(hstmt: Long, fattribute: Int, rgbvalue: Long, cbvaluemax: Int): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLSetStmtAttrW", longArrayOf(hstmt, fattribute.toLong(), rgbvalue, cbvaluemax.toLong())).toShort()
}

public fun SQLSetStmtOption(statementhandle: Long, option: UShort, value: ULong): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLSetStmtOption", longArrayOf(statementhandle, option.toLong(), value.toLong())).toShort()
}

public fun SQLSpecialColumns(statementhandle: Long, identifiertype: UShort, catalogname: Long, namelength1: Short, schemaname: Long, namelength2: Short, tablename: Long, namelength3: Short, scope: UShort, nullable: UShort): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLSpecialColumns", longArrayOf(statementhandle, identifiertype.toLong(), catalogname, namelength1.toLong(), schemaname, namelength2.toLong(), tablename, namelength3.toLong(), scope.toLong(), nullable.toLong())).toShort()
}

public fun SQLSpecialColumnsA(hstmt: Long, fcoltype: UShort, szcatalogname: Long, cbcatalogname: Short, szschemaname: Long, cbschemaname: Short, sztablename: Long, cbtablename: Short, fscope: UShort, fnullable: UShort): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLSpecialColumnsA", longArrayOf(hstmt, fcoltype.toLong(), szcatalogname, cbcatalogname.toLong(), szschemaname, cbschemaname.toLong(), sztablename, cbtablename.toLong(), fscope.toLong(), fnullable.toLong())).toShort()
}

public fun SQLSpecialColumnsW(hstmt: Long, fcoltype: UShort, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short, fscope: UShort, fnullable: UShort): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLSpecialColumnsW", longArrayOf(hstmt, fcoltype.toLong(), szcatalogname, cchcatalogname.toLong(), szschemaname, cchschemaname.toLong(), sztablename, cchtablename.toLong(), fscope.toLong(), fnullable.toLong())).toShort()
}

public fun SQLStatistics(statementhandle: Long, catalogname: Long, namelength1: Short, schemaname: Long, namelength2: Short, tablename: Long, namelength3: Short, unique: UShort, reserved: UShort): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLStatistics", longArrayOf(statementhandle, catalogname, namelength1.toLong(), schemaname, namelength2.toLong(), tablename, namelength3.toLong(), unique.toLong(), reserved.toLong())).toShort()
}

public fun SQLStatisticsA(hstmt: Long, szcatalogname: Long, cbcatalogname: Short, szschemaname: Long, cbschemaname: Short, sztablename: Long, cbtablename: Short, funique: UShort, faccuracy: UShort): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLStatisticsA", longArrayOf(hstmt, szcatalogname, cbcatalogname.toLong(), szschemaname, cbschemaname.toLong(), sztablename, cbtablename.toLong(), funique.toLong(), faccuracy.toLong())).toShort()
}

public fun SQLStatisticsW(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short, funique: UShort, faccuracy: UShort): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLStatisticsW", longArrayOf(hstmt, szcatalogname, cchcatalogname.toLong(), szschemaname, cchschemaname.toLong(), sztablename, cchtablename.toLong(), funique.toLong(), faccuracy.toLong())).toShort()
}

public fun SQLTablePrivileges(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLTablePrivileges", longArrayOf(hstmt, szcatalogname, cchcatalogname.toLong(), szschemaname, cchschemaname.toLong(), sztablename, cchtablename.toLong())).toShort()
}

public fun SQLTablePrivilegesA(hstmt: Long, szcatalogname: Long, cbcatalogname: Short, szschemaname: Long, cbschemaname: Short, sztablename: Long, cbtablename: Short): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLTablePrivilegesA", longArrayOf(hstmt, szcatalogname, cbcatalogname.toLong(), szschemaname, cbschemaname.toLong(), sztablename, cbtablename.toLong())).toShort()
}

public fun SQLTablePrivilegesW(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLTablePrivilegesW", longArrayOf(hstmt, szcatalogname, cchcatalogname.toLong(), szschemaname, cchschemaname.toLong(), sztablename, cchtablename.toLong())).toShort()
}

public fun SQLTables(statementhandle: Long, catalogname: Long, namelength1: Short, schemaname: Long, namelength2: Short, tablename: Long, namelength3: Short, tabletype: Long, namelength4: Short): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLTables", longArrayOf(statementhandle, catalogname, namelength1.toLong(), schemaname, namelength2.toLong(), tablename, namelength3.toLong(), tabletype, namelength4.toLong())).toShort()
}

public fun SQLTablesA(hstmt: Long, szcatalogname: Long, cbcatalogname: Short, szschemaname: Long, cbschemaname: Short, sztablename: Long, cbtablename: Short, sztabletype: Long, cbtabletype: Short): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLTablesA", longArrayOf(hstmt, szcatalogname, cbcatalogname.toLong(), szschemaname, cbschemaname.toLong(), sztablename, cbtablename.toLong(), sztabletype, cbtabletype.toLong())).toShort()
}

public fun SQLTablesW(hstmt: Long, szcatalogname: Long, cchcatalogname: Short, szschemaname: Long, cchschemaname: Short, sztablename: Long, cchtablename: Short, sztabletype: Long, cchtabletype: Short): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLTablesW", longArrayOf(hstmt, szcatalogname, cchcatalogname.toLong(), szschemaname, cchschemaname.toLong(), sztablename, cchtablename.toLong(), sztabletype, cchtabletype.toLong())).toShort()
}

public fun SQLTransact(environmenthandle: Long, connectionhandle: Long, completiontype: UShort): Short {
    return Win32DynamicFfi.invoke("odbc32.dll", "SQLTransact", longArrayOf(environmenthandle, connectionhandle, completiontype.toLong())).toShort()
}

public fun bcp_batch(param0: Long): Int {
    return Win32DynamicFfi.invoke("odbcbcp.dll", "bcp_batch", longArrayOf(param0)).toInt()
}

public fun bcp_bind(param0: Long, param1: Long, param2: Int, param3: Int, param4: Long, param5: Int, param6: Int, param7: Int): Short {
    return Win32DynamicFfi.invoke("odbcbcp.dll", "bcp_bind", longArrayOf(param0, param1, param2.toLong(), param3.toLong(), param4, param5.toLong(), param6.toLong(), param7.toLong())).toShort()
}

public fun bcp_colfmt(param0: Long, param1: Int, param2: UByte, param3: Int, param4: Int, param5: Long, param6: Int, param7: Int): Short {
    return Win32DynamicFfi.invoke("odbcbcp.dll", "bcp_colfmt", longArrayOf(param0, param1.toLong(), param2.toLong(), param3.toLong(), param4.toLong(), param5, param6.toLong(), param7.toLong())).toShort()
}

public fun bcp_collen(param0: Long, param1: Int, param2: Int): Short {
    return Win32DynamicFfi.invoke("odbcbcp.dll", "bcp_collen", longArrayOf(param0, param1.toLong(), param2.toLong())).toShort()
}

public fun bcp_colptr(param0: Long, param1: Long, param2: Int): Short {
    return Win32DynamicFfi.invoke("odbcbcp.dll", "bcp_colptr", longArrayOf(param0, param1, param2.toLong())).toShort()
}

public fun bcp_columns(param0: Long, param1: Int): Short {
    return Win32DynamicFfi.invoke("odbcbcp.dll", "bcp_columns", longArrayOf(param0, param1.toLong())).toShort()
}

public fun bcp_control(param0: Long, param1: Int, param2: Long): Short {
    return Win32DynamicFfi.invoke("odbcbcp.dll", "bcp_control", longArrayOf(param0, param1.toLong(), param2)).toShort()
}

public fun bcp_done(param0: Long): Int {
    return Win32DynamicFfi.invoke("odbcbcp.dll", "bcp_done", longArrayOf(param0)).toInt()
}

public fun bcp_exec(param0: Long, param1: Long): Short {
    return Win32DynamicFfi.invoke("odbcbcp.dll", "bcp_exec", longArrayOf(param0, param1)).toShort()
}

public fun bcp_getcolfmt(param0: Long, param1: Int, param2: Int, param3: Long, param4: Int, param5: Long): Short {
    return Win32DynamicFfi.invoke("odbcbcp.dll", "bcp_getcolfmt", longArrayOf(param0, param1.toLong(), param2.toLong(), param3, param4.toLong(), param5)).toShort()
}

public fun bcp_initA(param0: Long, param1: PCSTR, param2: PCSTR, param3: PCSTR, param4: Int): Short {
    return Win32DynamicFfi.invoke("odbcbcp.dll", "bcp_initA", longArrayOf(param0, param1, param2, param3, param4.toLong())).toShort()
}

public fun bcp_initW(param0: Long, param1: PCWSTR, param2: PCWSTR, param3: PCWSTR, param4: Int): Short {
    return Win32DynamicFfi.invoke("odbcbcp.dll", "bcp_initW", longArrayOf(param0, param1, param2, param3, param4.toLong())).toShort()
}

public fun bcp_moretext(param0: Long, param1: Int, param2: Long): Short {
    return Win32DynamicFfi.invoke("odbcbcp.dll", "bcp_moretext", longArrayOf(param0, param1.toLong(), param2)).toShort()
}

public fun bcp_readfmtA(param0: Long, param1: PCSTR): Short {
    return Win32DynamicFfi.invoke("odbcbcp.dll", "bcp_readfmtA", longArrayOf(param0, param1)).toShort()
}

public fun bcp_readfmtW(param0: Long, param1: PCWSTR): Short {
    return Win32DynamicFfi.invoke("odbcbcp.dll", "bcp_readfmtW", longArrayOf(param0, param1)).toShort()
}

public fun bcp_sendrow(param0: Long): Short {
    return Win32DynamicFfi.invoke("odbcbcp.dll", "bcp_sendrow", longArrayOf(param0)).toShort()
}

public fun bcp_setcolfmt(param0: Long, param1: Int, param2: Int, param3: Long, param4: Int): Short {
    return Win32DynamicFfi.invoke("odbcbcp.dll", "bcp_setcolfmt", longArrayOf(param0, param1.toLong(), param2.toLong(), param3, param4.toLong())).toShort()
}

public fun bcp_writefmtA(param0: Long, param1: PCSTR): Short {
    return Win32DynamicFfi.invoke("odbcbcp.dll", "bcp_writefmtA", longArrayOf(param0, param1)).toShort()
}

public fun bcp_writefmtW(param0: Long, param1: PCWSTR): Short {
    return Win32DynamicFfi.invoke("odbcbcp.dll", "bcp_writefmtW", longArrayOf(param0, param1)).toShort()
}

public fun dbprtypeA(param0: Int): PSTR {
    return Win32DynamicFfi.invoke("odbcbcp.dll", "dbprtypeA", longArrayOf(param0.toLong()))
}

public fun dbprtypeW(param0: Int): PWSTR {
    return Win32DynamicFfi.invoke("odbcbcp.dll", "dbprtypeW", longArrayOf(param0.toLong()))
}
