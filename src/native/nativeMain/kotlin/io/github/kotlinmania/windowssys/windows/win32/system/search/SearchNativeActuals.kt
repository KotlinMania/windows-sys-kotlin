@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchBcpBatch
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchBcpBind
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchBcpColfmt
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchBcpCollen
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchBcpColptr
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchBcpColumns
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchBcpControl
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchBcpDone
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchBcpExec
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchBcpGetcolfmt
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchBcpInitA
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchBcpInitW
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchBcpMoretext
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchBcpReadfmtA
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchBcpReadfmtW
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchBcpSendrow
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchBcpSetcolfmt
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchBcpWritefmtA
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchBcpWritefmtW
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchDbprtypeA
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchDbprtypeW
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchODBCGetTryWaitValue
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchODBCSetTryWaitValue
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLAllocConnect
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLAllocEnv
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLAllocHandle
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLAllocHandleStd
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLAllocStmt
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLBindCol
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLBindParam
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLBindParameter
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLBrowseConnect
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLBrowseConnectA
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLBrowseConnectW
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLBulkOperations
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLCancel
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLCancelHandle
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLCloseCursor
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLCloseEnumServers
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLColAttribute
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLColAttributeA
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLColAttributeW
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLColAttributes
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLColAttributesA
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLColAttributesW
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLColumnPrivileges
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLColumnPrivilegesA
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLColumnPrivilegesW
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLColumns
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLColumnsA
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLColumnsW
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLCompleteAsync
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLConnect
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLConnectA
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLConnectW
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLCopyDesc
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLDataSources
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLDataSourcesA
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLDataSourcesW
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLDescribeCol
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLDescribeColA
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLDescribeColW
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLDescribeParam
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLDisconnect
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLDriverConnect
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLDriverConnectA
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLDriverConnectW
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLDrivers
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLDriversA
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLDriversW
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLEndTran
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLError
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLErrorA
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLErrorW
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLExecDirect
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLExecDirectA
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLExecDirectW
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLExecute
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLExtendedFetch
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLFetch
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLFetchScroll
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLForeignKeys
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLForeignKeysA
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLForeignKeysW
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLFreeConnect
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLFreeEnv
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLFreeHandle
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLFreeStmt
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLGetConnectAttr
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLGetConnectAttrA
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLGetConnectAttrW
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLGetConnectOption
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLGetConnectOptionA
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLGetConnectOptionW
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLGetCursorName
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLGetCursorNameA
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLGetCursorNameW
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLGetData
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLGetDescField
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLGetDescFieldA
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLGetDescFieldW
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLGetDescRec
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLGetDescRecA
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLGetDescRecW
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLGetDiagField
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLGetDiagFieldA
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLGetDiagFieldW
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLGetDiagRec
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLGetDiagRecA
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLGetDiagRecW
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLGetEnvAttr
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLGetFunctions
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLGetInfo
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLGetInfoA
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLGetInfoW
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLGetNextEnumeration
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLGetStmtAttr
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLGetStmtAttrA
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLGetStmtAttrW
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLGetStmtOption
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLGetTypeInfo
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLGetTypeInfoA
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLGetTypeInfoW
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLInitEnumServers
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLLinkedCatalogsA
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLLinkedCatalogsW
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLLinkedServers
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLMoreResults
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLNativeSql
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLNativeSqlA
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLNativeSqlW
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLNumParams
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLNumResultCols
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLParamData
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLParamOptions
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLPrepare
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLPrepareA
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLPrepareW
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLPrimaryKeys
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLPrimaryKeysA
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLPrimaryKeysW
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLProcedureColumns
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLProcedureColumnsA
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLProcedureColumnsW
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLProcedures
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLProceduresA
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLProceduresW
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLPutData
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLRowCount
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLSetConnectAttr
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLSetConnectAttrA
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLSetConnectAttrW
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLSetConnectOption
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLSetConnectOptionA
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLSetConnectOptionW
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLSetCursorName
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLSetCursorNameA
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLSetCursorNameW
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLSetDescField
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLSetDescFieldW
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLSetDescRec
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLSetEnvAttr
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLSetParam
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLSetPos
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLSetScrollOptions
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLSetStmtAttr
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLSetStmtAttrW
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLSetStmtOption
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLSpecialColumns
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLSpecialColumnsA
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLSpecialColumnsW
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLStatistics
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLStatisticsA
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLStatisticsW
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLTablePrivileges
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLTablePrivilegesA
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLTablePrivilegesW
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLTables
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLTablesA
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLTablesW
import io.github.kotlinmania.windowssys.windows.win32.system.search.cinterop.windowssysWindowsWin32SystemSearchSQLTransact
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun oDBCGetTryWaitValue(): UInt =
    windowssysWindowsWin32SystemSearchODBCGetTryWaitValue()

public actual fun oDBCSetTryWaitValue(dwvalue: UInt): Bool =
    windowssysWindowsWin32SystemSearchODBCSetTryWaitValue(dwvalue)

public actual fun sQLAllocConnect(environmenthandle: MutPtr<CVoid>, connectionhandle: MutPtr<MutPtr<CVoid>>): Short =
    windowssysWindowsWin32SystemSearchSQLAllocConnect(environmenthandle.rawAddress.toCPointer<ByteVar>(), connectionhandle.rawAddress.toCPointer<ByteVar>())

public actual fun sQLAllocEnv(environmenthandle: MutPtr<MutPtr<CVoid>>): Short =
    windowssysWindowsWin32SystemSearchSQLAllocEnv(environmenthandle.rawAddress.toCPointer<ByteVar>())

public actual fun sQLAllocHandle(handletype: Short, inputhandle: MutPtr<CVoid>, outputhandle: MutPtr<MutPtr<CVoid>>): Short =
    windowssysWindowsWin32SystemSearchSQLAllocHandle(handletype, inputhandle.rawAddress.toCPointer<ByteVar>(), outputhandle.rawAddress.toCPointer<ByteVar>())

public actual fun sQLAllocHandleStd(fhandletype: Short, hinput: MutPtr<CVoid>, phoutput: MutPtr<MutPtr<CVoid>>): Short =
    windowssysWindowsWin32SystemSearchSQLAllocHandleStd(fhandletype, hinput.rawAddress.toCPointer<ByteVar>(), phoutput.rawAddress.toCPointer<ByteVar>())

public actual fun sQLAllocStmt(connectionhandle: MutPtr<CVoid>, statementhandle: MutPtr<MutPtr<CVoid>>): Short =
    windowssysWindowsWin32SystemSearchSQLAllocStmt(connectionhandle.rawAddress.toCPointer<ByteVar>(), statementhandle.rawAddress.toCPointer<ByteVar>())

public actual fun sQLBindCol(statementhandle: MutPtr<CVoid>, columnnumber: UShort, targettype: Short, targetvalue: MutPtr<CVoid>, bufferlength: Long, strlenOrInd: MutPtr<Long>): Short =
    windowssysWindowsWin32SystemSearchSQLBindCol(statementhandle.rawAddress.toCPointer<ByteVar>(), columnnumber, targettype, targetvalue.rawAddress.toCPointer<ByteVar>(), bufferlength, strlenOrInd.rawAddress.toCPointer<ByteVar>())

public actual fun sQLBindParam(statementhandle: MutPtr<CVoid>, parameternumber: UShort, valuetype: Short, parametertype: Short, lengthprecision: ULong, parameterscale: Short, parametervalue: MutPtr<CVoid>, strlenOrInd: MutPtr<Long>): Short =
    windowssysWindowsWin32SystemSearchSQLBindParam(statementhandle.rawAddress.toCPointer<ByteVar>(), parameternumber, valuetype, parametertype, lengthprecision, parameterscale, parametervalue.rawAddress.toCPointer<ByteVar>(), strlenOrInd.rawAddress.toCPointer<ByteVar>())

public actual fun sQLBindParameter(hstmt: MutPtr<CVoid>, ipar: UShort, fparamtype: Short, fctype: Short, fsqltype: Short, cbcoldef: ULong, ibscale: Short, rgbvalue: MutPtr<CVoid>, cbvaluemax: Long, pcbvalue: MutPtr<Long>): Short =
    windowssysWindowsWin32SystemSearchSQLBindParameter(hstmt.rawAddress.toCPointer<ByteVar>(), ipar, fparamtype, fctype, fsqltype, cbcoldef, ibscale, rgbvalue.rawAddress.toCPointer<ByteVar>(), cbvaluemax, pcbvalue.rawAddress.toCPointer<ByteVar>())

public actual fun sQLBrowseConnect(hdbc: MutPtr<CVoid>, szconnstrin: ConstPtr<UByte>, cchconnstrin: Short, szconnstrout: MutPtr<UByte>, cchconnstroutmax: Short, pcchconnstrout: MutPtr<Short>): Short =
    windowssysWindowsWin32SystemSearchSQLBrowseConnect(hdbc.rawAddress.toCPointer<ByteVar>(), szconnstrin.rawAddress.toCPointer<ByteVar>(), cchconnstrin, szconnstrout.rawAddress.toCPointer<ByteVar>(), cchconnstroutmax, pcchconnstrout.rawAddress.toCPointer<ByteVar>())

public actual fun sQLBrowseConnectA(hdbc: MutPtr<CVoid>, szconnstrin: ConstPtr<UByte>, cbconnstrin: Short, szconnstrout: MutPtr<UByte>, cbconnstroutmax: Short, pcbconnstrout: MutPtr<Short>): Short =
    windowssysWindowsWin32SystemSearchSQLBrowseConnectA(hdbc.rawAddress.toCPointer<ByteVar>(), szconnstrin.rawAddress.toCPointer<ByteVar>(), cbconnstrin, szconnstrout.rawAddress.toCPointer<ByteVar>(), cbconnstroutmax, pcbconnstrout.rawAddress.toCPointer<ByteVar>())

public actual fun sQLBrowseConnectW(hdbc: MutPtr<CVoid>, szconnstrin: ConstPtr<UShort>, cchconnstrin: Short, szconnstrout: MutPtr<UShort>, cchconnstroutmax: Short, pcchconnstrout: MutPtr<Short>): Short =
    windowssysWindowsWin32SystemSearchSQLBrowseConnectW(hdbc.rawAddress.toCPointer<ByteVar>(), szconnstrin.rawAddress.toCPointer<ByteVar>(), cchconnstrin, szconnstrout.rawAddress.toCPointer<ByteVar>(), cchconnstroutmax, pcchconnstrout.rawAddress.toCPointer<ByteVar>())

public actual fun sQLBulkOperations(statementhandle: MutPtr<CVoid>, operation: Short): Short =
    windowssysWindowsWin32SystemSearchSQLBulkOperations(statementhandle.rawAddress.toCPointer<ByteVar>(), operation)

public actual fun sQLCancel(statementhandle: MutPtr<CVoid>): Short =
    windowssysWindowsWin32SystemSearchSQLCancel(statementhandle.rawAddress.toCPointer<ByteVar>())

public actual fun sQLCancelHandle(handletype: Short, inputhandle: MutPtr<CVoid>): Short =
    windowssysWindowsWin32SystemSearchSQLCancelHandle(handletype, inputhandle.rawAddress.toCPointer<ByteVar>())

public actual fun sQLCloseCursor(statementhandle: MutPtr<CVoid>): Short =
    windowssysWindowsWin32SystemSearchSQLCloseCursor(statementhandle.rawAddress.toCPointer<ByteVar>())

public actual fun sQLCloseEnumServers(henumhandle: Handle): Short =
    windowssysWindowsWin32SystemSearchSQLCloseEnumServers(henumhandle.rawAddress.toCPointer<ByteVar>())

public actual fun sQLColAttribute(statementhandle: MutPtr<CVoid>, columnnumber: UShort, fieldidentifier: UShort, characterattribute: MutPtr<CVoid>, bufferlength: Short, stringlength: MutPtr<Short>, numericattribute: MutPtr<Long>): Short =
    windowssysWindowsWin32SystemSearchSQLColAttribute(statementhandle.rawAddress.toCPointer<ByteVar>(), columnnumber, fieldidentifier, characterattribute.rawAddress.toCPointer<ByteVar>(), bufferlength, stringlength.rawAddress.toCPointer<ByteVar>(), numericattribute.rawAddress.toCPointer<ByteVar>())

