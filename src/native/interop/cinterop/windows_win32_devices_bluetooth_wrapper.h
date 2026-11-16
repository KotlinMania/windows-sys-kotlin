#ifndef WINDOWSSYS_WINDOWS_WIN32_DEVICES_BLUETOOTH_WINDOWS_WIN32_DEVICES_BLUETOOTH_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_DEVICES_BLUETOOTH_WINDOWS_WIN32_DEVICES_BLUETOOTH_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

uint32_t windowssysWindowsWin32DevicesBluetoothBluetoothAuthenticateDevice(void* hwndparent, void* hradio, void* pbtbi, void* pszpasskey, uint32_t ulpasskeylength);
uint32_t windowssysWindowsWin32DevicesBluetoothBluetoothAuthenticateDeviceEx(void* hwndparentin, void* hradioin, void* pbtdiinout, void* pbtoobdata, int32_t authenticationrequirement);
uint32_t windowssysWindowsWin32DevicesBluetoothBluetoothAuthenticateMultipleDevices(void* hwndparent, void* hradio, uint32_t cdevices, void* rgbtdi);
int32_t windowssysWindowsWin32DevicesBluetoothBluetoothDisplayDeviceProperties(void* hwndparent, void* pbtdi);
int32_t windowssysWindowsWin32DevicesBluetoothBluetoothEnableDiscovery(void* hradio, int32_t fenabled);
int32_t windowssysWindowsWin32DevicesBluetoothBluetoothEnableIncomingConnections(void* hradio, int32_t fenabled);
uint32_t windowssysWindowsWin32DevicesBluetoothBluetoothEnumerateInstalledServices(void* hradio, void* pbtdi, void* pcserviceinout, void* pguidservices);
int32_t windowssysWindowsWin32DevicesBluetoothBluetoothFindDeviceClose(void* hfind);
void* windowssysWindowsWin32DevicesBluetoothBluetoothFindFirstDevice(void* pbtsp, void* pbtdi);
void* windowssysWindowsWin32DevicesBluetoothBluetoothFindFirstRadio(void* pbtfrp, void* phradio);
int32_t windowssysWindowsWin32DevicesBluetoothBluetoothFindNextDevice(void* hfind, void* pbtdi);
int32_t windowssysWindowsWin32DevicesBluetoothBluetoothFindNextRadio(void* hfind, void* phradio);
int32_t windowssysWindowsWin32DevicesBluetoothBluetoothFindRadioClose(void* hfind);
int32_t windowssysWindowsWin32DevicesBluetoothBluetoothGATTAbortReliableWrite(void* hdevice, uint64_t reliablewritecontext, uint32_t flags);
int32_t windowssysWindowsWin32DevicesBluetoothBluetoothGATTBeginReliableWrite(void* hdevice, void* reliablewritecontext, uint32_t flags);
int32_t windowssysWindowsWin32DevicesBluetoothBluetoothGATTEndReliableWrite(void* hdevice, uint64_t reliablewritecontext, uint32_t flags);
int32_t windowssysWindowsWin32DevicesBluetoothBluetoothGATTGetCharacteristicValue(void* hdevice, void* characteristic, uint32_t characteristicvaluedatasize, void* characteristicvalue, void* characteristicvaluesizerequired, uint32_t flags);
int32_t windowssysWindowsWin32DevicesBluetoothBluetoothGATTGetCharacteristics(void* hdevice, void* service, uint16_t characteristicsbuffercount, void* characteristicsbuffer, void* characteristicsbufferactual, uint32_t flags);
int32_t windowssysWindowsWin32DevicesBluetoothBluetoothGATTGetDescriptorValue(void* hdevice, void* descriptor, uint32_t descriptorvaluedatasize, void* descriptorvalue, void* descriptorvaluesizerequired, uint32_t flags);
int32_t windowssysWindowsWin32DevicesBluetoothBluetoothGATTGetDescriptors(void* hdevice, void* characteristic, uint16_t descriptorsbuffercount, void* descriptorsbuffer, void* descriptorsbufferactual, uint32_t flags);
int32_t windowssysWindowsWin32DevicesBluetoothBluetoothGATTGetIncludedServices(void* hdevice, void* parentservice, uint16_t includedservicesbuffercount, void* includedservicesbuffer, void* includedservicesbufferactual, uint32_t flags);
int32_t windowssysWindowsWin32DevicesBluetoothBluetoothGATTGetServices(void* hdevice, uint16_t servicesbuffercount, void* servicesbuffer, void* servicesbufferactual, uint32_t flags);
int32_t windowssysWindowsWin32DevicesBluetoothBluetoothGATTRegisterEvent(void* hservice, int32_t eventtype, void* eventparameterin, void* callback, void* callbackcontext, void* peventhandle, uint32_t flags);
int32_t windowssysWindowsWin32DevicesBluetoothBluetoothGATTSetCharacteristicValue(void* hdevice, void* characteristic, void* characteristicvalue, uint64_t reliablewritecontext, uint32_t flags);
int32_t windowssysWindowsWin32DevicesBluetoothBluetoothGATTSetDescriptorValue(void* hdevice, void* descriptor, void* descriptorvalue, uint32_t flags);
int32_t windowssysWindowsWin32DevicesBluetoothBluetoothGATTUnregisterEvent(int64_t eventhandle, uint32_t flags);
uint32_t windowssysWindowsWin32DevicesBluetoothBluetoothGetDeviceInfo(void* hradio, void* pbtdi);
uint32_t windowssysWindowsWin32DevicesBluetoothBluetoothGetRadioInfo(void* hradio, void* pradioinfo);
int32_t windowssysWindowsWin32DevicesBluetoothBluetoothIsConnectable(void* hradio);
int32_t windowssysWindowsWin32DevicesBluetoothBluetoothIsDiscoverable(void* hradio);
int32_t windowssysWindowsWin32DevicesBluetoothBluetoothIsVersionAvailable(uint8_t majorversion, uint8_t minorversion);
uint32_t windowssysWindowsWin32DevicesBluetoothBluetoothRegisterForAuthentication(void* pbtdi, void* phreghandle, void* pfncallback, void* pvparam);
uint32_t windowssysWindowsWin32DevicesBluetoothBluetoothRegisterForAuthenticationEx(void* pbtdiin, void* phreghandleout, void* pfncallbackin, void* pvparam);
uint32_t windowssysWindowsWin32DevicesBluetoothBluetoothRemoveDevice(void* paddress);
int32_t windowssysWindowsWin32DevicesBluetoothBluetoothSdpEnumAttributes(void* psdpstream, uint32_t cbstreamsize, void* pfncallback, void* pvparam);
uint32_t windowssysWindowsWin32DevicesBluetoothBluetoothSdpGetAttributeValue(void* precordstream, uint32_t cbrecordlength, uint16_t usattributeid, void* pattributedata);
uint32_t windowssysWindowsWin32DevicesBluetoothBluetoothSdpGetContainerElementData(void* pcontainerstream, uint32_t cbcontainerlength, void* pelement, void* pdata);
uint32_t windowssysWindowsWin32DevicesBluetoothBluetoothSdpGetElementData(void* psdpstream, uint32_t cbsdpstreamlength, void* pdata);
uint32_t windowssysWindowsWin32DevicesBluetoothBluetoothSdpGetString(void* precordstream, uint32_t cbrecordlength, void* pstringdata, uint16_t usstringoffset, void* pszstring, void* pcchstringlength);
int32_t windowssysWindowsWin32DevicesBluetoothBluetoothSelectDevices(void* pbtsdp);
int32_t windowssysWindowsWin32DevicesBluetoothBluetoothSelectDevicesFree(void* pbtsdp);
uint32_t windowssysWindowsWin32DevicesBluetoothBluetoothSendAuthenticationResponse(void* hradio, void* pbtdi, void* pszpasskey);
uint32_t windowssysWindowsWin32DevicesBluetoothBluetoothSendAuthenticationResponseEx(void* hradioin, void* pauthresponse);
uint32_t windowssysWindowsWin32DevicesBluetoothBluetoothSetLocalServiceInfo(void* hradioin, void* pclassguid, uint32_t ulinstance, void* pserviceinfoin);
uint32_t windowssysWindowsWin32DevicesBluetoothBluetoothSetServiceState(void* hradio, void* pbtdi, void* pguidservice, uint32_t dwserviceflags);
int32_t windowssysWindowsWin32DevicesBluetoothBluetoothUnregisterAuthentication(int64_t hreghandle);
uint32_t windowssysWindowsWin32DevicesBluetoothBluetoothUpdateDeviceRecord(void* pbtdi);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_DEVICES_BLUETOOTH_WINDOWS_WIN32_DEVICES_BLUETOOTH_WRAPPER_H */
