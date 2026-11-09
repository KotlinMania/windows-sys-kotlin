#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_REMOTEMANAGEMENT_WINDOWS_WIN32_SYSTEM_REMOTEMANAGEMENT_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_REMOTEMANAGEMENT_WINDOWS_WIN32_SYSTEM_REMOTEMANAGEMENT_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void windowssys_windows_win32_system_remotemanagement_WSManCloseCommand(int64_t commandhandle, uint32_t flags, void* async);
uint32_t windowssys_windows_win32_system_remotemanagement_WSManCloseOperation(int64_t operationhandle, uint32_t flags);
uint32_t windowssys_windows_win32_system_remotemanagement_WSManCloseSession(int64_t session, uint32_t flags);
void windowssys_windows_win32_system_remotemanagement_WSManCloseShell(int64_t shellhandle, uint32_t flags, void* async);
void windowssys_windows_win32_system_remotemanagement_WSManConnectShell(int64_t session, uint32_t flags, void* resourceuri, void* shellid, void* options, void* connectxml, void* async, void* shell);
void windowssys_windows_win32_system_remotemanagement_WSManConnectShellCommand(int64_t shell, uint32_t flags, void* commandid, void* options, void* connectxml, void* async, void* command);
uint32_t windowssys_windows_win32_system_remotemanagement_WSManCreateSession(int64_t apihandle, void* connection, uint32_t flags, void* serverauthenticationcredentials, void* proxyinfo, void* session);
void windowssys_windows_win32_system_remotemanagement_WSManCreateShell(int64_t session, uint32_t flags, void* resourceuri, void* startupinfo, void* options, void* createxml, void* async, void* shell);
void windowssys_windows_win32_system_remotemanagement_WSManCreateShellEx(int64_t session, uint32_t flags, void* resourceuri, void* shellid, void* startupinfo, void* options, void* createxml, void* async, void* shell);
uint32_t windowssys_windows_win32_system_remotemanagement_WSManDeinitialize(int64_t apihandle, uint32_t flags);
void windowssys_windows_win32_system_remotemanagement_WSManDisconnectShell(int64_t shell, uint32_t flags, void* disconnectinfo, void* async);
uint32_t windowssys_windows_win32_system_remotemanagement_WSManGetErrorMessage(int64_t apihandle, uint32_t flags, void* languagecode, uint32_t errorcode, uint32_t messagelength, void* message, void* messagelengthused);
uint32_t windowssys_windows_win32_system_remotemanagement_WSManGetSessionOptionAsDword(int64_t session, int32_t option, void* value);
uint32_t windowssys_windows_win32_system_remotemanagement_WSManGetSessionOptionAsString(int64_t session, int32_t option, uint32_t stringlength, void* string, void* stringlengthused);
uint32_t windowssys_windows_win32_system_remotemanagement_WSManInitialize(uint32_t flags, void* apihandle);
uint32_t windowssys_windows_win32_system_remotemanagement_WSManPluginAuthzOperationComplete(void* senderdetails, uint32_t flags, void* userauthorizationcontext, uint32_t errorcode, void* extendederrorinformation);
uint32_t windowssys_windows_win32_system_remotemanagement_WSManPluginAuthzQueryQuotaComplete(void* senderdetails, uint32_t flags, void* quota, uint32_t errorcode, void* extendederrorinformation);
uint32_t windowssys_windows_win32_system_remotemanagement_WSManPluginAuthzUserComplete(void* senderdetails, uint32_t flags, void* userauthorizationcontext, void* impersonationtoken, int32_t userisadministrator, uint32_t errorcode, void* extendederrorinformation);
uint32_t windowssys_windows_win32_system_remotemanagement_WSManPluginFreeRequestDetails(void* requestdetails);
uint32_t windowssys_windows_win32_system_remotemanagement_WSManPluginGetConfiguration(void* plugincontext, uint32_t flags, void* data);
uint32_t windowssys_windows_win32_system_remotemanagement_WSManPluginGetOperationParameters(void* requestdetails, uint32_t flags, void* data);
uint32_t windowssys_windows_win32_system_remotemanagement_WSManPluginOperationComplete(void* requestdetails, uint32_t flags, uint32_t errorcode, void* extendedinformation);
uint32_t windowssys_windows_win32_system_remotemanagement_WSManPluginReceiveResult(void* requestdetails, uint32_t flags, void* stream, void* streamresult, void* commandstate, uint32_t exitcode);
uint32_t windowssys_windows_win32_system_remotemanagement_WSManPluginReportCompletion(void* plugincontext, uint32_t flags);
uint32_t windowssys_windows_win32_system_remotemanagement_WSManPluginReportContext(void* requestdetails, uint32_t flags, void* context);
void windowssys_windows_win32_system_remotemanagement_WSManReceiveShellOutput(int64_t shell, int64_t command, uint32_t flags, void* desiredstreamset, void* async, void* receiveoperation);
void windowssys_windows_win32_system_remotemanagement_WSManReconnectShell(int64_t shell, uint32_t flags, void* async);
void windowssys_windows_win32_system_remotemanagement_WSManReconnectShellCommand(int64_t commandhandle, uint32_t flags, void* async);
void windowssys_windows_win32_system_remotemanagement_WSManRunShellCommand(int64_t shell, uint32_t flags, void* commandline, void* args, void* options, void* async, void* command);
void windowssys_windows_win32_system_remotemanagement_WSManRunShellCommandEx(int64_t shell, uint32_t flags, void* commandid, void* commandline, void* args, void* options, void* async, void* command);
void windowssys_windows_win32_system_remotemanagement_WSManSendShellInput(int64_t shell, int64_t command, uint32_t flags, void* streamid, void* streamdata, int32_t endofstream, void* async, void* sendoperation);
uint32_t windowssys_windows_win32_system_remotemanagement_WSManSetSessionOption(int64_t session, int32_t option, void* data);
void windowssys_windows_win32_system_remotemanagement_WSManSignalShell(int64_t shell, int64_t command, uint32_t flags, void* code, void* async, void* signaloperation);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_REMOTEMANAGEMENT_WINDOWS_WIN32_SYSTEM_REMOTEMANAGEMENT_WRAPPER_H */
