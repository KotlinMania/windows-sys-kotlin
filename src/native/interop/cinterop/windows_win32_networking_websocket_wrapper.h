#ifndef WINDOWSSYS_WINDOWS_WIN32_NETWORKING_WEBSOCKET_WINDOWS_WIN32_NETWORKING_WEBSOCKET_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_NETWORKING_WEBSOCKET_WINDOWS_WIN32_NETWORKING_WEBSOCKET_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void windowssysWindowsWin32NetworkingWebsocketWebSocketAbortHandle(void* hwebsocket);
int32_t windowssysWindowsWin32NetworkingWebsocketWebSocketBeginClientHandshake(void* hwebsocket, void* pszsubprotocols, uint32_t ulsubprotocolcount, void* pszextensions, uint32_t ulextensioncount, void* pinitialheaders, uint32_t ulinitialheadercount, void* padditionalheaders, void* puladditionalheadercount);
int32_t windowssysWindowsWin32NetworkingWebsocketWebSocketBeginServerHandshake(void* hwebsocket, void* pszsubprotocolselected, void* pszextensionselected, uint32_t ulextensionselectedcount, void* prequestheaders, uint32_t ulrequestheadercount, void* presponseheaders, void* pulresponseheadercount);
void windowssysWindowsWin32NetworkingWebsocketWebSocketCompleteAction(void* hwebsocket, void* pvactioncontext, uint32_t ulbytestransferred);
int32_t windowssysWindowsWin32NetworkingWebsocketWebSocketCreateClientHandle(void* pproperties, uint32_t ulpropertycount, void* phwebsocket);
int32_t windowssysWindowsWin32NetworkingWebsocketWebSocketCreateServerHandle(void* pproperties, uint32_t ulpropertycount, void* phwebsocket);
void windowssysWindowsWin32NetworkingWebsocketWebSocketDeleteHandle(void* hwebsocket);
int32_t windowssysWindowsWin32NetworkingWebsocketWebSocketEndClientHandshake(void* hwebsocket, void* presponseheaders, uint32_t ulreponseheadercount, void* pulselectedextensions, void* pulselectedextensioncount, void* pulselectedsubprotocol);
int32_t windowssysWindowsWin32NetworkingWebsocketWebSocketEndServerHandshake(void* hwebsocket);
int32_t windowssysWindowsWin32NetworkingWebsocketWebSocketGetAction(void* hwebsocket, int32_t eactionqueue, void* pdatabuffers, void* puldatabuffercount, void* paction, void* pbuffertype, void* pvapplicationcontext, void* pvactioncontext);
int32_t windowssysWindowsWin32NetworkingWebsocketWebSocketGetGlobalProperty(int32_t etype, void* pvvalue, void* ulsize);
int32_t windowssysWindowsWin32NetworkingWebsocketWebSocketReceive(void* hwebsocket, void* pbuffer, void* pvcontext);
int32_t windowssysWindowsWin32NetworkingWebsocketWebSocketSend(void* hwebsocket, int32_t buffertype, void* pbuffer, void* context);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_NETWORKING_WEBSOCKET_WINDOWS_WIN32_NETWORKING_WEBSOCKET_WRAPPER_H */
