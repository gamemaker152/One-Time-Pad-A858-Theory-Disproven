package main;

import ian.util.ByteBuffer;

public class OneTimePad {
	public static void main(String[] args) {
		//From A858
		String pad = "bace6c7c3ea61165aabad78e58d713af 30896b7419654425e18b92099a588977 7827334a19b92d92e77ebd2810fb77a9 cf55bd535978a0b671e096587cd5d6be 666b9247fc0c8deab8921e0dd5e54739 1e8dd1d3b28be06bc0cb6821a7cdf1cd f4586d6d1ed83a5db8b3d140e5c82183 c7505dc5ba341517183d9a9a8b1a0569 daeaf0e69004187f31dcd7433704b75b 48bb0ef6dd7fd3c1eb2d942a1f96c8b2 d6b490145fe36dd8df4c51f8bff39469 e609bfd09c42e593c9df6ab34b8f6020 cbbab4df677440c62b050759e5f31741 18c3a6ec7aaeb247ad833285da547640 9a31d86e114a5fca2c2cf66b66cb4d79 8aa320560a9418e2ed9b374b11bd4db2 2e954cb1a9cef41a3164c8d6ea1c5a52 8612db301e583e9c948c5bd647812358 21ad012b61891d95b8e5b81306c1f2d8 12fe66b655ddc90d2bb174271f9ecdb1 a772857029b4b05c9e04fd7e0904ae28 ee9f5dc9cfcca60e53b7b86ca9005056 837f1351b79c65b069884878eb75e673 1f7197ec37bc4e4fce89443a90962be7 7a02774349ef453c32395e859f723aa9 cc2db50713eec5f6e5469d84ee950e76 65bba588261e19f2b777f08c3f303320 10a29f4404beb98cbf42ffdb85192d6e 8ed296e671e08bed0ddeca9288d36d19 29913a78d8476e1e9395958c278e0d59 747336efc68af055eb398c1e80a60e1e adc0b38dfa1d2b328741c1a0b7887929 cf86a40589d1b7aa20b81c39cb54fcb4 3826b952ccd4611817a7b3fbf3db4dbb dee2e611f5dfb6b70d66804a66fd85d3 f81418521cccaf6cc78935d4181d49b9 617564d731b3f4e992a3d9777e93d93f 1474f5db92730d4dda590073e03dbce9 38de300db9dc44d6d7b980840626c4a1 d11da68c63e717acf8ab1c2a99d02365 37ba76646ca2411a4f396c3c6f996450 0a5e1dc65ebaf322dcd234ed313d90cd 162c2b42c5138197f46f2a0b54781057 74175885f1bbf850b0c7e4849a42ff5c 74f457849297a0c3622b8a72d94571c4 ad409c6eeb802f6a1954d04b5a3fadd6 89578b8a78e1625e97ffd852fecc34a8 3fd4bfb184991b4ade92f5a72a103e68 0876cb781f5f31dffd29892982cc730f 28fe0467ba4d536f374f3b3586dc8664 05dcbff26df77d2124da35d3bbc493bf c08c6845782288b6b354bf05b5f10520 94778136446cb616c9f1507ac5b22762 1c511b43a34a58a048617573ddf6ae24 0f2e415312bdd797685b8e706025b955 cea9ad302b6274b64303291419c445b3 bed0e80777c1e68d400fe0129e12901c da6ca97a289dc685126ec327d8d32d27 e12f5b3e7e2e3d306a7ac2af32bc308c 2624bd10a3b49745865df3373a06c7f9 1699a28e186a96a754a03be6ced04f61 cad98b23951538efc1d0e76fd4412c61 87203527eace95fa8ff52bb0ac4af480 8ecc966c850ed1d03a25a9702fc759e5 4f6fd2e7078a277fde8a8b665e5d1e95 275593911f1f5974b4b4263a007e1641 60f2d9ea0bfedb72";
		String message = "a4d5e46df934a75e79b14160fdae6be2 ef7388f16cb9dac193c596a4580d2a00 82c39fdcac70b022de05f3a1f00607d7 22a273a5b5e0ab406a4fa8f3efd460bf 3ad0d7138f741b3c125fc07c36a8c618 e63c3d43c68b275a5b9c597e493083fa a7a5ec4084b96edda28c56a536e3e407 59d4a5696be3e2a68e8e5efa853fe733 d9e3e758005229caba0a8348b7500c8a eee9d1d9ae533c85f42d3e0a6de50782 11b99293d8e3ab23809e8bd0e835364c 0d753e31725ceb8e85ae0a6508a912fa 53200a098d7e8e26b987d2abf7612eb7 ddd596a68ed23ac0b82fe1ac632aa884 387eecac48ee7145552359c5f4a83b66 05cb750bca9f92ac894350a70d43dbe0 621bcfc90a46764f9f96e7e25663ddac f24f7dfed2675a0d065bbcaa0101b0c3 399dc3dba2a23dc26d341ea566a7c2cd 006bd76d4acd3b57d33905cca1c10c72 328a06d8e31992f2ab1609173eeaa99b bd54cb088894da94696fd365fd186ed4 bc34b71755a8403450877f3f0211ccb0 abbaad7aec7f1e5a0e5d33e49b1a25d3 b8871dbddbaedbb42856059fd6c0aa50 1d64e6c8ed1204ad102ed4bc1a993895 a8c1390d035c7fbc27071bb47d6c74c4 59fbed775a7d80ef88e3f47f76200393 5e42040f2cde6c7816b60cde1d5b6181 a3a36697448ee9dbc5ee336593a751fa efe8dc5b0f7f9227d65434030bba7860 b409dbe73af102270a7e2e95321eda58 d8f8ef40ab62af82a3a94130b66df389 2b8082450db8b24c81869b5d50d3eac3 376096736d0f35767495027c6dc57b82 30951cf0b61ef730a295962824602c90 549ca6c7af08a0355a3bcc8fc8ad066f 5822e248dfe24cccd1fa5cf77d439534 f9c18f2d1257b019af374321fe0c1e3a 3834e95ee01970665c9735fdfc7313ae c37bb85b54859eccf75159b1883638a8 d211b30e1bc54bae76df736a63041c6a ec6210f304971cd5e5018fefc8d17016 c3ac765ad475399c96989a9764b96c7e b689049f0581caf833e6e6acfbaf0251 ffd6e8fd807151c9c51d5911dd5ed073 0155f3211745a12d72d3448b591b4c9d 11140fd956652bee424d8f2d30a77b49 4e10ec2ea389b871b2bfd859c7f0ecb6 39b1b15363d2277483eb1ab8efffd184 353caee05273dac9608b4f1d15043f90 9a5243d4fe2942d709a7ea28fc47efe5 2657a92f095c77f004c17bcb0089058f 22acc0cfd71c8d1b8bb4d5dddf28ed30 027dd13970d184aca3df5b8b7f282979 56365bb55a7053a738fd076de04e7a71 f2f5d740c92f60a1ef75c6bb9d0e83a6 83d2f10fb93e74428edcc5c26c72db65 3b822c3358a2550f6705f1dde97582b8 207828d32cd4b19d826b3752e929376f 15aca0cee0ef91b710f230ba6b8ea57f d1c3015d5d8f42d0d19fa1bcef319290 14c23fdd4e8ce8034df3ad8974052d16 7c03ea6c47ead990fe4814782276e982 add9f9d81dcef64a751bf68fea04fdea ffe4c47889c4d0fcade4ef4c2170d719 5ce7e0238e0220d7";
		//Create the Bytebuffers (Custom Classes)
		ByteBuffer bMessage = new ByteBuffer();
		ByteBuffer bPad = new ByteBuffer();
		//Remove Spaces On Message
		for (int i = 0; i < message.length(); i+=1) {
			char ch = message.charAt(i);
			if (ch !=' ') {
				bMessage.append(message.charAt(i));
			}
		}
		
		//Remove Spaces On Pad
		for (int i = 0; i < pad.length(); i+=1) {
			char ch = pad.charAt(i);
			if (ch !=' ') {
				bPad.append(pad.charAt(i));
			}
		}
		
		bMessage.hexToBytes();
		bPad.hexToBytes();
		
		//Decode the message
		ByteBuffer decoded = new ByteBuffer();
		for (int i = 0; i < bMessage.length(); i+=1) {
			int number = (bMessage.getByte(i) - bPad.getByte(i));
			//int number = (bMessage.getByte(i) ^ bPad.getByte(i)); doesn't work either
			decoded.append((byte) number);
		}
		System.out.println(decoded);
	}
}
