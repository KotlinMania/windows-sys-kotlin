#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_REMOTEMANAGEMENT_WINDOWS_WIN32_SYSTEM_REMOTEMANAGEMENT_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_REMOTEMANAGEMENT_WINDOWS_WIN32_SYSTEM_REMOTEMANAGEMENT_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void windowssys_windows_win32_system_remotemanagement_wSManCloseCommand(int64_t commandhandle, uint32_t flags, void* async);
uint32_t windowssys_windows_win32_system_remotemanagement_wSManCloseOperation(int64_t operationhandle, uint32_t flags);
uint32_t windowssys_windows_win32_system_remotemanagement_wSManCloseSession(int64_t session, uint32_t flags);
void windowssys_windows_win32_system_remotemanagement_wSManCloseShell(int64_t shellhandle, uint32_t flags, void* async);
void windowssys_windows_win32_system_remotemanagement_wSManConnectShell(int64_t session, uint32_t flags, void* resourceuri, void* shellid, void* options, void* connectxml, void* async, void* shell);
void windowssys_windows_win32_system_remotemanagement_wSManConnectShellCommand(int64_t shell, uint32_t flags, void* commandid, void* options, void* connectxml, void* async, void* command);
uint32_t windowssys_windows_win32_system_remotemanagement_wSManCreateSession(int64_t apihandle, void* connection, uint32_t flags, void* serverauthenticationcredentials, void* proxyinfo, void* session);
void windowssys_windows_win32_system_remotemanagement_wSManCreateShell(int64_t session, uint32_t flags, void* resourceuri, void* startupinfo, void* options, void* createxml, void* async, void* shell);
void windowssys_windows_win32_system_remotemanagement_wSManCreateShellEx(int64_t session, uint32_t flags, void* resourceuri, void* shellid, void* startupinfo, void* options, void* createxml, void* async, void* shell);
uint32_t windowssys_windows_win32_system_remotemanagement_wSManDeinitialize(int64_t apihandle, uint32_t flags);
void windowssys_windows_win32_system_remotemanagement_wSManDisconnectShell(int64_t shell, uint32_t flags, void* disconnectinfo, void* async);
uint32_t windowssys_windows_win32_system_remotemanagement_wSManGetErrorMessage(int64_t apihandle, uint32_t flags, void* languagecode, uint32_t errorcode, uint32_t messagelength, void* message, void* messagelengthused);
uint32_t windowssys_windows_win32_system_remotemanagement_wSManGetSessionOptionAsDword(int64_t session, int32_t option, void* value);
uint32_t windowssys_windows_win32_system_remotemanagement_wSManGetSessionOptionAsString(int64_t session, int32_t option, uint32_t stringlength, void* string, void* stringlengthused);
uint32_t windowssys_windows_win32_system_remotemanagement_wSManInitialize(uint32_t flags, void* apihandle);
uint32_t windowssys_windows_win32_system_remotemanagement_wSManPluginAuthzOperationComplete(void* senderdetails, uint32_t flags, void* userauthorizationcontext, uint32_t errorcode, void* extendederrorinformation);
uint32_t windowssys_windows_win32_system_remotemanagement_wSManPluginAuthzQueryQuotaComplete(void* senderdetails, uint32_t flags, void* quota, uint32_t errorcode, void* extendederrorinformation);
uint32_t windowssys_windows_win32_system_remotemanagement_wSManPluginAuthzUserComplete(void* senderdetails, uint32_t flags, void* userauthorizationcontext, void* impersonationtoken, int32_t userisadministrator, uint32_t errorcode, void* extendederrorinformation);
uint32_t windowssys_windows_win32_system_remotemanagement_wSManPluginFreeRequestDetails(void* requestdetails);
uint32_t windowssys_windows_win32_system_remotemanagement_wSManPluginGetConfiguration(void* plugincontext, uint32_t flags, void* data);
uint32_t windowssys_windows_win32_system_remotemanagement_wSManPluginGetOperationParameters(void* requestdetails, uint32_t flags, void* data);
uint32_t windowssys_windows_win32_system_remotemanagement_wSManPluginOperationComplete(void* requestdetails, uint32_t flags, uint32_t errorcode, void* extendedinformation);
uint32_t windowssys_windows_win32_system_remotemanagement_wSManPluginReceiveResult(void* requestdetails, uint32_t flags, void* stream, void* streamresult, void* commandstate, uint32_t exitcode);
uint32_t windowssys_windows_win32_system_remotemanagement_wSManPluginReportCompletion(void* plugincontext, uint32_t flags);
uint32_t windowssys_windows_win32_system_remotemanagement_wSManPluginReportContext(void* requestdetails, uint32_t flags, void* context);
void windowssys_windows_win32_system_remotemanagement_wSManReceiveShellOutput(int64_t shell, int64_t command, uint32_t flags, void* desiredstreamset, void* async, void* receiveoperation);
void windowssys_windows_win32_system_remotemanagement_wSManReconnectShell(int64_t shell, uint32_t flags, void* async);
void windowssys_windows_win32_system_remotemanagement_wSManReconnectShellCommand(int64_t commandhandle, uint32_t flags, void* async);
void windowssys_windows_win32_system_remotemanagement_wSManRunShellCommand(int64_t shell, uint32_t flags, void* commandline, void* args, void* options, void* async, void* command);
void windowssys_windows_win32_system_remotemanagement_wSManRunShellCommandEx(int64_t shell, uint32_t flags, void* commandid, void* commandline, void* args, void* options, void* async, void* command);
void windowssys_windows_win32_system_remotemanagement_wSManSendShellInput(int64_t shell, int64_t command, uint32_t flags, void* streamid, void* streamdata, int32_t endofstream, void* async, void* sendoperation);
uint32_t windowssys_windows_win32_system_remotemanagement_wSManSetSessionOption(int64_t session, int32_t option, void* data);
void windowssys_windows_win32_system_remotemanagement_wSManSignalShell(int64_t shell, int64_t command, uint32_t flags, void* code, void* async, void* signaloperation);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_REMOTEMANAGEMENT_WINDOWS_WIN32_SYSTEM_REMOTEMANAGEMENT_WRAPPER_H */