public actual fun sQLColAttributeA(hstmt: MutPtr<CVoid>, icol: Short, ifield: Short, pcharattr: MutPtr<CVoid>, cbcharattrmax: Short, pcbcharattr: MutPtr<Short>, pnumattr: MutPtr<Long>): Short =
    windowssysWindowsWin32SystemSearchSQLColAttributeA(hstmt.rawAddress.toCPointer<ByteVar>(), icol, ifield, pcharattr.rawAddress.toCPointer<ByteVar>(), cbcharattrmax, pcbcharattr.rawAddress.toCPointer<ByteVar>(), pnumattr.rawAddress.toCPointer<ByteVar>())

public actual fun sQLColAttributeW(hstmt: MutPtr<CVoid>, icol: UShort, ifield: UShort, pcharattr: MutPtr<CVoid>, cbdescmax: Short, pcbcharattr: MutPtr<Short>, pnumattr: MutPtr<Long>): Short =
    windowssysWindowsWin32SystemSearchSQLColAttributeW(hstmt.rawAddress.toCPointer<ByteVar>(), icol, ifield, pcharattr.rawAddress.toCPointer<ByteVar>(), cbdescmax, pcbcharattr.rawAddress.toCPointer<ByteVar>(), pnumattr.rawAddress.toCPointer<ByteVar>())

public actual fun sQLColAttributes(hstmt: MutPtr<CVoid>, icol: UShort, fdesctype: UShort, rgbdesc: MutPtr<CVoid>, cbdescmax: Short, pcbdesc: MutPtr<Short>, pfdesc: MutPtr<Long>): Short =
    windowssysWindowsWin32SystemSearchSQLColAttributes(hstmt.rawAddress.toCPointer<ByteVar>(), icol, fdesctype, rgbdesc.rawAddress.toCPointer<ByteVar>(), cbdescmax, pcbdesc.rawAddress.toCPointer<ByteVar>(), pfdesc.rawAddress.toCPointer<ByteVar>())

public actual fun sQLColAttributesA(hstmt: MutPtr<CVoid>, icol: UShort, fdesctype: UShort, rgbdesc: MutPtr<CVoid>, cbdescmax: Short, pcbdesc: MutPtr<Short>, pfdesc: MutPtr<Long>): Short =
    windowssysWindowsWin32SystemSearchSQLColAttributesA(hstmt.rawAddress.toCPointer<ByteVar>(), icol, fdesctype, rgbdesc.rawAddress.toCPointer<ByteVar>(), cbdescmax, pcbdesc.rawAddress.toCPointer<ByteVar>(), pfdesc.rawAddress.toCPointer<ByteVar>())

public actual fun sQLColAttributesW(hstmt: MutPtr<CVoid>, icol: UShort, fdesctype: UShort, rgbdesc: MutPtr<CVoid>, cbdescmax: Short, pcbdesc: MutPtr<Short>, pfdesc: MutPtr<Long>): Short =
    windowssysWindowsWin32SystemSearchSQLColAttributesW(hstmt.rawAddress.toCPointer<ByteVar>(), icol, fdesctype, rgbdesc.rawAddress.toCPointer<ByteVar>(), cbdescmax, pcbdesc.rawAddress.toCPointer<ByteVar>(), pfdesc.rawAddress.toCPointer<ByteVar>())

public actual fun sQLColumnPrivileges(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UByte>, cchcatalogname: Short, szschemaname: ConstPtr<UByte>, cchschemaname: Short, sztablename: ConstPtr<UByte>, cchtablename: Short, szcolumnname: ConstPtr<UByte>, cchcolumnname: Short): Short =
    windowssysWindowsWin32SystemSearchSQLColumnPrivileges(hstmt.rawAddress.toCPointer<ByteVar>(), szcatalogname.rawAddress.toCPointer<ByteVar>(), cchcatalogname, szschemaname.rawAddress.toCPointer<ByteVar>(), cchschemaname, sztablename.rawAddress.toCPointer<ByteVar>(), cchtablename, szcolumnname.rawAddress.toCPointer<ByteVar>(), cchcolumnname)

public actual fun sQLColumnPrivilegesA(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UByte>, cbcatalogname: Short, szschemaname: ConstPtr<UByte>, cbschemaname: Short, sztablename: ConstPtr<UByte>, cbtablename: Short, szcolumnname: ConstPtr<UByte>, cbcolumnname: Short): Short =
    windowssysWindowsWin32SystemSearchSQLColumnPrivilegesA(hstmt.rawAddress.toCPointer<ByteVar>(), szcatalogname.rawAddress.toCPointer<ByteVar>(), cbcatalogname, szschemaname.rawAddress.toCPointer<ByteVar>(), cbschemaname, sztablename.rawAddress.toCPointer<ByteVar>(), cbtablename, szcolumnname.rawAddress.toCPointer<ByteVar>(), cbcolumnname)

public actual fun sQLColumnPrivilegesW(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UShort>, cchcatalogname: Short, szschemaname: ConstPtr<UShort>, cchschemaname: Short, sztablename: ConstPtr<UShort>, cchtablename: Short, szcolumnname: ConstPtr<UShort>, cchcolumnname: Short): Short =
    windowssysWindowsWin32SystemSearchSQLColumnPrivilegesW(hstmt.rawAddress.toCPointer<ByteVar>(), szcatalogname.rawAddress.toCPointer<ByteVar>(), cchcatalogname, szschemaname.rawAddress.toCPointer<ByteVar>(), cchschemaname, sztablename.rawAddress.toCPointer<ByteVar>(), cchtablename, szcolumnname.rawAddress.toCPointer<ByteVar>(), cchcolumnname)

public actual fun sQLColumns(statementhandle: MutPtr<CVoid>, catalogname: ConstPtr<UByte>, namelength1: Short, schemaname: ConstPtr<UByte>, namelength2: Short, tablename: ConstPtr<UByte>, namelength3: Short, columnname: ConstPtr<UByte>, namelength4: Short): Short =
    windowssysWindowsWin32SystemSearchSQLColumns(statementhandle.rawAddress.toCPointer<ByteVar>(), catalogname.rawAddress.toCPointer<ByteVar>(), namelength1, schemaname.rawAddress.toCPointer<ByteVar>(), namelength2, tablename.rawAddress.toCPointer<ByteVar>(), namelength3, columnname.rawAddress.toCPointer<ByteVar>(), namelength4)

public actual fun sQLColumnsA(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UByte>, cbcatalogname: Short, szschemaname: ConstPtr<UByte>, cbschemaname: Short, sztablename: ConstPtr<UByte>, cbtablename: Short, szcolumnname: ConstPtr<UByte>, cbcolumnname: Short): Short =
    windowssysWindowsWin32SystemSearchSQLColumnsA(hstmt.rawAddress.toCPointer<ByteVar>(), szcatalogname.rawAddress.toCPointer<ByteVar>(), cbcatalogname, szschemaname.rawAddress.toCPointer<ByteVar>(), cbschemaname, sztablename.rawAddress.toCPointer<ByteVar>(), cbtablename, szcolumnname.rawAddress.toCPointer<ByteVar>(), cbcolumnname)

public actual fun sQLColumnsW(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UShort>, cchcatalogname: Short, szschemaname: ConstPtr<UShort>, cchschemaname: Short, sztablename: ConstPtr<UShort>, cchtablename: Short, szcolumnname: ConstPtr<UShort>, cchcolumnname: Short): Short =
    windowssysWindowsWin32SystemSearchSQLColumnsW(hstmt.rawAddress.toCPointer<ByteVar>(), szcatalogname.rawAddress.toCPointer<ByteVar>(), cchcatalogname, szschemaname.rawAddress.toCPointer<ByteVar>(), cchschemaname, sztablename.rawAddress.toCPointer<ByteVar>(), cchtablename, szcolumnname.rawAddress.toCPointer<ByteVar>(), cchcolumnname)

public actual fun sQLCompleteAsync(handletype: Short, handle: MutPtr<CVoid>, asyncretcodeptr: MutPtr<Short>): Short =
    windowssysWindowsWin32SystemSearchSQLCompleteAsync(handletype, handle.rawAddress.toCPointer<ByteVar>(), asyncretcodeptr.rawAddress.toCPointer<ByteVar>())

public actual fun sQLConnect(connectionhandle: MutPtr<CVoid>, servername: ConstPtr<UByte>, namelength1: Short, username: ConstPtr<UByte>, namelength2: Short, authentication: ConstPtr<UByte>, namelength3: Short): Short =
    windowssysWindowsWin32SystemSearchSQLConnect(connectionhandle.rawAddress.toCPointer<ByteVar>(), servername.rawAddress.toCPointer<ByteVar>(), namelength1, username.rawAddress.toCPointer<ByteVar>(), namelength2, authentication.rawAddress.toCPointer<ByteVar>(), namelength3)

public actual fun sQLConnectA(hdbc: MutPtr<CVoid>, szdsn: ConstPtr<UByte>, cbdsn: Short, szuid: ConstPtr<UByte>, cbuid: Short, szauthstr: ConstPtr<UByte>, cbauthstr: Short): Short =
    windowssysWindowsWin32SystemSearchSQLConnectA(hdbc.rawAddress.toCPointer<ByteVar>(), szdsn.rawAddress.toCPointer<ByteVar>(), cbdsn, szuid.rawAddress.toCPointer<ByteVar>(), cbuid, szauthstr.rawAddress.toCPointer<ByteVar>(), cbauthstr)

public actual fun sQLConnectW(hdbc: MutPtr<CVoid>, szdsn: ConstPtr<UShort>, cchdsn: Short, szuid: ConstPtr<UShort>, cchuid: Short, szauthstr: ConstPtr<UShort>, cchauthstr: Short): Short =
    windowssysWindowsWin32SystemSearchSQLConnectW(hdbc.rawAddress.toCPointer<ByteVar>(), szdsn.rawAddress.toCPointer<ByteVar>(), cchdsn, szuid.rawAddress.toCPointer<ByteVar>(), cchuid, szauthstr.rawAddress.toCPointer<ByteVar>(), cchauthstr)

public actual fun sQLCopyDesc(sourcedeschandle: MutPtr<CVoid>, targetdeschandle: MutPtr<CVoid>): Short =
    windowssysWindowsWin32SystemSearchSQLCopyDesc(sourcedeschandle.rawAddress.toCPointer<ByteVar>(), targetdeschandle.rawAddress.toCPointer<ByteVar>())

public actual fun sQLDataSources(environmenthandle: MutPtr<CVoid>, direction: UShort, servername: MutPtr<UByte>, bufferlength1: Short, namelength1ptr: MutPtr<Short>, description: MutPtr<UByte>, bufferlength2: Short, namelength2ptr: MutPtr<Short>): Short =
    windowssysWindowsWin32SystemSearchSQLDataSources(environmenthandle.rawAddress.toCPointer<ByteVar>(), direction, servername.rawAddress.toCPointer<ByteVar>(), bufferlength1, namelength1ptr.rawAddress.toCPointer<ByteVar>(), description.rawAddress.toCPointer<ByteVar>(), bufferlength2, namelength2ptr.rawAddress.toCPointer<ByteVar>())

public actual fun sQLDataSourcesA(henv: MutPtr<CVoid>, fdirection: UShort, szdsn: MutPtr<UByte>, cbdsnmax: Short, pcbdsn: MutPtr<Short>, szdescription: MutPtr<UByte>, cbdescriptionmax: Short, pcbdescription: MutPtr<Short>): Short =
    windowssysWindowsWin32SystemSearchSQLDataSourcesA(henv.rawAddress.toCPointer<ByteVar>(), fdirection, szdsn.rawAddress.toCPointer<ByteVar>(), cbdsnmax, pcbdsn.rawAddress.toCPointer<ByteVar>(), szdescription.rawAddress.toCPointer<ByteVar>(), cbdescriptionmax, pcbdescription.rawAddress.toCPointer<ByteVar>())

