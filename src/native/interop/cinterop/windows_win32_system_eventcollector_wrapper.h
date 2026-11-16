#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_EVENTCOLLECTOR_WINDOWS_WIN32_SYSTEM_EVENTCOLLECTOR_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_EVENTCOLLECTOR_WINDOWS_WIN32_SYSTEM_EVENTCOLLECTOR_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWin32SystemEventcollectorEcClose(int64_t object);
int32_t windowssysWindowsWin32SystemEventcollectorEcDeleteSubscription(void* subscriptionname, uint32_t flags);
int32_t windowssysWindowsWin32SystemEventcollectorEcEnumNextSubscription(int64_t subscriptionenum, uint32_t subscriptionnamebuffersize, void* subscriptionnamebuffer, void* subscriptionnamebufferused);
int32_t windowssysWindowsWin32SystemEventcollectorEcGetObjectArrayProperty(int64_t objectarray, int32_t propertyid, uint32_t arrayindex, uint32_t flags, uint32_t propertyvaluebuffersize, void* propertyvaluebuffer, void* propertyvaluebufferused);
int32_t windowssysWindowsWin32SystemEventcollectorEcGetObjectArraySize(int64_t objectarray, void* objectarraysize);
int32_t windowssysWindowsWin32SystemEventcollectorEcGetSubscriptionProperty(int64_t subscription, int32_t propertyid, uint32_t flags, uint32_t propertyvaluebuffersize, void* propertyvaluebuffer, void* propertyvaluebufferused);
int32_t windowssysWindowsWin32SystemEventcollectorEcGetSubscriptionRunTimeStatus(void* subscriptionname, int32_t statusinfoid, void* eventsourcename, uint32_t flags, uint32_t statusvaluebuffersize, void* statusvaluebuffer, void* statusvaluebufferused);
int32_t windowssysWindowsWin32SystemEventcollectorEcInsertObjectArrayElement(int64_t objectarray, uint32_t arrayindex);
int64_t windowssysWindowsWin32SystemEventcollectorEcOpenSubscription(void* subscriptionname, uint32_t accessmask, uint32_t flags);
int64_t windowssysWindowsWin32SystemEventcollectorEcOpenSubscriptionEnum(uint32_t flags);
int32_t windowssysWindowsWin32SystemEventcollectorEcRemoveObjectArrayElement(int64_t objectarray, uint32_t arrayindex);
int32_t windowssysWindowsWin32SystemEventcollectorEcRetrySubscription(void* subscriptionname, void* eventsourcename, uint32_t flags);
int32_t windowssysWindowsWin32SystemEventcollectorEcSaveSubscription(int64_t subscription, uint32_t flags);
int32_t windowssysWindowsWin32SystemEventcollectorEcSetObjectArrayProperty(int64_t objectarray, int32_t propertyid, uint32_t arrayindex, uint32_t flags, void* propertyvalue);
int32_t windowssysWindowsWin32SystemEventcollectorEcSetSubscriptionProperty(int64_t subscription, int32_t propertyid, uint32_t flags, void* propertyvalue);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_EVENTCOLLECTOR_WINDOWS_WIN32_SYSTEM_EVENTCOLLECTOR_WRAPPER_H */
