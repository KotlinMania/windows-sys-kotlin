#ifndef WINDOWSSYS_WINDOWS_WIN32_DEVICES_DISPLAY_WINDOWS_WIN32_DEVICES_DISPLAY_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_DEVICES_DISPLAY_WINDOWS_WIN32_DEVICES_DISPLAY_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void* windowssysWindowsWin32DevicesDisplayBrushobjHGetColorTransform(void* pbo);
void* windowssysWindowsWin32DevicesDisplayBrushobjPvAllocRbrush(void* pbo, uint32_t cj);
void* windowssysWindowsWin32DevicesDisplayBrushobjPvGetRbrush(void* pbo);
uint32_t windowssysWindowsWin32DevicesDisplayBrushobjUlGetBrushColor(void* pbo);
int32_t windowssysWindowsWin32DevicesDisplayClipobjBEnum(void* pco, uint32_t cj, void* pul);
uint32_t windowssysWindowsWin32DevicesDisplayClipobjCEnumStart(void* pco, int32_t ball, uint32_t itype, uint32_t idirection, uint32_t climit);
void* windowssysWindowsWin32DevicesDisplayClipobjPpoGetPath(void* pco);
int32_t windowssysWindowsWin32DevicesDisplayCapabilitiesRequestAndCapabilitiesReply(void* hmonitor, void* pszasciicapabilitiesstring, uint32_t dwcapabilitiesstringlengthincharacters);
int32_t windowssysWindowsWin32DevicesDisplayDegaussMonitor(void* hmonitor);
int32_t windowssysWindowsWin32DevicesDisplayDestroyPhysicalMonitor(void* hmonitor);
int32_t windowssysWindowsWin32DevicesDisplayDestroyPhysicalMonitors(uint32_t dwphysicalmonitorarraysize, void* pphysicalmonitorarray);
int32_t windowssysWindowsWin32DevicesDisplayDisplayConfigGetDeviceInfo(void* requestpacket);
int32_t windowssysWindowsWin32DevicesDisplayDisplayConfigSetDeviceInfo(void* setpacket);
void windowssysWindowsWin32DevicesDisplayEngAcquireSemaphore(void* hsem);
int32_t windowssysWindowsWin32DevicesDisplayEngAlphaBlend(void* psodest, void* psosrc, void* pco, void* pxlo, void* prcldest, void* prclsrc, void* pblendobj);
int32_t windowssysWindowsWin32DevicesDisplayEngAssociateSurface(void* hsurf, void* hdev, uint32_t flhooks);
int32_t windowssysWindowsWin32DevicesDisplayEngBitBlt(void* psotrg, void* psosrc, void* psomask, void* pco, void* pxlo, void* prcltrg, void* pptlsrc, void* pptlmask, void* pbo, void* pptlbrush, uint32_t rop4);
int32_t windowssysWindowsWin32DevicesDisplayEngCheckAbort(void* pso);
void* windowssysWindowsWin32DevicesDisplayEngComputeGlyphSet(int32_t ncodepage, int32_t nfirstchar, int32_t cchars);
int32_t windowssysWindowsWin32DevicesDisplayEngCopyBits(void* psodest, void* psosrc, void* pco, void* pxlo, void* prcldest, void* pptlsrc);
void* windowssysWindowsWin32DevicesDisplayEngCreateClip(void);
void* windowssysWindowsWin32DevicesDisplayEngCreatePalette(uint32_t imode, uint32_t ccolors, void* pulcolors, uint32_t flred, uint32_t flgreen, uint32_t flblue);
void* windowssysWindowsWin32DevicesDisplayEngCreateSemaphore(void);
void windowssysWindowsWin32DevicesDisplayEngDeleteClip(void* pco);
int32_t windowssysWindowsWin32DevicesDisplayEngDeletePalette(void* hpal);
void windowssysWindowsWin32DevicesDisplayEngDeletePath(void* ppo);
void windowssysWindowsWin32DevicesDisplayEngDeleteSemaphore(void* hsem);
int32_t windowssysWindowsWin32DevicesDisplayEngDeleteSurface(void* hsurf);
int32_t windowssysWindowsWin32DevicesDisplayEngEraseSurface(void* pso, void* prcl, uint32_t icolor);
int32_t windowssysWindowsWin32DevicesDisplayEngFillPath(void* pso, void* ppo, void* pco, void* pbo, void* pptlbrushorg, uint32_t mix, uint32_t floptions);
void* windowssysWindowsWin32DevicesDisplayEngFindResource(void* h, int32_t iname, int32_t itype, void* pulsize);
void windowssysWindowsWin32DevicesDisplayEngFreeModule(void* h);
void windowssysWindowsWin32DevicesDisplayEngGetCurrentCodePage(void* oemcodepage, void* ansicodepage);
void* windowssysWindowsWin32DevicesDisplayEngGetDriverName(void* hdev);
void* windowssysWindowsWin32DevicesDisplayEngGetPrinterDataFileName(void* hdev);
int32_t windowssysWindowsWin32DevicesDisplayEngGradientFill(void* psodest, void* pco, void* pxlo, void* pvertex, uint32_t nvertex, void* pmesh, uint32_t nmesh, void* prclextents, void* pptlditherorg, uint32_t ulmode);
int32_t windowssysWindowsWin32DevicesDisplayEngLineTo(void* pso, void* pco, void* pbo, int32_t x1, int32_t y1, int32_t x2, int32_t y2, void* prclbounds, uint32_t mix);
void* windowssysWindowsWin32DevicesDisplayEngLoadModule(void* pwsz);
void* windowssysWindowsWin32DevicesDisplayEngLockSurface(void* hsurf);
int32_t windowssysWindowsWin32DevicesDisplayEngMarkBandingSurface(void* hsurf);
void windowssysWindowsWin32DevicesDisplayEngMultiByteToUnicodeN(void* unicodestring, uint32_t maxbytesinunicodestring, void* bytesinunicodestring, void* multibytestring, uint32_t bytesinmultibytestring);
int32_t windowssysWindowsWin32DevicesDisplayEngMultiByteToWideChar(uint32_t codepage, void* widecharstring, int32_t bytesinwidecharstring, void* multibytestring, int32_t bytesinmultibytestring);
int32_t windowssysWindowsWin32DevicesDisplayEngPaint(void* pso, void* pco, void* pbo, void* pptlbrushorg, uint32_t mix);
int32_t windowssysWindowsWin32DevicesDisplayEngPlgBlt(void* psotrg, void* psosrc, void* psomsk, void* pco, void* pxlo, void* pca, void* pptlbrushorg, void* pptfx, void* prcl, void* pptl, uint32_t imode);
int32_t windowssysWindowsWin32DevicesDisplayEngQueryEMFInfo(void* hdev, void* pemfinfo);
void windowssysWindowsWin32DevicesDisplayEngQueryLocalTime(void* param0);
void windowssysWindowsWin32DevicesDisplayEngReleaseSemaphore(void* hsem);
int32_t windowssysWindowsWin32DevicesDisplayEngStretchBlt(void* psodest, void* psosrc, void* psomask, void* pco, void* pxlo, void* pca, void* pptlhtorg, void* prcldest, void* prclsrc, void* pptlmask, uint32_t imode);
int32_t windowssysWindowsWin32DevicesDisplayEngStretchBltROP(void* psodest, void* psosrc, void* psomask, void* pco, void* pxlo, void* pca, void* pptlhtorg, void* prcldest, void* prclsrc, void* pptlmask, uint32_t imode, void* pbo, uint32_t rop4);
int32_t windowssysWindowsWin32DevicesDisplayEngStrokeAndFillPath(void* pso, void* ppo, void* pco, void* pxo, void* pbostroke, void* plineattrs, void* pbofill, void* pptlbrushorg, uint32_t mixfill, uint32_t floptions);
int32_t windowssysWindowsWin32DevicesDisplayEngStrokePath(void* pso, void* ppo, void* pco, void* pxo, void* pbo, void* pptlbrushorg, void* plineattrs, uint32_t mix);
int32_t windowssysWindowsWin32DevicesDisplayEngTextOut(void* pso, void* pstro, void* pfo, void* pco, void* prclextra, void* prclopaque, void* pbofore, void* pboopaque, void* pptlorg, uint32_t mix);
int32_t windowssysWindowsWin32DevicesDisplayEngTransparentBlt(void* psodst, void* psosrc, void* pco, void* pxlo, void* prcldst, void* prclsrc, uint32_t transcolor, uint32_t bcalledfrombitblt);
void windowssysWindowsWin32DevicesDisplayEngUnicodeToMultiByteN(void* multibytestring, uint32_t maxbytesinmultibytestring, void* bytesinmultibytestring, void* unicodestring, uint32_t bytesinunicodestring);
void windowssysWindowsWin32DevicesDisplayEngUnlockSurface(void* pso);
int32_t windowssysWindowsWin32DevicesDisplayEngWideCharToMultiByte(uint32_t codepage, void* widecharstring, int32_t bytesinwidecharstring, void* multibytestring, int32_t bytesinmultibytestring);
uint32_t windowssysWindowsWin32DevicesDisplayFontobjCGetAllGlyphHandles(void* pfo, void* phg);
uint32_t windowssysWindowsWin32DevicesDisplayFontobjCGetGlyphs(void* pfo, uint32_t imode, uint32_t cglyph, void* phg, void* ppvglyph);
void* windowssysWindowsWin32DevicesDisplayFontobjPQueryGlyphAttrs(void* pfo, uint32_t imode);
void* windowssysWindowsWin32DevicesDisplayFontobjPfdg(void* pfo);
void* windowssysWindowsWin32DevicesDisplayFontobjPifi(void* pfo);
void* windowssysWindowsWin32DevicesDisplayFontobjPvTrueTypeFontFile(void* pfo, void* pcjfile);
void* windowssysWindowsWin32DevicesDisplayFontobjPxoGetXform(void* pfo);
void windowssysWindowsWin32DevicesDisplayFontobjVGetInfo(void* pfo, uint32_t cjsize, void* pfi);
int32_t windowssysWindowsWin32DevicesDisplayGetAutoRotationState(void* pstate);
int32_t windowssysWindowsWin32DevicesDisplayGetCapabilitiesStringLength(void* hmonitor, void* pdwcapabilitiesstringlengthincharacters);
int32_t windowssysWindowsWin32DevicesDisplayGetDisplayAutoRotationPreferences(void* porientation);
uint32_t windowssysWindowsWin32DevicesDisplayGetDisplayConfigBufferSizes(uint32_t flags, void* numpatharrayelements, void* nummodeinfoarrayelements);
int32_t windowssysWindowsWin32DevicesDisplayGetMonitorBrightness(void* hmonitor, void* pdwminimumbrightness, void* pdwcurrentbrightness, void* pdwmaximumbrightness);
int32_t windowssysWindowsWin32DevicesDisplayGetMonitorCapabilities(void* hmonitor, void* pdwmonitorcapabilities, void* pdwsupportedcolortemperatures);
int32_t windowssysWindowsWin32DevicesDisplayGetMonitorColorTemperature(void* hmonitor, void* pctcurrentcolortemperature);
int32_t windowssysWindowsWin32DevicesDisplayGetMonitorContrast(void* hmonitor, void* pdwminimumcontrast, void* pdwcurrentcontrast, void* pdwmaximumcontrast);
int32_t windowssysWindowsWin32DevicesDisplayGetMonitorDisplayAreaPosition(void* hmonitor, int32_t ptpositiontype, void* pdwminimumposition, void* pdwcurrentposition, void* pdwmaximumposition);
int32_t windowssysWindowsWin32DevicesDisplayGetMonitorDisplayAreaSize(void* hmonitor, int32_t stsizetype, void* pdwminimumwidthorheight, void* pdwcurrentwidthorheight, void* pdwmaximumwidthorheight);
int32_t windowssysWindowsWin32DevicesDisplayGetMonitorRedGreenOrBlueDrive(void* hmonitor, int32_t dtdrivetype, void* pdwminimumdrive, void* pdwcurrentdrive, void* pdwmaximumdrive);
int32_t windowssysWindowsWin32DevicesDisplayGetMonitorRedGreenOrBlueGain(void* hmonitor, int32_t gtgaintype, void* pdwminimumgain, void* pdwcurrentgain, void* pdwmaximumgain);
int32_t windowssysWindowsWin32DevicesDisplayGetMonitorTechnologyType(void* hmonitor, void* pdtydisplaytechnologytype);
int32_t windowssysWindowsWin32DevicesDisplayGetNumberOfPhysicalMonitorsFromHMONITOR(void* hmonitor, void* pdwnumberofphysicalmonitors);
int32_t windowssysWindowsWin32DevicesDisplayGetPhysicalMonitorsFromHMONITOR(void* hmonitor, uint32_t dwphysicalmonitorarraysize, void* pphysicalmonitorarray);
int32_t windowssysWindowsWin32DevicesDisplayGetTimingReport(void* hmonitor, void* pmtrmonitortimingreport);
int32_t windowssysWindowsWin32DevicesDisplayGetVCPFeatureAndVCPFeatureReply(void* hmonitor, uint8_t bvcpcode, void* pvct, void* pdwcurrentvalue, void* pdwmaximumvalue);
int32_t windowssysWindowsWin32DevicesDisplayHtGet8BppformatPalette(void* ppaletteentry, uint16_t redgamma, uint16_t greengamma, uint16_t bluegamma);
int32_t windowssysWindowsWin32DevicesDisplayHtGet8BppmaskPalette(void* ppaletteentry, int32_t use8bppmaskpal, uint8_t cmymask, uint16_t redgamma, uint16_t greengamma, uint16_t bluegamma);
int32_t windowssysWindowsWin32DevicesDisplayPathobjBEnum(void* ppo, void* ppd);
int32_t windowssysWindowsWin32DevicesDisplayPathobjBEnumClipLines(void* ppo, uint32_t cb, void* pcl);
void windowssysWindowsWin32DevicesDisplayPathobjVEnumStart(void* ppo);
void windowssysWindowsWin32DevicesDisplayPathobjVEnumStartClipLines(void* ppo, void* pco, void* pso, void* pla);
void windowssysWindowsWin32DevicesDisplayPathobjVGetBounds(void* ppo, void* prectfx);
uint32_t windowssysWindowsWin32DevicesDisplayQueryDisplayConfig(uint32_t flags, void* numpatharrayelements, void* patharray, void* nummodeinfoarrayelements, void* modeinfoarray, void* currenttopologyid);
int32_t windowssysWindowsWin32DevicesDisplayRestoreMonitorFactoryColorDefaults(void* hmonitor);
int32_t windowssysWindowsWin32DevicesDisplayRestoreMonitorFactoryDefaults(void* hmonitor);
int32_t windowssysWindowsWin32DevicesDisplayStrobjBEnum(void* pstro, void* pc, void* ppgpos);
int32_t windowssysWindowsWin32DevicesDisplayStrobjBEnumPositionsOnly(void* pstro, void* pc, void* ppgpos);
int32_t windowssysWindowsWin32DevicesDisplayStrobjBGetAdvanceWidths(void* pso, uint32_t ifirst, uint32_t c, void* pptqd);
uint32_t windowssysWindowsWin32DevicesDisplayStrobjDwGetCodePage(void* pstro);
void windowssysWindowsWin32DevicesDisplayStrobjVEnumStart(void* pstro);
int32_t windowssysWindowsWin32DevicesDisplaySaveCurrentMonitorSettings(void* hmonitor);
int32_t windowssysWindowsWin32DevicesDisplaySaveCurrentSettings(void* hmonitor);
int32_t windowssysWindowsWin32DevicesDisplaySetDisplayAutoRotationPreferences(int32_t orientation);
int32_t windowssysWindowsWin32DevicesDisplaySetDisplayConfig(uint32_t numpatharrayelements, void* patharray, uint32_t nummodeinfoarrayelements, void* modeinfoarray, uint32_t flags);
int32_t windowssysWindowsWin32DevicesDisplaySetMonitorBrightness(void* hmonitor, uint32_t dwnewbrightness);
int32_t windowssysWindowsWin32DevicesDisplaySetMonitorColorTemperature(void* hmonitor, int32_t ctcurrentcolortemperature);
int32_t windowssysWindowsWin32DevicesDisplaySetMonitorContrast(void* hmonitor, uint32_t dwnewcontrast);
int32_t windowssysWindowsWin32DevicesDisplaySetMonitorDisplayAreaPosition(void* hmonitor, int32_t ptpositiontype, uint32_t dwnewposition);
int32_t windowssysWindowsWin32DevicesDisplaySetMonitorDisplayAreaSize(void* hmonitor, int32_t stsizetype, uint32_t dwnewdisplayareawidthorheight);
int32_t windowssysWindowsWin32DevicesDisplaySetMonitorRedGreenOrBlueDrive(void* hmonitor, int32_t dtdrivetype, uint32_t dwnewdrive);
int32_t windowssysWindowsWin32DevicesDisplaySetMonitorRedGreenOrBlueGain(void* hmonitor, int32_t gtgaintype, uint32_t dwnewgain);
int32_t windowssysWindowsWin32DevicesDisplaySetVCPFeature(void* hmonitor, uint8_t bvcpcode, uint32_t dwnewvalue);
int32_t windowssysWindowsWin32DevicesDisplayXformobjBApplyXform(void* pxo, uint32_t imode, uint32_t cpoints, void* pvin, void* pvout);
uint32_t windowssysWindowsWin32DevicesDisplayXformobjIGetXform(void* pxo, void* pxform);
uint32_t windowssysWindowsWin32DevicesDisplayXlateobjCGetPalette(void* pxlo, uint32_t ipal, uint32_t cpal, void* ppal);
void* windowssysWindowsWin32DevicesDisplayXlateobjHGetColorTransform(void* pxlo);
uint32_t windowssysWindowsWin32DevicesDisplayXlateobjIXlate(void* pxlo, uint32_t icolor);
void* windowssysWindowsWin32DevicesDisplayXlateobjPiVector(void* pxlo);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_DEVICES_DISPLAY_WINDOWS_WIN32_DEVICES_DISPLAY_WRAPPER_H */