public actual fun sQLDataSourcesW(henv: MutPtr<CVoid>, fdirection: UShort, szdsn: MutPtr<UShort>, cchdsnmax: Short, pcchdsn: MutPtr<Short>, wszdescription: MutPtr<UShort>, cchdescriptionmax: Short, pcchdescription: MutPtr<Short>): Short =
    windowssysWindowsWin32SystemSearchSQLDataSourcesW(henv.rawAddress.toCPointer<ByteVar>(), fdirection, szdsn.rawAddress.toCPointer<ByteVar>(), cchdsnmax, pcchdsn.rawAddress.toCPointer<ByteVar>(), wszdescription.rawAddress.toCPointer<ByteVar>(), cchdescriptionmax, pcchdescription.rawAddress.toCPointer<ByteVar>())

public actual fun sQLDescribeCol(statementhandle: MutPtr<CVoid>, columnnumber: UShort, columnname: MutPtr<UByte>, bufferlength: Short, namelength: MutPtr<Short>, datatype: MutPtr<Short>, columnsize: MutPtr<ULong>, decimaldigits: MutPtr<Short>, nullable: MutPtr<Short>): Short =
    windowssysWindowsWin32SystemSearchSQLDescribeCol(statementhandle.rawAddress.toCPointer<ByteVar>(), columnnumber, columnname.rawAddress.toCPointer<ByteVar>(), bufferlength, namelength.rawAddress.toCPointer<ByteVar>(), datatype.rawAddress.toCPointer<ByteVar>(), columnsize.rawAddress.toCPointer<ByteVar>(), decimaldigits.rawAddress.toCPointer<ByteVar>(), nullable.rawAddress.toCPointer<ByteVar>())

public actual fun sQLDescribeColA(hstmt: MutPtr<CVoid>, icol: UShort, szcolname: MutPtr<UByte>, cbcolnamemax: Short, pcbcolname: MutPtr<Short>, pfsqltype: MutPtr<Short>, pcbcoldef: MutPtr<ULong>, pibscale: MutPtr<Short>, pfnullable: MutPtr<Short>): Short =
    windowssysWindowsWin32SystemSearchSQLDescribeColA(hstmt.rawAddress.toCPointer<ByteVar>(), icol, szcolname.rawAddress.toCPointer<ByteVar>(), cbcolnamemax, pcbcolname.rawAddress.toCPointer<ByteVar>(), pfsqltype.rawAddress.toCPointer<ByteVar>(), pcbcoldef.rawAddress.toCPointer<ByteVar>(), pibscale.rawAddress.toCPointer<ByteVar>(), pfnullable.rawAddress.toCPointer<ByteVar>())

public actual fun sQLDescribeColW(hstmt: MutPtr<CVoid>, icol: UShort, szcolname: MutPtr<UShort>, cchcolnamemax: Short, pcchcolname: MutPtr<Short>, pfsqltype: MutPtr<Short>, pcbcoldef: MutPtr<ULong>, pibscale: MutPtr<Short>, pfnullable: MutPtr<Short>): Short =
    windowssysWindowsWin32SystemSearchSQLDescribeColW(hstmt.rawAddress.toCPointer<ByteVar>(), icol, szcolname.rawAddress.toCPointer<ByteVar>(), cchcolnamemax, pcchcolname.rawAddress.toCPointer<ByteVar>(), pfsqltype.rawAddress.toCPointer<ByteVar>(), pcbcoldef.rawAddress.toCPointer<ByteVar>(), pibscale.rawAddress.toCPointer<ByteVar>(), pfnullable.rawAddress.toCPointer<ByteVar>())

public actual fun sQLDescribeParam(hstmt: MutPtr<CVoid>, ipar: UShort, pfsqltype: MutPtr<Short>, pcbparamdef: MutPtr<ULong>, pibscale: MutPtr<Short>, pfnullable: MutPtr<Short>): Short =
    windowssysWindowsWin32SystemSearchSQLDescribeParam(hstmt.rawAddress.toCPointer<ByteVar>(), ipar, pfsqltype.rawAddress.toCPointer<ByteVar>(), pcbparamdef.rawAddress.toCPointer<ByteVar>(), pibscale.rawAddress.toCPointer<ByteVar>(), pfnullable.rawAddress.toCPointer<ByteVar>())

public actual fun sQLDisconnect(connectionhandle: MutPtr<CVoid>): Short =
    windowssysWindowsWin32SystemSearchSQLDisconnect(connectionhandle.rawAddress.toCPointer<ByteVar>())

public actual fun sQLDriverConnect(hdbc: MutPtr<CVoid>, hwnd: Long, szconnstrin: ConstPtr<UByte>, cchconnstrin: Short, szconnstrout: MutPtr<UByte>, cchconnstroutmax: Short, pcchconnstrout: MutPtr<Short>, fdrivercompletion: UShort): Short =
    windowssysWindowsWin32SystemSearchSQLDriverConnect(hdbc.rawAddress.toCPointer<ByteVar>(), hwnd, szconnstrin.rawAddress.toCPointer<ByteVar>(), cchconnstrin, szconnstrout.rawAddress.toCPointer<ByteVar>(), cchconnstroutmax, pcchconnstrout.rawAddress.toCPointer<ByteVar>(), fdrivercompletion)

public actual fun sQLDriverConnectA(hdbc: MutPtr<CVoid>, hwnd: Long, szconnstrin: ConstPtr<UByte>, cbconnstrin: Short, szconnstrout: MutPtr<UByte>, cbconnstroutmax: Short, pcbconnstrout: MutPtr<Short>, fdrivercompletion: UShort): Short =
    windowssysWindowsWin32SystemSearchSQLDriverConnectA(hdbc.rawAddress.toCPointer<ByteVar>(), hwnd, szconnstrin.rawAddress.toCPointer<ByteVar>(), cbconnstrin, szconnstrout.rawAddress.toCPointer<ByteVar>(), cbconnstroutmax, pcbconnstrout.rawAddress.toCPointer<ByteVar>(), fdrivercompletion)

public actual fun sQLDriverConnectW(hdbc: MutPtr<CVoid>, hwnd: Long, szconnstrin: ConstPtr<UShort>, cchconnstrin: Short, szconnstrout: MutPtr<UShort>, cchconnstroutmax: Short, pcchconnstrout: MutPtr<Short>, fdrivercompletion: UShort): Short =
    windowssysWindowsWin32SystemSearchSQLDriverConnectW(hdbc.rawAddress.toCPointer<ByteVar>(), hwnd, szconnstrin.rawAddress.toCPointer<ByteVar>(), cchconnstrin, szconnstrout.rawAddress.toCPointer<ByteVar>(), cchconnstroutmax, pcchconnstrout.rawAddress.toCPointer<ByteVar>(), fdrivercompletion)

public actual fun sQLDrivers(henv: MutPtr<CVoid>, fdirection: UShort, szdriverdesc: MutPtr<UByte>, cchdriverdescmax: Short, pcchdriverdesc: MutPtr<Short>, szdriverattributes: MutPtr<UByte>, cchdrvrattrmax: Short, pcchdrvrattr: MutPtr<Short>): Short =
    windowssysWindowsWin32SystemSearchSQLDrivers(henv.rawAddress.toCPointer<ByteVar>(), fdirection, szdriverdesc.rawAddress.toCPointer<ByteVar>(), cchdriverdescmax, pcchdriverdesc.rawAddress.toCPointer<ByteVar>(), szdriverattributes.rawAddress.toCPointer<ByteVar>(), cchdrvrattrmax, pcchdrvrattr.rawAddress.toCPointer<ByteVar>())

public actual fun sQLDriversA(henv: MutPtr<CVoid>, fdirection: UShort, szdriverdesc: MutPtr<UByte>, cbdriverdescmax: Short, pcbdriverdesc: MutPtr<Short>, szdriverattributes: MutPtr<UByte>, cbdrvrattrmax: Short, pcbdrvrattr: MutPtr<Short>): Short =
    windowssysWindowsWin32SystemSearchSQLDriversA(henv.rawAddress.toCPointer<ByteVar>(), fdirection, szdriverdesc.rawAddress.toCPointer<ByteVar>(), cbdriverdescmax, pcbdriverdesc.rawAddress.toCPointer<ByteVar>(), szdriverattributes.rawAddress.toCPointer<ByteVar>(), cbdrvrattrmax, pcbdrvrattr.rawAddress.toCPointer<ByteVar>())

public actual fun sQLDriversW(henv: MutPtr<CVoid>, fdirection: UShort, szdriverdesc: MutPtr<UShort>, cchdriverdescmax: Short, pcchdriverdesc: MutPtr<Short>, szdriverattributes: MutPtr<UShort>, cchdrvrattrmax: Short, pcchdrvrattr: MutPtr<Short>): Short =
    windowssysWindowsWin32SystemSearchSQLDriversW(henv.rawAddress.toCPointer<ByteVar>(), fdirection, szdriverdesc.rawAddress.toCPointer<ByteVar>(), cchdriverdescmax, pcchdriverdesc.rawAddress.toCPointer<ByteVar>(), szdriverattributes.rawAddress.toCPointer<ByteVar>(), cchdrvrattrmax, pcchdrvrattr.rawAddress.toCPointer<ByteVar>())

public actual fun sQLEndTran(handletype: Short, handle: MutPtr<CVoid>, completiontype: Short): Short =
    windowssysWindowsWin32SystemSearchSQLEndTran(handletype, handle.rawAddress.toCPointer<ByteVar>(), completiontype)

public actual fun sQLError(environmenthandle: MutPtr<CVoid>, connectionhandle: MutPtr<CVoid>, statementhandle: MutPtr<CVoid>, sqlstate: MutPtr<UByte>, nativeerror: MutPtr<Int>, messagetext: MutPtr<UByte>, bufferlength: Short, textlength: MutPtr<Short>): Short =
    windowssysWindowsWin32SystemSearchSQLError(environmenthandle.rawAddress.toCPointer<ByteVar>(), connectionhandle.rawAddress.toCPointer<ByteVar>(), statementhandle.rawAddress.toCPointer<ByteVar>(), sqlstate.rawAddress.toCPointer<ByteVar>(), nativeerror.rawAddress.toCPointer<ByteVar>(), messagetext.rawAddress.toCPointer<ByteVar>(), bufferlength, textlength.rawAddress.toCPointer<ByteVar>())

public actual fun sQLErrorA(henv: MutPtr<CVoid>, hdbc: MutPtr<CVoid>, hstmt: MutPtr<CVoid>, szsqlstate: MutPtr<UByte>, pfnativeerror: MutPtr<Int>, szerrormsg: MutPtr<UByte>, cberrormsgmax: Short, pcberrormsg: MutPtr<Short>): Short =
    windowssysWindowsWin32SystemSearchSQLErrorA(henv.rawAddress.toCPointer<ByteVar>(), hdbc.rawAddress.toCPointer<ByteVar>(), hstmt.rawAddress.toCPointer<ByteVar>(), szsqlstate.rawAddress.toCPointer<ByteVar>(), pfnativeerror.rawAddress.toCPointer<ByteVar>(), szerrormsg.rawAddress.toCPointer<ByteVar>(), cberrormsgmax, pcberrormsg.rawAddress.toCPointer<ByteVar>())

public actual fun sQLErrorW(henv: MutPtr<CVoid>, hdbc: MutPtr<CVoid>, hstmt: MutPtr<CVoid>, wszsqlstate: MutPtr<UShort>, pfnativeerror: MutPtr<Int>, wszerrormsg: MutPtr<UShort>, ccherrormsgmax: Short, pccherrormsg: MutPtr<Short>): Short =
    windowssysWindowsWin32SystemSearchSQLErrorW(henv.rawAddress.toCPointer<ByteVar>(), hdbc.rawAddress.toCPointer<ByteVar>(), hstmt.rawAddress.toCPointer<ByteVar>(), wszsqlstate.rawAddress.toCPointer<ByteVar>(), pfnativeerror.rawAddress.toCPointer<ByteVar>(), wszerrormsg.rawAddress.toCPointer<ByteVar>(), ccherrormsgmax, pccherrormsg.rawAddress.toCPointer<ByteVar>())

