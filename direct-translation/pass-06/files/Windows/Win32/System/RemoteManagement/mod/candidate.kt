// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsmsvc.dll, ABI=system, export=WSManCloseCommand; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WSManCloseCommand`(`commandhandle` : `WSMAN_COMMAND_HANDLE`, `flags` : UInt, `async` : /* Rust *const */ kotlinx.cinterop.CPointer<`WSMAN_SHELL_ASYNC`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsmsvc.dll, ABI=system, export=WSManCloseOperation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WSManCloseOperation`(`operationhandle` : `WSMAN_OPERATION_HANDLE`, `flags` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsmsvc.dll, ABI=system, export=WSManCloseSession; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WSManCloseSession`(`session` : `WSMAN_SESSION_HANDLE`, `flags` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsmsvc.dll, ABI=system, export=WSManCloseShell; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WSManCloseShell`(`shellhandle` : `WSMAN_SHELL_HANDLE`, `flags` : UInt, `async` : /* Rust *const */ kotlinx.cinterop.CPointer<`WSMAN_SHELL_ASYNC`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsmsvc.dll, ABI=system, export=WSManConnectShell; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WSManConnectShell`(`session` : `WSMAN_SESSION_HANDLE`, `flags` : UInt, `resourceuri` : `windows_sys`.`core`.`PCWSTR`, `shellid` : `windows_sys`.`core`.`PCWSTR`, `options` : /* Rust *const */ kotlinx.cinterop.CPointer<`WSMAN_OPTION_SET`>?, `connectxml` : /* Rust *const */ kotlinx.cinterop.CPointer<`WSMAN_DATA`>?, `async` : /* Rust *const */ kotlinx.cinterop.CPointer<`WSMAN_SHELL_ASYNC`>?, `shell` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WSMAN_SHELL_HANDLE`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsmsvc.dll, ABI=system, export=WSManConnectShellCommand; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WSManConnectShellCommand`(`shell` : `WSMAN_SHELL_HANDLE`, `flags` : UInt, `commandid` : `windows_sys`.`core`.`PCWSTR`, `options` : /* Rust *const */ kotlinx.cinterop.CPointer<`WSMAN_OPTION_SET`>?, `connectxml` : /* Rust *const */ kotlinx.cinterop.CPointer<`WSMAN_DATA`>?, `async` : /* Rust *const */ kotlinx.cinterop.CPointer<`WSMAN_SHELL_ASYNC`>?, `command` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WSMAN_COMMAND_HANDLE`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsmsvc.dll, ABI=system, export=WSManCreateSession; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WSManCreateSession`(`apihandle` : `WSMAN_API_HANDLE`, `connection` : `windows_sys`.`core`.`PCWSTR`, `flags` : UInt, `serverauthenticationcredentials` : /* Rust *const */ kotlinx.cinterop.CPointer<`WSMAN_AUTHENTICATION_CREDENTIALS`>?, `proxyinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`WSMAN_PROXY_INFO`>?, `session` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WSMAN_SESSION_HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsmsvc.dll, ABI=system, export=WSManCreateShell; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WSManCreateShell`(`session` : `WSMAN_SESSION_HANDLE`, `flags` : UInt, `resourceuri` : `windows_sys`.`core`.`PCWSTR`, `startupinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`WSMAN_SHELL_STARTUP_INFO_V11`>?, `options` : /* Rust *const */ kotlinx.cinterop.CPointer<`WSMAN_OPTION_SET`>?, `createxml` : /* Rust *const */ kotlinx.cinterop.CPointer<`WSMAN_DATA`>?, `async` : /* Rust *const */ kotlinx.cinterop.CPointer<`WSMAN_SHELL_ASYNC`>?, `shell` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WSMAN_SHELL_HANDLE`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsmsvc.dll, ABI=system, export=WSManCreateShellEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WSManCreateShellEx`(`session` : `WSMAN_SESSION_HANDLE`, `flags` : UInt, `resourceuri` : `windows_sys`.`core`.`PCWSTR`, `shellid` : `windows_sys`.`core`.`PCWSTR`, `startupinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`WSMAN_SHELL_STARTUP_INFO_V11`>?, `options` : /* Rust *const */ kotlinx.cinterop.CPointer<`WSMAN_OPTION_SET`>?, `createxml` : /* Rust *const */ kotlinx.cinterop.CPointer<`WSMAN_DATA`>?, `async` : /* Rust *const */ kotlinx.cinterop.CPointer<`WSMAN_SHELL_ASYNC`>?, `shell` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WSMAN_SHELL_HANDLE`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsmsvc.dll, ABI=system, export=WSManDeinitialize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WSManDeinitialize`(`apihandle` : `WSMAN_API_HANDLE`, `flags` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsmsvc.dll, ABI=system, export=WSManDisconnectShell; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WSManDisconnectShell`(`shell` : `WSMAN_SHELL_HANDLE`, `flags` : UInt, `disconnectinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`WSMAN_SHELL_DISCONNECT_INFO`>?, `async` : /* Rust *const */ kotlinx.cinterop.CPointer<`WSMAN_SHELL_ASYNC`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsmsvc.dll, ABI=system, export=WSManGetErrorMessage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WSManGetErrorMessage`(`apihandle` : `WSMAN_API_HANDLE`, `flags` : UInt, `languagecode` : `windows_sys`.`core`.`PCWSTR`, `errorcode` : UInt, `messagelength` : UInt, `message` : `windows_sys`.`core`.`PWSTR`, `messagelengthused` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsmsvc.dll, ABI=system, export=WSManGetSessionOptionAsDword; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WSManGetSessionOptionAsDword`(`session` : `WSMAN_SESSION_HANDLE`, `option` : `WSManSessionOption`, `value` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsmsvc.dll, ABI=system, export=WSManGetSessionOptionAsString; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WSManGetSessionOptionAsString`(`session` : `WSMAN_SESSION_HANDLE`, `option` : `WSManSessionOption`, `stringlength` : UInt, `string` : `windows_sys`.`core`.`PWSTR`, `stringlengthused` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsmsvc.dll, ABI=system, export=WSManInitialize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WSManInitialize`(`flags` : UInt, `apihandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WSMAN_API_HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsmsvc.dll, ABI=system, export=WSManPluginAuthzOperationComplete; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WSManPluginAuthzOperationComplete`(`senderdetails` : /* Rust *const */ kotlinx.cinterop.CPointer<`WSMAN_SENDER_DETAILS`>?, `flags` : UInt, `userauthorizationcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `errorcode` : UInt, `extendederrorinformation` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsmsvc.dll, ABI=system, export=WSManPluginAuthzQueryQuotaComplete; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WSManPluginAuthzQueryQuotaComplete`(`senderdetails` : /* Rust *const */ kotlinx.cinterop.CPointer<`WSMAN_SENDER_DETAILS`>?, `flags` : UInt, `quota` : /* Rust *const */ kotlinx.cinterop.CPointer<`WSMAN_AUTHZ_QUOTA`>?, `errorcode` : UInt, `extendederrorinformation` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsmsvc.dll, ABI=system, export=WSManPluginAuthzUserComplete; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WSManPluginAuthzUserComplete`(`senderdetails` : /* Rust *const */ kotlinx.cinterop.CPointer<`WSMAN_SENDER_DETAILS`>?, `flags` : UInt, `userauthorizationcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `impersonationtoken` : `super`.`super`.`Foundation`.`HANDLE`, `userisadministrator` : `windows_sys`.`core`.`BOOL`, `errorcode` : UInt, `extendederrorinformation` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsmsvc.dll, ABI=system, export=WSManPluginFreeRequestDetails; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WSManPluginFreeRequestDetails`(`requestdetails` : /* Rust *const */ kotlinx.cinterop.CPointer<`WSMAN_PLUGIN_REQUEST`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsmsvc.dll, ABI=system, export=WSManPluginGetConfiguration; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WSManPluginGetConfiguration`(`plugincontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `flags` : UInt, `data` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WSMAN_DATA`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsmsvc.dll, ABI=system, export=WSManPluginGetOperationParameters; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WSManPluginGetOperationParameters`(`requestdetails` : /* Rust *const */ kotlinx.cinterop.CPointer<`WSMAN_PLUGIN_REQUEST`>?, `flags` : UInt, `data` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WSMAN_DATA`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsmsvc.dll, ABI=system, export=WSManPluginOperationComplete; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WSManPluginOperationComplete`(`requestdetails` : /* Rust *const */ kotlinx.cinterop.CPointer<`WSMAN_PLUGIN_REQUEST`>?, `flags` : UInt, `errorcode` : UInt, `extendedinformation` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsmsvc.dll, ABI=system, export=WSManPluginReceiveResult; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WSManPluginReceiveResult`(`requestdetails` : /* Rust *const */ kotlinx.cinterop.CPointer<`WSMAN_PLUGIN_REQUEST`>?, `flags` : UInt, `stream` : `windows_sys`.`core`.`PCWSTR`, `streamresult` : /* Rust *const */ kotlinx.cinterop.CPointer<`WSMAN_DATA`>?, `commandstate` : `windows_sys`.`core`.`PCWSTR`, `exitcode` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsmsvc.dll, ABI=system, export=WSManPluginReportCompletion; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WSManPluginReportCompletion`(`plugincontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `flags` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsmsvc.dll, ABI=system, export=WSManPluginReportContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WSManPluginReportContext`(`requestdetails` : /* Rust *const */ kotlinx.cinterop.CPointer<`WSMAN_PLUGIN_REQUEST`>?, `flags` : UInt, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsmsvc.dll, ABI=system, export=WSManReceiveShellOutput; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WSManReceiveShellOutput`(`shell` : `WSMAN_SHELL_HANDLE`, `command` : `WSMAN_COMMAND_HANDLE`, `flags` : UInt, `desiredstreamset` : /* Rust *const */ kotlinx.cinterop.CPointer<`WSMAN_STREAM_ID_SET`>?, `async` : /* Rust *const */ kotlinx.cinterop.CPointer<`WSMAN_SHELL_ASYNC`>?, `receiveoperation` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WSMAN_OPERATION_HANDLE`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsmsvc.dll, ABI=system, export=WSManReconnectShell; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WSManReconnectShell`(`shell` : `WSMAN_SHELL_HANDLE`, `flags` : UInt, `async` : /* Rust *const */ kotlinx.cinterop.CPointer<`WSMAN_SHELL_ASYNC`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsmsvc.dll, ABI=system, export=WSManReconnectShellCommand; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WSManReconnectShellCommand`(`commandhandle` : `WSMAN_COMMAND_HANDLE`, `flags` : UInt, `async` : /* Rust *const */ kotlinx.cinterop.CPointer<`WSMAN_SHELL_ASYNC`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsmsvc.dll, ABI=system, export=WSManRunShellCommand; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WSManRunShellCommand`(`shell` : `WSMAN_SHELL_HANDLE`, `flags` : UInt, `commandline` : `windows_sys`.`core`.`PCWSTR`, `args` : /* Rust *const */ kotlinx.cinterop.CPointer<`WSMAN_COMMAND_ARG_SET`>?, `options` : /* Rust *const */ kotlinx.cinterop.CPointer<`WSMAN_OPTION_SET`>?, `async` : /* Rust *const */ kotlinx.cinterop.CPointer<`WSMAN_SHELL_ASYNC`>?, `command` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WSMAN_COMMAND_HANDLE`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsmsvc.dll, ABI=system, export=WSManRunShellCommandEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WSManRunShellCommandEx`(`shell` : `WSMAN_SHELL_HANDLE`, `flags` : UInt, `commandid` : `windows_sys`.`core`.`PCWSTR`, `commandline` : `windows_sys`.`core`.`PCWSTR`, `args` : /* Rust *const */ kotlinx.cinterop.CPointer<`WSMAN_COMMAND_ARG_SET`>?, `options` : /* Rust *const */ kotlinx.cinterop.CPointer<`WSMAN_OPTION_SET`>?, `async` : /* Rust *const */ kotlinx.cinterop.CPointer<`WSMAN_SHELL_ASYNC`>?, `command` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WSMAN_COMMAND_HANDLE`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsmsvc.dll, ABI=system, export=WSManSendShellInput; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WSManSendShellInput`(`shell` : `WSMAN_SHELL_HANDLE`, `command` : `WSMAN_COMMAND_HANDLE`, `flags` : UInt, `streamid` : `windows_sys`.`core`.`PCWSTR`, `streamdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`WSMAN_DATA`>?, `endofstream` : `windows_sys`.`core`.`BOOL`, `async` : /* Rust *const */ kotlinx.cinterop.CPointer<`WSMAN_SHELL_ASYNC`>?, `sendoperation` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WSMAN_OPERATION_HANDLE`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsmsvc.dll, ABI=system, export=WSManSetSessionOption; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WSManSetSessionOption`(`session` : `WSMAN_SESSION_HANDLE`, `option` : `WSManSessionOption`, `data` : /* Rust *const */ kotlinx.cinterop.CPointer<`WSMAN_DATA`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsmsvc.dll, ABI=system, export=WSManSignalShell; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WSManSignalShell`(`shell` : `WSMAN_SHELL_HANDLE`, `command` : `WSMAN_COMMAND_HANDLE`, `flags` : UInt, `code` : `windows_sys`.`core`.`PCWSTR`, `async` : /* Rust *const */ kotlinx.cinterop.CPointer<`WSMAN_SHELL_ASYNC`>?, `signaloperation` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WSMAN_OPERATION_HANDLE`>?)
public const val `ERROR_REDIRECT_LOCATION_INVALID`: UInt = 2150859191u;
public const val `ERROR_REDIRECT_LOCATION_TOO_LONG`: UInt = 2150859190u;
public const val `ERROR_SERVICE_CBT_HARDENING_INVALID`: UInt = 2150859192u;
public const val `ERROR_WINRS_CLIENT_CLOSERECEIVEHANDLE_NULL_PARAM`: UInt = 2150859058u;
public const val `ERROR_WINRS_CLIENT_CLOSESENDHANDLE_NULL_PARAM`: UInt = 2150859061u;
public const val `ERROR_WINRS_CLIENT_CLOSESHELL_NULL_PARAM`: UInt = 2150859050u;
public const val `ERROR_WINRS_CLIENT_CREATESHELL_NULL_PARAM`: UInt = 2150859049u;
public const val `ERROR_WINRS_CLIENT_FREECREATESHELLRESULT_NULL_PARAM`: UInt = 2150859051u;
public const val `ERROR_WINRS_CLIENT_FREEPULLRESULT_NULL_PARAM`: UInt = 2150859056u;
public const val `ERROR_WINRS_CLIENT_FREERUNCOMMANDRESULT_NULL_PARAM`: UInt = 2150859053u;
public const val `ERROR_WINRS_CLIENT_GET_NULL_PARAM`: UInt = 2150859062u;
public const val `ERROR_WINRS_CLIENT_INVALID_FLAG`: UInt = 2150859040u;
public const val `ERROR_WINRS_CLIENT_NULL_PARAM`: UInt = 2150859041u;
public const val `ERROR_WINRS_CLIENT_PULL_NULL_PARAM`: UInt = 2150859057u;
public const val `ERROR_WINRS_CLIENT_PUSH_NULL_PARAM`: UInt = 2150859060u;
public const val `ERROR_WINRS_CLIENT_RECEIVE_NULL_PARAM`: UInt = 2150859055u;
public const val `ERROR_WINRS_CLIENT_RUNCOMMAND_NULL_PARAM`: UInt = 2150859052u;
public const val `ERROR_WINRS_CLIENT_SEND_NULL_PARAM`: UInt = 2150859059u;
public const val `ERROR_WINRS_CLIENT_SIGNAL_NULL_PARAM`: UInt = 2150859054u;
public const val `ERROR_WINRS_CODE_PAGE_NOT_SUPPORTED`: UInt = 2150859072u;
public const val `ERROR_WINRS_CONNECT_RESPONSE_BAD_BODY`: UInt = 2150859211u;
public const val `ERROR_WINRS_IDLETIMEOUT_OUTOFBOUNDS`: UInt = 2150859250u;
public const val `ERROR_WINRS_RECEIVE_IN_PROGRESS`: UInt = 2150859047u;
public const val `ERROR_WINRS_RECEIVE_NO_RESPONSE_DATA`: UInt = 2150859048u;
public const val `ERROR_WINRS_SHELLCOMMAND_CLIENTID_NOT_VALID`: UInt = 2150859220u;
public const val `ERROR_WINRS_SHELLCOMMAND_CLIENTID_RESOURCE_CONFLICT`: UInt = 2150859222u;
public const val `ERROR_WINRS_SHELLCOMMAND_DISCONNECT_OPERATION_NOT_VALID`: UInt = 2150859224u;
public const val `ERROR_WINRS_SHELLCOMMAND_RECONNECT_OPERATION_NOT_VALID`: UInt = 2150859219u;
public const val `ERROR_WINRS_SHELL_CLIENTID_NOT_VALID`: UInt = 2150859221u;
public const val `ERROR_WINRS_SHELL_CLIENTID_RESOURCE_CONFLICT`: UInt = 2150859223u;
public const val `ERROR_WINRS_SHELL_CLIENTSESSIONID_MISMATCH`: UInt = 2150859206u;
public const val `ERROR_WINRS_SHELL_CONNECTED_TO_DIFFERENT_CLIENT`: UInt = 2150859213u;
public const val `ERROR_WINRS_SHELL_DISCONNECTED`: UInt = 2150859204u;
public const val `ERROR_WINRS_SHELL_DISCONNECT_NOT_SUPPORTED`: UInt = 2150859205u;
public const val `ERROR_WINRS_SHELL_DISCONNECT_OPERATION_NOT_GRACEFUL`: UInt = 2150859214u;
public const val `ERROR_WINRS_SHELL_DISCONNECT_OPERATION_NOT_VALID`: UInt = 2150859215u;
public const val `ERROR_WINRS_SHELL_RECONNECT_OPERATION_NOT_VALID`: UInt = 2150859216u;
public const val `ERROR_WINRS_SHELL_URI_INVALID`: UInt = 2150859099u;
public const val `ERROR_WSMAN_ACK_NOT_SUPPORTED`: UInt = 2150858853u;
public const val `ERROR_WSMAN_ACTION_MISMATCH`: UInt = 2150858801u;
public const val `ERROR_WSMAN_ACTION_NOT_SUPPORTED`: UInt = 2150858771u;
public const val `ERROR_WSMAN_ADDOBJECT_MISSING_EPR`: UInt = 2150859045u;
public const val `ERROR_WSMAN_ADDOBJECT_MISSING_OBJECT`: UInt = 2150859044u;
public const val `ERROR_WSMAN_ALREADY_EXISTS`: UInt = 2150858803u;
public const val `ERROR_WSMAN_AMBIGUOUS_SELECTORS`: UInt = 2150858846u;
public const val `ERROR_WSMAN_AUTHENTICATION_INVALID_FLAG`: UInt = 2150859077u;
public const val `ERROR_WSMAN_AUTHORIZATION_MODE_NOT_SUPPORTED`: UInt = 2150858852u;
public const val `ERROR_WSMAN_BAD_METHOD`: UInt = 2150858868u;
public const val `ERROR_WSMAN_BATCHSIZE_TOO_SMALL`: UInt = 2150858919u;
public const val `ERROR_WSMAN_BATCH_COMPLETE`: UInt = 2150858756u;
public const val `ERROR_WSMAN_BOOKMARKS_NOT_SUPPORTED`: UInt = 2150858859u;
public const val `ERROR_WSMAN_BOOKMARK_EXPIRED`: UInt = 2150858832u;
public const val `ERROR_WSMAN_CANNOT_CHANGE_KEYS`: UInt = 2150858989u;
public const val `ERROR_WSMAN_CANNOT_DECRYPT`: UInt = 2150859001u;
public const val `ERROR_WSMAN_CANNOT_PROCESS_FILTER`: UInt = 2150859042u;
public const val `ERROR_WSMAN_CANNOT_USE_ALLOW_NEGOTIATE_IMPLICIT_CREDENTIALS_FOR_HTTP`: UInt = 2150859184u;
public const val `ERROR_WSMAN_CANNOT_USE_CERTIFICATES_FOR_HTTP`: UInt = 2150858968u;
public const val `ERROR_WSMAN_CANNOT_USE_PROXY_SETTINGS_FOR_CREDSSP`: UInt = 2150859187u;
public const val `ERROR_WSMAN_CANNOT_USE_PROXY_SETTINGS_FOR_HTTP`: UInt = 2150859185u;
public const val `ERROR_WSMAN_CANNOT_USE_PROXY_SETTINGS_FOR_KERBEROS`: UInt = 2150859186u;
public const val `ERROR_WSMAN_CERTMAPPING_CONFIGLIMIT_EXCEEDED`: UInt = 2150859091u;
public const val `ERROR_WSMAN_CERTMAPPING_CREDENTIAL_MANAGEMENT_FAILIED`: UInt = 2150859262u;
public const val `ERROR_WSMAN_CERTMAPPING_INVALIDISSUERKEY`: UInt = 2150859106u;
public const val `ERROR_WSMAN_CERTMAPPING_INVALIDSUBJECTKEY`: UInt = 2150859105u;
public const val `ERROR_WSMAN_CERTMAPPING_INVALIDUSERCREDENTIALS`: UInt = 2150859092u;
public const val `ERROR_WSMAN_CERTMAPPING_PASSWORDBLANK`: UInt = 2150859115u;
public const val `ERROR_WSMAN_CERTMAPPING_PASSWORDTOOLONG`: UInt = 2150859114u;
public const val `ERROR_WSMAN_CERTMAPPING_PASSWORDUSERTUPLE`: UInt = 2150859116u;
public const val `ERROR_WSMAN_CERT_INVALID_USAGE`: UInt = 2150858990u;
public const val `ERROR_WSMAN_CERT_INVALID_USAGE_CLIENT`: UInt = 2150859093u;
public const val `ERROR_WSMAN_CERT_MISSING_AUTH_FLAG`: UInt = 2150859094u;
public const val `ERROR_WSMAN_CERT_MULTIPLE_CREDENTIALS_FLAG`: UInt = 2150859095u;
public const val `ERROR_WSMAN_CERT_NOT_FOUND`: UInt = 2150858882u;
public const val `ERROR_WSMAN_CERT_THUMBPRINT_BLANK`: UInt = 2150858983u;
public const val `ERROR_WSMAN_CERT_THUMBPRINT_NOT_BLANK`: UInt = 2150858982u;
public const val `ERROR_WSMAN_CHARACTER_SET`: UInt = 2150858828u;
public const val `ERROR_WSMAN_CLIENT_ALLOWFRESHCREDENTIALS`: UInt = 2150859171u;
public const val `ERROR_WSMAN_CLIENT_ALLOWFRESHCREDENTIALS_NTLMONLY`: UInt = 2150859172u;
public const val `ERROR_WSMAN_CLIENT_BASIC_AUTHENTICATION_DISABLED`: UInt = 2150858975u;
public const val `ERROR_WSMAN_CLIENT_BATCH_ITEMS_TOO_SMALL`: UInt = 2150858946u;
public const val `ERROR_WSMAN_CLIENT_BLANK_ACTION_URI`: UInt = 2150858948u;
public const val `ERROR_WSMAN_CLIENT_BLANK_INPUT_XML`: UInt = 2150858945u;
public const val `ERROR_WSMAN_CLIENT_BLANK_URI`: UInt = 2150858943u;
public const val `ERROR_WSMAN_CLIENT_CERTIFICATES_AUTHENTICATION_DISABLED`: UInt = 2150858979u;
public const val `ERROR_WSMAN_CLIENT_CERT_NEEDED`: UInt = 2150858932u;
public const val `ERROR_WSMAN_CLIENT_CERT_UNKNOWN_LOCATION`: UInt = 2150858934u;
public const val `ERROR_WSMAN_CLIENT_CERT_UNKNOWN_TYPE`: UInt = 2150858933u;
public const val `ERROR_WSMAN_CLIENT_CERT_UNNEEDED_CREDS`: UInt = 2150858927u;
public const val `ERROR_WSMAN_CLIENT_CERT_UNNEEDED_USERNAME`: UInt = 2150858929u;
public const val `ERROR_WSMAN_CLIENT_CLOSECOMMAND_NULL_PARAM`: UInt = 2150859135u;
public const val `ERROR_WSMAN_CLIENT_CLOSESHELL_NULL_PARAM`: UInt = 2150859134u;
public const val `ERROR_WSMAN_CLIENT_COMPRESSION_INVALID_OPTION`: UInt = 2150858957u;
public const val `ERROR_WSMAN_CLIENT_CONNECTCOMMAND_NULL_PARAM`: UInt = 2150859210u;
public const val `ERROR_WSMAN_CLIENT_CONNECTSHELL_NULL_PARAM`: UInt = 2150859209u;
public const val `ERROR_WSMAN_CLIENT_CONSTRUCTERROR_NULL_PARAM`: UInt = 2150858965u;
public const val `ERROR_WSMAN_CLIENT_CREATESESSION_NULL_PARAM`: UInt = 2150858938u;
public const val `ERROR_WSMAN_CLIENT_CREATESHELL_NAME_INVALID`: UInt = 2150859202u;
public const val `ERROR_WSMAN_CLIENT_CREATESHELL_NULL_PARAM`: UInt = 2150859130u;
public const val `ERROR_WSMAN_CLIENT_CREDENTIALS_FLAG_NEEDED`: UInt = 2150858931u;
public const val `ERROR_WSMAN_CLIENT_CREDENTIALS_FOR_DEFAULT_AUTHENTICATION`: UInt = 2150859078u;
public const val `ERROR_WSMAN_CLIENT_CREDENTIALS_FOR_PROXY_AUTHENTICATION`: UInt = 2150859163u;
public const val `ERROR_WSMAN_CLIENT_CREDENTIALS_NEEDED`: UInt = 2150858930u;
public const val `ERROR_WSMAN_CLIENT_CREDSSP_AUTHENTICATION_DISABLED`: UInt = 2150859170u;
public const val `ERROR_WSMAN_CLIENT_DECODEOBJECT_NULL_PARAM`: UInt = 2150858961u;
public const val `ERROR_WSMAN_CLIENT_DELIVERENDSUBSCRIPTION_NULL_PARAM`: UInt = 2150858958u;
public const val `ERROR_WSMAN_CLIENT_DELIVEREVENTS_NULL_PARAM`: UInt = 2150858959u;
public const val `ERROR_WSMAN_CLIENT_DIGEST_AUTHENTICATION_DISABLED`: UInt = 2150858976u;
public const val `ERROR_WSMAN_CLIENT_DISABLE_LOOPBACK_WITH_EXPLICIT_CREDENTIALS`: UInt = 2150859073u;
public const val `ERROR_WSMAN_CLIENT_DISCONNECTSHELL_NULL_PARAM`: UInt = 2150859207u;
public const val `ERROR_WSMAN_CLIENT_ENCODEOBJECT_NULL_PARAM`: UInt = 2150858962u;
public const val `ERROR_WSMAN_CLIENT_ENUMERATE_NULL_PARAM`: UInt = 2150858939u;
public const val `ERROR_WSMAN_CLIENT_ENUMERATORADDEVENT_NULL_PARAM`: UInt = 2150859043u;
public const val `ERROR_WSMAN_CLIENT_ENUMERATORADDOBJECT_NULL_PARAM`: UInt = 2150858963u;
public const val `ERROR_WSMAN_CLIENT_ENUMERATORNEXTOBJECT_NULL_PARAM`: UInt = 2150858964u;
public const val `ERROR_WSMAN_CLIENT_ENUM_RECEIVED_TOO_MANY_ITEMS`: UInt = 2150859075u;
public const val `ERROR_WSMAN_CLIENT_GETBOOKMARK_NULL_PARAM`: UInt = 2150858960u;
public const val `ERROR_WSMAN_CLIENT_GETERRORMESSAGE_NULL_PARAM`: UInt = 2150859158u;
public const val `ERROR_WSMAN_CLIENT_GETSESSIONOPTION_DWORD_INVALID_PARAM`: UInt = 2150859167u;
public const val `ERROR_WSMAN_CLIENT_GETSESSIONOPTION_DWORD_NULL_PARAM`: UInt = 2150859166u;
public const val `ERROR_WSMAN_CLIENT_GETSESSIONOPTION_INVALID_PARAM`: UInt = 2150859129u;
public const val `ERROR_WSMAN_CLIENT_GETSESSIONOPTION_STRING_INVALID_PARAM`: UInt = 2150859168u;
public const val `ERROR_WSMAN_CLIENT_INITIALIZE_NULL_PARAM`: UInt = 2150859124u;
public const val `ERROR_WSMAN_CLIENT_INVALID_CERT`: UInt = 2150858935u;
public const val `ERROR_WSMAN_CLIENT_INVALID_CERT_DNS_OR_UPN`: UInt = 2150859080u;
public const val `ERROR_WSMAN_CLIENT_INVALID_CLOSE_COMMAND_FLAG`: UInt = 2150859133u;
public const val `ERROR_WSMAN_CLIENT_INVALID_CLOSE_SHELL_FLAG`: UInt = 2150859132u;
public const val `ERROR_WSMAN_CLIENT_INVALID_CREATE_SHELL_FLAG`: UInt = 2150859131u;
public const val `ERROR_WSMAN_CLIENT_INVALID_DEINIT_APPLICATION_FLAG`: UInt = 2150859126u;
public const val `ERROR_WSMAN_CLIENT_INVALID_DELIVERY_RETRY`: UInt = 2150859108u;
public const val `ERROR_WSMAN_CLIENT_INVALID_DISABLE_LOOPBACK`: UInt = 2150859074u;
public const val `ERROR_WSMAN_CLIENT_INVALID_DISCONNECT_SHELL_FLAG`: UInt = 2150859226u;
public const val `ERROR_WSMAN_CLIENT_INVALID_FLAG`: UInt = 2150858924u;
public const val `ERROR_WSMAN_CLIENT_INVALID_GETERRORMESSAGE_FLAG`: UInt = 2150859160u;
public const val `ERROR_WSMAN_CLIENT_INVALID_INIT_APPLICATION_FLAG`: UInt = 2150859125u;
public const val `ERROR_WSMAN_CLIENT_INVALID_LANGUAGE_CODE`: UInt = 2150859159u;
public const val `ERROR_WSMAN_CLIENT_INVALID_LOCALE`: UInt = 2150859156u;
public const val `ERROR_WSMAN_CLIENT_INVALID_RECEIVE_SHELL_FLAG`: UInt = 2150859150u;
public const val `ERROR_WSMAN_CLIENT_INVALID_RESOURCE_LOCATOR`: UInt = 2150858944u;
public const val `ERROR_WSMAN_CLIENT_INVALID_RUNCOMMAND_FLAG`: UInt = 2150859137u;
public const val `ERROR_WSMAN_CLIENT_INVALID_SEND_SHELL_FLAG`: UInt = 2150859145u;
public const val `ERROR_WSMAN_CLIENT_INVALID_SEND_SHELL_PARAMETER`: UInt = 2150859146u;
public const val `ERROR_WSMAN_CLIENT_INVALID_SHELL_COMMAND_PAIR`: UInt = 2150859227u;
public const val `ERROR_WSMAN_CLIENT_INVALID_SIGNAL_SHELL_FLAG`: UInt = 2150859143u;
public const val `ERROR_WSMAN_CLIENT_INVALID_UI_LANGUAGE`: UInt = 2150859157u;
public const val `ERROR_WSMAN_CLIENT_KERBEROS_AUTHENTICATION_DISABLED`: UInt = 2150858978u;
public const val `ERROR_WSMAN_CLIENT_LOCAL_INVALID_CONNECTION_OPTIONS`: UInt = 2150858937u;
public const val `ERROR_WSMAN_CLIENT_LOCAL_INVALID_CREDS`: UInt = 2150858936u;
public const val `ERROR_WSMAN_CLIENT_MAX_CHARS_TOO_SMALL`: UInt = 2150858947u;
public const val `ERROR_WSMAN_CLIENT_MISSING_EXPIRATION`: UInt = 2150858953u;
public const val `ERROR_WSMAN_CLIENT_MULTIPLE_AUTH_FLAGS`: UInt = 2150858925u;
public const val `ERROR_WSMAN_CLIENT_MULTIPLE_DELIVERY_MODES`: UInt = 2150858950u;
public const val `ERROR_WSMAN_CLIENT_MULTIPLE_ENUM_MODE_FLAGS`: UInt = 2150859039u;
public const val `ERROR_WSMAN_CLIENT_MULTIPLE_ENVELOPE_POLICIES`: UInt = 2150858951u;
public const val `ERROR_WSMAN_CLIENT_MULTIPLE_PROXY_AUTH_FLAGS`: UInt = 2150859188u;
public const val `ERROR_WSMAN_CLIENT_NEGOTIATE_AUTHENTICATION_DISABLED`: UInt = 2150858977u;
public const val `ERROR_WSMAN_CLIENT_NO_HANDLE`: UInt = 2150858942u;
public const val `ERROR_WSMAN_CLIENT_NO_SOURCES`: UInt = 2150859111u;
public const val `ERROR_WSMAN_CLIENT_NULL_ISSUERS`: UInt = 2150859110u;
public const val `ERROR_WSMAN_CLIENT_NULL_PUBLISHERS`: UInt = 2150859109u;
public const val `ERROR_WSMAN_CLIENT_NULL_RESULT_PARAM`: UInt = 2150858941u;
public const val `ERROR_WSMAN_CLIENT_PULL_INVALID_FLAGS`: UInt = 2150858954u;
public const val `ERROR_WSMAN_CLIENT_PUSH_HOST_TOO_LONG`: UInt = 2150858956u;
public const val `ERROR_WSMAN_CLIENT_PUSH_UNSUPPORTED_TRANSPORT`: UInt = 2150858955u;
public const val `ERROR_WSMAN_CLIENT_RECEIVE_NULL_PARAM`: UInt = 2150859148u;
public const val `ERROR_WSMAN_CLIENT_RECONNECTSHELLCOMMAND_NULL_PARAM`: UInt = 2150859218u;
public const val `ERROR_WSMAN_CLIENT_RECONNECTSHELL_NULL_PARAM`: UInt = 2150859208u;
public const val `ERROR_WSMAN_CLIENT_RUNCOMMAND_NOTCOMPLETED`: UInt = 2150859138u;
public const val `ERROR_WSMAN_CLIENT_RUNCOMMAND_NULL_PARAM`: UInt = 2150859136u;
public const val `ERROR_WSMAN_CLIENT_SEND_NULL_PARAM`: UInt = 2150859144u;
public const val `ERROR_WSMAN_CLIENT_SESSION_UNUSABLE`: UInt = 2150859258u;
public const val `ERROR_WSMAN_CLIENT_SETSESSIONOPTION_INVALID_PARAM`: UInt = 2150859128u;
public const val `ERROR_WSMAN_CLIENT_SETSESSIONOPTION_NULL_PARAM`: UInt = 2150859127u;
public const val `ERROR_WSMAN_CLIENT_SIGNAL_NULL_PARAM`: UInt = 2150859142u;
public const val `ERROR_WSMAN_CLIENT_SPN_WRONG_AUTH`: UInt = 2150858926u;
public const val `ERROR_WSMAN_CLIENT_SUBSCRIBE_NULL_PARAM`: UInt = 2150858940u;
public const val `ERROR_WSMAN_CLIENT_UNENCRYPTED_DISABLED`: UInt = 2150858974u;
public const val `ERROR_WSMAN_CLIENT_UNENCRYPTED_HTTP_ONLY`: UInt = 2150858967u;
public const val `ERROR_WSMAN_CLIENT_UNKNOWN_EXPIRATION_TYPE`: UInt = 2150858952u;
public const val `ERROR_WSMAN_CLIENT_USERNAME_AND_PASSWORD_NEEDED`: UInt = 2150859079u;
public const val `ERROR_WSMAN_CLIENT_USERNAME_PASSWORD_NEEDED`: UInt = 2150858928u;
public const val `ERROR_WSMAN_CLIENT_WORKGROUP_NO_KERBEROS`: UInt = 2150859020u;
public const val `ERROR_WSMAN_CLIENT_ZERO_HEARTBEAT`: UInt = 2150858949u;
public const val `ERROR_WSMAN_COMMAND_ALREADY_CLOSED`: UInt = 2150859087u;
public const val `ERROR_WSMAN_COMMAND_TERMINATED`: UInt = 2150859212u;
public const val `ERROR_WSMAN_CONCURRENCY`: UInt = 2150858802u;
public const val `ERROR_WSMAN_CONFIG_CANNOT_CHANGE_CERTMAPPING_KEYS`: UInt = 2150859122u;
public const val `ERROR_WSMAN_CONFIG_CANNOT_CHANGE_GPO_CONTROLLED_SETTING`: UInt = 2150858890u;
public const val `ERROR_WSMAN_CONFIG_CANNOT_CHANGE_MUTUAL`: UInt = 2150858885u;
public const val `ERROR_WSMAN_CONFIG_CANNOT_SHARE_SSL_CONFIG`: UInt = 2150858984u;
public const val `ERROR_WSMAN_CONFIG_CERT_CN_DOES_NOT_MATCH_HOSTNAME`: UInt = 2150858985u;
public const val `ERROR_WSMAN_CONFIG_CORRUPTED`: UInt = 2150858757u;
public const val `ERROR_WSMAN_CONFIG_GROUP_POLICY_CHANGE_NOTIFICATION_SUBSCRIPTION_FAILED`: UInt = 2150859217u;
public const val `ERROR_WSMAN_CONFIG_HOSTNAME_CHANGE_WITHOUT_CERT`: UInt = 2150858986u;
public const val `ERROR_WSMAN_CONFIG_PORT_INVALID`: UInt = 2150858972u;
public const val `ERROR_WSMAN_CONFIG_READONLY_PROPERTY`: UInt = 2150859071u;
public const val `ERROR_WSMAN_CONFIG_SHELLURI_INVALID_OPERATION_ON_KEY`: UInt = 2150859119u;
public const val `ERROR_WSMAN_CONFIG_SHELLURI_INVALID_PROCESSPATH`: UInt = 2150859098u;
public const val `ERROR_WSMAN_CONFIG_SHELL_URI_CMDSHELLURI_NOTPERMITTED`: UInt = 2150859097u;
public const val `ERROR_WSMAN_CONFIG_SHELL_URI_INVALID`: UInt = 2150859096u;
public const val `ERROR_WSMAN_CONFIG_THUMBPRINT_SHOULD_BE_EMPTY`: UInt = 2150858987u;
public const val `ERROR_WSMAN_CONNECTIONSTR_INVALID`: UInt = 2150858969u;
public const val `ERROR_WSMAN_CONNECTOR_GET`: UInt = 2150858873u;
public const val `ERROR_WSMAN_CREATESHELL_NULL_ENVIRONMENT_VARIABLE_NAME`: UInt = 2150859081u;
public const val `ERROR_WSMAN_CREATESHELL_NULL_STREAMID`: UInt = 2150859083u;
public const val `ERROR_WSMAN_CREATESHELL_RUNAS_FAILED`: UInt = 2150859231u;
public const val `ERROR_WSMAN_CREATE_RESPONSE_NO_EPR`: UInt = 2150858992u;
public const val `ERROR_WSMAN_CREDSSP_USERNAME_PASSWORD_NEEDED`: UInt = 2150859169u;
public const val `ERROR_WSMAN_CREDS_PASSED_WITH_NO_AUTH_FLAG`: UInt = 2150858923u;
public const val `ERROR_WSMAN_CUSTOMREMOTESHELL_DEPRECATED`: UInt = 2150859196u;
public const val `ERROR_WSMAN_DEFAULTAUTH_IPADDRESS`: UInt = 2150859195u;
public const val `ERROR_WSMAN_DELIVERY_REFUSED`: UInt = 2150858804u;
public const val `ERROR_WSMAN_DELIVERY_RETRIES_NOT_SUPPORTED`: UInt = 2150858857u;
public const val `ERROR_WSMAN_DELIVER_IN_PROGRESS`: UInt = 2150858821u;
public const val `ERROR_WSMAN_DEPRECATED_CONFIG_SETTING`: UInt = 2150859182u;
public const val `ERROR_WSMAN_DESERIALIZE_CLASS`: UInt = 2150859244u;
public const val `ERROR_WSMAN_DESTINATION_INVALID`: UInt = 2150859256u;
public const val `ERROR_WSMAN_DESTINATION_UNREACHABLE`: UInt = 2150858770u;
public const val `ERROR_WSMAN_DIFFERENT_AUTHZ_TOKEN`: UInt = 2150859177u;
public const val `ERROR_WSMAN_DIFFERENT_CIM_SELECTOR`: UInt = 2150859067u;
public const val `ERROR_WSMAN_DUPLICATE_SELECTORS`: UInt = 2150858847u;
public const val `ERROR_WSMAN_ENCODING_LIMIT`: UInt = 2150858805u;
public const val `ERROR_WSMAN_ENCODING_TYPE`: UInt = 2150859033u;
public const val `ERROR_WSMAN_ENDPOINT_UNAVAILABLE`: UInt = 2150858772u;
public const val `ERROR_WSMAN_ENDPOINT_UNAVAILABLE_INVALID_VALUE`: UInt = 2150859034u;
public const val `ERROR_WSMAN_ENUMERATE_CANNOT_PROCESS_FILTER`: UInt = 2150858778u;
public const val `ERROR_WSMAN_ENUMERATE_FILTERING_NOT_SUPPORTED`: UInt = 2150858776u;
public const val `ERROR_WSMAN_ENUMERATE_FILTER_DIALECT_REQUESTED_UNAVAILABLE`: UInt = 2150858777u;
public const val `ERROR_WSMAN_ENUMERATE_INVALID_ENUMERATION_CONTEXT`: UInt = 2150858779u;
public const val `ERROR_WSMAN_ENUMERATE_INVALID_EXPIRATION_TIME`: UInt = 2150858774u;
public const val `ERROR_WSMAN_ENUMERATE_SHELLCOMAMNDS_FILTER_EXPECTED`: UInt = 2150859200u;
public const val `ERROR_WSMAN_ENUMERATE_SHELLCOMMANDS_EPRS_NOTSUPPORTED`: UInt = 2150859201u;
public const val `ERROR_WSMAN_ENUMERATE_TIMED_OUT`: UInt = 2150858780u;
public const val `ERROR_WSMAN_ENUMERATE_UNABLE_TO_RENEW`: UInt = 2150858781u;
public const val `ERROR_WSMAN_ENUMERATE_UNSUPPORTED_EXPIRATION_TIME`: UInt = 2150858775u;
public const val `ERROR_WSMAN_ENUMERATE_UNSUPPORTED_EXPIRATION_TYPE`: UInt = 2150859036u;
public const val `ERROR_WSMAN_ENUMERATE_WMI_INVALID_KEY`: UInt = 2150859016u;
public const val `ERROR_WSMAN_ENUMERATION_CLOSED`: UInt = 2150858759u;
public const val `ERROR_WSMAN_ENUMERATION_INITIALIZING`: UInt = 2150858872u;
public const val `ERROR_WSMAN_ENUMERATION_INVALID`: UInt = 2150858884u;
public const val `ERROR_WSMAN_ENUMERATION_MODE_UNSUPPORTED`: UInt = 2150858886u;
public const val `ERROR_WSMAN_ENVELOPE_TOO_LARGE`: UInt = 2150858790u;
public const val `ERROR_WSMAN_EPR_NESTING_EXCEEDED`: UInt = 2150858879u;
public const val `ERROR_WSMAN_EVENTING_CONCURRENT_CLIENT_RECEIVE`: UInt = 2150858891u;
public const val `ERROR_WSMAN_EVENTING_DELIVERYFAILED_FROMSOURCE`: UInt = 2150858908u;
public const val `ERROR_WSMAN_EVENTING_DELIVERY_MODE_REQUESTED_INVALID`: UInt = 2150858920u;
public const val `ERROR_WSMAN_EVENTING_DELIVERY_MODE_REQUESTED_UNAVAILABLE`: UInt = 2150858782u;
public const val `ERROR_WSMAN_EVENTING_FAST_SENDER`: UInt = 2150858892u;
public const val `ERROR_WSMAN_EVENTING_FILTERING_NOT_SUPPORTED`: UInt = 2150858785u;
public const val `ERROR_WSMAN_EVENTING_FILTERING_REQUESTED_UNAVAILABLE`: UInt = 2150858786u;
public const val `ERROR_WSMAN_EVENTING_INCOMPATIBLE_BATCHPARAMS_AND_DELIVERYMODE`: UInt = 2150858900u;
public const val `ERROR_WSMAN_EVENTING_INSECURE_PUSHSUBSCRIPTION_CONNECTION`: UInt = 2150858893u;
public const val `ERROR_WSMAN_EVENTING_INVALID_ENCODING_IN_DELIVERY`: UInt = 2150859255u;
public const val `ERROR_WSMAN_EVENTING_INVALID_ENDTO_ADDRESSS`: UInt = 2150858902u;
public const val `ERROR_WSMAN_EVENTING_INVALID_EVENTSOURCE`: UInt = 2150858894u;
public const val `ERROR_WSMAN_EVENTING_INVALID_EXPIRATION_TIME`: UInt = 2150858783u;
public const val `ERROR_WSMAN_EVENTING_INVALID_HEARTBEAT`: UInt = 2150858916u;
public const val `ERROR_WSMAN_EVENTING_INVALID_INCOMING_EVENT_PACKET_HEADER`: UInt = 2150858903u;
public const val `ERROR_WSMAN_EVENTING_INVALID_LOCALE_IN_DELIVERY`: UInt = 2150858915u;
public const val `ERROR_WSMAN_EVENTING_INVALID_MESSAGE`: UInt = 2150858789u;
public const val `ERROR_WSMAN_EVENTING_INVALID_NOTIFYTO_ADDRESSS`: UInt = 2150858914u;
public const val `ERROR_WSMAN_EVENTING_LOOPBACK_TESTFAILED`: UInt = 2150858901u;
public const val `ERROR_WSMAN_EVENTING_MISSING_LOCALE_IN_DELIVERY`: UInt = 2150859028u;
public const val `ERROR_WSMAN_EVENTING_MISSING_NOTIFYTO`: UInt = 2150858912u;
public const val `ERROR_WSMAN_EVENTING_MISSING_NOTIFYTO_ADDRESSS`: UInt = 2150858913u;
public const val `ERROR_WSMAN_EVENTING_NOMATCHING_LISTENER`: UInt = 2150858895u;
public const val `ERROR_WSMAN_EVENTING_NONDOMAINJOINED_COLLECTOR`: UInt = 2150859070u;
public const val `ERROR_WSMAN_EVENTING_NONDOMAINJOINED_PUBLISHER`: UInt = 2150859069u;
public const val `ERROR_WSMAN_EVENTING_PUSH_SUBSCRIPTION_NOACTIVATE_EVENTSOURCE`: UInt = 2150859263u;
public const val `ERROR_WSMAN_EVENTING_SOURCE_UNABLE_TO_PROCESS`: UInt = 2150858787u;
public const val `ERROR_WSMAN_EVENTING_SUBSCRIPTIONCLOSED_BYREMOTESERVICE`: UInt = 2150858907u;
public const val `ERROR_WSMAN_EVENTING_SUBSCRIPTION_CANCELLED_BYSOURCE`: UInt = 2150858910u;
public const val `ERROR_WSMAN_EVENTING_UNABLE_TO_RENEW`: UInt = 2150858788u;
public const val `ERROR_WSMAN_EVENTING_UNSUPPORTED_EXPIRATION_TYPE`: UInt = 2150858784u;
public const val `ERROR_WSMAN_EXPIRATION_TIME_NOT_SUPPORTED`: UInt = 2150858856u;
public const val `ERROR_WSMAN_EXPLICIT_CREDENTIALS_REQUIRED`: UInt = 2150858981u;
public const val `ERROR_WSMAN_FAILED_AUTHENTICATION`: UInt = 2150858806u;
public const val `ERROR_WSMAN_FEATURE_DEPRECATED`: UInt = 2150859197u;
public const val `ERROR_WSMAN_FILE_NOT_PRESENT`: UInt = 2150859154u;
public const val `ERROR_WSMAN_FILTERING_REQUIRED`: UInt = 2150858831u;
public const val `ERROR_WSMAN_FILTERING_REQUIRED_NOT_SUPPORTED`: UInt = 2150858864u;
public const val `ERROR_WSMAN_FORMAT_MISMATCH_NOT_SUPPORTED`: UInt = 2150858866u;
public const val `ERROR_WSMAN_FORMAT_SECURITY_TOKEN_NOT_SUPPORTED`: UInt = 2150858867u;
public const val `ERROR_WSMAN_FRAGMENT_DIALECT_REQUESTED_UNAVAILABLE`: UInt = 2150858896u;
public const val `ERROR_WSMAN_FRAGMENT_TRANSFER_NOT_SUPPORTED`: UInt = 2150858871u;
public const val `ERROR_WSMAN_GETCLASS`: UInt = 2150859245u;
public const val `ERROR_WSMAN_HEARTBEATS_NOT_SUPPORTED`: UInt = 2150858858u;
public const val `ERROR_WSMAN_HTML_ERROR`: UInt = 2150859123u;
public const val `ERROR_WSMAN_HTTP_CONTENT_TYPE_MISSMATCH_RESPONSE_DATA`: UInt = 2150859000u;
public const val `ERROR_WSMAN_HTTP_INVALID_CONTENT_TYPE_IN_RESPONSE_DATA`: UInt = 2150858999u;
public const val `ERROR_WSMAN_HTTP_NOT_FOUND_STATUS`: UInt = 2150859027u;
public const val `ERROR_WSMAN_HTTP_NO_RESPONSE_DATA`: UInt = 2150858997u;
public const val `ERROR_WSMAN_HTTP_REQUEST_TOO_LARGE_STATUS`: UInt = 2150859025u;
public const val `ERROR_WSMAN_HTTP_SERVICE_UNAVAILABLE_STATUS`: UInt = 2150859026u;
public const val `ERROR_WSMAN_HTTP_STATUS_BAD_REQUEST`: UInt = 2150859121u;
public const val `ERROR_WSMAN_HTTP_STATUS_SERVER_ERROR`: UInt = 2150859120u;
public const val `ERROR_WSMAN_IISCONFIGURATION_READ_FAILED`: UInt = 2150859155u;
public const val `ERROR_WSMAN_INCOMPATIBLE_EPR`: UInt = 2150858807u;
public const val `ERROR_WSMAN_INEXISTENT_MAC_ADDRESS`: UInt = 2150858875u;
public const val `ERROR_WSMAN_INSECURE_ADDRESS_NOT_SUPPORTED`: UInt = 2150858865u;
public const val `ERROR_WSMAN_INSUFFCIENT_SELECTORS`: UInt = 2150858842u;
public const val `ERROR_WSMAN_INSUFFICIENT_METADATA_FOR_BASIC`: UInt = 2150859251u;
public const val `ERROR_WSMAN_INVALID_ACTIONURI`: UInt = 2150858753u;
public const val `ERROR_WSMAN_INVALID_BATCH_PARAMETER`: UInt = 2150858799u;
public const val `ERROR_WSMAN_INVALID_BATCH_SETTINGS_PARAMETER`: UInt = 2150859021u;
public const val `ERROR_WSMAN_INVALID_BOOKMARK`: UInt = 2150858808u;
public const val `ERROR_WSMAN_INVALID_CHARACTERS_IN_RESPONSE`: UInt = 2150859018u;
public const val `ERROR_WSMAN_INVALID_CONFIGSDDL_URL`: UInt = 2150859199u;
public const val `ERROR_WSMAN_INVALID_CONNECTIONRETRY`: UInt = 2150859103u;
public const val `ERROR_WSMAN_INVALID_FILEPATH`: UInt = 2150859153u;
public const val `ERROR_WSMAN_INVALID_FILTER_XML`: UInt = 2150859015u;
public const val `ERROR_WSMAN_INVALID_FRAGMENT_DIALECT`: UInt = 2150858898u;
public const val `ERROR_WSMAN_INVALID_FRAGMENT_PATH`: UInt = 2150858899u;
public const val `ERROR_WSMAN_INVALID_FRAGMENT_PATH_BLANK`: UInt = 2150859017u;
public const val `ERROR_WSMAN_INVALID_HEADER`: UInt = 2150859035u;
public const val `ERROR_WSMAN_INVALID_HOSTNAME_PATTERN`: UInt = 2150858911u;
public const val `ERROR_WSMAN_INVALID_IPFILTER`: UInt = 2150858988u;
public const val `ERROR_WSMAN_INVALID_KEY`: UInt = 2150858820u;
public const val `ERROR_WSMAN_INVALID_LITERAL_URI`: UInt = 2150859252u;
public const val `ERROR_WSMAN_INVALID_MESSAGE_INFORMATION_HEADER`: UInt = 2150858767u;
public const val `ERROR_WSMAN_INVALID_OPTIONS`: UInt = 2150858809u;
public const val `ERROR_WSMAN_INVALID_OPTIONSET`: UInt = 2150859140u;
public const val `ERROR_WSMAN_INVALID_OPTION_NO_PROXY_SERVER`: UInt = 2150859165u;
public const val `ERROR_WSMAN_INVALID_PARAMETER`: UInt = 2150858810u;
public const val `ERROR_WSMAN_INVALID_PARAMETER_NAME`: UInt = 2150858837u;
public const val `ERROR_WSMAN_INVALID_PROPOSED_ID`: UInt = 2150858798u;
public const val `ERROR_WSMAN_INVALID_PROVIDER_RESPONSE`: UInt = 2150859117u;
public const val `ERROR_WSMAN_INVALID_PUBLISHERS_TYPE`: UInt = 2150859107u;
public const val `ERROR_WSMAN_INVALID_REDIRECT_ERROR`: UInt = 2150859189u;
public const val `ERROR_WSMAN_INVALID_REPRESENTATION`: UInt = 2150858773u;
public const val `ERROR_WSMAN_INVALID_RESOURCE_URI`: UInt = 2150858811u;
public const val `ERROR_WSMAN_INVALID_RESUMPTION_CONTEXT`: UInt = 2150858792u;
public const val `ERROR_WSMAN_INVALID_SECURITY_DESCRIPTOR`: UInt = 2150859100u;
public const val `ERROR_WSMAN_INVALID_SELECTORS`: UInt = 2150858813u;
public const val `ERROR_WSMAN_INVALID_SELECTOR_NAME`: UInt = 2150859032u;
public const val `ERROR_WSMAN_INVALID_SELECTOR_VALUE`: UInt = 2150858845u;
public const val `ERROR_WSMAN_INVALID_SOAP_BODY`: UInt = 2150858791u;
public const val `ERROR_WSMAN_INVALID_SUBSCRIBE_OBJECT`: UInt = 2150859112u;
public const val `ERROR_WSMAN_INVALID_SUBSCRIPTION_MANAGER`: UInt = 2150859006u;
public const val `ERROR_WSMAN_INVALID_SYSTEM`: UInt = 2150858812u;
public const val `ERROR_WSMAN_INVALID_TARGET_RESOURCEURI`: UInt = 2150858849u;
public const val `ERROR_WSMAN_INVALID_TARGET_SELECTORS`: UInt = 2150858848u;
public const val `ERROR_WSMAN_INVALID_TARGET_SYSTEM`: UInt = 2150858850u;
public const val `ERROR_WSMAN_INVALID_TIMEOUT_HEADER`: UInt = 2150858881u;
public const val `ERROR_WSMAN_INVALID_URI`: UInt = 2150858754u;
public const val `ERROR_WSMAN_INVALID_URI_WMI_ENUM_WQL`: UInt = 2150859003u;
public const val `ERROR_WSMAN_INVALID_URI_WMI_SINGLETON`: UInt = 2150859002u;
public const val `ERROR_WSMAN_INVALID_USESSL_PARAM`: UInt = 2150859198u;
public const val `ERROR_WSMAN_INVALID_XML`: UInt = 2150858819u;
public const val `ERROR_WSMAN_INVALID_XML_FRAGMENT`: UInt = 2150858841u;
public const val `ERROR_WSMAN_INVALID_XML_MISSING_VALUES`: UInt = 2150858839u;
public const val `ERROR_WSMAN_INVALID_XML_NAMESPACE`: UInt = 2150858840u;
public const val `ERROR_WSMAN_INVALID_XML_RUNAS_DISABLED`: UInt = 2150859232u;
public const val `ERROR_WSMAN_INVALID_XML_VALUES`: UInt = 2150858838u;
public const val `ERROR_WSMAN_KERBEROS_IPADDRESS`: UInt = 2150859019u;
public const val `ERROR_WSMAN_LISTENER_ADDRESS_INVALID`: UInt = 2150858889u;
public const val `ERROR_WSMAN_LOCALE_NOT_SUPPORTED`: UInt = 2150858855u;
public const val `ERROR_WSMAN_MACHINE_OPTION_REQUIRED`: UInt = 2150858917u;
public const val `ERROR_WSMAN_MAXENVELOPE_POLICY_NOT_SUPPORTED`: UInt = 2150858863u;
public const val `ERROR_WSMAN_MAXENVELOPE_SIZE_NOT_SUPPORTED`: UInt = 2150858862u;
public const val `ERROR_WSMAN_MAXITEMS_NOT_SUPPORTED`: UInt = 2150858860u;
public const val `ERROR_WSMAN_MAXTIME_NOT_SUPPORTED`: UInt = 2150858861u;
public const val `ERROR_WSMAN_MAX_ELEMENTS_NOT_SUPPORTED`: UInt = 2150859037u;
public const val `ERROR_WSMAN_MAX_ENVELOPE_SIZE`: UInt = 2150858823u;
public const val `ERROR_WSMAN_MAX_ENVELOPE_SIZE_EXCEEDED`: UInt = 2150858824u;
public const val `ERROR_WSMAN_MESSAGE_INFORMATION_HEADER_REQUIRED`: UInt = 2150858769u;
public const val `ERROR_WSMAN_METADATA_REDIRECT`: UInt = 2150858814u;
public const val `ERROR_WSMAN_MIN_ENVELOPE_SIZE`: UInt = 2150858878u;
public const val `ERROR_WSMAN_MISSING_CLASSNAME`: UInt = 2150859254u;
public const val `ERROR_WSMAN_MISSING_FRAGMENT_PATH`: UInt = 2150858897u;
public const val `ERROR_WSMAN_MULTIPLE_CREDENTIALS`: UInt = 2150859076u;
public const val `ERROR_WSMAN_MUSTUNDERSTAND_ON_LOCALE_UNSUPPORTED`: UInt = 2150858887u;
public const val `ERROR_WSMAN_MUTUAL_AUTH_FAILED`: UInt = 2150859248u;
public const val `ERROR_WSMAN_NAME_NOT_RESOLVED`: UInt = 2150859193u;
public const val `ERROR_WSMAN_NETWORK_TIMEDOUT`: UInt = 2150859046u;
public const val `ERROR_WSMAN_NEW_DESERIALIZER`: UInt = 2150859243u;
public const val `ERROR_WSMAN_NEW_SESSION`: UInt = 2150859246u;
public const val `ERROR_WSMAN_NON_PULL_SUBSCRIPTION_NOT_SUPPORTED`: UInt = 2150859007u;
public const val `ERROR_WSMAN_NO_ACK`: UInt = 2150858800u;
public const val `ERROR_WSMAN_NO_CERTMAPPING_OPERATION_FOR_LOCAL_SESSION`: UInt = 2150859090u;
public const val `ERROR_WSMAN_NO_COMMANDID`: UInt = 2150859141u;
public const val `ERROR_WSMAN_NO_COMMAND_RESPONSE`: UInt = 2150859139u;
public const val `ERROR_WSMAN_NO_DHCP_ADDRESSES`: UInt = 2150858877u;
public const val `ERROR_WSMAN_NO_IDENTIFY_FOR_LOCAL_SESSION`: UInt = 2150859004u;
public const val `ERROR_WSMAN_NO_PUSH_SUBSCRIPTION_FOR_LOCAL_SESSION`: UInt = 2150859005u;
public const val `ERROR_WSMAN_NO_RECEIVE_RESPONSE`: UInt = 2150859151u;
public const val `ERROR_WSMAN_NO_UNICAST_ADDRESSES`: UInt = 2150858876u;
public const val `ERROR_WSMAN_NULL_KEY`: UInt = 2150859247u;
public const val `ERROR_WSMAN_OBJECTONLY_INVALID`: UInt = 2150859253u;
public const val `ERROR_WSMAN_OPERATION_TIMEDOUT`: UInt = 2150858793u;
public const val `ERROR_WSMAN_OPERATION_TIMEOUT_NOT_SUPPORTED`: UInt = 2150858854u;
public const val `ERROR_WSMAN_OPTIONS_INVALID_NAME`: UInt = 2150858834u;
public const val `ERROR_WSMAN_OPTIONS_INVALID_VALUE`: UInt = 2150858835u;
public const val `ERROR_WSMAN_OPTIONS_NOT_SUPPORTED`: UInt = 2150858833u;
public const val `ERROR_WSMAN_OPTION_LIMIT`: UInt = 2150858827u;
public const val `ERROR_WSMAN_PARAMETER_TYPE_MISMATCH`: UInt = 2150858836u;
public const val `ERROR_WSMAN_PLUGIN_CONFIGURATION_CORRUPTED`: UInt = 2150859152u;
public const val `ERROR_WSMAN_PLUGIN_FAILED`: UInt = 2150858883u;
public const val `ERROR_WSMAN_POLICY_CANNOT_COMPLY`: UInt = 2150859102u;
public const val `ERROR_WSMAN_POLICY_CORRUPTED`: UInt = 2150858888u;
public const val `ERROR_WSMAN_POLICY_TOO_COMPLEX`: UInt = 2150859101u;
public const val `ERROR_WSMAN_POLYMORPHISM_MODE_UNSUPPORTED`: UInt = 2150859063u;
public const val `ERROR_WSMAN_PORT_INVALID`: UInt = 2150858971u;
public const val `ERROR_WSMAN_PROVIDER_FAILURE`: UInt = 2150858755u;
public const val `ERROR_WSMAN_PROVIDER_LOAD_FAILED`: UInt = 2150858906u;
public const val `ERROR_WSMAN_PROVSYS_NOT_SUPPORTED`: UInt = 2150858921u;
public const val `ERROR_WSMAN_PROXY_ACCESS_TYPE`: UInt = 2150859164u;
public const val `ERROR_WSMAN_PROXY_AUTHENTICATION_INVALID_FLAG`: UInt = 2150859162u;
public const val `ERROR_WSMAN_PUBLIC_FIREWALL_PROFILE_ACTIVE`: UInt = 2150859113u;
public const val `ERROR_WSMAN_PULL_IN_PROGRESS`: UInt = 2150858758u;
public const val `ERROR_WSMAN_PULL_PARAMS_NOT_SAME_AS_ENUM`: UInt = 2150859181u;
public const val `ERROR_WSMAN_PUSHSUBSCRIPTION_INVALIDUSERACCOUNT`: UInt = 2150859068u;
public const val `ERROR_WSMAN_PUSH_SUBSCRIPTION_CONFIG_INVALID`: UInt = 2150858922u;
public const val `ERROR_WSMAN_QUICK_CONFIG_FAILED_CERT_REQUIRED`: UInt = 2150859029u;
public const val `ERROR_WSMAN_QUICK_CONFIG_FIREWALL_EXCEPTIONS_DISALLOWED`: UInt = 2150859030u;
public const val `ERROR_WSMAN_QUICK_CONFIG_LOCAL_POLICY_CHANGE_DISALLOWED`: UInt = 2150859031u;
public const val `ERROR_WSMAN_QUOTA_LIMIT`: UInt = 2150858815u;
public const val `ERROR_WSMAN_QUOTA_MAX_COMMANDS_PER_SHELL_PPQ`: UInt = 2150859241u;
public const val `ERROR_WSMAN_QUOTA_MAX_OPERATIONS`: UInt = 2150859174u;
public const val `ERROR_WSMAN_QUOTA_MAX_OPERATIONS_USER_PPQ`: UInt = 2150859240u;
public const val `ERROR_WSMAN_QUOTA_MAX_PLUGINOPERATIONS_PPQ`: UInt = 2150859239u;
public const val `ERROR_WSMAN_QUOTA_MAX_PLUGINSHELLS_PPQ`: UInt = 2150859238u;
public const val `ERROR_WSMAN_QUOTA_MAX_SHELLS`: UInt = 2150859173u;
public const val `ERROR_WSMAN_QUOTA_MAX_SHELLS_PPQ`: UInt = 2150859236u;
public const val `ERROR_WSMAN_QUOTA_MAX_SHELLUSERS`: UInt = 2150859179u;
public const val `ERROR_WSMAN_QUOTA_MAX_USERS_PPQ`: UInt = 2150859237u;
public const val `ERROR_WSMAN_QUOTA_MIN_REQUIREMENT_NOT_AVAILABLE_PPQ`: UInt = 2150859242u;
public const val `ERROR_WSMAN_QUOTA_SYSTEM`: UInt = 2150859176u;
public const val `ERROR_WSMAN_QUOTA_USER`: UInt = 2150859175u;
public const val `ERROR_WSMAN_REDIRECT_LOCATION_NOT_AVAILABLE`: UInt = 2150859178u;
public const val `ERROR_WSMAN_REDIRECT_REQUESTED`: UInt = 2150859161u;
public const val `ERROR_WSMAN_REMOTESHELLS_NOT_ALLOWED`: UInt = 2150859180u;
public const val `ERROR_WSMAN_REMOTE_CIMPATH_NOT_SUPPORTED`: UInt = 2150859009u;
public const val `ERROR_WSMAN_REMOTE_CONNECTION_NOT_ALLOWED`: UInt = 2150859235u;
public const val `ERROR_WSMAN_RENAME_FAILURE`: UInt = 2150858816u;
public const val `ERROR_WSMAN_REQUEST_INIT_ERROR`: UInt = 2150858880u;
public const val `ERROR_WSMAN_REQUEST_NOT_SUPPORTED_AT_SERVICE`: UInt = 2150859064u;
public const val `ERROR_WSMAN_RESOURCE_NOT_FOUND`: UInt = 2150858752u;
public const val `ERROR_WSMAN_RESPONSE_INVALID_ENUMERATION_CONTEXT`: UInt = 2150858993u;
public const val `ERROR_WSMAN_RESPONSE_INVALID_MESSAGE_INFORMATION_HEADER`: UInt = 2150858995u;
public const val `ERROR_WSMAN_RESPONSE_INVALID_SOAP_FAULT`: UInt = 2150858998u;
public const val `ERROR_WSMAN_RESPONSE_NO_RESULTS`: UInt = 2150858991u;
public const val `ERROR_WSMAN_RESPONSE_NO_SOAP_HEADER_BODY`: UInt = 2150858996u;
public const val `ERROR_WSMAN_RESPONSE_NO_XML_FRAGMENT_WRAPPER`: UInt = 2150858994u;
public const val `ERROR_WSMAN_RESUMPTION_NOT_SUPPORTED`: UInt = 2150858794u;
public const val `ERROR_WSMAN_RESUMPTION_TYPE_NOT_SUPPORTED`: UInt = 2150858795u;
public const val `ERROR_WSMAN_RUNASUSER_MANAGEDACCOUNT_LOGON_FAILED`: UInt = 2150859261u;
public const val `ERROR_WSMAN_RUNAS_INVALIDUSERCREDENTIALS`: UInt = 2150859203u;
public const val `ERROR_WSMAN_RUNSHELLCOMMAND_NULL_ARGUMENT`: UInt = 2150859086u;
public const val `ERROR_WSMAN_SCHEMA_VALIDATION_ERROR`: UInt = 2150858817u;
public const val `ERROR_WSMAN_SECURITY_UNMAPPED`: UInt = 2150858909u;
public const val `ERROR_WSMAN_SELECTOR_LIMIT`: UInt = 2150858826u;
public const val `ERROR_WSMAN_SELECTOR_TYPEMISMATCH`: UInt = 2150858844u;
public const val `ERROR_WSMAN_SEMANTICCALLBACK_TIMEDOUT`: UInt = 2150859228u;
public const val `ERROR_WSMAN_SENDHEARBEAT_EMPTY_ENUMERATOR`: UInt = 2150858973u;
public const val `ERROR_WSMAN_SENDSHELLINPUT_INVALID_STREAMID_INDEX`: UInt = 2150859088u;
public const val `ERROR_WSMAN_SERVER_DESTINATION_LOCALHOST`: UInt = 2150859022u;
public const val `ERROR_WSMAN_SERVER_ENVELOPE_LIMIT`: UInt = 2150858825u;
public const val `ERROR_WSMAN_SERVER_NONPULLSUBSCRIBE_NULL_PARAM`: UInt = 2150858966u;
public const val `ERROR_WSMAN_SERVER_NOT_TRUSTED`: UInt = 2150858980u;
public const val `ERROR_WSMAN_SERVICE_REMOTE_ACCESS_DISABLED`: UInt = 2150859229u;
public const val `ERROR_WSMAN_SERVICE_STREAM_DISCONNECTED`: UInt = 2150859230u;
public const val `ERROR_WSMAN_SESSION_ALREADY_CLOSED`: UInt = 2150858904u;
public const val `ERROR_WSMAN_SHELL_ALREADY_CLOSED`: UInt = 2150859082u;
public const val `ERROR_WSMAN_SHELL_INVALID_COMMAND_HANDLE`: UInt = 2150859085u;
public const val `ERROR_WSMAN_SHELL_INVALID_DESIRED_STREAMS`: UInt = 2150859149u;
public const val `ERROR_WSMAN_SHELL_INVALID_INPUT_STREAM`: UInt = 2150859147u;
public const val `ERROR_WSMAN_SHELL_INVALID_SHELL_HANDLE`: UInt = 2150859084u;
public const val `ERROR_WSMAN_SHELL_NOT_INITIALIZED`: UInt = 2150859118u;
public const val `ERROR_WSMAN_SHELL_SYNCHRONOUS_NOT_SUPPORTED`: UInt = 2150859089u;
public const val `ERROR_WSMAN_SOAP_DATA_ENCODING_UNKNOWN`: UInt = 2150858766u;
public const val `ERROR_WSMAN_SOAP_FAULT_MUST_UNDERSTAND`: UInt = 2150858768u;
public const val `ERROR_WSMAN_SOAP_VERSION_MISMATCH`: UInt = 2150858765u;
public const val `ERROR_WSMAN_SSL_CONNECTION_ABORTED`: UInt = 2150859194u;
public const val `ERROR_WSMAN_SUBSCRIBE_WMI_INVALID_KEY`: UInt = 2150859225u;
public const val `ERROR_WSMAN_SUBSCRIPTION_CLIENT_DID_NOT_CALL_WITHIN_HEARTBEAT`: UInt = 2150858762u;
public const val `ERROR_WSMAN_SUBSCRIPTION_CLOSED`: UInt = 2150858760u;
public const val `ERROR_WSMAN_SUBSCRIPTION_CLOSE_IN_PROGRESS`: UInt = 2150858761u;
public const val `ERROR_WSMAN_SUBSCRIPTION_LISTENER_NOLONGERVALID`: UInt = 2150858905u;
public const val `ERROR_WSMAN_SUBSCRIPTION_NO_HEARTBEAT`: UInt = 2150858763u;
public const val `ERROR_WSMAN_SYSTEM_NOT_FOUND`: UInt = 2150858822u;
public const val `ERROR_WSMAN_TARGET_ALREADY_EXISTS`: UInt = 2150858851u;
public const val `ERROR_WSMAN_TRANSPORT_NOT_SUPPORTED`: UInt = 2150858970u;
public const val `ERROR_WSMAN_UNEXPECTED_SELECTORS`: UInt = 2150858843u;
public const val `ERROR_WSMAN_UNKNOWN_HTTP_STATUS_RETURNED`: UInt = 2150859023u;
public const val `ERROR_WSMAN_UNREPORTABLE_SUCCESS`: UInt = 2150858829u;
public const val `ERROR_WSMAN_UNSUPPORTED_ADDRESSING_MODE`: UInt = 2150858870u;
public const val `ERROR_WSMAN_UNSUPPORTED_ENCODING`: UInt = 2150858796u;
public const val `ERROR_WSMAN_UNSUPPORTED_FEATURE`: UInt = 2150858818u;
public const val `ERROR_WSMAN_UNSUPPORTED_FEATURE_IDENTIFY`: UInt = 2150859257u;
public const val `ERROR_WSMAN_UNSUPPORTED_FEATURE_OPTIONS`: UInt = 2150858918u;
public const val `ERROR_WSMAN_UNSUPPORTED_HTTP_STATUS_REDIRECT`: UInt = 2150859024u;
public const val `ERROR_WSMAN_UNSUPPORTED_MEDIA`: UInt = 2150858869u;
public const val `ERROR_WSMAN_UNSUPPORTED_OCTETTYPE`: UInt = 2150859249u;
public const val `ERROR_WSMAN_UNSUPPORTED_TIMEOUT`: UInt = 2150858764u;
public const val `ERROR_WSMAN_UNSUPPORTED_TYPE`: UInt = 2150859234u;
public const val `ERROR_WSMAN_URISECURITY_INVALIDURIKEY`: UInt = 2150859104u;
public const val `ERROR_WSMAN_URI_LIMIT`: UInt = 2150858797u;
public const val `ERROR_WSMAN_URI_NON_DMTF_CLASS`: UInt = 2150859065u;
public const val `ERROR_WSMAN_URI_QUERY_STRING_SYNTAX_ERROR`: UInt = 2150858874u;
public const val `ERROR_WSMAN_URI_SECURITY_URI`: UInt = 2150859183u;
public const val `ERROR_WSMAN_URI_WRONG_DMTF_VERSION`: UInt = 2150859066u;
public const val `ERROR_WSMAN_VIRTUALACCOUNT_NOTSUPPORTED`: UInt = 2150859259u;
public const val `ERROR_WSMAN_VIRTUALACCOUNT_NOTSUPPORTED_DOWNLEVEL`: UInt = 2150859260u;
public const val `ERROR_WSMAN_WHITESPACE`: UInt = 2150858830u;
public const val `ERROR_WSMAN_WMI_CANNOT_CONNECT_ACCESS_DENIED`: UInt = 2150859014u;
public const val `ERROR_WSMAN_WMI_INVALID_VALUE`: UInt = 2150859011u;
public const val `ERROR_WSMAN_WMI_MAX_NESTED`: UInt = 2150859008u;
public const val `ERROR_WSMAN_WMI_PROVIDER_ACCESS_DENIED`: UInt = 2150859013u;
public const val `ERROR_WSMAN_WMI_PROVIDER_INVALID_PARAMETER`: UInt = 2150859038u;
public const val `ERROR_WSMAN_WMI_PROVIDER_NOT_CAPABLE`: UInt = 2150859010u;
public const val `ERROR_WSMAN_WMI_SVC_ACCESS_DENIED`: UInt = 2150859012u;
public const val `ERROR_WSMAN_WRONG_METADATA`: UInt = 2150859233u;
public typealias `WSMAN_API_HANDLE` = Long;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WSMAN_AUTHENTICATION_CREDENTIALS` (
    public var `authenticationMechanism`: UInt,
    public var `Anonymous`: `WSMAN_AUTHENTICATION_CREDENTIALS_0`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSMAN_AUTHENTICATION_CREDENTIALS`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSMAN_AUTHENTICATION_CREDENTIALS`.Companion.`default`() : `WSMAN_AUTHENTICATION_CREDENTIALS` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 558:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WSMAN_AUTHENTICATION_CREDENTIALS_0 {
//     pub userAccount: WSMAN_USERNAME_PASSWORD_CREDS,
//     pub certificateThumbprint: windows_sys::core::PCWSTR,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSMAN_AUTHENTICATION_CREDENTIALS_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSMAN_AUTHENTICATION_CREDENTIALS_0`.Companion.`default`() : `WSMAN_AUTHENTICATION_CREDENTIALS_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WSMAN_AUTHZ_QUOTA` (
    public var `maxAllowedConcurrentShells`: UInt,
    public var `maxAllowedConcurrentOperations`: UInt,
    public var `timeslotSize`: UInt,
    public var `maxAllowedOperationsPerTimeslot`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WSMAN_CERTIFICATE_DETAILS` (
    public var `subject`: `windows_sys`.`core`.`PCWSTR`,
    public var `issuerName`: `windows_sys`.`core`.`PCWSTR`,
    public var `issuerThumbprint`: `windows_sys`.`core`.`PCWSTR`,
    public var `subjectName`: `windows_sys`.`core`.`PCWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSMAN_CERTIFICATE_DETAILS`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSMAN_CERTIFICATE_DETAILS`.Companion.`default`() : `WSMAN_CERTIFICATE_DETAILS` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `WSMAN_CMDSHELL_OPTION_CODEPAGE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("WINRS_CODEPAGE");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `WSMAN_CMDSHELL_OPTION_CONSOLEMODE_STDIN`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("WINRS_CONSOLEMODE_STDIN");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `WSMAN_CMDSHELL_OPTION_SKIP_CMD_SHELL`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("WINRS_SKIP_CMD_SHELL");
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WSMAN_COMMAND_ARG_SET` (
    public var `argsCount`: UInt,
    public var `args`: /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PCWSTR`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSMAN_COMMAND_ARG_SET`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSMAN_COMMAND_ARG_SET`.Companion.`default`() : `WSMAN_COMMAND_ARG_SET` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `WSMAN_COMMAND_HANDLE` = Long;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WSMAN_CONNECT_DATA` (
    public var `data`: `WSMAN_DATA`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSMAN_CONNECT_DATA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSMAN_CONNECT_DATA`.Companion.`default`() : `WSMAN_CONNECT_DATA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WSMAN_CREATE_SHELL_DATA` (
    public var `data`: `WSMAN_DATA`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSMAN_CREATE_SHELL_DATA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSMAN_CREATE_SHELL_DATA`.Companion.`default`() : `WSMAN_CREATE_SHELL_DATA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WSMAN_DATA` (
    public var `type`: `WSManDataType`,
    public var `Anonymous`: `WSMAN_DATA_0`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSMAN_DATA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSMAN_DATA`.Companion.`default`() : `WSMAN_DATA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 636:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WSMAN_DATA_0 {
//     pub text: WSMAN_DATA_TEXT,
//     pub binaryData: WSMAN_DATA_BINARY,
//     pub number: u32,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSMAN_DATA_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSMAN_DATA_0`.Companion.`default`() : `WSMAN_DATA_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WSMAN_DATA_BINARY` (
    public var `dataLength`: UInt,
    public var `data`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSMAN_DATA_BINARY`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSMAN_DATA_BINARY`.Companion.`default`() : `WSMAN_DATA_BINARY` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `WSMAN_DATA_NONE`: `WSManDataType` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WSMAN_DATA_TEXT` (
    public var `bufferLength`: UInt,
    public var `buffer`: `windows_sys`.`core`.`PCWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSMAN_DATA_TEXT`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSMAN_DATA_TEXT`.Companion.`default`() : `WSMAN_DATA_TEXT` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `WSMAN_DATA_TYPE_BINARY`: `WSManDataType` = 2;
public const val `WSMAN_DATA_TYPE_DWORD`: `WSManDataType` = 4;
public const val `WSMAN_DATA_TYPE_TEXT`: `WSManDataType` = 1;
public const val `WSMAN_DEFAULT_TIMEOUT_MS`: UInt = 60000u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WSMAN_ENVIRONMENT_VARIABLE` (
    public var `name`: `windows_sys`.`core`.`PCWSTR`,
    public var `value`: `windows_sys`.`core`.`PCWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSMAN_ENVIRONMENT_VARIABLE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSMAN_ENVIRONMENT_VARIABLE`.Companion.`default`() : `WSMAN_ENVIRONMENT_VARIABLE` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WSMAN_ENVIRONMENT_VARIABLE_SET` (
    public var `varsCount`: UInt,
    public var `vars`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSMAN_ENVIRONMENT_VARIABLE`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSMAN_ENVIRONMENT_VARIABLE_SET`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSMAN_ENVIRONMENT_VARIABLE_SET`.Companion.`default`() : `WSMAN_ENVIRONMENT_VARIABLE_SET` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WSMAN_ERROR` (
    public var `code`: UInt,
    public var `errorDetail`: `windows_sys`.`core`.`PCWSTR`,
    public var `language`: `windows_sys`.`core`.`PCWSTR`,
    public var `machineName`: `windows_sys`.`core`.`PCWSTR`,
    public var `pluginName`: `windows_sys`.`core`.`PCWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSMAN_ERROR`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSMAN_ERROR`.Companion.`default`() : `WSMAN_ERROR` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WSMAN_FILTER` (
    public var `filter`: `windows_sys`.`core`.`PCWSTR`,
    public var `dialect`: `windows_sys`.`core`.`PCWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSMAN_FILTER`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSMAN_FILTER`.Companion.`default`() : `WSMAN_FILTER` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `WSMAN_FLAG_AUTH_BASIC`: `WSManAuthenticationFlags` = 8;
public const val `WSMAN_FLAG_AUTH_CLIENT_CERTIFICATE`: `WSManAuthenticationFlags` = 32;
public const val `WSMAN_FLAG_AUTH_CREDSSP`: `WSManAuthenticationFlags` = 128;
public const val `WSMAN_FLAG_AUTH_DIGEST`: `WSManAuthenticationFlags` = 2;
public const val `WSMAN_FLAG_AUTH_KERBEROS`: `WSManAuthenticationFlags` = 16;
public const val `WSMAN_FLAG_AUTH_NEGOTIATE`: `WSManAuthenticationFlags` = 4;
public const val `WSMAN_FLAG_CALLBACK_END_OF_OPERATION`: `WSManCallbackFlags` = 1;
public const val `WSMAN_FLAG_CALLBACK_END_OF_STREAM`: `WSManCallbackFlags` = 8;
public const val `WSMAN_FLAG_CALLBACK_NETWORK_FAILURE_DETECTED`: `WSManCallbackFlags` = 256;
public const val `WSMAN_FLAG_CALLBACK_RECEIVE_DELAY_STREAM_REQUEST_PROCESSED`: `WSManCallbackFlags` = 8192;
public const val `WSMAN_FLAG_CALLBACK_RECONNECTED_AFTER_NETWORK_FAILURE`: `WSManCallbackFlags` = 1024;
public const val `WSMAN_FLAG_CALLBACK_RETRYING_AFTER_NETWORK_FAILURE`: `WSManCallbackFlags` = 512;
public const val `WSMAN_FLAG_CALLBACK_RETRY_ABORTED_DUE_TO_INTERNAL_ERROR`: `WSManCallbackFlags` = 4096;
public const val `WSMAN_FLAG_CALLBACK_SHELL_AUTODISCONNECTED`: `WSManCallbackFlags` = 64;
public const val `WSMAN_FLAG_CALLBACK_SHELL_AUTODISCONNECTING`: `WSManCallbackFlags` = 2048;
public const val `WSMAN_FLAG_CALLBACK_SHELL_SUPPORTS_DISCONNECT`: `WSManCallbackFlags` = 32;
public const val `WSMAN_FLAG_DEFAULT_AUTHENTICATION`: `WSManAuthenticationFlags` = 0;
public const val `WSMAN_FLAG_DELETE_SERVER_SESSION`: `WSManShellFlag` = 2;
public const val `WSMAN_FLAG_NO_AUTHENTICATION`: `WSManAuthenticationFlags` = 1;
public const val `WSMAN_FLAG_NO_COMPRESSION`: `WSManShellFlag` = 1;
public const val `WSMAN_FLAG_RECEIVE_DELAY_OUTPUT_STREAM`: `WSManShellFlag` = 16;
public const val `WSMAN_FLAG_RECEIVE_FLUSH`: UInt = 2u;
public const val `WSMAN_FLAG_RECEIVE_RESULT_DATA_BOUNDARY`: UInt = 4u;
public const val `WSMAN_FLAG_RECEIVE_RESULT_NO_MORE_DATA`: UInt = 1u;
public const val `WSMAN_FLAG_REQUESTED_API_VERSION_1_0`: UInt = 0u;
public const val `WSMAN_FLAG_REQUESTED_API_VERSION_1_1`: UInt = 1u;
public const val `WSMAN_FLAG_SEND_NO_MORE_DATA`: UInt = 1u;
public const val `WSMAN_FLAG_SERVER_BUFFERING_MODE_BLOCK`: `WSManShellFlag` = 8;
public const val `WSMAN_FLAG_SERVER_BUFFERING_MODE_DROP`: `WSManShellFlag` = 4;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WSMAN_FRAGMENT` (
    public var `path`: `windows_sys`.`core`.`PCWSTR`,
    public var `dialect`: `windows_sys`.`core`.`PCWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSMAN_FRAGMENT`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSMAN_FRAGMENT`.Companion.`default`() : `WSMAN_FRAGMENT` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WSMAN_KEY` (
    public var `key`: `windows_sys`.`core`.`PCWSTR`,
    public var `value`: `windows_sys`.`core`.`PCWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSMAN_KEY`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSMAN_KEY`.Companion.`default`() : `WSMAN_KEY` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `WSMAN_OPERATION_HANDLE` = Long;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WSMAN_OPERATION_INFO` (
    public var `fragment`: `WSMAN_FRAGMENT`,
    public var `filter`: `WSMAN_FILTER`,
    public var `selectorSet`: `WSMAN_SELECTOR_SET`,
    public var `optionSet`: `WSMAN_OPTION_SET`,
    public var `reserved`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `version`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSMAN_OPERATION_INFO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSMAN_OPERATION_INFO`.Companion.`default`() : `WSMAN_OPERATION_INFO` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WSMAN_OPERATION_INFOEX` (
    public var `fragment`: `WSMAN_FRAGMENT`,
    public var `filter`: `WSMAN_FILTER`,
    public var `selectorSet`: `WSMAN_SELECTOR_SET`,
    public var `optionSet`: `WSMAN_OPTION_SETEX`,
    public var `version`: UInt,
    public var `uiLocale`: `windows_sys`.`core`.`PCWSTR`,
    public var `dataLocale`: `windows_sys`.`core`.`PCWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSMAN_OPERATION_INFOEX`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSMAN_OPERATION_INFOEX`.Companion.`default`() : `WSMAN_OPERATION_INFOEX` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `WSMAN_OPERATION_INFOV1`: UInt = 0u;
public const val `WSMAN_OPERATION_INFOV2`: UInt = 2864434397u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WSMAN_OPTION` (
    public var `name`: `windows_sys`.`core`.`PCWSTR`,
    public var `value`: `windows_sys`.`core`.`PCWSTR`,
    public var `mustComply`: `windows_sys`.`core`.`BOOL`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSMAN_OPTION`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSMAN_OPTION`.Companion.`default`() : `WSMAN_OPTION` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `WSMAN_OPTION_ALLOW_NEGOTIATE_IMPLICIT_CREDENTIALS`: `WSManSessionOption` = 32;
public const val `WSMAN_OPTION_DEFAULT_OPERATION_TIMEOUTMS`: `WSManSessionOption` = 1;
public const val `WSMAN_OPTION_ENABLE_SPN_SERVER_PORT`: `WSManSessionOption` = 22;
public const val `WSMAN_OPTION_LOCALE`: `WSManSessionOption` = 25;
public const val `WSMAN_OPTION_MACHINE_ID`: `WSManSessionOption` = 23;
public const val `WSMAN_OPTION_MAX_ENVELOPE_SIZE_KB`: `WSManSessionOption` = 28;
public const val `WSMAN_OPTION_MAX_RETRY_TIME`: `WSManSessionOption` = 11;
public const val `WSMAN_OPTION_PROXY_AUTO_DETECT`: `WSManProxyAccessType` = 4;
public const val `WSMAN_OPTION_PROXY_IE_PROXY_CONFIG`: `WSManProxyAccessType` = 1;
public const val `WSMAN_OPTION_PROXY_NO_PROXY_SERVER`: `WSManProxyAccessType` = 8;
public const val `WSMAN_OPTION_PROXY_WINHTTP_PROXY_CONFIG`: `WSManProxyAccessType` = 2;
public const val `WSMAN_OPTION_REDIRECT_LOCATION`: `WSManSessionOption` = 30;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WSMAN_OPTION_SET` (
    public var `optionsCount`: UInt,
    public var `options`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSMAN_OPTION`>?,
    public var `optionsMustUnderstand`: `windows_sys`.`core`.`BOOL`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSMAN_OPTION_SET`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSMAN_OPTION_SET`.Companion.`default`() : `WSMAN_OPTION_SET` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WSMAN_OPTION_SETEX` (
    public var `optionsCount`: UInt,
    public var `options`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSMAN_OPTION`>?,
    public var `optionsMustUnderstand`: `windows_sys`.`core`.`BOOL`,
    public var `optionTypes`: /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PCWSTR`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSMAN_OPTION_SETEX`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSMAN_OPTION_SETEX`.Companion.`default`() : `WSMAN_OPTION_SETEX` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `WSMAN_OPTION_SHELL_MAX_DATA_SIZE_PER_MESSAGE_KB`: `WSManSessionOption` = 29;
public const val `WSMAN_OPTION_SKIP_CA_CHECK`: `WSManSessionOption` = 18;
public const val `WSMAN_OPTION_SKIP_CN_CHECK`: `WSManSessionOption` = 19;
public const val `WSMAN_OPTION_SKIP_REVOCATION_CHECK`: `WSManSessionOption` = 31;
public const val `WSMAN_OPTION_TIMEOUTMS_CLOSE_SHELL`: `WSManSessionOption` = 17;
public const val `WSMAN_OPTION_TIMEOUTMS_CREATE_SHELL`: `WSManSessionOption` = 12;
public const val `WSMAN_OPTION_TIMEOUTMS_RECEIVE_SHELL_OUTPUT`: `WSManSessionOption` = 14;
public const val `WSMAN_OPTION_TIMEOUTMS_RUN_SHELL_COMMAND`: `WSManSessionOption` = 13;
public const val `WSMAN_OPTION_TIMEOUTMS_SEND_SHELL_INPUT`: `WSManSessionOption` = 15;
public const val `WSMAN_OPTION_TIMEOUTMS_SIGNAL_SHELL`: `WSManSessionOption` = 16;
public const val `WSMAN_OPTION_UI_LANGUAGE`: `WSManSessionOption` = 26;
public const val `WSMAN_OPTION_UNENCRYPTED_MESSAGES`: `WSManSessionOption` = 20;
public const val `WSMAN_OPTION_USE_INTEARACTIVE_TOKEN`: `WSManSessionOption` = 34;
public const val `WSMAN_OPTION_USE_SSL`: `WSManSessionOption` = 33;
public const val `WSMAN_OPTION_UTF16`: `WSManSessionOption` = 21;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WSMAN_PLUGIN_AUTHORIZE_OPERATION` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WSMAN_SENDER_DETAILS`>?, UInt, UInt, `windows_sys`.`core`.`PCWSTR`, `windows_sys`.`core`.`PCWSTR`) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WSMAN_PLUGIN_AUTHORIZE_QUERY_QUOTA` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WSMAN_SENDER_DETAILS`>?, UInt) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WSMAN_PLUGIN_AUTHORIZE_RELEASE_CONTEXT` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WSMAN_PLUGIN_AUTHORIZE_USER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WSMAN_SENDER_DETAILS`>?, UInt) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WSMAN_PLUGIN_COMMAND` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`WSMAN_PLUGIN_REQUEST`>?, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `windows_sys`.`core`.`PCWSTR`, /* Rust *const */ kotlinx.cinterop.CPointer<`WSMAN_COMMAND_ARG_SET`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WSMAN_PLUGIN_CONNECT` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`WSMAN_PLUGIN_REQUEST`>?, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WSMAN_DATA`>?) -> Unit>>>;
public const val `WSMAN_PLUGIN_PARAMS_AUTORESTART`: UInt = 3u;
public const val `WSMAN_PLUGIN_PARAMS_GET_REQUESTED_DATA_LOCALE`: UInt = 6u;
public const val `WSMAN_PLUGIN_PARAMS_GET_REQUESTED_LOCALE`: UInt = 5u;
public const val `WSMAN_PLUGIN_PARAMS_HOSTIDLETIMEOUTSECONDS`: UInt = 4u;
public const val `WSMAN_PLUGIN_PARAMS_LARGEST_RESULT_SIZE`: UInt = 4u;
public const val `WSMAN_PLUGIN_PARAMS_MAX_ENVELOPE_SIZE`: UInt = 1u;
public const val `WSMAN_PLUGIN_PARAMS_NAME`: UInt = 5u;
public const val `WSMAN_PLUGIN_PARAMS_REMAINING_RESULT_SIZE`: UInt = 3u;
public const val `WSMAN_PLUGIN_PARAMS_RUNAS_USER`: UInt = 2u;
public const val `WSMAN_PLUGIN_PARAMS_SHAREDHOST`: UInt = 1u;
public const val `WSMAN_PLUGIN_PARAMS_TIMEOUT`: UInt = 2u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WSMAN_PLUGIN_RECEIVE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`WSMAN_PLUGIN_REQUEST`>?, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WSMAN_STREAM_ID_SET`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WSMAN_PLUGIN_RELEASE_COMMAND_CONTEXT` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WSMAN_PLUGIN_RELEASE_SHELL_CONTEXT` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WSMAN_PLUGIN_REQUEST` (
    public var `senderDetails`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSMAN_SENDER_DETAILS`>?,
    public var `locale`: `windows_sys`.`core`.`PCWSTR`,
    public var `resourceUri`: `windows_sys`.`core`.`PCWSTR`,
    public var `operationInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSMAN_OPERATION_INFO`>?,
    public var `shutdownNotification`: `windows_sys`.`core`.`BOOL`,
    public var `shutdownNotificationHandle`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `dataLocale`: `windows_sys`.`core`.`PCWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSMAN_PLUGIN_REQUEST`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSMAN_PLUGIN_REQUEST`.Companion.`default`() : `WSMAN_PLUGIN_REQUEST` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WSMAN_PLUGIN_SEND` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`WSMAN_PLUGIN_REQUEST`>?, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `windows_sys`.`core`.`PCWSTR`, /* Rust *const */ kotlinx.cinterop.CPointer<`WSMAN_DATA`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WSMAN_PLUGIN_SHELL` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WSMAN_PLUGIN_REQUEST`>?, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`WSMAN_SHELL_STARTUP_INFO_V11`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WSMAN_DATA`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WSMAN_PLUGIN_SHUTDOWN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, UInt) -> UInt>>>;
public const val `WSMAN_PLUGIN_SHUTDOWN_IDLETIMEOUT_ELAPSED`: UInt = 4u;
public const val `WSMAN_PLUGIN_SHUTDOWN_IISHOST`: UInt = 3u;
public const val `WSMAN_PLUGIN_SHUTDOWN_SERVICE`: UInt = 2u;
public const val `WSMAN_PLUGIN_SHUTDOWN_SYSTEM`: UInt = 1u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WSMAN_PLUGIN_SIGNAL` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`WSMAN_PLUGIN_REQUEST`>?, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `windows_sys`.`core`.`PCWSTR`) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WSMAN_PLUGIN_STARTUP` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, `windows_sys`.`core`.`PCWSTR`, `windows_sys`.`core`.`PCWSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) -> UInt>>>;
public const val `WSMAN_PLUGIN_STARTUP_AUTORESTARTED_CRASH`: UInt = 2u;
public const val `WSMAN_PLUGIN_STARTUP_AUTORESTARTED_REBOOT`: UInt = 1u;
public const val `WSMAN_PLUGIN_STARTUP_REQUEST_RECEIVED`: UInt = 0u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WSMAN_PROXY_INFO` (
    public var `accessType`: UInt,
    public var `authenticationCredentials`: `WSMAN_AUTHENTICATION_CREDENTIALS`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSMAN_PROXY_INFO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSMAN_PROXY_INFO`.Companion.`default`() : `WSMAN_PROXY_INFO` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WSMAN_RECEIVE_DATA_RESULT` (
    public var `streamId`: `windows_sys`.`core`.`PCWSTR`,
    public var `streamData`: `WSMAN_DATA`,
    public var `commandState`: `windows_sys`.`core`.`PCWSTR`,
    public var `exitCode`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSMAN_RECEIVE_DATA_RESULT`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSMAN_RECEIVE_DATA_RESULT`.Companion.`default`() : `WSMAN_RECEIVE_DATA_RESULT` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 943:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WSMAN_RESPONSE_DATA {
//     pub receiveData: WSMAN_RECEIVE_DATA_RESULT,
//     pub connectData: WSMAN_CONNECT_DATA,
//     pub createData: WSMAN_CREATE_SHELL_DATA,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSMAN_RESPONSE_DATA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSMAN_RESPONSE_DATA`.Companion.`default`() : `WSMAN_RESPONSE_DATA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WSMAN_SELECTOR_SET` (
    public var `numberKeys`: UInt,
    public var `keys`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSMAN_KEY`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSMAN_SELECTOR_SET`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSMAN_SELECTOR_SET`.Companion.`default`() : `WSMAN_SELECTOR_SET` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WSMAN_SENDER_DETAILS` (
    public var `senderName`: `windows_sys`.`core`.`PCWSTR`,
    public var `authenticationMechanism`: `windows_sys`.`core`.`PCWSTR`,
    public var `certificateDetails`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSMAN_CERTIFICATE_DETAILS`>?,
    public var `clientToken`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `httpURL`: `windows_sys`.`core`.`PCWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSMAN_SENDER_DETAILS`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSMAN_SENDER_DETAILS`.Companion.`default`() : `WSMAN_SENDER_DETAILS` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `WSMAN_SESSION_HANDLE` = Long;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WSMAN_SHELL_ASYNC` (
    public var `operationContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `completionFunction`: `WSMAN_SHELL_COMPLETION_FUNCTION`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSMAN_SHELL_ASYNC`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSMAN_SHELL_ASYNC`.Companion.`default`() : `WSMAN_SHELL_ASYNC` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WSMAN_SHELL_COMPLETION_FUNCTION` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`WSMAN_ERROR`>?, `WSMAN_SHELL_HANDLE`, `WSMAN_COMMAND_HANDLE`, `WSMAN_OPERATION_HANDLE`, /* Rust *const */ kotlinx.cinterop.CPointer<`WSMAN_RESPONSE_DATA`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WSMAN_SHELL_DISCONNECT_INFO` (
    public var `idleTimeoutMs`: UInt,
)
public typealias `WSMAN_SHELL_HANDLE` = Long;
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `WSMAN_SHELL_NS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("http://schemas.microsoft.com/wbem/wsman/1/windows/shell");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `WSMAN_SHELL_OPTION_NOPROFILE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("WINRS_NOPROFILE");
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WSMAN_SHELL_STARTUP_INFO_V10` (
    public var `inputStreamSet`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSMAN_STREAM_ID_SET`>?,
    public var `outputStreamSet`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSMAN_STREAM_ID_SET`>?,
    public var `idleTimeoutMs`: UInt,
    public var `workingDirectory`: `windows_sys`.`core`.`PCWSTR`,
    public var `variableSet`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSMAN_ENVIRONMENT_VARIABLE_SET`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSMAN_SHELL_STARTUP_INFO_V10`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSMAN_SHELL_STARTUP_INFO_V10`.Companion.`default`() : `WSMAN_SHELL_STARTUP_INFO_V10` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WSMAN_SHELL_STARTUP_INFO_V11` (
    public var `Base`: `WSMAN_SHELL_STARTUP_INFO_V10`,
    public var `name`: `windows_sys`.`core`.`PCWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSMAN_SHELL_STARTUP_INFO_V11`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSMAN_SHELL_STARTUP_INFO_V11`.Companion.`default`() : `WSMAN_SHELL_STARTUP_INFO_V11` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WSMAN_STREAM_ID_SET` (
    public var `streamIDsCount`: UInt,
    public var `streamIDs`: /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PCWSTR`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSMAN_STREAM_ID_SET`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSMAN_STREAM_ID_SET`.Companion.`default`() : `WSMAN_STREAM_ID_SET` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `WSMAN_STREAM_ID_STDERR`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("stderr");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `WSMAN_STREAM_ID_STDIN`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("stdin");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `WSMAN_STREAM_ID_STDOUT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("stdout");
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WSMAN_USERNAME_PASSWORD_CREDS` (
    public var `username`: `windows_sys`.`core`.`PCWSTR`,
    public var `password`: `windows_sys`.`core`.`PCWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSMAN_USERNAME_PASSWORD_CREDS`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSMAN_USERNAME_PASSWORD_CREDS`.Companion.`default`() : `WSMAN_USERNAME_PASSWORD_CREDS` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 1051:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WSMan: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbced617b_ec03_420b_8508_977dc7a686bd);

public typealias `WSManAuthenticationFlags` = Int;
public typealias `WSManCallbackFlags` = Int;
public typealias `WSManDataType` = Int;
public typealias `WSManEnumFlags` = Int;
public const val `WSManFlagAllowNegotiateImplicitCredentials`: `WSManSessionFlags` = 67108864;
public const val `WSManFlagAssociatedInstance`: `WSManEnumFlags` = 0;
public const val `WSManFlagAssociationInstance`: `WSManEnumFlags` = 128;
public const val `WSManFlagCredUsernamePassword`: `WSManSessionFlags` = 4096;
public const val `WSManFlagEnableSPNServerPort`: `WSManSessionFlags` = 4194304;
public const val `WSManFlagHierarchyDeep`: `WSManEnumFlags` = 0;
public const val `WSManFlagHierarchyDeepBasePropsOnly`: `WSManEnumFlags` = 64;
public const val `WSManFlagHierarchyShallow`: `WSManEnumFlags` = 32;
public const val `WSManFlagNoEncryption`: `WSManSessionFlags` = 1048576;
public const val `WSManFlagNonXmlText`: `WSManEnumFlags` = 1;
public const val `WSManFlagProxyAuthenticationUseBasic`: `WSManProxyAuthenticationFlags` = 2;
public const val `WSManFlagProxyAuthenticationUseDigest`: `WSManProxyAuthenticationFlags` = 4;
public const val `WSManFlagProxyAuthenticationUseNegotiate`: `WSManProxyAuthenticationFlags` = 1;
public const val `WSManFlagReturnEPR`: `WSManEnumFlags` = 2;
public const val `WSManFlagReturnObject`: `WSManEnumFlags` = 0;
public const val `WSManFlagReturnObjectAndEPR`: `WSManEnumFlags` = 4;
public const val `WSManFlagSkipCACheck`: `WSManSessionFlags` = 8192;
public const val `WSManFlagSkipCNCheck`: `WSManSessionFlags` = 16384;
public const val `WSManFlagSkipRevocationCheck`: `WSManSessionFlags` = 33554432;
public const val `WSManFlagUTF16`: `WSManSessionFlags` = 8388608;
public const val `WSManFlagUTF8`: `WSManSessionFlags` = 1;
public const val `WSManFlagUseBasic`: `WSManSessionFlags` = 262144;
public const val `WSManFlagUseClientCertificate`: `WSManSessionFlags` = 2097152;
public const val `WSManFlagUseCredSsp`: `WSManSessionFlags` = 16777216;
public const val `WSManFlagUseDigest`: `WSManSessionFlags` = 65536;
public const val `WSManFlagUseKerberos`: `WSManSessionFlags` = 524288;
public const val `WSManFlagUseNegotiate`: `WSManSessionFlags` = 131072;
public const val `WSManFlagUseNoAuthentication`: `WSManSessionFlags` = 32768;
public const val `WSManFlagUseSsl`: `WSManSessionFlags` = 134217728;
// UNSUPPORTED Rust 1085:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WSManInternal: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7de087a5_5dcb_4df7_bb12_0924ad8fbd9a);

public typealias `WSManProxyAccessType` = Int;
public typealias `WSManProxyAccessTypeFlags` = Int;
public typealias `WSManProxyAuthenticationFlags` = Int;
public const val `WSManProxyAutoDetect`: `WSManProxyAccessTypeFlags` = 4;
public const val `WSManProxyIEConfig`: `WSManProxyAccessTypeFlags` = 1;
public const val `WSManProxyNoProxyServer`: `WSManProxyAccessTypeFlags` = 8;
public const val `WSManProxyWinHttpConfig`: `WSManProxyAccessTypeFlags` = 2;
public typealias `WSManSessionFlags` = Int;
public typealias `WSManSessionOption` = Int;
public typealias `WSManShellFlag` = Int;
