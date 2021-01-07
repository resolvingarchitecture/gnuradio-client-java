# GNU Radio - Full Radio Spectrum

## Abstract
Internet access is completely controlled by telecommunication backbone providers, largely cellular organizations like Verizon and AT&T in the
US and other large telecommunications organizations and/or governments globally in their respective jurisdictions. When
governments and/or corporations decide an individual needs to be blocked, it's relatively easy to prevent a person access
unless they go to public access points or use a friend or family's access. If that person is considered a felon by government,
aiding that person could result in becoming a felon themselves. Losing access to the internet today can be debilitating
as so much of our lives is dependent upon using it. And thus self-censorship ensues. How can we communicate over long
distances or even just down the block electronically ensuring censorship resistance when we have been cut off from
the internet? Create our own radio network!

Creating our own network is likely to require trade-offs. In more developed areas of the world, we are used to high-bandwidth
low-latency communications due to the massive investment in the global fiber-optic backbone by governments and primary
carriers. Developing our own networks outside of this, while greatly enhancing privacy and availability to blocked users,
will highly likely result in the need to use low-bandwidth higher-latency networking technologies as the investment is
not there. This is similar to the issue with Bitcoin vs Fiat. We are used to instant transactions using fiat while Bitcoin
normally takes 10-30 minutes and can take upwards of days when the network is under great strain.

This GNU Radio service continues communications when the internet is blocked
or just no longer available. Asynchronous messaging (like email) will be the first applications of this new network then
moving into messaging, content publishing, and then voice and video streaming once more of these decentralized
technologies have matured.

## Introduction
The GNU radio component uses the full radio electromagnetic spectrum to aid in censorship resistant communications.
It was conceived due to the realization that cellular radios as well as WiFi are easy to jam and thus the need
for a more flexible range of radio options is necessary.
It requires GNU Radio to be installed locally and is in the very early stages of development.

## Requirements

* Ability to use the full radio electromagnetic spectrum, from 3Hz to 3THz.
* Support sending/receiving messages globally with no infrastructure.

## SDRs
At this time, the [RTL-SDR](https://www.rtl-sdr.com/) dongle is being used to get initial software working and
it's expected to move towards using [HackRF](https://greatscottgadgets.com/hackrf/one/)
as the main production SDR. Additional SDRs are under review.

### RTL-SDR
https://www.rtl-sdr.com/

### HackRF
https://greatscottgadgets.com/hackrf/one/

### Ettus
70 MHz - 6 GHz: http://www.ettus.com/product-categories/usrp-bus-series/

### Fairwaves
https://fairwaves.co/products/equipment/

### Nuand
70 MHz (47 MHz TX) - 6 GHz: https://www.nuand.com/bladerf-2-0-micro/

### Satellites
* Blockstream (Bitcoin) - https://store.blockstream.com/product/blockstream-satellite-pro-kit/

## Installation
1. Install GNU Radio: https://wiki.gnuradio.org/index.php/InstallingGR

## Roadmap