public actual fun sQLExecDirect(statementhandle: MutPtr<CVoid>, statementtext: ConstPtr<UByte>, textlength: Int): Short =
    windowssysWindowsWin32SystemSearchSQLExecDirect(statementhandle.rawAddress.toCPointer<ByteVar>(), statementtext.rawAddress.toCPointer<ByteVar>(), textlength)

public actual fun sQLExecDirectA(hstmt: MutPtr<CVoid>, szsqlstr: ConstPtr<UByte>, cbsqlstr: Int): Short =
    windowssysWindowsWin32SystemSearchSQLExecDirectA(hstmt.rawAddress.toCPointer<ByteVar>(), szsqlstr.rawAddress.toCPointer<ByteVar>(), cbsqlstr)

public actual fun sQLExecDirectW(hstmt: MutPtr<CVoid>, szsqlstr: ConstPtr<UShort>, textlength: Int): Short =
    windowssysWindowsWin32SystemSearchSQLExecDirectW(hstmt.rawAddress.toCPointer<ByteVar>(), szsqlstr.rawAddress.toCPointer<ByteVar>(), textlength)

public actual fun sQLExecute(statementhandle: MutPtr<CVoid>): Short =
    windowssysWindowsWin32SystemSearchSQLExecute(statementhandle.rawAddress.toCPointer<ByteVar>())

public actual fun sQLExtendedFetch(hstmt: MutPtr<CVoid>, ffetchtype: UShort, irow: Long, pcrow: MutPtr<ULong>, rgfrowstatus: MutPtr<UShort>): Short =
    windowssysWindowsWin32SystemSearchSQLExtendedFetch(hstmt.rawAddress.toCPointer<ByteVar>(), ffetchtype, irow, pcrow.rawAddress.toCPointer<ByteVar>(), rgfrowstatus.rawAddress.toCPointer<ByteVar>())

public actual fun sQLFetch(statementhandle: MutPtr<CVoid>): Short =
    windowssysWindowsWin32SystemSearchSQLFetch(statementhandle.rawAddress.toCPointer<ByteVar>())

public actual fun sQLFetchScroll(statementhandle: MutPtr<CVoid>, fetchorientation: Short, fetchoffset: Long): Short =
    windowssysWindowsWin32SystemSearchSQLFetchScroll(statementhandle.rawAddress.toCPointer<ByteVar>(), fetchorientation, fetchoffset)

public actual fun sQLForeignKeys(hstmt: MutPtr<CVoid>, szpkcatalogname: ConstPtr<UByte>, cchpkcatalogname: Short, szpkschemaname: ConstPtr<UByte>, cchpkschemaname: Short, szpktablename: ConstPtr<UByte>, cchpktablename: Short, szfkcatalogname: ConstPtr<UByte>, cchfkcatalogname: Short, szfkschemaname: ConstPtr<UByte>, cchfkschemaname: Short, szfktablename: ConstPtr<UByte>, cchfktablename: Short): Short =
    windowssysWindowsWin32SystemSearchSQLForeignKeys(hstmt.rawAddress.toCPointer<ByteVar>(), szpkcatalogname.rawAddress.toCPointer<ByteVar>(), cchpkcatalogname, szpkschemaname.rawAddress.toCPointer<ByteVar>(), cchpkschemaname, szpktablename.rawAddress.toCPointer<ByteVar>(), cchpktablename, szfkcatalogname.rawAddress.toCPointer<ByteVar>(), cchfkcatalogname, szfkschemaname.rawAddress.toCPointer<ByteVar>(), cchfkschemaname, szfktablename.rawAddress.toCPointer<ByteVar>(), cchfktablename)

public actual fun sQLForeignKeysA(hstmt: MutPtr<CVoid>, szpkcatalogname: ConstPtr<UByte>, cbpkcatalogname: Short, szpkschemaname: ConstPtr<UByte>, cbpkschemaname: Short, szpktablename: ConstPtr<UByte>, cbpktablename: Short, szfkcatalogname: ConstPtr<UByte>, cbfkcatalogname: Short, szfkschemaname: ConstPtr<UByte>, cbfkschemaname: Short, szfktablename: ConstPtr<UByte>, cbfktablename: Short): Short =
    windowssysWindowsWin32SystemSearchSQLForeignKeysA(hstmt.rawAddress.toCPointer<ByteVar>(), szpkcatalogname.rawAddress.toCPointer<ByteVar>(), cbpkcatalogname, szpkschemaname.rawAddress.toCPointer<ByteVar>(), cbpkschemaname, szpktablename.rawAddress.toCPointer<ByteVar>(), cbpktablename, szfkcatalogname.rawAddress.toCPointer<ByteVar>(), cbfkcatalogname, szfkschemaname.rawAddress.toCPointer<ByteVar>(), cbfkschemaname, szfktablename.rawAddress.toCPointer<ByteVar>(), cbfktablename)

public actual fun sQLForeignKeysW(hstmt: MutPtr<CVoid>, szpkcatalogname: ConstPtr<UShort>, cchpkcatalogname: Short, szpkschemaname: ConstPtr<UShort>, cchpkschemaname: Short, szpktablename: ConstPtr<UShort>, cchpktablename: Short, szfkcatalogname: ConstPtr<UShort>, cchfkcatalogname: Short, szfkschemaname: ConstPtr<UShort>, cchfkschemaname: Short, szfktablename: ConstPtr<UShort>, cchfktablename: Short): Short =
    windowssysWindowsWin32SystemSearchSQLForeignKeysW(hstmt.rawAddress.toCPointer<ByteVar>(), szpkcatalogname.rawAddress.toCPointer<ByteVar>(), cchpkcatalogname, szpkschemaname.rawAddress.toCPointer<ByteVar>(), cchpkschemaname, szpktablename.rawAddress.toCPointer<ByteVar>(), cchpktablename, szfkcatalogname.rawAddress.toCPointer<ByteVar>(), cchfkcatalogname, szfkschemaname.rawAddress.toCPointer<ByteVar>(), cchfkschemaname, szfktablename.rawAddress.toCPointer<ByteVar>(), cchfktablename)

public actual fun sQLFreeConnect(connectionhandle: MutPtr<CVoid>): Short =
    windowssysWindowsWin32SystemSearchSQLFreeConnect(connectionhandle.rawAddress.toCPointer<ByteVar>())

public actual fun sQLFreeEnv(environmenthandle: MutPtr<CVoid>): Short =
    windowssysWindowsWin32SystemSearchSQLFreeEnv(environmenthandle.rawAddress.toCPointer<ByteVar>())

public actual fun sQLFreeHandle(handletype: Short, handle: MutPtr<CVoid>): Short =
    windowssysWindowsWin32SystemSearchSQLFreeHandle(handletype, handle.rawAddress.toCPointer<ByteVar>())

public actual fun sQLFreeStmt(statementhandle: MutPtr<CVoid>, option: UShort): Short =
    windowssysWindowsWin32SystemSearchSQLFreeStmt(statementhandle.rawAddress.toCPointer<ByteVar>(), option)

public actual fun sQLGetConnectAttr(connectionhandle: MutPtr<CVoid>, attribute: Int, value: MutPtr<CVoid>, bufferlength: Int, stringlengthptr: MutPtr<Int>): Short =
    windowssysWindowsWin32SystemSearchSQLGetConnectAttr(connectionhandle.rawAddress.toCPointer<ByteVar>(), attribute, value.rawAddress.toCPointer<ByteVar>(), bufferlength, stringlengthptr.rawAddress.toCPointer<ByteVar>())

public actual fun sQLGetConnectAttrA(hdbc: MutPtr<CVoid>, fattribute: Int, rgbvalue: MutPtr<CVoid>, cbvaluemax: Int, pcbvalue: MutPtr<Int>): Short =
    windowssysWindowsWin32SystemSearchSQLGetConnectAttrA(hdbc.rawAddress.toCPointer<ByteVar>(), fattribute, rgbvalue.rawAddress.toCPointer<ByteVar>(), cbvaluemax, pcbvalue.rawAddress.toCPointer<ByteVar>())

public actual fun sQLGetConnectAttrW(hdbc: MutPtr<CVoid>, fattribute: Int, rgbvalue: MutPtr<CVoid>, cbvaluemax: Int, pcbvalue: MutPtr<Int>): Short =
    windowssysWindowsWin32SystemSearchSQLGetConnectAttrW(hdbc.rawAddress.toCPointer<ByteVar>(), fattribute, rgbvalue.rawAddress.toCPointer<ByteVar>(), cbvaluemax, pcbvalue.rawAddress.toCPointer<ByteVar>())

public actual fun sQLGetConnectOption(connectionhandle: MutPtr<CVoid>, option: UShort, value: MutPtr<CVoid>): Short =
    windowssysWindowsWin32SystemSearchSQLGetConnectOption(connectionhandle.rawAddress.toCPointer<ByteVar>(), option, value.rawAddress.toCPointer<ByteVar>())

public actual fun sQLGetConnectOptionA(hdbc: MutPtr<CVoid>, foption: UShort, pvparam: MutPtr<CVoid>): Short =
    windowssysWindowsWin32SystemSearchSQLGetConnectOptionA(hdbc.rawAddress.toCPointer<ByteVar>(), foption, pvparam.rawAddress.toCPointer<ByteVar>())

public actual fun sQLGetConnectOptionW(hdbc: MutPtr<CVoid>, foption: UShort, pvparam: MutPtr<CVoid>): Short =
    windowssysWindowsWin32SystemSearchSQLGetConnectOptionW(hdbc.rawAddress.toCPointer<ByteVar>(), foption, pvparam.rawAddress.toCPointer<ByteVar>())

public actual fun sQLGetCursorName(statementhandle: MutPtr<CVoid>, cursorname: MutPtr<UByte>, bufferlength: Short, namelengthptr: MutPtr<Short>): Short =
    windowssysWindowsWin32SystemSearchSQLGetCursorName(statementhandle.rawAddress.toCPointer<ByteVar>(), cursorname.rawAddress.toCPointer<ByteVar>(), bufferlength, namelengthptr.rawAddress.toCPointer<ByteVar>())

public actual fun sQLGetCursorNameA(hstmt: MutPtr<CVoid>, szcursor: MutPtr<UByte>, cbcursormax: Short, pcbcursor: MutPtr<Short>): Short =
    windowssysWindowsWin32SystemSearchSQLGetCursorNameA(hstmt.rawAddress.toCPointer<ByteVar>(), szcursor.rawAddress.toCPointer<ByteVar>(), cbcursormax, pcbcursor.rawAddress.toCPointer<ByteVar>())

public actual fun sQLGetCursorNameW(hstmt: MutPtr<CVoid>, szcursor: MutPtr<UShort>, cchcursormax: Short, pcchcursor: MutPtr<Short>): Short =
    windowssysWindowsWin32SystemSearchSQLGetCursorNameW(hstmt.rawAddress.toCPointer<ByteVar>(), szcursor.rawAddress.toCPointer<ByteVar>(), cchcursormax, pcchcursor.rawAddress.toCPointer<ByteVar>())

public actual fun sQLGetData(statementhandle: MutPtr<CVoid>, columnnumber: UShort, targettype: Short, targetvalue: MutPtr<CVoid>, bufferlength: Long, strlenOrIndptr: MutPtr<Long>): Short =
    windowssysWindowsWin32SystemSearchSQLGetData(statementhandle.rawAddress.toCPointer<ByteVar>(), columnnumber, targettype, targetvalue.rawAddress.toCPointer<ByteVar>(), bufferlength, strlenOrIndptr.rawAddress.toCPointer<ByteVar>())

