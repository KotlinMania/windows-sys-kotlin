#ifndef WINDOWSSYS_WINDOWS_WIN32_NETWORKING_WEBSOCKET_WINDOWS_WIN32_NETWORKING_WEBSOCKET_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_NETWORKING_WEBSOCKET_WINDOWS_WIN32_NETWORKING_WEBSOCKET_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void windowssys_windows_win32_networking_websocket_webSocketAbortHandle(void* hwebsocket);
int32_t windowssys_windows_win32_networking_websocket_webSocketBeginClientHandshake(void* hwebsocket, void* pszsubprotocols, uint32_t ulsubprotocolcount, void* pszextensions, uint32_t ulextensioncount, void* pinitialheaders, uint32_t ulinitialheadercount, void* padditionalheaders, void* puladditionalheadercount);
int32_t windowssys_windows_win32_networking_websocket_webSocketBeginServerHandshake(void* hwebsocket, void* pszsubprotocolselected, void* pszextensionselected, uint32_t ulextensionselectedcount, void* prequestheaders, uint32_t ulrequestheadercount, void* presponseheaders, void* pulresponseheadercount);
void windowssys_windows_win32_networking_websocket_webSocketCompleteAction(void* hwebsocket, void* pvactioncontext, uint32_t ulbytestransferred);
int32_t windowssys_windows_win32_networking_websocket_webSocketCreateClientHandle(void* pproperties, uint32_t ulpropertycount, void* phwebsocket);
int32_t windowssys_windows_win32_networking_websocket_webSocketCreateServerHandle(void* pproperties, uint32_t ulpropertycount, void* phwebsocket);
void windowssys_windows_win32_networking_websocket_webSocketDeleteHandle(void* hwebsocket);
int32_t windowssys_windows_win32_networking_websocket_webSocketEndClientHandshake(void* hwebsocket, void* presponseheaders, uint32_t ulreponseheadercount, void* pulselectedextensions, void* pulselectedextensioncount, void* pulselectedsubprotocol);
int32_t windowssys_windows_win32_networking_websocket_webSocketEndServerHandshake(void* hwebsocket);
int32_t windowssys_windows_win32_networking_websocket_webSocketGetAction(void* hwebsocket, int32_t eactionqueue, void* pdatabuffers, void* puldatabuffercount, void* paction, void* pbuffertype, void* pvapplicationcontext, void* pvactioncontext);
int32_t windowssys_windows_win32_networking_websocket_webSocketGetGlobalProperty(int32_t etype, void* pvvalue, void* ulsize);
int32_t windowssys_windows_win32_networking_websocket_webSocketReceive(void* hwebsocket, void* pbuffer, void* pvcontext);
int32_t windowssys_windows_win32_networking_websocket_webSocketSend(void* hwebsocket, int32_t buffertype, void* pbuffer, void* context);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_NETWORKING_WEBSOCKET_WINDOWS_WIN32_NETWORKING_WEBSOCKET_WRAPPER_H */
