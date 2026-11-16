#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_REMOTEMANAGEMENT_WINDOWS_WIN32_SYSTEM_REMOTEMANAGEMENT_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_REMOTEMANAGEMENT_WINDOWS_WIN32_SYSTEM_REMOTEMANAGEMENT_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void windowssysWindowsWin32SystemRemotemanagementWSManCloseCommand(int64_t commandhandle, uint32_t flags, void* async);
uint32_t windowssysWindowsWin32SystemRemotemanagementWSManCloseOperation(int64_t operationhandle, uint32_t flags);
uint32_t windowssysWindowsWin32SystemRemotemanagementWSManCloseSession(int64_t session, uint32_t flags);
void windowssysWindowsWin32SystemRemotemanagementWSManCloseShell(int64_t shellhandle, uint32_t flags, void* async);
void windowssysWindowsWin32SystemRemotemanagementWSManConnectShell(int64_t session, uint32_t flags, void* resourceuri, void* shellid, void* options, void* connectxml, void* async, void* shell);
void windowssysWindowsWin32SystemRemotemanagementWSManConnectShellCommand(int64_t shell, uint32_t flags, void* commandid, void* options, void* connectxml, void* async, void* command);
uint32_t windowssysWindowsWin32SystemRemotemanagementWSManCreateSession(int64_t apihandle, void* connection, uint32_t flags, void* serverauthenticationcredentials, void* proxyinfo, void* session);
void windowssysWindowsWin32SystemRemotemanagementWSManCreateShell(int64_t session, uint32_t flags, void* resourceuri, void* startupinfo, void* options, void* createxml, void* async, void* shell);
void windowssysWindowsWin32SystemRemotemanagementWSManCreateShellEx(int64_t session, uint32_t flags, void* resourceuri, void* shellid, void* startupinfo, void* options, void* createxml, void* async, void* shell);
uint32_t windowssysWindowsWin32SystemRemotemanagementWSManDeinitialize(int64_t apihandle, uint32_t flags);
void windowssysWindowsWin32SystemRemotemanagementWSManDisconnectShell(int64_t shell, uint32_t flags, void* disconnectinfo, void* async);
uint32_t windowssysWindowsWin32SystemRemotemanagementWSManGetErrorMessage(int64_t apihandle, uint32_t flags, void* languagecode, uint32_t errorcode, uint32_t messagelength, void* message, void* messagelengthused);
uint32_t windowssysWindowsWin32SystemRemotemanagementWSManGetSessionOptionAsDword(int64_t session, int32_t option, void* value);
uint32_t windowssysWindowsWin32SystemRemotemanagementWSManGetSessionOptionAsString(int64_t session, int32_t option, uint32_t stringlength, void* string, void* stringlengthused);
uint32_t windowssysWindowsWin32SystemRemotemanagementWSManInitialize(uint32_t flags, void* apihandle);
uint32_t windowssysWindowsWin32SystemRemotemanagementWSManPluginAuthzOperationComplete(void* senderdetails, uint32_t flags, void* userauthorizationcontext, uint32_t errorcode, void* extendederrorinformation);
uint32_t windowssysWindowsWin32SystemRemotemanagementWSManPluginAuthzQueryQuotaComplete(void* senderdetails, uint32_t flags, void* quota, uint32_t errorcode, void* extendederrorinformation);
uint32_t windowssysWindowsWin32SystemRemotemanagementWSManPluginAuthzUserComplete(void* senderdetails, uint32_t flags, void* userauthorizationcontext, void* impersonationtoken, int32_t userisadministrator, uint32_t errorcode, void* extendederrorinformation);
uint32_t windowssysWindowsWin32SystemRemotemanagementWSManPluginFreeRequestDetails(void* requestdetails);
uint32_t windowssysWindowsWin32SystemRemotemanagementWSManPluginGetConfiguration(void* plugincontext, uint32_t flags, void* data);
uint32_t windowssysWindowsWin32SystemRemotemanagementWSManPluginGetOperationParameters(void* requestdetails, uint32_t flags, void* data);
uint32_t windowssysWindowsWin32SystemRemotemanagementWSManPluginOperationComplete(void* requestdetails, uint32_t flags, uint32_t errorcode, void* extendedinformation);
uint32_t windowssysWindowsWin32SystemRemotemanagementWSManPluginReceiveResult(void* requestdetails, uint32_t flags, void* stream, void* streamresult, void* commandstate, uint32_t exitcode);
uint32_t windowssysWindowsWin32SystemRemotemanagementWSManPluginReportCompletion(void* plugincontext, uint32_t flags);
uint32_t windowssysWindowsWin32SystemRemotemanagementWSManPluginReportContext(void* requestdetails, uint32_t flags, void* context);
void windowssysWindowsWin32SystemRemotemanagementWSManReceiveShellOutput(int64_t shell, int64_t command, uint32_t flags, void* desiredstreamset, void* async, void* receiveoperation);
void windowssysWindowsWin32SystemRemotemanagementWSManReconnectShell(int64_t shell, uint32_t flags, void* async);
void windowssysWindowsWin32SystemRemotemanagementWSManReconnectShellCommand(int64_t commandhandle, uint32_t flags, void* async);
void windowssysWindowsWin32SystemRemotemanagementWSManRunShellCommand(int64_t shell, uint32_t flags, void* commandline, void* args, void* options, void* async, void* command);
void windowssysWindowsWin32SystemRemotemanagementWSManRunShellCommandEx(int64_t shell, uint32_t flags, void* commandid, void* commandline, void* args, void* options, void* async, void* command);
void windowssysWindowsWin32SystemRemotemanagementWSManSendShellInput(int64_t shell, int64_t command, uint32_t flags, void* streamid, void* streamdata, int32_t endofstream, void* async, void* sendoperation);
uint32_t windowssysWindowsWin32SystemRemotemanagementWSManSetSessionOption(int64_t session, int32_t option, void* data);
void windowssysWindowsWin32SystemRemotemanagementWSManSignalShell(int64_t shell, int64_t command, uint32_t flags, void* code, void* async, void* signaloperation);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_REMOTEMANAGEMENT_WINDOWS_WIN32_SYSTEM_REMOTEMANAGEMENT_WRAPPER_H */