public actual fun sQLGetDescField(descriptorhandle: MutPtr<CVoid>, recnumber: Short, fieldidentifier: Short, value: MutPtr<CVoid>, bufferlength: Int, stringlength: MutPtr<Int>): Short =
    windowssysWindowsWin32SystemSearchSQLGetDescField(descriptorhandle.rawAddress.toCPointer<ByteVar>(), recnumber, fieldidentifier, value.rawAddress.toCPointer<ByteVar>(), bufferlength, stringlength.rawAddress.toCPointer<ByteVar>())

public actual fun sQLGetDescFieldA(hdesc: MutPtr<CVoid>, irecord: Short, ifield: Short, rgbvalue: MutPtr<CVoid>, cbbufferlength: Int, stringlength: MutPtr<Int>): Short =
    windowssysWindowsWin32SystemSearchSQLGetDescFieldA(hdesc.rawAddress.toCPointer<ByteVar>(), irecord, ifield, rgbvalue.rawAddress.toCPointer<ByteVar>(), cbbufferlength, stringlength.rawAddress.toCPointer<ByteVar>())

public actual fun sQLGetDescFieldW(hdesc: MutPtr<CVoid>, irecord: Short, ifield: Short, rgbvalue: MutPtr<CVoid>, cbbufferlength: Int, stringlength: MutPtr<Int>): Short =
    windowssysWindowsWin32SystemSearchSQLGetDescFieldW(hdesc.rawAddress.toCPointer<ByteVar>(), irecord, ifield, rgbvalue.rawAddress.toCPointer<ByteVar>(), cbbufferlength, stringlength.rawAddress.toCPointer<ByteVar>())

public actual fun sQLGetDescRec(descriptorhandle: MutPtr<CVoid>, recnumber: Short, name: MutPtr<UByte>, bufferlength: Short, stringlengthptr: MutPtr<Short>, typeptr: MutPtr<Short>, subtypeptr: MutPtr<Short>, lengthptr: MutPtr<Long>, precisionptr: MutPtr<Short>, scaleptr: MutPtr<Short>, nullableptr: MutPtr<Short>): Short =
    windowssysWindowsWin32SystemSearchSQLGetDescRec(descriptorhandle.rawAddress.toCPointer<ByteVar>(), recnumber, name.rawAddress.toCPointer<ByteVar>(), bufferlength, stringlengthptr.rawAddress.toCPointer<ByteVar>(), typeptr.rawAddress.toCPointer<ByteVar>(), subtypeptr.rawAddress.toCPointer<ByteVar>(), lengthptr.rawAddress.toCPointer<ByteVar>(), precisionptr.rawAddress.toCPointer<ByteVar>(), scaleptr.rawAddress.toCPointer<ByteVar>(), nullableptr.rawAddress.toCPointer<ByteVar>())

public actual fun sQLGetDescRecA(hdesc: MutPtr<CVoid>, irecord: Short, szname: MutPtr<UByte>, cbnamemax: Short, pcbname: MutPtr<Short>, pftype: MutPtr<Short>, pfsubtype: MutPtr<Short>, plength: MutPtr<Long>, pprecision: MutPtr<Short>, pscale: MutPtr<Short>, pnullable: MutPtr<Short>): Short =
    windowssysWindowsWin32SystemSearchSQLGetDescRecA(hdesc.rawAddress.toCPointer<ByteVar>(), irecord, szname.rawAddress.toCPointer<ByteVar>(), cbnamemax, pcbname.rawAddress.toCPointer<ByteVar>(), pftype.rawAddress.toCPointer<ByteVar>(), pfsubtype.rawAddress.toCPointer<ByteVar>(), plength.rawAddress.toCPointer<ByteVar>(), pprecision.rawAddress.toCPointer<ByteVar>(), pscale.rawAddress.toCPointer<ByteVar>(), pnullable.rawAddress.toCPointer<ByteVar>())

public actual fun sQLGetDescRecW(hdesc: MutPtr<CVoid>, irecord: Short, szname: MutPtr<UShort>, cchnamemax: Short, pcchname: MutPtr<Short>, pftype: MutPtr<Short>, pfsubtype: MutPtr<Short>, plength: MutPtr<Long>, pprecision: MutPtr<Short>, pscale: MutPtr<Short>, pnullable: MutPtr<Short>): Short =
    windowssysWindowsWin32SystemSearchSQLGetDescRecW(hdesc.rawAddress.toCPointer<ByteVar>(), irecord, szname.rawAddress.toCPointer<ByteVar>(), cchnamemax, pcchname.rawAddress.toCPointer<ByteVar>(), pftype.rawAddress.toCPointer<ByteVar>(), pfsubtype.rawAddress.toCPointer<ByteVar>(), plength.rawAddress.toCPointer<ByteVar>(), pprecision.rawAddress.toCPointer<ByteVar>(), pscale.rawAddress.toCPointer<ByteVar>(), pnullable.rawAddress.toCPointer<ByteVar>())

public actual fun sQLGetDiagField(handletype: Short, handle: MutPtr<CVoid>, recnumber: Short, diagidentifier: Short, diaginfo: MutPtr<CVoid>, bufferlength: Short, stringlength: MutPtr<Short>): Short =
    windowssysWindowsWin32SystemSearchSQLGetDiagField(handletype, handle.rawAddress.toCPointer<ByteVar>(), recnumber, diagidentifier, diaginfo.rawAddress.toCPointer<ByteVar>(), bufferlength, stringlength.rawAddress.toCPointer<ByteVar>())

public actual fun sQLGetDiagFieldA(fhandletype: Short, handle: MutPtr<CVoid>, irecord: Short, fdiagfield: Short, rgbdiaginfo: MutPtr<CVoid>, cbdiaginfomax: Short, pcbdiaginfo: MutPtr<Short>): Short =
    windowssysWindowsWin32SystemSearchSQLGetDiagFieldA(fhandletype, handle.rawAddress.toCPointer<ByteVar>(), irecord, fdiagfield, rgbdiaginfo.rawAddress.toCPointer<ByteVar>(), cbdiaginfomax, pcbdiaginfo.rawAddress.toCPointer<ByteVar>())

public actual fun sQLGetDiagFieldW(fhandletype: Short, handle: MutPtr<CVoid>, irecord: Short, fdiagfield: Short, rgbdiaginfo: MutPtr<CVoid>, cbbufferlength: Short, pcbstringlength: MutPtr<Short>): Short =
    windowssysWindowsWin32SystemSearchSQLGetDiagFieldW(fhandletype, handle.rawAddress.toCPointer<ByteVar>(), irecord, fdiagfield, rgbdiaginfo.rawAddress.toCPointer<ByteVar>(), cbbufferlength, pcbstringlength.rawAddress.toCPointer<ByteVar>())

public actual fun sQLGetDiagRec(handletype: Short, handle: MutPtr<CVoid>, recnumber: Short, sqlstate: MutPtr<UByte>, nativeerror: MutPtr<Int>, messagetext: MutPtr<UByte>, bufferlength: Short, textlength: MutPtr<Short>): Short =
    windowssysWindowsWin32SystemSearchSQLGetDiagRec(handletype, handle.rawAddress.toCPointer<ByteVar>(), recnumber, sqlstate.rawAddress.toCPointer<ByteVar>(), nativeerror.rawAddress.toCPointer<ByteVar>(), messagetext.rawAddress.toCPointer<ByteVar>(), bufferlength, textlength.rawAddress.toCPointer<ByteVar>())

public actual fun sQLGetDiagRecA(fhandletype: Short, handle: MutPtr<CVoid>, irecord: Short, szsqlstate: MutPtr<UByte>, pfnativeerror: MutPtr<Int>, szerrormsg: MutPtr<UByte>, cberrormsgmax: Short, pcberrormsg: MutPtr<Short>): Short =
    windowssysWindowsWin32SystemSearchSQLGetDiagRecA(fhandletype, handle.rawAddress.toCPointer<ByteVar>(), irecord, szsqlstate.rawAddress.toCPointer<ByteVar>(), pfnativeerror.rawAddress.toCPointer<ByteVar>(), szerrormsg.rawAddress.toCPointer<ByteVar>(), cberrormsgmax, pcberrormsg.rawAddress.toCPointer<ByteVar>())

public actual fun sQLGetDiagRecW(fhandletype: Short, handle: MutPtr<CVoid>, irecord: Short, szsqlstate: MutPtr<UShort>, pfnativeerror: MutPtr<Int>, szerrormsg: MutPtr<UShort>, ccherrormsgmax: Short, pccherrormsg: MutPtr<Short>): Short =
    windowssysWindowsWin32SystemSearchSQLGetDiagRecW(fhandletype, handle.rawAddress.toCPointer<ByteVar>(), irecord, szsqlstate.rawAddress.toCPointer<ByteVar>(), pfnativeerror.rawAddress.toCPointer<ByteVar>(), szerrormsg.rawAddress.toCPointer<ByteVar>(), ccherrormsgmax, pccherrormsg.rawAddress.toCPointer<ByteVar>())

public actual fun sQLGetEnvAttr(environmenthandle: MutPtr<CVoid>, attribute: Int, value: MutPtr<CVoid>, bufferlength: Int, stringlength: MutPtr<Int>): Short =
    windowssysWindowsWin32SystemSearchSQLGetEnvAttr(environmenthandle.rawAddress.toCPointer<ByteVar>(), attribute, value.rawAddress.toCPointer<ByteVar>(), bufferlength, stringlength.rawAddress.toCPointer<ByteVar>())

public actual fun sQLGetFunctions(connectionhandle: MutPtr<CVoid>, functionid: UShort, supported: MutPtr<UShort>): Short =
    windowssysWindowsWin32SystemSearchSQLGetFunctions(connectionhandle.rawAddress.toCPointer<ByteVar>(), functionid, supported.rawAddress.toCPointer<ByteVar>())

public actual fun sQLGetInfo(connectionhandle: MutPtr<CVoid>, infotype: UShort, infovalue: MutPtr<CVoid>, bufferlength: Short, stringlengthptr: MutPtr<Short>): Short =
    windowssysWindowsWin32SystemSearchSQLGetInfo(connectionhandle.rawAddress.toCPointer<ByteVar>(), infotype, infovalue.rawAddress.toCPointer<ByteVar>(), bufferlength, stringlengthptr.rawAddress.toCPointer<ByteVar>())

public actual fun sQLGetInfoA(hdbc: MutPtr<CVoid>, finfotype: UShort, rgbinfovalue: MutPtr<CVoid>, cbinfovaluemax: Short, pcbinfovalue: MutPtr<Short>): Short =
    windowssysWindowsWin32SystemSearchSQLGetInfoA(hdbc.rawAddress.toCPointer<ByteVar>(), finfotype, rgbinfovalue.rawAddress.toCPointer<ByteVar>(), cbinfovaluemax, pcbinfovalue.rawAddress.toCPointer<ByteVar>())

public actual fun sQLGetInfoW(hdbc: MutPtr<CVoid>, finfotype: UShort, rgbinfovalue: MutPtr<CVoid>, cbinfovaluemax: Short, pcbinfovalue: MutPtr<Short>): Short =
    windowssysWindowsWin32SystemSearchSQLGetInfoW(hdbc.rawAddress.toCPointer<ByteVar>(), finfotype, rgbinfovalue.rawAddress.toCPointer<ByteVar>(), cbinfovaluemax, pcbinfovalue.rawAddress.toCPointer<ByteVar>())

public actual fun sQLGetNextEnumeration(henumhandle: Handle, prgenumdata: MutPtr<UByte>, pienumlength: MutPtr<Int>): Short =
    windowssysWindowsWin32SystemSearchSQLGetNextEnumeration(henumhandle.rawAddress.toCPointer<ByteVar>(), prgenumdata.rawAddress.toCPointer<ByteVar>(), pienumlength.rawAddress.toCPointer<ByteVar>())

public actual fun sQLGetStmtAttr(statementhandle: MutPtr<CVoid>, attribute: Int, value: MutPtr<CVoid>, bufferlength: Int, stringlength: MutPtr<Int>): Short =
    windowssysWindowsWin32SystemSearchSQLGetStmtAttr(statementhandle.rawAddress.toCPointer<ByteVar>(), attribute, value.rawAddress.toCPointer<ByteVar>(), bufferlength, stringlength.rawAddress.toCPointer<ByteVar>())

