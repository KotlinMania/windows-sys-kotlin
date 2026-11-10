#ifndef WINDOWSSYS_WINDOWS_WIN32_DEVICES_DEVICEQUERY_WINDOWS_WIN32_DEVICES_DEVICEQUERY_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_DEVICES_DEVICEQUERY_WINDOWS_WIN32_DEVICES_DEVICEQUERY_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void windowssys_windows_win32_devices_devicequery_devCloseObjectQuery(void* hdevquery);
int32_t windowssys_windows_win32_devices_devicequery_devCreateObjectQuery(int32_t objecttype, uint32_t queryflags, uint32_t crequestedproperties, void* prequestedproperties, uint32_t cfilterexpressioncount, void* pfilter, void* pcallback, void* pcontext, void* phdevquery);
int32_t windowssys_windows_win32_devices_devicequery_devCreateObjectQueryEx(int32_t objecttype, uint32_t queryflags, uint32_t crequestedproperties, void* prequestedproperties, uint32_t cfilterexpressioncount, void* pfilter, uint32_t cextendedparametercount, void* pextendedparameters, void* pcallback, void* pcontext, void* phdevquery);
int32_t windowssys_windows_win32_devices_devicequery_devCreateObjectQueryFromId(int32_t objecttype, void* pszobjectid, uint32_t queryflags, uint32_t crequestedproperties, void* prequestedproperties, uint32_t cfilterexpressioncount, void* pfilter, void* pcallback, void* pcontext, void* phdevquery);
int32_t windowssys_windows_win32_devices_devicequery_devCreateObjectQueryFromIdEx(int32_t objecttype, void* pszobjectid, uint32_t queryflags, uint32_t crequestedproperties, void* prequestedproperties, uint32_t cfilterexpressioncount, void* pfilter, uint32_t cextendedparametercount, void* pextendedparameters, void* pcallback, void* pcontext, void* phdevquery);
int32_t windowssys_windows_win32_devices_devicequery_devCreateObjectQueryFromIds(int32_t objecttype, void* pszzobjectids, uint32_t queryflags, uint32_t crequestedproperties, void* prequestedproperties, uint32_t cfilterexpressioncount, void* pfilter, void* pcallback, void* pcontext, void* phdevquery);
int32_t windowssys_windows_win32_devices_devicequery_devCreateObjectQueryFromIdsEx(int32_t objecttype, void* pszzobjectids, uint32_t queryflags, uint32_t crequestedproperties, void* prequestedproperties, uint32_t cfilterexpressioncount, void* pfilter, uint32_t cextendedparametercount, void* pextendedparameters, void* pcallback, void* pcontext, void* phdevquery);
void* windowssys_windows_win32_devices_devicequery_devFindProperty(void* pkey, int32_t store, void* pszlocalename, uint32_t cproperties, void* pproperties);
void windowssys_windows_win32_devices_devicequery_devFreeObjectProperties(uint32_t cpropertycount, void* pproperties);
void windowssys_windows_win32_devices_devicequery_devFreeObjects(uint32_t cobjectcount, void* pobjects);
int32_t windowssys_windows_win32_devices_devicequery_devGetObjectProperties(int32_t objecttype, void* pszobjectid, uint32_t queryflags, uint32_t crequestedproperties, void* prequestedproperties, void* pcpropertycount, void* ppproperties);
int32_t windowssys_windows_win32_devices_devicequery_devGetObjectPropertiesEx(int32_t objecttype, void* pszobjectid, uint32_t queryflags, uint32_t crequestedproperties, void* prequestedproperties, uint32_t cextendedparametercount, void* pextendedparameters, void* pcpropertycount, void* ppproperties);
int32_t windowssys_windows_win32_devices_devicequery_devGetObjects(int32_t objecttype, uint32_t queryflags, uint32_t crequestedproperties, void* prequestedproperties, uint32_t cfilterexpressioncount, void* pfilter, void* pcobjectcount, void* ppobjects);
int32_t windowssys_windows_win32_devices_devicequery_devGetObjectsEx(int32_t objecttype, uint32_t queryflags, uint32_t crequestedproperties, void* prequestedproperties, uint32_t cfilterexpressioncount, void* pfilter, uint32_t cextendedparametercount, void* pextendedparameters, void* pcobjectcount, void* ppobjects);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_DEVICES_DEVICEQUERY_WINDOWS_WIN32_DEVICES_DEVICEQUERY_WRAPPER_H */
