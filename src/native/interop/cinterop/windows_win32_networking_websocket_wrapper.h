#ifndef WINDOWSSYS_WINDOWS_WIN32_NETWORKING_WEBSOCKET_WINDOWS_WIN32_NETWORKING_WEBSOCKET_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_NETWORKING_WEBSOCKET_WINDOWS_WIN32_NETWORKING_WEBSOCKET_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void windowssys_windows_win32_networking_websocket_WebSocketAbortHandle(void* hwebsocket);
int32_t windowssys_windows_win32_networking_websocket_WebSocketBeginClientHandshake(void* hwebsocket, void* pszsubprotocols, uint32_t ulsubprotocolcount, void* pszextensions, uint32_t ulextensioncount, void* pinitialheaders, uint32_t ulinitialheadercount, void* padditionalheaders, void* puladditionalheadercount);
int32_t windowssys_windows_win32_networking_websocket_WebSocketBeginServerHandshake(void* hwebsocket, void* pszsubprotocolselected, void* pszextensionselected, uint32_t ulextensionselectedcount, void* prequestheaders, uint32_t ulrequestheadercount, void* presponseheaders, void* pulresponseheadercount);
void windowssys_windows_win32_networking_websocket_WebSocketCompleteAction(void* hwebsocket, void* pvactioncontext, uint32_t ulbytestransferred);
int32_t windowssys_windows_win32_networking_websocket_WebSocketCreateClientHandle(void* pproperties, uint32_t ulpropertycount, void* phwebsocket);
int32_t windowssys_windows_win32_networking_websocket_WebSocketCreateServerHandle(void* pproperties, uint32_t ulpropertycount, void* phwebsocket);
void windowssys_windows_win32_networking_websocket_WebSocketDeleteHandle(void* hwebsocket);
int32_t windowssys_windows_win32_networking_websocket_WebSocketEndClientHandshake(void* hwebsocket, void* presponseheaders, uint32_t ulreponseheadercount, void* pulselectedextensions, void* pulselectedextensioncount, void* pulselectedsubprotocol);
int32_t windowssys_windows_win32_networking_websocket_WebSocketEndServerHandshake(void* hwebsocket);
int32_t windowssys_windows_win32_networking_websocket_WebSocketGetAction(void* hwebsocket, int32_t eactionqueue, void* pdatabuffers, void* puldatabuffercount, void* paction, void* pbuffertype, void* pvapplicationcontext, void* pvactioncontext);
int32_t windowssys_windows_win32_networking_websocket_WebSocketGetGlobalProperty(int32_t etype, void* pvvalue, void* ulsize);
int32_t windowssys_windows_win32_networking_websocket_WebSocketReceive(void* hwebsocket, void* pbuffer, void* pvcontext);
int32_t windowssys_windows_win32_networking_websocket_WebSocketSend(void* hwebsocket, int32_t buffertype, void* pbuffer, void* context);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_NETWORKING_WEBSOCKET_WINDOWS_WIN32_NETWORKING_WEBSOCKET_WRAPPER_H */