public actual fun sQLGetStmtAttrA(hstmt: MutPtr<CVoid>, fattribute: Int, rgbvalue: MutPtr<CVoid>, cbvaluemax: Int, pcbvalue: MutPtr<Int>): Short =
    windowssysWindowsWin32SystemSearchSQLGetStmtAttrA(hstmt.rawAddress.toCPointer<ByteVar>(), fattribute, rgbvalue.rawAddress.toCPointer<ByteVar>(), cbvaluemax, pcbvalue.rawAddress.toCPointer<ByteVar>())

public actual fun sQLGetStmtAttrW(hstmt: MutPtr<CVoid>, fattribute: Int, rgbvalue: MutPtr<CVoid>, cbvaluemax: Int, pcbvalue: MutPtr<Int>): Short =
    windowssysWindowsWin32SystemSearchSQLGetStmtAttrW(hstmt.rawAddress.toCPointer<ByteVar>(), fattribute, rgbvalue.rawAddress.toCPointer<ByteVar>(), cbvaluemax, pcbvalue.rawAddress.toCPointer<ByteVar>())

public actual fun sQLGetStmtOption(statementhandle: MutPtr<CVoid>, option: UShort, value: MutPtr<CVoid>): Short =
    windowssysWindowsWin32SystemSearchSQLGetStmtOption(statementhandle.rawAddress.toCPointer<ByteVar>(), option, value.rawAddress.toCPointer<ByteVar>())

public actual fun sQLGetTypeInfo(statementhandle: MutPtr<CVoid>, datatype: Short): Short =
    windowssysWindowsWin32SystemSearchSQLGetTypeInfo(statementhandle.rawAddress.toCPointer<ByteVar>(), datatype)

public actual fun sQLGetTypeInfoA(statementhandle: MutPtr<CVoid>, datatype: Short): Short =
    windowssysWindowsWin32SystemSearchSQLGetTypeInfoA(statementhandle.rawAddress.toCPointer<ByteVar>(), datatype)

public actual fun sQLGetTypeInfoW(statementhandle: MutPtr<CVoid>, datatype: Short): Short =
    windowssysWindowsWin32SystemSearchSQLGetTypeInfoW(statementhandle.rawAddress.toCPointer<ByteVar>(), datatype)

