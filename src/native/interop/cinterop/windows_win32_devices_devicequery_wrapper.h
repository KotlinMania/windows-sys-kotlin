#ifndef WINDOWSSYS_WINDOWS_WIN32_DEVICES_DEVICEQUERY_WINDOWS_WIN32_DEVICES_DEVICEQUERY_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_DEVICES_DEVICEQUERY_WINDOWS_WIN32_DEVICES_DEVICEQUERY_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void windowssysWindowsWin32DevicesDevicequeryDevCloseObjectQuery(void* hdevquery);
int32_t windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQuery(int32_t objecttype, uint32_t queryflags, uint32_t crequestedproperties, void* prequestedproperties, uint32_t cfilterexpressioncount, void* pfilter, void* pcallback, void* pcontext, void* phdevquery);
int32_t windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQueryEx(int32_t objecttype, uint32_t queryflags, uint32_t crequestedproperties, void* prequestedproperties, uint32_t cfilterexpressioncount, void* pfilter, uint32_t cextendedparametercount, void* pextendedparameters, void* pcallback, void* pcontext, void* phdevquery);
int32_t windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQueryFromId(int32_t objecttype, void* pszobjectid, uint32_t queryflags, uint32_t crequestedproperties, void* prequestedproperties, uint32_t cfilterexpressioncount, void* pfilter, void* pcallback, void* pcontext, void* phdevquery);
int32_t windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQueryFromIdEx(int32_t objecttype, void* pszobjectid, uint32_t queryflags, uint32_t crequestedproperties, void* prequestedproperties, uint32_t cfilterexpressioncount, void* pfilter, uint32_t cextendedparametercount, void* pextendedparameters, void* pcallback, void* pcontext, void* phdevquery);
int32_t windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQueryFromIds(int32_t objecttype, void* pszzobjectids, uint32_t queryflags, uint32_t crequestedproperties, void* prequestedproperties, uint32_t cfilterexpressioncount, void* pfilter, void* pcallback, void* pcontext, void* phdevquery);
int32_t windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQueryFromIdsEx(int32_t objecttype, void* pszzobjectids, uint32_t queryflags, uint32_t crequestedproperties, void* prequestedproperties, uint32_t cfilterexpressioncount, void* pfilter, uint32_t cextendedparametercount, void* pextendedparameters, void* pcallback, void* pcontext, void* phdevquery);
void* windowssysWindowsWin32DevicesDevicequeryDevFindProperty(void* pkey, int32_t store, void* pszlocalename, uint32_t cproperties, void* pproperties);
void windowssysWindowsWin32DevicesDevicequeryDevFreeObjectProperties(uint32_t cpropertycount, void* pproperties);
void windowssysWindowsWin32DevicesDevicequeryDevFreeObjects(uint32_t cobjectcount, void* pobjects);
int32_t windowssysWindowsWin32DevicesDevicequeryDevGetObjectProperties(int32_t objecttype, void* pszobjectid, uint32_t queryflags, uint32_t crequestedproperties, void* prequestedproperties, void* pcpropertycount, void* ppproperties);
int32_t windowssysWindowsWin32DevicesDevicequeryDevGetObjectPropertiesEx(int32_t objecttype, void* pszobjectid, uint32_t queryflags, uint32_t crequestedproperties, void* prequestedproperties, uint32_t cextendedparametercount, void* pextendedparameters, void* pcpropertycount, void* ppproperties);
int32_t windowssysWindowsWin32DevicesDevicequeryDevGetObjects(int32_t objecttype, uint32_t queryflags, uint32_t crequestedproperties, void* prequestedproperties, uint32_t cfilterexpressioncount, void* pfilter, void* pcobjectcount, void* ppobjects);
int32_t windowssysWindowsWin32DevicesDevicequeryDevGetObjectsEx(int32_t objecttype, uint32_t queryflags, uint32_t crequestedproperties, void* prequestedproperties, uint32_t cfilterexpressioncount, void* pfilter, uint32_t cextendedparametercount, void* pextendedparameters, void* pcobjectcount, void* ppobjects);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_DEVICES_DEVICEQUERY_WINDOWS_WIN32_DEVICES_DEVICEQUERY_WRAPPER_H */