public actual fun sQLInitEnumServers(pwchservername: Pcwstr, pwchinstancename: Pcwstr): Handle =
    MutPtr(windowssysWindowsWin32SystemSearchSQLInitEnumServers(pwchservername.rawAddress.toCPointer<ByteVar>(), pwchinstancename.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun sQLLinkedCatalogsA(param0: MutPtr<CVoid>, param1: Pcstr, param2: Short): Short =
    windowssysWindowsWin32SystemSearchSQLLinkedCatalogsA(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2)

public actual fun sQLLinkedCatalogsW(param0: MutPtr<CVoid>, param1: Pcwstr, param2: Short): Short =
    windowssysWindowsWin32SystemSearchSQLLinkedCatalogsW(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2)

public actual fun sQLLinkedServers(param0: MutPtr<CVoid>): Short =
    windowssysWindowsWin32SystemSearchSQLLinkedServers(param0.rawAddress.toCPointer<ByteVar>())

public actual fun sQLMoreResults(hstmt: MutPtr<CVoid>): Short =
    windowssysWindowsWin32SystemSearchSQLMoreResults(hstmt.rawAddress.toCPointer<ByteVar>())

public actual fun sQLNativeSql(hdbc: MutPtr<CVoid>, szsqlstrin: ConstPtr<UByte>, cchsqlstrin: Int, szsqlstr: MutPtr<UByte>, cchsqlstrmax: Int, pcbsqlstr: MutPtr<Int>): Short =
    windowssysWindowsWin32SystemSearchSQLNativeSql(hdbc.rawAddress.toCPointer<ByteVar>(), szsqlstrin.rawAddress.toCPointer<ByteVar>(), cchsqlstrin, szsqlstr.rawAddress.toCPointer<ByteVar>(), cchsqlstrmax, pcbsqlstr.rawAddress.toCPointer<ByteVar>())

public actual fun sQLNativeSqlA(hdbc: MutPtr<CVoid>, szsqlstrin: ConstPtr<UByte>, cbsqlstrin: Int, szsqlstr: MutPtr<UByte>, cbsqlstrmax: Int, pcbsqlstr: MutPtr<Int>): Short =
    windowssysWindowsWin32SystemSearchSQLNativeSqlA(hdbc.rawAddress.toCPointer<ByteVar>(), szsqlstrin.rawAddress.toCPointer<ByteVar>(), cbsqlstrin, szsqlstr.rawAddress.toCPointer<ByteVar>(), cbsqlstrmax, pcbsqlstr.rawAddress.toCPointer<ByteVar>())

public actual fun sQLNativeSqlW(hdbc: MutPtr<CVoid>, szsqlstrin: ConstPtr<UShort>, cchsqlstrin: Int, szsqlstr: MutPtr<UShort>, cchsqlstrmax: Int, pcchsqlstr: MutPtr<Int>): Short =
    windowssysWindowsWin32SystemSearchSQLNativeSqlW(hdbc.rawAddress.toCPointer<ByteVar>(), szsqlstrin.rawAddress.toCPointer<ByteVar>(), cchsqlstrin, szsqlstr.rawAddress.toCPointer<ByteVar>(), cchsqlstrmax, pcchsqlstr.rawAddress.toCPointer<ByteVar>())

public actual fun sQLNumParams(hstmt: MutPtr<CVoid>, pcpar: MutPtr<Short>): Short =
    windowssysWindowsWin32SystemSearchSQLNumParams(hstmt.rawAddress.toCPointer<ByteVar>(), pcpar.rawAddress.toCPointer<ByteVar>())

public actual fun sQLNumResultCols(statementhandle: MutPtr<CVoid>, columncount: MutPtr<Short>): Short =
    windowssysWindowsWin32SystemSearchSQLNumResultCols(statementhandle.rawAddress.toCPointer<ByteVar>(), columncount.rawAddress.toCPointer<ByteVar>())

public actual fun sQLParamData(statementhandle: MutPtr<CVoid>, value: MutPtr<MutPtr<CVoid>>): Short =
    windowssysWindowsWin32SystemSearchSQLParamData(statementhandle.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun sQLParamOptions(hstmt: MutPtr<CVoid>, crow: ULong, pirow: MutPtr<ULong>): Short =
    windowssysWindowsWin32SystemSearchSQLParamOptions(hstmt.rawAddress.toCPointer<ByteVar>(), crow, pirow.rawAddress.toCPointer<ByteVar>())

public actual fun sQLPrepare(statementhandle: MutPtr<CVoid>, statementtext: ConstPtr<UByte>, textlength: Int): Short =
    windowssysWindowsWin32SystemSearchSQLPrepare(statementhandle.rawAddress.toCPointer<ByteVar>(), statementtext.rawAddress.toCPointer<ByteVar>(), textlength)

public actual fun sQLPrepareA(hstmt: MutPtr<CVoid>, szsqlstr: ConstPtr<UByte>, cbsqlstr: Int): Short =
    windowssysWindowsWin32SystemSearchSQLPrepareA(hstmt.rawAddress.toCPointer<ByteVar>(), szsqlstr.rawAddress.toCPointer<ByteVar>(), cbsqlstr)

public actual fun sQLPrepareW(hstmt: MutPtr<CVoid>, szsqlstr: ConstPtr<UShort>, cchsqlstr: Int): Short =
    windowssysWindowsWin32SystemSearchSQLPrepareW(hstmt.rawAddress.toCPointer<ByteVar>(), szsqlstr.rawAddress.toCPointer<ByteVar>(), cchsqlstr)

public actual fun sQLPrimaryKeys(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UByte>, cchcatalogname: Short, szschemaname: ConstPtr<UByte>, cchschemaname: Short, sztablename: ConstPtr<UByte>, cchtablename: Short): Short =
    windowssysWindowsWin32SystemSearchSQLPrimaryKeys(hstmt.rawAddress.toCPointer<ByteVar>(), szcatalogname.rawAddress.toCPointer<ByteVar>(), cchcatalogname, szschemaname.rawAddress.toCPointer<ByteVar>(), cchschemaname, sztablename.rawAddress.toCPointer<ByteVar>(), cchtablename)

public actual fun sQLPrimaryKeysA(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UByte>, cbcatalogname: Short, szschemaname: ConstPtr<UByte>, cbschemaname: Short, sztablename: ConstPtr<UByte>, cbtablename: Short): Short =
    windowssysWindowsWin32SystemSearchSQLPrimaryKeysA(hstmt.rawAddress.toCPointer<ByteVar>(), szcatalogname.rawAddress.toCPointer<ByteVar>(), cbcatalogname, szschemaname.rawAddress.toCPointer<ByteVar>(), cbschemaname, sztablename.rawAddress.toCPointer<ByteVar>(), cbtablename)

public actual fun sQLPrimaryKeysW(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UShort>, cchcatalogname: Short, szschemaname: ConstPtr<UShort>, cchschemaname: Short, sztablename: ConstPtr<UShort>, cchtablename: Short): Short =
    windowssysWindowsWin32SystemSearchSQLPrimaryKeysW(hstmt.rawAddress.toCPointer<ByteVar>(), szcatalogname.rawAddress.toCPointer<ByteVar>(), cchcatalogname, szschemaname.rawAddress.toCPointer<ByteVar>(), cchschemaname, sztablename.rawAddress.toCPointer<ByteVar>(), cchtablename)

public actual fun sQLProcedureColumns(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UByte>, cchcatalogname: Short, szschemaname: ConstPtr<UByte>, cchschemaname: Short, szprocname: ConstPtr<UByte>, cchprocname: Short, szcolumnname: ConstPtr<UByte>, cchcolumnname: Short): Short =
    windowssysWindowsWin32SystemSearchSQLProcedureColumns(hstmt.rawAddress.toCPointer<ByteVar>(), szcatalogname.rawAddress.toCPointer<ByteVar>(), cchcatalogname, szschemaname.rawAddress.toCPointer<ByteVar>(), cchschemaname, szprocname.rawAddress.toCPointer<ByteVar>(), cchprocname, szcolumnname.rawAddress.toCPointer<ByteVar>(), cchcolumnname)

public actual fun sQLProcedureColumnsA(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UByte>, cbcatalogname: Short, szschemaname: ConstPtr<UByte>, cbschemaname: Short, szprocname: ConstPtr<UByte>, cbprocname: Short, szcolumnname: ConstPtr<UByte>, cbcolumnname: Short): Short =
    windowssysWindowsWin32SystemSearchSQLProcedureColumnsA(hstmt.rawAddress.toCPointer<ByteVar>(), szcatalogname.rawAddress.toCPointer<ByteVar>(), cbcatalogname, szschemaname.rawAddress.toCPointer<ByteVar>(), cbschemaname, szprocname.rawAddress.toCPointer<ByteVar>(), cbprocname, szcolumnname.rawAddress.toCPointer<ByteVar>(), cbcolumnname)

public actual fun sQLProcedureColumnsW(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UShort>, cchcatalogname: Short, szschemaname: ConstPtr<UShort>, cchschemaname: Short, szprocname: ConstPtr<UShort>, cchprocname: Short, szcolumnname: ConstPtr<UShort>, cchcolumnname: Short): Short =
    windowssysWindowsWin32SystemSearchSQLProcedureColumnsW(hstmt.rawAddress.toCPointer<ByteVar>(), szcatalogname.rawAddress.toCPointer<ByteVar>(), cchcatalogname, szschemaname.rawAddress.toCPointer<ByteVar>(), cchschemaname, szprocname.rawAddress.toCPointer<ByteVar>(), cchprocname, szcolumnname.rawAddress.toCPointer<ByteVar>(), cchcolumnname)

public actual fun sQLProcedures(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UByte>, cchcatalogname: Short, szschemaname: ConstPtr<UByte>, cchschemaname: Short, szprocname: ConstPtr<UByte>, cchprocname: Short): Short =
    windowssysWindowsWin32SystemSearchSQLProcedures(hstmt.rawAddress.toCPointer<ByteVar>(), szcatalogname.rawAddress.toCPointer<ByteVar>(), cchcatalogname, szschemaname.rawAddress.toCPointer<ByteVar>(), cchschemaname, szprocname.rawAddress.toCPointer<ByteVar>(), cchprocname)

public actual fun sQLProceduresA(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UByte>, cbcatalogname: Short, szschemaname: ConstPtr<UByte>, cbschemaname: Short, szprocname: ConstPtr<UByte>, cbprocname: Short): Short =
    windowssysWindowsWin32SystemSearchSQLProceduresA(hstmt.rawAddress.toCPointer<ByteVar>(), szcatalogname.rawAddress.toCPointer<ByteVar>(), cbcatalogname, szschemaname.rawAddress.toCPointer<ByteVar>(), cbschemaname, szprocname.rawAddress.toCPointer<ByteVar>(), cbprocname)

public actual fun sQLProceduresW(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UShort>, cchcatalogname: Short, szschemaname: ConstPtr<UShort>, cchschemaname: Short, szprocname: ConstPtr<UShort>, cchprocname: Short): Short =
    windowssysWindowsWin32SystemSearchSQLProceduresW(hstmt.rawAddress.toCPointer<ByteVar>(), szcatalogname.rawAddress.toCPointer<ByteVar>(), cchcatalogname, szschemaname.rawAddress.toCPointer<ByteVar>(), cchschemaname, szprocname.rawAddress.toCPointer<ByteVar>(), cchprocname)

public actual fun sQLPutData(statementhandle: MutPtr<CVoid>, data: ConstPtr<CVoid>, strlenOrInd: Long): Short =
    windowssysWindowsWin32SystemSearchSQLPutData(statementhandle.rawAddress.toCPointer<ByteVar>(), data.rawAddress.toCPointer<ByteVar>(), strlenOrInd)

public actual fun sQLRowCount(statementhandle: ConstPtr<CVoid>, rowcount: MutPtr<Long>): Short =
    windowssysWindowsWin32SystemSearchSQLRowCount(statementhandle.rawAddress.toCPointer<ByteVar>(), rowcount.rawAddress.toCPointer<ByteVar>())

public actual fun sQLSetConnectAttr(connectionhandle: MutPtr<CVoid>, attribute: Int, value: ConstPtr<CVoid>, stringlength: Int): Short =
    windowssysWindowsWin32SystemSearchSQLSetConnectAttr(connectionhandle.rawAddress.toCPointer<ByteVar>(), attribute, value.rawAddress.toCPointer<ByteVar>(), stringlength)

public actual fun sQLSetConnectAttrA(hdbc: MutPtr<CVoid>, fattribute: Int, rgbvalue: ConstPtr<CVoid>, cbvalue: Int): Short =
    windowssysWindowsWin32SystemSearchSQLSetConnectAttrA(hdbc.rawAddress.toCPointer<ByteVar>(), fattribute, rgbvalue.rawAddress.toCPointer<ByteVar>(), cbvalue)

public actual fun sQLSetConnectAttrW(hdbc: MutPtr<CVoid>, fattribute: Int, rgbvalue: ConstPtr<CVoid>, cbvalue: Int): Short =
    windowssysWindowsWin32SystemSearchSQLSetConnectAttrW(hdbc.rawAddress.toCPointer<ByteVar>(), fattribute, rgbvalue.rawAddress.toCPointer<ByteVar>(), cbvalue)

public actual fun sQLSetConnectOption(connectionhandle: MutPtr<CVoid>, option: UShort, value: ULong): Short =
    windowssysWindowsWin32SystemSearchSQLSetConnectOption(connectionhandle.rawAddress.toCPointer<ByteVar>(), option, value)

public actual fun sQLSetConnectOptionA(hdbc: MutPtr<CVoid>, foption: UShort, vparam: ULong): Short =
    windowssysWindowsWin32SystemSearchSQLSetConnectOptionA(hdbc.rawAddress.toCPointer<ByteVar>(), foption, vparam)

public actual fun sQLSetConnectOptionW(hdbc: MutPtr<CVoid>, foption: UShort, vparam: ULong): Short =
    windowssysWindowsWin32SystemSearchSQLSetConnectOptionW(hdbc.rawAddress.toCPointer<ByteVar>(), foption, vparam)

public actual fun sQLSetCursorName(statementhandle: MutPtr<CVoid>, cursorname: ConstPtr<UByte>, namelength: Short): Short =
    windowssysWindowsWin32SystemSearchSQLSetCursorName(statementhandle.rawAddress.toCPointer<ByteVar>(), cursorname.rawAddress.toCPointer<ByteVar>(), namelength)

public actual fun sQLSetCursorNameA(hstmt: MutPtr<CVoid>, szcursor: ConstPtr<UByte>, cbcursor: Short): Short =
    windowssysWindowsWin32SystemSearchSQLSetCursorNameA(hstmt.rawAddress.toCPointer<ByteVar>(), szcursor.rawAddress.toCPointer<ByteVar>(), cbcursor)

public actual fun sQLSetCursorNameW(hstmt: MutPtr<CVoid>, szcursor: ConstPtr<UShort>, cchcursor: Short): Short =
    windowssysWindowsWin32SystemSearchSQLSetCursorNameW(hstmt.rawAddress.toCPointer<ByteVar>(), szcursor.rawAddress.toCPointer<ByteVar>(), cchcursor)

public actual fun sQLSetDescField(descriptorhandle: MutPtr<CVoid>, recnumber: Short, fieldidentifier: Short, value: ConstPtr<CVoid>, bufferlength: Int): Short =
    windowssysWindowsWin32SystemSearchSQLSetDescField(descriptorhandle.rawAddress.toCPointer<ByteVar>(), recnumber, fieldidentifier, value.rawAddress.toCPointer<ByteVar>(), bufferlength)

public actual fun sQLSetDescFieldW(descriptorhandle: MutPtr<CVoid>, recnumber: Short, fieldidentifier: Short, value: MutPtr<CVoid>, bufferlength: Int): Short =
    windowssysWindowsWin32SystemSearchSQLSetDescFieldW(descriptorhandle.rawAddress.toCPointer<ByteVar>(), recnumber, fieldidentifier, value.rawAddress.toCPointer<ByteVar>(), bufferlength)

public actual fun sQLSetDescRec(descriptorhandle: MutPtr<CVoid>, recnumber: Short, type: Short, subtype: Short, length: Long, precision: Short, scale: Short, data: MutPtr<CVoid>, stringlength: MutPtr<Long>, indicator: MutPtr<Long>): Short =
    windowssysWindowsWin32SystemSearchSQLSetDescRec(descriptorhandle.rawAddress.toCPointer<ByteVar>(), recnumber, type, subtype, length, precision, scale, data.rawAddress.toCPointer<ByteVar>(), stringlength.rawAddress.toCPointer<ByteVar>(), indicator.rawAddress.toCPointer<ByteVar>())

public actual fun sQLSetEnvAttr(environmenthandle: MutPtr<CVoid>, attribute: Int, value: ConstPtr<CVoid>, stringlength: Int): Short =
    windowssysWindowsWin32SystemSearchSQLSetEnvAttr(environmenthandle.rawAddress.toCPointer<ByteVar>(), attribute, value.rawAddress.toCPointer<ByteVar>(), stringlength)

public actual fun sQLSetParam(statementhandle: MutPtr<CVoid>, parameternumber: UShort, valuetype: Short, parametertype: Short, lengthprecision: ULong, parameterscale: Short, parametervalue: ConstPtr<CVoid>, strlenOrInd: MutPtr<Long>): Short =
    windowssysWindowsWin32SystemSearchSQLSetParam(statementhandle.rawAddress.toCPointer<ByteVar>(), parameternumber, valuetype, parametertype, lengthprecision, parameterscale, parametervalue.rawAddress.toCPointer<ByteVar>(), strlenOrInd.rawAddress.toCPointer<ByteVar>())

public actual fun sQLSetPos(hstmt: MutPtr<CVoid>, irow: ULong, foption: UShort, flock: UShort): Short =
    windowssysWindowsWin32SystemSearchSQLSetPos(hstmt.rawAddress.toCPointer<ByteVar>(), irow, foption, flock)

public actual fun sQLSetScrollOptions(hstmt: MutPtr<CVoid>, fconcurrency: UShort, crowkeyset: Long, crowrowset: UShort): Short =
    windowssysWindowsWin32SystemSearchSQLSetScrollOptions(hstmt.rawAddress.toCPointer<ByteVar>(), fconcurrency, crowkeyset, crowrowset)

public actual fun sQLSetStmtAttr(statementhandle: MutPtr<CVoid>, attribute: Int, value: ConstPtr<CVoid>, stringlength: Int): Short =
    windowssysWindowsWin32SystemSearchSQLSetStmtAttr(statementhandle.rawAddress.toCPointer<ByteVar>(), attribute, value.rawAddress.toCPointer<ByteVar>(), stringlength)

public actual fun sQLSetStmtAttrW(hstmt: MutPtr<CVoid>, fattribute: Int, rgbvalue: MutPtr<CVoid>, cbvaluemax: Int): Short =
    windowssysWindowsWin32SystemSearchSQLSetStmtAttrW(hstmt.rawAddress.toCPointer<ByteVar>(), fattribute, rgbvalue.rawAddress.toCPointer<ByteVar>(), cbvaluemax)

public actual fun sQLSetStmtOption(statementhandle: MutPtr<CVoid>, option: UShort, value: ULong): Short =
    windowssysWindowsWin32SystemSearchSQLSetStmtOption(statementhandle.rawAddress.toCPointer<ByteVar>(), option, value)

public actual fun sQLSpecialColumns(statementhandle: MutPtr<CVoid>, identifiertype: UShort, catalogname: ConstPtr<UByte>, namelength1: Short, schemaname: ConstPtr<UByte>, namelength2: Short, tablename: ConstPtr<UByte>, namelength3: Short, scope: UShort, nullable: UShort): Short =
    windowssysWindowsWin32SystemSearchSQLSpecialColumns(statementhandle.rawAddress.toCPointer<ByteVar>(), identifiertype, catalogname.rawAddress.toCPointer<ByteVar>(), namelength1, schemaname.rawAddress.toCPointer<ByteVar>(), namelength2, tablename.rawAddress.toCPointer<ByteVar>(), namelength3, scope, nullable)

public actual fun sQLSpecialColumnsA(hstmt: MutPtr<CVoid>, fcoltype: UShort, szcatalogname: ConstPtr<UByte>, cbcatalogname: Short, szschemaname: ConstPtr<UByte>, cbschemaname: Short, sztablename: ConstPtr<UByte>, cbtablename: Short, fscope: UShort, fnullable: UShort): Short =
    windowssysWindowsWin32SystemSearchSQLSpecialColumnsA(hstmt.rawAddress.toCPointer<ByteVar>(), fcoltype, szcatalogname.rawAddress.toCPointer<ByteVar>(), cbcatalogname, szschemaname.rawAddress.toCPointer<ByteVar>(), cbschemaname, sztablename.rawAddress.toCPointer<ByteVar>(), cbtablename, fscope, fnullable)

public actual fun sQLSpecialColumnsW(hstmt: MutPtr<CVoid>, fcoltype: UShort, szcatalogname: ConstPtr<UShort>, cchcatalogname: Short, szschemaname: ConstPtr<UShort>, cchschemaname: Short, sztablename: ConstPtr<UShort>, cchtablename: Short, fscope: UShort, fnullable: UShort): Short =
    windowssysWindowsWin32SystemSearchSQLSpecialColumnsW(hstmt.rawAddress.toCPointer<ByteVar>(), fcoltype, szcatalogname.rawAddress.toCPointer<ByteVar>(), cchcatalogname, szschemaname.rawAddress.toCPointer<ByteVar>(), cchschemaname, sztablename.rawAddress.toCPointer<ByteVar>(), cchtablename, fscope, fnullable)

public actual fun sQLStatistics(statementhandle: MutPtr<CVoid>, catalogname: ConstPtr<UByte>, namelength1: Short, schemaname: ConstPtr<UByte>, namelength2: Short, tablename: ConstPtr<UByte>, namelength3: Short, unique: UShort, reserved: UShort): Short =
    windowssysWindowsWin32SystemSearchSQLStatistics(statementhandle.rawAddress.toCPointer<ByteVar>(), catalogname.rawAddress.toCPointer<ByteVar>(), namelength1, schemaname.rawAddress.toCPointer<ByteVar>(), namelength2, tablename.rawAddress.toCPointer<ByteVar>(), namelength3, unique, reserved)

public actual fun sQLStatisticsA(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UByte>, cbcatalogname: Short, szschemaname: ConstPtr<UByte>, cbschemaname: Short, sztablename: ConstPtr<UByte>, cbtablename: Short, funique: UShort, faccuracy: UShort): Short =
    windowssysWindowsWin32SystemSearchSQLStatisticsA(hstmt.rawAddress.toCPointer<ByteVar>(), szcatalogname.rawAddress.toCPointer<ByteVar>(), cbcatalogname, szschemaname.rawAddress.toCPointer<ByteVar>(), cbschemaname, sztablename.rawAddress.toCPointer<ByteVar>(), cbtablename, funique, faccuracy)

public actual fun sQLStatisticsW(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UShort>, cchcatalogname: Short, szschemaname: ConstPtr<UShort>, cchschemaname: Short, sztablename: ConstPtr<UShort>, cchtablename: Short, funique: UShort, faccuracy: UShort): Short =
    windowssysWindowsWin32SystemSearchSQLStatisticsW(hstmt.rawAddress.toCPointer<ByteVar>(), szcatalogname.rawAddress.toCPointer<ByteVar>(), cchcatalogname, szschemaname.rawAddress.toCPointer<ByteVar>(), cchschemaname, sztablename.rawAddress.toCPointer<ByteVar>(), cchtablename, funique, faccuracy)

public actual fun sQLTablePrivileges(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UByte>, cchcatalogname: Short, szschemaname: ConstPtr<UByte>, cchschemaname: Short, sztablename: ConstPtr<UByte>, cchtablename: Short): Short =
    windowssysWindowsWin32SystemSearchSQLTablePrivileges(hstmt.rawAddress.toCPointer<ByteVar>(), szcatalogname.rawAddress.toCPointer<ByteVar>(), cchcatalogname, szschemaname.rawAddress.toCPointer<ByteVar>(), cchschemaname, sztablename.rawAddress.toCPointer<ByteVar>(), cchtablename)

public actual fun sQLTablePrivilegesA(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UByte>, cbcatalogname: Short, szschemaname: ConstPtr<UByte>, cbschemaname: Short, sztablename: ConstPtr<UByte>, cbtablename: Short): Short =
    windowssysWindowsWin32SystemSearchSQLTablePrivilegesA(hstmt.rawAddress.toCPointer<ByteVar>(), szcatalogname.rawAddress.toCPointer<ByteVar>(), cbcatalogname, szschemaname.rawAddress.toCPointer<ByteVar>(), cbschemaname, sztablename.rawAddress.toCPointer<ByteVar>(), cbtablename)

public actual fun sQLTablePrivilegesW(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UShort>, cchcatalogname: Short, szschemaname: ConstPtr<UShort>, cchschemaname: Short, sztablename: ConstPtr<UShort>, cchtablename: Short): Short =
    windowssysWindowsWin32SystemSearchSQLTablePrivilegesW(hstmt.rawAddress.toCPointer<ByteVar>(), szcatalogname.rawAddress.toCPointer<ByteVar>(), cchcatalogname, szschemaname.rawAddress.toCPointer<ByteVar>(), cchschemaname, sztablename.rawAddress.toCPointer<ByteVar>(), cchtablename)

public actual fun sQLTables(statementhandle: MutPtr<CVoid>, catalogname: ConstPtr<UByte>, namelength1: Short, schemaname: ConstPtr<UByte>, namelength2: Short, tablename: ConstPtr<UByte>, namelength3: Short, tabletype: ConstPtr<UByte>, namelength4: Short): Short =
    windowssysWindowsWin32SystemSearchSQLTables(statementhandle.rawAddress.toCPointer<ByteVar>(), catalogname.rawAddress.toCPointer<ByteVar>(), namelength1, schemaname.rawAddress.toCPointer<ByteVar>(), namelength2, tablename.rawAddress.toCPointer<ByteVar>(), namelength3, tabletype.rawAddress.toCPointer<ByteVar>(), namelength4)

public actual fun sQLTablesA(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UByte>, cbcatalogname: Short, szschemaname: ConstPtr<UByte>, cbschemaname: Short, sztablename: ConstPtr<UByte>, cbtablename: Short, sztabletype: ConstPtr<UByte>, cbtabletype: Short): Short =
    windowssysWindowsWin32SystemSearchSQLTablesA(hstmt.rawAddress.toCPointer<ByteVar>(), szcatalogname.rawAddress.toCPointer<ByteVar>(), cbcatalogname, szschemaname.rawAddress.toCPointer<ByteVar>(), cbschemaname, sztablename.rawAddress.toCPointer<ByteVar>(), cbtablename, sztabletype.rawAddress.toCPointer<ByteVar>(), cbtabletype)

public actual fun sQLTablesW(hstmt: MutPtr<CVoid>, szcatalogname: ConstPtr<UShort>, cchcatalogname: Short, szschemaname: ConstPtr<UShort>, cchschemaname: Short, sztablename: ConstPtr<UShort>, cchtablename: Short, sztabletype: ConstPtr<UShort>, cchtabletype: Short): Short =
    windowssysWindowsWin32SystemSearchSQLTablesW(hstmt.rawAddress.toCPointer<ByteVar>(), szcatalogname.rawAddress.toCPointer<ByteVar>(), cchcatalogname, szschemaname.rawAddress.toCPointer<ByteVar>(), cchschemaname, sztablename.rawAddress.toCPointer<ByteVar>(), cchtablename, sztabletype.rawAddress.toCPointer<ByteVar>(), cchtabletype)

public actual fun sQLTransact(environmenthandle: MutPtr<CVoid>, connectionhandle: MutPtr<CVoid>, completiontype: UShort): Short =
    windowssysWindowsWin32SystemSearchSQLTransact(environmenthandle.rawAddress.toCPointer<ByteVar>(), connectionhandle.rawAddress.toCPointer<ByteVar>(), completiontype)

public actual fun bcpBatch(param0: MutPtr<CVoid>): Int =
    windowssysWindowsWin32SystemSearchBcpBatch(param0.rawAddress.toCPointer<ByteVar>())

public actual fun bcpBind(param0: MutPtr<CVoid>, param1: MutPtr<UByte>, param2: Int, param3: Int, param4: MutPtr<UByte>, param5: Int, param6: Int, param7: Int): Short =
    windowssysWindowsWin32SystemSearchBcpBind(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2, param3, param4.rawAddress.toCPointer<ByteVar>(), param5, param6, param7)

public actual fun bcpColfmt(param0: MutPtr<CVoid>, param1: Int, param2: UByte, param3: Int, param4: Int, param5: MutPtr<UByte>, param6: Int, param7: Int): Short =
    windowssysWindowsWin32SystemSearchBcpColfmt(param0.rawAddress.toCPointer<ByteVar>(), param1, param2, param3, param4, param5.rawAddress.toCPointer<ByteVar>(), param6, param7)

public actual fun bcpCollen(param0: MutPtr<CVoid>, param1: Int, param2: Int): Short =
    windowssysWindowsWin32SystemSearchBcpCollen(param0.rawAddress.toCPointer<ByteVar>(), param1, param2)

public actual fun bcpColptr(param0: MutPtr<CVoid>, param1: MutPtr<UByte>, param2: Int): Short =
    windowssysWindowsWin32SystemSearchBcpColptr(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2)

public actual fun bcpColumns(param0: MutPtr<CVoid>, param1: Int): Short =
    windowssysWindowsWin32SystemSearchBcpColumns(param0.rawAddress.toCPointer<ByteVar>(), param1)

public actual fun bcpControl(param0: MutPtr<CVoid>, param1: Int, param2: MutPtr<CVoid>): Short =
    windowssysWindowsWin32SystemSearchBcpControl(param0.rawAddress.toCPointer<ByteVar>(), param1, param2.rawAddress.toCPointer<ByteVar>())

public actual fun bcpDone(param0: MutPtr<CVoid>): Int =
    windowssysWindowsWin32SystemSearchBcpDone(param0.rawAddress.toCPointer<ByteVar>())

public actual fun bcpExec(param0: MutPtr<CVoid>, param1: MutPtr<Int>): Short =
    windowssysWindowsWin32SystemSearchBcpExec(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>())

public actual fun bcpGetcolfmt(param0: MutPtr<CVoid>, param1: Int, param2: Int, param3: MutPtr<CVoid>, param4: Int, param5: MutPtr<Int>): Short =
    windowssysWindowsWin32SystemSearchBcpGetcolfmt(param0.rawAddress.toCPointer<ByteVar>(), param1, param2, param3.rawAddress.toCPointer<ByteVar>(), param4, param5.rawAddress.toCPointer<ByteVar>())

public actual fun bcpInitA(param0: MutPtr<CVoid>, param1: Pcstr, param2: Pcstr, param3: Pcstr, param4: Int): Short =
    windowssysWindowsWin32SystemSearchBcpInitA(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2.rawAddress.toCPointer<ByteVar>(), param3.rawAddress.toCPointer<ByteVar>(), param4)

public actual fun bcpInitW(param0: MutPtr<CVoid>, param1: Pcwstr, param2: Pcwstr, param3: Pcwstr, param4: Int): Short =
    windowssysWindowsWin32SystemSearchBcpInitW(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2.rawAddress.toCPointer<ByteVar>(), param3.rawAddress.toCPointer<ByteVar>(), param4)

public actual fun bcpMoretext(param0: MutPtr<CVoid>, param1: Int, param2: MutPtr<UByte>): Short =
    windowssysWindowsWin32SystemSearchBcpMoretext(param0.rawAddress.toCPointer<ByteVar>(), param1, param2.rawAddress.toCPointer<ByteVar>())

public actual fun bcpReadfmtA(param0: MutPtr<CVoid>, param1: Pcstr): Short =
    windowssysWindowsWin32SystemSearchBcpReadfmtA(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>())

public actual fun bcpReadfmtW(param0: MutPtr<CVoid>, param1: Pcwstr): Short =
    windowssysWindowsWin32SystemSearchBcpReadfmtW(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>())

public actual fun bcpSendrow(param0: MutPtr<CVoid>): Short =
    windowssysWindowsWin32SystemSearchBcpSendrow(param0.rawAddress.toCPointer<ByteVar>())

public actual fun bcpSetcolfmt(param0: MutPtr<CVoid>, param1: Int, param2: Int, param3: MutPtr<CVoid>, param4: Int): Short =
    windowssysWindowsWin32SystemSearchBcpSetcolfmt(param0.rawAddress.toCPointer<ByteVar>(), param1, param2, param3.rawAddress.toCPointer<ByteVar>(), param4)

public actual fun bcpWritefmtA(param0: MutPtr<CVoid>, param1: Pcstr): Short =
    windowssysWindowsWin32SystemSearchBcpWritefmtA(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>())

public actual fun bcpWritefmtW(param0: MutPtr<CVoid>, param1: Pcwstr): Short =
    windowssysWindowsWin32SystemSearchBcpWritefmtW(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>())

public actual fun dbprtypeA(param0: Int): Pstr =
    MutPtr(windowssysWindowsWin32SystemSearchDbprtypeA(param0)?.toLong() ?: 0L)

public actual fun dbprtypeW(param0: Int): Pwstr =
    MutPtr(windowssysWindowsWin32SystemSearchDbprtypeW(param0)?.toLong() ?: 0L)
